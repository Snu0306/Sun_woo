import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {
	public static void main(String[] args) {
		// 사원 한명 만들어라
		Emp emp = new Emp(100, "김유신", "군인");
		System.out.println(emp.toString());

		// 사원 2명(Array)
		Emp[] emplist = { new Emp(100, "김씨", "일반"), new Emp(200, "박씨", "학생") };

		for (Emp e : emplist) {
			System.out.println(e.toString());
		}
		// 1명 더 추가해라 =>Arraylist 써야함

		ArrayList elist = new ArrayList();
		elist.add(new Emp(1, "강씨", "IT"));
		elist.add(new Emp(2, "김씨", "IT"));
		// 1명 더?
		elist.add(new Emp(3, "이씨", "IT"));

		System.out.println(elist.size());
		System.out.println(elist.get(0).toString());

		for (int i = 0; i < elist.size(); i++) {
			System.out.println(elist.get(i));
		}

		// toString() 사용하지 말고 사원의 사번 이름 직종 출력하라
		// 함수 호출해서 출력

		for (int i = 0; i < elist.size(); i++) {
			Object obj = elist.get(i); // 다시 받아
			Emp e = (Emp) obj; // 다운케스팅
			System.out.println(e.getEmpno() + "/" + e.getEname() + "/" + e.getJob());

		}
		// 이런식의 코드는 좋지 않은 코드임 증말짜증나는 코드

		for (Object obj : elist) {
			Emp em = (Emp) obj;

		}
		// 염병 이거도 똑같음
		// 졸라 불편함
		// Object 안쓰고 다운케스팅 안하고도 객체생성 할수있게 해 줘잉!!!

		// 제너릭 두두둥장
		// 객체 생성시 아에 타입을 강제할 수 있게 만듦

		// 현업에서 만나는 코드는 90%가 제너릭 코드들이다.

		ArrayList<Emp> list2 = new ArrayList<Emp>();
		// Emp 타입을 준거임 원래 힙메모리에 오브젝트타입으로 만들었는데 제너릭 통해서 Emp타입으로 생성하게 딱 한정해 놓음

		list2.add(new Emp(1, "A", "IT"));

		for (Emp e : list2) {
			System.out.println(e.getEmpno());
		}

	}
}
