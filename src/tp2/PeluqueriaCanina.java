package tp2;

import interfaz.GuardarCliente;
import logica.ControladoraCliente;

public class PeluqueriaCanina {

    public static void main(String[] args) {
        //Iniciamos la aplicacion pasandole la controladora a la vista 
        ControladoraCliente controladoraCliente = new ControladoraCliente();
        new GuardarCliente(controladoraCliente).setVisible(true);

    }

}
