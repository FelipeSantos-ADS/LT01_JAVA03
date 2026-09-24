import javax.swing.JOptionPane;
public class LT01_ESTREP31 {
    public static void main(String args[]){
        int quadrado;
        for(int i = 10; i <= 150; i++){
             quadrado = (int) Math.pow(i, 2);
            JOptionPane.showMessageDialog(null, "O quadrado dos números de 10 até 150 são: " + quadrado);
        }
    }
    
}