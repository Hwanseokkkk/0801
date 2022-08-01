
public class Q3 {
	public static void main(String[] args) {
		//2~ 100 - 1 까지 반복한다. 즉, 자기 자신을 제외한다.
		for(int i = 2; i<=100; i++) {
			//1과 자기 자신이 아닌 다른 수로 나누어 떨어진다면 소수가 아니다.
			//100이 소수가 아니라고 판단되면 반복문을 중단한다.
			int count = 0;
			
			for(int j =1; j<=i ; j++) {
				
				if(i%j ==0) {
					
				count ++;
				}
			}
				if(count ==2)
				System.out.println(i + "는 소수입니다.");
			}
		}
	}


//소수는 1과 자기 자신만으로 나누어 떨어지는 정수