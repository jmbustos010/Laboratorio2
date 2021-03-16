package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;

public class ListaClases {
    private ArrayList<Clase> ListaClases;


    public ListaClases(){
        ListaClases = new ArrayList<>();
    }

    public void AddClase(Clase clase){
        ListaClases.add(clase);
    }

    public void ImprimirListaClase(){
        System.out.println("Las clases registradas son las siguientes:");
        for (Clase clase: ListaClases) {
            System.out.println("Nombre de la clase: "+clase.getNombre()+" ID: "+clase.getId()+ " Cuenta con "+clase.getUnidadesValorativas()+
                    " Unidades Valorativas");
            System.out.println("--------------------------------------------------------------------------------------------");
        }

    }

    public Clase BuscarCarrera(int id){
        for (Clase clase: ListaClases) {
            if (clase.getId() == id){
                return clase;
            }
        }
        return null;
    }

    public int ValidarId(int id){
        int mismoId = 0;
        for (Clase clase: ListaClases) {
            if (clase.getId() == id){
                System.out.println("Ya hay una Clase con este ID");
                mismoId++;
                break;
            }
        }
        return mismoId;
    }

    //------------------------------------------------------------------------------------------------------------------
}
