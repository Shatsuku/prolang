class obj{
    int value;
    public obj(int i){
        this.value=i;
    }
    static int fun(obj k){
        k.value += 4;
        return 3*k.value-1;
    }
    public static void main(String[] args){
        obj i = new obj(10);
        obj j = new obj(10);
        int sum1, sum2;
        sum1 = (i.value/2) + fun(i);
        sum2 = fun(j) + (j.value/2);
        System.out.println("sum1= "+sum1);
        System.out.println("sum2= "+sum2);
    }
}