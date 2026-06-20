### Binary Search – Real World Examples (Input → Expected Output)

> **Note:** Binary Search requires the data to be **sorted**.

---

### 1. Dictionary Word Search

```text
Input:
Words = [Apple, Banana, Cherry, Mango, Orange, Peach]
Target = Mango

Expected Output:
Found at position 4
```

---

### 2. Phone Contact Search (Sorted Contacts)

```text
Input:
Contacts = [Anita, John, Kiran, Meera, Ravi]
Target = Meera

Expected Output:
Found at position 4
```

---

### 3. Employee ID Lookup

```text
Input:
EmployeeIDs = [1001, 1005, 1010, 1015, 1020, 1025]
Target = 1015

Expected Output:
Employee Found
```

---

### 4. Library Book Search

```text
Input:
BookIDs = [101, 205, 309, 450, 512, 678]
Target = 450

Expected Output:
Book Found at position 4
```

---

### 5. Searching a Product by SKU

```text
Input:
SKUs = [10001, 10015, 10023, 10045, 10078]
Target = 10023

Expected Output:
Product Found
```

---

### 6. Student Roll Number Search

```text
Input:
RollNumbers = [1, 5, 8, 12, 15, 20, 25]
Target = 15

Expected Output:
Student Found at position 5
```

---

### 7. Finding a Customer Record

```text
Input:
CustomerIDs = [C101, C205, C309, C450, C512]
Target = C309

Expected Output:
Customer Record Found
```

---

### 8. Database Index Search

```text
Input:
IndexedKeys = [10, 20, 30, 40, 50, 60, 70]
Target = 50

Expected Output:
Record Found
```

---

### 9. Software Version Lookup

```text
Input:
Versions = [1.0, 1.1, 1.2, 2.0, 2.1, 3.0]
Target = 2.0

Expected Output:
Version Available
```

---

### 10. Finding a Page Number in an E-Book

```text
Input:
Pages = [1, 5, 10, 15, 20, 25, 30]
Target = 20

Expected Output:
Page Found
```

---

### 11. Stock Price Search

```text
Input:
Prices = [100, 150, 200, 250, 300, 350]
Target = 250

Expected Output:
Price Found at position 4
```

---

### 12. Not Found Case

```text
Input:
Numbers = [10, 20, 30, 40, 50, 60]
Target = 35

Expected Output:
Not Found (-1)
```

---

### Binary Search on Answer (Very Common in Real Systems)

#### 13. Minimum Internet Speed Required

```text
Input:
Possible Speeds = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
Requirement = Stream 4K video smoothly

Expected Output:
Minimum Required Speed = 50 Mbps
```

#### 14. Minimum Server Capacity

```text
Input:
Possible Servers = [1, 2, 4, 8, 16, 32]
Requirement = Handle 1 Million Requests

Expected Output:
Minimum Servers Required = 8
```

#### 15. Minimum Days to Complete a Project

```text
Input:
Possible Days = [1 ... 100]
Requirement = Finish all tasks

Expected Output:
Minimum Days Required = 27
```

These last examples are how binary search is used in large-scale systems, cloud infrastructure, scheduling, optimization problems, and many DSA interview questions such as "Binary Search on Answer."
