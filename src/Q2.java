import java.util.Scanner; //소인수분해
//Mine
public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하시오 : ");
		int su = sc.nextInt();
//		int i = 2;
//		int count = 0;
//			while(su>=i) {
//				
//				if(su % i == 0) {
//				System.out.print(i+"\t");
//				su /= i;
//				count++;
//			}
//				else {
//					i++;
//				}
//				if(count %3==0) System.out.println();
//		}
//	}
//			
//}
//강사님.
		int count = 0;
		System.out.print(1 + "\t"); count++;
		for(int i =2; i <su; i++) {
			if(su % i ==0) System.out.print(i + "\t");//입력받은 수가 딱 나누어 지니?
			count++;
			if(count %3 ==0) System.out.println();
			}
		System.out.println(su);
		}
	}

