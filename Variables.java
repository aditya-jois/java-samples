public class Variables {

	// Instance Variables (Non-Static Fields) Technically speaking, objects
	// store their individual states in "non-static fields", that is, fields
	// declared without the static keyword. Non-static fields are also known as
	// instance variables because their values are unique to each instance of a
	// class (to each object, in other words)
	int instanceVariable = 0;

	// Class Variables (Static Fields) A class variable is any field declared
	// with the static modifier; this tells the compiler that there is exactly
	// one copy of this variable in existence, regardless of how many times the
	// class has been instantiated.
	static int classVariable = 0;

	// Additionally, the keyword final could be added to indicate that the
	// variable's value will never change.
	final static int finalClassVariable = 0;

	// Parameters You've already seen examples of parameters, both in the
	// Bicycle class and in the main method of the "Hello World!" application.
	// Recall that the signature for the main method is public static void
	// main(String[] args). Here, the args variable is the parameter to this
	// method. The important thing to remember is that parameters are always
	// classified as "variables" not "fields". This applies to other
	// parameter-accepting constructs as well (such as constructors and
	// exception handlers) that you'll learn about later in the tutorial.
	public static void main(String[] args) {
		// Local Variables Similar to how an object stores its state in fields,
		// a method will often store its temporary state in local variables. The
		// syntax for declaring a local variable is similar to declaring a field
		// (for example, int count = 0;). There is no special keyword
		// designating a variable as local; that determination comes entirely
		// from the location in which the variable is declared — which is
		// between the opening and closing braces of a method. As such, local
		// variables are only visible to the methods in which they are declared;
		// they are not accessible from the rest of the class.
		int count = 0;

	}

	// The Java programming language is statically-typed, which means that all
	// variables must first be declared before they can be used. This involves
	// stating the variable's type and name.
	// A variable's data type determines the values it may contain, plus the
	// operations that may be performed on it.
	// A primitive type is predefined by the language and is named by a reserved
	// keyword. Primitive values do not share state with other primitive values.
	// The eight primitive data types supported by the Java programming language
	// are:

	// byte: The byte data type is an 8-bit signed two's complement integer. It
	// has a minimum value of -128 and a maximum value of 127 (inclusive). The
	// byte data type can be useful for saving memory in large arrays, where the
	// memory savings actually matters. They can also be used in place of int
	// where their limits help to clarify your code; the fact that a variable's
	// range is limited can serve as a form of documentation.
	byte byteVar;

	// short: The short data type is a 16-bit signed two's complement integer.
	// It has a minimum value of -32,768 and a maximum value of 32,767
	// (inclusive). As with byte, the same guidelines apply: you can use a short
	// to save memory in large arrays, in situations where the memory savings
	// actually matters.
	short shortVar;

	// int: By default, the int data type is a 32-bit signed two's complement
	// integer, which has a minimum value of -231 and a maximum value of 231-1.
	// In Java SE 8 and later, you can use the int data type to represent an
	// unsigned 32-bit integer, which has a minimum value of 0 and a maximum
	// value of 232-1. Use the Integer class to use int data type as an unsigned
	// integer. See the section The Number Classes for more information. Static
	// methods like compareUnsigned, divideUnsigned etc have been added to the
	// Integer class to support the arithmetic operations for unsigned integers.
	int intVar;

	// long: The long data type is a 64-bit two's complement integer. The signed
	// long has a minimum value of -263 and a maximum value of 263-1. In Java SE
	// 8 and later, you can use the long data type to represent an unsigned
	// 64-bit long, which has a minimum value of 0 and a maximum value of 264-1.
	// Use this data type when you need a range of values wider than those
	// provided by int. The Long class also contains methods like
	// compareUnsigned, divideUnsigned etc to support arithmetic operations for
	// unsigned long.
	long longVar;

	// float: The float data type is a single-precision 32-bit IEEE 754 floating
	// point. Its range of values is beyond the scope of this discussion, but is
	// specified in the Floating-Point Types, Formats, and Values section of the
	// Java Language Specification. As with the recommendations for byte and
	// short, use a float (instead of double) if you need to save memory in
	// large arrays of floating point numbers. This data type should never be
	// used for precise values, such as currency. For that, you will need to use
	// the java.math.BigDecimal class instead. Numbers and Strings covers
	// BigDecimal and other useful classes provided by the Java platform.
	float floatVar;

	// double: The double data type is a double-precision 64-bit IEEE 754
	// floating point. Its range of values is beyond the scope of this
	// discussion, but is specified in the Floating-Point Types, Formats, and
	// Values section of the Java Language Specification. For decimal values,
	// this data type is generally the default choice. As mentioned above, this
	// data type should never be used for precise values, such as currency.
	double doubleVar;

	// boolean: The boolean data type has only two possible values: true and
	// false. Use this data type for simple flags that track true/false
	// conditions. This data type represents one bit of information, but its
	// "size" isn't something that's precisely defined.
	boolean booleanVar;

	// char: The char data type is a single 16-bit Unicode character. It has a
	// minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or
	// 65,535 inclusive).
	char charVar;

	// In addition to the eight primitive data types listed above, the Java
	// programming language also provides special support for character strings
	// via the java.lang.String class. Enclosing your character string within
	// double quotes will automatically create a new String object; for example,
	// String s = "this is a string";. String objects are immutable, which means
	// that once created, their values cannot be changed. The String class is
	// not technically a primitive data type, but considering the special
	// support given to it by the language, you'll probably tend to think of it
	// as such.
	String s = "this is a string";

	// Default Values

	// It's not always necessary to assign a value when a field is declared.
	// Fields that are declared but not initialized will be set to a reasonable
	// default by the compiler. Generally speaking, this default will be zero or
	// null, depending on the data type. Relying on such default values,
	// however, is generally considered bad programming style.

	// The following chart summarizes the default values for the above data
	// types.

	// Data Type Default Value (for fields)
	// byte 0
	// short 0
	// int 0
	// long 0L
	// float 0.0f
	// double 0.0d
	// char '\u0000'
	// String (or any object) null
	// boolean false

	// Local variables are slightly different; the compiler never assigns a
	// default value to an uninitialized local variable. If you cannot
	// initialize your local variable where it is declared, make sure to assign
	// it a value before you attempt to use it. Accessing an uninitialized local
	// variable will result in a compile-time error.

}
