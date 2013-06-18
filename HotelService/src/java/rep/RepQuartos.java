package rep;

import java.util.ArrayList;
import java.util.List;
import models.Quarto;

public class RepQuartos {
    
    private List<Quarto> quartos;
    
    private RepQuartos() {
        quartos = new ArrayList<Quarto>();
        adicinaQuartos();
    }
    
    public static RepQuartos getInstance() {
        return RepQuartosHolder.INSTANCE;
    }

    private void adicinaQuartos() {
        Quarto quarto;
        for (int i = 0; i < 10; i++) {
            quarto = new Quarto();
            quarto.setQuartoId(i);
            quarto.setDescricao("Quarto " + i);
            quartos.add(quarto);
        }
    }
    
    private static class RepQuartosHolder {
        private static final RepQuartos INSTANCE = new RepQuartos();
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }   
}
