/**
 * 
 * Team Name: The best programmers
 * Team Members: Yakez Owens, Josh Painter, Saul Prieto, Steven Ruiz
 * Course: 2430
 * Project: CS 2430 - Programming Project 3
 *
 */

package prj3;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Represents a class of Greedy algorithms
 * 
 * @author Josh Painter
 */
public class Greedy {
	
	/**
	 * Sorts and calls the  payLoadPrint method ArrayList of experiments by Rating
	 * 
	 * @param experiments
	 */
	public static void sortByHighestRating(ArrayList<Experiment> experiments) {
		System.out.println("Highest Rating Payload:");
		experiments.sort(Comparator.comparingInt(Experiment::getRating).reversed());
		payLoadPrint(experiments);
	}
	
	/**
	 * Sorts and calls the  payLoadPrint method ArrayList of experiments by weight
	 * 
	 * @param experiments
	 */
	public static void sortByLightestWeight(ArrayList<Experiment> experiments) {
		System.out.println("Lightest Weight Payload:");
		experiments.sort(Comparator.comparingInt(Experiment::getWeight));
		payLoadPrint(experiments);
	}
	
	/**
	 * Sorts and calls the  payLoadPrint method ArrayList of experiments by score
	 * 
	 * @param experiments
	 */
	public static void sortByHighestScore(ArrayList<Experiment> experiments) {
		System.out.println("Highest Score PayLoad:");
		experiments.sort(Comparator.comparingDouble(Experiment::getScore).reversed());
		payLoadPrint(experiments);
	}
	
	/**
	 * Calls the greedy method and prints out the pay load, total weight of pay load, and total rating of pay load.
	 * 
	 * @param experiments
	 */
	private static void payLoadPrint(ArrayList<Experiment> experiments) {
		experiments = payLoad(experiments);
		System.out.println(experiments);
		System.out.println("Total Weight: " + totalWeight(experiments));
		System.out.println("Total Rating: " + totalRating(experiments));
		System.out.println();
	}
	
	/**
	 * Implements a greedy solution to go through an already sorted ArrayList, creating a new array list of a pay load.
	 * The total Weight of the pay load cannot exceed the weight of 700.
	 * Will add an element of the experiments list to the pay load and checks the whole weight of the pay load.
	 * If the total weight of pay load exceeds 700, the last element will be removed.
	 * 
	 * @param experiments
	 * @return payLoad
	 */
	public static ArrayList<Experiment> payLoad(ArrayList<Experiment> experiments) {
		ArrayList<Experiment> payLoad = new ArrayList<>();
		
		for (Experiment experiment : experiments) {
			payLoad.add(experiment);
			
			int count = 0;
			
			for (int i = 0; i < payLoad.size(); i++) {
				count += payLoad.get(i).getWeight();
			}
			
			if (count > 700) {
				payLoad.removeLast();
			}
		}
		
		return payLoad;
		
	}
	
	/**
	 * Calculates total weight of an ArrayList of Experiments
	 * 
	 * @return totalWeight
	 */
	public static int totalWeight(ArrayList<Experiment> experiments) {
		int totalWeight = 0;
		
		for (Experiment experiment : experiments) {
			totalWeight += experiment.getWeight();
		}
		
		return totalWeight;
	}
	
	/**
	 * Calculates total Rating of an ArrayList of Experiments
	 * 
	 * @return totalRating
	 */
	public static int totalRating(ArrayList<Experiment> experiments) {
		int totalRating = 0;
		
		for (Experiment experiment : experiments) {
			totalRating += experiment.getRating();
		}
		
		return totalRating;
	}
}
