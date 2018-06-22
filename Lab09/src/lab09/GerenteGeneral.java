

package lab09;

import java.util.ArrayList;


public class GerenteGeneral {
    
    public String nombre, contrasena ;
    public int idEmpresa,salario;
    public ArrayList<Gerente> listaGerentes = new ArrayList();

    public GerenteGeneral() {
    }

    public GerenteGeneral(String nombre, String contrasena, int salario, int idEmpresa) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.salario = salario;
        this.idEmpresa = idEmpresa;
    }
    
    public void setManager(Gerente manager){
        this.listaGerentes.add(manager);
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public ArrayList<Gerente> getListaGerentes() {
        return listaGerentes;
    }

    public void setListaGerentes(ArrayList<Gerente> listaGerentes) {
        this.listaGerentes = listaGerentes;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    

}
