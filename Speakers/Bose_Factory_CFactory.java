package Speakers;

public class Bose_Factory_CFactory implements Speaker_AFactory{
	@Override
	public Case_AProduct creatCase() {
			
		System.out.println("Bose Speaker's Case is producted");
		
		return new Bose_Case_CProduct();
	}
	
	@Override
	public Parts_AProduct creatParts() {
			
		System.out.println("Bose Speaker's Parts are producted");
	
		return new Bose_Parts_CProduct();
	}
	
	
}
