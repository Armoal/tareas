import javax.swing.JOptionPane;
public class tarea22{
public static void main (String[] args){
    int valor1 ,valor2, i;
    String par=" ";
    valor1= Integer.parseInt(JOptionPane.showInputDialog("dime el numero inicial:"));
     valor2= Integer.parseInt(JOptionPane.showInputDialog("dime el numero final:"));
    
    if(valor1 < valor2){
        for(i=valor1; i<= valor2; i++){
            if (i%2==0)
            par = par +i+"  ";
        }
        JOptionPane.showMessageDialog(null,par);
    }else 
    JOptionPane.showMessageDialog(null,"numero final es menor o igual al inicial");
    
    }
    
}
