(# Linear Search – Real World Examples (Input → Expected Output))

Below are practical examples demonstrating linear search behavior in common scenarios. Each example shows the input list, the target value, and the expected output when using a linear search algorithm.

1. **Contact Search**

```
Input: Contacts = [Ravi, Kiran, Anita, John, Meera]
Target = John
Expected Output: Found at position 4
```

2. **Shopping Cart Item Check**

```
Input: Cart = [Laptop, Mouse, Keyboard, Monitor]
Target = Keyboard
Expected Output: Item found
```

3. **Attendance Verification**

```
Input: Students = [Amit, Deepak, Rahul, Sneha]
Target = Rahul
Expected Output: Present (Position 3)
```

4. **File Search**

```
Input: Files = [report.docx, notes.txt, budget.xlsx, presentation.pptx]
Target = budget.xlsx
Expected Output: File found at position 3
```

5. **Playlist Search**

```
Input: Playlist = [Song A, Song B, Song C, Song D]
Target = Song C
Expected Output: Song found at position 3
```

6. **User Lookup**

```
Input: Users = [user1, user2, user3, user4]
Target = user3
Expected Output: User exists
```

7. **Inventory Check**

```
Input: Products = [TV, Laptop, Phone, Tablet]
Target = Phone
Expected Output: Available in stock
```

8. **Error Log Search**

```
Input: Logs = [INFO, INFO, WARN, ERROR_500, INFO]
Target = ERROR_500
Expected Output: Error found at entry 4
```

9. **Exam Hall Ticket Search**

```
Input: HallTickets = [1001, 1002, 1003, 1004]
Target = 1003
Expected Output: Seat allocated (Position 3)
```

10. **Customer Record Search**

```
Input: CustomerIDs = [C101, C205, C309, C450]
Target = C309
Expected Output: Customer record found
```

11. **Not Found Case**

```
Input: Numbers = [10, 20, 30, 40, 50]
Target = 35
Expected Output: Not Found (-1)
```

12. **Airport Watchlist Check**

```
Input: Watchlist = [ID101, ID205, ID307, ID450]
Target = ID307
Expected Output: Match found at position 3
```

13. **Generic Example (search semantics)**

```
Input: Array = [a0, a1, a2, ..., an]
Target = x
Expected Output: If x exists, return its position; otherwise return -1
```

These examples map directly to the step-by-step comparisons performed in a linear search: scan each element from the start, compare with the target, and stop when a match is found (or after the last element if not found).

