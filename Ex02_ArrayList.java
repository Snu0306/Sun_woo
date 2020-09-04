import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Today Point

public class Ex02_ArrayList {
	public static void main(String[] args) {
		// list interface 구현하고 있는 클래스 중 하나
		// => 순서있고, 중복허용하는 데이터 집합

		ArrayList arraylist = new ArrayList();
		// Object 타입을 가지는 정적 배열이 heap메모리에 생성

		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);

		for (Object obj : arraylist) {
			System.out.println(obj);
		}
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println(arraylist.toString());
		System.out.println(arraylist.get(2));

		// add 순차적으로 데이터 넣기
		arraylist.add(0, 111); // 있는 인덱스에 넣으면 원래 애들은 뒤로 하나씩 밀림!!!!!!!!!~
		System.out.println(arraylist.toString());
		arraylist.add(4, 144);
		System.out.println(arraylist);
		// **** 비 순차적인 데이터를 추가하거나 삭제하는 작업은 ArrayList에게는 그렇게 좋은 작업은 아니다.
		// 순서가 있는 데이터의 집합임
		// => 순차적인 데이터의 추가나 삭제를 다룰때 유리하게 사용된다.

		// arraylist.remove(200); 숫자 값을 직접 넣으면 index로 인식해서 예외 생긴다.
		System.out.println(arraylist);

		// ArrayList가 갖고 있는 함수는!?!? 뿌쓩빠쓩
		// [111, 100, 200, 300, 144]이상태

		// contains => 이 값이 있니?
		System.out.println(arraylist.contains(200));

		// clear => data싹 지우고 공간만 남아있다. => size =0 capacity=그대
		arraylist.clear();
		System.out.println(arraylist.size());

		// is => 물어보는거
		System.out.println(arraylist.isEmpty());

		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.isEmpty());

		// 지운데이터 잠시 보관
		System.out.println("삭제전 : " + arraylist.size());
		Object value = arraylist.remove(0); // 0번째 방의 값을 삭제 그값을 리턴
		System.out.println("삭제된 데이터 : " + value);
		System.out.println("삭제후 : " + arraylist.size());
		System.out.println(arraylist);

		// Points of Point
		// 일상다반사
		// 실제 개발자들은 다형성을 무지 이용 => 확장성 유연성에 개굳
		List li = new ArrayList();
		// 이러면 li. 하면 다른거 까지 다 쓸 수 있음
		li.add("가");
		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");
		// 중복 쌉가능 => 첨자로 구분 가능

		List li2 = li.subList(0, 2); // 함수가 만드는 데이터는 순서가 있는 데이터의 집합이다.
		System.out.println(li2.toString());

		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(50);
		alist.add(7);
		alist.add(45);
		alist.add(3);
		alist.add(15);

		System.out.println(alist.toString());
		Collections.sort(alist); // 자동 오름차순 정렬 기능.... 쓰지마 나중에써
		System.out.println(alist.toString());
		Collections.reverse(alist); // 이렇게하면 다시 뒤집어서 내림차순 가능
		System.out.println(alist.toString());

	}
}
