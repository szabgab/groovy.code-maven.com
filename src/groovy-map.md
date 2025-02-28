# Groovy map (dictionary, hash, associative array)


## Groovy map access elements

```groovy
g = [:]       // create map
println(g)

g['name'] = []   // create array
println(g)

g['name'].add("foo")
g['name'].add("bar")
println(g)
```


```groovy
{{#include examples/groovy/elements_of_map.groovy }}
```

## Get all the keys ina Groovy map

```groovy
{{#include examples/groovy/keys_of_map.groovy }}
```

```
red
#FF0000
green
#00FF00
blue
#0000FF
```


## Sorted keys of a Groovy map

```groovy
{{#include examples/groovy/sorted_keys_of_map.groovy }}
```

## Values of a Groovy map

```groovy
{{#include examples/groovy/sorted_keys_of_map.groovy }}
```

## Return map from a function

```groovy
{{#include examples/groovy/return_map.gvy }}
```

See also [maps](http://groovy-lang.org/syntax.html#_maps)


timestamp: 2018-07-31T22:30:01
tags:
  - map
  - containsKey
  - key
  - value
  - keySet
  - values

