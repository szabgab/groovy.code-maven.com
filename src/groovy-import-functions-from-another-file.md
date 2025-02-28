# Groovy: import and use functions from another file


[Code reuse](./groovy-code-reuse.md) is an important part of programming. The smallest possible way is to create functions and call them
several times in the same code. The next step is to have a set of functions in a file and use those functions in
several other files.

In these examples we see how to do that with simple functions and methods of classes.


## Importing function

In this example we have a very simple "library" file with a simple function:

```groovy
{{#include examples/groovy/function_tools.gvy }}
```

Next to it there is another file in which we load the former file into memory and then call it.

```groovy
{{#include examples/groovy/function_script.gvy }}
```

We can then run

<pre>
groovy function_script.gvy
</pre>

In the code we gave the path to the library so in this version it needs to be next to the code loading it.

## Importing class methods

This is the class:

```groovy
{{#include examples/groovy/class_tools.gvy }}
```

This is the script:

```groovy
{{#include examples/groovy/class_script.gvy }}
```

## Importing class methods


```groovy
{{#include examples/groovy/a/main.groovy }}
```

```groovy
{{#include examples/groovy/a/tools.groovy }}
```


## Import class from a subdirectory


```groovy
{{#include examples/groovy/b/main.groovy }}
```

```groovy
{{#include examples/groovy/b/tools/other.groovy }}
```


## Import static methods from a class

This is probably the version most similar to importing individual functions.


```groovy
{{#include examples/groovy/d/main.groovy }}
```

```groovy
{{#include examples/groovy/d/tools.groovy }}
```

## Import static methods from a class from a subdirectory

```groovy
{{#include examples/groovy/e/main.groovy }}
```

```groovy
{{#include examples/groovy/e/some/other/Tools.groovy }}
```

timestamp: 2018-09-13T20:30:01
tags:
  - GroovyShell

