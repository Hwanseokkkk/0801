
public class ArrayDemo {
	public static void main(String[] args) {
		//첫번째 방법 (단점 : 개수가 많으면 귀찮음)
/*		int [] array; //배열의 선언
		array = new int[4]; //배열의 생성
		array[0] = 6;
		array[1] = 9;
		array[2] = 12;
		array[3] = 15; //할당
		
		for(int i = 0; i <4; i++) {
			System.out.print("array[" + i + "] = " + array[i] + "\t");*/
		
		//두번째 방법 (생성 및 할당을 합침)
		/*double[] weights; //선언
		weights = new double[] {67.3, 78.9,52.3}; //생성 및 할당 (합침) *방 개수를 선언하지 않음
		for(int i = 0; i<3; i++) {
			System.out.printf("weights[%d] = %.1f\t",i, weights[i]);*/
		
		//세번째 방법(선언, 생성, 할당 한번에)(new를 쓰지않아도 컴파일러가 자동으로 넣어줌)(단점 : 한줄로만 사용해야함 줄바꿈x)
		char [] grades = {'A','C','B','B','C'}; //초기화
		int i =0; //초기값
		while(i<5) { //조건
			System.out.print("grades[" + i + "] = " + grades[i] + "\t");
			i++; //증감
		}
	}

}
