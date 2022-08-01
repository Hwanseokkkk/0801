
public class ArrayDemo5 {
	public static void main(String[] args) {
		int [] array = {4,5,8,1,3};
	//	for(int i = 0; i < array.length;i++) {
	//		System.out.println("array[" + i + "] = " + array[i]);
	//	}
		//새로운 for (배열과 컬렉션에서만 사용)
		for(int su : array ) { //처음부터 끝까지 su에 다 넣는다. index가 없다. (index가 필요로 하지 않는 상황에서 사용)
			System.out.println(su); 
			
		}
		}
	}


