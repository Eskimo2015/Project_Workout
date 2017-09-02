package workout;

import java.util.ArrayList;

public class WarmUp {
	String wupName;
	double maxWeight;
	double wupWeight;
	boolean deadLift;
	int setTotal;
	ArrayList<WarmUpSet> warmUpSets;
	
	WarmUp(){}
	WarmUp(String newName){}
	WarmUp(String exName, double exWeight){
		wupName = exName + " Warm Up";
		maxWeight = exWeight;
		checkDeadLift(exName); //initialise wupWeight - set boolean
		warmUpSets = new ArrayList<>();
		createWarmUpSets();
		
	}
	
	void createWarmUpSets(){
		for(int i = 0; i < 5; i++)
		 	warmUpSets.add(new WarmUpSet());
	}svvdsvdsv
	void checkDeadLift(String exName){
		if("Deadlift" == exName || "Barbell Row" == exName) {
			wupWeight = 20;
			deadLift = true;
		}else {
			wupWeight = 0;
			deadLift = false;
			//System.out.println("These exercises start with 20kg load");
		}
	}
	void setDeadLift(boolean is){}
	boolean isDeadLift(){return deadLift;}
	void calculateWarmUpSetWeight(double maxWeight){//overloading
		double weight;
		int rep;
		
		if(maxWeight / 20 > 1)
			wupWeight = 1;
		warmUpSets.add(new WarmUpSet(weight, rep));
	}
	void calculateRepQuantity(){}
	void countSetTotal(){}
}
