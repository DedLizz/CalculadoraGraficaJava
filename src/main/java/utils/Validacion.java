
package utils;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author brandon
 */
public class Validacion {
    
    //Metodo para aplicar la validacion a un jTexField
    public static void validadorSoloNumeros(javax.swing.JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                // si el caracter no es un digito (numero), se cancela la accion
                if(!Character.isDigit(c)) {
                    evt.consume(); // no permite el ingreso de la tecla
                }
            }
        });
    }
    
}
