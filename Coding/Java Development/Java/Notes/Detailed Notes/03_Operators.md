# Operators
- Performs mathematical tasks or actions on operands.
- Always use brackets for clarification.

### Assignment Operator
- number = 5; // Left <- Right assigns

### Arithmetic Operators
- \+ \- \* \/ \%
- BODMAS or PEDMAS

### Shorthand Operators
- a = a + b -> a += b;
- +=, -=, \*=, \/=, %=, etc...

### Unary Operators
- -y, ++y, --y, y++, y--
- Statement : System.out.println(x++ or ++x); 

### Relational Operators
- 2 number -> result boolean 
- \==, \!=, (>, >=, <, <=) -> Relational
- Gives true if the definition satisfies
- Order of Relational Operators < Arithmetic Operators.

### Logical Operators
- 2 boolean -> result boolean
- AND (&&), OR(||), NOT(!)
- Order : Arithmetic > Relational > Logical

### Operator Precedence and Associativity
- In any expression, the calculation is done based on these.
- **Precedence** : Priority among different operators.
- **Associativity** : Priority in same kind of operators. (R to L or L to R)

| Operator Type | Category | Precedence / Operators | Associativity | Precedence Level |
| :--- | :--- | :--- | :--- | :---: |
| **Postfix / Primary** | Postfix | `()` Function call<br>`[]` Array subscript<br>`.` Dot (Member of structure)<br>`->` Arrow (Member of structure)<br>`a++`, `a--` | Left-to-Right | Highest (14) |
| **Unary** | Prefix | `!` Logical NOT<br>`~` One's-complement<br>`-`, `+` Unary minus / plus<br>`++a`, `--a` Increment / Decrement<br>`&` Address-of<br>`*` Indirection<br>`(type)` Cast<br>`sizeof` Sizeof | Right-to-Left | 13 |
| **Arithmetic** | Multiplication | `*` Multiplication<br>`/` Division<br>`%` Modulus (Remainder) | Left-to-Right | 12 |
| **Arithmetic** | Addition | `+` Addition<br>`-` Subtraction | Left-to-Right | 11 |
| **Shift** | Shift | `<<` Left-shift<br>`>>` Right-shift<br>`>>>` | Left-to-Right | 10 |
| **Relational** | Comparison | `<` Less than<br>`<=` Less than or equal to<br>`>` Greater than<br>`>=` Greater than or equal to<br>`instanceOf` | Left-to-Right | 8 / 9 |
| **Relational** | Equality | `==` Equal to<br>`!=` Not equal to | Left-to-Right | 8 |
| **Bitwise** | Bitwise AND | `&` Bitwise AND | Left-to-Right | 7 |
| **Bitwise** | Bitwise XOR | `^` Bitwise XOR (Exclusive OR) | Left-to-Right | 6 |
| **Bitwise** | Bitwise OR | `\|` Bitwise OR (Inclusive OR) | Left-to-Right | 5 |
| **Logical** | Logical AND | `&&` Logical AND | Left-to-Right | 4 |
| **Logical** | Logical OR | `\|\|` Logical OR | Left-to-Right | 3 |
| **Ternary** | Ternary / Conditional | `? :` Conditional | Right-to-Left | 2 |
| **Assignment** | Assignment | `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `^=`, `\|=`, `<<=`, `>>=`, `>>>=` | Right-to-Left | 1 |
| **Comma** | Comma | `,` Comma | Left-to-Right | Lowest (0) |


### Number System
- Unary -> Base 1 -> 0/1
- Binary -> Base 2 -> 0,1
- Octal -> Base 8 -> 0-7
- Decimal -> Base 10 -> 0-9 -> Daily life use
- Hexadecimal -> Base 16 -> 0-9, A-F

| Category                      | Decimal Range | Character Mappings (`Char - Dec`) ASCII to Decimal                                                                                                                                                                                                                                                                                                                      |
| :---------------------------- | :-----------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Control Codes**             |    0 – 31     | `NUL - 0`, `SOH - 1`, `STX - 2`, `ETX - 3`, `EOT - 4`, `ENQ - 5`, `ACK - 6`, `BEL - 7`, `BS - 8`, `HT - 9`, `LF - 10`, `VT - 11`, `FF - 12`, `CR - 13`, `SO - 14`, `SI - 15`, `DLE - 16`, `DC1 - 17`, `DC2 - 18`, `DC3 - 19`, `DC4 - 20`, `NAK - 21`, `SYN - 22`, `ETB - 23`, `CAN - 24`, `EM - 25`, `SUB - 26`, `ESC - 27`, `FS - 28`, `GS - 29`, `RS - 30`, `US - 31` |
| **Punctuation & Symbols (1)** |    32 – 47    | `SP - 32`, `! - 33`, `" - 34`, `# - 35`, `$ - 36`, `% - 37`, `& - 38`, `' - 39`, `( - 40`, `) - 41`, `* - 42`, `+ - 43`, `, - 44`, `- - 45`, `. - 46`, `/ - 47`                                                                                                                                                                                                         |
| **Digits (0 – 9)**            |    48 – 57    | `0 - 48`, `1 - 49`, `2 - 50`, `3 - 51`, `4 - 52`, `5 - 53`, `6 - 54`, `7 - 55`, `8 - 56`, `9 - 57`                                                                                                                                                                                                                                                                      |
| **Punctuation & Symbols (2)** |    58 – 64    | `: - 58`, `; - 59`, `< - 60`, `= - 61`, `> - 62`, `? - 63`, `@ - 64`                                                                                                                                                                                                                                                                                                    |
| **Uppercase Letters (A – Z)** |    65 – 90    | `A - 65`, `B - 66`, `C - 67`, `D - 68`, `E - 69`, `F - 70`, `G - 71`, `H - 72`, `I - 73`, `J - 74`, `K - 75`, `L - 76`, `M - 77`, `N - 78`, `O - 79`, `P - 80`, `Q - 81`, `R - 82`, `S - 83`, `T - 84`, `U - 85`, `V - 86`, `W - 87`, `X - 88`, `Y - 89`, `Z - 90`                                                                                                      |
| **Punctuation & Symbols (3)** |    91 – 96    | `[ - 91`, `\ - 92`, `] - 93`, `^ - 94`, `_ - 95`, `` ` - 96 ``                                                                                                                                                                                                                                                                                                          |
| **Lowercase Letters (a – z)** |   97 – 122    | `a - 97`, `b - 98`, `c - 99`, `d - 100`, `e - 101`, `f - 102`, `g - 103`, `h - 104`, `i - 105`, `j - 106`, `k - 107`, `l - 108`, `m - 109`, `n - 110`, `o - 111`, `p - 112`, `q - 113`, `r - 114`, `s - 115`, `t - 116`, `u - 117`, `v - 118`, `w - 119`, `x - 120`, `y - 121`, `z - 122`                                                                               |
| **Punctuation & Control (4)** |   123 – 127   | `{ - 123`, `\| - 124`, `} - 125`, `~ - 126`, `DEL - 127`                                                                                                                                                                                                                                                                                                                |


### Bitwise Operators
- Convert to binary, performs bit by bit, gives binary and the decimal of that is the answer.
- AND(&) 
- OR(|)
- XOR(^)
- NOT(~) -> ~x = -(x + 1) -> Complement
- Left Shift(<<) -> a << b -> a \* 2<sup>b</sup>
- Right Shift(>>) -> a >> b -> a \/ 2<sup>b</sup>
- Last bit 0 -> Even, 1 -> Odd
- Any number & with 1 (0000 0001) -> Result 0 -> Even, 1 -> Odd --- To find Even Odd using Bitwise

