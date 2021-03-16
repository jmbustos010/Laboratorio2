package hn.edu.ujcv.pii.p2.objetos;

import java.util.Date;
import hn.edu.ujcv.pii.p2.objetos.Persona;

public class Alumno extends Persona{
   private long Cuenta;


   public Alumno(){
       super();
   }

   public Alumno(long cuenta, long id, String nombre, Date fechaDeNacimientos){
       super(id, nombre, fechaDeNacimientos);
   }


   public long getCuenta(){
       return Cuenta;
   }
   public void setCuenta(long cuenta){
       this.Cuenta = cuenta;
   }

   //-------------------------------------------------------------------------------------------------------------------
}
