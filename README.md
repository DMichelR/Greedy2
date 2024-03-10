# Greedy2
## Exercise C of contest
 **Greedy Choice**:
    The greedy choice here is to always select the smallest knight that can defeat the current dragon head. By selecting the smallest knight for each dragon head, we maximize the chances of using fewer knights overall.

 **Optimal Substructure**:
The optimal substructure here lies in the fact that the problem can be solved by considering a single dragon head and its corresponding knight. By solving the problem for each dragon head individually and then combining the results, we can find the overall optimal solution.

 **Proof of Greedy Algorithm:**
Let's assume that our greedy algorithm doesn't produce the optimal solution. This means there exists a solution where a smaller knight could have been used for a particular dragon head while still achieving the overall optimal solution.

Now, let's consider our algorithm. At each step, it selects the smallest knight that can defeat the current dragon head. If there existed a smaller knight that could defeat the current dragon head, our algorithm would have selected it instead. Thus, there cannot be a solution where using a smaller knight would lead to a better overall solution. This contradicts our assumption, proving that our greedy algorithm indeed produces the optimal solution.

 **Time Complexity:**  Sorting the heads and knights takes O(n log n + m log m) time. The loop to match heads with knights takes O(n + m) time. Thus, the overall time complexity of the solution is O(n log n + m log m).

## Coco's theme party
 **Greedy Choice**: The greedy choice in this code is to pair the smallest and largest guests together in order to minimize the total difference in their assigned numbers. By doing this, the overall absolute difference between the assigned numbers for each pair is minimized.

 **Optimal Substructure**: The optimal substructure here lies in the fact that pairing the smallest and largest guests together optimally reduces the total difference between their assigned numbers. This can be proven by observing that the absolute difference between the smallest and largest numbers in the sorted array is minimized when they are paired together. Additionally, once these pairs are formed, the problem reduces to finding the absolute differences between subsequent pairs.

 **Time Complexity**: Sorting the guests takes O(n log n) time, where n is the number of guests. The loop to calculate the total sum of absolute differences runs in O(n/2) time. Thus, the overall time complexity of the solution is dominated by the sorting step, making it O(n log n).

 ## Coco's Birthday

 **Greedy Choice**:
The greedy choice in this code is to always select the person with the highest happiness level (largest integer) at each step. By selecting the person with the highest happiness level and incrementing the count, we prioritize maximizing the number of attendees who experience happiness.

 **Optimal Substructure**:
The optimal substructure in this problem lies in the fact that at each step, we select the person with the highest happiness level and distribute their happiness to others. By continually selecting the person with the highest happiness level and redistributing their happiness, we achieve an optimal solution where the maximum number of attendees experience happiness.

 **Time Complexity**:
The time complexity of this solution primarily depends on two operations: adding elements to the priority queue and removing elements from the priority queue. Adding an element to a priority queue takes O(log n) time, where n is the current size of the priority queue. Removing the maximum element from the priority queue also takes O(log n) time. Since we perform these operations for each of the n attendees, the overall time complexity of the solution is O(n log n).
