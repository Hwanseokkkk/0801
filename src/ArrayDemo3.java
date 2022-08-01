
public class ArrayDemo3 {
	public static void main(String[] args) {
		//배열의 초기값 (5개 중에 하나로만 초기화가 된다)
		//정수형 ( 0으로 초기화)
		/*int [] array = new int[4];
		for(int i = 0; i < array.length; i++) {
			System.out.print("array[" + i +"] = " + array[i] + "\t");
		}*/
		
		//실수형 (0.0으로 초기화)
		/*double [] array = new double[4];
		for(int i = 0; i < array.length; i++) {
			System.out.print("array[" + i +"] = " + array[i] + "\t");
	}*/
		
		//문자형 (ASCII = 0은 출력 안됨)(ASCII 0 출력하는 2가지 방법 '\0' , '\u0000' , = null값)
	/*	char [] array = new char[4];
		for(int i = 0; i < array.length; i++) {
			System.out.print("array[" + i +"] = " + array[i] + "\t");

}*/
		//boolean형(false 가 기본값)
		/*boolean [] array = new boolean[4];
		for(int i = 0; i < array.length; i++) {
			System.out.print("array[" + i +"] = " + array[i] + "\t");
}*/
		//참조형 : null번지
		String [] array = new String[4];
		for(int i = 0; i < array.length; i++) {
			System.out.print("array[" + i +"] = " + array[i] + "\t");
}
	}
}