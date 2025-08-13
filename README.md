# problem-solving
leetcode based problem solving for algorithm with java
# LeetCode Problem Solving Log  
## Day 1: Progress Summary

###  Completed Problems

1. **FizzBuzz**
   - **Approach 1**: Brute-force using conditional statements.
   - **Approach 2**: Bitwise optimization for divisibility checks.

2. **Palindrome Number**
   - Implemented reverse-half logic to avoid integer overflow and string conversion.
   - Ensured handling of negative numbers and trailing zero edge cases.

###  Notes
- Prioritized clean, efficient logic over language-based shortcuts.
- Strengthened familiarity with number manipulation and modular arithmetic.
- Reinforced understanding of basic input constraints and performance-aware coding.

###  Reflection
- Solid start: combined clarity, correctness, and multi-approach thinking.
- Maintained clean formatting and clear return conditions.


## Day 2: Progress Summary

### Completed Problems

1. **Longest Substring Without Repeating Characters**
   - **Approach**: Sliding window with HashMap for character index tracking.
   - Efficiently managed dynamic window bounds to avoid duplicate entries.
   - Achieved linear time complexity with constant-time updates.

2. **Two Sum**
   - **Approach**: HashMap for complement lookup.
   - Executed single-pass iteration with constant-time lookups.
   - Clean handling of edge cases including duplicates and negatives.

3. **Product of Array Except Self**
   - **Approach**: Dynamic programming using prefix and suffix product arrays.
   - Eliminated need for division to ensure robustness.
   - Efficient in both time and space, reused input for optimized output.

---

### Notes
- Reaffirmed skill in applying hash-based logic and index tracking.
- Practiced sliding window techniques for space-time optimization.
- Strengthened dynamic problem-solving through prefix/suffix insight.

---

### Reflection
- Demonstrated growth in strategic thinking and modular breakdown.
- Gained confidence in approaching pattern-based problems.
- Clear progress from brute-force toward algorithmic elegance.


## Day 3: Progress Summary

### Completed Problems

1. **Reverse Linked List (Recursive - Approach 1)**
   - **Approach**: Tail recursion with post-order pointer reversal.
   - Used a helper function to traverse to the end and reverse links on unwind.
   - Maintained a reference to the new head via instance variable.

2. **Reverse Linked List (Recursive - Approach 2)**
   - **Approach**: In-place reversal using return value chaining.
   - Returned tail node to reverse pointers recursively.
   - Ensured null termination to avoid cycles.

3. **Reverse Linked List (Iterative)**
   - **Approach**: Iterative pointer manipulation.
   - Used three pointers (`prev`, `curr`, `next`) to reverse links in-place.
   - Achieved constant space and linear time complexity.

4. **Merge Two Sorted Arrays**
   - **Approach**: Two-pointer technique from the end of both arrays.
   - Merged in-place into the larger array to avoid extra space.
   - Handled edge cases like empty arrays and duplicate values.

5. **Binary Search**
   - **Approach**: Classic divide-and-conquer.
   - Implemented iterative version with mid-point recalculation.
   - Verified correctness across sorted arrays and edge boundaries.

---

### Notes
- Practiced both recursive and iterative paradigms for linked list reversal.
- Strengthened array manipulation skills through in-place merging.
- Revisited binary search fundamentals with precision and edge-case awareness.

---

### Reflection
- Solidified understanding of pointer dynamics in recursive and iterative contexts.
- Improved confidence in space-efficient array operations.
- Built momentum toward mastering foundational algorithms with clean, modular code.


#  Day 4: Progress Summary

##  Completed Problems

### 1. Valid Parentheses
- **Approach**: Stack-based validation using a `HashMap`.
- **Details**:
   - Mapped closing brackets to their corresponding opening brackets.
   - Used a stack to track unmatched opening brackets.
   - Verified correctness by ensuring stack is empty at the end.

### 2. Search in Rotated Sorted Array
- **Approach**: Modified binary search.
- **Details**:
   - Determined which half of the array is sorted at each iteration.
   - Narrowed search space based on target's relation to sorted half.
   - Achieved `O(log n)` time complexity.

### 3. Kth Largest Element in an Unsorted Array
- **Approach**: Min-heap of size `k`.
- **Details**:
   - Used a priority queue to maintain the top `k` largest elements.
   - Pushed elements and removed the smallest when heap exceeded size `k`.
   - Returned the root of the heap as the `k`th largest value.

---

##  Notes
- Practiced stack operations for real-time string parsing.
- Strengthened binary search logic in rotated contexts.
- Applied heap structures for efficient selection problems.

---

## Reflection
- Improved confidence in choosing optimal data structures.
- Developed deeper intuition for algorithmic edge cases.
- Enjoyed the balance of logic, structure, and performance.
---



#  Day 5: Progress Summary

## Completed Problems

### 1. Number of Islands
- **Approach**: DFS-based flood fill.
- **Details**:
  - Iterated through each cell in the grid.
  - Triggered DFS when encountering `'1'` to mark connected land.
  - Counted distinct DFS calls as separate islands.

---

### 2. Clone Graph
- **Approach**: DFS with memoization using a HashMap.
- **Details**:
  - Recursively cloned each node and its neighbors.
  - Used a map to avoid re-cloning visited nodes.
  - Preserved graph structure and connectivity.

---

### 3. Permutations
- **Approach**: Backtracking with DFS.
- **Details**:
  - Explored all number placements recursively.
  - Skipped already-used numbers in current path.
  - Backtracked after each recursive call to explore alternatives.

---

## Notes
- Practiced recursive traversal and memoization in graphs.
- Strengthened DFS intuition for grid and permutation problems.
- Applied backtracking patterns for exhaustive search.

---

## Reflection
- Gained confidence in recursive problem-solving.
- Improved ability to identify base cases and pruning strategies.
- Enjoyed the clarity and elegance of DFS-based solutions.

---


# Day 6: Progress Summary

## Completed Problems

### 1. Combination Sum
- **Approach**: DFS with backtracking and recursion.
- **Details**:
    - Explored all combinations of candidates that sum to the target.
    - Reused elements by staying at the same index during recursive calls.
    - Backtracked after each inclusion to explore alternate paths.

---

### 2. Topological Sort (Kahn’s Algorithm)
- **Approach**: BFS-based topological sorting using in-degree tracking.
- **Details**:
    - Built adjacency list and in-degree array from prerequisites.
    - Used queue to process nodes with zero in-degree.
    - Reduced in-degree of neighbors and added them to queue when zero.

---

### 3. Longest Palindromic Subsequence
- **Approach**: Dynamic programming with matrix + DFS-style reasoning.
- **Details**:
    - Constructed 2D DP table to store LPS lengths for substrings.
    - Filled table bottom-up based on character matches and subproblem overlap.
    - Applied recursive intuition to understand base cases and transitions.

---

## Notes
- Practiced DFS and backtracking in combination problems.
- Applied BFS for graph traversal and topological sorting.
- Strengthened dynamic programming intuition for string-based problems.

---

## Reflection
- Reinforced recursive and iterative traversal strategies.
- Improved ability to translate problem constraints into algorithmic patterns.
- Maintained consistency in coding style and documentation.

---


# Day 7: Progress Summary

## Completed Problems

### 1. Valid Anagram
- **Approach**: Frequency array using `c - 'a'` indexing.
- **Details**:
    - Used a fixed-size array to count character frequencies.
    - Incremented for characters in `s`, decremented for `t`.
    - Checked if all counts returned to zero to confirm anagram validity.
    - Efficient for lowercase English letters with O(n) time and O(1) space.

---

### 2. String Reversal (Two Pointer)
- **Approach**: In-place reversal using two-pointer technique.
- **Details**:
    - Initialized pointers at both ends of the character array.
    - Swapped characters while moving pointers toward the center.
    - Modified the array directly without extra space.
    - Achieved optimal performance with O(n) time and O(1) space.

---

## Notes
- Practiced array manipulation and pointer movement for in-place operations.
- Reinforced character frequency tracking for string comparison problems.
- Strengthened understanding of space-efficient string algorithms.

---

## Reflection
- Improved fluency in translating problem constraints into optimal patterns.
- Maintained consistency in coding style and documentation.
- Continued building a strong foundation in recursion, iteration, and array logic.


# Day 8: Progress Summary

## Completed Problems

### 1. Jump Game (Dynamic Programming)
- **Approach**: Bottom-up DP with nested loops.
- **Details**:
    - Initialized a DP array to track reachability.
    - For each index `i`, checked all previous indices `j` where `j + nums[j] >= i`.
    - Updated `dp[i]` with `Math.max(dp[i], dp[j] + 1)` to reflect reach depth.
    - Final result based on whether `dp[n - 1] > 0`.
    - Time complexity: O(n²), Space: O(n).

---

### 2. Longest Increasing Subsequence
- **Approach**: Classic DP with pairwise comparison.
- **Details**:
    - Initialized `dp[i] = 1` for all indices.
    - Compared each `nums[i]` with all previous `nums[j]` to find increasing sequences.
    - Updated `dp[i] = Math.max(dp[i], dp[j] + 1)` when `nums[i] > nums[j]`.
    - Final result is the max value in the `dp` array.
    - Time complexity: O(n²), Space: O(n).

---

### 3. House Robber (Two Variables)
- **Approach**: Iterative DP using two rolling variables.
- **Details**:
    - Handled base cases for 0 and 1 house.
    - Used `prev1` and `prev2` to track max loot without adjacent robbing.
    - Updated `prev2 = Math.max(prev2, prev1 + nums[i])` in each iteration.
    - Achieved optimal space usage with O(1) space and O(n) time.

---

## Notes
- Practiced nested loop DP and rolling variable optimization.
- Reinforced greedy reachability logic and subsequence tracking.
- Strengthened intuition for space-time tradeoffs in dynamic programming.

---

## Reflection
- Maintained discipline in solving and documenting each problem.
- Improved clarity in translating brute-force logic into structured DP.
- Continued building reusable mental models for array-based challenges.

---