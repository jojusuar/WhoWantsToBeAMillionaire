/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jojusuar
 */
import modelo.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        ArrayList<Estudiante> participantes = new ArrayList<>();
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        ArrayList<Materia> materias = new ArrayList<>(); 
        ArrayList<Paralelo> paralelos = new ArrayList<>();
        ArrayList<Termino> terminos = new ArrayList<>();
        Termino t1 = new Termino(2023,1);//creando terminos academicos
        Termino t2 = new Termino(2023,1);
        Termino t3 = new Termino(2023,1);
        Materia m1 = new Materia("001","mate",3,preguntas);//generando materias
        Materia m2 = new Materia("001","fisica",3,preguntas);
        Materia m3 = new Materia("001","poo",3,preguntas);
        Paralelo p1 = new Paralelo(participantes,m1,t1,1);//creando paralelos
        Paralelo p2 = new Paralelo(participantes,m2,t2,2);
        Paralelo p3 = new Paralelo(participantes,m2,t3,3);
        Estudiante al1 = new Estudiante("Angello","angbeand","202105946");//generando estudiantes
        Estudiante al2 = new Estudiante("Julio","euclase","202105956");
        Estudiante al3 = new Estudiante("Mateo","MateoTuPapa","202105966");
        Pregunta pr1 = new Pregunta("cuanto es 2 +2",1,"4","5","7","8");//generando preguntas
        Pregunta pr2 = new Pregunta("cuanto es 2 x 3",2,"6","9","7","8");
        Pregunta pr3 = new Pregunta("cuanto es 4 /2",3,"2","9","7","8");
        materias.add(m1);//agregando materias
        materias.add(m2);
        materias.add(m3);
        participantes.add(al1);//agregando estudiantes
        participantes.add(al2);
        participantes.add(al3);
        preguntas.add(pr1);//agregando preguntas
        preguntas.add(pr2);
        preguntas.add(pr3);
        paralelos.add(p1);//agregando paralelos
        paralelos.add(p2);
        paralelos.add(p3);
        terminos.add(t1);//agregando terminos
        terminos.add(t2);
        terminos.add(t3);
        Scanner input = new Scanner(System.in);
        int query = 0;
        boolean flagMenu= false;
        do{
            flagMenu = false;
            System.out.println("-----MENÚ PRINCIPAL-----");
            System.out.println("Ingrese el número para elegir una acción: ");
            System.out.println("1. Configuraciones");
            System.out.println("2. Nuevo juego");
            System.out.println("3. Reporte");
            System.out.println("4. Salir");
            query = input.nextInt();
            input.nextLine();
            switch(query){
            case 1:
                int query2 = 0;
                boolean flagConfig = false;
                do{
                    System.out.println("-----Configuraciones-----");
                    System.out.println("1. Administrar términos académicos");
                    System.out.println("2. Administrar materias y paralelos");
                    System.out.println("3. Administrar preguntas");
                    System.out.println("4. Regresar");
                    query2 = input.nextInt();
                    input.nextLine();
                    flagConfig = false;
                    switch(query2){
                        case 1:
                            int query3 = 0;
                            boolean flagTermino = false;
                            do{
                                System.out.println("-----Administrar términos académicos-----");
                                System.out.println("<<MOSTRANDO LISTA DE TÉRMINOS>>");
                                System.out.println("1. Ingresar término");
                                System.out.println("2. Editar término");
                                System.out.println("3. Configurar término para juego");
                                System.out.println("4. Regresar");
                                query3 = input.nextInt();
                                input.nextLine();
                                flagTermino = false;
                                switch(query3){
                                    case 1:
                                        System.out.println("<<INGRESANDO TÉRMINO>>");
                                        flagTermino = true;
                                        break;
                                    case 2:
                                        System.out.println("<<EDITANDO TÉRMINO>>");
                                        flagTermino = true;
                                        break;
                                    case 3:
                                        System.out.println("<<SELECCIONANDO TÉRMINO>>");
                                        flagTermino = true;
                                        break;
                                    case 4:
                                        flagConfig = true;
                                        break;
                                        
                                }
                            }while(flagTermino);
                            break;
                        case 2:
                            int query4 = 0;
                            flagTermino = false;
                            do{
                                System.out.println("-----Administrar materias y paralelos-----");
                                System.out.println("1. Ingresar materia");
                                System.out.println("2. Editar materia");
                                System.out.println("3. Agregar paralelo");
                                System.out.println("4. Eliminar paralelo");
                                System.out.println("5. Regresar");
                                query4 = input.nextInt();
                                input.nextLine();
                                flagTermino = false;
                                switch(query4){
                                    case 1:
                                        System.out.println("<<INGRESANDO MATERIA>>");
                                        flagTermino = true;
                                        break;
                                    case 2:
                                        System.out.println("<<EDITANDO MATERIA>>");
                                        flagTermino = true;
                                        break;
                                    case 3:
                                        System.out.println("<<AGREGANDO PARALELO>>");
                                        flagTermino = true;
                                        break;
                                    case 4:
                                        System.out.println("<<ELIMINANDO PARALELO>>");
                                        flagTermino = true;
                                        break;
                                    case 5:
                                        flagConfig = true;
                                        break;
                                }
                            }while(flagTermino);
                            break;
                        case 3:
                            int query5 = 0;
                            flagTermino = false;
                            do{
                                System.out.println("-----Administrar preguntas-----");
                                System.out.println("1. Visualizar preguntas");
                                System.out.println("2. Agregar pregunta");
                                System.out.println("3. Eliminar pregunta");
                                System.out.println("4. Regresar");
                                query5 = input.nextInt();
                                input.nextLine();
                                flagTermino = false;
                                switch(query5){
                                    case 1:
                                        System.out.println("<<VISUALIZANDO PREGUNTAS>>");
                                        flagTermino = true;
                                        break;
                                    case 2:
                                        System.out.println("<<AGREGANDO PREGUNTA>>");
                                        flagTermino = true;
                                        break;
                                    case 3:
                                        System.out.println("<<ELIMINANDO PREGUNTA>>");
                                        flagTermino = true;
                                        break;
                                    case 4:
                                        flagConfig = true;
                                        break;
                                }
                            }while(flagTermino);
                            break;
                        case 4:
                            flagMenu = true;
                            break;
                    }
                }while(flagConfig);
                break;
            
            case 2:
                Materia materiaEscogida=null;
                    Paralelo paraleloEscogido=null;
                    int nPreguntas;
                    String participante;
                    String consulta;
                    flagConfig = false;
                    Estudiante estudiante = new Estudiante(null,null,null);
                    Estudiante apoyo = new Estudiante(null,null,null);
                    
                    System.out.println("-----Nuevo juego-----");//pedida de datos antes de comenzar a jugar
                    System.out.println("Ingrese la materia");
                   
                    String materia = input.next();
                    
                     
                    
                    input.nextLine();
                    for(Materia elemento:materias){
                     if(materia.equals(elemento.getNombre()))
                     materiaEscogida = elemento;
                    }
                    
                    System.out.println("Ingrese el paralelo");
                    int paralel = input.nextInt();
                    for(Paralelo elemento:paralelos){
                     if(paralel<=elemento.getNumero()&&paralel>=elemento.getNumero()){
                     paraleloEscogido = elemento;
                     }}
                   
                    System.out.println("Ingrese el numero de preguntas por nivel");
                    nPreguntas = input.nextInt();
                   
                    while(nPreguntas!=materias.get(0).getNiveles()){
                        System.out.println("Ingrese el numero de preguntas por nivel");
                        nPreguntas = input.nextInt();}
                    System.out.println("Ingrese la matricula del participante o ingrese aletaorio para seleccionar un participante aleatorio del listado");
                    
                    participante = input.next();
                    if (participante.equals("aleatorio")){
                        Random random = new Random();
                        int indice = random.nextInt(participantes.size());
                        estudiante = participantes.get(indice);
                    
                    }
                    else{
                       for(Estudiante pr: participantes){
                       if(pr.getMatricula().equals(participante)){}
                       estudiante = pr;
                       }
                       
                    }
                    System.out.println("El concursante seleccionado es "+estudiante.getNombre()); 
                    input.nextLine();
                    System.out.println("Ingrese la matricula del companiero de apoyo o ingrese aletaorio para seleccionar un companiero aleatorio del listado");
                    consulta = input.next();                  
                    input.nextLine();
                    if (consulta.equals("aleatorio")){
                        Random random = new Random();
                        int indice = random.nextInt(participantes.size());
                        apoyo = participantes.get(indice);
                    
                    }
                    else{
                       for(Estudiante pr: participantes){
                       if(pr.getMatricula().equals(consulta)){}
                       apoyo = pr;
                       }
                       
                    }
                    System.out.println("El companiero de consulta seleccionado es "+apoyo.getNombre());
                    System.out.println("El juego tiene la siguiente configuracion");
                    System.out.println("Preguntas sobre la materia "+materiaEscogida.getNombre()+" con el total de "+materiaEscogida.getNiveles()+" niveles");
                    System.out.println("Participante a jugar:"+estudiante.getNombre()+" con matricula:"+estudiante.getMatricula()+" del paralelo "+paraleloEscogido.getNumero());
                    
                    
                    flagMenu = true;
                     
                
                break;
                
            case 3:
                System.out.println("----Generar Reporte----");
                System.out.println("Ingrese el termino academico: ");
                String termino = input.nextLine();
                System.out.println("Ingrese el codigo de materia: ");
                String codigo = input.nextLine();
                System.out.println("Ingrese el paralelo:          ");
                String paralelo = input.nextLine();
                System.out.println("<<GENERANDO REPORTE>>");
                flagMenu = true;
                break;
                
            case 4:
                System.out.println("Vuelva pronto!");
                flagMenu = false;
                break;
        }
        }while(flagMenu);
        input.close();
    }
    
}
