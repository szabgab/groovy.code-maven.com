---
title: "Groovy: Random numbers, random selection from list of values"
timestamp: 2018-09-14T11:00:01
tags:
  - Random
  - next
  - nextInt
  - Math.random
published: true
books:
  - groovy
author: szabgab
archive: true
---


In order to generate pseudo-random numbers in Groovy, we can use the
[Math.random()](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#random--)
method or the [Random](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)
class provided by Java.


## Random float

The `random` method will generate a floating point number between 0 and 1.
(0 included 1 excluded).

{% include file="examples/groovy/random_float.gvy" %}

## Random integers

{% include file="examples/groovy/random_integers.gvy" %}

In the next example we have a list of one-letter strings and we would like to
pick one of the elements randomly. So we need an integer between 0 and the size of the
array.

We run it in a loop so we can see more values picked.

{% include file="examples/groovy/random_selection.gvy" %}

