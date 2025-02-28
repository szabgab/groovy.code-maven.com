# Groovy recursive functions


Recursive functions are functions that call themselves.

In many cases using recursive functions greatly simplifies the code we need to write.

For example when traversing some tree-like data structure.

One critical point in every recursive function is that there most be some <b>stop-condition</b>,
that will not create further recursive calls. Otherwise we would end up in an infinite deep black hole.


## Factorial in recursive

The mathematical expression <b>n!</b> ( [factorial](https://en.wikipedia.org/wiki/Factorial))
can be defined in the straigh forward way as: <b>1 * 2 * ... * n</b>
or in the recursive way:

```
1!     = 1
n!     = n * (n-1)!
```

In a similar fashion we can implement the calculation of <b>n!</b> in both ways. The second way is called recursive
definition and it is implemented with recursive function calls:

```groovy
{{#include examples/groovy/factorial.groovy }}

What we must not forget is that we need to check for the stop-condition (the n == 1) before the recursive call.

## Fibonacci in recursive call

[Fibonacci series](https://en.wikipedia.org/wiki/Fibonacci_number) is usually defined in a recursive formula:

```
f(1)        1
f(2)        1
f(n)        f(n-1) + f(n-2)
```

It can be implemented in this way:

```groovy
{{#include examples/groovy/fibonacci.groovy }}

## Recursive

For this example we have created an imaginary tree-structure. A dependency tree. Each file lists its dependencies.

We start with the "main" file:

```
{{#include examples/data/dependencies/main.txt }}
```

```
{{#include examples/data/dependencies/a.txt }}
```

```
{{#include examples/data/dependencies/b.txt }}
```

```
{{#include examples/data/dependencies/e.txt }}
```

The script to traverse the tree in a recursive fashion is this:

```groovy
{{#include examples/groovy/list_dependencies_recursive.groovy }}
```

timestamp: 2019-04-16T16:30:01
tags:
  - def

