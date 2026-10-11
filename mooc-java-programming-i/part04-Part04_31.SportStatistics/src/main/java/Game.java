public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;

    public Game(String homeTeam, String visitingTeam, int homePoints, int visitingPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getVisitingTeam() {
        return this.visitingTeam;
    }

    public boolean isWInner(String team) {
        if (team.equals(homeTeam) && homePoints > visitingPoints) {
            return true;
        }
        if (team.equals(visitingTeam) && visitingPoints > homePoints) {
            return true;
        }
        return false;
    }
}