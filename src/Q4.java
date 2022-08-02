import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<입력>");
		
		System.out.println("첫번째 수 : ");
		int su1 = sc.nextInt();
		System.out.println("두번째 수 : ");
		int su2 = sc.nextInt();
		int gcm = 0;
		for(int i =2; i < su1; i++) {
			if(su1 % i ==0 && su2 %i ==0) gcm = i;
		}
		int lcm = (su1 / gcm)*(su2 / gcm)*gcm;
		System.out.printf("%d와 %d의 GCM = %d, LCM = %d\n",su1, su2, gcm, lcm);
		
		
	}

}





//LCM, GCM
/*<입력>
  첫째수 :
  둘째수 :
  <출력>
  ~와~의 GCM = ~, LCM = ~
  A = aG
 B = bG
  C = abG*/
