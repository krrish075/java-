public class NumTrace {
    static void fun1(int n){
        if(n>0){
            System.out.println(n);
            fun1(n-1);
        }
    }
    static  void fun2(int n)
    {
        if(n>0){
            fun2(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int x=3;
        fun1(x);
        System.out.println("function 1 print first and then perform logic and completely opposite for function 2 it perform all operation anf than print ");
        System.out.println("Function 1 is over and function 2 begins from here");
        fun2(x);
    }

}
