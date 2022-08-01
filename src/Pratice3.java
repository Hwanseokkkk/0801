import java.util.Scanner;

//자판기 프로그램
public class Pratice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 금액 : ");
		int money = sc.nextInt();  //145678
		
		int [] array = {50000,10000,5000,1000,500,100,50,10,5,}; //반복의 대상을 배열로 만들자
		System.out.println("방 개수 : " + array.length); //array.length <<방개수 알아보는 방법
			
	/*	int mok = money  /50000; //2 
		int na = money % 50000; // 45678
		mok = na /10000; //4
		na = na%10000; // 5678
		mok = na / 5000;
		na = na %5000;*/ //너무 귀찮으니깐 배열을 사용하자...
	
	    for(int i = 0; i<array.length; i++) {
	    	int mok = money / array[i]; //몫
	    	int na = money % array[i]; //나머지
	    	System.out.println(array[i] + "원권 : " + mok + "나머지" + na);
	    	money = na;
		
	}

}
}
