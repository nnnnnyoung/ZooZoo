package loveZoo;

import java.util.Scanner;

public class ZooADM {
	String [] Zoo=new String [4];
	ZooADM() {
		menu();
		
	}
	
	
	public void zooinput() {
		Scanner in=new Scanner(System.in);
		System.out.println("동물의 이름을 입력하세요");
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
		System.out.println("누구의 이름을 지울까요?");
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
		System.out.println("누구의 이름을 수정할까요?");
		String oldWord=in.nextLine();
		for (int i=0; i<Zoo.length;i++) {
			if(oldWord.equals(Zoo[i])) {
				System.out.println("이름을 무엇으로 수정할까요?");
				String newWord=in.nextLine();
				Zoo[i]=newWord;
				break;
				
			} else {
				System.out.println("목록에 "+oldWord+"는(은) 없습니다.");
				break;
			}
		}

		
		
	}
	
	
	public void find() {
		Scanner in=new Scanner(System.in);
		System.out.println("찾으시는 동물의 이름을 입력해주세요");
		String newWord=in.nextLine();
		for(int i=0; i<Zoo.length; i++) {
			if(Zoo[i].equals(newWord)) {
				System.out.println(newWord+"는 "+i+"인덱스에 있습니다.");
				break;
			}else {
				System.out.println(newWord+"는 목록에 없습니다.");
				break;
			}
		}
	}
	
	public void menu() {
		for(;;){
			System.out.println("1. 입력");
			System.out.println("2. 전체 출력");
			System.out.println("3. 동물 삭제");
			System.out.println("4. 동물 수정");
			System.out.println("5. 동물 찾기");
			Scanner in=new Scanner(System.in);
			System.out.println("메뉴선택");
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















