# Day-of-Week project

Write a program that prompts for a date (numeric month, day, year) and prints the day of the week for that date.

For the purposes of this project, you should assume the entered date is in the Gregorian calendar (i.e., the one we use today), even though it wasn't officially introduced until 1582 and took several hundred years to be fully adopted.

_Hint: It might be helpful to know that 1/1/1 would have been a Monday._

Use the following pseudocode to get you started:

```
Prompt the user for month, day and year.
Determine the number of days between 1/1/1 and the entered date.
Find the weekday number by using the remainder (mod) operator.
Convert the weekday number to an appropriate String and print it.
```

In finding the number of days since 1/1/1, it will be useful to perform a number of different intermediate computations like:
- how many days in a given month?
- how many days since the beginning of the current year?
- how many leap years since 1/1/1?
- ...

Use appropriately nested `if/else`-statements and cumulative algorithms to perform these computations.

_Hint: Recall that every year that is exactly divisible by four is a leap year, except for years that are exactly divisible by 100, unless they're also divisible by 400.  So 1700, 1800, and 1900 were not leap years, but 1600 and 2000 were._

