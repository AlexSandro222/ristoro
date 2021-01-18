/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;
import java.util.ArrayList;


/**
 *
 * @author aless
 */
public class Piatto {
 private String nome;
 private String tipo;
 private ArrayList<Ingrediente> ingredienti;
    // costruttore default
    public Piatto() {
    }
 
 
 
    // costruttore con parametri
    public Piatto(String nome, String tipo, ArrayList<Ingrediente> ingredienti){
        this.nome = nome;
        this.tipo = tipo;
        this.ingredienti = ingredienti;
    }
    // costruttore copia
 public Piatto(Piatto copia){
  this.nome = copia.nome;
  this.tipo = copia.tipo; 
  this.ingredienti = copia.ingredienti; 
 }
 
 public Double prezzoPiatto(){
  Double prezzoPiatto = 0.0;
  for(int i = 0;i<this.ingredienti.size();i++){
   Ingrediente ingredienteCorrente = this.ingredienti.get(i);
   Double costoTotale = ingredienteCorrente.getQuantita() * ingredienteCorrente.getPrezzoUnitario();
   prezzoPiatto = prezzoPiatto + costoTotale;
  }
  return prezzoPiatto;
 }

 public void aggiungiIngredienti(ArrayList<Ingrediente> ingredienti){
  for(int i=0;i<ingredienti.size();i++){
   Ingrediente corrente= ingredienti.get(i);
   this.ingredienti.add(corrente);
  }
 }
 
 public void rimuoviIngredienti(ArrayList<Ingrediente> ingredienti){
  for(int i=0;i<ingredienti.size();i++){
   Ingrediente daEliminare = ingredienti.get(i);
   for(int j=0;j<this.ingredienti.size();j++){
    Ingrediente corrente = this.ingredienti.get(j);
    if(corrente.getDescrizione().equalsIgnoreCase(daEliminare.getDescrizione())){
     // gli ingredienti sono uguali posso rimuovere 
         this.ingredienti.remove(j);
        break;
    }
   }
  }
 }
 
 
 
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Ingrediente> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(ArrayList<Ingrediente> ingredienti) {
        this.ingredienti = ingredienti;
    }
 
 
 
}
