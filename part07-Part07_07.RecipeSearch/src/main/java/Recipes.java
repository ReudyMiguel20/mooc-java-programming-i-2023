
import java.util.ArrayList;

public class Recipes {
//    private ArrayList<Recipes> recipes;

    private String recipeName;
    private int cookingTime;
    private String ingredients;

    public Recipes(String recipeName, int cookingTime) {
//        this.recipes = new ArrayList<>();
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;

    }

    public Recipes(String recipeName, int cookingTime, String ingredients) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
    }

    public String getRecipeName() {
        return this.recipeName;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }
    
    public String getIngredient(){
        return this.ingredients;
    }

//    public String contains(String input){
//        if ()
//    }
    public String toString(Recipes recipes) {
        return "help " + recipes.cookingTime;
    }

//    public String listRecipe(ArrayList<String> recipes1){
////        for (Recipes recipesLine : recipes){
//////            System.out.println(recipesLine.recipeName + ", Cooking Time: " + recipesLine.cookingTime);
////              return recipesLine.recipeName + ", Cooking Time: " + recipesLine.cookingTime;
////        }
////        return "";
//         
//    }
}
