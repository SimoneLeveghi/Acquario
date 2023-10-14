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

    public int getId()
    {
        return this.id;
    }

    public void setPesce(int index, Pesce pesce) {
        this.pesci[index] = pesce != null? pesce.clone() : null;
    }

    public int addPesce(Pesce pesce) {
        for(int i = 0; i < this.pesci.length; ++i) {
            if(this.pesci[i] == null) {
                setPesce(i, pesce);
                return i;
            }
        }

        return -1;
    }
}
