package 注册登录demo;
import java.util.Scanner;

public class loading {
	static int i=-1;
	String[] namecheck=new String[10];				//用字符串数组存储用户名
	String[] passwordcheck=new String[10];			//用字符型数组存储用户密码
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		loading temp=new loading();
		User one = new User(temp);
	   
	    one.zhuce(temp);
		
		boolean index=true;
		int choose;						//根据变量choose的值来选择系统功能
		
		while(index) {
		System.out.println("1:注册账号  2：登录账号  3：退出系统");	
		System.out.print("请选择你所需功能:");
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
			System.out.println("感谢您的使用，退出系统；");
			break;
		}
		else {
			System.out.println("输入错误！！！");
			continue;
		  }
		}
		
  }
}

class User {								//User类用于储存、传递、检验用户输入的数据
	String name=null,password=null;
	int under;								//变量under用于储存记录下标与移动储存空间，便于储存、检索、处理多个用户数据
	User(loading x){
		under=x.i;
	}
	void zhuce(loading x) {					//注册函数。储存用户数据，并传给namecheck、passwordcheck数组，分别存储用户名与密码
		under+=1;
		x.i=under;
		Scanner input=new Scanner(System.in);
		System.out.println("注册信息录入");
		System.out.print("请输入用户名：");
		name=input.nextLine();
		//System.out.print(name);
		System.out.print("请输入用户密码：");	
		password=input.nextLine();
		x.namecheck[under]=name;				//将值传递给loading类对象储存，保证函数结束后，数据仍然存在   （以后可更改为数据库接口）
		x.passwordcheck[under]=password;
		
		}	
	void denglu(loading x) {						//登录函数。储存用户输入的值，并检索是否为已注册对象，
		Scanner input=new Scanner(System.in);		
		System.out.print("请输入用户名：");
		name=input.nextLine();
		System.out.print("请输入用户密码：");	
		password=input.nextLine();
		for(int z=0;z<x.i+1;z++)
		{
			
			if( (x.namecheck[z].contentEquals(name))&&(x.passwordcheck[z].contentEquals(password)) ) { //若用户名及密码不存在、不匹配，则显示错误
				System.out.println("登录成功！！！");
				return;
			   }
		}
			System.out.println("错误！！！");
	}
}



	
	
	





	
