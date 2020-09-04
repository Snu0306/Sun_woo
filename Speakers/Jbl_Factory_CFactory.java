package Speakers;

public class Jbl_Factory_CFactory implements Speaker_AFactory{
	@Override
	public Case_AProduct creatCase() {
	
		System.out.println("Jbl Speaker's Case is producted");
		
		return new Jbl_Case_CProduct();
	}
	
	@Override
	public Parts_AProduct creatParts() {

		System.out.println("Jbl Speaker's Parts are producted");
		
		return new Jbl_Parts_CProduct();
	}
	
}
