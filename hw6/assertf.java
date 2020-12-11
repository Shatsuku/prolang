public class assertf {

    public static float Divide(int divided, int divisor){
        assert divisor !=0 : " Divisor = 0";
        return (divided/divisor);
    }
    public static void main(String[] args) {
        int val = 1; 
        System.out.println("value is "+val); 
        assert val != 2 : " Value should not be 2."; 
        System.out.println("Divide : "+Divide(50,0));
        System.out.println("after assert false"); 
    }
}
