---
title: "Groovy throw (raise) exception"
timestamp: 2019-04-21T16:30:01
tags:
  - throw
  - Exception
  - try
  - catch
published: true
books:
  - groovy
author: szabgab
archive: true
---


Being able to catch exceptions is important, but so is the ability to raise exceptions (or throw exceptions)
as it is called in Groovy.


If you pass a negative number to the `Math.sqrt` method, it will return a value called
`NaN` Not A Number.

{% include file="examples/groovy/sqrt.groovy" %}

What if you'd like to write your own sqrt function that will throw an exception if a negative value is passed to it?


Here is a solution:

{% include file="examples/groovy/my_sqrt.groovy" %}

```
2.0
Caught: java.lang.Exception: The number -1 was negative
java.lang.Exception: The number -1 was negative
	at my_sqrt.sqrt(my_sqrt.groovy:4)
	at my_sqrt$sqrt.callCurrent(Unknown Source)
	at my_sqrt.run(my_sqrt.groovy:11)
```

The code that would print "still alive" is not executed.


## Catch my exception

{% include file="examples/groovy/catch_my_sqrt.groovy" %}

