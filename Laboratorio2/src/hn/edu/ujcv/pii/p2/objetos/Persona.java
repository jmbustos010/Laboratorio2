package hn.edu.ujcv.pii.p2.objetos;

import java.util.Date;

public abstract class Persona {
    private Date FechaDeNacimientos;
    private long Id;
    private String Nombre;

    Persona(){
    }

    Persona(long id, String nombre, Date fechaDeNacimientos){
        this.Id = id;
        this.Nombre = nombre;
        this.FechaDeNacimientos = fechaDeNacimientos;

    }


    public long getId(){
        return Id;
    }
    public void setId(long id){
        this.Id = id;
    }


    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }


    public Date getFechaDeNacimientos(){
        return FechaDeNacimientos;
    }
    public void setFechaDeNacimientos(Date fechaDeNacimientos){
        this.FechaDeNacimientos = fechaDeNacimientos;
    }

    public int CalcularFecha(int anioNacimiento){
         return 2021 - anioNacimiento;
    }
    //-------------------------------------------------------------------------------------------------------------------
}
