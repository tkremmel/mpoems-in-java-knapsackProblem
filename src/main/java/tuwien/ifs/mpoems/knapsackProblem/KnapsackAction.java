package tuwien.ifs.mpoems.knapsackProblem;

import tuwien.ifs.mpoems.Action;

/**
 * @author Thomas Kremmel - eMail: thomas.kremmel@gmail.com
 * 27.09.2007
 * 09:39:19
 */
public class KnapsackAction extends Action {

	private int knapsackSize;
	private int parameters;
	
	public KnapsackAction() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see mPOEMS.Action#init()
	 */
	public void init() {
		knapsackSize = 750;
		this.actionBase = new String [] {"NOP","INVERT"};
		this.parameters = 0;
	}
	
	/**
	 * assign the actionType to this action
	 * set the actionType to an active or NOP action
	 */
	public void setActionType(double pActive){ 
		if(generator.nextDouble() < (pActive/100)){
			this.actionType = actionBase[1];
			this.activeActionType = this.actionType;
		}
		else {
			this.actionType = actionBase[0];
			this.activeActionType = actionBase[1];
		}
		initParameters();
	}
	
	public void initParameters(){
		this.parameters = new Integer(generator.nextInt(knapsackSize));
	}
	
	public void mutateParameters(){
		this.parameters = new Integer(generator.nextInt(knapsackSize));
	}
	
	/**
	 * @return the parameters 
	 */
	public int getParameters(){
		return parameters;
	}
	
	
	
	/**
	 *  sets the parameters HashMap
	 */
	/*public void setParameters(HashMap<Integer,Integer> param){
		this.parameters = param;
	}*/
	
	
	
	public void deepCopy(){
		this.parameters = new Integer(this.parameters);
       //empty method. no problem dependent objects to copy
	}
}
