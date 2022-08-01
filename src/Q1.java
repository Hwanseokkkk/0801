
public class Q1 {
	public static void main(String[] args) {
		int [] array = {10, 50, 44, 56, 29, 30, 9, 48, 84, 92};
		int [] original = array; // 배열의 주소 복사
		
		System.out.print("원본 = ");
		for(int su : original) {
			System.out.print(su+"\t");
		}
		System.out.println();
		int sum = 0, max = array[0], min = array[0]; //초기화
		for(int i = 0; i < array.length -1; i++) {
			sum += array[i];
			if(max < array[i]) max = array[i]; 
			if(min > array[i]) min = array[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum / array.length);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 :  " + min);
		
		
		
		
		
		
		//과제 : 입력받은 수를 소인수분해해서 그 결과를 각 줄에 3개씩 출력하라.
		//과제2 : 1부터 100까지 소수를 출력하기
		
		
//		for(int i = 0; i < array.length -1; i++) {
//			for(int j = 0; j < array.length-1; j++) {
//				if(array[j] > array[j + 1]) {
//					int temp = array[j];
//					array[j] = array[j + 1];
//					array[j +1] = temp;
//				}
//			}
//		}
//		System.out.println();
//		for(int su : array) {
//			System.out.printf(" %d\t",su);
//		}
//		for(int i = 0; i < array.length -1; i++) {
//			for(int j = 0; j < array.length-1; j++) {
//				if(array[j] < array[j + 1]) {
//					int temp = array[j];
//					array[j] = array[j + 1];
//					array[j +1] = temp;
//				}
//			}
//		}
//		System.out.println();
//		for(int su : array) {
//			System.out.printf(" %d\t",su);
//		}
//		int sum = 0;
//		for(int i =0; i <array.length; i++) {
//			sum += array[i];		
//			}
//		System.out.println();
//		System.out.println("합계 = " + sum);
//	
//	for(int su : array) {
//		System.out.printf(" %d\t",su);
//	}
//	double avg = 0;
//
//	System.out.println();
//	System.out.printf("평균 = %.1f", sum / 10.);
}
}


//<출력>
//배열 원본 :  {10, 50, 44, 56, 29, 30, 9, 48, 84, 92}
//내림차순
//오름차순
//합계 = 452
//평균 = 45.2
//최대값 = 92
//최소값 = 9