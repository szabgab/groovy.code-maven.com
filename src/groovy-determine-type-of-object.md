---
title: "Groovy: Determine type of an object"
timestamp: 2018-06-01T07:30:01
tags:
  - instanceof
  - getClass
published: true
books:
  - groovy
author: szabgab
archive: true
---


Creating an object called `obj` of type [java.util.ArrayList](https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html) which implements the [java.util.List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html) interface.

`instanceof` checks if obj is the subclass of some class.

`getClass` returns the exact type of an object.


{% include file="examples/groovy/check_type.groovy" %}
