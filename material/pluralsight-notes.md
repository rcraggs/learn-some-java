# Java Fundamentals

## Setting up your environment

- If you use an IDE then a lot of the stuff about JDK vs JRE and installation can be hidden from you. However it is still very useful to understand this. When we start using tools like Continuous Integration and Automated Testing in 2nd year modules you will need to understand this sort of thing.
- Netbeans and Eclipse are available in the Computer Science labs. However, I prefer IntelliJ. As the video says, it really doesn't matter, although you may need to google how to do specific things in a particular IDE if you use different ones. 
- You don't really need to watch the demos for both IntelliJ and Netbeans.

## Class initializers and constructors

- It's not that common to have one constructor call another. It's worth knowing but don't worry about the rules too much.

# Java Core

## Working with Collections

refers to object equals method...

- **Collections and type Safety** - Generics can be a complex topic, but for now all you need to know if that you almost always want to specify the type of objects that are allowed to be in your collections and you do it like this `ArrayList<String> variableName;`
- **Collection Interface** - don't worry to much about references to inheriting from the collection interface - all it means that there is a set of functions you can call on any of the collection types (List, Set, etc)
- **Java 8** - you can get away with not using these - they are just shortcuts to doing things on lists that you can use `ForEach` for.