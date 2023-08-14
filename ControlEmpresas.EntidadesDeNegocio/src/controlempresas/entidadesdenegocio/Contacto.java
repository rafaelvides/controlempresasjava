package controlempresas.entidadesdenegocio;

import java.util.ArrayList;

public class Contacto {
    
    private int Id;
    private String nombre;
    private String email;
    private String telefono;
    private String celular;
    private int top_aux;
    private ArrayList<Empresa> empresa;

    public Contacto() {
    }

    public Contacto(int Id, String nombre, String email, String telefono, String celular, int top_aux, ArrayList<Empresa> empresa) {
        this.Id = Id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.top_aux = top_aux;
        this.empresa = empresa;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getTop_aux() {
        return top_aux;
    }

    public void setTop_aux(int top_aux) {
        this.top_aux = top_aux;
    }

    public ArrayList<Empresa> getEmpresa() {
        return empresa;
    }

    public void setEmpresa(ArrayList<Empresa> empresa) {
        this.empresa = empresa;
    }
    
    
    
}
