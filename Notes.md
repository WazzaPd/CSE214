# Notes

### What is an algorithm?
- A step by step procedure to solve a problem in a finite set of time

## Algorithm vs Program
- Algorithm ; Program
- Design ;  Implementation
- Domain Knowledge ; Programmer
- Any Language ; Programming Language
- H/w and OS independent ; H/w and OS dependent
- Analyze ; Testing

## Priori Analysis
1. Algorithm
2. Independent of language
3. Hardware Independent
4. Time and Space Function

## Posteriori Testing
1. Program
2. Language dependent
3. Hardware dependent
4. watch time and bytes

## What makes up an Algorithm
1. Zero or more <span style="text-decoration: underline;">__Inputs__</span>
2. Returns at least one <span style="text-decoration: underline;">__Output__</span>
3. Every statement should have <span style="text-decoration: underline;">__Definiteness__</span>
4. The set of statements is <span style="text-decoration: underline;">__Finite__</span>
5. <span style="text-decoration: underline;">__Effectiveness__</span>

##  How to Analyze an Algorithm
```
Algorithm swap(a, b) {
    temp <- a;
    a <- b;
    b <- temp;
}
```
1. Time
2. Space
3. Network Comsuption
4. Power Consumption
5. CPU Registers Consumption
6. ... etc

### Time analysis
```
temp <- a; ----> 1
a <- b;    ----> 1 
b <- temp; ----> 1
Thus f(n) = 3 unit of time
```
- Analysis can have varying level of detail
```
x <- 5*a+6*b
One assignment
Two multiplication
One addition
Thus f(n) = 4 unit of time
```
- The statement above f(n) = 4 or f(n) = 1. It depends on how presise the analysis must be. Since the result is constant, it can be represented as <span style="text-decoration: underline;">__O(1)__</span>. 

### Space analysis
```
a    ---> 1
b    ---> 1
temp ---> 1
Thus s(n) = 3 word
```
Since the result is constant, it can be represented as <span style="text-decoration: underline;">__O(1)__</span>. 

### What is a data structure?
- A systematic way of storing, organizing, modifying, and accessing data
![DS Roadmap](public/DS.png)

## Why learn algorithms?
- Understand how computers see the world
- In designing software, the part that takes the longest is design. Algorithms will focus alot on design and train your design skills. 

### How to measure the goodness of an algorithm?
- Correctness
- Run time
- Space-efficiency
- Clarity
- Functionality
- Modularity
- ...

### Complexity analysis
- Run time depends on :
- Algorithm 
- Input size
- Input data distribution
- ...
- Analyze the run time using Asymptotic analysis

![n Complexity](public/nComplexity.png)

## Basic operation takes constant time
- Arithmetic operation
- Comparison operation
- Memory operation
- Function invocation and return

### Case analysis
- Worst-case complexity Tworst(n): Input of size n that takes the longest time amoung all other inputs
- Best-case complexity Tbest(n): Input of size n that takes the shortest time amoung all other inputs
- Average-case complexity Tavg(n): Complexity for a typical/random input of size n

## Asymptotic notation
- NEED TO WORK ON UNDERSTANDING

## notations 
- NEED TO WORK ON UNDERSTANDING