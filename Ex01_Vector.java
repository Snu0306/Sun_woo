import java.util.Vector;

/*
 Collection FrameWork
 [다수의] 데이터를 다루는 표준화된 인터페이스를 구현하고있는 클래스의 집합
 
 Collection(인터페이스) -> List(인터페이스가 상속) -> ArrayList(class)가 구현하고 있음
  					 ->	Set (인터페이스가 상속) -> HashSet, TreeSet(class)가 구현하고 있음
  					 
 Map(인터페이스) : key,value -> HashMap(class)이 구현하고 있음
 
 1. List (줄을 서시오!)
 	=> 순서가 있다, 중복이 가능하다. => 내부적으로 데이터(자료, 객체)들을 배열로 관리한다.=> 번호가 있다.>> 배열로 관리[홍길동][홍길동][홍길동] 가능
 	
  1.1 Vector(구버전)    -> 동기화 보장(멀티 스레드) -> Lock 장치로(보호) 가능 -> 성능은 조금 떨어짐 
  1.2 ArrayList(신버전) -> 동기화 보장(멀티 스레드)에서 하지 않음 -> Lock장치 없음(default) -> 필요에 따라 쓸수 있게 -> 성능우선
  
 기존에 여러가지 같은 타입의 데이터 관리 : 오직 Array 정적(고정)
 방의 개수가 한번 정해지면 (방의 크기) 변경 불가
 int[] arr = new int[5];
 arr[0] = 100; 만 쓰더라도 지은건 축소 불가!
 또는 
 arr[10] 이 필요해도 늘릴 수 없음
 
 int[] arr ={10,20,30};
 하면 방 3개짜리로 딱 고정

 Array 
 1. 배열의 크기가 고정 : Car[] cars = {new Car(), new Car()} : 방 2개
 2. 접근방법 (index 첨자) 방번호로 접근 : cars[0] = ... : 0번째 부터 n번째 까지 -> 마지막 방의 번호는 : lenght-1이다.
 3. 초기 설정 불가
 
 <Collection>
 List interface 구현하고 있는 Vector ArrayList
 1. 배열의 크기를 동적으로 확장,축소 가능 늘리는 것 가능
 	(사실은 배열의 재 할당을 이용한다.)
 2. 순서를 유지할 수 있다.(중복값을 허용한다.	)
 3. 데이터 저장공간으로 Array를 이용한다.
 
 
 
 
 
 
 
 
 
 
 
 
 */

public class Ex01_Vector {

	public static void main(String[] args) {

		Vector v = new Vector();

		System.out.println("초기 default용량 : " + v.capacity());
		System.out.println("size : " + v.size());
		v.add("AA");
		v.add("AA");
		v.add("AA");
		v.add("AA");
		v.add("100");
		System.out.println("size : " + v.size());
		System.out.println(v.toString());
		// vector의 toString() 은 재정의 돼 있더라
		// Array >> length => Collection >> size

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i)); // get(index) 값을리턴

		}
		// == 정적배열의 arr[index]

		// 개선된for문
		for (Object obj : v) {
			System.out.println(obj);
		}

		// 제너릭 >> 타입을 강제 >> 추후학습할거임
		Vector<String> v2 = new Vector<String>(); // String을 담을 수 있는 그릇
		v2.add("string"); // 문자열만 넣게 강제함

		v2.add("hello");
		v2.add("world");
		for (String str : v2) {
			System.out.println(str);
		}

		////////////////////////////////////////

		Vector v3 = new Vector();
		System.out.println(v3.capacity());// 10개

		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");

		System.out.println(v3.capacity());

		v3.add("A");

		System.out.println(v3.capacity());

	}

}
