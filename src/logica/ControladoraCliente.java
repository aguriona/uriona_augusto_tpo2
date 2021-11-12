/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;
import persistencia.ControladoraPersistencia;

public class ControladoraCliente {

    //Metodos CRUD que interactuan con el Obj Cliente
    private Cliente cliente;
    private ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void guardarCliente(Cliente cliente) {

        if (controladoraPersistencia.guardarCliente(cliente)) {
            JOptionPane.showMessageDialog(null, "Se guardo el Cliente", "Atencion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el Cliente", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Cliente> listarClientes() {
        return controladoraPersistencia.listarClientes();
    }

    public Cliente buscarCliente(Long id) {
        return controladoraPersistencia.buscarCliente(id);
    }

    public boolean eliminarCliente(Long id) {
        return controladoraPersistencia.eliminarCliente(id);
    }

    public boolean actualizarCLiente(Cliente cliente) {
        return controladoraPersistencia.actualizarCliente(cliente);
    }
}
