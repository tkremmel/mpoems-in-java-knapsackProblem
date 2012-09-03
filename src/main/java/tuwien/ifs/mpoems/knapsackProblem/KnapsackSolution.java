/**
 * 
 */
package tuwien.ifs.mpoems.knapsackProblem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

import tuwien.ifs.mpoems.*;
/**
 * @author Thomas Kremmel - eMail: thomas.kremmel@gmail.com
 * 27.09.2007
 * 09:39:19
 */
public class KnapsackSolution extends Solution {
	
	private KnapsackOne knapOne = KnapsackOne.getInstance();
	private KnapsackTwo knapTwo = KnapsackTwo.getInstance();
	private ArrayList<double[]> sortedRatioListKnapsackOne = knapOne.getSortedRatioList();
	private ArrayList<double[]> sortedRatioListKnapsackTwo = knapTwo.getSortedRatioList();
	
	private double objectiveProfitKnapsackOne;
	private double objectiveProfitKnapsackTwo;
	
	public double weightKnapsackOne;
	public double weightKnapsackTwo;
	
	public Vector<Integer> solutionVector;
	
	protected Random generator = new Random();
	
	/* (non-Javadoc)
	 * @see mPOEMS.Solution#Solution()
	 */
	public KnapsackSolution() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see mPOEMS.Solution#Solution(int index)
	 */
	public KnapsackSolution(int index) {
		super(index);
	}

	/* (non-Javadoc)
	 * @see mPOEMS.Solution#initSubClass()
	 */
	public void initSubClass(){
		solutionVector = new Vector<Integer>(knapOne.getKnapsackSize());
		for(int i = 0; i < knapOne.getKnapsackSize(); i++){
			if(generator.nextInt() % 2 == 0)solutionVector.add(i,0);
			else solutionVector.add(i,1);
		}
	}
	
	/* (non-Javadoc)
	 * @see mPOEMS.Solution#deepCopy()
	 */
	public void deepCopy(){
            this.solutionVector = (Vector<Integer>)this.solutionVector.clone();
	}
	
	/* 
	 * assigns the solution Vector the parameter solution 
	 */
	protected void setSolutionVector(Vector<Integer> solution){
		this.solutionVector = solution;
	}
	
	/* 
	 * @return the solution Vector
	 */
	protected Vector<Integer> getSolutionVector(){
		return solutionVector;
	}
	
	/* (non-Javadoc)
	 * @see mPOEMS.Solution#applyActions(mPOEMS.ASPopulation)
	 */
	public SolutionSet applyActions(ASPopulation ASPop) {
		SolutionSet sS = new SolutionSet();
		
		Iterator<ActionSequence> iterPop = ASPop.iterator();
		int index = 0;
		//int changeCount = 0;
		
		//loop over all actionsequences in ASPOP
		while (iterPop.hasNext()) {
			//System.out.println("-------------");
			//System.out.println("AS Nr " + index);
			ActionSequence as = iterPop.next();
			//System.out.println(as.hashCode());
			//System.out.println(as.toString());
			Iterator<Action> iterAction = as.iterator();
			KnapsackSolution s = new KnapsackSolution(index);
			Vector<Integer> temp = (Vector<Integer>)this.getSolutionVector().clone();
			
			//loop over all actions in the actionsequence as
			while (iterAction.hasNext()) {
				KnapsackAction a = (KnapsackAction)iterAction.next();
				String aType = a.getActionType();
				//System.out.println(aType);
				//System.out.println(a.getParameter(0));
				
				//apply action
				if(aType.equals("INVERT")){
					int e = (Integer)a.getParameters();
					if((Integer)temp.get(e)==0){
						temp.set(e,1);
					}
					else {
						temp.set(e,0);
					}
				}
			}
			s.setNObjectives(this.nObjectives);
			s.objectives = new double[this.nObjectives];
			s.objectivesMaxMin = this.getObjectivesMaxMin().clone();
			s.setSolutionVector(temp);
			
			//check if temp solution vector differs from prototype solution vector
			//prevent solutions which are equal to the prototype
			int i = 0;
			boolean equal = true;
			while(i < temp.size()){
				if(temp.get(i) != this.solutionVector.get(i)){
					equal = false;
					i = temp.size();
				}
				i++;
			}
			
			//if new solution vector is equal..
			//assign the objectives the worst case values so that the solution will be moved to 
			//the worst front and will not win any tournament. So, it will not be copied to the 
			//new population. 
			if(equal){
				s.objectives[0] = 0;
				s.objectives[1] = 0;
			}
			
			//it they are not equal calculate the objectives
			if(!equal){
				s.calcObjectives();
			}
			
			sS.add(s);
			index++;
		}
		return sS;
	}

	

	/* calc objectives with removing items by worst profit weight ratio
	 * @see mPOEMS.Solution#calcObjectives()
	 */
	public void calcObjectives() {
		weightKnapsackOne = 0;
		weightKnapsackTwo = 0;
		
		objectiveProfitKnapsackOne = 0;
		objectiveProfitKnapsackTwo = 0;
		
		//calculate the weight for each knapsack
		for(int i = 0; i < solutionVector.size(); i++){
			if((Integer)solutionVector.get(i)==1){
				KnapsackItem item = knapOne.getItem(i);
				weightKnapsackOne += item.getWeight();
				
				KnapsackItem item2 = knapTwo.getItem(i);
				weightKnapsackTwo += item2.getWeight();
			}
		}
		
		//calculate how much a knapsack exceeds its capacity
		double exceedingOne = weightKnapsackOne - knapOne.getCapacity();
		double exceedingTwo = weightKnapsackTwo - knapTwo.getCapacity();
		
		//if both knapsacks exceed their capacity
		//repair the one first which exceeds its capacity most
		if(exceedingOne > 0 && exceedingTwo > 0){
			if(exceedingOne > exceedingTwo){
				while(exceedingOne > 0){
					//begin to repair
					//begin at the beginning of the knapsack 
					//sortedRatioListKnapsackOne ordered the index of items regarding their profit weight ratio
					//remove items first with the worst weight/profit ratio
					
					for(int i = 0; i < sortedRatioListKnapsackOne.size(); i++){
						double [] indexRatio = sortedRatioListKnapsackOne.get(i);
						int index2remove = (int)indexRatio[0];
						
						if((Integer)solutionVector.get(index2remove)==1){
							
							solutionVector.set(index2remove,0);

							KnapsackItem item = knapOne.getItem(index2remove);
							exceedingOne -= item.getWeight();
							weightKnapsackOne -= item.getWeight();
							
							i = sortedRatioListKnapsackOne.size();
						}
					}
				}
				weightKnapsackTwo = 0;
				//calculate weight of knapsackTwo again
				//check later if it still exceeds its capacity
				for(int i = 0; i < solutionVector.size(); i++){
					if((Integer)solutionVector.get(i)==1){
						KnapsackItem item2 = knapTwo.getItem(i);
						weightKnapsackTwo += item2.getWeight();
					}
				}
			}
			else{
				//do the same repair algorithm for knapsack2 if this knapsack exceeds its capacity most
				while(exceedingTwo > 0){
					for(int i = 0; i < sortedRatioListKnapsackTwo.size(); i++){
						double [] indexRatio = sortedRatioListKnapsackTwo.get(i);
						int index2remove = (int)indexRatio[0];
						if((Integer)solutionVector.get(index2remove)==1){
							
							solutionVector.set(index2remove,0);

							KnapsackItem item = knapTwo.getItem(index2remove);
							exceedingTwo -= item.getWeight();
							weightKnapsackTwo -= item.getWeight();
							
							i = sortedRatioListKnapsackTwo.size();
						}
					}
				}
				weightKnapsackOne = 0;
				for(int i = 0; i < solutionVector.size(); i++){
					if((Integer)solutionVector.get(i)==1){
						KnapsackItem item2 = knapOne.getItem(i);
						weightKnapsackOne += item2.getWeight();
					}
				}
			}
		}
		
		exceedingOne = weightKnapsackOne - knapOne.getCapacity();
		exceedingTwo = weightKnapsackTwo - knapTwo.getCapacity();
		
		//one knapsack could still exceeds its capacity
		//repair it
		while(exceedingOne > 0){
			for(int i = 0; i < sortedRatioListKnapsackOne.size(); i++){
				double [] indexRatio = sortedRatioListKnapsackOne.get(i);
				int index2remove = (int)indexRatio[0];
				if((Integer)solutionVector.get(index2remove)==1){
					
					solutionVector.set(index2remove,0);

					KnapsackItem item = knapOne.getItem(index2remove);
					exceedingOne -= item.getWeight();
					weightKnapsackOne -= item.getWeight();
					
					i = sortedRatioListKnapsackOne.size();
				}
			}
		}
		while(exceedingTwo > 0){
			for(int i = 0; i < sortedRatioListKnapsackTwo.size(); i++){
				double [] indexRatio = sortedRatioListKnapsackTwo.get(i);
				int index2remove = (int)indexRatio[0];
				if((Integer)solutionVector.get(index2remove)==1){
					
					solutionVector.set(index2remove,0);

					KnapsackItem item = knapTwo.getItem(index2remove);
					exceedingTwo -= item.getWeight();
					weightKnapsackTwo -= item.getWeight();
					
					i = sortedRatioListKnapsackTwo.size();
				}
			}
		}
		
		weightKnapsackOne = 0;
		weightKnapsackTwo = 0;
		
		objectiveProfitKnapsackOne = 0;
		objectiveProfitKnapsackTwo = 0;
		
		//calculate weight again , calculate profit
		for(int i = 0; i < solutionVector.size(); i++){
			if((Integer)solutionVector.get(i)==1){
				KnapsackItem item = knapOne.getItem(i);
				weightKnapsackOne += item.getWeight();
				objectiveProfitKnapsackOne += item.getProfit();
				
				KnapsackItem item2 = knapTwo.getItem(i);
				weightKnapsackTwo += item2.getWeight();
				objectiveProfitKnapsackTwo += item2.getProfit();
			}
		}
		
		//set the objectives
		objectives[0] = objectiveProfitKnapsackOne;
		objectives[1] = objectiveProfitKnapsackTwo;
	}
	
	
	
	/* (non-Javadoc) calcObjectives with random selection of items to remove
	 * @see mPOEMS.Solution#calcObjectives()
	 */
	public void calcObjectivesByRandom() {
		weightKnapsackOne = 0;
		weightKnapsackTwo = 0;
		
		objectiveProfitKnapsackOne = 0;
		objectiveProfitKnapsackTwo = 0;
		
		//calculate the weight for each knapsack
		for(int i = 0; i < solutionVector.size(); i++){
			if((Integer)solutionVector.get(i)==1){
				KnapsackItem item = knapOne.getItem(i);
				weightKnapsackOne += item.getWeight();
				
				KnapsackItem item2 = knapTwo.getItem(i);
				weightKnapsackTwo += item2.getWeight();
			}
		}
		
		//calculate how much a knapsack exceeds its capacity
		double exceedingOne = weightKnapsackOne - knapOne.getCapacity();
		double exceedingTwo = weightKnapsackTwo - knapTwo.getCapacity();
		
		//if both knapsacks exceed their capacity
		//repair the one first which exceeds its capacity most
		if(exceedingOne > 0 && exceedingTwo > 0){
			if(exceedingOne > exceedingTwo){
				while(exceedingOne > 0){
					//begin to repair
					//begin at the beginning of the knapsack 
					//knapsack is ordered concerning weight/profit ratio
					//remove items first with the worst weight/profit ratio
					
					boolean search = true;
					while(search){
						int i = generator.nextInt(knapOne.getKnapsackSize());
						if((Integer)solutionVector.get(i)==1){
							solutionVector.set(i,0);

							KnapsackItem item = knapOne.getItem(i);
							exceedingOne -= item.getWeight();
							weightKnapsackOne -= item.getWeight();
							
							search = false;
						}
					}
				}
				weightKnapsackTwo = 0;
				//calculate weight of knapsackTwo again
				//check later if it still exceeds its capacity
				for(int i = 0; i < solutionVector.size(); i++){
					if((Integer)solutionVector.get(i)==1){
						KnapsackItem item2 = knapTwo.getItem(i);
						weightKnapsackTwo += item2.getWeight();
					}
				}
			}
			else{
				//do the same repair algorithm for knapsack2 if this knapsack exceeds its capacity most
				while(exceedingTwo > 0){
					boolean search = true;
					while(search){
						int i = generator.nextInt(knapOne.getKnapsackSize());
						if((Integer)solutionVector.get(i)==1){
							solutionVector.set(i,0);

							KnapsackItem item = knapTwo.getItem(i);
							exceedingTwo -= item.getWeight();
							weightKnapsackTwo -= item.getWeight();
							
							search = false;
						}
					}
				}
				weightKnapsackOne = 0;
				for(int i = 0; i < solutionVector.size(); i++){
					if((Integer)solutionVector.get(i)==1){
						KnapsackItem item2 = knapOne.getItem(i);
						weightKnapsackOne += item2.getWeight();
					}
				}
			}
		}
		
		exceedingOne = weightKnapsackOne - knapOne.getCapacity();
		exceedingTwo = weightKnapsackTwo - knapTwo.getCapacity();
		
		//one knapsack could still exceeds its capacity
		//repair it
		while(exceedingOne > 0){
			boolean search = true;
			while(search){
				int i = generator.nextInt(knapOne.getKnapsackSize());
				if((Integer)solutionVector.get(i)==1){
					solutionVector.set(i,0);

					KnapsackItem item = knapOne.getItem(i);
					exceedingOne -= item.getWeight();
					weightKnapsackOne -= item.getWeight();
					
					search = false;
				}
			}
		}
		while(exceedingTwo > 0){
			boolean search = true;
			while(search){
				int i = generator.nextInt(knapOne.getKnapsackSize());
				if((Integer)solutionVector.get(i)==1){
					solutionVector.set(i,0);

					KnapsackItem item = knapTwo.getItem(i);
					exceedingTwo -= item.getWeight();
					weightKnapsackTwo -= item.getWeight();
					
					search = false;
				}
			}
		}
		
		weightKnapsackOne = 0;
		weightKnapsackTwo = 0;
		
		objectiveProfitKnapsackOne = 0;
		objectiveProfitKnapsackTwo = 0;
		
		//calculate weight again , calculate profit
		for(int i = 0; i < solutionVector.size(); i++){
			if((Integer)solutionVector.get(i)==1){
				KnapsackItem item = knapOne.getItem(i);
				weightKnapsackOne += item.getWeight();
				objectiveProfitKnapsackOne += item.getProfit();
				
				KnapsackItem item2 = knapTwo.getItem(i);
				weightKnapsackTwo += item2.getWeight();
				objectiveProfitKnapsackTwo += item2.getProfit();
			}
		}
		
		//set the objectives
		objectives[0] = objectiveProfitKnapsackOne;
		objectives[1] = objectiveProfitKnapsackTwo;
	}
	
	
	/* (non-Javadoc)
	 * @see mPOEMS.Solution#calcObjectives()
	 *//*
	public void calcObjectives() {
		weightKnapsackOne = 0;
		weightKnapsackTwo = 0;
		
		objectiveProfitKnapsackOne = 0;
		objectiveProfitKnapsackTwo = 0;
		
		//calculate the weight for each knapsack
		for(int i = 0; i < solutionVector.size(); i++){
			if((Integer)solutionVector.get(i)==1){
				KnapsackItem item = knapOne.getItem(i);
				weightKnapsackOne += item.getWeight();
				
				KnapsackItem item2 = knapTwo.getItem(i);
				weightKnapsackTwo += item2.getWeight();
			}
		}
		
		//calculate how much a knapsack exceeds its capacity
		double exceedingOne = weightKnapsackOne - knapOne.getCapacity();
		double exceedingTwo = weightKnapsackTwo - knapTwo.getCapacity();
		
		//if both knapsacks exceed their capacity
		//repair the one first which exceeds its capacity most
		if(exceedingOne > 0 && exceedingTwo > 0){
			if(exceedingOne > exceedingTwo){
				while(exceedingOne > 0){
					//begin to repair
					//begin at the beginning of the knapsack 
					//knapsack is ordered concerning weight/profit ratio
					//remove items first with the worst weight/profit ratio
					for(int i = 0; i < solutionVector.size(); i++){
						if((Integer)solutionVector.get(i)==1){
							solutionVector.set(i,0);

							KnapsackItem item = knapOne.getItem(i);
							exceedingOne -= item.getWeight();
							weightKnapsackOne -= item.getWeight();
							
							i = solutionVector.size();
						}
					}
				}
				weightKnapsackTwo = 0;
				//calculate weight of knapsackTwo again
				//check later if it still exceeds its capacity
				for(int i = 0; i < solutionVector.size(); i++){
					if((Integer)solutionVector.get(i)==1){
						KnapsackItem item2 = knapTwo.getItem(i);
						weightKnapsackTwo += item2.getWeight();
					}
				}
			}
			else{
				//do the same repair algorithm for knapsack2 if this knapsack exceeds its capacity most
				while(exceedingTwo > 0){
					for(int i = 0; i < solutionVector.size(); i++){
						if((Integer)solutionVector.get(i)==1){
							solutionVector.set(i,0);
							
							KnapsackItem item = knapTwo.getItem(i);
							exceedingTwo -= item.getWeight();
							weightKnapsackTwo -= item.getWeight();
							
							i = solutionVector.size();
						}
					}
				}
				weightKnapsackOne = 0;
				for(int i = 0; i < solutionVector.size(); i++){
					if((Integer)solutionVector.get(i)==1){
						KnapsackItem item2 = knapOne.getItem(i);
						weightKnapsackOne += item2.getWeight();
					}
				}
			}
		}
		
		exceedingOne = weightKnapsackOne - knapOne.getCapacity();
		exceedingTwo = weightKnapsackTwo - knapTwo.getCapacity();
		
		//one knapsack could still exceeds its capacity
		//repair it
		while(exceedingOne > 0){
			for(int i = 0; i < solutionVector.size(); i++){
				if((Integer)solutionVector.get(i)==1){
					solutionVector.set(i,0);
					
					KnapsackItem item = knapOne.getItem(i);
					exceedingOne -= item.getWeight();
					weightKnapsackOne -= item.getWeight();
					
					i = solutionVector.size();
				}
			}
		}
		while(exceedingTwo > 0){
			for(int i = 0; i < solutionVector.size(); i++){
				if((Integer)solutionVector.get(i)==1){
					solutionVector.set(i,0);
					
					KnapsackItem item = knapTwo.getItem(i);
					exceedingTwo -= item.getWeight();
					weightKnapsackTwo -= item.getWeight();
					
					i = solutionVector.size();
				}
			}
		}
		
		weightKnapsackOne = 0;
		weightKnapsackTwo = 0;
		
		objectiveProfitKnapsackOne = 0;
		objectiveProfitKnapsackTwo = 0;
		
		//calculate weight again , calculate profit
		for(int i = 0; i < solutionVector.size(); i++){
			if((Integer)solutionVector.get(i)==1){
				KnapsackItem item = knapOne.getItem(i);
				weightKnapsackOne += item.getWeight();
				objectiveProfitKnapsackOne += item.getProfit();
				
				KnapsackItem item2 = knapTwo.getItem(i);
				weightKnapsackTwo += item2.getWeight();
				objectiveProfitKnapsackTwo += item2.getProfit();
			}
		}
		
		//set the objectives
		objectives[0] = objectiveProfitKnapsackOne;
		objectives[1] = objectiveProfitKnapsackTwo;
	}*/
}
