public class Main {
    public static void main(String[] args) {
        Cocinero c1 = new Cocinero("Diego Lopez", 1);
        Cocinero c2 = new Cocinero("Juan Zembrano", 2);
        Cocinero c3 = new Cocinero("Maria Herrera", 1.30);
        Cocinero c4 = new Cocinero("Alejandro Peralta", 2);
        Cocinero c5 = new Cocinero("Gilberto Herrera", 3);
        Cocinero c6 = new Cocinero("Mario Peralta", 5);

        c1.cocinaPara400();
        c2.cocinaPara400();
        c3.cocinaPara400();
        c4.cocinaPara400();
        c5.cocinaPara400();
        c6.cocinaPara400();

        Cocinero.imprimirTiempo();
        Cocinero.imprimirEspecialidad();
    }
}