package com.mn;
import java.util.*;

//���⣺2.3
//public class StudentManager {
//	���ܣ�����������ѧ����Ϣ
public class StudentManager {
	static Stu[] Stu=new Stu[20];//����ѧ������
	 static int number=0;
	 static Scanner scanner=new Scanner(System.in);
	 
//	 ���⣺2.3��2.5
//	void App(){
//	���ܣ��������ѧ����Ϣ���붨���������
//	���룺ѧ����Ϣ
//	 �޷���ֵ
	 void App(){
	 int choice;
//	����3.5 
//	System.out.println("ѧ����Ϣ����ϵͳ");
	 System.out.println("ѧ����Ϣ����ϵͳ");
//	 ���⣺2.2��2.3
//	 while(true){
//		 System.out.println("1.����");
//		 System.out.println("2.�鿴");
//		 System.out.println("3.�޸�");
//		 System.out.println("4.ɾ��");
//		 System.out.println("5.����");
//		 System.out.println("6.�˳�");
//		 System.out.println("������1-6");
//		 choice=scanner.nextInt();
//		 if(choice==6)break;
//		 switch(choice){
//		 case 1:   add(); break;//����
//		 case 2:   show();break;//�鿴
//		 case 3:   change();break;//�޸�
//		 case 4:   delete();break;//ɾ��
//		 case 5:   query();break;//����
//		 }    
//	}
	 
	 while(true){
		 //��������û�ѡ��
		 System.out.println("1.����");
		 System.out.println("2.�鿴");
		 System.out.println("3.�޸�");
		 System.out.println("4.ɾ��");
		 System.out.println("5.����");
		 System.out.println("6.�˳�");
		 System.out.println("������1-6");
		 choice=scanner.nextInt();
		 if(choice==6)break;//�˳�����
		 switch(choice){
		 case 1:   add(); break;//ѡ����빦��
		 case 2:   show();break;//ѡ��鿴����
		 case 3:   change();break;//ѡ���޸Ĺ���
		 case 4:   delete();break;//ѡ��ɾ������
		 case 5:   query();break;//ѡ����ҹ���
		 }    
	}
	 System.out.println("��л����ʹ��");
	}
	 
	static void add(){//���뺯��
	 while(true){
		 System.out.println("����������������ѧ����Ϣ��ֹͣ��������0");
		 if(scanner.nextInt()==0)break;
		 System.out.println("�������ѧ����ѧ�ţ��������Ա𣬳�������");
		 Stu[number]=new Stu();
		 Stu[number].setId(scanner.nextInt());
		 Stu[number].setName(scanner.next());
		 Stu[number].setGender(scanner.nextBoolean());
		 Stu[number].setBirDate(scanner.next());
		 number++;//ѧ����Ϣ��������
		 System.out.println("���ӳɹ�");
		 }
	 }
	 
	 
	 static void show(){//�鿴
	   System.out.println("*******************************************");
	   System.out.println(" ѧ��  ��+��  ����  ��+��  �Ա�  ��+��  �������� ");
//	   ���⣺4.2
//	   for(int i=0;i<number;i++)
	//�����ѧ����Ϣ
	   for(int i=0;i<number;i++){
	   System.out.println(Stu[i].getId()+"  "+Stu[i].getName()+"  "+Stu[i].getGender()+"  "+Stu[i].getBirDate()+"  ");
	   System.out.println("*******************************************");
//	   ���⣺3.5
//	 System.out.println();
	   System.out.println();
	   }
	}
	 
	 
	static void change(){//�޸�
		 System.out.println("������Ҫ�޸���Ϣ��ѧ��ѧ��");
		 String Stunumber=scanner.next();
		 for(int i=0;i<number;i++){
		   if(Stunumber.equals(Stu[i].getId()))
		   {System.out.println("������Ҫ�޸ĵ�ѧ������Ϣ,ѧ�ţ��������Ա𣬳�������");
//		   ���⣺3.5
//		    Stu[i].setId(scanner.nextInt());
		     Stu[i].setId(scanner.nextInt());
		     Stu[i].setName(scanner.next());
		     Stu[i].setGender(scanner.nextBoolean());
		     Stu[i].setBirDate(scanner.next());
		     break;
		   }
//		   ���⣺4.2��4.5
//		   if(number==i)System.out.println("���޴���");
		   if(number==i){
			   System.out.println("���޴���");
		   }
		 }
	}
	 
	static void delete(){//ɾ��
		 System.out.println("������Ҫɾ����Ϣ��ѧ��ѧ��");
		 String Stunumber=scanner.next();
		 int i;
//		 ���⣺4.1
//		 for( i=0;i<number;i++){
//		   if(Stunumber.equals(Stu[i].getId()))break;
//		   if(number==i)System.out.println("�Բ�����޴���");
//		 }
//		 for(i=0;i<number-1;i++){
//		   Stu[i]=Stu[i+1];
//		    number--;
//		 }
		 for( i=0;i<number;i++){
			   if(Stunumber.equals(Stu[i].getId()))break;
			   if(number==i)System.out.println("�Բ�����޴���");
			 }
		  for(i=0;i<number-1;i++){
			   Stu[i]=Stu[i+1];
			    number--;
			 }
		 System.out.println("ɾ�����");
		}

	static void query(){//��ѯ
	  System.out.println("������Ҫ��ѯ��ѧ��ѧ��");
	   String Stunumber=scanner.next();
	   int i;
	   for(i=0;i<number;i++){
	     if(Stunumber.equals(Stu[i].getId())){
	       System.out.println("*******************************************");
	       System.out.println(" ѧ��       ����             �Ա�       ��������        ");
	       System.out.println(Stu[i].getId()+"\t"+Stu[i].getName()+"\t"+"\t"+Stu[i].getGender()+"\t"+Stu[i].getBirDate()+"\t");
	       System.out.println("*******************************************");
	     }
	   } 
	   if(number==i)System.out.println("���޴���");
	}
}
