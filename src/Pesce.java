public class Pesce {
    private String specie;
    private int id;
    private static int maxId;

    public Pesce(String specie) {
        this.specie = specie;
        this.id = maxId++;
    }
}
