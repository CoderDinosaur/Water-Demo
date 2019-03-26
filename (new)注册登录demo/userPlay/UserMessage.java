package userPlay;
import java.util.Scanner;
//用户信息表
//获取用户及储存用户
public class UserMessage {
	Scanner input = new Scanner(System.in);
	public static String name = null;   		//用户姓名
	public static enum sex {					//用户性别
		boy,girl, undefined };					//undefined表示未输入性别 
	
	public static sex  userSex = sex.undefined ;
	public static int studentNo = 0;  			//用户学号
	public static String college = null;		//用户所在学院
	public static String className = null;		//用户所在专业班级
	//public static int mobilePhone = 0;			//用户手机号码	
	public static String mobilePhone = null;	//用户手机号码	
	public static String weChat = null;			//用户微信号
	
	public UserMessage() {                   	//构造函数接收数据
		setName();
		setSex();
		setStudentNo();
		setCollege();
		setClassName();
		setMobilePhone();
		setWeChat();
	}
	
	void setName() {	    					//获取用户姓名及储存用户姓名
		System.out.print("请输入您的名字：");
		this.name = input.nextLine();
			}
	void setSex() {	    						//获取用户性别及储存用户性别
		int choose = 0;				
		System.out.print("请输入序号以确定您的性别 （1.男性  2.女性） ：");
		choose = input.nextInt();
		if (choose == 1)
			userSex = sex.boy;
		else if (choose == 2)
			userSex = sex.girl;
		else {
			System.out.println("输入错误！请按提示再次输入：");
			setSex();
		}
	}
	
	void setStudentNo() {						//获取用户学号及储存用户学号
		System.out.print("请输入您的学号：");
		this.studentNo = input.nextInt();	
	}
	
	void setCollege() {							//获取用户所在学院及储存用户所在学院
		System.out.print("请输入您所处学院：");
		this.college = input.nextLine();	
	}
	
	void setClassName() {
		System.out.print("请输入您的专业班级：");	//获取用户所在专业班级及储存用户所在专业班级
		this.className = input.nextLine();	
	}
	
	/*void setMobilePhone() {
		System.out.print("请输入您的手机号码：");	//获取用户手机号码及储存用户手机号码
		this.mobilePhone = input.nextInt();	
	}*/
	
	void setMobilePhone() {
		System.out.print("请输入您的手机号码：");	//获取用户手机号码及储存用户手机号码
		this.mobilePhone = input.nextLine();	
	}
	
	void setWeChat() {
		System.out.print("请输入您的微信号：");	//获取用户微信号及储存用户微信号
		this.weChat = input.nextLine();	
	}
   
	String getName() {	    					
		return name;
	}
	
	sex getSex() {	  
		
		return userSex;
	}
	
	int getStudentNo() {
		return studentNo;
	}
	
	String getCollege() {
		return college;
	}
	
	String getClassName() {
		return className;
	}
	
	/*int getMobilePhone() {
		return mobilePhone;
	}*/
	
	String getMobilePhone() {
		return mobilePhone;
	}
	
	String getWeChat() {
		return weChat;
	}
	
}
