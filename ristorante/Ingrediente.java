/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;

/**
 *
 * @author aless
 */
public class Ingrediente {
 private String descrizione;
 private int quantita;
 private Double prezzoUnitario;
    // costruttore default
    public Ingrediente() {
    }
 
 
 
 
    // costruttore con parametri
    public Ingrediente(String descrizione, int quantita, Double prezzoUnitario) {
        this.descrizione = descrizione;
        this.quantita = quantita;
        this.prezzoUnitario = prezzoUnitario;
    }
    // costruttore copia
    public Ingrediente(Ingrediente copia){
     this.descrizione = copia.descrizione;
     this.quantita = copia.quantita;
     this.prezzoUnitario = copia.prezzoUnitario;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public Double getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setPrezzoUnitario(Double prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }
    
    
    
   

  
 
 
 
 
 
}







