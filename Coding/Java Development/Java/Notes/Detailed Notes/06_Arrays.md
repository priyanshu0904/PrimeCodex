# Array
- Multiple values, one variable, same data type, different indexing, index starts with 0, continuous memory location, 
- Size can't be changed later, fixed length.
- Array length = last index + 1;
- Object Reference, can be saved in variable
- ArrayOutOfBoundException -> If array overflows or underflows
---
## One Dimensional Array
```java
type_array name = new type_element[length];
int[] arr = new int[length];

type_array name = {list of initialization values}
int[] brr = {1,2,3,4,5}; //size automaic detected
```
- Array's last index = length - 1;
- Length = array_name.length; //property
---
## Two Dimensional Array
- Memory location -> Linear but logic 2D
- Array of Arrays.
```java
int[][] numArr = new int[2][3];
numArr[1][2] = 5;

int[][] inArr = {{1,2,3},
				 {4,5,6},
				 {7,8,9}};
```
- ArrayOutOfBoundException occurs here also.
- Function static, can use **class_name.method_name();** without creating object.
- Integer.MIN_VALUE; - Minimum value of integer
- Integer.MAX_VALUE; - Maximum value of integer

