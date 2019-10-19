
package lista_de_personas;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Controller {
BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));    

Persona[] classroom = new Persona[5];
JFrame show = new JFrame();
    public Controller() {
    this.loadMenu();
    }
   //Cargar menu   
    public void loadMenu(){
this.optionSelected(Integer.parseInt(JOptionPane.showInputDialog("Escoja una opcion:\n1.Crear Array de personas\n2.Mostrar Array de persona\n3.Salir")));
    } 
   //Ejecutar opciones
    public void optionSelected(int op){
    switch (op){
        case 1:
    {
        try {
            this.createArray();
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    break;
        case 2:
    this.showArray();
    break;
            case 3:
                System.exit(0);
    
    }
    }
    //"Crear" llenar Array
    public void createArray() throws IOException{
        for (int i = 0; i < 5; i++) {
        classroom[i]= new Persona();
        System.out.print("Digite nombre de persona "+i+":              ");
        this.classroom[i].setNombre(leer.readLine());
        System.out.print("Digite apellido de persona "+i+":            ");
        this.classroom[i].setApellido(leer.readLine());
        System.out.print("Digite fecha de nacimiento de persona "+i+": ");
        this.classroom[i].setFecha_nacimiento(leer.readLine());
        System.out.print("Digite identificacion de persona "+i+":      ");
        this.classroom[i].setIdentificacion(leer.readLine());
        System.out.print("Digite genero de persona "+i+":              ");
        this.classroom[i].setGenero(leer.readLine());
        System.out.print("Digite direccion de persona "+i+":           ");
        this.classroom[i].setDireccion(leer.readLine());
        System.out.print("Digite email de persona "+i+":               ");
        this.classroom[i].setEmail(leer.readLine());
        System.out.print("Digite telefono de persona "+i+":            ");
        this.classroom[i].setTelefono(leer.readLine());
        System.out.print("Digite celular de persona "+i+":             ");
        this.classroom[i].setCelular(leer.readLine());  
        System.out.println("\n------------------------------------------------------------------\n");
        }    
        System.out.println("\n\n\n\n\n\n\n");
  /*  JFrame show = new JFrame();
    show.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    show.setSize(950, 400);
    show.setResizable(false);
    show.setLocationRelativeTo(null);
    
    show.show();  */
        this.loadMenu();
    }
    
    
    
    
    
    
    //Mostrar Array
    public void showArray(){
       
    String nombreColumnas[] = {"NOMBRE","APELLIDO","IDENTIFICACION","EDAD","GENERO","DIRECCION","CELULAR","TELEFONO","EMAIL"};
    
    DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);
    
    for (int i = 0; i < 5; i++){
    String datos[] = {classroom[i].getNombre(), classroom[i].getApellido(), classroom[i].getIdentificacion(), String.valueOf(classroom[i].getedad())+" AÑOS", classroom[i].getGenero(), classroom[i].getDireccion(), classroom[i].getCelular(), classroom[i].getTelefono(), classroom[i].getEmail()};    
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
