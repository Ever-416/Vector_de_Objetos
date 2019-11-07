
package lista_de_personas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Persona {
  
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    private String identificacion;
    private String genero;
    private String direccion;
    private String email;
    private String telefono;
    private String celular;

    public Persona() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.identificacion = identificacion;
        this.genero = genero;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
    }

    public Persona(String nombre, String apellido, String fecha_nacimiento, String identificacion, String genero, String direccion, String email, String telefono, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.identificacion = identificacion;
        this.genero = genero;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre.toUpperCase();
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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
    
    public int getedad() {
     LocalDate hoy = LocalDate.now();
     DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     LocalDate fn = LocalDate.parse(this.fecha_nacimiento, fmt);
     Period periodo = Period.between(fn, hoy);
        return periodo.getYears();
    }
    
    public String getFullnombre() {      
      
        return this.nombre+" "+this.apellido;
    }
  /*  ArrayList<Masa_Corporal>historial=new ArrayList();
    ArrayList<String>mes=new ArrayList();
    
    public void addHisIMC(String Mes, double altura, double peso){
    historial.add(new Masa_Corporal(altura, peso, getedad()));
    mes.add(Mes);
    }*/
    
}
