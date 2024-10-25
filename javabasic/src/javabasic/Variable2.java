package javabasic;

public class Variable2 {

	//1. static 변수 
	// 1) 클래스 로딩타임에 JVM이 관리하는 Methof Area라는 메모리 영역에 하나만 생김.
	// 2) 객체 생성 없이 사용할 수 있는 변수
	// 3) 클래스의 모든 객체들이 값을 공유하는 변수. 클래스에 객체들이 만들어지면 각자 고유한 값을 가지지만.
	// static memver variable
	
	static int si = 1; 
	 int nsi = 2;
	
	public static void main(String[] args) {

		Variable2 v2_1 = new Variable2(); //객체를 하나 생성했음.
		Variable2 v2_2 = new Variable2();
		System.out.println(v2_1.si);//1
		System.out.println(v2_2.si);//1
		
		//static 변수는 메모리에 한번만 만들어 지고 모든 객체들이 값을 공유한다.
		System.out.println(v2_1.nsi);//2
		System.out.println(v2_2.nsi);//2		
		
		v2_1.si = 2;
		System.out.println(v2_1.si);//2
		System.out.println(v2_2.si);//2
		
		// non static  변수는 객체마다 가지게 하나씩 가지게 되는 변수
		
		v2_1.nsi = 5;
		System.out.println(v2_1.nsi);//5
		System.out.println(v2_2.nsi);//2				
		


		
		
		// main 메소드의 지역변수
		// main 메소드가 호출되면 메모리에 생겼다가 main메소드가 종료되면 소멸
		int li = 3; 
		
	}
	
	//non static member method  (main 밖에다 만들어야 함)
	public int add(int i, int j) {
		// add 메소드의 지역변수
		int sum = i + j;
		return i + j ;
		
	}	

}