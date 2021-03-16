package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;

public class ListaPeriodos {
    private ArrayList<Periodo>ListaPeriodos;

    public ListaPeriodos(){
        ListaPeriodos = new ArrayList<>();
    }


    public void AddPeriodo(Periodo Periodo){
        ListaPeriodos.add(Periodo);

    }
    public void ImprimirListaPeriodo(){
        System.out.println("La lista de los periodos son los siguientes: ");
        for (Periodo Periodo: ListaPeriodos) {
            System.out.println("El periodo: "+ Periodo.getDescripcion()+"\nID:"+Periodo.getId()+"\nFecha de inicio: "
                    +Periodo.getFechaInicio()+"\nFecha final: "+Periodo.getFechaFin());
        }
    }

    public Periodo BuscarPeriodo(int id){
        for (Periodo periodo: ListaPeriodos) {
            if (periodo.getId() == id){
                return periodo;
            }
        }
        return null;
    }


    public int ValidarId(long id){
        int mismoId = 0;
        for (Periodo periodo: ListaPeriodos) {
            if (periodo.getId() == id){
                System.out.println("Ya hay un Periodo con este ID");
                mismoId++;
                break;
            }
        }
        return mismoId;
    }

}
