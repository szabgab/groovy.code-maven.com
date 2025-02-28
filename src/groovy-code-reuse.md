---
title: "Groovy code reuse"
timestamp: 2019-04-08T20:30:01
tags:
  - Groovy
published: true
books:
  - groovy
author: szabgab
archive: true
---


In programming we care a lot about code reuse. Partly bacause we are lazy and we don't want to write the same code
twice. Partially because we know that we will find bugs in our code and we'll need to fix them.
If we have written the same code twice we now will have to fix the same problem in two places.
Knowing how bad we are in tracking our code we will surelly forget some of the copies.

So here are a number of ways how you can reuse code in [Groovy](/groovy).



* [Groovy Functions](/groovy-functions). Insides the same file we can create functions and call them from various places in the file. See also [Return multiple values from a function](/groovy-return-multiple-values-from-function)
* [Groovy classes](/groovy-classes) provide a better abstraction of certain functionality in our code. Given a class we can create several instances that will all have the same behavior. In this example we are still restricted to a single file.
* [Import and reused functions.](/groovy-import-functions-from-another-file) We can import functions from other files allowing us to reuse the same functions in several places. Also allowing us to distribute our functions and let other use them as well. Either within the organization or maybe even outside of it.
* Import variables (or constants). Same as importing functions.
* Import class. Like importing functions, but provide whole classes.

