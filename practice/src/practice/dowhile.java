package practice;

import java.util.Scanner;
//Scanner�� java.util ��Ű���� �ִ� Ŭ�����ν� Ű����κ��� ���� �Է¹޾� ����� �� �����ϰ� ���δ�.
	public class dowhile {
		public static void main(String[] args) {
			int value = 0;
			
			Scanner scan = new Scanner(System.in);
			//��ó�� �ۼ��ϸ� Ű����κ��� ���� �Է¹��� �� �ִ� Scanner ��ü�� �����ȴ�.
			
			do {
				value = scan.nextInt();
				//ScannerŬ������ �̿��Ͽ� Ű����κ��� ���ڰ��� �Է� �޴´�.
				System.out.println("�Է¹��� �� :"+value);
			}while(value != 10); //�Է¹��� ���� 10�� �ƴ� ��� ��� �ݺ��Ѵ�.
			
			System.out.println("�ݺ��� ����");
		
				
			}
			
		}