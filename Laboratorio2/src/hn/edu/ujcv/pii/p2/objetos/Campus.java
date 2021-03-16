package hn.edu.ujcv.pii.p2.objetos;

import java.util.Date;

public class Campus {
    private String Direccion;
    private Date FechaInicio;
    private int Id;
    private String Nombre;

    public Campus(){
    }
    public Campus(String Direccion, Date FechaIncio, int Id, String Nombre ){
        this.Direccion   = Direccion;
        this.FechaInicio = FechaIncio;
        this.Id          = Id;
        this.Nombre      = Nombre;
    }


    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }


    public Date getFechaInicio() {
        return FechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.FechaInicio = fechaInicio;
    }


    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }


    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
}

