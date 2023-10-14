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

    public Acquario(int nPesci) {
        this.pesci = new Pesce[nPesci];
        this.id = maxId++;
    }

    public Pesce getPesce(int index) {
        return this.pesci[index] != null? this.pesci[index].clone() : null;
    }


}
