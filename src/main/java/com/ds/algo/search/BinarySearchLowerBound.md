### Binary Search Lower Bound – Real World Examples

> **Lower Bound:** Find the **first element that is greater than or equal to (>=) the target** in a sorted dataset.

---

### 1. Hotel Room Booking Price

```text
Input:
RoomPrices = [1000, 1500, 2000, 2500, 3000]
Budget = 1800

Expected Output:
2000
```

(First room price ≥ 1800)

---

### 2. Employee Salary Band

```text
Input:
Salaries = [30000, 40000, 50000, 60000, 70000]
RequiredSalary = 45000

Expected Output:
50000
```

---

### 3. Student Admission Cutoff

```text
Input:
Cutoffs = [60, 70, 80, 90]
StudentScore = 75

Expected Output:
80
```

---

### 4. Flight Ticket Search

```text
Input:
TicketPrices = [5000, 7000, 9000, 12000]
Budget = 8000

Expected Output:
9000
```

---

### 5. Product Search by Price

```text
Input:
Prices = [100, 200, 300, 400, 500]
MinimumPrice = 250

Expected Output:
300
```

---

### 6. Server Capacity Planning

```text
Input:
Capacities = [100, 200, 500, 1000, 2000]
RequiredLoad = 750

Expected Output:
1000
```

---

### 7. Meeting Room Capacity

```text
Input:
RoomCapacities = [10, 20, 50, 100]
Attendees = 35

Expected Output:
50
```

---

### 8. Internet Speed Plan Selection

```text
Input:
Plans = [50, 100, 200, 500]
RequiredSpeed = 120

Expected Output:
200
```

---

### 9. Stock Purchase Quantity

```text
Input:
LotSizes = [10, 25, 50, 100]
RequiredShares = 40

Expected Output:
50
```

---

### 10. Shipping Box Selection

```text
Input:
BoxVolumes = [1, 5, 10, 20, 50]
PackageVolume = 8

Expected Output:
10
```

---

### 11. Exact Match Case

```text
Input:
Prices = [100, 200, 300, 400, 500]
Target = 300

Expected Output:
300
```

---

### 12. Target Greater Than All Elements

```text
Input:
Prices = [100, 200, 300, 400, 500]
Target = 600

Expected Output:
No Lower Bound Found
```

---

### Common Real-World Uses of Lower Bound

#### Database Query

```text
Input:
OrderIDs = [101, 105, 110, 115, 120]
Search = First OrderID >= 108

Expected Output:
110
```

#### Calendar Scheduling

```text
Input:
MeetingSlots = [09:00, 10:00, 11:00, 14:00]
RequestedTime = 10:30

Expected Output:
11:00
```

#### E-Commerce Filter

```text
Input:
ProductPrices = [499, 999, 1499, 1999]
MinimumBudget = 1000

Expected Output:
1499
```

### Key Idea

```text
Lower Bound = First element >= Target
```

Examples:

```text
Array  = [10, 20, 20, 20, 30, 40]

Target = 20
Output = Index 1 (first 20)

Target = 25
Output = Index 4 (30)

Target = 50
Output = Not Found
```
