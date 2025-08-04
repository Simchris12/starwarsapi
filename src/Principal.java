import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Bienvenido a la aplicación de consulta de películas");
        System.out.println("Escriba el número de la película de Star Wars que desea consultar (1-6):");
        try{
            var numeroDePelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consulta.buscaPelicula(numeroDePelicula);
            System.out.println(pelicula);
        }catch (NumberFormatException e){
            System.out.println("Número inválido. Por favor, ingrese un número entre 1 y 6." + e.getMessage());
        }
        catch (RuntimeException e ){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación");
        }
    }
}
