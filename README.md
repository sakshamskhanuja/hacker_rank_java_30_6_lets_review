## 30 Days of Code - Day 6 - Let's Review

### Objective

Today we will expand our knowledge of strings, combining it with what we have already learned about loops.

### Task

Given a string, <i>S</i>, of length <i>N</i> that is indexed from 0 to <i>N</i> - 1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).

<b>Note:</b> 0 is considered to be an even index.

### Example

<i>s</i> = adbeef

Print ```abc def```

### Input Format

The first line contains an integer, <i>T</i> (the number of test cases).<br>
Each line <i>i</i> of the <i>T</i> subsequent lines contain a string, <i>S</i>. 

### Constraints

<ul>
<li>1 <= <i>T</i> <= 10</li>
<li>2 <= length of <i>S</i> <= 10000</li>
</ul>

### Output Format

For each String <i>Sj</i> (where 0 <= <i>j</i> <= <i>T</i> - 1), print <i>Sj</i>'s even-indexed characters, followed by a space, followed by <i>Sj</i>'s odd-indexed characters.

### Sample Input

```
2
Hacker
Rank
```

### Sample Output

```
Hce akr
Rn ak
```

### Explanation

Test Case 0: <i>S</i> = "Hacker"<br>
<i>S</i>[0] = "H"<br>
<i>S</i>[1] = "a"<br>
<i>S</i>[2] = "c"<br>
<i>S</i>[3] = "k"<br>
<i>S</i>[4] = "e"<br>
<i>S</i>[5] = "r"<br>

The even indices are 0, 2, and 4, and the odd indices are 1, 3, and 5. We then print a single line of 2 space-separated strings; the first string contains the ordered characters from <i>S</i>'s even indices (```Hce```), and the second string contains the ordered characters from <i>S</i>'s odd indices (```akr```).

Test Case 1: <i>S</i> = "Rank"<br>
<i>S</i>[0] = "R"<br>
<i>S</i>[1] = "a"<br>
<i>S</i>[2] = "n"<br>
<i>S</i>[3] = "k"<br>

The even indices are 0 and 2, and the odd indices are 1 and 3. We then print a single line of 2 space-separated strings; the first string contains the ordered characters from <i>S</i>'s even indices (```Rn```), and the second string contains the ordered characters from <i>S</i>'s odd indices (```ak```).
