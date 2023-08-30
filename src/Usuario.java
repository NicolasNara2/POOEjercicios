public class Usuario {

    private String nombre;
    private String clave;
    private String correo;

    public Usuario(String nombre, String clave, String correo) {
        this.nombre = nombre;
        this.clave = clave;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", clave='" + clave + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}





//Crea un programa que reciba un usuario  y lo guarde en una lista de usuarios.
//Cada usuario tiene nombre, clave y dirección de correo.
//Al final debe imprimir todos los usuarios guardados.
//¿Qué es más conveniente un array o un ArrayList?
