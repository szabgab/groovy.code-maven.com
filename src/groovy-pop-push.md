---
title: "Groovy pop push"
timestamp: 2019-04-20T07:30:01
tags:
  - pop
  - push
  - size
published: true
books:
  - groovy
author: szabgab
archive: true
---


In Groovy you can use an array as if it was a stack pushing elements to the end and poping elements from the end.



{% include file="examples/groovy/push_pop.groovy" %}

```
[Mary, Joe, Fanny, George, Liz, Peter]
Peter
[Mary, Joe, Fanny, George, Liz]
```


## Pop from empty array raises exception

{% include file="examples/groovy/pop_empty.groovy" %}


```
Caught: java.util.NoSuchElementException: Cannot pop() an empty List
java.util.NoSuchElementException: Cannot pop() an empty List
	at pop_empty.run(pop_empty.groovy:2)
```


## Check emptyness before calling pop

To avoid the exception we can check the `size` of the array before calling `pop`.

{% include file="examples/groovy/pop_check_empty.groovy" %}
