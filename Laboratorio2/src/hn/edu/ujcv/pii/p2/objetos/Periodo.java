package hn.edu.ujcv.pii.p2.objetos;

import java.util.Date;

public class Periodo {

    private String Descripcion;
    private Date FechaInicio;
    private Date FechaFin;
    private int Id;

    public Periodo(){
    }

    public Periodo(String Descripcion, Date FechaInicio, int Id){
        this.Descripcion = Descripcion;
        this.FechaInicio = FechaInicio;
        this.Id          = Id;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }


    public Date getFechaInicio() {
        return FechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        FechaInicio = fechaInicio;
    }


    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }


    public Date getFechaFin(){
        return FechaFin;
    }
    public void setFechaFin(Date fechaFin){
        this.FechaFin = fechaFin;
    }


    //------------------------------------------------------------------------------------------------------------------
}

