package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;

public class ListaHistoriales {
    private ArrayList<Historial> ListaHistoriales;

    public ListaHistoriales(){
        ListaHistoriales = new ArrayList<>();
    }

    public void AddHistorial(Historial historial){
        ListaHistoriales.add(historial);
    }

    public double CalcularPromedioGlobal(){
        double promedioGlobal = 0;
        int contador = 0;

        for (Historial historial: ListaHistoriales) {
            promedioGlobal = promedioGlobal + historial.CalcularPromedio();
            contador++;
        }

        return promedioGlobal/contador;
    }

    public void ImprimirListaHistorial(){
        System.out.println("Esta es la lista de los historiales: ");
        for (Historial historial:  ListaHistoriales) {
            System.out.println("-El alumno: "+historial.getAlumno().getNombre()+ "\n-ID del Alumno: "
                    +historial.getAlumno().getId());
            System.out.println("-Estudia en el campus: "+historial.getCampus().getNombre());
            System.out.println("-Estudia la carrera de: "+ historial.getCarrera().getNombre());
            System.out.println("-En el periodo: "+ historial.getPeriodo().getDescripcion()+" con fecha de inicio: "
                    +historial.getPeriodo().getFechaInicio()+" y con fecha final: "+historial.getPeriodo().getFechaFin());
            System.out.println("-Sus clases son las siguientes: ");
            for (Clase clase: historial.getClases()){
                System.out.println(clase.toString());
                System.out.println("-Nota Final: "+clase.CalcularNotaFinal());
            }
            System.out.println("El Promedio del alumno es ="+ historial.CalcularPromedio());
        }

        System.out.println("El Promedio Global actual de todos los alumno = "+CalcularPromedioGlobal());
    }
    //------------------------------------------------------------------------------------------------------------------
}
