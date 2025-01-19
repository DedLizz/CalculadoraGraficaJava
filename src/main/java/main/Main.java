/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import javax.swing.JFrame;
import javax.swing.Timer;
import ui.CalculadoraGUI;
import ui.PanelCalculadora;

/**
 *
 * @author brandon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear una instacia para la interfaz grafica de la calculadora
        CalculadoraGUI ventanaCarga = new CalculadoraGUI();
        
        // hacer visible la interfaz
        ventanaCarga.setLocationRelativeTo(null);
        ventanaCarga.setResizable(false);  // Desactiva la posibilidad de redimensionar la ventana
        ventanaCarga.setVisible(true);
        
        //crear un temporizador para separar 5 segundos (5000 milisegundos)
        Timer timer = new Timer(5000, e -> {
            //cerrar la ventana de carga 
            ventanaCarga.dispose();
            
        PanelCalculadora panelCalculadora = new PanelCalculadora();  // Instancia el PanelCalculadora (el panel donde están los botones y el display)
        JFrame ventanaCalculadora = new JFrame("Calculators");  // Crea un nuevo JFrame para la calculadora
        ventanaCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Asegura que la aplicación se cierre al cerrar la ventana
        ventanaCalculadora.add(panelCalculadora);  // Agrega el PanelCalculadora al JFrame
        ventanaCalculadora.pack();  // Ajusta el tamaño del JFrame para que se ajuste al tamaño del panel
        ventanaCalculadora.setLocationRelativeTo(null);  // Centra el JFrame en la pantalla
        ventanaCalculadora.setResizable(false);  // Desactiva la posibilidad de redimensionar la ventana
        ventanaCalculadora.setVisible(true);  // Muestra la ventana
        });
        
        //iniciar temporizador 
        timer.setRepeats(false);
        timer.start();
        
    }
    
}
