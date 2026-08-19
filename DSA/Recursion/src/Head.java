public class Head {
    static void fun1(int x){
       if(x>0){
           fun1(x-1);
           System.out.println(x);
       }
    }

    public static void main(String[] args) {
        int x = 5;
        fun1(x);
    }
}
