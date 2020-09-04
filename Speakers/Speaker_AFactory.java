package Speakers;

//내가 스피커를 만들어 파는 사람 (jbl boss)두개 스피커를 만들기 위해 메이커에 맞는 케이스랑 부품이 필요함 
public interface Speaker_AFactory {
	// Abstract Factory 는 concrete product 를 이어주는 인터페이스
	Case_AProduct creatCase();
	Parts_AProduct creatParts();
	
}
