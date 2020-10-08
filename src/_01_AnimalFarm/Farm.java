package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	ArrayList<Animal> farm = new ArrayList<Animal>();
	farm.add(new Sheep());
	farm.add(new Pig());
	farm.add(new Chicken());
	farm.add(new Sheep());
	farm.add(new Cow());
	farm.add(new Pig());
	for(int i = 0; i < farm.size();i++) {
		farm.get(i).makeNoise();
		farm.get(i).calculateValue();
	}
}
}
