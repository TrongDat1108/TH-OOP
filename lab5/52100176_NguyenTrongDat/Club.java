public class Club {
    private String name;
    private int wins;
    private int draws;
    private int losses;

    public Club() {
        name = "";
        wins = 0;
        draws = 0;
        losses = 0;
    }

    public Club(String name, int wins, int draws, int losses) {
        this.name = name;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
    }

    public Club(Club club) {
        this.name = club.name;
        this.wins = club.wins;
        this.draws = club.draws;
        this.losses = club.losses;
    }

    public String getName() {
        return this.name;
    }

    public int getWins() {
        return this.wins;
    }

    public int getDraws() {
        return this.draws;
    }

    public int getLosses() {
        return this.losses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int numMatchesPlayed() {
        int numMatches = 0;
        numMatches = this.wins + this.draws + this.losses;
        return numMatches;
    }

    public boolean isFinish() {
        if (numMatchesPlayed() == 10)
            return true;
        else
            return false;
    }

    public int getPoints() {
        int points = 0;
        points = this.wins * 3 + this.draws * 3 + this.losses * 0;
        return points;
    }

    public String toString() {
        return "Club name: " + this.name + " wins/draws/losses: " + this.wins + "/" + this.draws + "/" + this.losses;
    }
}
