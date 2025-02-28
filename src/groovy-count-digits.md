---
title: "Count digits in Groovy"
timestamp: 2018-06-03T12:30:01
tags:
  - File
  - for
  - in
  - continue
published: true
books:
  - groovy
author: szabgab
archive: true
---


In the [count digit exercise](/exercise-count-digits) we need to take a file like this:

{% include file="examples/data/count_digits.txt" %}

and count how many times each digit appears.


{% include file="examples/groovy/count_digits.groovy" %}

The expression in the first line creates a list of 10 values of 0.

Then we open the file for reading and create a reader that can read the file line-by-line.

Then we iterate over the lines one-by-one and use the `for in` construct to iterate over the characters of the string.

Inside the `for` loop first we check if this is the space charcter. In this solution we assume that the only unwanted character in the whole file is the space.

For every other character we use them as an integer to be the index in the `counter` list and increment the appropriate number.

At the end we have another `for` loop to iterate over all the digits and print the number of occurrences.

