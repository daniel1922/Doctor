package Doctor;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Do you need a family doctor or a surgeon?");
		System.out.println("Would you like a doctor that makes House Calls or Works at a Hospital?");
		System.out.println("Enter Housecalls or WorksAtHospital");
		Scanner input = new Scanner(System.in);
		input.nextLine();
		
		Doctor d1 = new Doctor();
		FamilyDoctor famDoc= new FamilyDoctor();
		Surgeon surDoc = new Surgeon();
		d1.treatPatient();
		input.close();
		
		
		
		if(d1.WorksAtHospital){
			System.out.println(surDoc.WorksAtHospital);
		}
		else{
			System.out.println(famDoc.MakesHouseCalls);
		
		}
	}
}