//1~100까지 소수 나타내기
public class Q3_1 {
	public static void main(String[] args) {
		//Mine
//		int i,j;
//		//2~ 100 까지 반복한다. 
//		for(i = 2; i<=100; i++) {
//			//2 ~ 100 -1 까지 반복한다. 즉, 자기 자신을 제외한다.
//			for(j = 2; j < i; j++) {
//				//1과 자기 자신이 아닌 다른 수로 나누어 떨어진다면 소수가 아니다.
//				// 100이 소수가 아니라고 판단되면 반복문을 중단한다.
//				if(i % j ==0) break;
//		}
//			//j를 사용하는 반복문이 끝까지 반복했다면 i는 소수이다.
//				if(i ==j) System.out.printf("%d\t", i);
//				}
//		System.out.printf("\n");
//	}
//	}
//소수는 1과 자기 자신만으로 나누어 떨어지는 정수
		
		boolean flag = true;
		int i,j,count=0;
		for( i = 2; i <100; i++) {
			for( j=2; j<i; j++) {
				if(i %j == 0) { //나누어지면 소수가 아니라는 뜻(출력안함)
					flag = false; break;
				}
			}
			flag = true;
			if(flag && i ==j) {
				System.out.printf("%d\t",i); count++;
				if(count %5 ==0) System.out.println();
			
		}
	}
}
}