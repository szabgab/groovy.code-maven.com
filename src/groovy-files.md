# Groovy: reading and writing files - appending content


In order to handle files Groovy has a class called [File](http://docs.groovy-lang.org/latest/html/groovy-jdk/java/io/File.html). Let's see some of the basic operations you can do with files.


```groovy
{{#include examples/groovy/read_file.groovy }}
```

## Write a new file

This will remove the content of the old file and start a new file.

```groovy
{{#include examples/groovy/write_file.groovy }}
```

This will append to the end of the file.

```groovy
{{#include examples/groovy/append_file.groovy }}
```


## Write and Append

If we mix the calls to `write` and to `append` we'll get some strange results.
For example the following code will only store "third" in the file.

```groovy
{{#include examples/groovy/write_append_file.groovy }}
```

Don't do this!

timestamp: 2018-06-03T14:30:01
tags:
  - File
  - getText
  - readLines
  - newReader
  - readLine
  - write
  - append

