# Groovy: JSON - reading and writing


[JSON](/json) is one of the most popular language-independent formats for data serialization.
It is also heavily used for configuration files.

Groovy comes with a module called [json](http://docs.groovy-lang.org/latest/html/gapi/groovy/json/)
to handle various use-cases with JSON.


## Parse JSON string

We can use the [JsonSlurper](http://docs.groovy-lang.org/latest/html/gapi/groovy/json/JsonSlurper.html) class
to parse JSON strings.


If we have JSON string in a Groovy variable we can parse it to become a Groovy map:

```groovy
{{#include examples/groovy/parsing_json.groovy }}
```

## Creating JSON string

[JsonOutput](http://docs.groovy-lang.org/latest/html/gapi/groovy/json/JsonOutput.html) has several methods.
`toJson` returns a JSON string in one line. `prettyPrint` returns a nicely formatted JSON string.
The latter takes up more space, but it is also human-readable.


```groovy
{{#include examples/groovy/create_json.groovy }}
```

In the output you can see both the result of `toString` and the result of `prettyPrint`.

```
{{#include examples/groovy/create_json.txt }}
```


## Read JSON from file

```groovy
{{#include examples/groovy/read_json.groovy }}
```

The `parse` method accepts a File object, reads in the content of the file and then parses it.


## Write JSON file

In order to write a JSON file, you need to create the JSON string (either as a plain string or as a beautified string)
and then use the File class to save it.

```groovy
{{#include examples/groovy/write_json.groovy }}
```

## More JSON

[Groovy JSON module](http://groovy-lang.org/json.html)

timestamp: 2018-08-02T08:30:01
tags:
  - JSON
  - JsonSlurper
  - parseText

