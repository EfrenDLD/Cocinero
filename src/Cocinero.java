public class Cocinero{
    private int id;
    private String nombre;
    private double tiempoCocina;
    private static int contadorCocineros = 0;
    private static String especialidadCocina = "Comida internacional";
    private static double tiempoCocinaEquipo = 0.0;

    public Cocinero(String nombre,double tiempoCocina){
        this.id = ++contadorCocineros;
        this.nombre = nombre;
        this.tiempoCocina = tiempoCocina;
    }

    public void cocinaPara400(){
        tiempoCocinaEquipo += tiempoCocina;
    }
    public static void imprimirEspecialidad(){
        System.out.println("Especialidad de Cocina: " +especialidadCocina);
    }

    public static void imprimirTiempo(){
        System.out.println("Tiempo total de cocina por equipo: "+tiempoCocinaEquipo);
    }
}