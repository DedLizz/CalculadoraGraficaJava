
package logic;


public class Operaciones {
    
    public static double suma(double a, double b) {
        return a+b;
    }
    
    public static double resta(double a, double b) {
        return a-b;
    }
    
    public static double porcentaje(double a, double b) {
        if (b<0 || b>100) {
            throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 100.");
        }
        return (a*b)/100;
    }
    
    public static double multipliacion(double a, double b) {
        return a*b;
    }
    
    public static double division(double a, double b) {
        if (b != 0 ){
            return a/b;
        }else{
            throw new IllegalArgumentException("El calculo es imposible");
        }
    }
    
    public static double raiz(double a, double b) {
        if (a < 0 && b % 2 == 0) {
            // Si el número es negativo y la raíz es par (no se puede calcular la raíz real)
            throw new IllegalArgumentException("No se puede calcular la raíz par de un número negativo.");
        }

        return Math.pow(a, 1.0 / b);
    }
    
}
