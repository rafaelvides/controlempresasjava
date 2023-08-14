package controlempresas.entidadesdenegocio;

import java.time.LocalDate;
public class Usuario {
    
     private String Id;
     private String IdRol;
     private String Nombre;
     private String Apellido;
     private String login;
     private String Password;
     private byte estatus;
     private LocalDate fechaRegistro;
     private int top_aux;
     private String confirmPassword_aux;

    public Usuario() {
    }

    public Usuario(String Id, String IdRol, String Nombre, String Apellido, String login, String Password, byte estatus, LocalDate fechaRegistro, int top_aux, String confirmPassword_aux) {
        this.Id = Id;
        this.IdRol = IdRol;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.login = login;
        this.Password = Password;
        this.estatus = estatus;
        this.fechaRegistro = fechaRegistro;
        this.top_aux = top_aux;
        this.confirmPassword_aux = confirmPassword_aux;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getIdRol() {
        return IdRol;
    }

    public void setIdRol(String IdRol) {
        this.IdRol = IdRol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public byte getEstatus() {
        return estatus;
    }

    public void setEstatus(byte estatus) {
        this.estatus = estatus;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getTop_aux() {
        return top_aux;
    }

    public void setTop_aux(int top_aux) {
        this.top_aux = top_aux;
    }

    public String getConfirmPassword_aux() {
        return confirmPassword_aux;
    }

    public void setConfirmPassword_aux(String confirmPassword_aux) {
        this.confirmPassword_aux = confirmPassword_aux;
    }
              
              
    
}
