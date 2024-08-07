
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double div =0;
        
        for(int i = 0; i < n; i++)
        {
            double x1 = sc.nextInt();
            double x2 = sc.nextInt();
            if ( x2 == 0){
                System.out.printf("divisao impossivel /n");
            }else{
                div = x1 / x2;
                System.out.println("Div: "+ div);
            }
            


            
        }
    
   //System.out.println("Div: "+ div);
    
    sc.close();
  }
}