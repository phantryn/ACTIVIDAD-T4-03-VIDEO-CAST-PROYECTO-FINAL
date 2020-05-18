package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
// ventana hereda de JFrame la cual es una clase
public class Ventana extends JFrame{
    private JTextField cajaTexto;
    private JLabel saludo;
    private JTextArea areaTexto;
    public JPanel panel;//instanciamos el JPanel
    private JButton boton3;
    private int accion =0;
    //public ventana es el constructor
    public Ventana(){
        //set es estableser y size es el tamaño
        this.setSize(750,650); //estableser el tamaño de la ventana
        
            setTitle("Ventana - El pollo sabroso 2.0");//colocamos el titulo de la venta
            //setLocation(100,200);//establesemos la pocicion de la ventana
            //setBounds(100,200,500,500);// establese los metodos de setTitle y setLocation
            setLocationRelativeTo(null);// establesemos la posicion de la ventana en el centro
            
            setResizable(false);//establesemos si la ventana puede cambiar de tamaño o no
            //setMinimumSize(new Dimension(200,200));//establesemos el tamaño minimo
            
            //this.getContentPane().setBackground(Color.BLACK);//ESTABLESER EL COLOR DE LA VENTANA
            
            
           IniciarComponente();// llamamos al metodo
            setDefaultCloseOperation(EXIT_ON_CLOSE);// EXIT ON CLOSE ES PARA DEJAR DE EJECUTAr el programa
            
    
    }
    private void IniciarComponente(){
       colocarPanel();
        colocarBotones();//instanciar metodo de botones
      colocarEtiqueta();//instanciar el metodo etiqueta
       colocarCajasTexto();
       colocarAreaTexto();
       colocarListaDesplegable();//instanciar metodo de JComboBox : lista desplegable
        //colocarRadioBotones();
        
       
    }
    private void colocarPanel(){
          panel = new JPanel();//creacion de un panel
        panel.setBackground(Color.YELLOW);//ESTABLESEMOS EL COLOR DEL PANEL(ES COMO UNA HOJA DE PAPEL EL PANEL)
        panel.setLayout(null); //desactivar el diseño De panel
        this.getContentPane().add(panel);//agregamos ventana
    }
    private void colocarEtiqueta(){
        
        //etiqueta 1 de texto
        JLabel etiqueta= new JLabel();//CREAMOS UNA etiqueta
        etiqueta.setText("EL POLLO SABROSO");//estableser el texto de la etiqueta
        etiqueta.setBounds(0, 0, 750, 55);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//ESTABLESEMOS EL NOMBRE DE LA ETIQUETA EN EL CENTRO
        etiqueta.setForeground(Color.YELLOW);//establesemos el color de la letra
        etiqueta.setOpaque(true);//damos permiso para pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.RED);//DAMOS EL COLOR DE LA ETIQUETA etiqueta.setFont(new Font("Gill Sans Ultra Bold",1,30));//establesemos la fuente de texto de la etiqueta
        etiqueta.setFont(new Font("Bodoni MT Black",3,30));//establesemos la fuente de texto de la etiqueta
        panel.add(etiqueta);//agregamos la etiqueta al panel
                  
        //etiqueta2 tipo imajen
        ImageIcon imagen = new ImageIcon("pollo23.png");
         JLabel etiqueta2= new JLabel();
         etiqueta2.setBounds(530,350,200,250);
         etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
         panel.add(etiqueta2);
                
               /*  JLabel etiqueta3= new JLabel();//CREAMOS UNA etiqueta
        etiqueta3.setText("");//estableser el texto de la etiqueta
        etiqueta3.setBounds(0, 0, 750, 650);
        etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);//ESTABLESEMOS EL NOMBRE DE LA ETIQUETA EN EL CENTRO
        etiqueta3.setForeground(Color.YELLOW);//establesemos el color de la letra
        etiqueta3.setOpaque(true);//damos permiso para pintar el fondo de la etiqueta
        etiqueta3.setBackground(Color.YELLOW);//DAMOS EL COLOR DE LA ETIQUETA
        etiqueta3.setFont(new Font("Arial",1,30));//establesemos la fuente de texto de la etiqueta
                panel.add(etiqueta3);//agregamos la etiqueta al panel*/
    }
    
    
    private void colocarBotones(){
       
        //setLayout(null);
        //boto1= boton de texto
        JButton boton1=new JButton();
        boton1.setText("Pedido\n"); //establesemos el texto del boton
        boton1.setBounds(20,60,149,35);
        boton1.setEnabled(true);//establesemos el encendido del boton
        boton1.setMnemonic('a');//establesemos alt + a
        boton1.setForeground(Color.black);//establesemos el color de la letra
        boton1.setFont(new Font("Bodoni MT Black",3,19));//establesemos la fuete de letra
        //boton1.setBackground(Color.LIGHT_GRAY);//ESTABLESEMOS EL COLOR DE FONDE DEL BOTON
     
      
        panel.add(boton1);//agregamos al panel
        //saludo = new JLabel();
         //saludo.setForeground(Color.YELLOW);//establesemos el color de la letra
          //saludo.setBackground(Color.RED);//DAMOS EL COLOR DE LA ETIQUETA
        /*saludo.setBounds(50,250,500,40);
        saludo.setFont(new Font("arial",3,20));
        panel.add(saludo);*/
        areaTexto=new JTextArea();
    areaTexto.setText("aca te dira el pedido. ingresalo");//estableser un texto predeterminadoç
    areaTexto.append("\nen la parte de arriba ");//estableser otro texto en el area 
     areaTexto.append("\n de clik en el boton pedido ");//estableser otro texto en el area 
    areaTexto.setForeground(Color.BLACK);//establesemos el color de la letra
      areaTexto.setFont(new Font("Bodoni MT Black",3,16));//establesemos la fuete de letra
    areaTexto.setBackground(Color.WHITE);//DAMOS EL COLOR DE LA ETIQUETA etiqueta.setFont(new Font("Gill Sans Ultra Bold",1,30));//establesemos la fuente de texto de la etiqueta
    areaTexto.setBounds(50,250, 300,250);//area donde se colocara el area de texto
    areaTexto.setEditable(true);//das permiso si quieres que el tecto sea editable(false)
    panel.add(areaTexto);//hacer visible el area de texto en el panel
          
//agregar evento  de tipo ActionListener
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  areaTexto.setForeground(Color.WHITE);//establesemos el color de la letra
          areaTexto.setFont(new Font("Bodoni MT Black",3,20));//establesemos la fuete de letra
         areaTexto.setBackground(Color.WHITE);//DAMOS EL COLOR DE LA ETIQUETA etiqueta.setFont(new Font("Gill Sans Ultra Bold",1,30));//establesemos la fuente de texto de la etiqueta
                areaTexto.setText("tu pedido es   "+cajaTexto.getText());
            }
        };
        
        boton1.addActionListener(oyenteDeAccion);
        //boton.addActionListener(oyenteDeAccion);
                   
       
                //EGUNDO BOTON
        boton3=new JButton("Anuncio");
        //boton3.setText("Anuncio"); //establesemos el texto del boton
        boton3.setBounds(180,60,149,35);
       
        boton3.setEnabled(true);//establesemos el encendido del boton
        boton3.setMnemonic('D');//establesemos alt + a
        boton3.setForeground(Color.black);//establesemos el color de la letra
        boton3.setFont(new Font("Bodoni MT Black",3,19));//establesemos la fuete de letra
        boton3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               acciones(1);
            }
        });
        
        panel.add(boton3);
         //boton3.setBackground(Color.BLUE);//ESTABLESEMOS EL COLOR DE FONDO DEL BOTON
        
         
        //boton redes sociales
        JButton boton2=new JButton();
         boton2.setText("Redes Sociales"); //establesemos el texto del boton
         
        boton2.setBounds(350,60, 165,35);//posicion del boton
        boton2.setOpaque(true);
        boton2.setFont(new Font("Bodoni MT Black",3,16));//establesemos la fuete de letra
        //ImageIcon clicAqui = new ImageIcon("clic2.jfif");
        boton2.setMnemonic('b');//establesemos alt + a
        //boton2.setIcon(new ImageIcon(clicAqui.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
        //boton2.setBackground(Color.BLUE);//ESTABLESEMOS EL COLOR DE FONDE DEL BOTON
         boton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               acciones(2);
            }
        });
        
        
        panel.add(boton2);
        
        
    }
    	private void acciones(int accion){
		//JOptionPane.showMessageDialog(this,"Boton alumno");
            this.accion = accion;
		new VentanaSecundaria(this,true);
	}
       
       
    //creasion de radio botones
   /*private void colocarRadioBotones(){
        JRadioButton radioBoton1= new JRadioButton("Opcion 1",false);
        radioBoton1.setBounds(50,100,200,50);//tamalo de la etiqueta de radio boton 1
       // radioBoton1.setEnabled(true);
       // radioBoton1.setText("Programacion");
       // radioBoton1.setFont(new Font("Cooper Black",0,20));
        panel.add(radioBoton1);//mandamos a pegar el boton uno en el panel
        
        JRadioButton radioBoton2= new JRadioButton("Opcion 2",false);
        radioBoton2.setBounds(50,150,200,50);//tamalo de la etiqueta de radio boton 1
        panel.add(radioBoton2);//mandamos a pegar el boton uno en el panel
        
        JRadioButton radioBoton3= new JRadioButton("Opcion 3",false);
        radioBoton3.setBounds(50,200,200,50);//tamalo de la etiqueta de radio boton 1
        panel.add(radioBoton3);//mandamos a pegar el boton uno en el panel
        
       /* ButtonGroup grupoRadioBotones= new ButtonGroup(){
        grupoRadioBotones.add(radioBoton1);    
         grupoRadioBotones.add(radioBoton2);  
          grupoRadioBotones.add(radioBoton3);  
        }
    }*/
                                                //will
    private void colocarCajasTexto(){
        cajaTexto=new JTextField();
        cajaTexto.setBounds(50,180,300,60);
        cajaTexto.setForeground(Color.BLACK);//establesemos el color de la letra
          cajaTexto.setFont(new Font("Bodoni MT Black",6,16));//establesemos la fuete de letra
         cajaTexto.setBackground(Color.WHITE);//DAMOS EL COLOR DE LA ETIQUETA etiqueta.setFont(new Font("Gill Sans Ultra Bold",1,30));//establesemos la fuente de texto de la etiqueta
        cajaTexto.setText(" \n");
        
        //System.out.println("texto en caja:  "+cajaTexto.getText());
        panel.add(cajaTexto);
    }
    public void colocarAreaTexto(){
        //como colocar area de texto en el panel
    areaTexto=new JTextArea();
    areaTexto.setText("hola pollo sabroso...");//estableser un texto predeterminadoç
    areaTexto.append("\n Escriba otro texto aqui");//estableser otro texto en el area 
    areaTexto.setBounds(50,250, 300,250);//area donde se colocara el area de texto
    areaTexto.setEditable(true);//das permiso si quieres que el tecto sea editable(false)
    panel.add(areaTexto);//hacer visible el area de texto en el panel
    }
    public void colocarListaDesplegable(){
        String []comida={"Pollo Asado","Pollo Frito","Bebidas"};
    JComboBox listaDesplegable = new JComboBox(comida);
     listaDesplegable.setBounds(580,60,150,40);//estableser la pocision de la lista
    // listaDesplegable.setForeground(Color.GREEN);//establesemos el color de la letra
        listaDesplegable.setFont(new Font("Bodoni MT Black",3,16));//establesemos la fuete de letra
    listaDesplegable.addItem("Chatarra");//agregar un nuevo producto a la lista desplegable
     // listaDesplegable.setBackground(Color.BLUE);//ESTABLESEMOS EL COLOR DE FONDO DE la lista
    listaDesplegable.setSelectedItem("Pollo Frito");//estableser el producto en la primera fila
    panel.add(listaDesplegable);
    
    }
}
