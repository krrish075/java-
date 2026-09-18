package practice;
//Count length of the string wihtout length()
public class count {
    static  int strLength(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }

    static void main(String[] args) {
        String str1 = "Krrish";
        System.out.println(strLength(str1));
    }
}