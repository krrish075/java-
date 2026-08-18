public class NumTrace {
    static void fun1(int n){
        if(n>0){
            System.out.println(n);
            fun1(n-1);
        }
    }
    public static void main(String[] args) {
        int x=3;
        fun1(x);
    }
}
