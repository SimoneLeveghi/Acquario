public class Acquario {
    private Pesce[] pesci;
    private int id;
    private static int maxId;


    public Acquario(Pesce[] pesci) {
        this.pesci = new Pesce[pesci.length];
        for(int i = 0; i < pesci.length; ++i) {
            this.pesci[i] = pesci[i].clone();
        }

        this.id = maxId++;
    }
}
