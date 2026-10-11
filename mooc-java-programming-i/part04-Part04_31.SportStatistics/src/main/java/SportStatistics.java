
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();

        ArrayList<Game> gameList = readGameFile(file);

        System.out.println("Team: ");
        String teamName = scan.nextLine();

        ArrayList<Game> gamesPlayed = new ArrayList<>();
        for (Game game : gameList) {
            if(game.getHomeTeam().equals(teamName) || game.getVisitingTeam().equals(teamName)) {
                gamesPlayed.add(game);
            }
        }

        int wins = 0;
        for(Game game : gamesPlayed) {
            if(game.isWInner(teamName)) {
                wins++;
            }
        }

        System.out.println("Games: " + gamesPlayed.size());
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (gamesPlayed.size() - wins));
    }

    public static ArrayList<Game> readGameFile(String fileName) {
        ArrayList<Game> games = new ArrayList<>();
        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] lineArr = line.split(",");

                String homeTeam = lineArr[0];
                String visitingTeam = lineArr[1];
                int homePoints = Integer.valueOf(lineArr[2]);
                int visitingPoints = Integer.valueOf(lineArr[3]);
                
                games.add(new Game(homeTeam, visitingTeam, homePoints, visitingPoints));
            }
        } catch (Exception e) {
            System.out.println("Failed to read from file.");
        }
        return games;
    } 
}
