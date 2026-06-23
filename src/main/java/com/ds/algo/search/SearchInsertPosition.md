### Search Insert Position – Real World Examples

> **Search Insert Position:** Find the position where a target exists or should be inserted in a **sorted array** to maintain sorted order.

---

### 1. Student Rank List

```text
Input:
Ranks = [10, 20, 30, 40, 50]
NewScoreRank = 35

Expected Output:
Insert at Position 4
```

---

### 2. Employee Salary Band

```text
Input:
SalaryBands = [30000, 40000, 50000, 60000]
NewSalary = 45000

Expected Output:
Insert at Position 3
```

---

### 3. Product Price Catalog

```text
Input:
Prices = [100, 200, 300, 400, 500]
NewPrice = 250

Expected Output:
Insert at Position 3
```

---

### 4. Flight Ticket Prices

```text
Input:
TicketPrices = [5000, 7000, 9000, 12000]
NewPrice = 8000

Expected Output:
Insert at Position 3
```

---

### 5. Meeting Schedule

```text
Input:
MeetingTimes = [09:00, 10:00, 11:00, 14:00]
NewMeeting = 10:30

Expected Output:
Insert at Position 3
```

---

### 6. Customer IDs

```text
Input:
CustomerIDs = [101, 105, 110, 115, 120]
NewCustomerID = 108

Expected Output:
Insert at Position 3
```

---

### 7. Library Book IDs

```text
Input:
BookIDs = [1001, 1005, 1010, 1015]
NewBookID = 1008

Expected Output:
Insert at Position 3
```

---

### 8. Internet Speed Plans

```text
Input:
Plans = [50, 100, 200, 500]
RequiredPlan = 150

Expected Output:
Insert at Position 3
```

---

### 9. Stock Price Levels

```text
Input:
Prices = [100, 120, 150, 180, 200]
NewPrice = 160

Expected Output:
Insert at Position 4
```

---

### 10. Exam Marks

```text
Input:
Marks = [60, 70, 80, 90]
NewMark = 75

Expected Output:
Insert at Position 3
```

---

### 11. Target Already Exists

```text
Input:
Numbers = [10, 20, 30, 40, 50]
Target = 30

Expected Output:
Position 3
```

---

### 12. Insert at Beginning

```text
Input:
Numbers = [10, 20, 30, 40, 50]
Target = 5

Expected Output:
Position 1
```

---

### 13. Insert at End

```text
Input:
Numbers = [10, 20, 30, 40, 50]
Target = 60

Expected Output:
Position 6
```

---

### Real-World Applications

#### Database Indexing

```text
Input:
IndexedKeys = [100, 200, 300, 400]
NewKey = 250

Expected Output:
Insert at Position 3
```

#### Contact List

```text
Input:
Contacts = [Anita, John, Meera, Ravi]
NewContact = Kiran

Expected Output:
Insert at Position 3
```

#### E-Commerce Product Catalog

```text
Input:
Prices = [499, 999, 1499, 1999]
NewProductPrice = 1200

Expected Output:
Insert at Position 3
```

---

### Key Idea

```text
Array = [10, 20, 30, 40, 50]

Target = 30 → Position 3
Target = 25 → Position 3
Target = 5  → Position 1
Target = 60 → Position 6
```

In practice, **Search Insert Position = Lower Bound Index** (the first position where the target can be placed without breaking the sorted order).
