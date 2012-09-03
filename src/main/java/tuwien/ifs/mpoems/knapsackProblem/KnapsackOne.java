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
public final class KnapsackOne{
	
	private static KnapsackOne instance = null;
	private static ArrayList<KnapsackItem> itemList;
	private final static double capacity = 20351.5;
	static Logger logger = Logger.getLogger(KnapsackOne.class);
	ArrayList<double[]> sortedRatioList = new ArrayList<double[]>();
	
	
	/**
	 * @return the sortedRatioList
	 */
	public ArrayList<double[]> getSortedRatioList() {
		return sortedRatioList;
	}

	private KnapsackOne() {
		itemList = new ArrayList<KnapsackItem>();

  		itemList.add(new KnapsackItem(39,89));


  		itemList.add(new KnapsackItem(14,31));


  		itemList.add(new KnapsackItem(35,29));


  		itemList.add(new KnapsackItem(34,47));


  		itemList.add(new KnapsackItem(20,99));


  		itemList.add(new KnapsackItem(41,44));


  		itemList.add(new KnapsackItem(53,23));


  		itemList.add(new KnapsackItem(59,40));


  		itemList.add(new KnapsackItem(52,44));


  		itemList.add(new KnapsackItem(66,51));


  		itemList.add(new KnapsackItem(56,81));


  		itemList.add(new KnapsackItem(17,14));


  		itemList.add(new KnapsackItem(68,61));


  		itemList.add(new KnapsackItem(22,17));


  		itemList.add(new KnapsackItem(22,63));


  		itemList.add(new KnapsackItem(81,21));


  		itemList.add(new KnapsackItem(18,32));


  		itemList.add(new KnapsackItem(17,51));


  		itemList.add(new KnapsackItem(76,34));


  		itemList.add(new KnapsackItem(73,88));


  		itemList.add(new KnapsackItem(68,30));


  		itemList.add(new KnapsackItem(34,52));


  		itemList.add(new KnapsackItem(78,53));


  		itemList.add(new KnapsackItem(82,91));


  		itemList.add(new KnapsackItem(59,14));


  		itemList.add(new KnapsackItem(74,57));


  		itemList.add(new KnapsackItem(34,59));


  		itemList.add(new KnapsackItem(78,65));


  		itemList.add(new KnapsackItem(91,62));


  		itemList.add(new KnapsackItem(19,70));


  		itemList.add(new KnapsackItem(63,35));


  		itemList.add(new KnapsackItem(99,49));


  		itemList.add(new KnapsackItem(36,82));


  		itemList.add(new KnapsackItem(28,66));


  		itemList.add(new KnapsackItem(85,61));


  		itemList.add(new KnapsackItem(33,60));


  		itemList.add(new KnapsackItem(11,88));


  		itemList.add(new KnapsackItem(76,39));


  		itemList.add(new KnapsackItem(79,27));


  		itemList.add(new KnapsackItem(80,38));


  		itemList.add(new KnapsackItem(48,20));


  		itemList.add(new KnapsackItem(36,61));


  		itemList.add(new KnapsackItem(93,54));


  		itemList.add(new KnapsackItem(80,72));


  		itemList.add(new KnapsackItem(77,56));


  		itemList.add(new KnapsackItem(28,40));


  		itemList.add(new KnapsackItem(80,34));


  		itemList.add(new KnapsackItem(65,63));


  		itemList.add(new KnapsackItem(41,89));


  		itemList.add(new KnapsackItem(45,20));


  		itemList.add(new KnapsackItem(77,96));


  		itemList.add(new KnapsackItem(48,54));


  		itemList.add(new KnapsackItem(54,88));


  		itemList.add(new KnapsackItem(22,92));


  		itemList.add(new KnapsackItem(24,24));


  		itemList.add(new KnapsackItem(11,99));


  		itemList.add(new KnapsackItem(10,60));


  		itemList.add(new KnapsackItem(84,89));


  		itemList.add(new KnapsackItem(95,58));


  		itemList.add(new KnapsackItem(90,23));


  		itemList.add(new KnapsackItem(85,36));


  		itemList.add(new KnapsackItem(27,77));


  		itemList.add(new KnapsackItem(83,34));


  		itemList.add(new KnapsackItem(72,82));


  		itemList.add(new KnapsackItem(53,20));


  		itemList.add(new KnapsackItem(70,40));


  		itemList.add(new KnapsackItem(27,16));


  		itemList.add(new KnapsackItem(38,46));


  		itemList.add(new KnapsackItem(93,18));


  		itemList.add(new KnapsackItem(55,90));


  		itemList.add(new KnapsackItem(64,78));


  		itemList.add(new KnapsackItem(12,24));


  		itemList.add(new KnapsackItem(82,19));


  		itemList.add(new KnapsackItem(65,86));


  		itemList.add(new KnapsackItem(60,96));


  		itemList.add(new KnapsackItem(65,72));


  		itemList.add(new KnapsackItem(45,62));


  		itemList.add(new KnapsackItem(51,77));


  		itemList.add(new KnapsackItem(72,71));


  		itemList.add(new KnapsackItem(87,48));


  		itemList.add(new KnapsackItem(84,50));


  		itemList.add(new KnapsackItem(58,53));


  		itemList.add(new KnapsackItem(89,41));


  		itemList.add(new KnapsackItem(98,98));


  		itemList.add(new KnapsackItem(17,26));


  		itemList.add(new KnapsackItem(67,93));


  		itemList.add(new KnapsackItem(42,52));


  		itemList.add(new KnapsackItem(86,84));


  		itemList.add(new KnapsackItem(41,49));


  		itemList.add(new KnapsackItem(65,35));


  		itemList.add(new KnapsackItem(73,13));


  		itemList.add(new KnapsackItem(45,73));


  		itemList.add(new KnapsackItem(55,94));


  		itemList.add(new KnapsackItem(16,64));


  		itemList.add(new KnapsackItem(15,61));


  		itemList.add(new KnapsackItem(81,12));


  		itemList.add(new KnapsackItem(16,99));


  		itemList.add(new KnapsackItem(37,17));


  		itemList.add(new KnapsackItem(21,82));


  		itemList.add(new KnapsackItem(19,36));


  		itemList.add(new KnapsackItem(51,36));


  		itemList.add(new KnapsackItem(19,18));


  		itemList.add(new KnapsackItem(50,24));


  		itemList.add(new KnapsackItem(51,69));


  		itemList.add(new KnapsackItem(72,68));


  		itemList.add(new KnapsackItem(65,84));


  		itemList.add(new KnapsackItem(18,84));


  		itemList.add(new KnapsackItem(31,48));


  		itemList.add(new KnapsackItem(19,54));


  		itemList.add(new KnapsackItem(20,48));


  		itemList.add(new KnapsackItem(37,17));


  		itemList.add(new KnapsackItem(76,44));


  		itemList.add(new KnapsackItem(73,11));


  		itemList.add(new KnapsackItem(31,95));


  		itemList.add(new KnapsackItem(20,37));


  		itemList.add(new KnapsackItem(24,52));


  		itemList.add(new KnapsackItem(21,74));


  		itemList.add(new KnapsackItem(22,62));


  		itemList.add(new KnapsackItem(65,83));


  		itemList.add(new KnapsackItem(53,17));


  		itemList.add(new KnapsackItem(68,79));


  		itemList.add(new KnapsackItem(97,98));


  		itemList.add(new KnapsackItem(32,97));


  		itemList.add(new KnapsackItem(100,62));


  		itemList.add(new KnapsackItem(62,29));


  		itemList.add(new KnapsackItem(31,17));


  		itemList.add(new KnapsackItem(66,73));


  		itemList.add(new KnapsackItem(64,78));


  		itemList.add(new KnapsackItem(12,55));


  		itemList.add(new KnapsackItem(24,37));


  		itemList.add(new KnapsackItem(59,59));


  		itemList.add(new KnapsackItem(40,36));


  		itemList.add(new KnapsackItem(16,23));


  		itemList.add(new KnapsackItem(92,91));


  		itemList.add(new KnapsackItem(54,84));


  		itemList.add(new KnapsackItem(32,44));


  		itemList.add(new KnapsackItem(14,63));


  		itemList.add(new KnapsackItem(98,98));


  		itemList.add(new KnapsackItem(47,12));


  		itemList.add(new KnapsackItem(41,100));


  		itemList.add(new KnapsackItem(45,81));


  		itemList.add(new KnapsackItem(85,30));


  		itemList.add(new KnapsackItem(91,93));


  		itemList.add(new KnapsackItem(34,32));


  		itemList.add(new KnapsackItem(100,95));


  		itemList.add(new KnapsackItem(60,27));


  		itemList.add(new KnapsackItem(18,73));


  		itemList.add(new KnapsackItem(62,43));


  		itemList.add(new KnapsackItem(10,33));


  		itemList.add(new KnapsackItem(20,76));


  		itemList.add(new KnapsackItem(40,51));


  		itemList.add(new KnapsackItem(96,62));


  		itemList.add(new KnapsackItem(17,72));


  		itemList.add(new KnapsackItem(77,72));


  		itemList.add(new KnapsackItem(51,28));


  		itemList.add(new KnapsackItem(50,93));


  		itemList.add(new KnapsackItem(59,76));


  		itemList.add(new KnapsackItem(13,35));


  		itemList.add(new KnapsackItem(73,89));


  		itemList.add(new KnapsackItem(34,75));


  		itemList.add(new KnapsackItem(43,78));


  		itemList.add(new KnapsackItem(10,45));


  		itemList.add(new KnapsackItem(18,18));


  		itemList.add(new KnapsackItem(69,86));


  		itemList.add(new KnapsackItem(36,34));


  		itemList.add(new KnapsackItem(41,29));


  		itemList.add(new KnapsackItem(18,97));


  		itemList.add(new KnapsackItem(53,36));


  		itemList.add(new KnapsackItem(97,30));


  		itemList.add(new KnapsackItem(91,87));


  		itemList.add(new KnapsackItem(33,47));


  		itemList.add(new KnapsackItem(55,66));


  		itemList.add(new KnapsackItem(89,21));


  		itemList.add(new KnapsackItem(94,40));


  		itemList.add(new KnapsackItem(69,52));


  		itemList.add(new KnapsackItem(81,76));


  		itemList.add(new KnapsackItem(74,17));


  		itemList.add(new KnapsackItem(54,57));


  		itemList.add(new KnapsackItem(73,53));


  		itemList.add(new KnapsackItem(96,78));


  		itemList.add(new KnapsackItem(33,35));


  		itemList.add(new KnapsackItem(90,52));


  		itemList.add(new KnapsackItem(67,91));


  		itemList.add(new KnapsackItem(58,100));


  		itemList.add(new KnapsackItem(62,41));


  		itemList.add(new KnapsackItem(87,77));


  		itemList.add(new KnapsackItem(21,61));


  		itemList.add(new KnapsackItem(45,11));


  		itemList.add(new KnapsackItem(100,96));


  		itemList.add(new KnapsackItem(97,27));


  		itemList.add(new KnapsackItem(78,51));


  		itemList.add(new KnapsackItem(94,70));


  		itemList.add(new KnapsackItem(31,85));


  		itemList.add(new KnapsackItem(92,91));


  		itemList.add(new KnapsackItem(71,44));


  		itemList.add(new KnapsackItem(73,11));


  		itemList.add(new KnapsackItem(83,23));


  		itemList.add(new KnapsackItem(90,21));


  		itemList.add(new KnapsackItem(56,16));


  		itemList.add(new KnapsackItem(49,91));


  		itemList.add(new KnapsackItem(61,72));


  		itemList.add(new KnapsackItem(16,77));


  		itemList.add(new KnapsackItem(40,99));


  		itemList.add(new KnapsackItem(60,76));


  		itemList.add(new KnapsackItem(21,12));


  		itemList.add(new KnapsackItem(81,57));


  		itemList.add(new KnapsackItem(91,30));


  		itemList.add(new KnapsackItem(52,68));


  		itemList.add(new KnapsackItem(96,65));


  		itemList.add(new KnapsackItem(83,52));


  		itemList.add(new KnapsackItem(75,34));


  		itemList.add(new KnapsackItem(96,10));


  		itemList.add(new KnapsackItem(59,54));


  		itemList.add(new KnapsackItem(16,84));


  		itemList.add(new KnapsackItem(100,56));


  		itemList.add(new KnapsackItem(49,98));


  		itemList.add(new KnapsackItem(29,81));


  		itemList.add(new KnapsackItem(38,74));


  		itemList.add(new KnapsackItem(96,89));


  		itemList.add(new KnapsackItem(45,20));


  		itemList.add(new KnapsackItem(40,68));


  		itemList.add(new KnapsackItem(50,75));


  		itemList.add(new KnapsackItem(91,94));


  		itemList.add(new KnapsackItem(84,39));


  		itemList.add(new KnapsackItem(67,82));


  		itemList.add(new KnapsackItem(65,29));


  		itemList.add(new KnapsackItem(14,32));


  		itemList.add(new KnapsackItem(27,16));


  		itemList.add(new KnapsackItem(100,57));


  		itemList.add(new KnapsackItem(90,66));


  		itemList.add(new KnapsackItem(15,45));


  		itemList.add(new KnapsackItem(33,14));


  		itemList.add(new KnapsackItem(80,93));


  		itemList.add(new KnapsackItem(58,41));


  		itemList.add(new KnapsackItem(68,45));


  		itemList.add(new KnapsackItem(100,45));


  		itemList.add(new KnapsackItem(65,25));


  		itemList.add(new KnapsackItem(91,92));


  		itemList.add(new KnapsackItem(10,55));


  		itemList.add(new KnapsackItem(42,57));


  		itemList.add(new KnapsackItem(84,70));


  		itemList.add(new KnapsackItem(58,61));


  		itemList.add(new KnapsackItem(91,26));


  		itemList.add(new KnapsackItem(22,27));


  		itemList.add(new KnapsackItem(45,47));


  		itemList.add(new KnapsackItem(83,64));


  		itemList.add(new KnapsackItem(56,56));


  		itemList.add(new KnapsackItem(72,50));


  		itemList.add(new KnapsackItem(16,17));


  		itemList.add(new KnapsackItem(14,16));


  		itemList.add(new KnapsackItem(86,19));


  		itemList.add(new KnapsackItem(33,47));


  		itemList.add(new KnapsackItem(39,42));


  		itemList.add(new KnapsackItem(81,98));


  		itemList.add(new KnapsackItem(53,60));


  		itemList.add(new KnapsackItem(17,55));


  		itemList.add(new KnapsackItem(67,97));


  		itemList.add(new KnapsackItem(35,100));


  		itemList.add(new KnapsackItem(19,66));


  		itemList.add(new KnapsackItem(87,31));


  		itemList.add(new KnapsackItem(58,96));


  		itemList.add(new KnapsackItem(90,63));


  		itemList.add(new KnapsackItem(98,47));


  		itemList.add(new KnapsackItem(17,48));


  		itemList.add(new KnapsackItem(75,21));


  		itemList.add(new KnapsackItem(22,17));


  		itemList.add(new KnapsackItem(91,62));


  		itemList.add(new KnapsackItem(72,86));


  		itemList.add(new KnapsackItem(84,15));


  		itemList.add(new KnapsackItem(60,53));


  		itemList.add(new KnapsackItem(29,64));


  		itemList.add(new KnapsackItem(70,32));


  		itemList.add(new KnapsackItem(31,40));


  		itemList.add(new KnapsackItem(56,41));


  		itemList.add(new KnapsackItem(25,93));


  		itemList.add(new KnapsackItem(34,75));


  		itemList.add(new KnapsackItem(34,73));


  		itemList.add(new KnapsackItem(76,10));


  		itemList.add(new KnapsackItem(72,41));


  		itemList.add(new KnapsackItem(67,15));


  		itemList.add(new KnapsackItem(16,57));


  		itemList.add(new KnapsackItem(91,37));


  		itemList.add(new KnapsackItem(66,11));


  		itemList.add(new KnapsackItem(62,14));


  		itemList.add(new KnapsackItem(42,71));


  		itemList.add(new KnapsackItem(57,86));


  		itemList.add(new KnapsackItem(93,75));


  		itemList.add(new KnapsackItem(80,82));


  		itemList.add(new KnapsackItem(30,27));


  		itemList.add(new KnapsackItem(63,58));


  		itemList.add(new KnapsackItem(55,35));


  		itemList.add(new KnapsackItem(23,83));


  		itemList.add(new KnapsackItem(97,99));


  		itemList.add(new KnapsackItem(23,13));


  		itemList.add(new KnapsackItem(68,51));


  		itemList.add(new KnapsackItem(21,90));


  		itemList.add(new KnapsackItem(46,48));


  		itemList.add(new KnapsackItem(92,43));


  		itemList.add(new KnapsackItem(86,49));


  		itemList.add(new KnapsackItem(18,37));


  		itemList.add(new KnapsackItem(52,50));


  		itemList.add(new KnapsackItem(42,20));


  		itemList.add(new KnapsackItem(93,100));


  		itemList.add(new KnapsackItem(72,68));


  		itemList.add(new KnapsackItem(36,78));


  		itemList.add(new KnapsackItem(70,26));


  		itemList.add(new KnapsackItem(28,48));


  		itemList.add(new KnapsackItem(10,68));


  		itemList.add(new KnapsackItem(83,95));


  		itemList.add(new KnapsackItem(32,80));


  		itemList.add(new KnapsackItem(74,50));


  		itemList.add(new KnapsackItem(39,55));


  		itemList.add(new KnapsackItem(53,12));


  		itemList.add(new KnapsackItem(79,84));


  		itemList.add(new KnapsackItem(97,51));


  		itemList.add(new KnapsackItem(14,55));


  		itemList.add(new KnapsackItem(95,40));


  		itemList.add(new KnapsackItem(97,32));


  		itemList.add(new KnapsackItem(43,89));


  		itemList.add(new KnapsackItem(36,17));


  		itemList.add(new KnapsackItem(53,81));


  		itemList.add(new KnapsackItem(72,52));


  		itemList.add(new KnapsackItem(14,13));


  		itemList.add(new KnapsackItem(98,100));


  		itemList.add(new KnapsackItem(74,44));


  		itemList.add(new KnapsackItem(23,11));


  		itemList.add(new KnapsackItem(39,85));


  		itemList.add(new KnapsackItem(63,12));


  		itemList.add(new KnapsackItem(87,95));


  		itemList.add(new KnapsackItem(74,81));


  		itemList.add(new KnapsackItem(33,77));


  		itemList.add(new KnapsackItem(10,23));


  		itemList.add(new KnapsackItem(14,89));


  		itemList.add(new KnapsackItem(71,91));


  		itemList.add(new KnapsackItem(32,85));


  		itemList.add(new KnapsackItem(49,30));


  		itemList.add(new KnapsackItem(11,100));


  		itemList.add(new KnapsackItem(12,56));


  		itemList.add(new KnapsackItem(80,55));


  		itemList.add(new KnapsackItem(10,41));


  		itemList.add(new KnapsackItem(54,82));


  		itemList.add(new KnapsackItem(74,20));


  		itemList.add(new KnapsackItem(91,98));


  		itemList.add(new KnapsackItem(11,54));


  		itemList.add(new KnapsackItem(20,81));


  		itemList.add(new KnapsackItem(71,24));


  		itemList.add(new KnapsackItem(73,44));


  		itemList.add(new KnapsackItem(42,77));


  		itemList.add(new KnapsackItem(84,78));


  		itemList.add(new KnapsackItem(74,42));


  		itemList.add(new KnapsackItem(23,23));


  		itemList.add(new KnapsackItem(65,96));


  		itemList.add(new KnapsackItem(53,75));


  		itemList.add(new KnapsackItem(32,27));


  		itemList.add(new KnapsackItem(72,89));


  		itemList.add(new KnapsackItem(92,100));


  		itemList.add(new KnapsackItem(47,63));


  		itemList.add(new KnapsackItem(45,52));


  		itemList.add(new KnapsackItem(37,96));


  		itemList.add(new KnapsackItem(60,66));


  		itemList.add(new KnapsackItem(33,82));


  		itemList.add(new KnapsackItem(46,80));


  		itemList.add(new KnapsackItem(100,54));


  		itemList.add(new KnapsackItem(24,54));


  		itemList.add(new KnapsackItem(18,99));


  		itemList.add(new KnapsackItem(93,82));


  		itemList.add(new KnapsackItem(63,70));


  		itemList.add(new KnapsackItem(24,83));


  		itemList.add(new KnapsackItem(53,28));


  		itemList.add(new KnapsackItem(50,99));


  		itemList.add(new KnapsackItem(82,100));


  		itemList.add(new KnapsackItem(10,11));


  		itemList.add(new KnapsackItem(86,81));


  		itemList.add(new KnapsackItem(59,93));


  		itemList.add(new KnapsackItem(56,57));


  		itemList.add(new KnapsackItem(80,90));


  		itemList.add(new KnapsackItem(23,89));


  		itemList.add(new KnapsackItem(51,86));


  		itemList.add(new KnapsackItem(70,68));


  		itemList.add(new KnapsackItem(21,31));


  		itemList.add(new KnapsackItem(41,69));


  		itemList.add(new KnapsackItem(100,11));


  		itemList.add(new KnapsackItem(73,24));


  		itemList.add(new KnapsackItem(97,28));


  		itemList.add(new KnapsackItem(29,26));


  		itemList.add(new KnapsackItem(47,34));


  		itemList.add(new KnapsackItem(12,63));


  		itemList.add(new KnapsackItem(66,21));


  		itemList.add(new KnapsackItem(69,34));


  		itemList.add(new KnapsackItem(34,40));


  		itemList.add(new KnapsackItem(95,21));


  		itemList.add(new KnapsackItem(28,48));


  		itemList.add(new KnapsackItem(54,95));


  		itemList.add(new KnapsackItem(11,76));


  		itemList.add(new KnapsackItem(94,42));


  		itemList.add(new KnapsackItem(16,64));


  		itemList.add(new KnapsackItem(11,46));


  		itemList.add(new KnapsackItem(52,74));


  		itemList.add(new KnapsackItem(34,85));


  		itemList.add(new KnapsackItem(95,34));


  		itemList.add(new KnapsackItem(75,52));


  		itemList.add(new KnapsackItem(87,12));


  		itemList.add(new KnapsackItem(96,89));


  		itemList.add(new KnapsackItem(72,94));


  		itemList.add(new KnapsackItem(56,60));


  		itemList.add(new KnapsackItem(34,23));


  		itemList.add(new KnapsackItem(90,35));


  		itemList.add(new KnapsackItem(94,38));


  		itemList.add(new KnapsackItem(71,57));


  		itemList.add(new KnapsackItem(22,39));


  		itemList.add(new KnapsackItem(72,10));


  		itemList.add(new KnapsackItem(20,13));


  		itemList.add(new KnapsackItem(22,66));


  		itemList.add(new KnapsackItem(41,27));


  		itemList.add(new KnapsackItem(23,12));


  		itemList.add(new KnapsackItem(62,71));


  		itemList.add(new KnapsackItem(79,40));


  		itemList.add(new KnapsackItem(13,17));


  		itemList.add(new KnapsackItem(12,97));


  		itemList.add(new KnapsackItem(83,62));


  		itemList.add(new KnapsackItem(85,15));


  		itemList.add(new KnapsackItem(21,75));


  		itemList.add(new KnapsackItem(48,82));


  		itemList.add(new KnapsackItem(81,29));


  		itemList.add(new KnapsackItem(74,77));


  		itemList.add(new KnapsackItem(54,41));


  		itemList.add(new KnapsackItem(75,47));


  		itemList.add(new KnapsackItem(53,73));


  		itemList.add(new KnapsackItem(66,65));


  		itemList.add(new KnapsackItem(77,72));


  		itemList.add(new KnapsackItem(61,65));


  		itemList.add(new KnapsackItem(19,17));


  		itemList.add(new KnapsackItem(84,92));


  		itemList.add(new KnapsackItem(25,12));


  		itemList.add(new KnapsackItem(24,92));


  		itemList.add(new KnapsackItem(63,25));


  		itemList.add(new KnapsackItem(96,81));


  		itemList.add(new KnapsackItem(21,88));


  		itemList.add(new KnapsackItem(44,60));


  		itemList.add(new KnapsackItem(50,60));


  		itemList.add(new KnapsackItem(65,65));


  		itemList.add(new KnapsackItem(58,20));


  		itemList.add(new KnapsackItem(49,41));


  		itemList.add(new KnapsackItem(95,50));


  		itemList.add(new KnapsackItem(85,37));


  		itemList.add(new KnapsackItem(32,11));


  		itemList.add(new KnapsackItem(86,37));


  		itemList.add(new KnapsackItem(62,93));


  		itemList.add(new KnapsackItem(26,20));


  		itemList.add(new KnapsackItem(10,26));


  		itemList.add(new KnapsackItem(36,11));


  		itemList.add(new KnapsackItem(15,61));


  		itemList.add(new KnapsackItem(72,67));


  		itemList.add(new KnapsackItem(41,49));


  		itemList.add(new KnapsackItem(18,30));


  		itemList.add(new KnapsackItem(47,71));


  		itemList.add(new KnapsackItem(90,16));


  		itemList.add(new KnapsackItem(64,87));


  		itemList.add(new KnapsackItem(23,42));


  		itemList.add(new KnapsackItem(15,13));


  		itemList.add(new KnapsackItem(29,37));


  		itemList.add(new KnapsackItem(28,83));


  		itemList.add(new KnapsackItem(76,56));


  		itemList.add(new KnapsackItem(78,28));


  		itemList.add(new KnapsackItem(83,67));


  		itemList.add(new KnapsackItem(33,62));


  		itemList.add(new KnapsackItem(20,91));


  		itemList.add(new KnapsackItem(46,20));


  		itemList.add(new KnapsackItem(76,14));


  		itemList.add(new KnapsackItem(68,94));


  		itemList.add(new KnapsackItem(22,99));


  		itemList.add(new KnapsackItem(70,40));


  		itemList.add(new KnapsackItem(13,50));


  		itemList.add(new KnapsackItem(63,63));


  		itemList.add(new KnapsackItem(85,63));


  		itemList.add(new KnapsackItem(35,73));


  		itemList.add(new KnapsackItem(89,28));


  		itemList.add(new KnapsackItem(97,42));


  		itemList.add(new KnapsackItem(10,33));


  		itemList.add(new KnapsackItem(23,80));


  		itemList.add(new KnapsackItem(55,79));


  		itemList.add(new KnapsackItem(34,14));


  		itemList.add(new KnapsackItem(86,56));


  		itemList.add(new KnapsackItem(30,36));


  		itemList.add(new KnapsackItem(64,48));


  		itemList.add(new KnapsackItem(57,68));


  		itemList.add(new KnapsackItem(42,81));


  		itemList.add(new KnapsackItem(31,54));


  		itemList.add(new KnapsackItem(19,22));


  		itemList.add(new KnapsackItem(44,96));


  		itemList.add(new KnapsackItem(24,16));


  		itemList.add(new KnapsackItem(61,80));


  		itemList.add(new KnapsackItem(57,24));


  		itemList.add(new KnapsackItem(41,89));


  		itemList.add(new KnapsackItem(22,67));


  		itemList.add(new KnapsackItem(11,34));


  		itemList.add(new KnapsackItem(78,78));


  		itemList.add(new KnapsackItem(22,24));


  		itemList.add(new KnapsackItem(68,88));


  		itemList.add(new KnapsackItem(95,96));


  		itemList.add(new KnapsackItem(52,88));


  		itemList.add(new KnapsackItem(39,55));


  		itemList.add(new KnapsackItem(64,66));


  		itemList.add(new KnapsackItem(77,47));


  		itemList.add(new KnapsackItem(13,19));


  		itemList.add(new KnapsackItem(35,39));


  		itemList.add(new KnapsackItem(65,64));


  		itemList.add(new KnapsackItem(79,17));


  		itemList.add(new KnapsackItem(82,14));


  		itemList.add(new KnapsackItem(97,31));


  		itemList.add(new KnapsackItem(17,35));


  		itemList.add(new KnapsackItem(53,14));


  		itemList.add(new KnapsackItem(78,44));


  		itemList.add(new KnapsackItem(73,24));


  		itemList.add(new KnapsackItem(39,43));


  		itemList.add(new KnapsackItem(85,16));


  		itemList.add(new KnapsackItem(26,29));


  		itemList.add(new KnapsackItem(14,31));


  		itemList.add(new KnapsackItem(42,94));


  		itemList.add(new KnapsackItem(58,47));


  		itemList.add(new KnapsackItem(47,23));


  		itemList.add(new KnapsackItem(72,13));


  		itemList.add(new KnapsackItem(57,55));


  		itemList.add(new KnapsackItem(56,39));


  		itemList.add(new KnapsackItem(96,71));


  		itemList.add(new KnapsackItem(44,96));


  		itemList.add(new KnapsackItem(95,62));


  		itemList.add(new KnapsackItem(26,16));


  		itemList.add(new KnapsackItem(66,43));


  		itemList.add(new KnapsackItem(69,28));


  		itemList.add(new KnapsackItem(56,56));


  		itemList.add(new KnapsackItem(82,96));


  		itemList.add(new KnapsackItem(67,97));


  		itemList.add(new KnapsackItem(50,43));


  		itemList.add(new KnapsackItem(94,10));


  		itemList.add(new KnapsackItem(77,50));


  		itemList.add(new KnapsackItem(74,66));


  		itemList.add(new KnapsackItem(61,90));


  		itemList.add(new KnapsackItem(67,22));


  		itemList.add(new KnapsackItem(23,77));


  		itemList.add(new KnapsackItem(24,48));


  		itemList.add(new KnapsackItem(81,61));


  		itemList.add(new KnapsackItem(44,78));


  		itemList.add(new KnapsackItem(70,38));


  		itemList.add(new KnapsackItem(14,14));


  		itemList.add(new KnapsackItem(31,99));


  		itemList.add(new KnapsackItem(61,43));


  		itemList.add(new KnapsackItem(58,17));


  		itemList.add(new KnapsackItem(14,49));


  		itemList.add(new KnapsackItem(26,22));


  		itemList.add(new KnapsackItem(46,93));


  		itemList.add(new KnapsackItem(44,31));


  		itemList.add(new KnapsackItem(91,13));


  		itemList.add(new KnapsackItem(59,59));


  		itemList.add(new KnapsackItem(91,45));


  		itemList.add(new KnapsackItem(66,76));


  		itemList.add(new KnapsackItem(21,51));


  		itemList.add(new KnapsackItem(99,18));


  		itemList.add(new KnapsackItem(64,67));


  		itemList.add(new KnapsackItem(29,33));


  		itemList.add(new KnapsackItem(60,64));


  		itemList.add(new KnapsackItem(75,25));


  		itemList.add(new KnapsackItem(69,81));


  		itemList.add(new KnapsackItem(64,36));


  		itemList.add(new KnapsackItem(79,87));


  		itemList.add(new KnapsackItem(55,63));


  		itemList.add(new KnapsackItem(59,51));


  		itemList.add(new KnapsackItem(99,34));


  		itemList.add(new KnapsackItem(97,31));


  		itemList.add(new KnapsackItem(25,55));


  		itemList.add(new KnapsackItem(66,17));


  		itemList.add(new KnapsackItem(97,98));


  		itemList.add(new KnapsackItem(61,90));


  		itemList.add(new KnapsackItem(69,49));


  		itemList.add(new KnapsackItem(98,94));


  		itemList.add(new KnapsackItem(98,45));


  		itemList.add(new KnapsackItem(42,88));


  		itemList.add(new KnapsackItem(88,16));


  		itemList.add(new KnapsackItem(52,47));


  		itemList.add(new KnapsackItem(20,62));


  		itemList.add(new KnapsackItem(67,95));


  		itemList.add(new KnapsackItem(53,53));


  		itemList.add(new KnapsackItem(93,22));


  		itemList.add(new KnapsackItem(98,73));


  		itemList.add(new KnapsackItem(55,96));


  		itemList.add(new KnapsackItem(77,14));


  		itemList.add(new KnapsackItem(26,78));


  		itemList.add(new KnapsackItem(73,35));


  		itemList.add(new KnapsackItem(66,35));


  		itemList.add(new KnapsackItem(42,29));


  		itemList.add(new KnapsackItem(41,20));


  		itemList.add(new KnapsackItem(61,65));


  		itemList.add(new KnapsackItem(55,52));


  		itemList.add(new KnapsackItem(46,71));


  		itemList.add(new KnapsackItem(69,54));


  		itemList.add(new KnapsackItem(14,34));


  		itemList.add(new KnapsackItem(49,28));


  		itemList.add(new KnapsackItem(95,36));


  		itemList.add(new KnapsackItem(74,39));


  		itemList.add(new KnapsackItem(52,57));


  		itemList.add(new KnapsackItem(98,84));


  		itemList.add(new KnapsackItem(28,93));


  		itemList.add(new KnapsackItem(48,49));


  		itemList.add(new KnapsackItem(15,11));


  		itemList.add(new KnapsackItem(53,20));


  		itemList.add(new KnapsackItem(25,77));


  		itemList.add(new KnapsackItem(50,37));


  		itemList.add(new KnapsackItem(56,94));


  		itemList.add(new KnapsackItem(72,90));


  		itemList.add(new KnapsackItem(55,84));


  		itemList.add(new KnapsackItem(65,37));


  		itemList.add(new KnapsackItem(24,75));


  		itemList.add(new KnapsackItem(61,17));


  		itemList.add(new KnapsackItem(43,27));


  		itemList.add(new KnapsackItem(20,11));


  		itemList.add(new KnapsackItem(51,56));


  		itemList.add(new KnapsackItem(47,23));


  		itemList.add(new KnapsackItem(35,100));


  		itemList.add(new KnapsackItem(27,31));


  		itemList.add(new KnapsackItem(27,33));


  		itemList.add(new KnapsackItem(92,58));


  		itemList.add(new KnapsackItem(17,33));


  		itemList.add(new KnapsackItem(53,40));


  		itemList.add(new KnapsackItem(20,95));


  		itemList.add(new KnapsackItem(60,33));


  		itemList.add(new KnapsackItem(47,11));


  		itemList.add(new KnapsackItem(56,68));


  		itemList.add(new KnapsackItem(87,13));


  		itemList.add(new KnapsackItem(33,71));


  		itemList.add(new KnapsackItem(16,27));


  		itemList.add(new KnapsackItem(71,95));


  		itemList.add(new KnapsackItem(54,100));


  		itemList.add(new KnapsackItem(76,74));


  		itemList.add(new KnapsackItem(55,58));


  		itemList.add(new KnapsackItem(80,93));


  		itemList.add(new KnapsackItem(99,16));


  		itemList.add(new KnapsackItem(56,62));


  		itemList.add(new KnapsackItem(69,64));


  		itemList.add(new KnapsackItem(90,13));


  		itemList.add(new KnapsackItem(52,84));


  		itemList.add(new KnapsackItem(33,48));


  		itemList.add(new KnapsackItem(97,73));


  		itemList.add(new KnapsackItem(15,11));


  		itemList.add(new KnapsackItem(43,94));


  		itemList.add(new KnapsackItem(42,67));


  		itemList.add(new KnapsackItem(30,24));


  		itemList.add(new KnapsackItem(31,78));


  		itemList.add(new KnapsackItem(14,40));


  		itemList.add(new KnapsackItem(55,57));


  		itemList.add(new KnapsackItem(22,87));


  		itemList.add(new KnapsackItem(68,88));


  		itemList.add(new KnapsackItem(98,95));


  		itemList.add(new KnapsackItem(67,11));


  		itemList.add(new KnapsackItem(51,39));


  		itemList.add(new KnapsackItem(38,88));


  		itemList.add(new KnapsackItem(29,80));


  		itemList.add(new KnapsackItem(84,99));


  		itemList.add(new KnapsackItem(83,90));


  		itemList.add(new KnapsackItem(87,88));


  		itemList.add(new KnapsackItem(64,92));


  		itemList.add(new KnapsackItem(66,80));


  		itemList.add(new KnapsackItem(50,57));


  		itemList.add(new KnapsackItem(89,77));


  		itemList.add(new KnapsackItem(23,53));


  		itemList.add(new KnapsackItem(32,11));


  		itemList.add(new KnapsackItem(16,84));


  		itemList.add(new KnapsackItem(58,49));


  		itemList.add(new KnapsackItem(54,43));


  		itemList.add(new KnapsackItem(30,20));


  		itemList.add(new KnapsackItem(67,83));


  		itemList.add(new KnapsackItem(63,76));


  		itemList.add(new KnapsackItem(11,70));


  		itemList.add(new KnapsackItem(93,41));


  		itemList.add(new KnapsackItem(42,42));


  		itemList.add(new KnapsackItem(37,32));


  		itemList.add(new KnapsackItem(45,36));


  		itemList.add(new KnapsackItem(59,29));


  		itemList.add(new KnapsackItem(54,53));


  		itemList.add(new KnapsackItem(71,89));


  		itemList.add(new KnapsackItem(90,14));


  		itemList.add(new KnapsackItem(11,41));


  		itemList.add(new KnapsackItem(15,17));


  		itemList.add(new KnapsackItem(43,52));


  		itemList.add(new KnapsackItem(66,51));


  		itemList.add(new KnapsackItem(24,21));


  		itemList.add(new KnapsackItem(99,35));


  		itemList.add(new KnapsackItem(16,83));


  		itemList.add(new KnapsackItem(11,12));


  		itemList.add(new KnapsackItem(28,71));


  		itemList.add(new KnapsackItem(55,62));


  		itemList.add(new KnapsackItem(61,26));


  		itemList.add(new KnapsackItem(21,13));


  		itemList.add(new KnapsackItem(32,18));


  		itemList.add(new KnapsackItem(52,24));


  		itemList.add(new KnapsackItem(43,99));


  		itemList.add(new KnapsackItem(78,62));


  		itemList.add(new KnapsackItem(65,69));


  		itemList.add(new KnapsackItem(76,27));


  		itemList.add(new KnapsackItem(56,81));


  		itemList.add(new KnapsackItem(27,20));


  		itemList.add(new KnapsackItem(22,20));


  		itemList.add(new KnapsackItem(39,52));


  		itemList.add(new KnapsackItem(11,66));


  		itemList.add(new KnapsackItem(35,32));


  		itemList.add(new KnapsackItem(91,96));


  		itemList.add(new KnapsackItem(46,17));


  		itemList.add(new KnapsackItem(47,19));


  		itemList.add(new KnapsackItem(96,14));


  		itemList.add(new KnapsackItem(76,39));


  		itemList.add(new KnapsackItem(58,20));


  		itemList.add(new KnapsackItem(64,71));


  		itemList.add(new KnapsackItem(24,29));


  		itemList.add(new KnapsackItem(78,71));


  		itemList.add(new KnapsackItem(27,31));


  		itemList.add(new KnapsackItem(31,90));


  		itemList.add(new KnapsackItem(83,15));


  		itemList.add(new KnapsackItem(34,76));


  		itemList.add(new KnapsackItem(21,21));


  		itemList.add(new KnapsackItem(23,73));


  		itemList.add(new KnapsackItem(74,52));


  		itemList.add(new KnapsackItem(92,65));


  		itemList.add(new KnapsackItem(50,72));


  		itemList.add(new KnapsackItem(50,46));


  		itemList.add(new KnapsackItem(93,76));


  		itemList.add(new KnapsackItem(63,42));


  		itemList.add(new KnapsackItem(55,15));


  		itemList.add(new KnapsackItem(72,18));


  		itemList.add(new KnapsackItem(37,11));


  		itemList.add(new KnapsackItem(92,93));


  		itemList.add(new KnapsackItem(50,27));


  		itemList.add(new KnapsackItem(52,90));


  		itemList.add(new KnapsackItem(80,60));


  		itemList.add(new KnapsackItem(74,41));


  		itemList.add(new KnapsackItem(41,61));


  		itemList.add(new KnapsackItem(35,20));


  		itemList.add(new KnapsackItem(64,40));


  		itemList.add(new KnapsackItem(19,29));


  		itemList.add(new KnapsackItem(20,50));


  		itemList.add(new KnapsackItem(15,25));


  		itemList.add(new KnapsackItem(72,53));


  		itemList.add(new KnapsackItem(44,63));


  		itemList.add(new KnapsackItem(83,16));


  		itemList.add(new KnapsackItem(52,55));


  		itemList.add(new KnapsackItem(14,75));


  		itemList.add(new KnapsackItem(15,64));


  		itemList.add(new KnapsackItem(34,79));


  		itemList.add(new KnapsackItem(94,95));


  		itemList.add(new KnapsackItem(27,100));


  		itemList.add(new KnapsackItem(45,31));


  		itemList.add(new KnapsackItem(20,99));  
  		//printItemList();
	}
	
	public static synchronized KnapsackOne getInstance() {
	  	if(instance == null) {
	  		instance = new KnapsackOne();
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
	
	public int getKnapsackSize(){
		return itemList.size();
	}
	
	public void createSortedRatioList(){
		double [] entry;
		for(int i=0; i < 750; i++){
			entry = new double[2];
			entry[0] = i;
			entry[1] = this.getItem(i).getRatio();
			this.getItem(i).getRatio();
			sortedRatioList.add(entry);
		}
		Collections.sort(sortedRatioList,new Comparer_Ratio());
		
		 /*Iterator<double[]> itr = sortedRatioList.iterator();
		    while (itr.hasNext()) {
		    	double[] element = itr.next();
		      System.out.println(element[0] + " - "+ element[1]);
		    }*/
		
	}
	
	public void printItemList(){
		logger.trace("profit for knapsack one");
		for(int i = 0; i < itemList.size(); i++){
			KnapsackItem item = (KnapsackItem)itemList.get(i);
			logger.trace(item.getProfit());
		}
		logger.trace("weight for knapsack one");
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
