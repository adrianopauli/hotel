package controllers.rf;

import controllers.web.ServidorHotel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
/**
 *
 * @author Adriano
 */
@ManagedBean
@RequestScoped
public class Quarto{
    private Date date = new Date();
    
    public Quarto() {
        
    }
    
    public List<models.Quarto> getQuartos(){
       return new ArrayList<models.Quarto>(ServidorHotel.getInstance().getHotel().consultaQuartosDisponiveis(1254));
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}
