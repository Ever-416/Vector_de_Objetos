
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
    String regex= "^(?:(?:(?:0?[1-9]|1\\d|2[0-8])[/](?:0?[1-9]|1[0-2])|(?:29|30)[/](?:0?[13-9]|1[0-2])|31[/](?:0?[13578]|1[02]))[/](?:0{2,3}[1-9]|0{1,2}[1-9]\\d|0?[1-9]\\d{2}|[1-9]\\d{3})|29[/]0?2[/](?:\\d{1,2}(?:0[48]|[2468][048]|[13579][26])|(?:0?[48]|[13579][26]|[2468][048])00))$";
    String reg="^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$";
    Pattern patro = Pattern.compile(reg); 
        Matcher mn = patro.matcher(data);
        boolean valida = mn.find();    
    Pattern patron = Pattern.compile(regex); 
    Matcher m = patron.matcher(data);
        boolean validar = m.find();
        if (valida && validar) {
        return true;    
        }else{
        return false;
        }
    }
//  "^([0-2][0-9]|3[0-1])(\/|-)(0[1-9]|1[0-2])\2(\d{4})$"  
// "^(?:(?:(?:0?[1-9]|1\d|2[0-8])[/](?:0?[1-9]|1[0-2])|(?:29|30)[/](?:0?[13-9]|1[0-2])|31[/](?:0?[13578]|1[02]))[/](?:0{2,3}[1-9]|0{1,2}[1-9]\d|0?[1-9]\d{2}|[1-9]\d{3})|29[/]0?2[/](?:\d{1,2}(?:0[48]|[2468][048]|[13579][26])|(?:0?[48]|[13579][26]|[2468][048])00))$"
}
