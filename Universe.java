public class Universe{
    Spiderman spiderman;
    String uniName = "Cosmos";
    double uniAge = 0;

    public Universe() {}

    public Universe(Spiderman spiderman, String uniName, double uniAge) {
        this.spiderman = spiderman;
        this.uniName = uniName;
        this.uniAge = uniAge;
    }


    public void uniIntro() {
        System.out.println("My name is " + uniName);
    }

    public void uniAgeIntro() {
        System.out.println("My age is " + uniAge + " billion years");
    }

    public void spiderIntro() {
        System.out.println("My spider man is " + spiderman);
    }

    //setters

    public void setSpiderman(Spiderman spiderman) {
        this.spiderman = spiderman;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public void setUniAge(double uniAge) {
        this.uniAge = uniAge;
    }

    //getters

    public Spiderman getSpiderman() {
        return (spiderman);
    }  
    

    public String getUniName() {
        return(uniName);
    }

    public double getUniAge() {
        return(uniAge);
    }
}