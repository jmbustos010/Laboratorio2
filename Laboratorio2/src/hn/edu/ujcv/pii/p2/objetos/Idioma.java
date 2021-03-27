package hn.edu.ujcv.pii.p2.objetos;

public class Idioma extends General{
    private int NotaLaboratorio;
    private static final double ValorParcial1Y2 = 0.3;
    private static final double ValorParcial3 = 0.4;

    public Idioma(){
        super();
    }
    public Idioma(int NotaLaboratorio, boolean TodasCarreras,int Id, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR, String Nombre, int UnidadesValorativas){
        super(TodasCarreras,Id,NA1,NA2,NA3,NE1,NE2,NE3,NR,Nombre,UnidadesValorativas);
        this.NotaLaboratorio = NotaLaboratorio;
    }

    public int getNotaLaboratorio() {
        return NotaLaboratorio;
    }
    public void setNotaLaboratorio(int notaLaboratorio){
        this.NotaLaboratorio = notaLaboratorio;
    }

    @Override
    public double CalcularNotaFinal(){
        double nota1 = (super.getNE1() + super.getNA1())*ValorParcial1Y2;
        double nota2 = (super.getNE2() + super.getNA2())*ValorParcial1Y2;
        double nota3 = (super.getNE3() + super.getNA3() + getNotaLaboratorio())*ValorParcial3;

        double notaFinal = nota1+nota2+nota3;
        return notaFinal;
    }

    @Override
    public String toString(){
        return super.toString()+ " Su nota final es "+CalcularNotaFinal();
    }
}
