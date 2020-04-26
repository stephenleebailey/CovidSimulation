
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
	
}
