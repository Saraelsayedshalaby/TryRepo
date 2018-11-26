/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryrepo;

/**
 *
 * @author ESCA
 */
public class Functions {
    public static void isEven(int num){
    /* If number is divisible by 2 then it's an even number
     * else odd number*/
    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
    }
    public static void isOdd(int num){}
    public static void isPrime(int num){
        int numberofdevisors=0;
        for(int i=1;i<num;++i){
            if(num%i==0)
                numberofdevisors++;
        }
        if(numberofdevisors>2 || num==1)
            System.out.println("its not prime");
        else
           System.out.println("its prime"); 
            
    }
}
