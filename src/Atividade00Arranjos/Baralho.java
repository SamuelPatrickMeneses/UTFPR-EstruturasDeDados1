import java.util.*;
public class Baralho{
    private final String[] nomes = {"Az","2","3","4","5","6","7","8","9","10","Valete","Damas","Rei","Coringa"};
    private final String[] nipes = {"Copas","Ouro","Paus","Espadas"};
    private Carta[] cartas;

    public Baralho() {
        cartas = new Carta[56];
        for(int i = 0;i < nipes.length;i++)
            for(int j = 0;j < nomes.length;j++)
                cartas[i > 0? (i * nomes.length ) + j:j] = 
                new Carta(nomes[j], nipes[i]);
    }
    public void embaralha(){
        for(int i = 0;i < cartas.length;i++){
            troca(rand(),rand());
        }
    }
    private void troca(int a,int b){
        Carta ca, cb;
        ca = cartas[a];
        cb = cartas[b];
        cartas[a] = cb;
        cartas[b] = ca;
       
    }
    private int rand(){
        return (int)(Math.random() * 56); 
    }
    @Override
    public String toString(){
        String out = "";
        for(Carta c:cartas){
            if(c == null)
                continue;
            out = out.concat(c.toString()); 
        }
        return out;
    }
    public Carta daCarta(){
        for(Carta c: cartas){
            if(c == null)
                continue;
            return c;
        }
        return null;
    }
    public boolean temCarta(){
        for(Carta c:cartas)
            if(c != null)
                return false;
        return true;
    }
    public void imprimebaralho(){
        System.out.print(toString());
    }
    
}