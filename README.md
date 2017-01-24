# java-samples
Credit: https://docs.oracle.com/javase/tutorial/reallybigindex.html<br/>
<a href="https://github.com/aditya-jois/java-samples/blob/master/HelloWorld.java">HelloWorld.java</a><br/>
Object is similar to a real-world object and has state (field) and behavior (method).<br/>
Hiding internal state and requiring all interaction to be performed through an object's methods is known as data encapsulation — a fundamental principle of object-oriented programming.<br/>
A class is the blueprint from which individual objects are created.<br/>
Object-oriented programming allows classes to inherit commonly used state and behavior from other classes.<br/>
<a href="https://github.com/aditya-jois/java-samples/blob/master/Inheritance.java">Inheritance.java</a><br/>
Methods form the object's interface with the outside world.<br/>
Implementing an interface allows a class to become more formal about the behavior it promises to provide. Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler. If your class claims to implement an interface, all methods defined by that interface must appear in its source code before the class will successfully compile.<br/>
<a href="https://github.com/aditya-jois/java-samples/blob/master/ITelevision.java">ITelevision.java</a>&nbsp;<a href="https://github.com/aditya-jois/java-samples/blob/master/Television.java">Television.java</a><br/>
A package is a namespace that organizes a set of related classes and interfaces.<br/>
Example: com.example.java.sample com.example.java.sample.HelloWorld.java<br/>
<br/>
The Java programming language uses both "fields" and "variables" as part of its terminology. Instance variables (non-static fields) are unique to each instance of a class. Class variables (static fields) are fields declared with the static modifier; there is exactly one copy of a class variable, regardless of how many times the class has been instantiated. Local variables store temporary state inside a method. Parameters are variables that provide extra information to a method; both local variables and parameters are always classified as "variables" (not "fields"). When naming your fields or variables, there are rules and conventions that you should (or must) follow.
<br/>
The eight primitive data types are: byte, short, int, long, float, double, boolean, and char. The java.lang.String class represents character strings. The compiler will assign a reasonable default value for fields of the above types; for local variables, a default value is never assigned. A literal is the source code representation of a fixed value. An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed.<br/>
<a href="https://github.com/aditya-jois/java-samples/blob/master/Variables.java">Variables.java</a>&nbsp;<a href="https://github.com/aditya-jois/java-samples/blob/master/Literals.java">Literals.java</a>&nbsp;<a href="https://github.com/aditya-jois/java-samples/blob/master/ArraysSample.java">ArraysSample.java</a><br/>
<br/>
<a href="https://github.com/aditya-jois/java-samples/blob/master/Singleton.java">Singleton.java</a><br/>
