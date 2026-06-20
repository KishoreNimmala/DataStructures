### Binary Search First Occurrence – Real World Examples

> Find the **first occurrence** of a target value in a **sorted dataset containing duplicates**.

---

### 1. First Customer Order

```text
Input:
OrderIDs = [101, 101, 101, 102, 103, 104]
Target = 101

Expected Output:
First Occurrence = Position 1
```

---

### 2. First Login Record

```text
Input:
LoginTimes = [09:00, 09:00, 09:00, 09:15, 09:30]
Target = 09:00

Expected Output:
First Occurrence = Position 1
```

---

### 3. First Error in Sorted Logs

```text
Input:
StatusCodes = [200, 200, 404, 404, 404, 500]
Target = 404

Expected Output:
First Occurrence = Position 3
```

---

### 4. First Product with Same Price

```text
Input:
Prices = [100, 100, 100, 150, 200, 250]
Target = 100

Expected Output:
First Occurrence = Position 1
```

---

### 5. First Student with Same Score

```text
Input:
Scores = [70, 80, 80, 80, 90, 95]
Target = 80

Expected Output:
First Occurrence = Position 2
```

---

### 6. First Employee in Salary Band

```text
Input:
Salaries = [30000, 40000, 40000, 40000, 50000]
Target = 40000

Expected Output:
First Occurrence = Position 2
```

---

### 7. First Sale on a Given Date

```text
Input:
Dates = [2026-06-01, 2026-06-01, 2026-06-01, 2026-06-02]
Target = 2026-06-01

Expected Output:
First Occurrence = Position 1
```

---

### 8. First Occurrence of a Word in Dictionary Data

```text
Input:
Words = [Apple, Apple, Banana, Banana, Cherry]
Target = Banana

Expected Output:
First Occurrence = Position 3
```

---

### 9. First Matching Sensor Reading

```text
Input:
Readings = [10, 20, 20, 20, 30, 40]
Target = 20

Expected Output:
First Occurrence = Position 2
```

---

### 10. First Available Seat Category

```text
Input:
SeatTypes = [Economy, Economy, Economy, Premium, Business]
Target = Economy

Expected Output:
First Occurrence = Position 1
```

---

### 11. First Employee with Given Experience

```text
Input:
ExperienceYears = [1, 2, 3, 3, 3, 5, 7]
Target = 3

Expected Output:
First Occurrence = Position 3
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

### Common Use Cases

* Database records with duplicate keys
* Log analysis (first error occurrence)
* E-commerce products with same price
* Student score analysis
* Employee salary/experience reports
* Time-series and sensor data
* Search engines and indexing systems

**Goal:** Find the **leftmost occurrence** of the target in a sorted collection.
