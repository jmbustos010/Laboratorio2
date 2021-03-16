package hn.edu.ujcv.pii.p2.objetos;

public class General extends Clase{
    private boolean TodasCarreras;

    public General(){
        super();
    }

    public General(boolean TodasCarreras,int Id, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR, String Nombre, int UnidadesValorativas){
        super(Id,NA1,NA2,NA3,NE1,NE2,NE3,NR,Nombre,UnidadesValorativas);
        this.TodasCarreras = TodasCarreras;
    }


    public boolean isTodasCarreras(){
        return TodasCarreras;
    }
    public void setTodasCarreras(boolean todasCarreras){
        this.TodasCarreras = todasCarreras;
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public double CalcularNotaFinal(){

        double notaFinal = 0.0;
        return notaFinal;
    }
    //------------------------------------------------------------------------------------------------------------------
}
