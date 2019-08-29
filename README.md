# Scala Challenges

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/5120a93f50d44aebb6c291072ad363aa)](https://app.codacy.com/app/geektimus/scala-challenges?utm_source=github.com&utm_medium=referral&utm_content=geektimus/scala-challenges&utm_campaign=Badge_Grade_Dashboard)
[![Build Status](https://travis-ci.org/geektimus/scala-challenges.svg?branch=master)](https://travis-ci.org/geektimus/scala-challenges)
[![Maintainability](https://api.codeclimate.com/v1/badges/640e9a8ef7fc7f757aaf/maintainability)](https://codeclimate.com/github/geektimus/scala-challenges/maintainability)

This repo will contain the solutions using Scala for challenges found on:

* Books
* Hacker Rank
* Codility
* CodeFights

## Challenges

### Hacker Rank

#### Super Reduced String

Write a function to reduce a given string to its shortest length by doing a series of
operations in which we select a pair of adjacent lowercase letters that match,
and then we delete them.

#### Gemstone finder

We have a collections of rocks and we represent it's minerals in a string with letters from [a-z] and we need to write a function to find the gemstones in the collection of rocks. A gemstone is a mineral that occurs at least once in each of the rocks.

Example:

```
for ["abc","abaaa","bcd"] b is a gemstone since it appears in the three rocks
for ["ab","cd","ef"] there's no gemstone
```

### Codility

#### Missing Integer

Find smallest positive integer that is NOT in the given array:

Example:

```text
for [1, 3, 6, 4, 1, 2] the missing integer is [5]
for [4, 1, 5, 6, 2] the missing integer is [3]
```
#### Tape Equilibrium
Given a non-empty zero-indexed array A of N integers, returns the minimal difference 
that can be achieved after we split the array on a pivot P. Such as 
```|(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|```

#### Frog Jumps
We need to find the minimum number of jumps a small frog can make from a starting position X to a ending position Y 
given a jump distance D

### Qualified

#### Number and Credit Card Mask

We need to write a function that will allow us to mask any given string. We have only two rules

- The mask wil only be applied to numbers or numbers separated with dashes
(-)
- The mask will not be applied to string containing characters or strings which length is less than 6
- The mask will preserve the first and the last four numbers

For example:

- 8888-9999-9999-0000 -> 8###-####-####-0000
- 1234567890987654321 -> 1##############4321
- Credit Card -> Credit Card
- 123 -> 123

#### Ordinal number representation

We need to write a function that given a non negative number it returns the ordinal representation of that number.

Most ordinal numbers end in "th" except for:

* one ⇒ first (1st)
* two ⇒ second (2nd)
* three ⇒ third (3rd)

#### Infix Calculator
We need to write a function that given an expression on infix notation will return the result of the operations.

Infix notation is a notation when the numbers are provided first and the operation next.

For example: 

- 3 4 + = 3 + 4 = 7
- 3 2 1 - * = (2 - 1) * 3 = 3
- 9 sqrt = sqrt 9 = 3

### Aperiodic (Scala Specific Challenges)

1. P01 (*) Find the last element of a list.
1. P02 (*) Find the last but one element of a list.
1. P03 (*) Find the Kth element of a list.
1. P04 (*) Find the number of elements of a list.
1. P05 (*) Reverse a list.
1. P06 (*) Find out whether a list is a palindrome.
1. P07 (**) Flatten a nested list structure.
1. P08 (**) Eliminate consecutive duplicates of list elements.
1. P09 (**) Pack consecutive duplicates of list elements into sublists.
1. P10 (*) Run-length encoding of a list.

### Others (Challenges proposed by Friends or Solved on hackatons)

#### Recursively reverse a string

Given a string, reverse the characters and return.

Example:

```text
for "Test" it should return "tseT"
for "Return" it should return "nruteR"
```

#### Classical Fizz Buzz solution

Write a program that prints the numbers from 1 to 100. But for multiples 
of three print “Fizz” instead of the number and for the multiples of five print 
“Buzz”. For numbers which are multiples of both three and five print “FizzBuzz

#### Find number in Array

This is a basic problem where we need to find if a number is present on the
given array.

#### Basic word count problem but without using REGEX expressions.

Write a function which returns the number of words in a given string - without using REGEX expressions

```
given "disco1 hero2" or
      "  disco1  hero2" or
      "disco1  hero2  " or
      "  disco1  hero2  "
then the word count should be 2, the solution should ignore the spaces.
```

#### Find the last index of a slice on a given array

Write a function which prints the index of the last occurrence of the entire sequence within a given array 
WITHOUT using inbuilt **sliding**, **lastIndexOf** and **lastIndexOfSlice** functions.

## Useful commands

### Enable scala style check on compile
If you want to enable the scala check as part of the compile task you can add the following lines to the _build.sbt_ file

```
lazy val compileScalastyle = taskKey[Unit]("compileScalastyle")
compileScalastyle := scalastyle.in(Compile).toTask("").value
(compile in Compile) := ((compile in Compile) dependsOn compileScalastyle).value
```
I don't add the line myself since this plugin get executed before the compile step, this can cause problems because if the 
code does not compile, you’ll get the scalastyle errors messages, not the scalac ones. Great though scalastyle is, it can’t 
match the error messages produced by the compiler

### Run scala style check

```
sbt scalastyle
```

### Run Coverage Reports

**Run Coverage and Generate Report**

```
sbt clean coverage test coverageReport
```

