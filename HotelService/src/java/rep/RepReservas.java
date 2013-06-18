/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rep;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.crypto.Data;
import models.Reserva;

/**
 *
 * @author Lucas
 */
public class RepReservas {
    
    private List<Reserva> reservas;
    
    private RepReservas() {
        reservas = new ArrayList<Reserva>();
    }
    
    public static RepReservas getInstance() {
        return RepReservasHolder.INSTANCE;
    }
    
    private static class RepReservasHolder {
        private static final RepReservas INSTANCE = new RepReservas();
    }
    
    public void adicionarReserva(Reserva reserva){
        reservas.add(reserva);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
