package practice;

public class array {

	public static void main(String[] args) {
		int[] array1 = new int[100];
		
		array1[0] = 50;
		array1[10] = 100;
		// �迭�� ����Ű�� ���� ��ü�� ���� ������ �ִ� ���� �ƴ϶� ���� ���� ���� ���� �� �ִ� �޸𸮸� ����Ű�� �ִ� ���̴�.
		
		int[] array2 = new int[] {1,2,3,4};
		
		int[] array3 = {1,2,3,4};
	    System.out.println(array3[3]); //4
	    
	    int value = array3[0];
	    System.out.println(value); //1

	}

}
