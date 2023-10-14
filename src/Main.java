public class Main {
    public static void main(String[] args) {
        System.out.println(
                new Acquario(
                        new Pesce[]{
                                new Pesce("Prova"),
                                new Pesce("Prova2")
                        }
                        ).toString()
        );
    }
}
