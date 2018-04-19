# Scala Challenges

[![Build Status](https://travis-ci.org/geektimus/scala-challenges.svg?branch=master)](https://travis-ci.org/geektimus/scala-challenges)

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

### Others (Challenges proposed by Friends or Solved on hackatons)

#### Recursively reverse a string

Given a string, reverse the characters and return.

Example:

```text
for "Test" it should return "tseT"
for "Return" it should return "nruteR"
```
