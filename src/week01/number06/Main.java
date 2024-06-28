package week01.number06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(isTrue(s)){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }
    }
    public static boolean isTrue(String s){
        if(s.charAt(0)!='A'){
            return false;
        }
        int count = 0;
        int num = 0;
        for(int i=2;i<s.length()-1;i++){
            if(s.charAt(i)=='C'){
                count += 1;
                num = i;
            }
        }
        if(count!=1){
            return false;
        }
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!='A'&&s.charAt(i)!='C'&&Character.isUpperCase(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
