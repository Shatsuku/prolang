import java.io.IOException;

public class expt{
    static int value = 0;
    public static void f1(int i){
        try{
            System.out.println("i : "+i);
            i=i/value;
        }catch(ArithmeticException e){
            System.out.println("f1() Arithmetic exept");
            throw new ArithmeticException(); // throw to main
        }catch(Exception e){
            System.out.println("f1() catch");
        }
    }
    public static void main(String[] args){
        
        try{
            f1(30);
        }catch(Exception e){
            System.out.println("Something went wrong in f1()");
        }
        finally{
            System.out.println("try catch is finished");
        }
    }

}