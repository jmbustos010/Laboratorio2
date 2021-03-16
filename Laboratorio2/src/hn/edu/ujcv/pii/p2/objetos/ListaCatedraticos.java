package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;

public class ListaCatedraticos {
    private ArrayList<Catedratico> ListaCatedraticos;

    public ListaCatedraticos(){
        ListaCatedraticos = new ArrayList<>();
    }

    public void AddCatedratico(Catedratico catedratico){
        ListaCatedraticos.add(catedratico);
    }

    public void ImpimirListaCatedraticos(){
        System.out.println("Esta es la lista de los catedraticos registrados: ");
        for (Catedratico catedratico: ListaCatedraticos) {
            System.out.println("Nombre: "+catedratico.getNombre());
            System.out.println("Id: "+catedratico.getId());
        }
    }

    public int ValidarId(long id){
        int mismoId = 0;
        for (Catedratico catedratico: ListaCatedraticos) {
            if (catedratico.getId() == id){
                System.out.println("Ya hay un catedratico con este ID");
                mismoId++;
                break;
            }
        }
        return mismoId;
    }

    public int ValidarCodigo(int codigo){
        int mismoCodigo = 0;
        for (Catedratico catedratico: ListaCatedraticos) {
            if (catedratico.getCodigo() == codigo){
                System.out.println("Ya hay un catedratico con este Codigo");
                mismoCodigo++;
                break;
            }
        }
        return mismoCodigo;
    }
    //-------------------------------------------------------------------------------------------------------------------
}