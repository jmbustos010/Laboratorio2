package hn.edu.ujcv.pii.p2.objetos;

public class Ingenieria extends General{
    private int NotaProyecto;

    public Ingenieria(){
        super();
    }

    Ingenieria(int NotaProyecto,boolean TodasCarreras,int Id, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR, String Nombre, int UnidadesValorativas ){
        super(TodasCarreras,Id,NA1,NA2,NA3,NE1,NE2,NE3,NR,Nombre,UnidadesValorativas);
        this.NotaProyecto = NotaProyecto;
    }

    public void setNotaProyecto(int notaProyecto) {
        this.NotaProyecto = notaProyecto;
    }
    public int getNotaProyecto() {
        return NotaProyecto;
    }

    @Override
    public double CalcularNotaFinal(){
        double nota1 = (super.getNE1() + super.getNA1())*0.3;
        double nota2 = (super.getNE2() + super.getNA2())*0.3;
        double nota3 = (super.getNE3() + super.getNA3() + getNotaProyecto())*0.4;

        double notaFinal = nota1+nota2+nota3;
        return notaFinal;
    }
    @Override
    public String toString(){
        return super.toString()+" Su nota final es "+CalcularNotaFinal();

    }

}
