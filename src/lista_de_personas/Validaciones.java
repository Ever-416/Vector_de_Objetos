
package lista_de_personas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
    
    public static boolean isSexo(String gn){
        boolean retu=false;
        if (gn.equalsIgnoreCase("masculino") || gn.equalsIgnoreCase("femenino")) {
        retu=true;    
        }
        return retu;
    }
    
    public static boolean isID(String id){
    String regex= "^([0-9]{8,12})$";
        Pattern patron = Pattern.compile(regex); 
        Matcher m = patron.matcher(id);
        boolean validar = m.find();
    return validar;
    }
    
    public static boolean isMonth(String mes){
    boolean retu=false;
        switch (mes.toLowerCase()){
            case "enero":
            case "febrero":
            case "marzo":    
            case "abril":
            case "mayo":
            case "junio":   
            case "julio":    
            case "agosto":
            case "septiembre": 
            case "octubre":
            case "noviembre":
            case "diciembre":    
             retu=true;   
        break;            
                }
        return retu;
    }
    
    public static boolean isValid_date(String data){
        String regex="^(((([0-2][0-9]|30)\\/((0(1|[3-9]))|1[0-2]))|(31\\/(0[1|3|5|7|8]|1[0|2]))|((([0|1][0-9])|(2[0-8]))\\/02))\\/([0-9]{4,4}))|([0-2][0-8]\\/02\\/[0-9][0-9]{4,4})|(29\\/02\\/[0-9][0-9]([0|2|4|6|8][0|4|8]|[1|3|5|7|9][2|6]))$";
        String fecha= data;
        Pattern patron = Pattern.compile(regex); 
        Matcher m = patron.matcher(fecha);
        boolean asd=false;
        boolean validar = m.find();
        if (validar) {
            if (!fecha.substring(6).equals("0000")) {
            asd=true;
            }
        }
        return asd;   
    }
    
   public static boolean rangoData(String data, String after, String before){
       boolean retur=false;
       if (isValid_date(data) && isValid_date(after) && isValid_date(before)) {
       DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate fn = LocalDate.parse(data, fmt);
       LocalDate fnaf = LocalDate.parse(after, fmt).plusDays(-1);
       LocalDate fnbe = LocalDate.parse(before, fmt).plusDays(1);
       Date fecha= new Date(fn.getYear(), fn.getMonthValue(), fn.getDayOfMonth());
       Date fchaf= new Date(fnaf.getYear(), fnaf.getMonthValue(), fnaf.getDayOfMonth());
       Date fchbe= new Date(fnbe.getYear(), fnbe.getMonthValue(), fnbe.getDayOfMonth());
           if (fecha.after(fchaf) && fecha.before(fchbe)) {
            retur=true;   
           }
       }     
        return retur;
   } 

   public static boolean isDouble(String num){
   boolean retu=false;
        try {
        Double.parseDouble(num);
        retu=true;
        } catch (Exception e) {
        }
        return retu;
   }
   
}
