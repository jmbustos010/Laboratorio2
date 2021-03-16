package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;

public class ListaAlumnos {
    private ArrayList<Alumno> ListaAlumnos;

    public ListaAlumnos(){
        ListaAlumnos = new ArrayList<>();
    }

    public void AddAlumno(Alumno alumno){
        ListaAlumnos.add(alumno);
    }

    public void ImprimirListaAlumnos(){
        System.out.println("Esta es la lista de lo alumnos registrados");
        for (Alumno alumno: ListaAlumnos) {
            System.out.println("Nombre: "+alumno.getNombre()+"\n ID:"+alumno.getId()+"\n Numero de cuenta: "+alumno.getCuenta());
        }
    }

    public Alumno BuscarAlumno(int id){
        for (Alumno alumno: ListaAlumnos) {
            if (alumno.getId() == id){
                return alumno;
            }
        }
        return null;
    }


    public int ValidarId(long id){
        int mismoId = 0;
        for (Alumno alumno: ListaAlumnos) {
            if (alumno.getId() == id){
                System.out.println("Ya hay un Alumno con este ID");
                mismoId++;
                break;
            }
        }
        return mismoId;
    }


    public int ValidarCueta(long cuenta){
        int mismoCuenta = 0;
        for (Alumno alumno: ListaAlumnos) {
            if (alumno.getCuenta() == cuenta){
                System.out.println("Ya hay un Alumno con esta cuenta");
                mismoCuenta++;
                break;
            }
        }
        return mismoCuenta;
    }
    //------------------------------------------------------------------------------------------------------------------
}
