package practice;
//print each character of the string

public class string {
    static void printString(String str){
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
    static void main(String[] args) {
        String str1 = "Krrish";
        printString(str1);
    }
}
