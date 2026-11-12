**Purpose**
This document describes the general logic and steps used by each algorithm to solve the Knapsack Problem. 
The goal is to select science experiments with the highest possible total rating without exceeding the maximum weight capacity of 700 kg.

**1. Highest Rating First**
The algorithm sorts all experiments from highest rating to lowest rating. 
It selects experiments one at a time, as long as adding an experiment does not exceed the 700 kg capacity.

**2. Lightest Weight First**
The algorithm sorts experiments from lowest weight to highest weight. 
It selects the lightest experiments first while making sure the total weight stays within the capacity.

**3. Best Rating-to-Weight Ratio First**
The algorithm calculates the rating-to-weight ratio for each experiment by dividing its rating by its weight. 
It sorts experiments from highest ratio to lowest ratio and selects experiments while respecting the 700 kg limit.

**4. Brute-Force Algorithm**
The brute-force algorithm evaluates all 4,096 possible combinations of the 12 experiments.
It calculates the total weight and rating of each combination, removes combinations that exceed 700 kg, and identifies the three highest-rated valid solutions.

**5. Dynamic Programming**
The Dynamic Programming algorithm uses a table to store the best ratings for smaller weight capacities and experiment selections. 
It compares the options of including or excluding each experiment to find the maximum possible rating. It then reconstructs the selected experiments.

**6. Algorithm Comparison**
The three greedy strategies use different selection priorities and do not guarantee an optimal solution.
Brute force and Dynamic Programming guarantee an optimal solution for this problem. 
Comparing their results helps demonstrate the differences in efficiency and accuracy between the algorithms.
