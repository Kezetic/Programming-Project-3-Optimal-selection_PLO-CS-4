package prj3;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Experiment> experiments = fillArrayList();
		
		System.out.println(experiments);
		
		sortByWeight(experiments);
		sortByRating(experiments);
		sortByScore(experiments);
		
	}
	
	/**
	 * Fills an ArrayList of experiments listed in assignment ant returns that object.
	 * 
	 * @return ArrayList<Experiments> experiments
	 */
	public static ArrayList<Experiment> fillArrayList() {
		
		ArrayList<Experiment> experiments = new ArrayList<Experiment>();
		
		experiments.add(new Experiment("Cloud Patterns", 36, 5));
		experiments.add(new Experiment("Solar Flares", 264, 9));
		experiments.add(new Experiment("Solar Power", 188, 6));
		experiments.add(new Experiment("Binary Stars", 203, 8));
		experiments.add(new Experiment("Relativity", 104, 8));
		experiments.add(new Experiment("Seed Viability", 7, 4));
		experiments.add(new Experiment("Sun Spots", 90, 2));
		experiments.add(new Experiment("Mice Tumors", 65, 8));
		experiments.add(new Experiment("Microgravity Plant Growth", 75, 5));
		experiments.add(new Experiment("Micrometeorites", 170, 9));
		experiments.add(new Experiment("Cosmic Rays", 80, 7));
		experiments.add(new Experiment("Yeast Fermentation", 27, 4));
		
		return experiments;
	}
	
	/**
	 * Sorts and prints out an ArrayList of experiments by weight
	 * 
	 * @param experiments
	 */
	public static void sortByWeight(ArrayList<Experiment> experiments) {
		experiments.sort(Comparator.comparingInt(Experiment::getWeight));
		System.out.println(experiments);
	}
	
	/**
	 * Sorts and prints out an ArrayList of experiments by Rating
	 * 
	 * @param experiments
	 */
	public static void sortByRating(ArrayList<Experiment> experiments) {
		experiments.sort(Comparator.comparingInt(Experiment::getRating));
		System.out.println(experiments);
	}
	
	/**
	 * Sorts and prints out an ArrayList of experiments by score
	 * 
	 * @param experiments
	 */
	public static void sortByScore(ArrayList<Experiment> experiments) {
		experiments.sort(Comparator.comparingDouble(Experiment::getScore));
		System.out.println(experiments);
	}

}
