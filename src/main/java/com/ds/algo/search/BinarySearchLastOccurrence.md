### Binary Search Last Occurrence – Real World Examples

> Find the **last occurrence** of a target value in a **sorted dataset containing duplicates**.

---

### 1. Last Customer Order

```text
Input:
OrderIDs = [101, 101, 101, 102, 103, 104]
Target = 101

Expected Output:
Last Occurrence = Position 3
```

---

### 2. Last Login Record

```text
Input:
LoginTimes = [09:00, 09:00, 09:00, 09:15, 09:30]
Target = 09:00

Expected Output:
Last Occurrence = Position 3
```

---

### 3. Last Error in Sorted Logs

```text
Input:
StatusCodes = [200, 200, 404, 404, 404, 500]
Target = 404

Expected Output:
Last Occurrence = Position 5
```

---

### 4. Last Product with Same Price

```text
Input:
Prices = [100, 100, 100, 150, 200, 250]
Target = 100

Expected Output:
Last Occurrence = Position 3
```

---

### 5. Last Student with Same Score

```text
Input:
Scores = [70, 80, 80, 80, 90, 95]
Target = 80

Expected Output:
Last Occurrence = Position 4
```

---

### 6. Last Employee in Salary Band

```text
Input:
Salaries = [30000, 40000, 40000, 40000, 50000]
Target = 40000

Expected Output:
Last Occurrence = Position 4
```

---

### 7. Last Sale on a Given Date

```text
Input:
Dates = [2026-06-01, 2026-06-01, 2026-06-01, 2026-06-02]
Target = 2026-06-01

Expected Output:
Last Occurrence = Position 3
```

---

### 8. Last Occurrence of a Word in Dictionary Data

```text
Input:
Words = [Apple, Apple, Banana, Banana, Cherry]
Target = Banana

Expected Output:
Last Occurrence = Position 4
```

---

### 9. Last Matching Sensor Reading

```text
Input:
Readings = [10, 20, 20, 20, 30, 40]
Target = 20

Expected Output:
Last Occurrence = Position 4
```

---

### 10. Last Available Seat Category

```text
Input:
SeatTypes = [Economy, Economy, Economy, Premium, Business]
Target = Economy

Expected Output:
Last Occurrence = Position 3
```

---

### 11. Last Employee with Given Experience

```text
Input:
ExperienceYears = [1, 2, 3, 3, 3, 5, 7]
Target = 3

Expected Output:
Last Occurrence = Position 5
```

---

### 12. Target Not Found

```text
Input:
Numbers = [10, 20, 30, 40, 50]
Target = 25

Expected Output:
Not Found (-1)
```

---

### Common Real-World Uses of Last Occurrence

* Find the most recent transaction with a given ID.
* Determine the last log entry of a specific status code.
* Find the end of a salary range or score range.
* Locate the last customer order on a specific date.
* Find the last occurrence of a keyword in indexed search data.
* Calculate frequency of a value using:

  ```text
  Frequency = LastOccurrence - FirstOccurrence + 1
  ```

Example:

```text
Input:
Scores = [70, 80, 80, 80, 90]
Target = 80

First Occurrence = 2
Last Occurrence = 4

Expected Output:
Frequency = 3
```
