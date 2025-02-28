# Groovy: Date, Time, Timezone


[java.util.TimeZone](https://docs.oracle.com/javase/7/docs/api/java/util/TimeZone.html)
[Date](http://docs.groovy-lang.org/docs/latest/html/groovy-jdk/java/sql/Date.html)

```groovy
{{#include examples/groovy/date.gvy }}
```

```
{{#include examples/groovy/date.out }}
```

## Adjust Timezone in Groovy

While normally Jeruslame is at UTC+2, during the daylight saving time, it is
actually UTC+3. This is reflected in the results.

```groovy
{{#include examples/groovy/time_zone.gvy }}
```

timestamp: 2018-09-07T16:00:01
tags:
  - Date

