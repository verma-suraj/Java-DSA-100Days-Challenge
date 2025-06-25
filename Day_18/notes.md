# Day 18: Advanced Recursion Problems (Part 2)

## 🌟 Topics Covered
- Recursive problem solving using recurrence relations
- Classic DP-recursable problems: tiling and pairing

---

## 🧩 Problem 1: Tiling Problem (n x m floor with 1 x m tiles)

### 🔹 Problem Statement  
Given a floor of size `n x m`, and tiles of size `m x 1`, count the number of ways to tile the floor completely.

---

### 💡 Approach
- You can place a tile vertically (takes up `m` rows)
- Or place it horizontally (takes 1 row)

Use a recursive formula based on two choices:
```
ways(n) = ways(n - m) + ways(n - 1)
```

---

### ✅ Base Cases:
- If `n == m` → 2 ways (all horizontal, all vertical)
- If `n < m` → 1 way (only vertical placement fits)

---

### 🔁 Recursive Function Signature
```java
int placeTile(int n, int m)
```

---

### ⏱ Time Complexity
- Exponential (can be optimized via memoization)

---

### 🧪 Try It Yourself  
Try solving before checking the code — the logic remains the same across most variations.

**Practice Link**  
🔗 [GFG – Tiling Problem](https://www.geeksforgeeks.org/tiling-problem/)  

---

### 📂 Resources  
- 🔗 [Solution Code](Day_18/Tiling/tileProblem.java)  
- 🔗 [Dry Run](Day_18/Tiling/Dry_Run.md)  
- 🔗 [Detailed Explanation](Day_18/Tiling/tileProblem.java)  

---

## 🧩 Problem 2: Party Invitation (Single or Pair)

### 🔹 Problem Statement  
You are hosting a party with `n` guests. Each guest can either:
- Come alone
- Pair up with another guest

Find the number of ways to invite all guests.

---

### 💡 Approach
- A guest comes alone → `ways(n-1)`
- A guest pairs with one of the (n-1) remaining → `(n-1) * ways(n-2)`

Recursive Formula:
```
ways(n) = ways(n - 1) + (n - 1) * ways(n - 2)
```

---

### ✅ Base Case:
- If `n <= 1` → only 1 valid way

---

### 🔁 Recursive Function Signature
```java
int callGuest(int n)
```

---

### ⏱ Time Complexity
- Exponential without memoization  
- Can be optimized using DP later

---

### 🧪 Try It Yourself  
Try implementing it first. It's a foundational recurrence problem frequently asked in interviews.

**Practice Link**  
🔗 [Coding Ninjas – Friends Pairing Problem](https://www.codingninjas.com/studio/problems/friends-pairing-problem_1214620)  
🔗 [GFG – Friends Pairing](https://www.geeksforgeeks.org/friends-pairing-problem/)

---

### 📂 Resources  
- 🔗 [Solution Code](Day_18/PartyGuests/ways_to_call_guests.java)  
- 🔗 [Dry Run](Day_18/PartyGuests/Dry_Run.md)  
- 🔗 [Detailed Explanation](Day_18/PartyGuests/explanation.md)  

---

## 📊 Summary Table

| Problem                          | Time Complexity | Space Complexity | Technique                   |
|----------------------------------|-----------------|------------------|-----------------------------|
| Tiling a Floor (n x m)          | Exponential     | O(n)             | Recursion, Combinatorics    |
| Party Invitations (Single/Pair) | Exponential     | O(n)             | Recursion, Subproblem Break |

---

## 🔁 What's Next
- Optimize both problems using memoization
- Convert to DP bottom-up tabulation versions
- Add problem variations with constraints
