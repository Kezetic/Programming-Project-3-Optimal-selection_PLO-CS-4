**Purpose**

The purpose of this test plan is to verify that all algorithms work correctly 
and that the program selects experiments without exceeding the maximum capacity of 700 kg.

**Testing Objectives**
The team will verify the following:

All 12 experiments are loaded correctly with their corresponding weights and ratings.
The three greedy algorithms select experiments according to their respective strategies.
No selected combination exceeds the 700 kg capacity.
The brute-force algorithm evaluates all 4,096 possible combinations and displays the three highest-rated valid solutions.
The Dynamic Programming algorithm produces the same optimal rating as brute force, if implemented.
Total weights and ratings are calculated correctly.

**Edge Case Testing**
The team will also test different situations, including:

An empty experiment list.
An experiment that exceeds the 700 kg capacity.
An experiment weighing exactly 700 kg.
Multiple experiments with the same rating.
Multiple experiments with the same rating-to-weight ratio.

**Verification**
The team will compare the results of the three greedy strategies against the brute-force optimal solution. 
If Dynamic Programming is implemented, its optimal rating will also be compared with brute force.

Test results will be documented using program outputs, screenshots, and GitHub evidence.

**Definition of Done**
Testing will be considered complete when all algorithms execute successfully, 
all selected combinations respect the weight limit, the brute-force top three solutions are correct, and the required test cases pass.
