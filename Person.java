package be.intecbrussel.streams;

public class Person {

    private String voornaam;
    private String achternaam;
    private String geslacht;
    private int leeftijd;
    private float gewicht;
    private int lengte;

    public Person(String voornaam, String achternaam, String geslacht, int leeftijd, float gewicht, int lengte) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geslacht = geslacht;
        this.leeftijd = leeftijd;
        this.gewicht = gewicht;
        this.lengte = lengte;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    @Override
    public String toString() {
        return "Person{" +
                "voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", geslacht='" + geslacht + '\'' +
                ", leeftijd=" + leeftijd +
                ", gewicht=" + gewicht +
                ", lengte=" + lengte +
                '}';
    }
}
