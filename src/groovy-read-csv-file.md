# Groovy: read CSV file

Groovy does not seem to provide a built-in CSV reader, but there are a number of third-party open source implementations.

In this case I am using [GroovyCSV](http://xlson.com/groovycsv/) that has its source at [GitHub](https://github.com/xlson/groovycsv).


## Read CSV file and add number in the 3rd column

This is the solution to the [exercise](/exercise-add-numbers-from-csv-file) in which we need to read the file

```csv
{{#include examples/data/process_csv_file.csv }}
```

and add the numbers in the 3rd column.

In another case we need to read this file:

```csv
{{#include examples/data/distance.csv }}
```

and again add the 3rd column

The solution for the first file looks like this:

```groovy
{{#include examples/groovy/add_numbers_from_csv_semicolon.groovy }}
```

The first line tells Groovy to use the [Grape dependency management](http://docs.groovy-lang.org/latest/html/documentation/grape.html) tool and install the package. This will happen the first time we run our code. In subsequent runs it will already use the locally intsalled version of the module.

```groovy
@Grab('com.xlson.groovycsv:groovycsv:1.3')
```

The second line tells Groovy to import the `parseCsv` class from the already installed library.

```groovy
import static com.xlson.groovycsv.CsvParser.parseCsv
```

The we open the file using the [File](http://docs.groovy-lang.org/latest/html/groovy-jdk/java/io/File.html) class and read in the whole content using the `getText` method.

```groovy
fh = new File('examples/data/distance.csv')
def csv_content = fh.getText('utf-8')
```

The `parseCSV` function expects the content of the CSV file as its first parameter and then it can also accept configuration options. In our case we set the `separator` to be `;` as our file uses that instead of plain comma `,`
We also set the `readFirstLine` to be `true` as we wanted the first row to be treated as data and not as header.

The defaults are `,` and `false` respectively. There are some other parameter one can set.

The call to `parseCSV` return an instance of `com.xlson.groovycsv.CsvIterator`. We can use that to iterate over the rows.Each iteration `line` holding an array of the fields of the current line. We can use regular array indexing to access index 2 which is the 3rd column as arrays are 0-based.

```groovy
{{#include examples/groovy/add_numbers_from_csv.groovy }}
```

The second file uses `,` as separators which is the default so we don't need to set that explicitly.
Other than that the two solutions are identical.


timestamp: 2018-06-02T11:30:01
tags:
  - @Grab
  - import
  - File
  - getText
  - parseCSV
  - separators
  - readFirstLine

