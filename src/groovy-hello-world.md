# Hello World in Groovy


## Install Groovy

There are plenty of ways you can [download and install Groovy](http://groovy-lang.org/documentation.html#gettingstarted).
As I am trying it on Mac OSX and as I already use [Homebrew](https://brew.sh/) I just ran

```
brew install groovy
```

and it installed it for me.

## The version of Groovy

Then I ran the following command to see which version o f Groovy do I have and on top of which version of the JVM it runs:

```
$ groovy -v

Groovy Version: 2.4.15 JVM: 1.8.0_60 Vendor: Oracle Corporation OS: Mac OS X
```

## Hello World in Goovy

Unlike in Java there is not need for a lot of cermony. You can use the `print` function to
print a string to the screen. You can include `\n` to embed a newline character.
There is no need for semi-colon `;` at the end of the statement.

```groovy
{{#include examples/groovy/hello_world.groovy }}
```

```
$ groovy hello_world.groovy
```

Alternatively you can use the `println` function that will automatically
append a newline to the end of the output.

```groovy
{{#include examples/groovy/hello_world_with_newline.groovy }}
```


timestamp: 2018-05-01T07:30:01

  - print
  - println
