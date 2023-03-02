
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> games = new ArrayList<>();

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int countTeam = 0;
        int wins = 0;

        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {
                String lines = scanFile.nextLine();
                String[] arraySplit = lines.split(",");

                String homeTeam = arraySplit[0];
                String visitingTeam = arraySplit[1];

                int homeTeamPoints = Integer.valueOf(arraySplit[2]);
                int visitingTeamPoints = Integer.valueOf(arraySplit[3]);
                
                if (arraySplit[0].equals(team) || arraySplit[1].equals(team)){
                    countTeam++;
                }
                
                if (arraySplit[0].equals(team) && homeTeamPoints > visitingTeamPoints){
                    wins++;
                } else if (arraySplit[1].equals(team) && visitingTeamPoints > homeTeamPoints) {
                    wins++;
                }

                for (String text : arraySplit) {
                    games.add(text);
                }
            }
        } 
        
        catch (Exception e) {
            System.out.println("File " + file + " not found.");
        }

        int losses = countTeam - wins;

        System.out.println("Games: " + countTeam);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
