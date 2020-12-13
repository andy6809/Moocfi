
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        ArrayList<Game> games = readFromFile(fileName);
        System.out.println("Team:");
        String team = scan.nextLine();

        // Count only the matches of the specified team.
        ArrayList<Game> gamesOfATeam = new ArrayList<>();
        for (Game game : games) {
            if (team.equals(game.getHomeTeam()) || team.equals(game.getAwayTeam())) {
                gamesOfATeam.add(game);
            }
        }

        //print the number of games
        System.out.println("Games: " + gamesOfATeam.size());

        //count the number of wins
        int wins = 0;
        for (Game game : gamesOfATeam) {
            if (game.winnerIs(team)) {
                wins++;
            }
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (gamesOfATeam.size() - wins));
    }

    public static ArrayList<Game> readFromFile(String fileName) {
        ArrayList<Game> games = new ArrayList();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                games.add(new Game(homeTeam, awayTeam, homeScore, awayScore));

            }

        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");

        }
        return games;
    }

}
