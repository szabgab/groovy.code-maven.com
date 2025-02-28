---
title: "Groovy: temporary file with autodelete"
timestamp: 2018-10-30T10:30:01
tags:
  - File
  - createTempFile
  - write
  - absolutePath
  - delete
published: true
books:
  - groovy
author: szabgab
archive: true
---


{% include file="examples/groovy/temp_file.gvy" %}

{% include file="examples/groovy/temp_file_oop.gvy" %}

## Comments

Thank you very much, your answer resolved my issue:

def map1 = [:]
map1.put('jfr_1', "Hello World!")
def i = 1
def x = map1."jfr_$i"
println "x = " + "${x}" ----> x = Hello World!


<hr>

 def jfr_1 = "Hello World!"
def i = 1
    def x = "jfr_$i"    
    println "${x}" 

Above code prints: jfr_1 instead of Hello World! What I'm doing wrong?

---

Nothing. That's the expected behaviour.

<hr>

Thank you for the reply, how can I print "Hello World!" instead
Using PERL print ($$x) will print "Hello World!".

---

Even in Perl you should not do that and you should "use strict" to make sure you don't do it by mistake. In Perl you'd use a hash in Groovy a map for that kind of data structure.

<hr>

