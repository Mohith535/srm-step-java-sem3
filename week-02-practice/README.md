# Week 2 · Day 2 Live-Coding Session

Five problems on string methods applied to validation and formatting. Full statements: [`docs/week-02-practice-problems.pdf`](../docs/week-02-practice-problems.pdf)

**Status: 2 of 5 solved.** Completed work is in [`solutions/`](solutions/).

---

### 1. Vowel & Consonant Counter ✅

A library orientation kiosk counts vowels and consonants in a submitted book title.

Loop through each character with `charAt()`, count vowels and consonants case-insensitively, and ignore spaces.

```java
void countVowelsAndConsonants(String text)
```

| Input | Output |
|---|---|
| `"Java Programming"` | `Vowels: 5 \| Consonants: 10` |

**Solution:** [`VowelConsonantCounter.java`](solutions/VowelConsonantCounter.java) — normalises each character with `Character.toLowerCase()` up front, so the vowel test is a single comparison chain rather than one for each case. Spaces are skipped with an early `continue`.

---

### 2. CSV Student Record Parser ✅

The T&P team receives registration data as CSV lines and needs each one split into fields and printed as a formatted record.

Split on `,`, validate that **exactly** three fields are present, and print the formatted record — or `Invalid Record`.

```java
void parseStudentRecord(String csvLine)
```

| Input | Output |
|---|---|
| `"Ananya Verma,RA2211003010123,CSE"` | `Name: Ananya Verma \| Roll No: RA2211003010123 \| Dept: CSE` |
| `"Ananya Verma,CSE"` | `Invalid Record` |

**Solution:** [`StudentRecordParser.java`](solutions/StudentRecordParser.java) — validates `fields.length != 3` and returns early, so the formatting code below it can assume all three fields exist. A guard clause rather than a nested `if/else`.

---

### 3. File Extension Validator ⬜

An assignment-upload portal checks whether a filename has an accepted extension before accepting the submission.

Find the last `.` with `lastIndexOf('.')`, extract the extension with `substring()`, and compare it case-insensitively against `pdf`, `docx`, `zip`.

```java
String validateFileExtension(String filename)
```

| Input | Output |
|---|---|
| `"Assignment1.PDF"` | `Accepted` |
| `"notes.txt"` | `Rejected — invalid file type` |

*Concepts:* `lastIndexOf()`, `substring()`, `equalsIgnoreCase()`.

---

### 4. Masked Phone Number Formatter ⬜

A student-support call centre shows a partially masked phone number on screen, with agents confirming identity via the last 4 digits.

Validate the number is exactly 10 digits, then build `XXXXXX` + the last 4 digits using `StringBuilder`, inserting a `-` between them.

```java
String maskPhoneNumber(String phone)
```

| Input | Output |
|---|---|
| `"9876543210"` | `XXXXXX-3210` |
| `"98765"` | `Invalid phone number` |

*Concepts:* length and digit validation, `substring()`, `StringBuilder.insert()`.

---

### 5. Bank Transaction Reference Generator & Validator ⬜

The hardest of the set — a fintech module that both **normalises** and **validates** transaction reference codes.

A valid reference is exactly 14 characters: 3 letters (bank code) + 6 digits (date, `ddMMyy`) + 5 digits (sequence). Users paste them with stray spaces and mixed-case bank codes.

- **Normalise:** `trim()`, then uppercase **only the first 3 characters** via `substring()` + concatenation, leaving the rest untouched.
- **Validate:** exactly 14 characters; first 3 are letters; remaining 11 are digits — using `Character.isLetter()` / `isDigit()` in a loop, **no regex**.
- **On success:** build the display line with `StringBuilder`.
- **On failure:** print the *specific* reason — wrong length, non-letter bank code, or non-digit body.

```java
String normalizeReference(String raw)
String validateAndFormat(String reference)
```

| Input | Output |
|---|---|
| `" hdf03022600042 "` | `[HDF] DATE: 03/02/26 \| SEQ: 00042` |
| `"12F03022600042"` | `Invalid: bank code must be 3 letters` |

*Concepts:* `trim()`, `substring()`, `Character.isLetter()`/`isDigit()`, `StringBuilder`, multi-stage validation with distinct error messages.
