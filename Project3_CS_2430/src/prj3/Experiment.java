/**
 * 
 * Team Name: The best programmers
 * Team Members: Yakez Owens, Josh Painter, Saul Prieto, Steven Ruiz
 * Course: 2430
 * Project: CS 2430 - Programming Project 3
 *
 */

package prj3;

/**
 * Represents an experiment recording the name, weight, rating, and score.
 * 
 * @author Josh Painter
 */
public class Experiment{
	
	private String name;
	private int weight;
	private int rating;
	private double score;
	
	/**
	 * Constructs an experiment using a name, weight, and rating.
	 * Calculates a score by dividing rating by weight.
	 * 
	 * @param name
	 * @param weight
	 * @param rating
	 */
	public Experiment(String name, int weight, int rating) {
		
		this.name = name;
		this.weight = weight;
		this.rating = rating;
		//Score calculation rating / weight type casted to double
		this.score = (double) rating / (double) weight;
		
	}

	/**
	 * Gets name of experiment.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets weight of experiment.
	 * 
	 * @return weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * Gets the rating of the experiment.
	 * 
	 * @return rating.
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * Gets the score of the experiment.
	 * 
	 * @return
	 */
	public double getScore() {
		return score;
	}

	@Override
	public String toString() {
		return String.format("[Name: %s Weight: %d Rating: %d Score: %.2f]",name, weight, rating, score);
	}
	
}
