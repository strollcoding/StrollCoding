package practice;

import java.util.Scanner;
//Scanner는 java.util 패키지에 있는 클래스로써 키보드로부터 값을 입력받아 출력할 때 유용하게 쓰인다.
	public class dowhile {
		public static void main(String[] args) {
			int value = 0;
			
			Scanner scan = new Scanner(System.in);
			//위처럼 작성하면 키보드로부터 값을 입력받을 수 있는 Scanner 객체가 생성된다.
			
			do {
				value = scan.nextInt();
				//Scanner클래스를 이용하여 키보드로부터 숫자값을 입력 받는다.
				System.out.println("입력받은 수 :"+value);
			}while(value != 10); //입력받은 값이 10이 아닐 경우 계속 반복한다.
			
			System.out.println("반복문 종료");
		
				
			}
			
		}