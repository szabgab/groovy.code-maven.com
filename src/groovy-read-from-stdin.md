---
title: "Groovy: read from console (STDIN, keyboard)"
timestamp: 2018-05-27T09:00:01
tags:
  - Console
  - System
  - readLine
published: true
books:
  - groovy
author: szabgab
archive: true
---


Reading from the Standard Input (aka. STDIN) which is by default connected to the keyboard is somewhere between
Java and the dynamic languages in lightness.


## Read from STDIN in Groovy

Reading from the Standard Input, normally the keyboard, is also quite easy.

`System.in` represents the Standard Input channel.

`def` defines a variable name. There is no need to declare the type of the variable.

`println` only takes one argument, so instead of passing a list of values we use the `+`
operator to concatenate the values.

{% include file="examples/groovy/input_from_stdin.groovy" %}

## Read from Console in Groovy

A shorter alternative is to use the [Console](https://docs.oracle.com/javase/7/docs/api/java/io/Console.html) object, but rumors say that it might not work inside an IDE. It works when running in the terminal.

{% include file="examples/groovy/input_from_console.groovy" %}

## Converting string to Integer

When we read a value from the standard input it arrives as a string. It cannot be used in numerical operations
even if the input looks like a number.
In order to use it as a number we have to tell Groovy to treat it as a number. For example as an Integer.
That's what "as Integer" is for in the next example:

## Rectangular

See the [rectangular exercise](/exercise-rectangular).

{% include file="examples/groovy/rectangular.groovy" %}


