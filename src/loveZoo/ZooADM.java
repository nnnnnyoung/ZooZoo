package loveZoo;

import java.util.Scanner;

public class ZooADM {
	String [] Zoo=new String [4];
	ZooADM() {
		menu();
		
	}
	
	
	public void zooinput() {
		Scanner in=new Scanner(System.in);
		System.out.println("������ �̸��� �Է��ϼ���");
		String newWord=in.nextLine();
		for(int i=0; i<Zoo.length; i++) {
			if(Zoo[i]==null) {
				Zoo[i]=newWord;
				break;
			}
		}
	}
	
	public void zoooutput() {
		for(int i=0; i<Zoo.length;i++) {
			System.out.println(Zoo[i]);
		}
	}
	
	public void delete() {
		Scanner in=new Scanner(System.in);
		System.out.println("������ �̸��� ������?");
		String newWord=in.nextLine();
		for(int i=0; i<Zoo.length; i++) {
			if(Zoo[i].equals(newWord)) {
				Zoo[i]=null;
				break;
			}
		}
	
	}
	
	public void modify() {
		Scanner in=new Scanner(System.in);
		System.out.println("������ �̸��� �����ұ��?");
		String oldWord=in.nextLine();
		for (int i=0; i<Zoo.length;i++) {
			if(oldWord.equals(Zoo[i])) {
				System.out.println("�̸��� �������� �����ұ��?");
				String newWord=in.nextLine();
				Zoo[i]=newWord;
				break;
				
			} else {
				System.out.println("��Ͽ� "+oldWord+"��(��) �����ϴ�.");
				break;
			}
		}

		
		
	}
	
	
	public void find() {
		Scanner in=new Scanner(System.in);
		System.out.println("ã���ô� ������ �̸��� �Է����ּ���");
		String newWord=in.nextLine();
		for(int i=0; i<Zoo.length; i++) {
			if(Zoo[i].equals(newWord)) {
				System.out.println(newWord+"�� "+i+"�ε����� �ֽ��ϴ�.");
				break;
			}else {
				System.out.println(newWord+"�� ��Ͽ� �����ϴ�.");
				break;
			}
		}
	}
	
	public void menu() {
		for(;;){
			System.out.println("1. �Է�");
			System.out.println("2. ��ü ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� ã��");
			Scanner in=new Scanner(System.in);
			System.out.println("�޴�����");
			int a=in.nextInt();
			if(a==1) {
				zooinput();
			}else if(a==2) {
				zoooutput();
			}else if(a==3) {
				delete();
			}else if(a==4) {
				modify();
			}else if(a==5) {
				 find();
			}
		}
	}
}















