---
title: "Groovy: substring"
timestamp: 2019-02-15T23:32:01
tags:
  - substring
published: true
books:
  - groovy
author: szabgab
archive: true
---


The `substring` method of a string will return a part of the string.

If given two parameters, thense defined the range of the charactes (beginning included, end excluded).
If only one parameter is given this is the beginning of the substring.

The indexing is 0 based so `STRING.substring(0,3)` means the first 3 characters.
and `STRING.substring(4,7)` means the charcter number, 5,6, and 7. (index 4,  5, and 6).



{% include file="examples/groovy/substring.gvy" %}

