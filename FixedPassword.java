
package fixed.password;
import java.util.Scanner;

public class FixedPassword {

    
    public static void main(String[] args) {
        
       


            do{
                 Scanner leer =  new Scanner(System.in);
        
                 int resp=0;
                String resp2 = "";
                
               resp= leer.nextInt();
            
            if(resp != 2002){
                 
               System.out.println("Senha invalida");
               resp2 = "no";
            }
            else{
            
               System.out.println("Acesso Permitido");
               resp2 = "si";
            }
            
            
            }while(resp ==2002);
    }

}
