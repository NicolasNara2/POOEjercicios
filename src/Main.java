import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Usuario> usuarios = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int contador = 1;

        for (int i = 0; i < contador; i++) {
            System.out.printf("Ingrese un usuario, clave y correo, separados por una coma (,)");
            String usuario = scanner.nextLine();
            String[] usuarioPartes = usuario.split(",");
            String nombre = usuarioPartes[0];
            String clave = usuarioPartes[1];
            String correo = usuarioPartes[2];
            Usuario usuarioIngresado = new Usuario();
            usuarioIngresado.setNombre(nombre);
            usuarioIngresado.setClave(clave);
            usuarioIngresado.setCorreo(correo);
            usuarios.add(usuarioIngresado);
            contador++;
            System.out.println("¿Desea seguir ingresando datos? Ingrese Y para si y N para no.");
            String respuesta = scanner.nextLine();
            if (respuesta == "N"){
            contador = i;
            }
            else {System.out.println("Continua.");}
        }
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i));
        }
    }
}