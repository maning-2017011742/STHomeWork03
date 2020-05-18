package com.mn;
import java.util.*;

public class StudentManager {
	static Stu[] Stu=new Stu[20];//定义学生数组
	 static int number=0;
	 static Scanner scanner=new Scanner(System.in);
	 
	void App(){
	 int choice;
	 
	 System.out.println("学生信息管理系统");
	 while(true){
		 System.out.println("1.插入");
		 System.out.println("2.查看");
		 System.out.println("3.修改");
		 System.out.println("4.删除");
		 System.out.println("5.查找");
		 System.out.println("6.退出");
		 System.out.println("请输入1-6");
		 choice=scanner.nextInt();
		 if(choice==6)break;
		 switch(choice){
		 case 1:   add(); break;//插入
		 case 2:   show();break;//查看
		 case 3:   change();break;//修改
		 case 4:   delete();break;//删除
		 case 5:   query();break;//查找
		 }    
	}
	 System.out.println("感谢您的使用");
	}
	 
	static void add(){//插入
	 while(true){
		 System.out.println("点击任意键继续添加学生信息，停止添加输入0");
		 if(scanner.nextInt()==0)break;
		 System.out.println("请输入该学生的学号，姓名，性别，出生日期");
		 Stu[number]=new Stu();
		 Stu[number].setId(scanner.nextInt());
		 Stu[number].setName(scanner.next());
		 Stu[number].setGender(scanner.nextBoolean());
		 Stu[number].setBirDate(scanner.next());
		 number++;
		 System.out.println("添加成功");
		 }
	 }
	 
	 
	 static void show(){//查看
	   System.out.println("*******************************************");
	   System.out.println(" 学号       姓名            性别        出生日期");
	   for(int i=0;i<number;i++)
	   System.out.println(Stu[i].getId()+"\t"+Stu[i].getName()+"\t"+"\t"+Stu[i].getGender()+"\t"+Stu[i].getBirDate()+"\t");
	   System.out.println("*******************************************");
	 System.out.println();
	}
	 
	 
	static void change(){//修改
		 System.out.println("请输入要修改信息的学生学号");
		 String Stunumber=scanner.next();
		 for(int i=0;i<number;i++)
		 {
		   if(Stunumber.equals(Stu[i].getId()))
		   {System.out.println("请输入要修改的学生的信息,学号，姓名，性别，出生日期");
		    Stu[i].setId(scanner.nextInt());
		     Stu[i].setName(scanner.next());
		     Stu[i].setGender(scanner.nextBoolean());
		     Stu[i].setBirDate(scanner.next());
		     break;
		   }
		   if(number==i)System.out.println("查无此人");
		 }
	}
	 
	static void delete(){//删除
		 System.out.println("请输入要删除信息的学生学号");
		 String Stunumber=scanner.next();
		 int i;
		   for( i=0;i<number;i++)
		   if(Stunumber.equals(Stu[i].getId()))break;
		   if(number==i)System.out.println("对不起查无此人");
		 for(;i<number-1;i++)
		   Stu[i]=Stu[i+1];
		    number--;
		 System.out.println("删除完成");
		}

	static void query(){//查询
	  System.out.println("请输入要查询的学生学号");
	   String Stunumber=scanner.next();
	   int i;
	   for(i=0;i<number;i++)
	   {
	     if(Stunumber.equals(Stu[i].getId())){
	       System.out.println("*******************************************");
	       System.out.println(" 学号       姓名             性别       出生日期        ");
	       System.out.println(Stu[i].getId()+"\t"+Stu[i].getName()+"\t"+"\t"+Stu[i].getGender()+"\t"+Stu[i].getBirDate()+"\t");
	       System.out.println("*******************************************");
	     }
	   } 
	   if(number==i)System.out.println("查无此人");
	}
}
