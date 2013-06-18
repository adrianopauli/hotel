/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rep;

import java.util.ArrayList;
import java.util.List;
import models.Cliente;

/**
 *
 * @author Lucas
 */
public class RepClientes {
    
    private List<Cliente> clientes;
    
    private RepClientes() {
        clientes = new ArrayList<Cliente>();
    }
    
    public static RepClientes getInstance() {
        return RepClientesHolder.INSTANCE;
    }
    
    private static class RepClientesHolder {
        private static final RepClientes INSTANCE = new RepClientes();
    }
    
    public void adicionaCliente(Cliente c){
        clientes.add(c);
        System.out.println(c.getNome() + " Cadastrado.");
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
