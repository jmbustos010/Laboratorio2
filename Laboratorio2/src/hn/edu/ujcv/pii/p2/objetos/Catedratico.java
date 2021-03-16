package hn.edu.ujcv.pii.p2.objetos;

import java.util.Date;

public class Catedratico extends Persona{
    private int Codigo;


   public Catedratico(){
        super();
    }

    public Catedratico(int codigo, long id, String nombre, Date fechaDeNacimientos){
       super(id, nombre, fechaDeNacimientos);
       this.Codigo = codigo;
    }


    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo){
       this.Codigo = codigo;
    }

    //------------------------------------------------------------------------------------------------------------------
}
