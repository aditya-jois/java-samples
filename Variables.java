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

}
