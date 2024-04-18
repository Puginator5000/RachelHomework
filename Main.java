public class Main {
    public static void main(String[] args) {
        Spiderman Spooderguy = new Spiderman("Mr.Vu", "HAHA", 24, -1);
        Universe milkyWay = new Universe(Spooderguy, "Milky Way", 4.3);

        Spooderguy.increaseAge(5);
        Spooderguy.friendlyNeighbor();
        Spooderguy.introduction(Spooderguy.getSuperheroName());
        Spooderguy.climb(50);
        Spooderguy.unClimb(25);
        Spooderguy.fakeToReal();
        Spooderguy.introduction(Spooderguy.getRealName());

        milkyWay.uniIntro();
        milkyWay.uniAgeIntro();
        milkyWay.spiderIntro();
    }
}
