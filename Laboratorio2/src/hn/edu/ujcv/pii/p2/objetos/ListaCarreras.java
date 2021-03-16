package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;

public class ListaCarreras {
    private ArrayList<Carrera> ListaCarreras;

    public ListaCarreras(){
        ListaCarreras = new ArrayList<>();
    }

    public void AddCarrera(Carrera carrera){
        ListaCarreras.add(carrera);
    }

    public void ImprimirListaCarreras(){
        System.out.println("Esta es la lista de las carreras registradas: ");
        for (Carrera carrera: ListaCarreras) {
            System.out.println("Nombre: "+carrera.getNombre()+"\nID: "+carrera.getId());
        }
    }

    public Carrera BuscarCarrera(int id){
        for (Carrera carrera: ListaCarreras) {
            if (carrera.getId() == id){
                return carrera;
            }
        }
        return null;
    }

    public int ValidarId(int id){
        int mismoId = 0;
        for (Carrera carrera: ListaCarreras) {
            if (carrera.getId() == id){
                System.out.println("Ya hay una carrera con este ID");
                mismoId++;
                break;
            }
        }
        return mismoId;
    }

    //-------------------------------------------------------------------------------------------------------------------
}
