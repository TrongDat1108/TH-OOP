public class TestClub {
    public static void main(String[] args) {
        Club club = new Club("Icon", 4, 1, 5);

        System.out.println(club.getName());
        System.out.println(club.toString());
        System.out.println(club.numMatchesPlayed());
        System.out.println(club.isFinish());
        System.out.println(club.getPoints());
    }
}
