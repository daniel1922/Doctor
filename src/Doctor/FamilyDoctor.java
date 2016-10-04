package Doctor;

public class FamilyDoctor extends Doctor {
	
	//Create instance Variables
	boolean MakesHouseCalls;
	boolean WorksAtHospital;
	
	//Make constructor
	public FamilyDoctor(){
		WorksAtHospital = false;
		MakesHouseCalls = true;
	}	
	
	@Override
	protected void treatPatient(){
		System.out.println("I am a family doctor!");
		
	}

		
	}
	
	



   