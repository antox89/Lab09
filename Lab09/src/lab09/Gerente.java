

package lab09;

import java.util.ArrayList;


public class Gerente {
    
    private String nombre, contrasena, area;
    private int id,salario;
    private GerenteGeneral ceo;
    ArrayList<Empleado> listaEmpleados = new ArrayList();

    public Gerente() {
    }

    public Gerente(String nombre, String contrasena, int id, int salario, GerenteGeneral ceo,String area) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.id = id;
        this.salario = salario;
        this.ceo = new GerenteGeneral();
        this.area=area;
    }
    
    public void setEmpleados(Empleado empleado){
        this.listaEmpleados.add(empleado);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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

    public GerenteGeneral getCeo() {
        return ceo;
    }

    public void setCeo(GerenteGeneral ceo) {
        this.ceo = ceo;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
