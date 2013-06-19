package models;

import java.util.Date;

public class Reserva {

    private Cliente cliente;
    private Quarto quarto;
    private Date data;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.cliente != null ? this.cliente.hashCode() : 0);
        hash = 29 * hash + (this.quarto != null ? this.quarto.hashCode() : 0);
        hash = 29 * hash + (this.data != null ? this.data.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reserva other = (Reserva) obj;
        if (this.cliente != other.cliente && (this.cliente == null || !this.cliente.equals(other.cliente))) {
            return false;
        }
        if (this.quarto != other.quarto && (this.quarto == null || !this.quarto.equals(other.quarto))) {
            return false;
        }
        if (this.data != other.data && (this.data == null || !this.data.equals(other.data))) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return cliente.getNome()+" - "+quarto.getDescricao(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
