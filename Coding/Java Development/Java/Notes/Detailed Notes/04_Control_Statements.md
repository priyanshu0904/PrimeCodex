# Conditional Statements
## if-else
- Decision making, branching, conditional statements
- if(condition) -> Condition true then executes, otherwise else executes
1. Normal if : if(condition) {}
2. if-else : if(condition) {} else{}
3. if-else ladder : if(condition1) {} else if(condition2) {}.......else {}
4. Nested if-else : if(condition1) {if(condition2) {} else {}}.....else {if(condition3) {} else {}}

## Ternary Operator
- data_type variable = condition ? expression(true) : expression(false);, expressions data type same as variable
- Nesting possible, don't overuse it

## switch-case
- Multiple values for expression, checks only equality, supported for data types byte, short, int, char, String, long, enums, float, double
- break use to prevent fall through between cases.
- default -> If no cases executes then default executes, optional, break not required
```java
switch(expression){
	case x: //data type of expression and case label must be same
		statement;
		break;
	......
	default:
		statement;
		break;
}
```

```java
//enhanced, store in variable, no fall through, break not required, arrow, multiple cases supports
String output = switch(expression){
	case x -> "anything";
	....
	case y, z -> "anything else";
	default -> "nothing";
}
```

# Looping Statements
- Looping and Iterative Statements.
- Code block runs till condition false
- while, for, do while, for each
- **Iterations** : Number of times the loop runs.
- Initialization, Condition and Updation.
- Avoid infinite loops
## while loop
```java
initialization
while(condition){
	//code block
	//updation
}
```

## do-while loop
- executes block first then condition check, runs at least one iteration it is unconditional
- update condition to avoid infinite loops
```java
do{
	//body
}while(condition);
```

## for loop
- standard and most used loop
- initialization only once
```java
for(initialization; condition; updation){}
```

## for each loop
- array iteration, parameter -> used for item, no index, to perform any action on each element
```java
int[] array = {1, 2, 3, 4, 5};
for(int nums : array){
	System.out.println(nums);
}
```

# Jumping Statements
- break -> used in switch, stops loop immediately and break out of it
- continue -> skip the current one iteration
- In while loop, update manually before continue
- return -> get out of method immediately