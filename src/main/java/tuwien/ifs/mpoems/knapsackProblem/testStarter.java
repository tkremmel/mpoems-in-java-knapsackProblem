package tuwien.ifs.mpoems.knapsackProblem;

import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;

import org.apache.log4j.Logger;

import tuwien.ifs.mpoems.Solution;
import tuwien.ifs.mpoems.SolutionSet;
import tuwien.ifs.mpoems.mPoemsAlgorithm;
import tuwien.ifs.mpoems.analysis.XLSOutput;

public class testStarter {

	static Logger logger = Logger.getLogger(testStarter.class);
	
	private static void printNDSofBase(SolutionSet base){
		Iterator<Solution> itr = base.iterator();
		//calculateWeightProfitTestClass test = new calculateWeightProfitTestClass();
		int z = 0;
		while (itr.hasNext()) {
		  Solution element = itr.next();
		  if(element.getFront() == 1){
			  int c = 1;
			  //logger.trace("Solution Nr. " + z);
			  z++;
			  for(double obj: element.getObjectives()) {
				  logger.trace("       Objective Nr." + c + " is " + obj);
				  c++;
			  }
		  	}
		}
	}
	
	private static void printNDSSummary(SolutionSet base){
		Iterator<Solution> itr = base.iterator();
		int w = 0;
		while (itr.hasNext()) {
		  Solution element = itr.next();
		  if(element.getFront() == 1){
			  int y = 1;
			  w++;
			  String sObj = "";
			  for(double obj: element.getObjectives()) {
				  sObj = sObj + obj + " ";
				  y++;
			  }
			  //logger.trace(sObj); 
		  }
		}
	}
	
	private static void makeTest(SolutionSet result){
		calculateWeightProfitTestClass testClass = new calculateWeightProfitTestClass();
		//testClass.printKnapsacks();
		Iterator<Solution> itr = result.iterator();
		//logger.trace("--check solutions - calculate weight and profit --");
		while (itr.hasNext()) {
		  KnapsackSolution element = (KnapsackSolution)itr.next();
		  testClass.test(element);
		}
	}
	
	private static void printBaseSummary(SolutionSet base){
		Iterator<Solution> itr = base.iterator();
		int w = 0;
		while (itr.hasNext()) {
		  Solution element = itr.next();
		  int y = 1;
		  w++;
		  String sObj = "";
		  for(double obj: element.getObjectives()) {
			  sObj = sObj + obj + " ";
			  y++;
		  }
		  //  logger.trace(sObj); 
		}
	}
	
	public static void main(String[] args) {
		try{
			
			Properties properties = new Properties();
		    properties.load(testStarter.class.getResourceAsStream("mPOEMSConf.cfg"));

			mPoemsAlgorithm algo = new mPoemsAlgorithm();
			algo.setProblem(KnapsackSolution.class, KnapsackAction.class);
			algo.init(properties);
			SolutionSet result = algo.start();
			Vector<SolutionSet> allBases = algo.getAllBases();
		
			XLSOutput xlsOutput = new XLSOutput();
		    xlsOutput.createXLS("knapsackRun.xls");
			
			xlsOutput.writeDataSheetKnapsack(allBases);
			xlsOutput.writeWorkbook();
		    xlsOutput.closeWorkbook();
		    
			//print summary of last solution base
		    //logger.trace("summary of last solution base:");
			printBaseSummary(result);
			
			//print summary of last nds
			//logger.trace("summary of last nds:");
			printNDSSummary(result);
			//print non dominated fronts of solution base
			//logger.trace("non dominated front in last solution base:");
			printNDSofBase(result);
			//reactivate for printing the solution vectors of the solutions
			//makeTest(result);
		}
		catch(Exception e){
			 System.out.println("mPOEMS stopped because of a fatal error");
			 e.printStackTrace();
		}

	}
}
