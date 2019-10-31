
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
        if (!data.equals("")) {
            
        }
    return true;    
    }

}
