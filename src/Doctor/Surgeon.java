package Doctor;

public class Surgeon extends Doctor {
	//Make instance Variables
	boolean MakesHouseCalls;
	boolean WorksAtHospital;
	
	//Make Constructor
	public Surgeon(){
		WorksAtHospital=true;
		MakesHouseCalls=false;
	}
	@Override
	
	protected void treatPatient(){
		System.out.println("I am a surgeon!");
		

	}
}