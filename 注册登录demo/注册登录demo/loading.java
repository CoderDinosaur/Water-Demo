package ע���¼demo;
import java.util.Scanner;

public class loading {
	static int i=-1;
	String[] namecheck=new String[10];				//���ַ�������洢�û���
	String[] passwordcheck=new String[10];			//���ַ�������洢�û�����
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		loading temp=new loading();
		User one = new User(temp);
	   
	    one.zhuce(temp);
		
		boolean index=true;
		int choose;						//���ݱ���choose��ֵ��ѡ��ϵͳ����
		
		while(index) {
		System.out.println("1:ע���˺�  2����¼�˺�  3���˳�ϵͳ");	
		System.out.print("��ѡ�������蹦��:");
		choose=input.nextInt();
		if(choose==1) {
			one.zhuce(temp);
			continue;
		  }
		else if(choose==2){
			one.denglu(temp);
			continue;
		}
		
		else if(choose==3) {
			System.out.println("��л����ʹ�ã��˳�ϵͳ��");
			break;
		}
		else {
			System.out.println("������󣡣���");
			continue;
		  }
		}
		
  }
}

class User {								//User�����ڴ��桢���ݡ������û����������
	String name=null,password=null;
	int under;								//����under���ڴ����¼�±����ƶ�����ռ䣬���ڴ��桢�������������û�����
	User(loading x){
		under=x.i;
	}
	void zhuce(loading x) {					//ע�ắ���������û����ݣ�������namecheck��passwordcheck���飬�ֱ�洢�û���������
		under+=1;
		x.i=under;
		Scanner input=new Scanner(System.in);
		System.out.println("ע����Ϣ¼��");
		System.out.print("�������û�����");
		name=input.nextLine();
		//System.out.print(name);
		System.out.print("�������û����룺");	
		password=input.nextLine();
		x.namecheck[under]=name;				//��ֵ���ݸ�loading����󴢴棬��֤����������������Ȼ����   ���Ժ�ɸ���Ϊ���ݿ�ӿڣ�
		x.passwordcheck[under]=password;
		
		}	
	void denglu(loading x) {						//��¼�����������û������ֵ���������Ƿ�Ϊ��ע�����
		Scanner input=new Scanner(System.in);		
		System.out.print("�������û�����");
		name=input.nextLine();
		System.out.print("�������û����룺");	
		password=input.nextLine();
		for(int z=0;z<x.i+1;z++)
		{
			
			if( (x.namecheck[z].contentEquals(name))&&(x.passwordcheck[z].contentEquals(password)) ) { //���û��������벻���ڡ���ƥ�䣬����ʾ����
				System.out.println("��¼�ɹ�������");
				return;
			   }
		}
			System.out.println("���󣡣���");
	}
}



	
	
	





	
