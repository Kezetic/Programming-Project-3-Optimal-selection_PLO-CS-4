
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
public class BruteForce {

    private static final int MAX_WEIGHT = 700;
    public static ArrayList<Solution> findTopThree(
            ArrayList<Experiment> experiments) {

        ArrayList<Solution> validSolutions = new ArrayList<>();

        // There are 2^n possible subsets.
        int totalSubsets = 1 << experiments.size();

        // Generate every possible subset.
        for (int mask = 0; mask < totalSubsets; mask++) {

            ArrayList<Experiment> selected = new ArrayList<>();

            // Check each experiment's corresponding bit.
            for (int i = 0; i < experiments.size(); i++) {

                // If the bit is 1, include the experiment.
                if ((mask & (1 << i)) != 0) {
                    selected.add(experiments.get(i));
                }
            }

            // Create a solution for this subset.
            Solution solution = new Solution(selected);

            // Only keep solutions that do not exceed 700 kg.
            if (solution.getTotalWeight() <= MAX_WEIGHT) {
                validSolutions.add(solution);
            }
        }

        // Sort by highest rating first.
        // If ratings tie, prefer the lower total weight.
        validSolutions.sort(
            Comparator.comparingInt(Solution::getTotalRating)
                      .reversed()
                      .thenComparingInt(Solution::getTotalWeight)
        );

        // Collect the three highest-rated valid solutions.
        ArrayList<Solution> topThree = new ArrayList<>();

        for (int i = 0; i < Math.min(3, validSolutions.size()); i++) {
            topThree.add(validSolutions.get(i));
        }

        return topThree;
    }

    public static void printTopThree(ArrayList<Solution> solutions) {

        System.out.println("\n========== BRUTE FORCE RESULTS ==========");

        for (int i = 0; i < solutions.size(); i++) {

            System.out.println("\nSolution #" + (i + 1));

            if (i == 0) {
                System.out.println("*** OPTIMAL SOLUTION ***");
            }

            System.out.println(solutions.get(i));
        }

        System.out.println("\n=========================================");
    }

    /*
     * Dynamic Programming pseudocode:
     *
     * Create a DP table where dp[i][w] represents the maximum
     * rating obtainable using the first i experiments with
     * a weight capacity of w.
     *
     * For each experiment:
     *   1. Consider excluding the experiment.
     *   2. If its weight fits, consider including it.
     *   3. Store whichever choice produces the higher rating.
     *
     * After filling the table, trace backward through the
     * decisions to identify the selected experiments.
     *
     * This approach has O(n * capacity) time complexity,
     * compared with O(2^n) for brute force.
     */
}
