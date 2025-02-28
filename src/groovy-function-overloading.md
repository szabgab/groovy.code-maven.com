---
title: "Groovy function overloading"
timestamp: 2019-04-09T14:30:01
tags:
  - def
published: true
books:
  - groovy
author: szabgab
archive: true
---


The primary tool for [code reuse in Groovy](/groovy-code-reuse) is the possibility to
[defined and call functions](/groovy-functions).

We have already seen that we need to tell Groovy how many parameter a function expects and we
can even ask Groovy to verify the type of the parameters.

We have not discussed yet how can you be flexible with this?

Groovy allows you to define multiple versions of the same function with different signatures.
That is, different set of expected parameters.


## Optional parameter

One of the uses of his facility is to have some of the parameters become optional.

In the following example we have a simple function called `prompt` that would receive a text and a number.
It would prompt the user with the text and check the input against some value. (In our example it is a simple
variable. In a more realistic situation we would have the password hashed and probably stored in a database.)

If the user makes a mistake s/he is prompted again and again.

The number of times the user can try is set by the second parameter.

In our example we also have a second definition of the `prompt` function that only expects a string.
It then calls the same name again (`prompt` passing to it the receives text and the number 3.

{% include file="examples/groovy/prompt.groovy" %}

If we call `prompt` with a text and a number, the first version will be executed.

If we call `prompt` with only a string, the second version will be executed. It will call `prompt`
with the same string and the number 3. This time Groovy will execute the first version of the function.


## Same function with different types

In this example you can see how we declared the same function name 3 times. Each time expecting different types
of arguments. Then we call the function and we can see Groovy calls the right implementation in each case.
The order of the definition is not important, you could put the general case earlier as well, but it seems to
be clearer to me to first have the special cases declared and only later the more generic ones.

{% include file="examples/groovy/add_functions.groovy" %}

