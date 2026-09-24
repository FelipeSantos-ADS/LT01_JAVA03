import javax.swing.JOptionPane;
public class LT01_ESTREP34 {
    public static void main(String args[]){
        int numero, resultado = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        for(int i = 1; i <= 10; i++){
            resultado = (numero * i);
            System.out.println("Tabaduada de " + resultado);
        }
    }
    
}