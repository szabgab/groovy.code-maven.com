---
title: "Groovy: Undeclared variable - runtime exception - groovy.lang.MissingPropertyException"
timestamp: 2018-05-27T09:30:01
tags:
  - def
  - MissingPropertyException
published: true
books:
  - groovy
author: szabgab
archive: true
---


Unlike the "strongly typed" languges, Groovy does not check the existance of all the variables at compile time.
This can lead to run-time exceptions such as `groovy.lang.MissingPropertyException`


{% include file="examples/groovy/undeclared_variable.groovy" %}

In this script we declare and use a variable called `val`, but in one point,
in the second `if`-statement, we used the variable name `value`. Presumably by mistake.

If the input is 10 or more the code runs smoothly, but if the input is less than 10 then we get a run-time exception:

```
Caught: groovy.lang.MissingPropertyException: No such property: value for class: undeclared_variable
groovy.lang.MissingPropertyException: No such property: value for class: undeclared_variable
	at undeclared_variable.run(undeclared_variable.groovy:6)
```

