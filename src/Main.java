public class Main {
    public static void main(String[] args) {
        Acquario a = new Acquario(new Pesce[]{
                new Pesce("Prova"),
                new Pesce("Prova2")
        });

        System.out.println(a.toString());

        System.out.println(a.removePesce(1).toString());
        a.addPesce(new Pesce("Prova3"));

        System.out.println(a.toString());

        Acquario a2 = new Acquario(a);
        System.out.println(a2.toString());
    }
}
