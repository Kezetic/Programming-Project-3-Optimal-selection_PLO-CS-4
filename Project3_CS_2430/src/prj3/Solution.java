
/**
 * Team Name: The best programmers
 * Team Members: Yakez Owens, Josh Painter, Saul Prieto, Steven Ruiz
 * Course: CS 2430
 * Project: Programming Project 3
 *
 */

package prj3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yakez Owens, Josh Painter, Saul Prieto, Steven Ruiz
 */
public class Solution {

    private ArrayList<Experiment> experiments;
    private int totalWeight;
    private int totalRating;

    public Solution(List<Experiment> experiments) {
        this.experiments = new ArrayList<>(experiments);
        totalWeight = Greedy.totalWeight(this.experiments);
        totalRating = Greedy.totalRating(this.experiments);
    }

    public ArrayList<Experiment> getExperiments() {
        return new ArrayList<>(experiments);
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public int getTotalRating() {
        return totalRating;
    }

    @Override
    public String toString() {
        return "Selected Experiments: " + experiments
                + "\nTotal Weight: " + totalWeight
                + "\nTotal Rating: " + totalRating;
    }
}
