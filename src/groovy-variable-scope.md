---
title: "Groovy variable scope"
timestamp: 2019-04-12T09:30:01
tags:
  - def
published: true
books:
  - groovy
author: szabgab
archive: true
---


The scope of variables is where we can access the variables.


## By default variables are global

By assigning value to a new variable name we create that variable. Groovy does not require
any special syntax or keyword to declare a variable.

If we access the same variable name within a function (either reading it with  println in this case or
writing it when we assign a new value to it), we access the same global variable.

{% include file="examples/groovy/global_variable.groovy" %}


## Create global variable inside a function

We don't need the first global definition. If we assign a value to a variable inside a function, it will create
a global variable that will remain in scope even after the function has finished running.

{% include file="examples/groovy/create_global_in_function.groovy" %}


## Declare local variable with def

We can use the `def` keyword to declare a variable local.
In the first example we can see that there is a global variable (which was not declared using <b>def</b>)
which is then accessible inside the function (println) just as we saw in the first example.
Once we use the <b>def</b> keyword to declare the same variable name inside the function it creates a
new variable, hiding the global one.

Once we exit the function the local version is destroyed and outside the function we access the global variable again.

{% include file="examples/groovy/global_and_local_variables.groovy" %}


If you use <b>def</b> to declare the variable outside of all the functions, you won't be able to access it inside
the function. (The first print statement in the next example would throw the exception shown in the comment.)

Assiging to a variable inside the function, even if we don't use `def` to declare it, will create a new,
local variable:

{% include file="examples/groovy/local_and_automatic.groovy" %}


The best option is when you declare your variables both inside and outside of functions using the `def`
keyword. That makes it clear both to Groovy and to the reader that your intention was to create locally
scoped variables.

{% include file="examples/groovy/local_and_local.groovy" %}


## Shall we use global or local variables?

Global variables might make it easy to write the first version of the program, but then, as the program grows
it becomes harder and harder to maintain it. Not a recommended practice.
You are much better off working a bit harder and always declaring your variables in every scope.


## Scope in a block?

Some languages (most notably Perl) would create a scope for every block - for every pair of curly braces.
This is not the case in Groovy.

{% include file="examples/groovy/scope_in_a_block.groovy" %}

In this example you can see that you cannot re-declare a variable inside a block as that would cause a compile-time
error:

{% include file="examples/groovy/def_in_a_block.groovy" %}

```
org.codehaus.groovy.control.MultipleCompilationErrorsException: startup failed:
scope_in_a_block.groovy: 6: The current scope already contains a variable of the name x
 @ line 6, column 9.
       def x = 12
           ^

1 error
```


On the other hand you can declare variables inside a block (but apparently only if they did not exist outsdide the
block) and they will cease to exist at the end of the block.

This example prints the 12 and then when it tries to access the variable outside of the block it will raise
an exception.

{% include file="examples/groovy/def_only_in_a_block.groovy" %}

```
12
Caught: groovy.lang.MissingPropertyException: No such property: x for class: def_only_in_a_block
groovy.lang.MissingPropertyException: No such property: x for class: def_only_in_a_block
	at def_only_in_a_block.run(def_only_in_a_block.groovy:9)
```



