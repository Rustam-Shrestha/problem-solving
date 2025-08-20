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





# Day 9: Progress Summary

## Completed Problems

### 1. Decode Ways (Three Variables)
- **Approach**: Iterative DP with rolling variables `pp`, `p`, and `curr`.
- **Details**:
    - Initialized `pp = 1`, `p = 1` to represent base cases.
    - Iterated through the string, updating `curr` based on valid single and double digit decodings.
    - Used `s.substring(i - 1, i + 1)` to check two-digit validity.
    - Rolled variables forward: `pp = p`, `p = curr`.
    - Time complexity: O(n), Space: O(1).

---

### 2. Word Break (Boolean DP Array)
- **Approach**: DP with nested loops and substring checks.
- **Details**:
    - Initialized `dp[0] = true` to represent empty string.
    - For each `i`, checked all `j < i` where `dp[j]` is true and `s.substring(j, i)` is in the dictionary.
    - Set `dp[i] = true` if a valid break is found.
    - Used `Set<String>` for efficient word lookup.
    - Time complexity: O(n²), Space: O(n).

---

### 3. Move Zeros (Two Pointers)
- **Approach**: In-place array manipulation using `left` and `right` pointers.
- **Details**:
    - `right` scans the array; `left` tracks position to place non-zero values.
    - Swapped `nums[left]` and `nums[right]` when `nums[right] != 0`.
    - Ensured all zeros are pushed to the end while maintaining order.
    - Time complexity: O(n), Space: O(1).

---

## Notes
- Practiced rolling variable DP and boolean array logic.
- Reinforced pointer techniques for in-place array transformation.
- Strengthened intuition for decoding patterns and substring-based DP.

---

## Reflection
- Stayed consistent with problem-solving and markdown documentation.
- Improved fluency in translating logic into clean, reusable code.
- Continued building strategic templates for dynamic programming and array manipulation.

---



# Day 10: Progress Summary

## Completed Problems

### 1. Sort Colors (Dutch National Flag)
- **Approach**: Three-pointer technique using `left`, `mid`, and `right`.
- **Details**:
    - Used `mid` to scan the array, `left` to place 0s, and `right` to place 2s.
    - If `nums[mid] == 0`, swapped with `nums[left]` and incremented both.
    - If `nums[mid] == 1`, moved `mid` forward.
    - If `nums[mid] == 2`, swapped with `nums[right]` and decremented `right`.
    - Achieved in-place sorting with O(n) time and O(1) space.

---

### 2. Reverse Sentence (Preserve Words, Remove Extra Spaces)
- **Approach**: Char array manipulation with two-pointer logic.
- **Details**:
    - Reversed the entire character array.
    - Then reversed each word individually using two pointers.
    - Removed extra spaces by shifting characters in-place.
    - Ensured clean output with single spaces between words and no leading/trailing spaces.
    - Time complexity: O(n), Space: O(1).

---

## Notes
- Practiced pointer-based array and string manipulation.
- Reinforced logic for in-place transformations and whitespace handling.
- Converted notebook logic into clean mental templates for reuse.

---

## Reflection
- Stayed consistent with problem-solving and documentation.
- Improved fluency in translating handwritten logic into structured summaries.
- Continued building strategic templates for array and string problems.

---


# Day 11 — LeetCode Practice Log

## 1. Palindrome Linked List
- Approach: Partition the linked list using slow/fast pointers, reverse the second half, and compare both halves.
- Techniques: Linked list traversal, in-place reversal, two-pointer comparison.
- Complexity:
  - Time: O(n)
  - Space: O(1)

## 2. Minimum Depth of Binary Tree
- Approach: Recursive backtracking with depth calculation.
- Techniques: Tree traversal, base case handling for null children.
- Complexity:
  - Time: O(n)
  - Space: O(n)

## 3. Diameter of Binary Tree
- Approach: Recursive depth tracking with diameter update.
- Techniques: Post-order traversal, backtracking, global max tracking.
- Formula: diameter = max(diameter, left + right)
- Complexity:
  - Time: O(n)
  - Space: O(n)
# Day 12 — LeetCode Practice Log

## 1. Letter Combinations of a Phone Number
- Approach: Backtracking with recursive character building.
- Techniques: Recursion, string manipulation, digit-to-letter mapping.
- Complexity:
    - Time: O(4^n), where n is the length of digits.
    - Space: O(n) for recursion stack.

## 2. Flatten Binary Tree to Linked List
- Approach: Post-order traversal to rearrange pointers.
- Techniques: Tree recursion, pointer manipulation, in-place transformation.
- Complexity:
    - Time: O(n)
    - Space: O(n) due to recursion stack


#Day 13

## Problems Solved

### 1. Rotate Image (90 Degrees Clockwise)
- **Problem**: Given an `n x n` 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
- **Approach**: Transpose the matrix, then reverse each row.

### 2. Majority Element (Boyer-Moore Algorithm)
- **Problem**: Find the majority element in an array (element that appears more than ⌊n/2⌋ times).
- **Approach**: Use Boyer-Moore Voting Algorithm to identify the majority element in linear time and constant space.
# Day 14

## Problems Solved

### 1. Find Maximum in Array
- **Problem**: Given an array of integers, return the maximum value.
- **Approach**: Iterate through the array and track the largest number seen so far.

### 2. Count Even Numbers
- **Problem**: Given an array of integers, count how many are even.
- **Approach**: Loop through the array and increment a counter whenever an element is divisible by 2.

## ✅ GitHub Commit Message


