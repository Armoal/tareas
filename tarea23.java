import javax.swing.JOptionPane;
public class tarea23{
    
    public static void main(String [] args) {
        int i,ini,fin;
        String impar = "";
        ini = Integer.parseInt(JOptionPane.showInputDialog("numero inicial: "));
        fin = Integer.parseInt(JOptionPane.showInputDialog("numero final: "));
        
        if (fin < ini){
            JOptionPane.showMessageDialog(null," numeros incorrectos para el ejercicio ");
        }else {
           for ( i = fin; i >= ini; i--) {
        if (i%2 != 0){
        JOptionPane.showMessageDialog(null, i);
        }
        
        
    }
}
}
    
}
