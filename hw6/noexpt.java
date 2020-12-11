import java.io.IOException;

public class noexpt{
    static int value = 0;
    public static void f1(int i){
            System.out.println("i : "+i);
            i=i/value;
    }
    public static void main(String[] args){ 
            f1(30);
    }
}