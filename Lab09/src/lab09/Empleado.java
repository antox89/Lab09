

package lab09;


public class Empleado{
    
    private String nombre, contrasena, puesto;
    private int id,salario;
    private String jefe;

    public Empleado() {
    }

    public Empleado(String nombre, String contrasena, String puesto, int id, int salario, String jefe) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.puesto = puesto;
        this.id = id;
        this.salario = salario;
        this.jefe = jefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return nombre;
    }
    

}
