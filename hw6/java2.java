class obj{
        int x;
        obj(int i){
            this.x=i;
        }   
}
public class java2 {
    public static Integer fun(obj k){
        k.x+=4;
        return 3*k.x-1;
    }

    public static void main(String[] args){
        obj i = new obj(10);
        obj j = new obj(10);

        int sum1 = (i.x/2) + fun(i);
        int sum2 = fun(j) + (j.x/2);
        System.out.println("sum1= "+sum1);
        System.out.println("sum2= "+sum2);
    }
}
