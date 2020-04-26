import java.util.Random;
import java.util.ArrayList;
public class CovidSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CovidSimulation run = new CovidSimulation();
		run.runSimulation();
	}
	
	public void runSimulation() {
		Person person = new Person();
		
		person.setAge(10);
		
		System.out.println(person.getAge());
		
		populateWorld();
	}

	private void populateWorld() {
		Random rand = new Random();	
		int low = 10;
		int high = 100;
		int result = rand.nextInt(high-low) + low;
		
		ArrayList<Person> population = new ArrayList<Person>();
		
		for(int i=0; i < result; i++) {
			Person per = new Person();
			per.generatePerson();
			System.out.println(per.getGender().toString() + " " + per.isHighRisk() + " " + per.isKeyWorker());
			population.add(per);

		}
		
		System.out.println("Population size: " + population.size());
		System.out.println("Result = " + result);
	}
}
