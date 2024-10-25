
public class variable2노트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. static 변수 
     		// 1) 클래스 로딩타임에 JVM이 관리하는 Methof Area라는 메모리 영역에 하나만 생김.
			// 2) 객체 생성 없이 사용할 수 있는 변수
			// 3) 클래스의 모든 객체들이 값을 공유하는 변수. 클래스에 객체들이 만들어지면 각자 고유한 값을 가지지만.
			// static memver variable
		
      //2. non static  변수
			//1) 실행타임에 JVM이 관리하는 Heap Area 라는 메모리 영역에 생김
			//2) 객체가 생성되면 객체마다 가지게 되는 변수 = 변수마다 변수의 값을 달리 할 수있음	
			
		
				/*         JVM  메모리 내부의 시간에 따른 진행순서
					
				-method Area              ①컴파일 타임
				static area
				static int i;
				클래스 코드, 메소드
				
				
				
				-Heap Area                ② 클래스 로딩 타임
				non static						static
				객체 데이터들
				주체, 객체
				메소드에서 선언한
				변수들.
				
				-Stack Area				③ 실행시간		
					지역변수						non static 
				호출 stack						local
			*/
			
	/*	자바 실행될 때 컴파일 타임이 있다.
 	
	*/
	}

}
