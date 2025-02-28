# Groovy exit - System.exit - early exit from Groovy script


```groovy
{{#include examples/groovy/early_exit.groovy }}
```


```
groovy early_exit.groovy
echo $?
42
```


```
groovy early_exit.groovy  param
echo $?
0
```

See also [System](https://docs.oracle.com/javase/9/docs/api/java/lang/System.html)

timestamp: 2019-04-16T15:30:01
tags:
  - exit
  - System.exit

