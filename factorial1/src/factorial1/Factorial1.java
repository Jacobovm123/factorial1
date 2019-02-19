/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial1;

/**
 *
 * @author Jacobo
 */
public class Factorial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         System.out.println(factorial(7));
       System.out.println(factorial(3));
       System.out.println(factorial(35));
    }
    public static  long factorial(int num){
   
        long resultado=1;
   
   
      
          for(int i =1 ; i<=num;i++){
       resultado *= i;
      
          }
       
        return resultado;
        
       
   
   
   
   

}
    
    
    
}
