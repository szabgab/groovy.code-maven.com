---
title: "Groovy map (dictionary, hash, associative array)"
timestamp: 2018-07-31T22:30:01
tags:
  - map
  - containsKey
  - key
  - value
  - keySet
  - values
published: true
books:
  - groovy
author: szabgab
archive: true
---



## Groovy map access elements

```
g = [:]       // create map
println(g)

g['name'] = []   // create array
println(g)

g['name'].add("foo")
g['name'].add("bar")
println(g)
```


{% include file="examples/groovy/elements_of_map.groovy" %}

## Get all the keys ina Groovy map

{% include file="examples/groovy/keys_of_map.groovy" %}

```
red
#FF0000
green
#00FF00
blue
#0000FF
```


## Sorted keys of a Groovy map

{% include file="examples/groovy/sorted_keys_of_map.groovy" %}

## Values of a Groovy map

{% include file="examples/groovy/sorted_keys_of_map.groovy" %}


## Return map from a function

{% include file="examples/groovy/return_map.gvy" %}


See also [maps](http://groovy-lang.org/syntax.html#_maps)
