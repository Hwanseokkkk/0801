//주소배열
public class ArrayDemo1 {
	public static void main(String[] args) {
		Student [] array; //배열선언
		array = new Student[3]; //배열생성 (학생 3명이 들어갈 방을 만든 코드)
		array[0] = new Student(); //김해 주소
		array[0].name = "한지민";
		array[0].age = 26;
		
		array[1] = new Student();//울산 주소
		array[1].name = "김철수";
		array[1].age = 36;
		
		array[2] = new Student();//해운대 주소
		array[2].name = "이영희";
		array[2].age = 46;
		
		for(int i = 0; i<3; i++) {
			System.out.printf("이름 : %s, 나이 = %d\n",array[i].name, array[i].age);
		}
		//학생들의 평균나이 구해보기
		//int sum = array[0].age + array[1].age + array[2].age; //방 개수가 많으면 힘드니깐 반복문을 사용한다
		int sum = 0;
		for(int i =0; i <3; i++) {
			sum += array[i].age;		}
		System.out.println("평균나이 = " + sum /3);
	}

}
