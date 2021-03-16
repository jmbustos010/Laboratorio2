package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;

public class Historial implements IHistorial {
    private Alumno Alumno;
    private Campus Campus;
    private Carrera Carrera;
    private ArrayList<Clase> Clases;
    private Periodo Periodo;

    public Historial(){

    }

    public Historial(Alumno alumno, Campus campus, Carrera carrera, ArrayList<Clase> clases, Periodo periodo){
        this.Alumno  = alumno;
        this.Campus  = campus;
        this.Carrera = carrera;
        this.Clases  = clases;
        this.Periodo = periodo;
    }


    public Alumno getAlumno(){
        return Alumno;
    }
    public void setAlumno(Alumno alumno){
        this.Alumno = alumno;
    }


    public Campus getCampus(){
        return Campus;
    }
    public void setCampus(Campus campus){
        this.Campus = campus;
    }


    public Carrera getCarrera(){
        return Carrera;
    }
    public void setCarrera(Carrera carrera){
        this.Carrera = carrera;
    }


    public ArrayList<Clase> getClases(){
        return Clases;
    }
    public void setClases(ArrayList<Clase> clases){
        this.Clases = clases;
    }


    public Periodo getPeriodo(){
        return Periodo;
    }
    public void setPeriodo(Periodo periodo){
        this.Periodo = periodo;
    }


    @Override
    public String toString(){
        return " Los historiales son los siguientes";
    }

    @Override
    public double CalcularPromedio(){
        double promedio = 0;
        int contador = 0;
//        for (Clase clase: Clases)
        for (Clase clase: Clases) {
            contador++;
            promedio = promedio + clase.CalcularNotaFinal();
        }

        return promedio/contador;
    }
//----------------------------------------------------------------------------------------------------------------------
}
