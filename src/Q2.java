import java.util.Scanner; //소인수분해

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하시오 : ");
		int su = sc.nextInt();
		int i = 2;
		int count = 0;
			while(su>=i) {
				
				if(su % i == 0) {
				System.out.print(i+"\t");
				su /= i;
				count++;
			}
				else {
					i++;
				}
				if(count %3==0) System.out.println();
		}
	}
			
}
		// 출력개수 한줄에 3개씩 표기할 수 있는 방법
		// count 라는 변수를 만들어서 ++증감식을 이용해서 3의 배수마다 출력하라고 명령하는 식
//		int count = 0;
//		for (int i = 0; i <=200 ; i++) {
//			count++;
//				if(count %3==0) System.out.print("\t");
//			}
//		}
//}
	
