/**
 * 
 */
package tuwien.ifs.mpoems.knapsackProblem;

/**
 * @author Thomas Kremmel - eMail: thomas.kremmel@gmail.com
 * 27.09.2007
 * 09:39:19
 */
public class KnapsackItem {

	private int weight;
	private int profit;
	private double ratio;
	private int itemNr;
	
	
	public KnapsackItem(int weight, int profit){
		this.weight = weight;
		this.profit = profit;
		ratio = ((double)weight)/((double)profit);
	}
	
	public int getWeight(){
		return weight;
	}
	
	public int getProfit(){
		return profit;
	}
	
	public double getRatio(){
		return ratio;
	}

	/**
	 * @return the itemNr
	 */
	public int getItemNr() {
		return itemNr;
	}
	
}
