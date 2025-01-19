package utils;

import javax.swing.JFrame;
import ui.TecladoCalculadora;

/**
 *
 * @author brandon
 */
public class Paneles {
    
    // Variable estática para mantener la referencia al JFrame del teclado
    private static JFrame tecladoFrame = null;
    
    public static void teclaNumerica(boolean a){
        if (a) {
            // Si el JFrame no está creado, lo creamos
            if (tecladoFrame == null) {
                // Crear el panel del teclado numérico
                TecladoCalculadora panelTeclado = new TecladoCalculadora();
                
                // Crear un nuevo JFrame para el teclado
                tecladoFrame = new JFrame("Teclado Numérico");
                tecladoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Cierra solo el JFrame del teclado
                tecladoFrame.add(panelTeclado);  // Agregar el panel de teclas al JFrame
                tecladoFrame.pack();  // Ajustar el tamaño del JFrame
                tecladoFrame.setLocationRelativeTo(null);  // Centra el JFrame en la pantalla
                tecladoFrame.setResizable(false);  // Desactiva la posibilidad de redimensionar la ventana
                tecladoFrame.setVisible(true);  // Mostrar el JFrame con el teclado
            }
        } else {
            // Si el RadioButton se desactiva, cerramos el JFrame
            if (tecladoFrame != null) {
                tecladoFrame.dispose();  // Cierra el JFrame
                tecladoFrame = null;  // Limpiamos la referencia
            }
        }
    }
    
}
