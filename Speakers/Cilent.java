package Speakers;

public class Cilent {
	public static void main(String[] args) {
		SpeakerFactory speaker = new SpeakerFactory();
		
		speaker.makeNewSpeaker("Bose");
		speaker.makeNewSpeaker("Jbl");
		
	}
}
