
package Principal;

import javax.swing.JOptionPane;
import model.Veiculo;


public class Principal {

   
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        
        v1.setQuilometros(Integer.parseInt(JOptionPane.showInputDialog("Digite os quilometros percorridos")));
        v1.setLitros(Integer.parseInt(JOptionPane.showInputDialog("Difite os litros consumidos")));
        
        JOptionPane.showMessageDialog(null, "O consumo " +v1.getConsumo() +"km/l");
   
    }
    
}
