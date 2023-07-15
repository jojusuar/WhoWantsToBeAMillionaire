/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * @author jojusuar
 */
public class Materia { //atributos
    private String codigo;
    private String nombre;
    private int niveles;
    private ArrayList<Pregunta> preguntas;
    //constructor
    public Materia(String c, String n, int v, ArrayList<Pregunta> p){
        codigo = c;
        nombre = n;
        niveles = v;
        preguntas = p;
    }
    //getters
    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getNiveles(){
        return niveles;
    }
    public ArrayList<Pregunta> getPreguntas(){
        return preguntas;
    }
    //setters
    public void setCodigo(String c){
        codigo = c;
    }
    public void setNombre(String n){
        nombre = n;
    }
    public void setNiveles(int v){
        niveles = v;
    }
    public void setPreguntas(ArrayList<Pregunta> p){
        preguntas = p;
    }
}