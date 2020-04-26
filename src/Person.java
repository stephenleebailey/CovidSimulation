import java.util.Random;
public class Person {
	private gender gender;
	private boolean infected;
	private boolean immune;
	private int age;
	private boolean highRisk;
	private boolean keyWorker;
	
	public gender getGender() {
		return gender;
	}
	
	public void setGender(gender gender) {
		this.gender = gender;
	}
	
	public boolean isInfected() {
		return infected;
	}
	
	public void setInfected(boolean infected) {
		this.infected = infected;
	}
	
	public boolean isImmune() {
		return immune;
	}
	
	public void setImmune(boolean immune) {
		this.immune = immune;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isHighRisk() {
		return highRisk;
	}
	
	public void setHighRisk(boolean highRisk) {
		this.highRisk = highRisk;
	}
	
	public boolean isKeyWorker() {
		return keyWorker;
	}
	
	public void setKeyWorker(boolean keyWorker) {
		this.keyWorker = keyWorker;
	}
	
	public void generatePerson() {
		Random rand = new Random();
		double randomDouble = rand.nextDouble();
		
		if(randomDouble <= 0.5) {
			this.gender = gender.Male;
		}else {
			this.gender = gender.Female;
		}
		
		randomDouble = rand.nextDouble();
		
		if(randomDouble < 0.2) {
			this.keyWorker = true;
		}else {
			this.keyWorker = false;
		}
		
		randomDouble = rand.nextDouble();
		
		if(randomDouble < 0.2) {
			this.highRisk = true;
		}else {
			this.highRisk = false;
		}
	}
}
