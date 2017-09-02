package workout;

import java.util.ArrayList;

public class Exercise {
	
	String exName;
	double exWeight;
	int setMax;
	ArrayList<Set> exSets;
	WarmUp warmUp;
	
	Exercise(){}
	Exercise(String newName){
		exName = newName;
	}
	Exercise(String newName, double newWeight, int newMax){
		exName = newName;
		exWeight = newWeight;
		setMax = newMax;
	}

	public void createSets() {}
}
