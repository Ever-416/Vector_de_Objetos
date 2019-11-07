
package lista_de_personas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.table.DefaultTableModel;


public class Controller {
BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));    

ArrayList<Persona>classroom=new ArrayList();
JFrame show = new JFrame();
    public Controller() {
    this.loadMenu();
    }
   //Cargar menu   
    public void loadMenu(){
this.optionSelected(Integer.parseInt(JOptionPane.showInputDialog("Escoja una opcion:\n1.Crear Array de personas\n2.Mostrar Array de persona\n3.Ver Historial de persona\n4.Salir")));
    } 
   //Ejecutar opciones
    public void optionSelected(int op){
    switch (op){
        case 1:
    
        try {
            this.createArray();
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    break;
        case 2:
    this.showArray();
    break;
        case 3:
    {
        try {
            this.menuIMC();
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            break;
            case 4:
                System.exit(0);
    
    }
    }
    
    public void menuIMC() throws IOException{
   int op=Integer.parseInt(JOptionPane.showInputDialog("Que decea hacer:\n1.Registrar Historial IMC\n2.Mostrar Historial IMC"));
    
   String id=JOptionPane.showInputDialog("Por favor digite el numero de identificacion de la persona");
    int i=0, ind=0;
    boolean act=true;
     do {                
         if (classroom.get(i).getIdentificacion()==id) {
         ind=i; 
         act=false;
         }
       i++;    
     } while (act && i<classroom.size()); 
   
     switch (op){
        case 1: 
            System.out.print("Por favor digite el mes en que se realiza la consulta: ");
            String mes=leer.readLine();
            System.out.print("Por favor digite la altura en cm de la persona:        ");
            double altura=Double.parseDouble(leer.readLine());
            System.out.print("Por favor digite el peso de la persona:                ");
            double peso=Double.parseDouble(leer.readLine());
     classroom.get(ind).addHisIMC(mes, altura, peso);
    
    break;
        case 2:
        String nombreColumnas[] = {"MES","ALTURA","PESO","EDAD","MASA CORPORAL","ESTADO"}; 
        DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);
        
       ArrayList<Masa_Corporal>Masa_Corporal=;
        
        for (int i = 0; i < n; i++){
    String datos[] = {classroom.get(i).getNombre(), classroom.get(i).getApellido(), classroom.get(i).getIdentificacion(), String.valueOf(classroom.get(i).getedad())+" AÑOS", classroom.get(i).getGenero(), classroom.get(i).getDireccion(), classroom.get(i).getCelular(), classroom.get(i).getTelefono(), classroom.get(i).getEmail()};    
    modelo.addRow(datos);
    }
        
    }
    }
    
    int i=1;
    int l=0;
    String acu="";
    //"Crear" llenar Array
    public void createArray() throws IOException{
        String n="", a="", fN="", id="", g="", d="", em="", tel="", cel="";
        int i=0, aña=0;
        boolean act=true;
      /*Inicio*/ while (act) {
        i++; aña=0;
        System.out.print("Digite nombre de persona "+i+":              ");
        n=leer.readLine();     
        System.out.print("Digite apellido de persona "+i+":            ");
        a=leer.readLine(); 
        System.out.print("Digite fecha de nacimiento de persona "+i+": ");
        fN=leer.readLine(); 
        System.out.print("Digite identificacion de persona "+i+":      ");
        id=leer.readLine(); 
        System.out.print("Digite genero de persona "+i+":              ");
        g=leer.readLine(); 
        System.out.print("Digite direccion de persona "+i+":           ");
        d=leer.readLine(); 
        System.out.print("Digite email de persona "+i+":               ");
        em=leer.readLine(); 
        System.out.print("Digite telefono de persona "+i+":            ");
        tel=leer.readLine(); 
        System.out.print("Digite celular de persona "+i+":             ");
        cel=leer.readLine();  
        this.classroom.add(new Persona(n, a, fN, id, g, d, em, tel, cel));
        System.out.println("\n------------------------------------------------------------------\n");
        do{
          aña=Integer.parseInt(JOptionPane.showInputDialog("¿Desea añadir otra persona? si(1) / no(2)"));
          if (aña==1) {
              act=true;
          }else if (aña==2){
          act=false;
          }else{
          JOptionPane.showMessageDialog(null, "Opcion no valida");
          }
        }while (aña!=1 && aña!=2);
        } 
        System.out.println("\n\n\n\n\n\n\n"); /*fin */
      
   /*
    show.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    show.setLayout(null);
    show.setSize(800, 400);
    show.setResizable(false);
    show.setLocationRelativeTo(null);
    
    JLabel titulo = new JLabel ("Llenar Vector");
    titulo.setBounds(new Rectangle(6, 6, 116, 35));
    titulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
    titulo.setHorizontalAlignment(4);
    titulo.setVerticalAlignment(3);
    
    JTextArea consola = new JTextArea("Digite nombre de persona 0:                .");
    consola.setBounds(0, 0, 769, 258);
    consola.setFont(new Font("Verdana", Font.PLAIN, 16));
    consola.setEditable(false);
    consola.setMargin(new InsetsUIResource(0, 0, 0, 0));
    JScrollPane SpConsola = new JScrollPane();
    SpConsola.setBounds(6, 59, 775, 264);
    SpConsola.setViewportView(consola);
    
    JButton volver = new JButton("◄ VOLVER");
    volver.setBounds(new Rectangle(690, 10, 90, 25));
    volver.setFont(new Font("Tahoma", Font.BOLD, 11));
    volver.setBackground(new Color(102,153,255));
        
    JButton agregar = new JButton("Siguiente");
    agregar.setBounds(new Rectangle(600, 329, 88, 31));
    agregar.setFont(new Font("Tahoma", Font.BOLD, 11));
    agregar.setBackground(new Color(153,255,153));
    
    JButton dev = new JButton("Anterior");
    dev.setBounds(new Rectangle(693, 329, 87, 31));
    dev.setFont(new Font("Tahoma", Font.BOLD, 11));
    dev.setBackground(new Color(255,102,102));
     
    JTextField capt = new JTextField();
    capt.setBounds(6, 329, 585, 31);
    capt.setFont(new Font("Tahoma", Font.PLAIN, 14));
    capt.setMargin(new InsetsUIResource(0, 0, 0, 0));
    
    show.add(volver);
    show.add(titulo);
    show.add(SpConsola);
    show.add(agregar);
    show.add(dev);
    show.add(capt);
    
    show.show(); 
     
    ActionListener escuchador = new ActionListener(){
        
        
       // String acu="Digite nombre de persona "+l+":               .";
        @Override
        public void actionPerformed(ActionEvent e) {
        acu=consola.getText()+capt.getText()+"\n";    
        consola.setText(acu);
        if(i==0){
       acu=acu+"-------------------------------------------------------------------------\n";    
            }
        String dat[]= {"Digite nombre de persona "+l+":               .",
                       "Digite apellido de persona "+l+":             .",
                       "Digite fecha de nacimiento de persona "+l+":  .",
                       "Digite identificacion de persona "+l+":       .",
                       "Digite genero de persona "+l+":               .",
                       "Digite direccion de persona "+l+":            .",
                       "Digite email de persona "+l+":                .",
                       "Digite telefono de persona "+l+":             .",
                       "Digite celular de persona "+l+":              ."};    
        acu=acu+dat[i];
        consola.setText(acu);
            if (i==8) {          
            i=-1; l++;
            }
            i++; 
            System.out.println(i);
        }
    };
    
    ActionListener escuchado = new ActionListener(){
        //String acu;
        @Override
        public void actionPerformed(ActionEvent e) {
         acu=consola.getText();   
 consola.setText(returnLine(acu));
    if (i==0) {
      i=9;        
          }
 i--;
            System.out.println(i);
        }
    };
    
    agregar.addActionListener(escuchador);
    dev.addActionListener(escuchado);
    
    */
    
    
        this.loadMenu();
    }
    
    private String returnLine(String e){
        String z="";
        int con=e.length();
        int cn=0;
        for (int i = 0; i < 2; i++) {
       while(!z.equals("\n") && con!=0) {
       z=e.substring(con-1,con);
       con--;
        }
       z="";
            if (i==0) {
            cn=con;    
            }
        }
       int f= cn-(con+44);
    return e.substring(0, cn-f);
    }
    
    
    //Mostrar Array
    public void showArray(){
       
    String nombreColumnas[] = {"NOMBRE","APELLIDO","IDENTIFICACION","EDAD","GENERO","DIRECCION","CELULAR","TELEFONO","EMAIL"};
    
    DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);
    
    for (int i = 0; i < classroom.size(); i++){
    String datos[] = {classroom.get(i).getNombre(), classroom.get(i).getApellido(), classroom.get(i).getIdentificacion(), String.valueOf(classroom.get(i).getedad())+" AÑOS", classroom.get(i).getGenero(), classroom.get(i).getDireccion(), classroom.get(i).getCelular(), classroom.get(i).getTelefono(), classroom.get(i).getEmail()};    
    modelo.addRow(datos);
    }    
    
        JScrollPane esc = new JScrollPane();
    JTable tabla = new JTable(modelo);
tabla.setFont(new Font("Tahoma", Font.PLAIN, 10));
    esc.setViewportView(tabla);    
    esc.setBounds(new Rectangle(10,20,1180,200));
        JButton boton = new JButton("VOLVER");
        boton.setBounds(new Rectangle(563,300,100,28));
        
        ActionListener escuchador = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {    
            show.remove(esc);
            show.remove(boton);
            show.hide();
            loadMenu();
        }
    };
        
          boton.addActionListener(escuchador);
  //  JFrame show = new JFrame();
    show.setLayout(null);
    show.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    show.setSize(1200, 400);  //950, 400
    show.setResizable(false);
    show.setLocationRelativeTo(null);
    show.add(esc); 
    show.add(boton); 
    show.show();
    }
    
    
}
