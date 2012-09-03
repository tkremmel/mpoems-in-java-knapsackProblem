package tuwien.ifs.mpoems.knapsackProblem;

import java.util.Enumeration;
import java.util.Vector;

import org.apache.log4j.Logger;

public class calculateWeightProfitTestClass {
	
	static Logger logger = Logger.getLogger(calculateWeightProfitTestClass.class);
	
	private KnapsackOne knapOne = KnapsackOne.getInstance();
	private KnapsackTwo knapTwo = KnapsackTwo.getInstance();
	
	public calculateWeightProfitTestClass(){}
	
	public void printKnapsacks(){
		knapOne.printItemList();
		knapTwo.printItemList();
	}
	
	public void test(KnapsackSolution s){
		logger.trace("---next solution---");
		Vector<Integer> solutionVector = s.solutionVector;
		int weightKnapsackOne = 0;
		int weightKnapsackTwo = 0;
		
		double objectiveProfitKnapsackOne = 0;
		double objectiveProfitKnapsackTwo = 0;
		
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
		logger.trace("objective nr 1 : " + objectiveProfitKnapsackOne);
		logger.trace("objective nr 2 : " + objectiveProfitKnapsackTwo);
		logger.trace("weight nr 1 : " + weightKnapsackOne + " while capacity is 20351.5");
		logger.trace("weight nr 2 : " + weightKnapsackTwo+ " while capacity is 20460");
		logger.trace("solution vector is");
		Enumeration<Integer> e = solutionVector.elements ();
		//String solutionVectorString = "";
		  while (e.hasMoreElements ()) {
			  //solutionVectorString += e.nextElement();
			  logger.trace(e.nextElement());
		}
		//logger.trace(solutionVectorString);
	}
}
