import java.util.*;
public class Baralho{
    private final String[] nomes = {"Az","2","3","4","5","6","7","8","9","10","Valete","Damas","Rei","Coringa"};
    private final String[] nipes = {"Copas","Ouro","Paus","Espadas"};
    private Cartas[] cartas;

    public Baralho() {
        cartas = new Cartas[];
        for(int i = 0;i < nipes.length;i++)
            for(int j = 0;j < nomes.length;j++)
                cartas[((j-1)*nomes.length)];
    }
    
}