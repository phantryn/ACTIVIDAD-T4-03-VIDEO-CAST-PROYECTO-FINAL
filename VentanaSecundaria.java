package Ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
//eredamos la clase JDialog 
public class VentanaSecundaria extends JFrame{
		private Ventana v;
                 private JLabel lblNombre;
	public VentanaSecundaria(Ventana v, boolean b){
            		
		
		        this.v= v;
			setSize(750,530);
                        setTitle("VentanaSecundaria anuncio");//colocamos el titulo de la venta
                        setLocation(308,160);//establesemos la pocicion de la ventana
                         setResizable(false);//establesemos si la ventana puede cambiar de tamaño o no
			//setLocationRelativeTo(v);//esta linea es para estableser la ventana en el centro
                        setVisible(true);
                        //componentes();
                         //colocarCajasTexto();
                         colocarEtiqueta();
               // setDefaultCloseOperation(EXIT_ON_CLOSE);// EXIT ON CLOSE ES PARA DEJAR DE EJECUTAr el programa
	}

    private VentanaSecundaria(VentanaSecundaria v, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         /*      private void componentes(){
		setLayout(null);
		
		lblNombre = new JLabel("Nombrecccccccccccccccccccccccccccccccccccccccccccccccccccc:\n erne");
		lblNombre.setBounds(0,0,110,100);
                add(lblNombre);
}
                private void colocarCajasTexto(){
                    JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(70,50,380,160);
        cajaTexto.setForeground(Color.WHITE);//establesemos el color de la letra
          cajaTexto.setFont(new Font("Times New Roman",3,20));//establesemos la fuete de letra
         cajaTexto.setBackground(Color.DARK_GRAY);//DAMOS EL COLOR DE LA ETIQUETA etiqueta.setFont(new Font("Gill Sans Ultra Bold",1,30));//establesemos la fuente de texto de la etiqueta
        cajaTexto.setText(" \n");
        
        //System.out.println("texto en caja:  "+cajaTexto.getText());
        add(cajaTexto);
    }*/
                  private void colocarEtiqueta(){
                   ImageIcon imagen = new ImageIcon("Anuncio12.jpg");
         JLabel etiqueta2= new JLabel();
         etiqueta2.setBounds(0,0,750,500);
         etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
         add(etiqueta2);
                  }
}