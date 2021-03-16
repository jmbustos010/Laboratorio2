package hn.edu.ujcv.pii.p2.objetos;

public class Carrera {
    private int Id;
    private String Nombre;

    public Carrera(){
    }

    public Carrera(int Id, String Nombre){
        this.Id     = Id;
        this.Nombre = Nombre;
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }


    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
}
