**Programming-Project-3-Optimal-Selection_PLO-CS-4**
**CS 2430, Section 501 | Programming Project 3 – The Knapsack Problem**

**Team Members:** Yakez Owens, Josh Painter, Saul Prieto, Steven Ruiz

**1. What This Project Does**
This project applies concepts from discrete mathematics, algorithm design, and optimization to solve the classic 0/1 Knapsack Problem using practical programming solutions.

The program models a space shuttle payload selection problem in which a maximum of 700 kg of scientific experiments can be transported into near-Earth orbit. Each experiment has a specific weight and scientific rating. The goal is to select a combination of experiments that maximizes the total rating without exceeding the shuttle's weight capacity.

*The project implements and compares multiple algorithmic approaches:*

**Part 1 – Greedy Algorithms**
Three greedy strategies independently select experiments based on different priorities:
**Highest Rating First:** Selects experiments in descending order of rating, prioritizing the experiments with the highest individual scientific value.
Lightest First: Selects experiments in ascending order of weight, prioritizing experiments that use the least payload capacity.
**Best Rating-to-Weight Ratio First:** Calculates each experiment's rating divided by its weight and prioritizes experiments with the highest value per kilogram.
Each strategy produces a list of selected experiments, total weight, and total scientific rating. No strategy is allowed to exceed the 700 kg capacity.

**Part 2 – Brute-Force / Exhaustive Search**
The program generates and evaluates all 4,096 possible combinations of the 12 available experiments.
For each combination, it calculates the total weight and rating. Combinations exceeding 700 kg are rejected. The remaining valid combinations are compared to identify the three highest-rated solutions.

**Part 3 – Algorithm Comparison**
The program compares the results of all three greedy strategies against the brute-force optimal solution.
It displays the selected experiments, total weight, and total rating for each strategy and identifies which greedy strategies match the optimal result.
This comparison demonstrates the differences between locally optimal decisions and globally optimal solutions.

**Part 4 – Dynamic Programming (Extra Credit)**
An optional dynamic programming implementation can solve the knapsack problem by storing the best possible rating for smaller experiment groups and weight capacities.
Instead of recalculating every possible combination, dynamic programming reuses previously calculated results to improve efficiency for larger datasets.
If implemented, the program displays the optimal experiment selection and compares its results and computational complexity with brute force.

**2. Requirements**
- Java JDK
- No external libraries

**3. How to Build and Run**
The project should run using the team's selected programming language without requiring external dependencies.
For a Java implementation, run:

# Run the complete project
Java main.java
For a Java implementation, compile and run the project using the appropriate package and class structure.

**The program displays:**
Results from all three greedy algorithms.
The three highest-rated valid brute-force combinations.
The overall optimal experiment selection.
A comparison of greedy results against the optimal solution.
Dynamic programming results, if implemented.
All output is labeled clearly so that each algorithm's results can be identified and compared.

**4. Project Layout**
Programming-Project-3/
│
├── main.java                  Main program; runs all algorithms
├── experiments.java           Stores the 12 scientific experiments
├── greedy.java                 Contains the three greedy strategies
├── brute_force.java            Evaluates all possible subsets
├── dynamic_programming.java    Optional DP implementation
│
├── docs/
│   ├── PROJECT_PLAN.md       Project scope, roles, milestones
│   ├── PSEUDOCODE.md         Algorithm pseudocode
│   ├── DESIGN_NOTES.md       Design decisions and complexity
│   └── TEST_PLAN.md          Testing and verification procedures
│
├── README.md                 Project description and run instructions
├── CONTRIBUTIONS.md          Team roles and individual contributions
└── .gitignore

**5. Design Notes**
**Experiment Representation:** Each experiment is represented using its name, weight in kilograms, and scientific rating. The program stores all 12 experiments in a structured collection.
**Weight Constraint:** Every selection must satisfy the condition that its total weight is less than or equal to 700 kg. Experiments are indivisible, meaning an experiment must either be selected completely or excluded.
**Greedy Algorithms:** Each greedy strategy sorts the experiments according to its selection criteria and adds an experiment only when sufficient capacity remains.
**Brute-Force Algorithm:** The exhaustive search represents each possible selection using a binary combination. Each of the 12 experiments can either be included or excluded, resulting in 2^12 = 4,096 possible subsets.
**Dynamic Programming:** The optional DP approach uses a table where each entry stores the highest rating achievable using a particular number of experiments and weight capacity. The table is used to reconstruct the optimal selection.

**Complexity Analysis:**
**Greedy algorithms:** O(n log n), primarily due to sorting.
**Brute force:** O(2^n × n) when evaluating every subset by examining its experiments.
**Dynamic programming:** O(nW), where n is the number of experiments and W is the maximum weight capacity.
**Validation:** Every algorithm must verify that the selected experiments do not exceed the 700 kg limit. The brute-force solution also serves as a reference for evaluating the accuracy of the greedy strategies.

**6. Project Results and Expected Comparison**
*Using the 12 experiments supplied in the assignment, the initial calculated results are:*
Algorithm	Total Weight	Total Rating
Highest Rating First	690 kg	45
Lightest First	654 kg	52
Best Ratio First	654 kg	52
Brute-Force Optimal	692 kg	53
The brute-force algorithm identifies the highest possible rating of 53 while remaining within the 700 kg weight restriction.

- The results demonstrate that greedy algorithms can produce strong solutions, but they do not always identify the globally optimal combination.
- The dynamic programming implementation, if completed, should produce the same optimal rating as brute force.

**7. Team Roles and Responsibilities**
**Yakez Owens – Communications Lead:** Responsible for organizing the GitHub repository, maintaining project documentation, coordinating communication, and managing the Project Plan and README.

**Josh Painter – Implementation Lead:** Responsible for implementing the three greedy algorithms, coordinating the brute-force implementation, and maintaining the main development branch.

**Saul Prieto – Verification Lead:** Responsible for developing the test plan, verifying algorithm correctness, checking edge cases, and ensuring that experiment selections never exceed the 700 kg capacity.

**Steven Ruiz – Development and Integration Support:** Responsible for supporting algorithm development, integrating program components, contributing to technical documentation, and assisting with the final project demonstration.

Official role rotation and individual evidence of contributions will be documented in PROJECT_PLAN.md and CONTRIBUTIONS.md.

**8. Documentation and Evidence**
   
Project Plan with assigned responsibilities, milestones, and task statuses.
Algorithm pseudocode and design notes.
Test Plan with expected results and verification procedures.
README with project overview and execution instructions.
CONTRIBUTIONS.md identifying team responsibilities and evidence pointers.
GitHub commits, issues, and pull requests provide evidence of individual contributions and project development.

The team will also maintain a record of completed tasks and supporting evidence to demonstrate progress throughout the project.

**9. Final Deliverables**
The completed project will include:

Three working greedy algorithm implementations.
A brute-force implementation evaluating all 4,096 possible subsets.
A comparison of the three greedy results against the optimal solution.
Dynamic programming implementation for extra credit, if completed.
A professional team report (3–5 pages, excluding tables and appendices).
A complete GitHub repository containing source code and documentation.
CONTRIBUTIONS.md with team responsibilities and evidence.
A screencast of no more than 10 minutes demonstrating the program and each team member's contribution.
The final submission will include a standalone PDF or DOCX report, a ZIP package exported from the repository, and the team screencast or an accessible video link.
