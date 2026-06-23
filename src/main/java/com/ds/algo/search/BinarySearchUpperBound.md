### Binary Search Upper Bound – Real World Examples

> **Upper Bound:** Find the **first element that is strictly greater than (>) the target** in a sorted dataset.

---

### 1. Next Available Hotel Room Price

```text
Input:
RoomPrices = [1000, 1500, 2000, 2500, 3000]
CurrentPrice = 2000

Expected Output:
2500
```

---

### 2. Next Salary Band

```text
Input:
Salaries = [30000, 40000, 50000, 60000, 70000]
CurrentSalary = 50000

Expected Output:
60000
```

---

### 3. Student Grade Upgrade

```text
Input:
Grades = [60, 70, 80, 90]
CurrentScore = 80

Expected Output:
90
```

---

### 4. Flight Ticket Upgrade

```text
Input:
TicketPrices = [5000, 7000, 9000, 12000]
CurrentPrice = 9000

Expected Output:
12000
```

---

### 5. Product Price Filter

```text
Input:
Prices = [100, 200, 300, 400, 500]
CurrentPrice = 300

Expected Output:
400
```

---

### 6. Server Capacity Upgrade

```text
Input:
Capacities = [100, 200, 500, 1000, 2000]
CurrentCapacity = 500

Expected Output:
1000
```

---

### 7. Meeting Room Selection

```text
Input:
RoomCapacities = [10, 20, 50, 100]
CurrentCapacity = 20

Expected Output:
50
```

---

### 8. Internet Plan Upgrade

```text
Input:
Plans = [50, 100, 200, 500]
CurrentPlan = 100

Expected Output:
200
```

---

### 9. Shipping Box Upgrade

```text
Input:
BoxVolumes = [1, 5, 10, 20, 50]
CurrentVolume = 10

Expected Output:
20
```

---

### 10. Next Meeting Slot

```text
Input:
Slots = [09:00, 10:00, 11:00, 14:00]
CurrentTime = 10:00

Expected Output:
11:00
```

---

### 11. Duplicate Values Example

```text
Input:
Scores = [70, 80, 80, 80, 90, 95]
Target = 80

Expected Output:
90
```

Explanation:

* First value > 80 is 90.

---

### 12. Database Record Search

```text
Input:
OrderIDs = [101, 105, 110, 115, 120]
Target = 110

Expected Output:
115
```

---

### 13. Target Not Present

```text
Input:
Numbers = [10, 20, 30, 40, 50]
Target = 25

Expected Output:
30
```

---

### 14. Target Greater Than All Elements

```text
Input:
Numbers = [10, 20, 30, 40, 50]
Target = 50

Expected Output:
No Upper Bound Found
```

---

### Common Real-World Uses

#### Promotion Eligibility

```text
Input:
ExperienceYears = [1, 2, 3, 5, 7, 10]
CurrentExperience = 5

Expected Output:
7
```

(Next promotion band)

---

#### E-Commerce Product Recommendation

```text
Input:
ProductPrices = [499, 999, 1499, 1999]
CurrentSelection = 999

Expected Output:
1499
```

(Next higher-priced product)

---

#### Stock Trading

```text
Input:
StockPrices = [100, 120, 150, 180, 200]
CurrentPrice = 150

Expected Output:
180
```

(Next higher price level)

---

### Key Idea

```text
Upper Bound = First element > Target
```

Examples:

```text
Array = [10, 20, 20, 20, 30, 40]

Target = 20
Output = 30

Target = 25
Output = 30

Target = 40
Output = Not Found
```

### Lower Bound vs Upper Bound

| Target | Lower Bound (>= Target) | Upper Bound (> Target) |
| ------ | ----------------------- | ---------------------- |
| 20     | 20                      | 30                     |
| 25     | 30                      | 30                     |
| 40     | 40                      | Not Found              |

This distinction is heavily used in databases, search engines, analytics systems, frequency counting, and range queries.
