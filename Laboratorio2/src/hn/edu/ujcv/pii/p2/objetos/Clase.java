package hn.edu.ujcv.pii.p2.objetos;


public abstract class Clase implements IClase{
    private int    Id;
    private int    NA1;
    private int    NA2;
    private int    NA3;
    private int    NE1;
    private int    NE2;
    private int    NE3;
    private int    NR;
    private String Nombre;
    private int    UnidadesValorativas;
    private static final double VALORPARCIAL1Y2 = 0.3;
    private static final double VALORPARCIAL3 = 0.4;

    public Clase(){
    }
    public Clase(int Id, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR, String Nombre, int UnidadesValorativas){
        this.Id                  = Id;
        this.NA1                 = NA1;
        this.NA2                 = NA2;
        this.NA3                 = NA3;

        if (NE1 == 0){
            this.NE1 = NR;
        }else{
            this.NE1 = NE1;
        }

        if (NE2 == 0){
            this.NE2 = NR;
        }else{
            this.NE2 = NE2;
        }

//        this.NE1                 = NE1;
//        this.NE2                 = NE2;
        this.NE3                 = NE3;
        this.NR                  = NR;
        this.Nombre              = Nombre;
        this.UnidadesValorativas = UnidadesValorativas;
    }

    //////////Getters//////////
    public int getId() {
        return Id;
    }
    public int getNA1() {
        return NA1;
    }
    public int getNA2() {
        return NA2;
    }
    public int getNA3() {
        return NA3;
    }
    public int getNE1() {
        return NE1;
    }
    public int getNE2() {
        return NE2;
    }
    public int getNE3() {
        return NE3;
    }
    public int getNR() {
        return NR;
    }
    public String getNombre() {
        return Nombre;
    }
    public int getUnidadesValorativas() {
        return UnidadesValorativas;
    }

    //////////Setters//////////
    public void setId(int id) {
        this.Id = id;
    }
    public void setNA1(int NA1) {
        this.NA1 = NA1;
    }
    public void setNA2(int NA2) {
        this.NA2 = NA2;
    }
    public void setNA3(int NA3) {
        this.NA3 = NA3;
    }


    public void setNE1(int NE1) {
        if (NE1 == 0){
            this.NE1 = NR;
        }else{
            this.NE1 = NE1;
        }

    }
    public void setNE2(int NE2) {
        if (NE2 == 0){
            this.NE2 = NR;
        }
        else{
            this.NE2 = NE2;
        }
    }


    public void setNE3(int NE3) {
        this.NE3 = NE3;
    }
    public void setNR(int NR) {
        this.NR = NR;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setUnidadesValorativas(int UnidadesValorativas) {
        this.UnidadesValorativas = UnidadesValorativas;
    }

    @Override
    public String toString(){
        return "-El nombre de la clase es: "+getNombre()+" \n -El ID es: "+getId()+
                "\n-Esta clase tiene "+getUnidadesValorativas()+" unidades valorativas"+
                "\n ---------------------------------------------------------------------";
    }
}
