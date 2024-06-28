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
        if(s.charAt(0)!='A'){ //문자열 s의 첫번째 문자가 A가 아니면 거짓을 반환
            return false;
        }
        int count = 0;
        int num = 0;
        for(int i=2;i<s.length()-1;i++){ //문자열의 3번째 글자부터 마지막에서 2번째 글자 사이에 C가 몇개 있는지 검사
            if(s.charAt(i)=='C'){
                count += 1;
                num = i;
            }
        }
        if(count!=1){ //C가 하나도 없거나, 2개 이상이라면 거짓을 반환
            return false;
        }
        for(int i=1;i<s.length();i++){ //첫번째 글자 'A', 하나만 있는 'C'를 제외한 글자들 중 대문자가 있다면 거짓 반환
            if(i!=num&&Character.isUpperCase(s.charAt(i))){
                return false;
            }
        }
        return true; //모든 조건 통과시 참 반환
    }
}
