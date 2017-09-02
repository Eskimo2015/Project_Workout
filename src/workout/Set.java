package workout;

public class Set {
	
	int repMax;
	int repCount;
	
	Set(){}
	Set(int newRepMax){
		repMax = newRepMax;
		repCount = repMax;
	}
	
	public void setRepMax(int newRepMax){repMax = newRepMax;}
	public int getRepMax(){return repMax;}
	public void setRepCount(int newRepCount){repCount = newRepCount;}
	public int getRepCount(){return repCount;}
	public void addRep(){
		if(repCount < repMax)
			repCount++;
	}
	public void deductRep(){
		if(repCount > 0)
			repCount--;
	}
	public void repReset(){repCount = repMax;}
}
