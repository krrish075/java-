public class TAIL {
    static void fun1(int x){
        if (x>0){
            System.out.println(x);
            fun1(x-1);
        }
    }
    public static void main(String[] args) {
        int x = 5;
        fun1(x);
    }
}
