---
title: "Groovy: evaluate code in another file"
timestamp: 2019-04-09T11:30:01
tags:
  - evaluate
published: true
books:
  - groovy
author: szabgab
archive: true
---


Another option in [code reuse in Groovy](/groovy-code-reuse).


{% include file="examples/groovy/c/main.groovy" %}

{% include file="examples/groovy/c/tools.groovy" %}

When we run `groovy main.groovy`


Using the `def` keyword to define a variable will make it inaccessible from
the file that evaluated this code:

```
Caught: groovy.lang.MissingPropertyException: No such property: pi for class: main
groovy.lang.MissingPropertyException: No such property: pi for class: main
	at main.run(main.groovy:7)
```


Probably for the same reason functions defined in the other file cannot be accessed
from the evaluating file.

```
Caught: groovy.lang.MissingMethodException: No signature of method: main.hi() is applicable for argument types: () values: []
Possible solutions: is(java.lang.Object), wait(), run(), run(), any(), find()
groovy.lang.MissingMethodException: No signature of method: main.hi() is applicable for argument types: () values: []
Possible solutions: is(java.lang.Object), wait(), run(), run(), any(), find()
	at main.run(main.groovy:9)
```
