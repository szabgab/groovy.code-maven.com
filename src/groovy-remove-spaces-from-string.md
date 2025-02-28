# Groovy: remove spaces from a string

Using a regular expression in Groovy to remove all the spaces from a string.


Remove all the spaces from a string. It is like trim, trim-left, and trim-right together.


```groovy
{{#include examples/groovy/remove_spaces.gvy }}
```

```
$ groovy remove_spaces.gvy

' hello world '
'helloworld'
```


## Without the need to doubl-escape using ~//

```groovy
{{#include examples/groovy/remove_spaces_no_escape.gvy }}
```

```
groovy remove_spaces_no_escape.gvy
```

timestamp: 2018-10-30T09:30:01
tags:
  - replaceAll
  - ~//
  - trim

