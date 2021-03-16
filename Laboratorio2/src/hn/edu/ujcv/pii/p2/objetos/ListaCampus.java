package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;

public class ListaCampus {
   private ArrayList<Campus> ListaCampus;

   public ListaCampus(){
       ListaCampus = new ArrayList<>();
   }


    public void AddCampus(Campus campus){
        ListaCampus.add(campus);
    }

    public void ImprimirListaCampus(){
        System.out.println("Esta es la lista de los Campus registrados:");
        for (Campus campus: ListaCampus) {
            System.out.println("Nombre: "+campus.getNombre()+"\nID: "+campus.getId());
        }
    }

    public Campus BuscarCampus(int id){
        for (Campus campus: ListaCampus) {
            if (campus.getId() == id){
                return campus;
            }
        }
        return null;
    }

    public int ValidarId(int id){
        int mismoId = 0;
        for (Campus campus: ListaCampus) {
            if (campus.getId() == id){
                System.out.println("Ya hay un Campus con este ID");
                mismoId++;
                break;
            }
        }
        return mismoId;
    }
    //--------------------------------------------------------------------------------------------------------------------
}
