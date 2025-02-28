# Groovy


[Groovy](http://groovy-lang.org/) is a general purpose language that runs on the top of the JVM, the Java Virtual Machine
that seems to allow developers to be a lot more productive than using Java.

My primary reason for looking into it is that it is the language used for the [Jenkins](https://jenkins.io/) Pipelines.

Oh and you can also grab my [Groovy book](https://leanpub.com/groovy-book/).


## Articles

* [Hello World in Groovy](./groovy-hello-world.md) print, println
* [Reading from STDIN in Groovy](./groovy-read-from-stdin.md) Console, System, readLine, System.in.newReader().readLine() as Integer

* [Groovy types](./groovy-types.md) boolean, int, byte, Integer
* [Groovy: Undeclared variable - runtime exception - groovy.lang.MissingPropertyException](./groovy-undeclared-variable.md) def, MissingPropertyException
* [Groovy: Number guessing game](./groovy-number-guessing-game.md) Random, nextInt, System.in.newReader().readLine
* [Determine type of an object in Groovy](./groovy-determine-type-of-object.md) instanceof, getClass
* [Lists in Groovy](./groovy-lists.md) List, ArrayList, LinkedList, size, for, each, eachWithIndex, count
* [Sum of numbers](./groovy-sum-of-numbers.md) File, readLines, LineNumberReader, newReader, readLine
* [Solution to the "Color selector" exercise](./groovy-color-selector.md)
* [Read CSV file in Groovy](./groovy-read-csv-file.md) @Grab, import, File, getText, parseCSV, separators, readFirstLine
* [Solution to the count digits exercies](./groovy-count-digits.md)
* [reading and writing files - appending content in Groovy](./groovy-files.md) File, getText, readLines, newReader, readLine, write, append
* [listing the content of a directory, traversing a directory tree](./groovy-directory-listing.md) eachFile, eachFileRecurse 
* [Groovy - Regular Expressions - regexes](./groovy-regex.md)
* [Groovy map (dictionary, hash, associative array.md)](./groovy-map)  map, containsKey, key, value, keySet, sort (keys, values)
* [Groovy Read/Write JSON files](./groovy-json.md)
* [Groovy: Date, Time, Timezone](./groovy-date-time.md)
* [Groovy: import and use functions from another file](./groovy-import-functions-from-another-file.md)
* [Groovy: Random numbers, random selection from list of values](./groovy-random-numbers.md)
* [Groovy: Closures](./groovy-closures.md)
* [Groovy: remove spaces from a string](./groovy-remove-spaces-from-string.md) (replaceAll)
* [Groovy: temporary file with auto delete](./groovy-temporary-file.md) (File, createTempFile, deleteOnExit, absolutePath)
* [Groovy: relative path](./groovy-relative-path.md) (SourceURI, Path, Paths, get, getParent, resolveSibling)
* [Return multiple values from a function](./groovy-return-multiple-values-from-function.md)
* [String length](./groovy-string-length.md)
* [Substring](./groovy-substring.md)
* [for loop - break - continue](./groovy-for-loop-break-continue.md)
* [Groovy code reuse](./groovy-code-reuse.md)
* [Groovy functions](./groovy-functions.md)
* [Groovy: evaluate code in another file](./groovy-evaluate-code-in-other-files.md)
* [Groovy classes](./groovy-classes.md)
* [Groovy function overloading](./groovy-function-overloading.md)
* [Groovy variable scope](./groovy-variable-scope.md) (def)
* [Recursive functions](./groovy-recursive-functions.md)
* [Groovy command line arguments (args.md)](./groovy-command-line-arguments)
* Command line parameters
* [Groovy exit - System.exit - early exit from Groovy script](./groovy-exit.md)
* [Groovy file and directory attributes](./groovy-file-and-directory-attributes.md) File, canExecute, isFile, isDirectory
* [Groovy join elements of array](./groovy-join.md) (join)
* [Groovy pop push](./groovy-pop-push.md)
* [Groovy: Formatted printing with printf and sprintf](./groovy-printf.md)
* [Groovy system properties](./groovy-system-properties.md)
* [Groovy path to current executable script](./groovy-path-to-current-script.md)
* [Exception handling](./groovy-exception-handling.md) (try, catch, Exception)
* [Throw (raise.md) exception](./groovy-throw-exception)<li>
* [Casting](./groovy-casting.md) Integer, String, ...
* [Printing Unicode characters from Groovy](./groovy-unicode.md)
* [Import standard libraries](./groovy-import-standard-libraries.md)
* [Iterate over map keys](./groovy-iterate-over-map-keys.md)
* [Get the list of keys of a map as an ArrayList](./groovy-map-keys-as-arraylist.md)

* STDOUT/STDERR
* Read/Write YAML files
* Read/Write INI files
* Read/Write XML files
* HTTP request

## Other resources

* [Learn X in Y minutes Where X=Groovy](https://learnxinyminutes.com/docs/groovy/)
* [Documentation of Groovy](http://docs.groovy-lang.org/)

```groovy
{{#include examples/groovy/enum_planets.groovy }}
```


## Elapsed time

```groovy
{{#include examples/groovy/elapsed_time.groovy }}
```

## Groovy regex

1) Interpolation can be used
2) matcher.matches    vs being null ?
3) \b to mark end of word


```
def exp = 'line'

def matcher = (text =~ /\b$exp\b/)
println("hi")
if (matcher) {
    println("match")
}
```



## groovy time duration - elapsed time

```
import groovy.time.TimeDuration

tdx = new TimeDuration(0, 0 , 0, 2000)
println(tdx)
```

http://docs.groovy-lang.org/2.4.9/html/gapi/groovy/time/TimeDuration.html


duration:

```
println(currentBuild.getClass()) //  class org.jenkinsci.plugins.workflow.support.steps.build.RunWrapper  https://javadoc.jenkins.io/plugin/workflow-support/org/jenkinsci/plugins/workflow/support/steps/build/RunWrapper.html
println("duration: ${currentBuild.durationString}") // duration: 0.35 sec and counting
println(currentBuild.getDuration()) //  397   (miliseconds)
println(currentBuild.getDurationString()) // 0.4 sec and counting

https://stackoverflow.com/questions/51788139/how-to-get-jenkins-build-job-duration
```
