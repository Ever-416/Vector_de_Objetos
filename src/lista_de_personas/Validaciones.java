
package lista_de_personas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validaciones {
    
    public static boolean isEmail(String email){
    String regex= "^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$";
        Pattern patron = Pattern.compile(regex); 
        Matcher m = patron.matcher(email);
        boolean validar = m.find();
    return validar;
    }
    
    public static boolean isCelular(String cel){
    String regex= "^3[0-9]{9,9}$";
        Pattern patron = Pattern.compile(regex); 
        Matcher m = patron.matcher(cel);
        boolean validar = m.find();
    return validar;
    }
    
    public static boolean isTelefono(String tel){
    String regex= "^3[0-9]{6,6}$";
        Pattern patron = Pattern.compile(regex); 
        Matcher m = patron.matcher(tel);
        boolean validar = m.find();
    return validar;
    }
    
    public static boolean isValid_date(String data){
        String regex="^(((([0-2][0-9]|30)\\/((0(1|[3-9]))|1[0-2]))|(31\\/(0[1|3|5|7|8]|1[0|2])))\\/([0-9]{4,4}))|([0-2][0-8]\\/02\\/[0-9][0-9]{4,4})|(29\\/02\\/[0-9][0-9]([0|2|4|6|8][0|4|8]|[1|3|5|7|9][2|6]))$";
        Pattern patron = Pattern.compile(regex); 
        Matcher m = patron.matcher("29/02/0000");
        boolean validar = m.find(); 
        
        if (m.find()) {
            
        }
        
        return validar;   
    }

}
