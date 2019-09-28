public class Country {
    private String name;
    private String location;
    private int safetyIndex;
    private int pollutionIndex;

    public Country(String name, String location, int safetyIndex, int pollutionIndex) {
        this.name = name;
        this.location = location;
        this.safetyIndex = safetyIndex;
        this.pollutionIndex = pollutionIndex;
    }
}
