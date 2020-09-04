package Speakers;

public class SpeakerFactory {
	
	public void makeNewSpeaker(String speakerName){
		Speaker_AFactory speaker =null;
		
		if(speakerName.equals("Bose")) {
			speaker = new Bose_Factory_CFactory();
		}else if(speakerName.equals("Jbl")) {
			speaker = new Jbl_Factory_CFactory();
		}
		
		speaker.creatCase();
		speaker.creatParts();
		
	}
}
