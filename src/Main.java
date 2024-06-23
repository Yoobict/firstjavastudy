import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class practiceTest {
    public String number01() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        return (a*b)%2==0?"Even":"Odd"; //a와 b의 곱셈값을 짝수인지 홀수인지 구분한뒤 리턴
    }

    public int number02() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int count = 0;
        for(char c : n.toCharArray()){
            if(c=='1'){
                count++;
            }
        }
        return count;
    }

    public int number03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int mincount = Integer.MAX_VALUE;
        for(int i : arr){
            int count = 0;
            while(i%2==0){
                i/=2;
                count ++;
            }
            mincount = Math.min(mincount, count);
        }

        return mincount;
    }

    public int number04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()); //500원 갯수
        int b = Integer.parseInt(br.readLine()); //100원 갯수
        int c = Integer.parseInt(br.readLine()); //50원 갯수
        int x = Integer.parseInt(br.readLine()); //총 금액

        int count = 0; //방법 개수
        for(int i=0;i<=a;i++){
            for(int j=0;j<=b;j++){
                for(int k=0;k<=c;k++){
                    if(x==500*i + 100*j + 50*k){
                        count+=1; //동전의 합과 총 금액이 같다면 갯수 +1
                    }
                }
            }
        }
        return count;
    }

    public int number05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //1이하 n이하 정수
        int count = 0; //리턴값
        int a = Integer.parseInt(st.nextToken()); //숫자의 합이 a이상 b이하
        int b = Integer.parseInt(st.nextToken());

        for(int i=1;i<=n;i++){
            char[] c_number = String.valueOf(i).toCharArray(); //10진법의 각 자리의 정수를 나누기 위해 문자배열로 변환
            int count_number = 0; //10진법의 각 자리 숫자의 합
            for (char c : c_number) {
                count_number += Integer.parseInt(String.valueOf(c));
            }
            if(count_number>=a&&count_number<=b) { //각 자리의 숫자의 합이 a이상 b이하면 리턴값에 더함
                count += i;
            }
        }

        return count;

    }

    public int number06() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2,Collections.reverseOrder());

        int a = 0;
        int b = 0;

        for(int i=0;i<arr2.length;i++){
            if(i%2==0){
                a+=arr2[i];
            }else{
                b+=arr2[i];
            }
        }

        return a-b;

    }

    public int number07() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int before = 0; //같은 값 제외시키기 위한 변수
        int count = 0; //떡단의 떡의 개수
        for(int i:arr){
            if(i!=before){
                count += 1;
                before = i;
            }
        }
        return count;
    }

    public String number08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //지폐의 총 갯수
        int y = Integer.parseInt(st.nextToken()); //받은 총 값

        for(int i=0;i<=n;i++){
            for(int j=0;j<=y;j++) {
                int k = n - i - j;
                int count = 10000*i+5000*j+1000*k;
                if(y==count&&k>=0){
                    return i + " " + j + " " + k;
                }
            }
        }

        return "-1 -1 -1";
    }



}

public class Main {
    public static void main(String[] args) throws IOException {

        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();*/ //속도 느림 bufferedReader 선호

        practiceTest p = new practiceTest();

        //System.out.println(p.number03());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //버퍼드 습관화
        bw.write(p.number08()); //문제마다 메소드 바꿔줌
        bw.close();


    }
}