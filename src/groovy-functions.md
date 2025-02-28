# Groovy functions


Functions are probably the most basic tools for [code reuse in Groovy](./groovy-code-reuse.md).


## Hello World in a function

The `def` keyword allows use to define a function that we can use in the code.

```groovy
{{#include examples/groovy/hello_world_function.groovy }}
```

After the `def` keyword we provide the name of the function and then in parentheses the list
of expected parameters. In our first example there are no parameters.

Then within curly braces we put the body of the function.

We can put the definition of the function anywhere in the file. A good practice would be to put all the functions
in the end of the file and put the main body of the code at the top. That will make it easier to read.

Better yet, you might want to put all your code in functions and leave only a single call to a single function in the
main body of your code. That will probably help keeping the code clean.


## Passing parameters and returning a result

In this example we created a function that was designed to add two numbers and return the result.
We can call it with exactly two numbers and it will return the sum.

```groovy
{{#include examples/groovy/add_function.groovy }}
```

If we call it with only one parameter we'll get the following exception:

```
Caught: groovy.lang.MissingMethodException: No signature of method: add_function.add() is applicable for argument types: (java.lang.Integer) values: [2]
Possible solutions: add(java.lang.Object, java.lang.Object), any(), any(groovy.lang.Closure), wait(), run(), run()
groovy.lang.MissingMethodException: No signature of method: add_function.add() is applicable for argument types: (java.lang.Integer) values: [2]
Possible solutions: add(java.lang.Object, java.lang.Object), any(), any(groovy.lang.Closure), wait(), run(), run()
	at add_function.run(add_function.groovy:10)
```


If we call it with more than 2 parameters we get this exception:

```
Caught: groovy.lang.MissingMethodException: No signature of method: add_function.add() is applicable for argument types: (java.lang.Integer, java.lang.Integer, java.lang.Integer) values: [2, 3, 4]
Possible solutions: any(), add(java.lang.Object, java.lang.Object), wait(), run(), run(), find()
groovy.lang.MissingMethodException: No signature of method: add_function.add() is applicable for argument types: (java.lang.Integer, java.lang.Integer, java.lang.Integer) values: [2, 3, 4]
Possible solutions: any(), add(java.lang.Object, java.lang.Object), wait(), run(), run(), find()
	at add_function.run(add_function.groovy:12)
```


As you can see in the example we can also pass strings to it and then <b>+</b> will concatenate them and we can also
pass a string and a number and it will concatenate those too.

If this is the behavior you hoped for then it is great.


## Defining the type of the parameters of a Groovy function

In Groovy you can use the [Groovy types](/groovy-types) to specify what kind of values a function is expected
to receive. For example here we declare that our `add` function is expecting two <b>Integer</b> values.

```groovy
{{#include examples/groovy/add_integers.groovy }}
```

If we call it with two integers we get the correct answer. However if we try to pass a string, Groovy will give us an
exception like this:

```
Caught: groovy.lang.MissingMethodException: No signature of method: add_integers.add() is applicable for argument types: (java.lang.String, java.lang.Integer) values: [abc, 3]
Possible solutions: add(java.lang.Integer, java.lang.Integer), any(), wait(), run(), run(), find()
groovy.lang.MissingMethodException: No signature of method: add_integers.add() is applicable for argument types: (java.lang.String, java.lang.Integer) values: [abc, 3]
Possible solutions: add(java.lang.Integer, java.lang.Integer), any(), wait(), run(), run(), find()
	at add_integers.run(add_integers.groovy:8)
```

timestamp: 2019-04-08T20:10:01
tags:
  - Groovy
  - def
  - Integer

