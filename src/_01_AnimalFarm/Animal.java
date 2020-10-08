package _01_AnimalFarm;

public abstract class Animal{
	int value;
	String sound;
	public void makeNoise(){
		System.out.println("This animal makes the sound "+sound+"!");
	}
	public void calculateValue(){
		System.out.println("This animal is worth "+value+" dollars!");
			}
}

