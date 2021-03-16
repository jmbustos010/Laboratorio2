package hn.edu.ujcv.pii.p2;


import hn.edu.ujcv.pii.p2.objetos.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        ListaCatedraticos listaCatedraticos = new ListaCatedraticos();
        ListaCampus listaCampus = new ListaCampus();
        ListaCarreras listaCarreras = new ListaCarreras();
        ListaAlumnos listaAlumnos = new ListaAlumnos();
        ListaPeriodos listaPeriodos = new ListaPeriodos();
        ListaClases listaClases = new ListaClases();
        ListaHistoriales listaHistoriales  = new ListaHistoriales();


       // try {
            int opcion;
            do {
                System.out.println("¿Que desea hacer?");
                System.out.println("1. Agregar Catedratico");
                System.out.println("2. Agregar Campus");
                System.out.println("3. Agregar Carrera");
                System.out.println("4. Agregar Alumno");
                System.out.println("5. Agregar Periodo");
                System.out.println("6. Agregar Clase");
                System.out.println("7. Agregar Historial");
                System.out.println("8. Mostrar menu de impresion");
                System.out.println("9. Cerrar");
                opcion = teclado.nextInt();

                switch (opcion){
                    case 1:
                        AgregarCatedratico(listaCatedraticos);
                        break;
                    case 2:
                        AgregarCampus(listaCampus);
                        break;
                    case 3:
                        AgregarCarrera(listaCarreras);
                        break;
                    case 4:
                        AgregarAlumno(listaAlumnos);
                        break;
                    case 5:
                        AgregarPeriodo(listaPeriodos);
                        break;
                    case 6:
                        AgregarClase(listaClases);
                        break;
                    case 7:
                        AgregarHistorial(listaHistoriales, listaAlumnos, listaCampus, listaCarreras, listaClases, listaPeriodos);
                     break;
                    case 8:
                        ImprimirListas(listaHistoriales, listaAlumnos, listaCampus, listaCarreras, listaClases, listaPeriodos, listaCatedraticos);
                        break;
                    default:
                        if (opcion != 9)
                        System.out.println("Opcion no valida");
                        break;
                }
                } while (opcion != 9);



           /* }catch(Exception e){
                System.err.println("ERROR!" + e.getMessage());
            }*/
            //-----
        }




    public static void AgregarCatedratico(ListaCatedraticos listaCatedraticos){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");

        Catedratico catedratico1 = new Catedratico();

        System.out.println("Ingrese el nombre del catedratico");
        catedratico1.setNombre(teclado.next());
        //---
        do {
            System.out.println("Ingrese el ID del catedratico");
            catedratico1.setId(teclado.nextLong());
        }while (listaCatedraticos.ValidarId(catedratico1.getId()) > 0);
         //---
        System.out.println("Ingrese la fecha de nacimiento del catedratico (YY/MM/DD)");
        int anio = teclado.nextInt();
        int mes = teclado.nextInt();
        int dia = teclado.nextInt();
        if (mes==12) {
            mes = mes - 2;
        }
        if (mes > 12 || dia > 31){
            throw new IllegalArgumentException("Dia o mes que ingreso son invalidos");
        }
        Date fechaDeNacimiento = new Date((anio-1900), mes+1, dia);
        catedratico1.setFechaDeNacimientos(fechaDeNacimiento);
        //--
        do {
            System.out.println("Ingrese el codigo del catedratico");
            catedratico1.setCodigo(teclado.nextInt());
        }while(listaCatedraticos.ValidarCodigo(catedratico1.getCodigo()) > 0);
        //--
        listaCatedraticos.AddCatedratico(catedratico1);
    }

    public static void AgregarCampus(ListaCampus listaCampus){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");

        Campus campus1 = new Campus();
        System.out.println("Ingrese el nombre del campus");
        campus1.setNombre(teclado.next());
        //--
        do{
            System.out.println("Ingrese el Id del campus");
            campus1.setId(teclado.nextInt());
        }while (listaCampus.ValidarId(campus1.getId()) > 0);

        //--
        System.out.println("Ingrese la direccion del campus");
        campus1.setDireccion(teclado.next());
        System.out.println("Ingrese la fecha de inico del campus (YY/MM/DD)");
        int anio = teclado.nextInt();
        int mes = teclado.nextInt();
        int dia = teclado.nextInt();
        if (mes==12) {
            mes = mes - 2;
        }
        if (mes > 12 || dia > 31){
            throw new IllegalArgumentException("Dia o mes que ingreso son invalidos");
        }
        Date fechaDeInicio = new Date((anio-1900), mes+1, dia);
        campus1.setFechaInicio(fechaDeInicio);

        listaCampus.AddCampus(campus1);
    }

    public static void AgregarCarrera(ListaCarreras listaCarreras){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");

        Carrera carrera1 = new Carrera();
        System.out.println("Ingres el nombre de la carrera");
        carrera1.setNombre(teclado.next());
        do {
            System.out.println("Ingrese el Id de la carrera");
            carrera1.setId(teclado.nextInt());
        }while (listaCarreras.ValidarId(carrera1.getId()) > 0);


       listaCarreras.AddCarrera(carrera1);
    }

    public static void AgregarAlumno(ListaAlumnos listaAlumnos){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        Alumno alumno1 = new Alumno();

        System.out.println("Ingrese el nombre del alumno");
        alumno1.setNombre(teclado.next());
        //--
        do {
            System.out.println("Ingrese el ID del alumno");
            alumno1.setId(teclado.nextLong());
        }while (listaAlumnos.ValidarId(alumno1.getId()) > 0);

        //--
        //--
        do {
            System.out.println("Ingrese numero de cuenta del alumno");
            alumno1.setCuenta(teclado.nextLong());
        }while (listaAlumnos.ValidarCueta(alumno1.getCuenta()) > 0);

        //--
        System.out.println("Ingrese la fecha de nacimiento del alumno (YY/MM/DD)");
        int anio = teclado.nextInt();
        int mes = teclado.nextInt();
        int dia = teclado.nextInt();
        if (mes==12) {
            mes = mes - 2;
        }
        if (mes > 12 || dia > 31){
            throw new IllegalArgumentException("Dia o mes que ingreso son invalidos");
        }
        Date fechaDeNacimiento = new Date((anio-1900), mes+1, dia);
        alumno1.setFechaDeNacimientos(fechaDeNacimiento);

        listaAlumnos.AddAlumno(alumno1);
    }

    public static void AgregarPeriodo(ListaPeriodos listaPeriodos){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        Periodo periodo1 = new Periodo();

        System.out.println("Ingrese la descripcion del periodo");
        periodo1.setDescripcion(teclado.next());
        do {
            System.out.println("Ingrese el ID del periodo");
            periodo1.setId(teclado.nextInt());
        }while (listaPeriodos.ValidarId(periodo1.getId()) > 0);

        System.out.println("Ingrese la fecha de inicio del periodo (YY/MM/DD)");
        int anio = teclado.nextInt();
        int mes = teclado.nextInt();
        int dia = teclado.nextInt();
        if (mes==12) {
            mes = mes - 2;
        }
        if (mes > 12 || dia > 31){
             throw new IllegalArgumentException("Dia o mes que ingreso son invalidos");
        }
        Date fechaDeInicio = new Date((anio-1900), mes+1, dia);
        periodo1.setFechaInicio(fechaDeInicio);

        System.out.println("Ingrese la fecha de fin del periodo (YY/MM/DD)");
        int aniofin = teclado.nextInt();
        int mesfin = teclado.nextInt();
        int diafin = teclado.nextInt();
        if (mesfin==12) {
            mesfin = mesfin - 2;
        }
        if (mesfin > 12 || diafin > 31){
             throw new IllegalArgumentException("Dia o mes que ingreso son invalidos");
        }
        Date fechaDeFin = new Date((aniofin-1900), mesfin+1, diafin);
        periodo1.setFechaFin(fechaDeFin);

        listaPeriodos.AddPeriodo(periodo1);
        //-----
    }

    public static void AgregarClase(ListaClases listaClases){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        boolean error = false;

        do {
            error = false;
            System.out.println("¿Que tipo de clase desea ingresar?");
            System.out.println("1. Clase Avanzada");
            System.out.println("2. Clase Ingenieria");
            System.out.println("3. Clase Idiomas");
            System.out.println("4. Cerrar");
            int opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    AgregarClaseAvanzada(listaClases);
                    break;
                case 2:
                    AgregarClaseIngenieria(listaClases);
                    break;
                case 3:
                    AgregarClaseIdiomas(listaClases);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    error = true;
                    break;
            }
        }while (error);

        //-----
    }

    public static void AgregarClaseAvanzada(ListaClases listaClases){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");

        Avanzanda avanzanda1 = new Avanzanda();
        System.out.println("Ingrese el nombre de la Clase Avanzada");
        avanzanda1.setNombre(teclado.next());
        //--
        do {
            System.out.println("Ingrese el ID de la Clase Avanzada");
            avanzanda1.setId(teclado.nextInt());
        }while (listaClases.ValidarId(avanzanda1.getId()) > 0);
        //--
        System.out.println("Ingrese las unidades valorativas de la Clase Avanzada");
        avanzanda1.setUnidadesValorativas(teclado.nextInt());

        listaClases.AddClase(avanzanda1);
    }

    public static void AgregarClaseIngenieria(ListaClases listaClases){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");

        Ingenieria ingenieria1 = new Ingenieria();
        System.out.println("Ingrese el nombre de la Clase Ingenieria");
        ingenieria1.setNombre(teclado.next());
        //--
        do {
            System.out.println("Ingrese el ID de la Clase Ingenieria");
            ingenieria1.setId(teclado.nextInt());
        }while (listaClases.ValidarId(ingenieria1.getId()) > 0);
        //--
        System.out.println("Ingrese las unidades valorativas de la Clase Ingenieria");
        ingenieria1.setUnidadesValorativas(teclado.nextInt());

        listaClases.AddClase(ingenieria1);
    }

    public static void AgregarClaseIdiomas(ListaClases listaClases){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");

        Idioma idioma1= new Idioma();
        System.out.println("Ingrese el nombre de la Clase Idioma");
        idioma1.setNombre(teclado.next());
        //--
        do {
            System.out.println("Ingrese el ID de la Clase Idioma");
            idioma1.setId(teclado.nextInt());
        }while (listaClases.ValidarId(idioma1.getId()) > 0);
        //--
        System.out.println("Ingrese las unidades valorativas de la Clase Idioma");
        idioma1.setUnidadesValorativas(teclado.nextInt());

        listaClases.AddClase(idioma1);
    }

    public static void AgregarHistorial(ListaHistoriales listaHistoriales, ListaAlumnos listaAlumnos, ListaCampus listaCampus,
                                        ListaCarreras listaCarreras, ListaClases listaClases, ListaPeriodos listaPeriodos){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");

        Historial historial1 = new Historial();

//------- ALUMNOS
        listaAlumnos.ImprimirListaAlumnos();
        int idDeBusquedaAlumno;
        Alumno alumno1 = new Alumno();

        do {
            System.out.println("Ingrese el ID del Alumno que desea agregar");
            idDeBusquedaAlumno = teclado.nextInt();
            alumno1 = listaAlumnos.BuscarAlumno(idDeBusquedaAlumno);

            if (alumno1 == null){
                System.out.println("Error, no existe ningun Alumno registrado con este ID");
            }
        }while (alumno1 == null);

        historial1.setAlumno(alumno1);
//------- CAMPUS
        listaCampus.ImprimirListaCampus();
        int idDeBusquedaCampus;
        Campus campus1 = new Campus();
        do {
            System.out.println("Ingrese el ID del Campus que desea agregar");
            idDeBusquedaCampus = teclado.nextInt();
            campus1 = listaCampus.BuscarCampus(idDeBusquedaCampus);

            if (campus1 == null){
                System.out.println("Error, no existe ningun campus registrado con este ID");
            }
        }while (campus1 == null);

        historial1.setCampus(campus1);

//------- CARRERAS
        listaCarreras.ImprimirListaCarreras();
        int idDeBusquedaCarrera;
        Carrera carrera1;
        do {
            System.out.println("Ingrese el ID de la carrera que desea agregar");
            idDeBusquedaCarrera = teclado.nextInt();
            carrera1 = listaCarreras.BuscarCarrera(idDeBusquedaCarrera);

            if (carrera1 == null){
                System.out.println("Error, no existe ninguna carrera registrado con este ID");
            }
        }while (carrera1 == null);

        historial1.setCarrera(carrera1);
//-------CLASES
        ArrayList<Clase> clasesDeHistorial = new ArrayList<>();
        String continuar = " ";
        do {

            System.out.println("Esta es la lista de las clases");
            listaClases.ImprimirListaClase();
            int idDeBuscarClase;
            Clase clase1;
            do {
                System.out.println("Ingrese el ID de la clase que desea agregar");
                idDeBuscarClase = teclado.nextInt();
                clase1 = listaClases.BuscarCarrera(idDeBuscarClase);

                if (clase1 == null){
                    System.out.println("Error, no existe ninguna clase registrada con este ID");
                }
            }while (clase1 == null);

//--Primer Parcial
            int validacionPrimerParcial;
            do {
                validacionPrimerParcial = 0;
                System.out.println("Ingrese la nota del acumulativo primer parcial");
                clase1.setNA1(teclado.nextInt());
                System.out.println("Ingrese la nota del examen primer parcial");
                clase1.setNE1(teclado.nextInt());

                int notaPrimerParcial = clase1.getNA1()+clase1.getNE1();
                if (notaPrimerParcial > 100){
                    System.out.println("Notas invalidas, sobrepasan el valor del parcial");
                    validacionPrimerParcial++;
                }
            }while (validacionPrimerParcial != 0);
//--Primer Parcial
//--Segundo Parcial
            int validacionSegundoParcial;
            do {
                validacionSegundoParcial = 0;
                System.out.println("Ingrese la nota del acumulativo segundo parcial");
                clase1.setNA2(teclado.nextInt());
                System.out.println("Ingrese la nota del examen segundo parcial");
                clase1.setNE2(teclado.nextInt());

                double notaSegundoParcial = clase1.getNA2()+clase1.getNE2();
                if (notaSegundoParcial > 100){
                    System.out.println("Notas invalidas, sobrepasan el valor del parcial");
                    validacionSegundoParcial++;
                }
            }while (validacionSegundoParcial != 0);
//--Segundo Parcial
//--Tercer Parcial
            int validacionTercerParcial;
            do {
                validacionTercerParcial = 0;
                System.out.println("Ingrese la nota del acumulativo tercer parcial");
                clase1.setNA3(teclado.nextInt());
                System.out.println("Ingrese la nota del examen tercer parcial");
                clase1.setNE3(teclado.nextInt());


                int notaTrabajo = 0;
                if (clase1 instanceof Ingenieria) {
                    System.out.println("Ingrese la nota del Proyecto");
                    ((Ingenieria) clase1).setNotaProyecto(teclado.nextInt());
                    notaTrabajo = ((Ingenieria) clase1).getNotaProyecto();
                } else if (clase1 instanceof Avanzanda) {
                    System.out.println("Ingrese la nota del Valor Vinculacion");
                    ((Avanzanda) clase1).setValorVinculacion(teclado.nextInt());
                    notaTrabajo = ((Avanzanda) clase1).getValorVinculacion();
                } else if (clase1 instanceof Idioma) {
                    System.out.println("Ingrese la nota del Laboratorio");
                    ((Idioma) clase1).setNotaLaboratorio(teclado.nextInt());
                    notaTrabajo = ((Idioma) clase1).getNotaLaboratorio();
                }
                double notaTercerParcial = clase1.getNA3() + clase1.getNE3() + notaTrabajo;

                if (notaTercerParcial > 100){
                    System.out.println("Notas invalidas, sobrepasan el valor del parcial");
                    validacionTercerParcial++;
                }
            }while (validacionTercerParcial != 0);
//--Tercer Parcial
//--Reposicion
            if (clase1.getNE1() == 0 || clase1.getNE2() == 0){
                System.out.println("¿El alumno realizo una reposicion? (S/N)");
                String repo = teclado.next();
                System.out.println("Cual es el valor total de la reposicion");
                int valorDeReposicion = teclado.nextInt();

                if (repo.equalsIgnoreCase("S")){
                    do {
                        System.out.println("Ingrese la nota de la reposicion que realizo el alumno");
                        clase1.setNR(teclado.nextInt());

                        if (clase1.getNR() > valorDeReposicion){
                            System.out.println("Error, la nota del alumno sobrepasa el valor total de la reposicion");
                        }
                    }while (clase1.getNR() > valorDeReposicion);
                        System.out.println("De cual parcial hizo reposicion");
                        int parcialRepo = teclado.nextInt();

                        switch (parcialRepo){
                            case 1:
                                clase1.setNE1(clase1.getNR());
                                break;
                            case 2:
                                clase1.setNE2(clase1.getNR());
                                break;
                        }




                }
            }
//--Reposicion

            clasesDeHistorial.add(clase1);

            System.out.println("¿Desea ingresar otra clase? (S/N)");
            continuar = teclado.next();
        }while (continuar.equalsIgnoreCase("S"));

        historial1.setClases(clasesDeHistorial);

//------- PERIODO
        System.out.println("Esta es la lista de los periodos");
        listaPeriodos.ImprimirListaPeriodo();
        int idDeBusquedaPeriodo;
        Periodo periodo1;
        do {
            System.out.println("Ingrese el ID del periodo que desea agregar");
            idDeBusquedaPeriodo = teclado.nextInt();
            periodo1 = listaPeriodos.BuscarPeriodo(idDeBusquedaPeriodo);

            if (periodo1 == null){
                System.out.println("Error, no existe ningun periodo registrado con este ID");
            }
        }while (periodo1 == null);

        historial1.setPeriodo(periodo1);
//-------
        listaHistoriales.AddHistorial(historial1);
//-------
        //-----
    }

    public static void ImprimirListas(ListaHistoriales listaHistoriales, ListaAlumnos listaAlumnos, ListaCampus listaCampus, ListaCarreras listaCarreras,
                                      ListaClases listaClases, ListaPeriodos listaPeriodos, ListaCatedraticos listaCatedraticos) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Imprimir lista de alumnos");
            System.out.println("2. Imprimir lista de catedraticos");
            System.out.println("3. Imprimir lista de campus");
            System.out.println("4. Imprimir lista de carreras");
            System.out.println("5. Imprimir lista de periodos");
            System.out.println("6. Imprimir lista de clases");
            System.out.println("7. Imprimir lista de historiales");
            System.out.println("8. Cerrar");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    listaAlumnos.ImprimirListaAlumnos();
                    break;
                case 2:
                    listaCatedraticos.ImpimirListaCatedraticos();
                    break;
                case 3:
                    listaCampus.ImprimirListaCampus();
                    break;
                case 4:
                    listaCarreras.ImprimirListaCarreras();
                    break;
                case 5:
                    listaPeriodos.ImprimirListaPeriodo();
                    break;
                case 6:
                    listaClases.ImprimirListaClase();
                    break;
                case 7:
                    listaHistoriales.ImprimirListaHistorial();
                    break;
                default:
                    if (opcion != 8)
                        System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 8);
    }
    //------------------------------------------------------------------------------------------------------------------
}
