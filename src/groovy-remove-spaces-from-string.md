---
title: "Groovy: remove spaces from a string"
timestamp: 2018-10-30T09:30:01
tags:
  - replaceAll
  - ~//
  - trim
published: true
books:
  - groovy
author: szabgab
archive: true
description: "Using a regular expression in Groovy to remove all the spaces from a string."
---


Remove all the spaces from a string. It is like trim, trim-left, and trim-right together.


{% include file="examples/groovy/remove_spaces.gvy" %}

```
$ groovy remove_spaces.gvy

' hello world '
'helloworld'
```


## Without the need to doubl-escape using ~//

{% include file="examples/groovy/remove_spaces_no_escape.gvy" %}

```
groovy remove_spaces_no_escape.gvy
```

