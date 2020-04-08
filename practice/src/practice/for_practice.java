package practice;

public class for_practice {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			//for(변수초기화; 조건식; 증감식)	
//			if(i % 2 != 0) {
//				continue; 
				// continue 아래의 문장은 수행하지 X, 위의 조건문을 수행하고 빠져나온다.
//			}
			if(i == 50) {
				break; 
				// break를 만나면 반복문을 바로 빠져나온다.
			}
			total = total + i;
		}
		
		System.out.println(total);
	}
	
}
