package lista_de_personas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejecutar {
    
    public static void main(String[] args) {
String regex="^(((([0-2][0-9]|30)\\/((0(1|[3-9]))|1[0-2]))|(31\\/(0[1|3|5|7|8]|1[0|2])))\\/([0-9]{4,4}))|([0-2][0-8]\\/02\\/[0-9][0-9]{4,4})|(29\\/02\\/[0-9][0-9]([0|2|4|6|8][0|4|8]|[1|3|5|7|9][2|6]))$";
        Pattern patron = Pattern.compile(regex); 
        Matcher m = patron.matcher("29/02/0000");
        
        if (m.find() || ) {
            
        }
        boolean validar = m.find(); 
        System.out.println(validar);

Controller o = new Controller();  

    }
    
}
