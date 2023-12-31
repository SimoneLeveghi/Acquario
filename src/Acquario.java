import java.util.Arrays;

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

    public Acquario(Acquario acquario) {
        this(acquario.pesci);
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

    public Pesce removePesce(int index) {
        Pesce p = this.pesci[index];
        this.pesci[index] = null;
        return p;
    }

    public Pesce removePesceById(int id) {
        for(int i = 0; i < this.pesci.length; ++i) {
            if(this.pesci[i] != null && this.pesci[i].getId() == id) {
                return removePesce(i);
            }
        }

        return null;
    }

    public Acquario clone() {
        return new Acquario(this.pesci);
    }

    public String toString() {
        String ret = "{" +
                "\"pesci\"=" +
                "[";
        for(Pesce p : this.pesci) {
            ret += (p != null? p.toString() : "null") + ",";
        }

        ret += "\b]," +
                "\"id\"=" + this.id +
                "}";

        return ret;
    }
}
