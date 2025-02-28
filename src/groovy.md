---
title: "Groovy"
timestamp: 2018-05-24T09:30:01
tags:
  - Groovy
published: true
books:
  - groovy
author: szabgab
archive: true
---


[Groovy](http://groovy-lang.org/) is a general purpose language that runs on the top of the JVM, the Java Virtual Machine
that seems to allow developers to be a lot more productive than using Java.

My primary reason for looking into it is that it is the language used for the [Jenkins](https://jenkins.io/) Pipelines.

Oh and you can also grab my [Groovy book](https://leanpub.com/groovy-book/).


## Articles

* [Hello World in Groovy](/groovy-hello-world) print, println
* [Reading from STDIN in Groovy](/groovy-read-from-stdin) Console, System, readLine, System.in.newReader().readLine() as Integer

* [Groovy types](/groovy-types) boolean, int, byte, Integer
* [Groovy: Undeclared variable - runtime exception - groovy.lang.MissingPropertyException](/groovy-undeclared-variable) def, MissingPropertyException
* [Groovy: Number guessing game](/groovy-number-guessing-game) Random, nextInt, System.in.newReader().readLine
* [Determine type of an object in Groovy](/groovy-determine-type-of-object) instanceof, getClass
* [Lists in Groovy](/groovy-lists) List, ArrayList, LinkedList, size, for, each, eachWithIndex, count
* [Sum of numbers](/groovy-sum-of-numbers) File, readLines, LineNumberReader, newReader, readLine
* [Solution to the "Color selector" exercise](/groovy-color-selector)
* [Read CSV file in Groovy](/groovy-read-csv-file) @Grab, import, File, getText, parseCSV, separators, readFirstLine
* [Solution to the count digits exercies](/groovy-count-digits)
* [reading and writing files - appending content in Groovy](/groovy-files) File, getText, readLines, newReader, readLine, write, append
* [listing the content of a directory, traversing a directory tree](/groovy-directory-listing) eachFile, eachFileRecurse 
* [Groovy - Regular Expressions - regexes](/groovy-regex)
* [Groovy map (dictionary, hash, associative array)](/groovy-map)  map, containsKey, key, value, keySet, sort (keys, values)
* [Groovy Read/Write JSON files](/groovy-json)
* [Groovy: Date, Time, Timezone](/groovy-date-time)
* [Groovy: import and use functions from another file](/groovy-import-functions-from-another-file)
* [Groovy: Random numbers, random selection from list of values](/groovy-random-numbers)
* [Groovy: Closures](/groovy-closures)
* [Groovy: remove spaces from a string](/groovy-remove-spaces-from-string) (replaceAll)
* [Groovy: temporary file with auto delete](/groovy-temporary-file) (File, createTempFile, deleteOnExit, absolutePath)
* [Groovy: relative path](/groovy-relative-path) (SourceURI, Path, Paths, get, getParent, resolveSibling)
* [Return multiple values from a function](/groovy-return-multiple-values-from-function)
* [String length](/groovy-string-length)
* [Substring](/groovy-substring)
* [for loop - break - continue](/groovy-for-loop-break-continue)
* [Groovy code reuse](/groovy-code-reuse)
* [Groovy functions](/groovy-functions)
* [Groovy: evaluate code in another file](/groovy-evaluate-code-in-other-files)
* [Groovy classes](/groovy-classes)
* [Groovy function overloading](/groovy-function-overloading)
* [Groovy variable scope](/groovy-variable-scope) (def)
* [Recursive functions](/groovy-recursive-functions)
* [Groovy command line arguments (args)](/groovy-command-line-arguments)
* Command line parameters
* [Groovy exit - System.exit - early exit from Groovy script](/groovy-exit)
* [Groovy file and directory attributes](/groovy-file-and-directory-attributes) File, canExecute, isFile, isDirectory
* [Groovy join elements of array](/groovy-join) (join)
* [Groovy pop push](/groovy-pop-push)
* [Groovy: Formatted printing with printf and sprintf](/groovy-printf)
* [Groovy system properties](/groovy-system-properties)
* [Groovy path to current executable script](/groovy-path-to-current-script)
* [Exception handling](/groovy-exception-handling) (try, catch, Exception)
* [Throw (raise) exception](/groovy-throw-exception)<li>
* [Casting](/groovy-casting) Integer, String, ...
* [Printing Unicode characters from Groovy](/groovy-unicode)
* [Import standard libraries](/groovy-import-standard-libraries)
* [Iterate over map keys](/groovy-iterate-over-map-keys)
* [Get the list of keys of a map as an ArrayList](/groovy-map-keys-as-arraylist)

* STDOUT/STDERR
* Read/Write YAML files
* Read/Write INI files
* Read/Write XML files
* HTTP request

## Other resources

* [Learn X in Y minutes Where X=Groovy](https://learnxinyminutes.com/docs/groovy/)
* [Documentation of Groovy](http://docs.groovy-lang.org/)

{% include file="examples/groovy/enum_planets.groovy" %}


## Elapsed time

{% include file="examples/groovy/elapsed_time.groovy" %}

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
