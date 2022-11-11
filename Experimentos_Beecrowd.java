
package experimentos_beecrowd;

import java.util.Scanner;


public class Experimentos_Beecrowd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N= sc.nextInt();
        experimentos obj1 = new experimentos(N);
        obj1.calcularAnimales(sc);
        obj1.Resultados();

    }
    
}
class experimentos{
 int N=0;
String caracter;
int C=0;
int R=0;
int S=0;



    public experimentos(int N){
        this.N= N;
    
    }
    
    
public void calcularAnimales(Scanner sc){
    
    for (int i = 1; i <=N; i++) {
            int monto;
            monto =0;
            monto = sc.nextInt();
            caracter = sc.next();
        
            if(caracter.equals("C")){
                C +=monto;
            
            }
            else if(caracter.equals("R")){
                R +=monto;
            
            }
            else if(caracter.equals("S")){
                S +=monto;
            
            }
           
        }
  
   
} //fin clase 

public int totalAnimales(){
int total =0;
total = C+R+S;
return total;
}

public float porcentajeConejos(){
float porcentaje=0;
porcentaje =(float) (C*100)/totalAnimales();
return porcentaje;
}
public float porcentajeRatas(){
float porcentaje=0;
porcentaje =(float) (R*100)/totalAnimales();
return porcentaje;
}
public float porcentajeSapos(){
float porcentaje=0;
porcentaje =(float) (S*100)/totalAnimales();
return porcentaje;
}

public void Resultados(){

System.out.printf("Total: %d cobaias%n",totalAnimales());
System.out.printf("Total de coelhos: %d%nTotal de ratos: %d%nTotal de sapos: %d%n",C,R,S);
System.out.printf("Percentual de coelhos: %.2f %%%nPercentual de ratos: %.2f %%%nPercentual de sapos: %.2f %%%n", porcentajeConejos(), porcentajeRatas(), porcentajeSapos());

}

}