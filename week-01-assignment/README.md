# Week 1 · Assignment

Five problems on arrays and string traversal. Full statements with scenarios and sample I/O: [`docs/week-01-assignment-problems.pdf`](../docs/week-01-assignment-problems.pdf)

**Status:** not yet started — solutions will be added here as they're written.

---

### 1. Exam Hall Seat Duplication Checker

The Examination Cell needs to confirm no seat number was assigned to two students before an exam begins.

Compare every seat number against every other one using nested loops — **no Collections classes, arrays and loops only**. Print any duplicated seat numbers, or a confirmation that none exist.

```java
void checkDuplicateSeats(int[] seatNumbers)
```

| Input | Output |
|---|---|
| `{101, 102, 103, 102, 105}` | `Duplicate Seat Number Found: 102` |
| `{101, 102, 103, 104, 105}` | `No Duplicate Seats Found` |

*Concepts:* arrays, nested loops, conditional logic.

---

### 2. Typing Speed Test Accuracy Checker

A typing-practice site compares a user's attempt against the original passage and reports how accurate it was, plus where the first mistake occurred.

Accept two equal-length strings, compare them character by character, count positional matches, and compute `(matched ÷ total) × 100`.

```java
void checkTypingAccuracy(String original, String typed)
```

| Input | Output |
|---|---|
| `"hello world"` vs `"hello worlt"` | `Matched: 10/11 \| Accuracy: 90.91% \| First Mismatch at position 11 ('d' vs 't')` |
| `"coding"` vs `"coding"` | `Matched: 6/6 \| Accuracy: 100.00% \| No Mismatches` |

*Concepts:* string traversal, `charAt()`, percentage calculation and formatting.

---

### 3. Traffic Signal Streak Analyzer

Traffic control logs a signal's colour every minute as `R`, `Y` or `G`. Engineers need the longest continuous run of one colour to find a signal that's stuck.

Scan the log, track the length of each run of consecutive identical characters, and keep a running record of the longest — both its colour and its length.

```java
void findLongestStreak(String signalLog)
```

| Input | Output |
|---|---|
| `"RRGGGYRR"` | `Longest Streak: 'G' repeated 3 times` |
| `"RRRRYYGG"` | `Longest Streak: 'R' repeated 4 times` |

*Concepts:* string traversal, character comparison, tracking a running maximum.

---

### 4. Warehouse Inventory Balancer

Two warehouse sections hold the same product categories. Before the monthly report, confirm both sections hold matching totals and find the single highest-quantity item overall.

Accept two equal-length integer arrays, total each, compare the totals, and locate the highest value — reporting **which section and which index** it came from.

```java
void analyzeInventory(int[] sectionA, int[] sectionB)
```

| Input | Output |
|---|---|
| `A={20,15,30}`, `B={25,10,30}` | `Section A Total: 65 \| Section B Total: 65 \| Status: Balanced \| Highest Quantity: 30 (Section A, Item 3)` |

*Concepts:* arrays, sum accumulation, tracking a maximum together with its index.

---

### 5. Movie Review Word Length Profiler

A moderation tool profiles word lengths in submitted reviews — an unusual distribution suggests spam or bot-generated text.

Split the review into words and classify each as **Short** (1–4 letters), **Medium** (5–8) or **Long** (9+), then print the counts.

```java
void classifyWordLengths(String review)
```

| Input | Output |
|---|---|
| `"This movie was absolutely fantastic and thrilling"` | `Short: 3 \| Medium: 1 \| Long: 3` |

*Concepts:* `split()`, loops, categorisation and counting.
