import java.util.Scanner; //초를 입력하면 시간과 분으로 나오게한다.

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("계산하실 초 : ");
		int su = sc.nextInt();
		
		int hour = su / 3600;
		int seconds = su %3600;
		int min =  seconds / 60;
		seconds = seconds %60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.", su, hour, min, seconds);
		
	}
	

}
