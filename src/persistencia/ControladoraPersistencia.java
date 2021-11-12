/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Augusto
 */
public class ControladoraPersistencia {

    ClienteJpaController clienteJpaController = new ClienteJpaController();

    public boolean guardarCliente(Cliente cliente) {
         
      try {
           clienteJpaController.create(cliente);
        } catch (Exception e) {
            System.err.println("No se pudo guardar");
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }

    public List<Cliente> listarClientes() {

        return clienteJpaController.findClienteEntities();
    }

    public boolean eliminarCliente(Long id) {
        try {
            clienteJpaController.destroy(id);
        } catch (Exception e) {
            System.err.println("No se pudo eliminar");
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }

    public Cliente buscarCliente(Long id) {
        Cliente cli = new Cliente();
        try {
            cli = clienteJpaController.findCliente(id);
        } catch (Exception e) {
            System.err.println("error al buscar");
        }
        return cli;
    }

    public boolean actualizarCliente(Cliente cliente) {
        try {
            clienteJpaController.edit(cliente);
        } catch (Exception e) {
            System.err.println("No se pudo actualizar");
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }
}
