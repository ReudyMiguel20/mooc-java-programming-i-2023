
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        //I need to put this whole program on classes. its all messy.
        Scanner scanner = new Scanner(System.in);

        //user inputs the filename to scan
        System.out.println("File to read:");
        String input = scanner.nextLine();

        //all the info that the Textfile contains is put into an ArrayList.
        ArrayList<Recipes> recipesList = readRecipesFromFile(input);
        ArrayList<Recipes> ingredientList = readIngredientsFromFile(input);

        //command list
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searched recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        //loop for user input
        while (true) {

            input = scanner.nextLine();

            if (input.equals("list")) {
                System.out.println("\nRecipes:");
                int counter = 0;

                while (counter < recipesList.size()) {

                    for (Recipes recipeObj : recipesList) {
                        System.out.println(recipeObj.getRecipeName() + ", cooking time: " + recipeObj.getCookingTime());
                        counter++;
                    }
                    System.out.println();
                }

            } else if (input.equals("stop")) {
                break;
            } else if (input.equals("find name")) {

                System.out.println("Searched word:");
                input = scanner.nextLine();

                for (int i = 0; i < recipesList.size(); i++) {
                    if (recipesList.get(i).getRecipeName().contains(input)) {
                        System.out.println(recipesList.get(i).getRecipeName() + ", cooking time: " + recipesList.get(i).getCookingTime());
                    }
                }

            } else if (input.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                input = scanner.nextLine();
                int numberInput = Integer.valueOf(input);

                System.out.println("Recipes:");
                for (int i = 0; i < recipesList.size(); i++) {

                    if (recipesList.get(i).getCookingTime() <= numberInput) {
                        System.out.println(recipesList.get(i).getRecipeName() + ", cooking time: " + recipesList.get(i).getCookingTime());
                    }

                }

            } else if (input.equals("find ingredient")) {
                System.out.println("Ingredient:");
                input = scanner.nextLine();
                
                System.out.println("Recipes:");
                
                for (int i = 0; i < ingredientList.size(); i++){
                    if (ingredientList.get(i).getIngredient().equals(input)){
                        System.out.println(ingredientList.get(i).getRecipeName() + ", cooking time: " + ingredientList.get(i).getCookingTime());
                    }
                }
            }
        }
    }

    public static ArrayList<Recipes> readRecipesFromFile(String input) {
        ArrayList<Recipes> recipes = new ArrayList<>();

        try (Scanner recipeReader = new Scanner(Paths.get(input))) {

            while (recipeReader.hasNextLine()) {
                String line = recipeReader.nextLine();
                String recipeName = line;
                line = recipeReader.nextLine();
                int cookingTime = Integer.valueOf(line);

                //I can add ingredients here too! 
                while (recipeReader.hasNextLine()) {
                    line = recipeReader.nextLine();
                    if (line.isEmpty()) {
                        break;
                    }
                }

                recipes.add(new Recipes(recipeName, cookingTime));

            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

        return recipes;
    }

    public static ArrayList<Recipes> readIngredientsFromFile(String input) {
        ArrayList<Recipes> ingredientsList = new ArrayList<>();

        try (Scanner recipeReader = new Scanner(Paths.get(input))) {

            while (recipeReader.hasNextLine()) {
                String line = recipeReader.nextLine();
                String recipeName = line;
                line = recipeReader.nextLine();
                int cookingTime = Integer.valueOf(line);

                //Implemented this that I discovered earlier so I can add the ingredients
                while (recipeReader.hasNextLine()) {
                    line = recipeReader.nextLine();
                    String ingredients = line;

                    ingredientsList.add(new Recipes(recipeName, cookingTime, ingredients));
                    if (line.isEmpty()) {
                        break;
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

        return ingredientsList;
    }

}
