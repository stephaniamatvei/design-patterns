# Bridge

### Table of Contents

* [Intent](#intent)
* [Problem](#problem)
* [Solution](#solution)
* [Diagram](#diagram)
* [When to use the Bridge pattern?](#when-to-use-the-bridge-pattern)

### Intent

**Bridge** is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

### Problem

Say you have a geometric ```Shape``` class with a pair of subclasses: ```Circle``` and ```Square```. You want to extend this class hierarchy to incorporate colors, so you plan to create ```Red``` and ```Blue``` shape subclasses. However, since you already have two subclasses, you’ll need to create four class combinations such as ```BlueCircle``` and ```RedSquare```.

![](../../../../resources/images/bridge-problem.png)

Adding new shape types and colors to the hierarchy will grow it exponentially. For example, to add a triangle shape you’d need to introduce two subclasses, one for each color. And after that, adding a new color would require creating three subclasses, one for each shape type. The further we go, the worse it becomes.

### Solution

This problem occurs because we’re trying to extend the shape classes in two independent dimensions: by form and by color. That’s a very common issue with class inheritance.

The Bridge pattern attempts to solve this problem by switching from inheritance to the object composition. What this means is that you extract one of the dimensions into a separate class hierarchy, so that the original classes will reference an object of the new hierarchy, instead of having all of its state and behaviors within one class.

![](../../../../resources/images/bridge-solution.png)

Following this approach, we can extract the color-related code into its own class with two subclasses: ```Red``` and ```Blue```. The ```Shape``` class then gets a reference field pointing to one of the color objects. Now the shape can delegate any color-related work to the linked color object. That reference will act as a bridge between the ```Shape``` and ```Color``` classes. From now on, adding new colors won’t require changing the shape hierarchy, and vice versa.

### Diagram

![](../../../../resources/images/bridge.png)

### When to use the Bridge pattern?

- When having a complex structure of classes with similar implementations;
- When want to impose the same implementation for multiple objects;
- When providing a map between orthogonal class hierarchies.