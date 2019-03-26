package userPlay;
import java.util.Scanner;
//组织信息表

public class Organization {
	Scanner input = new Scanner(System.in);
	String organizationName = null; 				//组织名
	String organizationProperty = null;				//组织性质
	String teacherName = null;						//指导老师姓名
	String principalName = null;					//负责人姓名
	
	public Organization() {
		setOrganizationName();
		setOrganizationProperty();
		setTeacherName();
		setPrincipalName();
	}
	
	void setOrganizationName() {	    			//获取组织名及组织名
		System.out.print("请输入组织名：");
		this.organizationName = input.nextLine();
			}
	
	void setOrganizationProperty() {	    		//获取组织性质及组织性质
		System.out.print("请输入组织性质：");
		this.organizationProperty = input.nextLine();
			}
	void setTeacherName() {	    					//获取指导老师姓名及指导老师姓名
		System.out.print("请输入指导老师姓名：");
		this.teacherName = input.nextLine();
			}
	void setPrincipalName() {	    				//获取负责人姓名及储存负责人姓名
		System.out.print("请输入负责人姓名：");
		this.principalName = input.nextLine();
			}
	
	String getOrganizationName() {
		return organizationName;
	}
	
	String getOrganizationProperty() {
		return organizationProperty;
	}
	
	String getTeacherName() {
		return teacherName;
	}
	
	String getPrincipalName() {
		return principalName;
	}
}


