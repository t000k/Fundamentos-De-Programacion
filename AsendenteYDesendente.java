
package asendente.y.desendente;

import java.util.Scanner;

public class AsendenteYDesendente {
    
    public static void main(String[] args) {
      
        nums obj1 = new nums();
        obj1.evaluarNums();
    }
    
}

class nums{

public void evaluarNums(){
    
   int X,Y;
        Scanner sc = new Scanner(System.in);
        
            do{
            
                X = sc.nextInt();
                Y = sc.nextInt();
              
                 if(X>Y){
        System.out.printf("Decrescente%n");
    
    }else if (X==Y){
//        System.out.printf("Crescente%n");
    }else{
    System.out.printf("Crescente%n");
    }
            
            }while(X != Y);
}


}