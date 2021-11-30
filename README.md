<h1 align="center" style="margin-top: 0px;">
    Head First Design Patterns
</h1>

BOOK -> Head First Design Patterns

    https://www.oreilly.com/library/view/head-first-design/0596007124/

:: BASICS ::

* I know it's a .net site but the info is very nice ^^


    https://dotnettutorials.net/lesson/object-oriented-programming-in-java/

* Abstraction
* Encapsulation
* Polymorphism
* Inheritance

:: THOUGHTS ::

* Knowing the OO basics does not make you a good OO designer
* Good OO designs are reusable, extensible, and maintainable
* Patterns show you how to build systems with good OO design qualities
* Patterns are proven object-oriented experience
* Patterns don’t give you code, they give you general solutions to design problems
* You apply them to your specific application
* Patterns aren’t invented, they are discovered
* Most patterns and principles address issues of change in software
* Most patterns allow some part of a system to vary independently of all other parts
* We often try to take what varies in a system and encapsulate it
* Patterns provide a shared language that can maximize the value of your
  communication with other developers

:: PRINCIPLES ::

* Encapsulates what varies
* Favor composition over inheritance
* Program to interfaces, not implementations

:: STRATEGY PATTERN ::

* Defines a family of algorithms, encapsulates each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

:: STUFF THAT MATTERS ::

* Uses delegation to decide witch one to use
* Changing behaviors out of prent class ; use interface
* Take the parts that vary and encapsulate them ;  you can alter or extend without affecting others
* Keep things flexible
* Change behavior dynamically ; at runtime
* Polymorphism ; the class declaring doesn't have to know about the actual object type

