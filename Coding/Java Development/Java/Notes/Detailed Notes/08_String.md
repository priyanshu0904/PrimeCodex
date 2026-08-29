# String
## toString Method
- String representation of an object
- Inherited from Object Class.
- By default returns ClassName@HashCode, otherwise whatever you want to return
- Automatically called in string concatenation

## String Class
- Object of String class, character array
- Immutable(actual value can't be changed), modification creates new string, string pool, matches for reuse
- == checks reference but for value .equals(), by-default with each object
- .equalsIgnoreCase() for case-insensitive
```java
String str1 = "abc"; //puts string in string pool
String str2 = "abc"; //string pool, but same reference not new
String str3 = new String("abc"); //not in string pool, heap
```
- Concatenation using '+', if one string comes then rest of all becomes string, each concatenation -> new string in string pool -> memory waste, when frequently modified use more memory
### Methods of String
- length() -> here it is method, length of string
- substring(a,b) -> creates substring in range a to b-1
- equals() -> comparison
- compareTo() -> compares in dictionary order
- indexOf() -> find index of input value in string, if not then -1

### String Format
```java
String name = "Priyanshu";
int marks = 99;
System.out.printf("Hello %s, your marks is %d", name, marks); //sequence of variable must be same as specifier
```
- Like C, do not concatenate, just work in one string
- Rule of Format-specifier :- %[flags] [width] [.precision] specifier-character

## Java Format Specifiers
### General Format Specifiers
| Specifier | Description | Example |
|---|---|---|
| `%b` | Boolean | `true` |
| `%B` | Boolean (uppercase) | `TRUE` |
| `%h` | Hash code | `7a81197d` |
| `%H` | Hash code (uppercase) | `7A81197D` |
| `%s` | String | `Hello` |
| `%S` | String (uppercase) | `HELLO` |
| `%c` | Character | `A` |
| `%C` | Character (uppercase) | `A` |
| `%d` | Decimal integer | `123` |
| `%o` | Octal integer | `173` |
| `%x` | Hexadecimal integer | `7b` |
| `%X` | Hexadecimal (uppercase) | `7B` |
| `%e` | Exponential, Scientific notation | `1.23e+03` |
| `%E` | Exponential, Scientific notation (uppercase) | `1.23E+03` |
| `%f` | Decimal floating-point | `123.456000` |
| `%g` | General floating-point | `123.456` |
| `%G` | General floating-point (uppercase) | `123.456` |
| `%a` | Hexadecimal floating-point | `0x1.edd2f1a9fbe77p6` |
| `%A` | Hexadecimal floating-point (uppercase) | `0X1.EDD2F1A9FBE77P6` |
| `%t` | Date/time prefix | `%tH` |
| `%T` | Date/time prefix (uppercase) | `%TH` |
| `%n` | Platform-specific newline | New line |
| `%%` | Literal percent sign | `%` |

### Date & Time Format Specifiers
| Specifier | Description |
|---|---|
| `%tH` | Hour (00–23) |
| `%tI` | Hour (01–12) |
| `%tk` | Hour (0–23) |
| `%tl` | Hour (1–12) |
| `%tM` | Minute (00–59) |
| `%tS` | Second (00–60) |
| `%tL` | Millisecond (000–999) |
| `%tN` | Nanosecond (000000000–999999999) |
| `%tp` | AM/PM |
| `%tz` | Time-zone offset |
| `%tZ` | Time-zone name |
| `%ts` | Unix timestamp (seconds) |
| `%tQ` | Unix timestamp (milliseconds) |
| `%tB` | Full month name |
| `%tb` | Short month name |
| `%th` | Short month name |
| `%tA` | Full day name |
| `%ta` | Short day name |
| `%tC` | Century |
| `%tY` | 4-digit year |
| `%ty` | 2-digit year |
| `%tj` | Day of year |
| `%tm` | Month |
| `%td` | Day of month |
| `%te` | Day of month (space-padded) |
| `%tR` | Time as `HH:mm` |
| `%tT` | Time as `HH:mm:ss` |
| `%tr` | Time as `hh:mm:ss AM/PM` |
| `%tD` | Date as `MM/dd/yy` |
| `%tF` | Date as `yyyy-MM-dd` |
| `%tc` | Full date and time |

### Common Formatting Patterns
#### 1. String Formatting (`%s`, `%S`)
| Pattern | Data | `printf` Output | Description |
| --- | --- | --- | --- |
| `'%s'` | `"Java"` | `'Java'` | Default string output |
| `'%S'` | `"Java"` | `'JAVA'` | Uppercase conversion |
| `'%10s'` | `"Java"` | `'      Java'` | Right-aligned, width = 10 (padded with spaces) |
| `'%-10s'` | `"Java"` | `'Java      '` | Left-aligned, width = 10 (padded with spaces) |
| `'%-10S'` | `"Java"` | `'JAVA      '` | Left-aligned, width = 10, uppercase |
| `'%.2s'` | `"Java"` | `'Ja'` | Precision: truncate string to first 2 characters |
| `'%10.2s'` | `"Java"` | `'        Ja'` | Right-aligned (width 10), max 2 characters |
| `'%-10.2s'` | `"Java"` | `'Ja        '` | Left-aligned (width 10), max 2 characters |

#### 2. Decimal Integer Formatting (`%d`)

| Pattern | Data | `printf` Output | Description |
| --- | --- | --- | --- |
| `'%d'` | `1234567` | `'1234567'` | Default integer output |
| `'%12d'` | `1234567` | `'     1234567'` | Right-aligned, width = 12 |
| `'%-12d'` | `1234567` | `'1234567     '` | Left-aligned, width = 12 |
| `'%012d'` | `1234567` | `'000001234567'` | Zero-padded, width = 12 |
| `'%,d'` | `1234567` | `'1,234,567'` | Locale-specific grouping separator |
| `'%,12d'` | `1234567` | `'   1,234,567'` | Comma-separated, right-aligned (width 12) |
| `'%+d'` | `1234567` | `'+1234567'` | Always include sign (`+` or `-`) |
| `'%+12d'` | `1234567` | `'    +1234567'` | Sign included, right-aligned (width 12) |
| `'%-,12d'` | `1234567` | `'1,234,567   '` | Left-aligned with grouping separator |
| `'%+,12d'` | `1234567` | `'  +1,234,567'` | Sign included, comma-separated, right-aligned |
| `'%+012d'` | `1234567` | `'+00001234567'` | Sign included, zero-padded to width 12 |
| `'%(d'` | `-1234567` | `'(1234567)'` | Negative numbers enclosed in parentheses |
| `'% d'` | `1234567` | `' 1234567'` | Leading space for positive values |

#### 3. Floating-Point Formatting (`%f`, `%e`, `%g`)

| Pattern | Data | `printf` Output | Description |
| --- | --- | --- | --- |
| `'%f'` | `1234.5678` | `'1234.567800'` | Default float (6 decimal places) |
| `'%.2f'` | `1234.5678` | `'1234.57'` | Rounded to 2 decimal places |
| `'%,.2f'` | `1234.5678` | `'1,234.57'` | Grouping separator with 2 decimal places |
| `'%12.2f'` | `1234.5678` | `'     1234.57'` | Width = 12, 2 decimal places, right-aligned |
| `'%-12.2f'` | `1234.5678` | `'1234.57     '` | Width = 12, 2 decimal places, left-aligned |
| `'%012.2f'` | `1234.5678` | `'000001234.57'` | Zero-padded to width 12, 2 decimal places |
| `'%e'` | `1234.5678` | `'1.234568e+03'` | Standard scientific notation |
| `'%E'` | `1234.5678` | `'1.234568E+03'` | Uppercase scientific notation |
| `'%.2e'` | `1234.5678` | `'1.23e+03'` | Scientific notation with 2 decimal precision |

#### 4. Other Data Types (`%c`, `%b`, `%x`, `%o`)

| Pattern | Data | `printf` Output | Description |
| --- | --- | --- | --- |
| `'%c'` | `'a'` | `'a'` | Character output |
| `'%C'` | `'a'` | `'A'` | Uppercase character conversion |
| `'%5c'` | `'a'` | `'    a'` | Character right-aligned (width 5) |
| `'%b'` | `true` | `'true'` | Boolean output |
| `'%B'` | `true` | `'TRUE'` | Uppercase boolean |
| `'%x'` | `255` | `'ff'` | Hexadecimal (lowercase) |
| `'%X'` | `255` | `'FF'` | Hexadecimal (uppercase) |
| `'%#x'` | `255` | `'0xff'` | Hexadecimal with radix prefix (`0x`) |
| `'%o'` | `255` | `'377'` | Octal representation |
| `'%#o'` | `255` | `'0377'` | Octal with radix prefix (`0`) |
| `'%%'` | *none* | `'%'` | Literal percent sign |
| `'%n'` | *none* | *(line break)* | Platform-specific newline separator |
> **Tip:** Format specifiers are used with `String.format()`, `System.out.printf()`, `Formatter`, and related Java formatting APIs.

## Java Format Flags

| Flag | Name | Description | Example | Output |
|:---:|---|---|---|---|
| `-` | Left-justify | Left-aligns the formatted value within the given width | `%-10s` | `Java      ` |
| `#` | Alternate form | Uses an alternate form for certain conversions | `%#x` | `0xff` |
| `+` | Sign | Always includes the sign (`+` or `-`) | `%+d` | `+42` |
| ` ` | Space | Adds a leading space for positive numbers and minus sign for negative | `% d` | ` 42` |
| `0` | Zero-padding | Pads the value with zeros | `%05d` | `00042` |
| `,` | Grouping | Adds locale-specific grouping separators | `%,d` | `1,000,000` |
| `(` | Parentheses | Encloses negative numbers in parentheses | `%(d` | `(42)` |
| `<` | Previous argument | Reuses the previous argument | `%d %<d` | `42 42` |

- Multiple flags can be combined in a single format specifier.
```java
System.out.printf("%+08d%n", 42);
```

## StringBuilder and StringBuffer
```java
StringBuilder sb = new StringBuilder("Hello");
StringBuffer sb1 = new StringBuffer("Hello");
sb.append("Guys"); 
sb1.append("Priyanshu");
//append method is used in both
//both are mutable and stored in heap directly
```
- If we have to directly return the string, so to prevent concatenation, use these
- Speed: StringBuilder > StringBuffer > String
- String -> Not used in threaded environment
- StringBuilder -> Used in single threaded environment, not thread safe
- StringBuffer -> Used in multi threaded environment, thread safe

## Final Keyword
```java
final double PI = 3.14;
```
- Becomes constant, performance optimization, reduces null pointer error, helps in creating immutable objects