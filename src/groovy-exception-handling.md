# Groovy Exception handling (try, catch, Exception)


```groovy
{{#include examples/groovy/divide.groovy }}
```

It works well if the division work well, but:

```
$ groovy divide.groovy 3 0

Caught: java.lang.ArithmeticException: Division by zero
java.lang.ArithmeticException: Division by zero
	at divide.div(divide.groovy:2)
	at divide.run(divide.groovy:13)
```


We can use `try` and `catch` to catch the exception:

```groovy
{{#include examples/groovy/catch_exception.groovy }}
```

timestamp: 2019-04-21T15:30:01
tags:
  - try
  - catch
  - Exception

