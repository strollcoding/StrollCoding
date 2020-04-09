package practice;

public class array {

	public static void main(String[] args) {
		int[] array1 = new int[100];
		// 배열의 길이는 0부터 시작한다.
		array1[0] = 50;
		array1[10] = 100;
		// 배열을 가리키는 변수 자체가 값을 가지고 있는 것이 아니라 실제 변수 값을 가질 수 있는 메모리를 가리키고 있는 것이다.
		
		int[] array2 = new int[] {1,2,3,4};
		
		int[] array3 = {1,2,3,4};
	    System.out.println(array3[3]); //4
	    
	    int value = array3[0];
	    System.out.println(value); //1

	}

}
