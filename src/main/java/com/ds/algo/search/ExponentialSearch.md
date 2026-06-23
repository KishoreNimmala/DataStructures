### Exponential Search – Real World Examples

> **Exponential Search** is used when:
>
> * The data is **sorted**.
> * The size of the dataset is **unknown or very large**.
> * You first find a search range by doubling (`1, 2, 4, 8, 16, ...`) and then perform Binary Search within that range.

**Time Complexity:** O(log n)

---

### 1. Searching a User in a Huge Employee Database

```text
Input:
EmployeeIDs = [1001, 1002, 1003, ..., 5000000]
Target = 345678

Expected Output:
Employee Found
```

Why Exponential Search?

```text
Database size may not be known initially.
Find range:
1 → 2 → 4 → 8 → 16 → ... → 524288
Then Binary Search.
```

---

### 2. Searching Logs in a Large Log File

```text
Input:
LogEntries = [Sorted by Timestamp]
TargetTimestamp = 2026-06-23 10:15:00

Expected Output:
Log Entry Found
```

---

### 3. Searching a Customer Record in Cloud Storage

```text
Input:
CustomerIDs = [1, 2, 3, ..., N]
Target = 876543

Expected Output:
Customer Found
```

---

### 4. Search in Infinite Sorted Array

```text
Input:
Infinite Array:
[1, 3, 5, 7, 9, 11, 13, ...]

Target = 31

Expected Output:
Found at Position 16
```

This is the classic use case.

---

### 5. Searching a Product SKU

```text
Input:
SKUs = [10001, 10002, ..., 99999999]
Target = 456789

Expected Output:
Product Found
```

---

### 6. Searching a Word in a Large Dictionary

```text
Input:
Words = [A..., B..., C..., ..., Z...]
Target = "Kubernetes"

Expected Output:
Word Found
```

---

### 7. Searching an Order in E-Commerce

```text
Input:
OrderIDs = [1000001, 1000002, ...]
Target = 1509876

Expected Output:
Order Found
```

---

### 8. Searching a Timestamp in Monitoring Data

```text
Input:
Timestamps = [Sorted Time Series]
Target = 2026-06-23 15:30:00

Expected Output:
Timestamp Found
```

---

### 9. Searching a Book in a Digital Library

```text
Input:
BookIDs = [1, 2, 3, ..., 10000000]
Target = 678901

Expected Output:
Book Found
```

---

### 10. Searching a File Offset

```text
Input:
FileOffsets = [0, 1024, 2048, 3072, ...]

Target = 65536

Expected Output:
Offset Found
```

---

### 11. Finding First Transaction After a Certain ID

```text
Input:
TransactionIDs = [100, 200, 300, ..., N]
Target = 50000

Expected Output:
Transaction Found
```

---

### 12. Target Not Found

```text
Input:
Numbers = [10, 20, 30, 40, 50]
Target = 35

Expected Output:
Not Found (-1)
```

---

## How Exponential Search Works

Example:

```text
Array = [2,4,6,8,10,12,14,16,18,20,22,24]
Target = 18
```

### Step 1: Expand Range Exponentially

```text
Index 1 → 4
Index 2 → 6
Index 4 → 10
Index 8 → 18
```

Range identified:

```text
[4 ... 8]
```

---

### Step 2: Binary Search

```text
Array[6] = 14
Array[7] = 16
Array[8] = 18 ✓
```

Found.

---

## Real-World Systems Using Similar Ideas

* Search in distributed databases
* Search in massive log files
* Search in cloud object storage indexes
* Search in monitoring/telemetry systems
* Search in infinite streams
* Search in paginated APIs where total size is unknown
* Memory-mapped files
* Search engine indexing systems

---

### Recognition Pattern

Use **Exponential Search** when:

```text
✓ Data is sorted
✓ Dataset is very large
✓ Size is unknown
✓ Need O(log n) search
✓ Infinite array style problems
```

Classic Interview Problem:

```text
Find an element in a sorted infinite array.
```

The standard solution is:

```text
Exponential Search + Binary Search
```
