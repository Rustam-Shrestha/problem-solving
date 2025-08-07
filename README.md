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
