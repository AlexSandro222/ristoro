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
public class Ristorante {
private ArrayList<Piatto> piattiDisponibili;
private ArrayList<Ordine> ordiniEffettuati;

    public ArrayList<Piatto> getPiattiDisponibili() {
        return piattiDisponibili;
    }

    public void setPiattiDisponibili(ArrayList<Piatto> piattiDisponibili) {
        this.piattiDisponibili = piattiDisponibili;
    }

    public ArrayList<Ordine> getOrdiniEffettuati() {
        return ordiniEffettuati;
    }

    public void setOrdiniEffettuati(ArrayList<Ordine> ordiniEffettuati) {
        this.ordiniEffettuati = ordiniEffettuati;
    }
    // costruttore di default
    public Ristorante() {
    }
    // costruttore con parametri
    public Ristorante(ArrayList<Piatto> piattiDisponibili, ArrayList<Ordine> ordiniEffettuati) {
        this.piattiDisponibili = piattiDisponibili;
        this.ordiniEffettuati = ordiniEffettuati;
    }
// costruttore copia   
public Ristorante(Ristorante copia){
 this.piattiDisponibili = copia.piattiDisponibili;
 this.ordiniEffettuati = copia.ordiniEffettuati;
}
public void aggiungiPiatti(ArrayList<Piatto> piattiDisponibili){
 for(int i=0;i<piattiDisponibili.size();i++){
  Piatto piattoCorrente = piattiDisponibili.get(i);
  this.piattiDisponibili.add(piattoCorrente);
 }   
}    
    
    public void rimuoviPiatti(ArrayList<Piatto> piattiDisponibili){
  for(int i=0;i<piattiDisponibili.size();i++){
   Piatto piattoDaEliminare = piattiDisponibili.get(i);
   for(int j=0;j<this.piattiDisponibili.size();j++){
    Piatto piattoCorrente = this.piattiDisponibili.get(j);
    if(piattoCorrente.getNome().equalsIgnoreCase(piattoDaEliminare.getNome())){
     // i piatti sono uguali posso rimuovere 
         this.piattiDisponibili.remove(j);
        break;
    }
   }
  }
 }
   
 public void aggiuntaOrdine(ArrayList<Ordine> ordiniEffettuati){
 for(int i = 0;i<ordiniEffettuati.size();i++){
   Ordine ordineCorrente= ordiniEffettuati.get(i);
   this.ordiniEffettuati.add(ordineCorrente);
 }   
}

public void rimuoviOrdine(ArrayList<Ordine> ordiniEffettuati){
  for(int i=0;i<ordiniEffettuati.size();i++){
   Ordine ordineDaEliminare = ordiniEffettuati.get(i);
   for(int j=0;j<this.ordiniEffettuati.size();j++){
    Ordine ordineCorrente = this.ordiniEffettuati.get(j);
    if(ordineCorrente.getNumeroIdentificativo()== ordineDaEliminare.getNumeroIdentificativo()){
     // gli ordini sono uguali posso rimuovere 
         this.ordiniEffettuati.remove(j);
        break;
    }
   }
  }
 }   
    
 public Double incassoGiornaliero (){
  Double guadagnoTotale = 0.0;
  for(int i = 0; i<this.ordiniEffettuati.size();i++){
   Ordine ordineCorrente = this.ordiniEffettuati.get(i);
   Double guadagnoParziale = ordineCorrente.getPrezzoTotale();
   guadagnoTotale=guadagnoTotale + guadagnoParziale;
  }
  return guadagnoTotale;
  }   
    
 public Ordine ordineMaggiore (){
  Ordine risultato = this.ordiniEffettuati.get(0);
  Double massimoValore = 0.0;
  for(int i = 0;i<this.ordiniEffettuati.size();i++){
   Ordine ordineCorrente=this.ordiniEffettuati.get(i);
   if(ordineCorrente.getPrezzoTotale()>massimoValore){
    massimoValore=ordineCorrente.getPrezzoTotale();
    risultato = ordineCorrente;
   }
   }
  return risultato;
  }
   public void ordinamentoCrescente(ArrayList<Piatto> piattiDisponibili,String tipo){
    ArrayList<Piatto> copia = new ArrayList<Piatto>();
    for(int i = 0;i<piattiDisponibili.size();i++){
     Piatto piattoCorrente = piattiDisponibili.get(i);
     for(int j = i+1;j<piattiDisponibili.size();j++){
      Piatto piattoDaConfrontare = piattiDisponibili.get(j);
      if(piattoCorrente.getTipo().equalsIgnoreCase(piattoDaConfrontare.getTipo())&&(piattoDaConfrontare.prezzoPiatto()<piattoCorrente.prezzoPiatto())){
       copia.set(j,piattoCorrente);
       copia.set(i,piattoDaConfrontare);
      }
     }
    }   
   }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
