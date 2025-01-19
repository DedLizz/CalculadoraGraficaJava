package utils;

import javax.swing.JTextField;

/**
 *
 * @author brandon
 */
public class ComunicadorTeclado {
    
    // Referencia estatica al JTextField de PanelCalcualdora
    private static JTextField textField;
    
    //Metodo para registrar el JTexField
    public static void registrarTextField(JTextField textField) {
        ComunicadorTeclado.textField = textField;
    }

    
    //Metodo para agregar texto al JTextField
    public static void agregarTexto(String texto){
        if (textField != null){
            textField.setText(textField.getText() + texto);
        }
    }
    
}
