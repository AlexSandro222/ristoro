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
public class Ordine {
 private int numeroIdentificativo;
 private String nome;
 private ArrayList<Piatto> piattiOrdinati;
 private Double prezzoTotale; 
    // costruttore default
    public Ordine() {
    }
    // costruttore con parametri
    public Ordine(int numeroIdentificativo, String nome, ArrayList<Piatto> piattiOrdinati, Double prezzoTotale) {
        this.numeroIdentificativo = numeroIdentificativo;
        this.nome = nome;
        this.piattiOrdinati = piattiOrdinati;
        this.prezzoTotale = prezzoTotale;
    }
    // costruttore copia 
    public Ordine(Ordine copia){
     this.numeroIdentificativo = copia.numeroIdentificativo;
     this.nome = copia.nome;
     this.piattiOrdinati = copia.piattiOrdinati;
     this.prezzoTotale = copia.prezzoTotale;
    }
  
 public Double calcoloPrezzoTotale(){
  this.prezzoTotale = 0.0;
  for(int i = 0;i<piattiOrdinati.size();i++){
   
   this.prezzoTotale= this.prezzoTotale + piattiOrdinati.get(i).prezzoPiatto();  
  }
  return this.prezzoTotale;
 }


 

    public int getNumeroIdentificativo() {
        return numeroIdentificativo;
    }

    public void setNumeroIdentificativo(int numeroIdentificativo) {
        this.numeroIdentificativo = numeroIdentificativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Piatto> getPiattiOrdinati() {
        return piattiOrdinati;
    }

    public void setPiattiOrdinati(ArrayList<Piatto> piattiOrdinati) {
        this.piattiOrdinati = piattiOrdinati;
    }

    public Double getPrezzoTotale() {
        return prezzoTotale;
    }

    public void setPrezzoTotale(Double prezzoTotale) {
        this.prezzoTotale = prezzoTotale;
    }
 
 
 
 
 
}




