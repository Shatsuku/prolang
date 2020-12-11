class MyClass2 {
    static void f(int i) {
        System.out.println(i);
        if(i>1){
            f(i-1);
        }
        int[] x = new int[1024*5000];
    }
  
    public static void main(String[] args) {
        int i = 998;
        f(i);
    }
  }
