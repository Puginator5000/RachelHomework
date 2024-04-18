public class Spiderman {

    public String realName = "Bob";
    public String superheroName = "Spiderman";
    public double age = 7.5;
    public double altitude = 0;

    public Spiderman() {}

    public Spiderman( String realName, String superheroName, double age, double altitude) {
        this.realName = realName;
        this.superheroName = superheroName;
        this.age = age;
        this.altitude = altitude;
    }

    public void increaseAge(double increase) {
        age = age + increase;
    }

    public void introduction(String name) {
        System.out.println("Hello, my name is " + name);
    }

    public void friendlyNeighbor() {
        System.out.println("I'm your friendly neighborhood spiderman!");
    }

    public void climb(double altitude) {
        this.altitude = this.altitude + altitude;
        System.out.println("I'M CLIMBING " + altitude +  " METERS UP, BROSKI");
    }

    public void unClimb(double altitude) {
        this.altitude = this.altitude - altitude;
        System.out.println("I'M UNCLIMBING " + altitude + " METERS BROSKI") ;
    }

    public void fakeToReal() {
        superheroName = realName;
    }

    //SETTERS

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    //GETTERS

    public String getSuperheroName() {
        return superheroName;
    }

    public String getRealName() {
        return realName;
    }

    public double getAge() {
        return age;
    }

    public double getAltitude() {
        return altitude;
    }


}