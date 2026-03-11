# 🍪 Assign Cookies – Greedy Algorithm (Java)

## 📌 Overview

This project demonstrates the **Assign Cookies problem** using the **Greedy Algorithm approach** in Java.

The goal is to determine the **maximum number of children that can be satisfied with the available cookies**.

Each child has a **greed factor**, and each cookie has a **size**.
A child can only be satisfied if the cookie size is **greater than or equal to the child's greed factor**.

---

# 🎯 Problem Statement

You are given two arrays:

* `g[]` → greed factor of children
* `s[]` → sizes of cookies

A child `i` can be satisfied if:

```
s[j] >= g[i]
```

Each cookie can be assigned to **only one child**.

The objective is to **maximize the number of satisfied children**.

---

# 🧠 Greedy Strategy

The greedy idea is:

1️⃣ Sort both arrays (children greed and cookie sizes).
2️⃣ Start assigning the **smallest cookie to the least greedy child**.
3️⃣ If the cookie satisfies the child, move to the next child.
4️⃣ Always move to the next cookie.

This ensures **maximum possible children are satisfied**.

---

# ⚙️ Algorithm Steps

1. Sort the greed array `g`.
2. Sort the cookie array `s`.
3. Use two pointers:

   * one for children
   * one for cookies
4. If the cookie satisfies the child, increment the child pointer.
5. Always move the cookie pointer.
6. Return the number of satisfied children.

---

# 💻 Java Implementation

```java
public static int findContentChildren(int[] g, int[] s) {

    Arrays.sort(g);
    Arrays.sort(s);

    int child = 0;
    int cookie = 0;

    while (child < g.length && cookie < s.length) {

        if (s[cookie] >= g[child]) {
            child++;
        }

        cookie++;
    }

    return child;
}
```

---

# ▶️ Example

### Input

```
g = [1, 2, 3]
s = [1, 1]
```

### Explanation

* Cookie `1` satisfies child with greed `1`
* Second cookie `1` cannot satisfy child with greed `2`

### Output

```
Maximum satisfied children: 1
```

---

# ⏱ Time and Space Complexity

| Complexity       | Value      |
| ---------------- | ---------- |
| Time Complexity  | O(n log n) |
| Space Complexity | O(1)       |

Where `n` is the size of the arrays.

Sorting dominates the time complexity.

---

# 🧩 Concepts Used

* Greedy Algorithm
* Sorting
* Two Pointer Technique
* Array Manipulation

---

# 📚 Learning Outcomes

Through this project you will learn:

✔ How greedy algorithms work
✔ How sorting helps optimize greedy solutions
✔ How to use the two-pointer technique
✔ Solving optimization problems efficiently

---

