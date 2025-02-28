# Groovy: Lists


Square brackets `[]` create a list that implements the
[List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html) interface.

By default it is of type [ArrayList](https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html)
though you can create a list of type [LinkedList](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html) as well.


```groovy
{{#include examples/groovy/lists.groovy }}
```

There are several ways to iterate over the elements of a list.

There is the old-school way of using a `for` loop. This is like in most of the other languages
uses a variable to go over the indexes from 0 to the size-1 and then use this index to access the real value
in the list. The name of this internal variable is typically i or j and it does not need to be declared using `def`.


The `each` method will also iterate over the elements of the list. For each iteration it will put the current value
in a variable called `it` and then execute the block that follows the `each` statement. The `it` is similar
to to `$_` of Perl and the `_` of Python.

Optionally we can set the name of this internal variable by providing it right after the opening `{` of the block,
followed by an arrow.

Finally, we can also use the `eachWithIndex` in which case we need to define the name of two variables.
The first one will get the current value, the second one will get the index of the current value.


Read more about [lists in Groovy](http://groovy-lang.org/syntax.html#_lists).


## Is element in list? How many times?

The `count` method will count how many times a values appears in a list. It can be used to check if the values is in the list at all.

```groovy
{{#include examples/groovy/element_in_list.groovy }}
```

timestamp: 2018-06-01T09:00:01
tags:
  - List
  - ArrayList
  - LinkedList
  - size
  - for
  - each
  - eachWithIndex
  - count

