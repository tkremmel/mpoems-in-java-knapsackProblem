package tuwien.ifs.mpoems.knapsackProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.apache.log4j.Logger;

/**
 * @author Thomas Kremmel - eMail: thomas.kremmel@gmail.com
 * 27.09.2007
 * 09:39:19
 */
public final class KnapsackTwo{
	static Logger logger = Logger.getLogger(KnapsackOne.class);
	private static KnapsackTwo instance = null;
	private static ArrayList<KnapsackItem> itemList;
	private final static double capacity = 20460;
	ArrayList<double[]> sortedRatioList = new ArrayList<double[]>();
	
	/**
	 * @return the sortedRatioList
	 */
	public ArrayList<double[]> getSortedRatioList() {
		return sortedRatioList;
	}

	private KnapsackTwo() {
		itemList = new ArrayList<KnapsackItem>();

  		itemList.add(new KnapsackItem(86,82));


  		itemList.add(new KnapsackItem(40,71));


  		itemList.add(new KnapsackItem(95,78));


  		itemList.add(new KnapsackItem(51,73));


  		itemList.add(new KnapsackItem(37,43));


  		itemList.add(new KnapsackItem(74,30));


  		itemList.add(new KnapsackItem(28,18));


  		itemList.add(new KnapsackItem(95,28));


  		itemList.add(new KnapsackItem(93,54));


  		itemList.add(new KnapsackItem(18,77));


  		itemList.add(new KnapsackItem(21,82));


  		itemList.add(new KnapsackItem(18,48));


  		itemList.add(new KnapsackItem(22,67));


  		itemList.add(new KnapsackItem(96,15));


  		itemList.add(new KnapsackItem(68,34));


  		itemList.add(new KnapsackItem(17,21));


  		itemList.add(new KnapsackItem(85,52));


  		itemList.add(new KnapsackItem(100,68));


  		itemList.add(new KnapsackItem(74,31));


  		itemList.add(new KnapsackItem(44,93));


  		itemList.add(new KnapsackItem(13,51));


  		itemList.add(new KnapsackItem(30,83));


  		itemList.add(new KnapsackItem(16,78));


  		itemList.add(new KnapsackItem(87,31));


  		itemList.add(new KnapsackItem(59,75));


  		itemList.add(new KnapsackItem(76,30));


  		itemList.add(new KnapsackItem(75,34));


  		itemList.add(new KnapsackItem(34,30));


  		itemList.add(new KnapsackItem(37,62));


  		itemList.add(new KnapsackItem(60,55));


  		itemList.add(new KnapsackItem(12,33));


  		itemList.add(new KnapsackItem(64,64));


  		itemList.add(new KnapsackItem(37,58));


  		itemList.add(new KnapsackItem(26,47));


  		itemList.add(new KnapsackItem(38,40));


  		itemList.add(new KnapsackItem(55,13));


  		itemList.add(new KnapsackItem(95,97));


  		itemList.add(new KnapsackItem(25,77));


  		itemList.add(new KnapsackItem(61,95));


  		itemList.add(new KnapsackItem(32,68));


  		itemList.add(new KnapsackItem(59,42));


  		itemList.add(new KnapsackItem(30,36));


  		itemList.add(new KnapsackItem(35,55));


  		itemList.add(new KnapsackItem(75,25));


  		itemList.add(new KnapsackItem(52,86));


  		itemList.add(new KnapsackItem(37,72));


  		itemList.add(new KnapsackItem(47,68));


  		itemList.add(new KnapsackItem(91,95));


  		itemList.add(new KnapsackItem(89,26));


  		itemList.add(new KnapsackItem(68,85));


  		itemList.add(new KnapsackItem(65,34));


  		itemList.add(new KnapsackItem(30,98));


  		itemList.add(new KnapsackItem(29,85));


  		itemList.add(new KnapsackItem(37,30));


  		itemList.add(new KnapsackItem(35,27));


  		itemList.add(new KnapsackItem(86,73));


  		itemList.add(new KnapsackItem(13,64));


  		itemList.add(new KnapsackItem(43,57));


  		itemList.add(new KnapsackItem(92,73));


  		itemList.add(new KnapsackItem(20,100));


  		itemList.add(new KnapsackItem(27,56));


  		itemList.add(new KnapsackItem(42,82));


  		itemList.add(new KnapsackItem(75,59));


  		itemList.add(new KnapsackItem(92,27));


  		itemList.add(new KnapsackItem(99,35));


  		itemList.add(new KnapsackItem(45,56));


  		itemList.add(new KnapsackItem(12,41));


  		itemList.add(new KnapsackItem(54,33));


  		itemList.add(new KnapsackItem(16,13));


  		itemList.add(new KnapsackItem(14,50));


  		itemList.add(new KnapsackItem(43,57));


  		itemList.add(new KnapsackItem(93,41));


  		itemList.add(new KnapsackItem(79,34));


  		itemList.add(new KnapsackItem(85,50));


  		itemList.add(new KnapsackItem(59,10));


  		itemList.add(new KnapsackItem(22,12));


  		itemList.add(new KnapsackItem(18,45));


  		itemList.add(new KnapsackItem(66,76));


  		itemList.add(new KnapsackItem(58,12));


  		itemList.add(new KnapsackItem(34,30));


  		itemList.add(new KnapsackItem(81,55));


  		itemList.add(new KnapsackItem(78,74));


  		itemList.add(new KnapsackItem(97,40));


  		itemList.add(new KnapsackItem(50,24));


  		itemList.add(new KnapsackItem(35,19));


  		itemList.add(new KnapsackItem(68,13));


  		itemList.add(new KnapsackItem(80,78));


  		itemList.add(new KnapsackItem(48,42));


  		itemList.add(new KnapsackItem(36,73));


  		itemList.add(new KnapsackItem(16,33));


  		itemList.add(new KnapsackItem(77,28));


  		itemList.add(new KnapsackItem(80,58));


  		itemList.add(new KnapsackItem(39,81));


  		itemList.add(new KnapsackItem(54,25));


  		itemList.add(new KnapsackItem(21,74));


  		itemList.add(new KnapsackItem(47,71));


  		itemList.add(new KnapsackItem(22,35));


  		itemList.add(new KnapsackItem(31,69));


  		itemList.add(new KnapsackItem(28,95));


  		itemList.add(new KnapsackItem(52,82));


  		itemList.add(new KnapsackItem(54,46));


  		itemList.add(new KnapsackItem(10,67));


  		itemList.add(new KnapsackItem(19,52));


  		itemList.add(new KnapsackItem(37,33));


  		itemList.add(new KnapsackItem(98,41));


  		itemList.add(new KnapsackItem(33,94));


  		itemList.add(new KnapsackItem(85,66));


  		itemList.add(new KnapsackItem(35,50));


  		itemList.add(new KnapsackItem(88,14));


  		itemList.add(new KnapsackItem(47,57));


  		itemList.add(new KnapsackItem(60,94));


  		itemList.add(new KnapsackItem(59,87));


  		itemList.add(new KnapsackItem(79,85));


  		itemList.add(new KnapsackItem(54,13));


  		itemList.add(new KnapsackItem(79,63));


  		itemList.add(new KnapsackItem(100,97));


  		itemList.add(new KnapsackItem(18,17));


  		itemList.add(new KnapsackItem(82,50));


  		itemList.add(new KnapsackItem(94,98));


  		itemList.add(new KnapsackItem(94,36));


  		itemList.add(new KnapsackItem(72,34));


  		itemList.add(new KnapsackItem(25,23));


  		itemList.add(new KnapsackItem(15,65));


  		itemList.add(new KnapsackItem(24,51));


  		itemList.add(new KnapsackItem(56,21));


  		itemList.add(new KnapsackItem(54,84));


  		itemList.add(new KnapsackItem(74,22));


  		itemList.add(new KnapsackItem(65,92));


  		itemList.add(new KnapsackItem(14,99));


  		itemList.add(new KnapsackItem(71,56));


  		itemList.add(new KnapsackItem(92,33));


  		itemList.add(new KnapsackItem(24,21));


  		itemList.add(new KnapsackItem(27,16));


  		itemList.add(new KnapsackItem(64,60));


  		itemList.add(new KnapsackItem(36,37));


  		itemList.add(new KnapsackItem(85,45));


  		itemList.add(new KnapsackItem(36,23));


  		itemList.add(new KnapsackItem(51,55));


  		itemList.add(new KnapsackItem(37,32));


  		itemList.add(new KnapsackItem(16,96));


  		itemList.add(new KnapsackItem(72,87));


  		itemList.add(new KnapsackItem(61,17));


  		itemList.add(new KnapsackItem(18,24));


  		itemList.add(new KnapsackItem(29,78));


  		itemList.add(new KnapsackItem(16,57));


  		itemList.add(new KnapsackItem(97,50));


  		itemList.add(new KnapsackItem(17,13));


  		itemList.add(new KnapsackItem(85,79));


  		itemList.add(new KnapsackItem(50,85));


  		itemList.add(new KnapsackItem(52,71));


  		itemList.add(new KnapsackItem(32,40));


  		itemList.add(new KnapsackItem(86,45));


  		itemList.add(new KnapsackItem(44,72));


  		itemList.add(new KnapsackItem(71,20));


  		itemList.add(new KnapsackItem(17,32));


  		itemList.add(new KnapsackItem(24,26));


  		itemList.add(new KnapsackItem(60,53));


  		itemList.add(new KnapsackItem(22,11));


  		itemList.add(new KnapsackItem(14,67));


  		itemList.add(new KnapsackItem(90,17));


  		itemList.add(new KnapsackItem(97,84));


  		itemList.add(new KnapsackItem(18,94));


  		itemList.add(new KnapsackItem(18,45));


  		itemList.add(new KnapsackItem(66,79));


  		itemList.add(new KnapsackItem(72,78));


  		itemList.add(new KnapsackItem(56,47));


  		itemList.add(new KnapsackItem(57,71));


  		itemList.add(new KnapsackItem(86,78));


  		itemList.add(new KnapsackItem(19,96));


  		itemList.add(new KnapsackItem(81,91));


  		itemList.add(new KnapsackItem(90,25));


  		itemList.add(new KnapsackItem(57,99));


  		itemList.add(new KnapsackItem(32,52));


  		itemList.add(new KnapsackItem(62,84));


  		itemList.add(new KnapsackItem(74,21));


  		itemList.add(new KnapsackItem(75,11));


  		itemList.add(new KnapsackItem(29,97));


  		itemList.add(new KnapsackItem(49,80));


  		itemList.add(new KnapsackItem(95,88));


  		itemList.add(new KnapsackItem(91,13));


  		itemList.add(new KnapsackItem(27,96));


  		itemList.add(new KnapsackItem(48,93));


  		itemList.add(new KnapsackItem(50,69));


  		itemList.add(new KnapsackItem(55,78));


  		itemList.add(new KnapsackItem(71,29));


  		itemList.add(new KnapsackItem(86,72));


  		itemList.add(new KnapsackItem(82,29));


  		itemList.add(new KnapsackItem(73,21));


  		itemList.add(new KnapsackItem(36,68));


  		itemList.add(new KnapsackItem(94,91));


  		itemList.add(new KnapsackItem(80,79));


  		itemList.add(new KnapsackItem(69,96));


  		itemList.add(new KnapsackItem(31,99));


  		itemList.add(new KnapsackItem(57,69));


  		itemList.add(new KnapsackItem(94,52));


  		itemList.add(new KnapsackItem(71,26));


  		itemList.add(new KnapsackItem(99,37));


  		itemList.add(new KnapsackItem(59,44));


  		itemList.add(new KnapsackItem(29,26));


  		itemList.add(new KnapsackItem(93,34));


  		itemList.add(new KnapsackItem(81,26));


  		itemList.add(new KnapsackItem(36,90));


  		itemList.add(new KnapsackItem(78,46));


  		itemList.add(new KnapsackItem(42,14));


  		itemList.add(new KnapsackItem(42,88));


  		itemList.add(new KnapsackItem(23,95));


  		itemList.add(new KnapsackItem(85,61));


  		itemList.add(new KnapsackItem(43,68));


  		itemList.add(new KnapsackItem(33,56));


  		itemList.add(new KnapsackItem(20,76));


  		itemList.add(new KnapsackItem(50,23));


  		itemList.add(new KnapsackItem(100,48));


  		itemList.add(new KnapsackItem(14,52));


  		itemList.add(new KnapsackItem(25,61));


  		itemList.add(new KnapsackItem(88,40));


  		itemList.add(new KnapsackItem(36,32));


  		itemList.add(new KnapsackItem(10,39));


  		itemList.add(new KnapsackItem(80,72));


  		itemList.add(new KnapsackItem(33,53));


  		itemList.add(new KnapsackItem(77,89));


  		itemList.add(new KnapsackItem(55,55));


  		itemList.add(new KnapsackItem(74,82));


  		itemList.add(new KnapsackItem(27,22));


  		itemList.add(new KnapsackItem(36,75));


  		itemList.add(new KnapsackItem(30,90));


  		itemList.add(new KnapsackItem(23,35));


  		itemList.add(new KnapsackItem(42,61));


  		itemList.add(new KnapsackItem(43,90));


  		itemList.add(new KnapsackItem(88,73));


  		itemList.add(new KnapsackItem(37,85));


  		itemList.add(new KnapsackItem(13,53));


  		itemList.add(new KnapsackItem(42,12));


  		itemList.add(new KnapsackItem(60,18));


  		itemList.add(new KnapsackItem(31,19));


  		itemList.add(new KnapsackItem(84,13));


  		itemList.add(new KnapsackItem(75,67));


  		itemList.add(new KnapsackItem(80,89));


  		itemList.add(new KnapsackItem(14,72));


  		itemList.add(new KnapsackItem(18,99));


  		itemList.add(new KnapsackItem(71,58));


  		itemList.add(new KnapsackItem(73,45));


  		itemList.add(new KnapsackItem(17,100));


  		itemList.add(new KnapsackItem(60,14));


  		itemList.add(new KnapsackItem(30,38));


  		itemList.add(new KnapsackItem(80,22));


  		itemList.add(new KnapsackItem(60,68));


  		itemList.add(new KnapsackItem(30,17));


  		itemList.add(new KnapsackItem(75,92));


  		itemList.add(new KnapsackItem(53,42));


  		itemList.add(new KnapsackItem(74,85));


  		itemList.add(new KnapsackItem(52,29));


  		itemList.add(new KnapsackItem(20,96));


  		itemList.add(new KnapsackItem(95,94));


  		itemList.add(new KnapsackItem(22,88));


  		itemList.add(new KnapsackItem(21,40));


  		itemList.add(new KnapsackItem(44,24));


  		itemList.add(new KnapsackItem(19,10));


  		itemList.add(new KnapsackItem(30,60));


  		itemList.add(new KnapsackItem(50,77));


  		itemList.add(new KnapsackItem(64,42));


  		itemList.add(new KnapsackItem(98,73));


  		itemList.add(new KnapsackItem(48,96));


  		itemList.add(new KnapsackItem(64,25));


  		itemList.add(new KnapsackItem(75,89));


  		itemList.add(new KnapsackItem(74,19));


  		itemList.add(new KnapsackItem(77,39));


  		itemList.add(new KnapsackItem(32,24));


  		itemList.add(new KnapsackItem(46,29));


  		itemList.add(new KnapsackItem(47,43));


  		itemList.add(new KnapsackItem(84,25));


  		itemList.add(new KnapsackItem(95,18));


  		itemList.add(new KnapsackItem(15,66));


  		itemList.add(new KnapsackItem(74,29));


  		itemList.add(new KnapsackItem(58,42));


  		itemList.add(new KnapsackItem(45,65));


  		itemList.add(new KnapsackItem(38,26));


  		itemList.add(new KnapsackItem(33,98));


  		itemList.add(new KnapsackItem(19,60));


  		itemList.add(new KnapsackItem(12,63));


  		itemList.add(new KnapsackItem(34,71));


  		itemList.add(new KnapsackItem(66,72));


  		itemList.add(new KnapsackItem(80,88));


  		itemList.add(new KnapsackItem(60,62));


  		itemList.add(new KnapsackItem(82,70));


  		itemList.add(new KnapsackItem(46,73));


  		itemList.add(new KnapsackItem(76,42));


  		itemList.add(new KnapsackItem(97,98));


  		itemList.add(new KnapsackItem(29,49));


  		itemList.add(new KnapsackItem(36,61));


  		itemList.add(new KnapsackItem(85,42));


  		itemList.add(new KnapsackItem(40,25));


  		itemList.add(new KnapsackItem(24,12));


  		itemList.add(new KnapsackItem(33,34));


  		itemList.add(new KnapsackItem(63,94));


  		itemList.add(new KnapsackItem(38,84));


  		itemList.add(new KnapsackItem(28,84));


  		itemList.add(new KnapsackItem(59,54));


  		itemList.add(new KnapsackItem(10,41));


  		itemList.add(new KnapsackItem(97,100));


  		itemList.add(new KnapsackItem(42,34));


  		itemList.add(new KnapsackItem(96,27));


  		itemList.add(new KnapsackItem(29,82));


  		itemList.add(new KnapsackItem(19,56));


  		itemList.add(new KnapsackItem(95,15));


  		itemList.add(new KnapsackItem(56,19));


  		itemList.add(new KnapsackItem(68,56));


  		itemList.add(new KnapsackItem(98,97));


  		itemList.add(new KnapsackItem(43,55));


  		itemList.add(new KnapsackItem(32,70));


  		itemList.add(new KnapsackItem(61,45));


  		itemList.add(new KnapsackItem(78,35));


  		itemList.add(new KnapsackItem(27,61));


  		itemList.add(new KnapsackItem(61,62));


  		itemList.add(new KnapsackItem(27,62));


  		itemList.add(new KnapsackItem(57,70));


  		itemList.add(new KnapsackItem(82,66));


  		itemList.add(new KnapsackItem(75,84));


  		itemList.add(new KnapsackItem(37,63));


  		itemList.add(new KnapsackItem(31,74));


  		itemList.add(new KnapsackItem(29,56));


  		itemList.add(new KnapsackItem(93,95));


  		itemList.add(new KnapsackItem(28,45));


  		itemList.add(new KnapsackItem(91,16));


  		itemList.add(new KnapsackItem(22,42));


  		itemList.add(new KnapsackItem(52,18));


  		itemList.add(new KnapsackItem(56,12));


  		itemList.add(new KnapsackItem(72,19));


  		itemList.add(new KnapsackItem(53,96));


  		itemList.add(new KnapsackItem(41,76));


  		itemList.add(new KnapsackItem(22,88));


  		itemList.add(new KnapsackItem(22,64));


  		itemList.add(new KnapsackItem(62,37));


  		itemList.add(new KnapsackItem(36,30));


  		itemList.add(new KnapsackItem(95,72));


  		itemList.add(new KnapsackItem(93,71));


  		itemList.add(new KnapsackItem(74,72));


  		itemList.add(new KnapsackItem(66,64));


  		itemList.add(new KnapsackItem(58,31));


  		itemList.add(new KnapsackItem(42,38));


  		itemList.add(new KnapsackItem(27,84));


  		itemList.add(new KnapsackItem(68,20));


  		itemList.add(new KnapsackItem(67,54));


  		itemList.add(new KnapsackItem(15,93));


  		itemList.add(new KnapsackItem(14,69));


  		itemList.add(new KnapsackItem(66,55));


  		itemList.add(new KnapsackItem(16,58));


  		itemList.add(new KnapsackItem(46,58));


  		itemList.add(new KnapsackItem(92,38));


  		itemList.add(new KnapsackItem(72,13));


  		itemList.add(new KnapsackItem(61,76));


  		itemList.add(new KnapsackItem(60,24));


  		itemList.add(new KnapsackItem(86,36));


  		itemList.add(new KnapsackItem(52,53));


  		itemList.add(new KnapsackItem(50,28));


  		itemList.add(new KnapsackItem(35,41));


  		itemList.add(new KnapsackItem(37,98));


  		itemList.add(new KnapsackItem(44,23));


  		itemList.add(new KnapsackItem(91,51));


  		itemList.add(new KnapsackItem(53,56));


  		itemList.add(new KnapsackItem(76,29));


  		itemList.add(new KnapsackItem(56,28));


  		itemList.add(new KnapsackItem(38,64));


  		itemList.add(new KnapsackItem(80,11));


  		itemList.add(new KnapsackItem(85,79));


  		itemList.add(new KnapsackItem(19,37));


  		itemList.add(new KnapsackItem(55,25));


  		itemList.add(new KnapsackItem(22,51));


  		itemList.add(new KnapsackItem(85,62));


  		itemList.add(new KnapsackItem(26,93));


  		itemList.add(new KnapsackItem(51,29));


  		itemList.add(new KnapsackItem(60,60));


  		itemList.add(new KnapsackItem(75,66));


  		itemList.add(new KnapsackItem(12,37));


  		itemList.add(new KnapsackItem(90,19));


  		itemList.add(new KnapsackItem(47,15));


  		itemList.add(new KnapsackItem(25,86));


  		itemList.add(new KnapsackItem(20,81));


  		itemList.add(new KnapsackItem(71,75));


  		itemList.add(new KnapsackItem(36,42));


  		itemList.add(new KnapsackItem(13,26));


  		itemList.add(new KnapsackItem(21,26));


  		itemList.add(new KnapsackItem(98,17));


  		itemList.add(new KnapsackItem(49,82));


  		itemList.add(new KnapsackItem(55,78));


  		itemList.add(new KnapsackItem(23,74));


  		itemList.add(new KnapsackItem(88,80));


  		itemList.add(new KnapsackItem(60,30));


  		itemList.add(new KnapsackItem(71,31));


  		itemList.add(new KnapsackItem(84,43));


  		itemList.add(new KnapsackItem(34,51));


  		itemList.add(new KnapsackItem(13,76));


  		itemList.add(new KnapsackItem(66,56));


  		itemList.add(new KnapsackItem(32,22));


  		itemList.add(new KnapsackItem(88,38));


  		itemList.add(new KnapsackItem(88,55));


  		itemList.add(new KnapsackItem(26,25));


  		itemList.add(new KnapsackItem(37,44));


  		itemList.add(new KnapsackItem(81,42));


  		itemList.add(new KnapsackItem(25,29));


  		itemList.add(new KnapsackItem(71,70));


  		itemList.add(new KnapsackItem(51,55));


  		itemList.add(new KnapsackItem(65,32));


  		itemList.add(new KnapsackItem(65,14));


  		itemList.add(new KnapsackItem(93,36));


  		itemList.add(new KnapsackItem(51,95));


  		itemList.add(new KnapsackItem(20,44));


  		itemList.add(new KnapsackItem(40,42));


  		itemList.add(new KnapsackItem(14,11));


  		itemList.add(new KnapsackItem(43,78));


  		itemList.add(new KnapsackItem(18,71));


  		itemList.add(new KnapsackItem(31,28));


  		itemList.add(new KnapsackItem(33,82));


  		itemList.add(new KnapsackItem(78,35));


  		itemList.add(new KnapsackItem(53,77));


  		itemList.add(new KnapsackItem(52,48));


  		itemList.add(new KnapsackItem(70,97));


  		itemList.add(new KnapsackItem(28,74));


  		itemList.add(new KnapsackItem(53,75));


  		itemList.add(new KnapsackItem(77,82));


  		itemList.add(new KnapsackItem(27,70));


  		itemList.add(new KnapsackItem(60,51));


  		itemList.add(new KnapsackItem(46,40));


  		itemList.add(new KnapsackItem(11,47));


  		itemList.add(new KnapsackItem(41,96));


  		itemList.add(new KnapsackItem(79,99));


  		itemList.add(new KnapsackItem(79,70));


  		itemList.add(new KnapsackItem(63,99));


  		itemList.add(new KnapsackItem(47,99));


  		itemList.add(new KnapsackItem(61,21));


  		itemList.add(new KnapsackItem(36,61));


  		itemList.add(new KnapsackItem(63,77));


  		itemList.add(new KnapsackItem(73,93));


  		itemList.add(new KnapsackItem(94,68));


  		itemList.add(new KnapsackItem(100,100));


  		itemList.add(new KnapsackItem(75,73));


  		itemList.add(new KnapsackItem(76,45));


  		itemList.add(new KnapsackItem(58,99));


  		itemList.add(new KnapsackItem(91,65));


  		itemList.add(new KnapsackItem(50,42));


  		itemList.add(new KnapsackItem(17,43));


  		itemList.add(new KnapsackItem(64,83));


  		itemList.add(new KnapsackItem(62,22));


  		itemList.add(new KnapsackItem(22,25));


  		itemList.add(new KnapsackItem(46,55));


  		itemList.add(new KnapsackItem(54,97));


  		itemList.add(new KnapsackItem(54,11));


  		itemList.add(new KnapsackItem(27,48));


  		itemList.add(new KnapsackItem(70,82));


  		itemList.add(new KnapsackItem(100,20));


  		itemList.add(new KnapsackItem(57,80));


  		itemList.add(new KnapsackItem(94,18));


  		itemList.add(new KnapsackItem(72,86));


  		itemList.add(new KnapsackItem(49,42));


  		itemList.add(new KnapsackItem(13,33));


  		itemList.add(new KnapsackItem(88,23));


  		itemList.add(new KnapsackItem(54,42));


  		itemList.add(new KnapsackItem(57,14));


  		itemList.add(new KnapsackItem(32,54));


  		itemList.add(new KnapsackItem(88,77));


  		itemList.add(new KnapsackItem(64,74));


  		itemList.add(new KnapsackItem(90,56));


  		itemList.add(new KnapsackItem(83,10));


  		itemList.add(new KnapsackItem(91,61));


  		itemList.add(new KnapsackItem(36,44));


  		itemList.add(new KnapsackItem(71,82));


  		itemList.add(new KnapsackItem(100,34));


  		itemList.add(new KnapsackItem(71,81));


  		itemList.add(new KnapsackItem(96,44));


  		itemList.add(new KnapsackItem(21,27));


  		itemList.add(new KnapsackItem(93,10));


  		itemList.add(new KnapsackItem(33,68));


  		itemList.add(new KnapsackItem(72,71));


  		itemList.add(new KnapsackItem(23,33));


  		itemList.add(new KnapsackItem(23,93));


  		itemList.add(new KnapsackItem(30,46));


  		itemList.add(new KnapsackItem(41,89));


  		itemList.add(new KnapsackItem(12,34));


  		itemList.add(new KnapsackItem(87,24));


  		itemList.add(new KnapsackItem(18,65));


  		itemList.add(new KnapsackItem(97,40));


  		itemList.add(new KnapsackItem(88,17));


  		itemList.add(new KnapsackItem(26,67));


  		itemList.add(new KnapsackItem(14,46));


  		itemList.add(new KnapsackItem(19,17));


  		itemList.add(new KnapsackItem(20,89));


  		itemList.add(new KnapsackItem(70,49));


  		itemList.add(new KnapsackItem(31,57));


  		itemList.add(new KnapsackItem(46,87));


  		itemList.add(new KnapsackItem(77,75));


  		itemList.add(new KnapsackItem(53,48));


  		itemList.add(new KnapsackItem(80,81));


  		itemList.add(new KnapsackItem(55,82));


  		itemList.add(new KnapsackItem(86,50));


  		itemList.add(new KnapsackItem(94,93));


  		itemList.add(new KnapsackItem(79,28));


  		itemList.add(new KnapsackItem(90,18));


  		itemList.add(new KnapsackItem(27,34));


  		itemList.add(new KnapsackItem(71,77));


  		itemList.add(new KnapsackItem(77,36));


  		itemList.add(new KnapsackItem(66,78));


  		itemList.add(new KnapsackItem(10,55));


  		itemList.add(new KnapsackItem(95,79));


  		itemList.add(new KnapsackItem(39,94));


  		itemList.add(new KnapsackItem(35,22));


  		itemList.add(new KnapsackItem(45,57));


  		itemList.add(new KnapsackItem(22,77));


  		itemList.add(new KnapsackItem(55,16));


  		itemList.add(new KnapsackItem(10,42));


  		itemList.add(new KnapsackItem(21,11));


  		itemList.add(new KnapsackItem(30,54));


  		itemList.add(new KnapsackItem(83,58));


  		itemList.add(new KnapsackItem(97,60));


  		itemList.add(new KnapsackItem(10,23));


  		itemList.add(new KnapsackItem(64,19));


  		itemList.add(new KnapsackItem(36,69));


  		itemList.add(new KnapsackItem(52,97));


  		itemList.add(new KnapsackItem(67,95));


  		itemList.add(new KnapsackItem(19,19));


  		itemList.add(new KnapsackItem(70,11));


  		itemList.add(new KnapsackItem(64,48));


  		itemList.add(new KnapsackItem(83,44));


  		itemList.add(new KnapsackItem(73,41));


  		itemList.add(new KnapsackItem(38,28));


  		itemList.add(new KnapsackItem(28,79));


  		itemList.add(new KnapsackItem(41,77));


  		itemList.add(new KnapsackItem(43,63));


  		itemList.add(new KnapsackItem(72,51));


  		itemList.add(new KnapsackItem(99,84));


  		itemList.add(new KnapsackItem(61,47));


  		itemList.add(new KnapsackItem(26,21));


  		itemList.add(new KnapsackItem(92,38));


  		itemList.add(new KnapsackItem(65,96));


  		itemList.add(new KnapsackItem(97,85));


  		itemList.add(new KnapsackItem(54,28));


  		itemList.add(new KnapsackItem(23,73));


  		itemList.add(new KnapsackItem(39,59));


  		itemList.add(new KnapsackItem(56,93));


  		itemList.add(new KnapsackItem(68,40));


  		itemList.add(new KnapsackItem(93,16));


  		itemList.add(new KnapsackItem(51,48));


  		itemList.add(new KnapsackItem(78,15));


  		itemList.add(new KnapsackItem(29,10));


  		itemList.add(new KnapsackItem(77,76));


  		itemList.add(new KnapsackItem(22,49));


  		itemList.add(new KnapsackItem(86,53));


  		itemList.add(new KnapsackItem(13,91));


  		itemList.add(new KnapsackItem(62,13));


  		itemList.add(new KnapsackItem(66,92));


  		itemList.add(new KnapsackItem(62,49));


  		itemList.add(new KnapsackItem(96,62));


  		itemList.add(new KnapsackItem(66,54));


  		itemList.add(new KnapsackItem(40,93));


  		itemList.add(new KnapsackItem(86,45));


  		itemList.add(new KnapsackItem(15,89));


  		itemList.add(new KnapsackItem(70,27));


  		itemList.add(new KnapsackItem(61,24));


  		itemList.add(new KnapsackItem(25,29));


  		itemList.add(new KnapsackItem(82,24));


  		itemList.add(new KnapsackItem(23,87));


  		itemList.add(new KnapsackItem(85,76));


  		itemList.add(new KnapsackItem(34,57));


  		itemList.add(new KnapsackItem(77,34));


  		itemList.add(new KnapsackItem(24,20));


  		itemList.add(new KnapsackItem(80,61));


  		itemList.add(new KnapsackItem(87,89));


  		itemList.add(new KnapsackItem(37,56));


  		itemList.add(new KnapsackItem(42,71));


  		itemList.add(new KnapsackItem(25,92));


  		itemList.add(new KnapsackItem(89,87));


  		itemList.add(new KnapsackItem(85,54));


  		itemList.add(new KnapsackItem(69,79));


  		itemList.add(new KnapsackItem(47,66));


  		itemList.add(new KnapsackItem(53,28));


  		itemList.add(new KnapsackItem(51,19));


  		itemList.add(new KnapsackItem(65,96));


  		itemList.add(new KnapsackItem(92,95));


  		itemList.add(new KnapsackItem(52,58));


  		itemList.add(new KnapsackItem(53,77));


  		itemList.add(new KnapsackItem(100,71));


  		itemList.add(new KnapsackItem(45,52));


  		itemList.add(new KnapsackItem(87,13));


  		itemList.add(new KnapsackItem(93,11));


  		itemList.add(new KnapsackItem(76,50));


  		itemList.add(new KnapsackItem(20,56));


  		itemList.add(new KnapsackItem(37,10));


  		itemList.add(new KnapsackItem(74,73));


  		itemList.add(new KnapsackItem(85,86));


  		itemList.add(new KnapsackItem(54,38));


  		itemList.add(new KnapsackItem(21,77));


  		itemList.add(new KnapsackItem(93,94));


  		itemList.add(new KnapsackItem(77,10));


  		itemList.add(new KnapsackItem(17,85));


  		itemList.add(new KnapsackItem(63,23));


  		itemList.add(new KnapsackItem(54,81));


  		itemList.add(new KnapsackItem(61,65));


  		itemList.add(new KnapsackItem(34,14));


  		itemList.add(new KnapsackItem(45,66));


  		itemList.add(new KnapsackItem(19,92));


  		itemList.add(new KnapsackItem(52,50));


  		itemList.add(new KnapsackItem(35,43));


  		itemList.add(new KnapsackItem(76,59));


  		itemList.add(new KnapsackItem(99,82));


  		itemList.add(new KnapsackItem(69,20));


  		itemList.add(new KnapsackItem(97,47));


  		itemList.add(new KnapsackItem(41,38));


  		itemList.add(new KnapsackItem(78,14));


  		itemList.add(new KnapsackItem(92,66));


  		itemList.add(new KnapsackItem(68,99));


  		itemList.add(new KnapsackItem(47,75));


  		itemList.add(new KnapsackItem(35,48));


  		itemList.add(new KnapsackItem(70,71));


  		itemList.add(new KnapsackItem(94,26));


  		itemList.add(new KnapsackItem(24,84));


  		itemList.add(new KnapsackItem(73,75));


  		itemList.add(new KnapsackItem(53,49));


  		itemList.add(new KnapsackItem(44,15));


  		itemList.add(new KnapsackItem(47,77));


  		itemList.add(new KnapsackItem(75,67));


  		itemList.add(new KnapsackItem(75,26));


  		itemList.add(new KnapsackItem(93,88));


  		itemList.add(new KnapsackItem(15,26));


  		itemList.add(new KnapsackItem(39,14));


  		itemList.add(new KnapsackItem(13,49));


  		itemList.add(new KnapsackItem(95,94));


  		itemList.add(new KnapsackItem(75,53));


  		itemList.add(new KnapsackItem(62,58));


  		itemList.add(new KnapsackItem(21,13));


  		itemList.add(new KnapsackItem(78,83));


  		itemList.add(new KnapsackItem(56,89));


  		itemList.add(new KnapsackItem(58,71));


  		itemList.add(new KnapsackItem(12,58));


  		itemList.add(new KnapsackItem(19,78));


  		itemList.add(new KnapsackItem(46,63));


  		itemList.add(new KnapsackItem(16,12));


  		itemList.add(new KnapsackItem(19,29));


  		itemList.add(new KnapsackItem(10,32));


  		itemList.add(new KnapsackItem(96,44));


  		itemList.add(new KnapsackItem(76,14));


  		itemList.add(new KnapsackItem(16,56));


  		itemList.add(new KnapsackItem(86,72));


  		itemList.add(new KnapsackItem(87,40));


  		itemList.add(new KnapsackItem(62,62));


  		itemList.add(new KnapsackItem(61,15));


  		itemList.add(new KnapsackItem(96,47));


  		itemList.add(new KnapsackItem(46,58));


  		itemList.add(new KnapsackItem(94,86));


  		itemList.add(new KnapsackItem(45,16));


  		itemList.add(new KnapsackItem(59,60));


  		itemList.add(new KnapsackItem(52,86));


  		itemList.add(new KnapsackItem(56,50));


  		itemList.add(new KnapsackItem(63,44));


  		itemList.add(new KnapsackItem(77,21));


  		itemList.add(new KnapsackItem(66,53));


  		itemList.add(new KnapsackItem(76,91));


  		itemList.add(new KnapsackItem(61,87));


  		itemList.add(new KnapsackItem(96,22));


  		itemList.add(new KnapsackItem(12,91));


  		itemList.add(new KnapsackItem(31,13));


  		itemList.add(new KnapsackItem(17,58));


  		itemList.add(new KnapsackItem(37,43));


  		itemList.add(new KnapsackItem(86,57));


  		itemList.add(new KnapsackItem(29,14));


  		itemList.add(new KnapsackItem(58,75));


  		itemList.add(new KnapsackItem(93,21));


  		itemList.add(new KnapsackItem(28,21));


  		itemList.add(new KnapsackItem(46,12));


  		itemList.add(new KnapsackItem(89,37));


  		itemList.add(new KnapsackItem(42,72));


  		itemList.add(new KnapsackItem(31,17));


  		itemList.add(new KnapsackItem(100,28));


  		itemList.add(new KnapsackItem(81,29));


  		itemList.add(new KnapsackItem(82,98));


  		itemList.add(new KnapsackItem(12,74));


  		itemList.add(new KnapsackItem(53,100));


  		itemList.add(new KnapsackItem(69,18));


  		itemList.add(new KnapsackItem(48,71));


  		itemList.add(new KnapsackItem(44,15));


  		itemList.add(new KnapsackItem(36,73));


  		itemList.add(new KnapsackItem(20,100));


  		itemList.add(new KnapsackItem(15,94));


  		itemList.add(new KnapsackItem(79,78));


  		itemList.add(new KnapsackItem(98,87));


  		itemList.add(new KnapsackItem(34,60));


  		itemList.add(new KnapsackItem(85,78));


  		itemList.add(new KnapsackItem(78,45));


  		itemList.add(new KnapsackItem(83,57));


  		itemList.add(new KnapsackItem(87,89));


  		itemList.add(new KnapsackItem(53,57));


  		itemList.add(new KnapsackItem(75,89));


  		itemList.add(new KnapsackItem(65,33));


  		itemList.add(new KnapsackItem(35,14));


  		itemList.add(new KnapsackItem(79,23));


  		itemList.add(new KnapsackItem(37,41));


  		itemList.add(new KnapsackItem(82,29));


  		itemList.add(new KnapsackItem(68,49));


  		itemList.add(new KnapsackItem(40,47));


  		itemList.add(new KnapsackItem(42,69));


  		itemList.add(new KnapsackItem(19,54));


  		itemList.add(new KnapsackItem(13,45));


  		itemList.add(new KnapsackItem(100,18));


  		itemList.add(new KnapsackItem(88,46));


  		itemList.add(new KnapsackItem(29,92));


  		itemList.add(new KnapsackItem(62,29));


  		itemList.add(new KnapsackItem(11,82));


  		itemList.add(new KnapsackItem(48,37));


  		itemList.add(new KnapsackItem(21,55));


  		itemList.add(new KnapsackItem(26,78));


  		itemList.add(new KnapsackItem(41,52));


  		itemList.add(new KnapsackItem(83,33));


  		itemList.add(new KnapsackItem(47,57));


  		itemList.add(new KnapsackItem(27,93));


  		itemList.add(new KnapsackItem(32,42));


  		itemList.add(new KnapsackItem(71,73));


  		itemList.add(new KnapsackItem(56,51));


  		itemList.add(new KnapsackItem(12,80));


  		itemList.add(new KnapsackItem(33,23));


  		itemList.add(new KnapsackItem(17,82));


  		itemList.add(new KnapsackItem(25,38));


  		itemList.add(new KnapsackItem(50,12));


  		itemList.add(new KnapsackItem(18,85));


  		itemList.add(new KnapsackItem(33,62));


  		itemList.add(new KnapsackItem(93,90));


  		itemList.add(new KnapsackItem(85,90));


  		itemList.add(new KnapsackItem(20,80));


  		itemList.add(new KnapsackItem(66,43));


  		itemList.add(new KnapsackItem(17,45));


  		itemList.add(new KnapsackItem(78,33));


  		itemList.add(new KnapsackItem(77,61));


  		itemList.add(new KnapsackItem(28,53));


  		itemList.add(new KnapsackItem(44,18));


  		itemList.add(new KnapsackItem(77,66));


  		itemList.add(new KnapsackItem(93,14));


  		itemList.add(new KnapsackItem(76,29));


  		itemList.add(new KnapsackItem(23,39));


  		itemList.add(new KnapsackItem(89,23));


  		itemList.add(new KnapsackItem(97,32));


  		itemList.add(new KnapsackItem(17,42));


  		itemList.add(new KnapsackItem(82,65));


  		itemList.add(new KnapsackItem(18,19));


  		itemList.add(new KnapsackItem(63,35));


  		itemList.add(new KnapsackItem(53,11));


  		itemList.add(new KnapsackItem(100,49));


  		itemList.add(new KnapsackItem(19,36));


  		itemList.add(new KnapsackItem(68,65));


  		itemList.add(new KnapsackItem(40,22));


  		itemList.add(new KnapsackItem(21,24));


  		itemList.add(new KnapsackItem(80,33));


  		itemList.add(new KnapsackItem(89,82));


  		itemList.add(new KnapsackItem(70,66));


  		itemList.add(new KnapsackItem(63,48));
  	
  		//printItemList();
	}
	
	public static synchronized KnapsackTwo getInstance() {
	  	if(instance == null) {
	  		instance = new KnapsackTwo();
	  		instance.createSortedRatioList();
	 	}
	  	return instance;
	}
	
	public KnapsackItem getItem(int index){
		return (KnapsackItem)itemList.get(index);
	}
	
	public double getCapacity(){
		return capacity;
	}
	
	public void createSortedRatioList(){
		double [] entry;
		for(int i=0; i < 750; i++){
			entry = new double[2];
			entry[0] = i;
			entry[1] = this.getItem(i).getRatio();
			sortedRatioList.add(entry);
		}
		Collections.sort(sortedRatioList,new Comparer_Ratio());
	}
	
	public void printItemList(){
		logger.trace("profit for knapsack two");
		for(int i = 0; i < itemList.size(); i++){
			KnapsackItem item = (KnapsackItem)itemList.get(i);
			logger.trace(item.getProfit());
		}
		logger.trace("weight for knapsack two");
		for(int i = 0; i < itemList.size(); i++){
			KnapsackItem item = (KnapsackItem)itemList.get(i);
			logger.trace(item.getWeight());
		}
	}
	
	//sort the items based on their ratio. sort that solutions with lower ratio are at the beginning
	private class Comparer_Ratio implements Comparator<double[]> {
		
	     public int compare(double[] obj1, double[] obj2)
	     {
	    	 double cd1 = obj1[1];
	    	 double cd2 = obj2[1];
             if(cd1 > cd2)return -1;
             if(cd1 == cd2)return 0;
             else return 1;
	     }
	}
}
