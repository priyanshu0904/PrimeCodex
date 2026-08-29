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
System.out.printf("Hello %s, your marks is %d", name, marks);
```
- Like c, do not concatenate, just work in one string
- %[flags] [width] [.precision] specifier-character

# Java Format Specifiers

## General Format Specifiers

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
| `%e` | Scientific notation | `1.23e+03` |
| `%E` | Scientific notation (uppercase) | `1.23E+03` |
| `%f` | Decimal floating-point | `123.456000` |
| `%g` | General floating-point | `123.456` |
| `%G` | General floating-point (uppercase) | `123.456` |
| `%a` | Hexadecimal floating-point | `0x1.edd2f1a9fbe77p6` |
| `%A` | Hexadecimal floating-point (uppercase) | `0X1.EDD2F1A9FBE77P6` |
| `%t` | Date/time prefix | `%tH` |
| `%T` | Date/time prefix (uppercase) | `%TH` |
| `%n` | Platform-specific newline | New line |
| `%%` | Literal percent sign | `%` |

---

## Date & Time Format Specifiers

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

---

## Common Formatting Patterns

| Pattern | Purpose |
|---|---|
| `%.2f` | 2 decimal places |
| `%10s` | Minimum width of 10 |
| `%-10s` | Left-aligned, width 10 |
| `%05d` | Zero-padded to width 5 |
| `%+d` | Always show sign |
| `%,d` | Grouping separator |
| `%.5s` | Maximum 5 characters |
| `%1$s` | Use first argument |
| `%2$d` | Use second argument |

---

> **Tip:** Format specifiers are used with `String.format()`, `System.out.printf()`, `Formatter`, and related Java formatting APIs.

# 🚩 Java Format Flags

| Flag | Name | Description | Example | Output |
|:---:|---|---|---|---|
| `-` | Left-justify | Left-aligns the formatted value within the given width | `%-10s` | `Java      ` |
| `#` | Alternate form | Uses an alternate form for certain conversions | `%#x` | `0xff` |
| `+` | Sign | Always includes the sign (`+` or `-`) | `%+d` | `+42` |
| ` ` | Space | Adds a leading space for positive numbers | `% d` | ` 42` |
| `0` | Zero-padding | Pads the value with zeros | `%05d` | `00042` |
| `,` | Grouping | Adds locale-specific grouping separators | `%,d` | `1,000,000` |
| `(` | Parentheses | Encloses negative numbers in parentheses | `%(d` | `(42)` |
| `<` | Previous argument | Reuses the previous argument | `%d %<d` | `42 42` |

---

## 🧩 Combining Flags

Multiple flags can be combined in a single format specifier.

```java
System.out.printf("%+08d%n", 42);