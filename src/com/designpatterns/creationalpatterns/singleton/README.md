# Singleton

### Table of Contents

* [Intent](#intent)
* [Problem](#problem)
* [Discussion](#discussion)
* [Solution](#solution)
* [Structure](#structure)
* [When to use the singleton pattern?](#when-to-use-the-singleton-pattern?)

### Intent
**Singleton** is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

### Problem
Application needs one, and only one, instance of an object. Additionally, lazy initialization and global access are necessary.

### Discussion
Make the class of the single instance object responsible for creation, initialization, access, and enforcement. Declare the instance as a private static data member. Provide a public static member function that encapsulates all initialization code, and provides access to the instance.

The client calls the accessor function (using the class name and scope resolution operator) whenever a reference to the single instance is required.

### Solution
All implementations of the Singleton have these two steps in common:

- Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
- Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object and saves it in a static field. All following calls to this method return the cached object.


### Structure
1. The **Singleton** class declares the static method `getInstance` that returns the same instance of its own class.

The Singleton’s constructor should be hidden from the client code. Calling the `getInstance` method should be the only way of getting the Singleton object.

### When to use the singleton pattern?
- When a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.
- When you need stricter control over global variables.

