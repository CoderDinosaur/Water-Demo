package userPlay;
import java.util.Scanner;

import javax.xml.transform.Templates;

class User {					//User�����ڴ��桢���ݡ������û����������
		String userName = null,userPassword = null;
		String checkPassword = null,checkPassword_1 = null;	
		/*������ʱ����checkPassword�����һ����������룬checkPassword_1����ȷ������ 
	           ������������ͬʱ �Ž�ֵ���ݸ�����userPassword */
		Scanner input=new Scanner(System.in);
		
		User() {                   //���캯�������û��˺ź�����
			System.out.println("ע����Ϣ¼��");
			System.out.print("�������˺ţ�");
			this.userName = input.nextLine();
			setUserPassword();
		}
		void setUserPassword() {	//��ȡ���뼰��������
			System.out.print("�������û����룺");	
			checkPassword = input.nextLine();
			System.out.print("���ٴ������û������������ȷ�ϣ�");
			checkPassword_1 = input.nextLine();
			if (checkPassword.equals(checkPassword_1)) {
				this.userPassword = checkPassword;
				System.out.print("����˶Գɹ� ע����ɣ�");
			}
			else {
				System.out.println("�������벻ͬ ����������");
				setUserPassword();     
				}
		}
		
}

public class RegisteAndLogin {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	
		User temp = new User();
		System.out.println(temp.userName);
		System.out.print(temp.userPassword);
		
				
		
		
	}

}
