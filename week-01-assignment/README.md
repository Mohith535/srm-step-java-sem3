# Week 1 · Assignment

Five problems on arrays and string traversal. Full statements with scenarios and sample I/O: [`docs/week-01-assignment-problems.pdf`](../docs/week-01-assignment-problems.pdf)

**Status: 5 of 5 solved.** Every solution's output matches the PDF's sample I/O exactly. Code is in [`solutions/`](solutions/).

---

### 1. Exam Hall Seat Duplication Checker ✅

The Examination Cell needs to confirm no seat number was assigned to two students before an exam begins.

Compare every seat number against every other one using nested loops — **no Collections classes, arrays and loops only**. Print any duplicated seat numbers, or a confirmation that none exist.

```java
void checkDuplicateSeats(int[] seatNumbers)
```

| Input | Output |
|---|---|
| `{101, 102, 103, 102, 105}` | `Duplicate Seat Number Found: 102` |
| `{101, 102, 103, 104, 105}` | `No Duplicate Seats Found` |

**Solution:** [`ExamHallSeatChecker.java`](solutions/ExamHallSeatChecker.java)

The naive nested loop has a bug worth avoiding: a seat appearing **three** times gets reported twice, because the pair `(i,j)` matches more than once. Before scanning forward from position `i`, the solution first looks *backward* — if this value already appeared earlier it has been handled, so skip it. Each duplicated value is reported exactly once no matter how many times it repeats.

---

### 2. Typing Speed Test Accuracy Checker ✅

A typing-practice site compares a user's attempt against the original passage and reports how accurate it was, plus where the first mistake occurred.

Accept two equal-length strings, compare them character by character, count positional matches, and compute `(matched ÷ total) × 100`.

```java
void checkTypingAccuracy(String original, String typed)
```

| Input | Output |
|---|---|
| `"hello world"` vs `"hello worlt"` | `Matched: 10/11 \| Accuracy: 90.91% \| First Mismatch at position 11 ('d' vs 't')` |
| `"coding"` vs `"coding"` | `Matched: 6/6 \| Accuracy: 100.00% \| No Mismatches` |

**Solution:** [`TypingAccuracyChecker.java`](solutions/TypingAccuracyChecker.java)

Two details the sample output pins down. The division needs a `(double)` cast — `10 / 11` in integer arithmetic is `0`, which would report 0.00% accuracy. And the mismatch position is **1-based**: the strings differ at index 10, but the expected output says position 11.

`firstMismatch` starts at `-1` and is only assigned once, so it records the *first* mismatch rather than the last.

---

### 3. Traffic Signal Streak Analyzer ✅

Traffic control logs a signal's colour every minute as `R`, `Y` or `G`. Engineers need the longest continuous run of one colour to find a signal that's stuck.

Scan the log, track the length of each run of consecutive identical characters, and keep a running record of the longest — both its colour and its length.

```java
void findLongestStreak(String signalLog)
```

| Input | Output |
|---|---|
| `"RRGGGYRR"` | `Longest Streak: 'G' repeated 3 times` |
| `"RRRRYYGG"` | `Longest Streak: 'R' repeated 4 times` |

**Solution:** [`TrafficSignalStreakAnalyzer.java`](solutions/TrafficSignalStreakAnalyzer.java)

The trap here is checking the streak length only when a run *ends* — the final run never ends, so `"RYYGGGG"` would miss its own answer. The check runs after every character instead, so a streak that reaches the end of the log is still counted. Ties keep the earlier colour, since the update requires strictly greater.

---

### 4. Warehouse Inventory Balancer ✅

Two warehouse sections hold the same product categories. Before the monthly report, confirm both sections hold matching totals and find the single highest-quantity item overall.

Accept two equal-length integer arrays, total each, compare the totals, and locate the highest value — reporting **which section and which index** it came from.

```java
void analyzeInventory(int[] sectionA, int[] sectionB)
```

| Input | Output |
|---|---|
| `A={20,15,30}`, `B={25,10,30}` | `Section A Total: 65 \| Section B Total: 65 \| Status: Balanced \| Highest Quantity: 30 (Section A, Item 3)` |

**Solution:** [`WarehouseInventoryBalancer.java`](solutions/WarehouseInventoryBalancer.java)

The sample input contains a tie — `30` appears in both sections — and the expected output picks **Section A**. Scanning A first and using a strictly-greater comparison (`>`, not `>=`) when scanning B is what makes ties stay with A. `Item 3` confirms the index is reported 1-based.

Tracking the maximum means carrying three things together: the value, its section, and its index.

---

### 5. Movie Review Word Length Profiler ✅

A moderation tool profiles word lengths in submitted reviews — an unusual distribution suggests spam or bot-generated text.

Split the review into words and classify each as **Short** (1–4 letters), **Medium** (5–8) or **Long** (9+), then print the counts.

```java
void classifyWordLengths(String review)
```

| Input | Output |
|---|---|
| `"This movie was absolutely fantastic and thrilling"` | `Short: 3 \| Medium: 1 \| Long: 3` |

**Solution:** [`MovieReviewWordProfiler.java`](solutions/MovieReviewWordProfiler.java)

Splitting on a single space breaks on double spaces — it produces empty strings that get counted as Short words. Trimming first and splitting on `\s+` (a run of whitespace) handles messy real-world input, which matters given the scenario is user-submitted reviews.

The boundaries are inclusive on both ends: `length <= 4` is Short, `<= 8` is Medium, everything else Long.

---

## Running these

```bash
cd solutions
javac ExamHallSeatChecker.java
java  ExamHallSeatChecker
```

Each class has a `main` that runs the PDF's sample inputs, so running it reproduces the expected output directly.
