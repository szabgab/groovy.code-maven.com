---
title: "Groovy value types"
timestamp: 2018-05-27T08:30:01
tags:
  - boolean
  - int
  - byte
  - Integer
published: true
books:
  - groovy
author: szabgab
archive: true
---


The literal values in Groovy are similar to those in Java, but Groovy allows for generic variables that can hold any
type and provides no enforcement and it allows you to declare variables with types and then enforce the type.


## Declare variables with def

Declaring a varable using `def` allows for the flexibility most dynamic programming languges provide.

{% include file="examples/groovy/variable_types_def.groovy" %}

## Declare variable as Integer

{% include file="examples/groovy/variable_types_integer.groovy" %}

If we declare a variable to be `Integer` it provides automatic casting from other numbers, but does not allow
the assignment of other types. For example it will throw the following exception if we try to assign a string or a list:

```
Caught: org.codehaus.groovy.runtime.typehandling.GroovyCastException: Cannot cast object 'world' with class 'java.lang.String' to class 'java.lang.Integer'
org.codehaus.groovy.runtime.typehandling.GroovyCastException: Cannot cast object 'world' with class 'java.lang.String' to class 'java.lang.Integer'
	at variable_types_integer.run(variable_types_integer.groovy:4)
```

## byte

{% include file="examples/groovy/variable_types_byte.groovy" %}

## Numbers

```
// primitive types
byte  b = 1
char  c = 2
short s = 3
int   i = 4
long  l = 5

// infinite precision
BigInteger bi =  6


// primitive types
float  f = 1.234
double d = 2.345

// infinite precision
BigDecimal bd =  3.456
```

## Boolean

We can declare a variable as `boolean` and then it can only hold `true` or `false`,
but we can assign any type of value to it and it will be automatically converted to either
`true` or `false`.

{% include file="examples/groovy/variable_types_boolean.groovy" %}

[Groovy Truth](http://docs.groovy-lang.org/latest/html/documentation/core-semantics.html#Groovy-Truth) provides the details of the coercion to boolean values.



## Syntax

See the [Groovy syntax](http://groovy-lang.org/syntax.html) for more details.

## Comments

boolean b = ""; returns false; however not b = "" even with prior declaration and assignment of b as boolean b = false per se within groovysh shell command prompt


