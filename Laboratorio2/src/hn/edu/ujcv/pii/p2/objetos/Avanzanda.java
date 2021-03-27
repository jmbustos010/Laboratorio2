package hn.edu.ujcv.pii.p2.objetos;

public class Avanzanda  extends Clase{
    private int  ValorVinculacion;
    private static final double VALORPARCIAL1Y2 = 0.3;
    private static final double VALORPARCIAL3 = 0.4;


    public Avanzanda(){
        super();
    }
    public Avanzanda(int valorVinculacion, int Id, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR, String Nombre, int UnidadesValorativas){
        super(Id, NA1, NA2, NA3, NE1, NE2, NE3, NR, Nombre, UnidadesValorativas);
        this.ValorVinculacion = valorVinculacion;
    }


    public int getValorVinculacion(){
        return ValorVinculacion;
    }

    public void setValorVinculacion(int valorVinculacion){
        this.ValorVinculacion = valorVinculacion;
    }

    @Override
    public double CalcularNotaFinal(){
        double nota1 = (super.getNE1() + super.getNA1())*VALORPARCIAL1Y2;
        double nota2 = (super.getNE2() + super.getNA2())*VALORPARCIAL1Y2;
        double nota3 = (super.getNE3() + super.getNA3() + getValorVinculacion())*VALORPARCIAL3;


        double notaFinal = nota1+nota2+nota3;
        return notaFinal;
    }

    @Override
    public String toString(){
        return super.toString()+ " Su nota final "+ CalcularNotaFinal();
    }
    //------------------------------------------------------------------------------------------------------------------
}
