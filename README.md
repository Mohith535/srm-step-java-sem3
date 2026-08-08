# SRM STEP · Java — Semester 3

> Second-year STEP Java coursework: string manipulation, input validation, and real-world parsing problems. **In progress** — updated as each week's problems are solved.

<p align="left">
  <img alt="Language" src="https://img.shields.io/badge/Language-Java-orange?style=flat-square&logo=openjdk&logoColor=white">
  <img alt="Status" src="https://img.shields.io/badge/Status-In%20Progress-yellow?style=flat-square">
  <img alt="Solved" src="https://img.shields.io/badge/Solved-2%20%2F%2010-blue?style=flat-square">
  <img alt="Course" src="https://img.shields.io/badge/Course-SRM%20STEP%20%C2%B7%20CodInClub-red?style=flat-square">
  <img alt="License" src="https://img.shields.io/badge/License-MIT-lightgrey?style=flat-square">
</p>

---

## About

Semester 3 of the STEP programme at SRM, delivered through **CodInClub (powered by BridgeLabz)**. The step up from [Semester 2](https://github.com/Mohith535/srm-step-java-sem2) is in framing: every problem now arrives as a **scenario** from a plausible system — an exam-hall seating check, a fintech reference-code validator, a review-moderation tool — with a suggested method signature and a required output format to match.

The recurring themes are **validation before processing**, **multi-stage checks that report the specific reason for failure**, and doing string work with `charAt()`, `substring()` and `StringBuilder` rather than reaching for regex.

Original problem statements are preserved in [`docs/`](docs/).

---

## Progress

| Week | Set | Problems | Solved | Folder |
|:---:|---|:---:|:---:|---|
| **1** | Assignment | 5 | 0 | [`week-01-assignment/`](week-01-assignment/) |
| **2** | Day 2 Live-Coding Session | 5 | 2 | [`week-02-practice/`](week-02-practice/) |

```
██████░░░░░░░░░░░░░░░░░░░░░░░░  2 / 10
```

---

## Week 1 · Assignment

Arrays and string traversal, with an emphasis on tracking a running maximum and reporting *where* it was found — not just what it was. [Problem statements →](docs/week-01-assignment-problems.pdf)

| # | Problem | The task | Status |
|:---:|---|---|:---:|
| 1 | **Exam Hall Seat Duplication Checker** | Find duplicate seat numbers using nested loops only — no Collections | ⬜ |
| 2 | **Typing Speed Test Accuracy Checker** | Compare two equal-length strings position by position; report accuracy % and the first mismatch | ⬜ |
| 3 | **Traffic Signal Streak Analyzer** | Find the longest run of consecutive identical characters in a signal log | ⬜ |
| 4 | **Warehouse Inventory Balancer** | Total two arrays, compare them, and locate the single highest value with its section and index | ⬜ |
| 5 | **Movie Review Word Length Profiler** | Split a review and bucket each word as Short (1–4), Medium (5–8) or Long (9+) | ⬜ |

## Week 2 · Day 2 Live-Coding Session

String methods applied to validation and formatting. [Problem statements →](docs/week-02-practice-problems.pdf)

| # | Problem | The task | Status |
|:---:|---|---|:---:|
| 1 | **Vowel & Consonant Counter** | Count vowels and consonants case-insensitively, ignoring spaces | ✅ [Solution](week-02-practice/solutions/VowelConsonantCounter.java) |
| 2 | **CSV Student Record Parser** | Split a CSV line into 3 fields, validate the count, print a formatted record | ✅ [Solution](week-02-practice/solutions/StudentRecordParser.java) |
| 3 | **File Extension Validator** | Extract the extension with `lastIndexOf('.')` and check it against pdf/docx/zip | ⬜ |
| 4 | **Masked Phone Number Formatter** | Validate 10 digits, then build `XXXXXX-3210` with `StringBuilder` | ⬜ |
| 5 | **Bank Transaction Reference Generator & Validator** | Normalise and validate a 14-char reference; report the specific failure reason | ⬜ |

---

## Concepts across the two sets

| Area | Where it shows up |
|---|---|
| `charAt()` traversal | Vowel counting, typing accuracy, streak analysis |
| `split()` | CSV parsing, word-length profiling |
| `substring()` + `lastIndexOf()` | File extensions, phone masking, reference codes |
| `StringBuilder` | Phone masking, formatted reference display |
| `Character.isLetter()` / `isDigit()` | Reference validation — explicitly without regex |
| Arrays + nested loops | Seat duplication, inventory balancing |
| Tracking max with its index | Warehouse inventory, longest streak |
| Multi-stage validation | Bank reference — length, then bank code, then body |

---

## Running a solution

```bash
cd week-02-practice/solutions
javac VowelConsonantCounter.java
java  VowelConsonantCounter
# → Vowels: 5 | Consonants: 10
```

**Requirements:** JDK 8 or newer.

---

## Related

| Repository | Description |
|---|---|
| [srm-step-java-sem2](https://github.com/Mohith535/srm-step-java-sem2) | Semester 2 — 41 programs covering fundamentals, control flow, arrays, strings and three console projects |

---

<div align="left">

**K Mohith Kannan** · SRM Institute of Science and Technology
[GitHub](https://github.com/Mohith535) · Released under the [MIT License](LICENSE)

</div>
