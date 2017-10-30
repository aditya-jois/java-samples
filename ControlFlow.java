public class ControlFlow {

	public static void main(String[] args) {

		boolean happy = true;
		boolean sad;

		// if-then
		if (happy) {
			sad = false;
		}

		// if-then-else
		if (happy) {
			sad = false;
		} else {
			sad = true;
		}

		// if-then-else-if
		if (happy) {
			sad = false;
		} else if (!happy) {
			sad = true;
		} else if (!!happy) {
			sad = false;
		} else {
			sad = true;
		}

		// Unlike if-then and if-then-else statements, the switch statement can
		// have a number of possible execution paths. A switch works with the
		// byte, short, char, and int primitive data types. It also works with
		// enumerated types (discussed in Enum Types), the String class, and a
		// few special classes that wrap certain primitive types: Character,
		// Byte, Short, and Integer

		int weekDay = 7;
		String day;
		switch (weekDay) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;

		default:
			day = "Sunday";
			break;
		}
		System.out.println(day);

		// The body of a switch statement is known as a switch block. A
		// statement in the switch block can be labeled with one or more case or
		// default labels. The switch statement evaluates its expression, then
		// executes all statements that follow the matching case label.

		// Another point of interest is the break statement. Each break
		// statement terminates the enclosing switch statement. Control flow
		// continues with the first statement following the switch block. The
		// break statements are necessary because without them, statements in
		// switch blocks fall through: All statements after the matching case
		// label are executed in sequence, regardless of the expression of
		// subsequent case labels, until a break statement is encountered.

		// Technically, the final break is not required because flow falls out
		// of the switch statement. Using a break is recommended so that
		// modifying the code is easier and less error prone. The default
		// section handles all values that are not explicitly handled by one of
		// the case sections.

		// In Java SE 7 and later, you can use a String object in the switch
		// statement's expression. The String in the switch expression is
		// compared with the expressions associated with each case label as if
		// the String.equals method were being used.

		// while
		while (happy) {
			System.out.println("To infinity and beyond!!");
		}

		// do-while
		do {
			System.out.println("You only live \"Once\"");
		} while (sad);

		// The difference between do-while and while is that do-while evaluates
		// its expression at the bottom of the loop instead of the top.
		// Therefore, the statements within the do block are always executed at
		// least once.

		// for
		for (int counter = 0; counter < 2; counter++) {
			System.out.println("Say my name");
		}

		// The for statement also has another form designed for iteration
		// through Collections and arrays This form is sometimes referred to as
		// the enhanced for statement, and can be used to make your loops more
		// compact and easy to read.

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int item : numbers) {
			System.out.println("Count is: " + item);
		}

		// We recommend using this form of the for statement instead of the
		// general form whenever possible.
		
		// BREAK
		// The break statement has two forms: labeled and unlabeled.
		// You saw the unlabeled form in the previous discussion of the switch statement.
		// You can also use an unlabeled break to terminate a for, while, or do-while loop.
		
		// An unlabeled break statement terminates the innermost switch, for, while, or do-while statement,
		// but a labeled break terminates an outer statement.
		
		// The break statement terminates the labeled statement; it does not transfer the flow of control to the label.
		// Control flow is transferred to the statement immediately following the labeled (terminated) statement.
		
		// CONTINUE
		// The continue statement skips the current iteration of a for, while , or do-while loop.
		// The unlabeled form skips to the end of the innermost loop's body and evaluates the boolean expression that controls the loop.
		// A labeled continue statement skips the current iteration of an outer loop marked with the given label.
		
		// RETURN
		// The return statement exits from the current method, and control flow returns to where the method was invoked.
		// The return statement has two forms: one that returns a value, and one that doesn't.
		
		// return count++; // To return a value, simply put the value (or an expression that calculates the value) after the return keyword.
		// The data type of the returned value must match the type of the method's declared return value.
		// return; // When a method is declared void, use the form of return that doesn't return a value.

	}

}
