package controlempresas.entidadesdenegocio;

public class Empresa {
    
    private int Id;
    private int IdContacto;
    private String nombre;
    private String Rubro;
    private String categoria;
    private String Departamento;
    private String top_aux;
    private Contacto Contacto;

    public Empresa() {
    }

    public Empresa(int Id, int IdContacto, String nombre, String Rubro, String categoria, String Departamento, String top_aux, Contacto Contacto) {
        this.Id = Id;
        this.IdContacto = IdContacto;
        this.nombre = nombre;
        this.Rubro = Rubro;
        this.categoria = categoria;
        this.Departamento = Departamento;
        this.top_aux = top_aux;
        this.Contacto = Contacto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdContacto() {
        return IdContacto;
    }

    public void setIdContacto(int IdContacto) {
        this.IdContacto = IdContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRubro() {
        return Rubro;
    }

    public void setRubro(String Rubro) {
        this.Rubro = Rubro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getTop_aux() {
        return top_aux;
    }

    public void setTop_aux(String top_aux) {
        this.top_aux = top_aux;
    }

    public Contacto getContacto() {
        return Contacto;
    }

    public void setContacto(Contacto Contacto) {
        this.Contacto = Contacto;
    }
    
    
    
}
