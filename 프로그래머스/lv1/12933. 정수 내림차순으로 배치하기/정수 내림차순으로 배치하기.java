import java.util.Arrays;
class Solution {
    public long solution(long n) {
        //정수 -> String -> char배열로 만들어야 한다.
            String s = n + "";
            //문자열을 한 글자씩 쪼개서
            //이를 char타입의 배열에 집어넣어주는 친절한 메소드이다.
            char[] arr = s.toCharArray();
            //Arrays.sort - > 오름차순으로 정렬
            Arrays.sort(arr);

            String answer = "";
            //반복문으로 배열을 거꾸로 꺼낸다.
            for(int i=arr.length-1; i>=0; i--) {
                answer += arr[i];
            }
            ////Java String 을 long 으로 변환하는 법
            return Long.parseLong(answer);
    }
}