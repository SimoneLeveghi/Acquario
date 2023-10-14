public class Pesce {
    private String specie;
    private int id;
    private static int maxId;

    public Pesce(String specie) {
        this.specie = specie;
        this.id = maxId++;
    }

    public String getSpecie() {
        return specie;
    }

    public int getId() {
        return this.id;
    }

    public Pesce clone() {
        return new Pesce(this.specie);
    }

    public String toString() {
        return "{" +
                "\"specie\":\"" + this.specie + "," +
                "\"id\":" + this.id + "," +
                "\"maxId\":" + Pesce.maxId +
                "}";
    }
}
