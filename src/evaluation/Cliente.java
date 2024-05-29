package evaluation;

public class Cliente {
    private int id;
    private String codigo;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Cliente(int id, String nombre, String apellido, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        //-----------------------
        int numero1 = (int) (Math.random() * 9) + 1;
        int numero2 = (int) (Math.random() * 9) + 1;
        int numero3 = (int) (Math.random() * 9) + 1;

        String nombreIniciales = nombre.substring(0, 2);
        String apellidoIniciales = apellido.substring(0, 2);

        this.codigo = nombreIniciales+apellidoIniciales+numero1+numero2+numero3;

    }


    @Override
    public String toString() {
        return "  "+ id + "  " + codigo + "  " + nombre + "  " +apellido+ "  "+email + "  " + telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
