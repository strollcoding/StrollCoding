package practice;

public class for_practice {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			//for(�����ʱ�ȭ; ���ǽ�; ������)	
//			if(i % 2 != 0) {
//				continue; 
				// continue �Ʒ��� ������ �������� X, ���� ���ǹ��� �����ϰ� �������´�.
//			}
			if(i == 50) {
				break; 
				// break�� ������ �ݺ����� �ٷ� �������´�.
			}
			total = total + i;
		}
		
		System.out.println(total);
	}
	
}
