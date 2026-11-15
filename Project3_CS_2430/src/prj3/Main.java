
/**
 * Team Name: The best programmers
 * Team Members: Yakez Owens, Josh Painter, Saul Prieto, Steven Ruiz
 * Course: CS 2430
 * Project: Programming Project 3
 *
 */

package prj3;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Yakez Owens, Josh Painter, Saul Prieto, Steven Ruiz
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Experiment> experiments = fillArrayList();

        System.out.println("=========================================");
        System.out.println("       KNAPSACK PROBLEM - CS 2430");
        System.out.println("=========================================");

        // Part 1: Greedy algorithms

        Solution ratingSolution = runGreedy(
            experiments,
            Comparator.comparingInt(Experiment::getRating).reversed(),
            "HIGHEST RATING FIRST"
        );

        Solution weightSolution = runGreedy(
            experiments,
            Comparator.comparingInt(Experiment::getWeight),
            "LIGHTEST WEIGHT FIRST"
        );

        Solution ratioSolution = runGreedy(
            experiments,
            Comparator.comparingDouble(Experiment::getScore).reversed(),
            "HIGHEST RATING-TO-WEIGHT RATIO FIRST"
        );

        // Part 2: Brute-force algorithm

        ArrayList<Solution> topThree =
            BruteForce.findTopThree(experiments);

        BruteForce.printTopThree(topThree);

        // The first brute-force solution is optimal.
        Solution optimalSolution = topThree.get(0);

        // Part 3: Compare all strategies.
        System.out.println("\n========== COMPARISON SUMMARY ==========");

        compareStrategy("Highest Rating First",
                        ratingSolution, optimalSolution);

        compareStrategy("Lightest Weight First",
                        weightSolution, optimalSolution);

        compareStrategy("Highest Ratio First",
                        ratioSolution, optimalSolution);

        System.out.println("\nBrute Force Optimal Rating: "
                + optimalSolution.getTotalRating());

        System.out.println("Brute Force Optimal Weight: "
                + optimalSolution.getTotalWeight());

        System.out.println("=========================================");
    }

    public static Solution runGreedy(
            ArrayList<Experiment> experiments,
            Comparator<Experiment> comparator,
            String strategyName) {

        // Copy the list so the original is not modified.
        ArrayList<Experiment> sorted = new ArrayList<>(experiments);

        sorted.sort(comparator);

        // Build the payload.
        ArrayList<Experiment> selected = Greedy.payLoad(sorted);

        Solution solution = new Solution(selected);

        System.out.println("\n========== " + strategyName + " ==========");
        System.out.println(solution);

        return solution;
    }

    public static void compareStrategy(
            String name, Solution result, Solution optimal) {

        System.out.println("\n" + name);

        System.out.println("Rating: " + result.getTotalRating());

        System.out.println("Weight: " + result.getTotalWeight());

        if (result.getTotalRating() == optimal.getTotalRating()) {
            System.out.println("Result: MATCHES OPTIMAL SOLUTION");
        } else {
            System.out.println("Result: DOES NOT MATCH OPTIMAL SOLUTION");
        }
    }

    public static ArrayList<Experiment> fillArrayList() {

        ArrayList<Experiment> experiments = new ArrayList<>();

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
}
