# Groovy: sum of numbers


Given a file like this where each row is a number, our task is to sum up the numbers.

```groovy
{{#include examples/data/numbers.txt }}
```

This is a simple exercise in reading the content of a file.


the [File](http://docs.groovy-lang.org/latest/html/groovy-jdk/java/io/File.html) class can open a file for reading and return something that resembles a filehandle in other languages. It is instance of the File class.

It has many methods, the one we are using is called `readLines`. It will read the whole content of the file and will return a list of the lines. The number of elements in this list is the number of of lines in the file.

We can then iterate over the [list](/groovy-lists) using [each](/groovy-lists), convert each value to an Integer (the lines are strings when we read them in) and add them to the `sum` variable.

```groovy
{{#include examples/groovy/sum_of_numbers.groovy }}
```

This solution works for small-ish files, but if the files is so big that it cannot fit in memory then either our system starts swapping making the operation very slow or it will just crash.

## Read line by line

A better solution that will work both for small and big files is to read the content of the file line-by-line. In this case we only need to hold one line in the memory at any given point of the time. Well, actually the operating system might do some read-ahead and buffering, but that's there for optimizations and you won't run out of memory because of that.

In this solution we the `newReader` method of the object created by the `File()` class that will
create and return an object of type [LineNumberReader](https://docs.oracle.com/javase/7/docs/api/java/io/LineNumberReader.html). The object, assigned to the `reader` variable, has a method called `readLine` that will return the next line in the file or `null` of there are no more lines.

```groovy
{{#include examples/groovy/sum_of_numbers_line_by_line.groovy }}
```


It is not enough to write this:

```groovy
while (line = reader.readLine()) {
```

as this will stop on the first empty row, if there is one in the file.

timestamp: 2018-06-01T11:00:01
tags:
  - File
  - readLines
  - LineNumberReader
  - newReader
  - readLine

