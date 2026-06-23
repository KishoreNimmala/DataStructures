### Binary Search on Answer – Real World Examples

> **Binary Search on Answer** is used when the answer lies in a range and you can verify whether a candidate answer is feasible using an `isPossible()` function.

Pattern:

```text
F F F F T T T T
```

or

```text
T T T T F F F F
```

Find the boundary between feasible and infeasible answers.

---

## 1. Internet Speed Plan Selection

```text
Input:
Available Speeds = [10, 20, 30, ..., 1000] Mbps
Requirement = Stream 4K video for 10 devices

Expected Output:
Minimum Speed = 200 Mbps
```

Question:

```text
What is the minimum internet speed that satisfies the requirement?
```

---

## 2. Cloud Server Capacity

```text
Input:
Possible Servers = [1 ... 1000]
Requirement = Handle 1,000,000 requests/hour

Expected Output:
Minimum Servers Required = 8
```

Question:

```text
How many servers are needed at minimum?
```

---

## 3. Delivery Truck Capacity

```text
Input:
Packages = [10,20,30,40,50]
Days = 3

Expected Output:
Minimum Truck Capacity = 60
```

Question:

```text
What is the minimum truck capacity to deliver all packages within 3 days?
```

(Equivalent to shipping packages problem)

---

## 4. Book Allocation

```text
Input:
Books = [100, 200, 300, 400]
Students = 2

Expected Output:
Minimum Maximum Pages = 600
```

Question:

```text
What is the minimum maximum pages assigned to any student?
```

---

## 5. Video Streaming Infrastructure

```text
Input:
Concurrent Users = 5,000,000
Possible Machines = [1 ... 100]

Expected Output:
Minimum Machines = 12
```

Question:

```text
How many machines are required to support all users?
```

---

## 6. Meeting Room Allocation

```text
Input:
Meetings = [100 meetings]
Possible Rooms = [1 ... 50]

Expected Output:
Minimum Rooms Required = 7
```

Question:

```text
What is the minimum number of rooms needed?
```

---

## 7. Factory Production Rate

```text
Input:
Orders = 10,000 units
Deadline = 5 days

Expected Output:
Minimum Machines Required = 15
```

Question:

```text
What is the minimum machine count to finish before deadline?
```

---

## 8. Database Cluster Scaling

```text
Input:
QueriesPerSecond = 500,000
Possible Nodes = [1 ... 100]

Expected Output:
Minimum Nodes = 9
```

Question:

```text
What is the minimum cluster size that can handle the load?
```

---

## 9. Elevator Capacity

```text
Input:
People = 500
Trips Allowed = 10

Expected Output:
Minimum Elevator Capacity = 50
```

Question:

```text
What elevator capacity is needed?
```

---

## 10. Mobile Battery Capacity

```text
Input:
Usage = 12 hours
Possible Battery Sizes = [1000 ... 10000] mAh

Expected Output:
Minimum Battery Capacity = 4500 mAh
```

Question:

```text
What is the smallest battery that lasts 12 hours?
```

---

## 11. Hiring Engineers

```text
Input:
Tasks = 1000
Deadline = 30 days

Expected Output:
Minimum Engineers = 6
```

Question:

```text
What is the minimum team size to finish on time?
```

---

## 12. Hotel Room Booking

```text
Input:
Guests = 1000
Possible Rooms = [1 ... 500]

Expected Output:
Minimum Rooms = 250
```

Question:

```text
What is the minimum number of rooms needed?
```

---

## Software Engineering Example

### Auto-Scaling Kubernetes Pods

```text
Input:
Traffic = 100,000 requests/minute

Possible Pods:
1 ... 100
```

Check:

```java
isPossible(pods)
```

returns:

```text
Can these pods handle the traffic?
```

Result:

```text
Pods:
1  2  3  4  5  6  7  8  9  10

F  F  F  F  F  T  T  T  T  T
```

Expected Output:

```text
Minimum Pods = 6
```

---

## Famous DSA Problems

* Koko Eating Bananas
* Capacity To Ship Packages Within D Days
* Split Array Largest Sum
* Aggressive Cows
* Allocate Minimum Number of Pages
* Painter's Partition Problem
* Minimum Days to Make M Bouquets

---

## Recognition Pattern

Ask yourself:

```text
Can I search over possible answers?
Can I write an isPossible(answer) function?
Does feasibility change monotonically?
```

Example:

```text
Answer = 1   → Not Possible
Answer = 2   → Not Possible
Answer = 3   → Not Possible
Answer = 4   → Possible
Answer = 5   → Possible
Answer = 6   → Possible
```

```text
F F F T T T T
```

Whenever you see this monotonic pattern, Binary Search on Answer is usually applicable.
