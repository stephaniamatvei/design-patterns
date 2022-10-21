# Builder

### Table of Contents

* [Intent](#intent)
* [Problem](#problem)
* [Solution](#solution)
* [Structure](#structure)
* [Applicability](#applicability)

### Intent
**Builder** is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

### Problem
Imagine a complex object that requires laborious, step-by-step initialization of many fields and nested objects. Such initialization code is usually buried inside a monstrous constructor with lots of parameters. Or even worse: scattered all over the client code.

### Solution
The Builder pattern suggests the object construction code to be extracted out of its own class and moved to separate objects called *builders*.

### Structure
The Reader encapsulates the parsing of the common input. The Builder hierarchy makes possible the polymorphic creation of many peculiar representations or targets.

### Applicability
- Use the Builder pattern to get rid of a “telescoping constructor”.
- Use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses).
- Use the Builder to construct Composite trees or other complex objects.
