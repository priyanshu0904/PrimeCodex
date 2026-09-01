# Java API — Complete Hierarchy Reference

> A structured reference for understanding the Java Standard Library, its packages, classes, interfaces, inheritance relationships, and major implementations.
>
> **Goal:** You do not need to memorize the Java API. Use this document to understand **where a class belongs, what it extends, what it implements, and how to navigate the official documentation when you need a class, interface, constructor, field, or method.**

---

# Table of Contents

* [1. Java Platform Overview](#1-java-platform-overview)
* [2. Fundamental Type Hierarchy](#2-fundamental-type-hierarchy)
* [3. java.lang](#3-javalang)
* [4. Object Hierarchy](#4-object-hierarchy)
* [5. Throwable Hierarchy](#5-throwable-hierarchy)
* [6. Number and Wrapper Classes](#6-number-and-wrapper-classes)
* [7. String Hierarchy](#7-string-hierarchy)
* [8. Enum Hierarchy](#8-enum-hierarchy)
* [9. java.util](#9-javautil)
* [10. Collections Framework](#10-collections-framework)
* [11. List Hierarchy](#11-list-hierarchy)
* [12. Set Hierarchy](#12-set-hierarchy)
* [13. Queue and Deque Hierarchy](#13-queue-and-deque-hierarchy)
* [14. Map Hierarchy](#14-map-hierarchy)
* [15. Iterator Hierarchy](#15-iterator-hierarchy)
* [16. Comparable and Comparator](#16-comparable-and-comparator)
* [17. Optional Hierarchy](#17-optional-hierarchy)
* [18. Array API](#18-array-api)
* [19. Utility Classes](#19-utility-classes)
* [20. java.util.function](#20-javautilfunction)
* [21. java.util.stream](#21-javautilstream)
* [22. java.io](#22-javaio)
* [23. java.nio](#23-javanio)
* [24. java.nio.file](#24-javaniofile)
* [25. java.time](#25-javatime)
* [26. java.math](#26-javamath)
* [27. java.util.regex](#27-javautilregex)
* [28. java.net](#28-javanet)
* [29. java.sql](#29-javasql)
* [30. Reflection](#30-reflection)
* [31. Annotations](#31-annotations)
* [32. Concurrency](#32-concurrency)
* [33. Atomic Classes](#33-atomic-classes)
* [34. Concurrent Collections](#34-concurrent-collections)
* [35. Security](#35-security)
* [36. Logging](#36-logging)
* [37. XML](#37-xml)
* [38. Desktop APIs](#38-desktop-apis)
* [39. Java API Documentation Navigation](#39-java-api-documentation-navigation)
* [40. How to Find Any Class](#40-how-to-find-any-class)
* [41. How to Find Any Method](#41-how-to-find-any-method)
* [42. How to Understand Inherited Methods](#42-how-to-understand-inherited-methods)
* [43. How to Read an API Page](#43-how-to-read-an-api-page)
* [44. Java Learning Priority](#44-java-learning-priority)

---

# 1. Java Platform Overview

```text
JAVA
│
├── LANGUAGE
│   │
│   ├── Classes
│   ├── Objects
│   ├── Interfaces
│   ├── Abstract Classes
│   ├── Inheritance
│   ├── Polymorphism
│   ├── Encapsulation
│   ├── Generics
│   ├── Enums
│   ├── Records
│   ├── Exceptions
│   ├── Annotations
│   ├── Lambda Expressions
│   └── Modules
│
└── STANDARD LIBRARY
    │
    ├── java.lang
    ├── java.util
    ├── java.io
    ├── java.nio
    ├── java.time
    ├── java.math
    ├── java.net
    ├── java.sql
    ├── java.security
    ├── java.lang.reflect
    ├── java.lang.annotation
    ├── java.util.concurrent
    ├── java.util.function
    ├── java.util.stream
    ├── java.util.regex
    ├── java.logging
    ├── java.xml
    └── many more
```

---

# 2. Fundamental Type Hierarchy

Java has several different kinds of types.

```text
JAVA TYPES
│
├── PRIMITIVE TYPES
│   │
│   ├── byte
│   ├── short
│   ├── int
│   ├── long
│   ├── float
│   ├── double
│   ├── char
│   └── boolean
│
├── REFERENCE TYPES
│   │
│   ├── Classes
│   ├── Interfaces
│   ├── Arrays
│   ├── Enums
│   ├── Records
│   └── Annotation Types
│
└── SPECIAL LANGUAGE TYPES
    │
    ├── void
    ├── null
    └── var
```

---

# 3. java.lang

`java.lang` contains the fundamental classes of Java.

```text
java.lang
│
├── Object
│
├── Class
├── String
├── StringBuilder
├── StringBuffer
│
├── Number
│   ├── Byte
│   ├── Short
│   ├── Integer
│   ├── Long
│   ├── Float
│   ├── Double
│   └── ...
│
├── Boolean
├── Character
│
├── Enum
├── Record
│
├── Math
├── StrictMath
├── System
├── Runtime
├── Runtime.Version
│
├── Thread
├── ThreadGroup
├── ThreadLocal
├── InheritableThreadLocal
│
├── Process
├── ProcessBuilder
│
├── Package
├── Module
│
├── Throwable
│
├── StackTraceElement
├── StackWalker
│
├── Exception
├── RuntimeException
│
├── Error
│
├── AssertionError
├── LinkageError
├── VirtualMachineError
│
├── AutoCloseable
├── Cloneable
├── Comparable
├── Iterable
├── Readable
├── Runnable
│
└── functional interfaces and language-support classes
```

---

# 4. Object Hierarchy

`Object` is the root superclass of all Java classes.

```text
Object
│
├── String
├── StringBuilder
├── StringBuffer
│
├── Number
│   ├── Byte
│   ├── Short
│   ├── Integer
│   ├── Long
│   ├── Float
│   ├── Double
│   └── ...
│
├── Throwable
│
├── Thread
├── ThreadGroup
│
├── Class-related runtime objects
│
├── Collections implementations
│   ├── ArrayList
│   ├── LinkedList
│   ├── HashSet
│   ├── TreeSet
│   ├── HashMap
│   ├── TreeMap
│   └── ...
│
├── I/O implementations
│   ├── File
│   ├── FileInputStream
│   ├── FileOutputStream
│   ├── BufferedReader
│   └── ...
│
├── Time API implementations
│   ├── LocalDate
│   ├── LocalTime
│   ├── LocalDateTime
│   └── ...
│
└── User-defined classes
    ├── Person
    ├── Student
    ├── Car
    └── ...
```

### Important distinction

```text
CLASS
│
└── ultimately extends Object

INTERFACE
│
└── does NOT extend Object

PRIMITIVE
│
└── does NOT extend Object

ARRAY
│
└── special JVM type
```

Reference arrays are objects and can therefore be assigned to `Object`.

---

# 5. Throwable Hierarchy

```text
Object
│
└── Throwable
    │
    ├── Error
    │   │
    │   ├── AssertionError
    │   │
    │   ├── LinkageError
    │   │   ├── BootstrapMethodError
    │   │   ├── ClassCircularityError
    │   │   ├── ClassFormatError
    │   │   ├── ExceptionInInitializerError
    │   │   ├── IncompatibleClassChangeError
    │   │   ├── NoClassDefFoundError
    │   │   ├── NoSuchFieldError
    │   │   ├── NoSuchMethodError
    │   │   ├── UnsatisfiedLinkError
    │   │   └── VerifyError
    │   │
    │   ├── VirtualMachineError
    │   │   ├── InternalError
    │   │   ├── OutOfMemoryError
    │   │   ├── StackOverflowError
    │   │   └── UnknownError
    │   │
    │   └── ThreadDeath
    │
    └── Exception
        │
        ├── RuntimeException
        │   │
        │   ├── ArithmeticException
        │   ├── ArrayStoreException
        │   ├── ClassCastException
        │   ├── ConcurrentModificationException
        │   ├── EmptyStackException
        │   ├── IllegalArgumentException
        │   │   ├── NumberFormatException
        │   │   └── ...
        │   │
        │   ├── IllegalCallerException
        │   ├── IllegalStateException
        │   ├── IndexOutOfBoundsException
        │   │   ├── ArrayIndexOutOfBoundsException
        │   │   └── StringIndexOutOfBoundsException
        │   │
        │   ├── NullPointerException
        │   ├── SecurityException
        │   ├── TypeNotPresentException
        │   ├── UnsupportedOperationException
        │   └── ...
        │
        ├── IOException
        │   ├── FileNotFoundException
        │   ├── EOFException
        │   ├── InterruptedIOException
        │   ├── ObjectStreamException
        │   │   ├── InvalidObjectException
        │   │   ├── NotSerializableException
        │   │   └── WriteAbortedException
        │   └── ...
        │
        ├── ReflectiveOperationException
        │   ├── ClassNotFoundException
        │   ├── IllegalAccessException
        │   ├── InstantiationException
        │   ├── InvocationTargetException
        │   └── NoSuchMethodException
        │
        ├── InterruptedException
        ├── CloneNotSupportedException
        ├── ClassNotFoundException
        ├── SQLException
        ├── ParseException
        └── ...
```

---

# 6. Number and Wrapper Classes

```text
Object
│
└── Number
    │
    ├── Byte
    ├── Short
    ├── Integer
    ├── Long
    ├── Float
    ├── Double
    ├── BigInteger
    └── BigDecimal
```

Primitive → Wrapper:

```text
byte      → Byte
short     → Short
int       → Integer
long      → Long
float     → Float
double    → Double
char      → Character
boolean   → Boolean
```

Other important numeric classes:

```text
java.math
│
├── BigInteger
└── BigDecimal
```

---

# 7. String Hierarchy

```text
Object
│
├── String
│
├── StringBuilder
│
└── StringBuffer
```

Interfaces associated with strings:

```text
CharSequence
│
├── String
├── StringBuilder
├── StringBuffer
└── ...
```

```text
String
│
├── CharSequence
├── Comparable<String>
├── Serializable
└── Constable
```

---

# 8. Enum Hierarchy

```text
Object
│
└── Enum<E>
    │
    ├── UserEnum
    ├── Thread.State
    ├── TimeUnit
    ├── DayOfWeek
    └── every user-defined enum
```

Conceptually:

```text
Object
   ↓
Enum<E>
   ↓
YourEnum
```

An enum cannot extend another class because every enum implicitly extends `Enum`.

Enums can implement interfaces.

---

# 9. java.util

```text
java.util
│
├── Collections Framework
│
├── ArrayList
├── LinkedList
├── Vector
├── Stack
│
├── HashSet
├── LinkedHashSet
├── TreeSet
├── EnumSet
│
├── PriorityQueue
├── ArrayDeque
│
├── HashMap
├── LinkedHashMap
├── TreeMap
├── Hashtable
├── WeakHashMap
├── IdentityHashMap
├── EnumMap
│
├── Iterator
├── ListIterator
├── Spliterator
│
├── Comparable
├── Comparator
│
├── Optional
├── OptionalInt
├── OptionalLong
├── OptionalDouble
│
├── Scanner
├── Arrays
├── Collections
├── Objects
├── UUID
├── Random
├── Formatter
├── StringJoiner
├── Base64
├── Properties
├── Locale
├── Currency
├── Date
├── Calendar
├── TimeZone
│
└── many utility classes
```

---

# 10. Collections Framework

```text
Iterable
│
└── Collection
    │
    ├── List
    │
    ├── Set
    │
    ├── Queue
    │
    └── SequencedCollection
```

Important:

```text
Map
```

is **NOT** a subtype of `Collection`.

Complete conceptual structure:

```text
Iterable
│
└── Collection
    │
    ├── List
    │   ├── ArrayList
    │   ├── LinkedList
    │   ├── Vector
    │   │   └── Stack
    │   └── CopyOnWriteArrayList
    │
    ├── Set
    │   ├── HashSet
    │   │   └── LinkedHashSet
    │   │
    │   ├── SortedSet
    │   │   └── NavigableSet
    │   │       └── TreeSet
    │   │
    │   ├── EnumSet
    │   └── ConcurrentSkipListSet
    │
    ├── Queue
    │   ├── PriorityQueue
    │   ├── Deque
    │   │   ├── ArrayDeque
    │   │   └── LinkedList
    │   │
    │   └── BlockingQueue
    │       ├── ArrayBlockingQueue
    │       ├── LinkedBlockingQueue
    │       ├── PriorityBlockingQueue
    │       ├── DelayQueue
    │       └── SynchronousQueue
    │
    └── SequencedCollection
```

---

# 11. List Hierarchy

```text
Iterable
│
└── Collection
    │
    └── List
        │
        ├── ArrayList
        │
        ├── LinkedList
        │
        ├── Vector
        │   └── Stack
        │
        └── CopyOnWriteArrayList
```

Abstract hierarchy:

```text
Object
│
├── AbstractCollection
│   │
│   └── AbstractList
│       ├── ArrayList
│       ├── LinkedList
│       └── Vector
│           └── Stack
```

Interfaces:

```text
Iterable
   ↓
Collection
   ↓
List
```

---

# 12. Set Hierarchy

```text
Collection
│
└── Set
    │
    ├── HashSet
    │   └── LinkedHashSet
    │
    ├── SortedSet
    │   └── NavigableSet
    │       └── TreeSet
    │
    ├── EnumSet
    │
    └── ConcurrentSkipListSet
```

Abstract hierarchy:

```text
Object
│
└── AbstractCollection
    │
    └── AbstractSet
        ├── HashSet
        └── TreeSet
```

---

# 13. Queue and Deque Hierarchy

```text
Collection
│
└── Queue
    │
    ├── PriorityQueue
    │
    ├── Deque
    │   │
    │   ├── ArrayDeque
    │   └── LinkedList
    │
    └── BlockingQueue
        │
        ├── ArrayBlockingQueue
        ├── LinkedBlockingQueue
        ├── PriorityBlockingQueue
        ├── DelayQueue
        └── SynchronousQueue
```

Other concurrent queues:

```text
Queue
│
├── ConcurrentLinkedQueue
└── ConcurrentLinkedDeque
```

---

# 14. Map Hierarchy

`Map` is separate from `Collection`.

```text
Map
│
├── HashMap
│   └── LinkedHashMap
│
├── SortedMap
│   └── NavigableMap
│       └── TreeMap
│
├── Hashtable
│
├── WeakHashMap
│
├── IdentityHashMap
│
├── EnumMap
│
├── ConcurrentMap
│   └── ConcurrentHashMap
│
└── ConcurrentNavigableMap
    └── ConcurrentSkipListMap
```

Abstract hierarchy:

```text
Object
│
└── AbstractMap
    │
    ├── HashMap
    │   └── LinkedHashMap
    │
    ├── TreeMap
    │
    ├── WeakHashMap
    │
    ├── IdentityHashMap
    │
    └── EnumMap
```

---

# 15. Iterator Hierarchy

```text
Iterator<E>
│
├── ListIterator<E>
│
└── Spliterator<T>
```

Conceptual usage:

```text
Iterable
   ↓
iterator()
   ↓
Iterator
```

For lists:

```text
List
   ↓
listIterator()
   ↓
ListIterator
```

---

# 16. Comparable and Comparator

These are separate interfaces.

```text
Comparable<T>
│
└── classes that define natural ordering
```

```text
Comparator<T>
│
└── external/custom ordering
```

Conceptually:

```text
Sorting
│
├── Comparable
│   └── object defines its natural ordering
│
└── Comparator
    └── separate object defines ordering
```

---

# 17. Optional Hierarchy

```text
java.util
│
├── Optional<T>
│
├── OptionalInt
│
├── OptionalLong
│
└── OptionalDouble
```

These are separate classes.

```text
Optional<T>
OptionalInt
OptionalLong
OptionalDouble
```

There is no inheritance relationship between them.

---

# 18. Array API

Arrays are special JVM-supported objects.

```text
ARRAY TYPES
│
├── byte[]
├── short[]
├── int[]
├── long[]
├── float[]
├── double[]
├── char[]
├── boolean[]
│
├── Object[]
├── String[]
├── Integer[]
├── MyClass[]
│
└── multidimensional arrays
    ├── int[][]
    ├── String[][]
    └── ...
```

Array utility class:

```text
java.lang.reflect
│
└── Array
```

Array helper methods:

```text
java.util
│
└── Arrays
```

Important distinction:

```text
int[]
│
└── JVM array type

java.lang.reflect.Array
│
└── reflection utility class

java.util.Arrays
│
└── array utility class
```

---

# 19. Utility Classes

```text
java.util
│
├── Arrays
├── Collections
├── Objects
├── Scanner
├── Formatter
├── UUID
├── Random
├── SplittableRandom
├── StringJoiner
├── Base64
├── Properties
├── Locale
├── Currency
├── ServiceLoader
└── ...
```

---

# 20. java.util.function

Functional interfaces:

```text
java.util.function
│
├── Function<T,R>
│   ├── UnaryOperator<T>
│   └── BinaryOperator<T>
│
├── BiFunction<T,U,R>
│
├── Predicate<T>
│   └── BiPredicate<T,U>
│
├── Consumer<T>
│   └── BiConsumer<T,U>
│
├── Supplier<T>
│
├── UnaryOperator<T>
├── BinaryOperator<T>
│
├── IntFunction<R>
├── LongFunction<R>
├── DoubleFunction<R>
│
├── IntPredicate
├── LongPredicate
├── DoublePredicate
│
├── IntConsumer
├── LongConsumer
├── DoubleConsumer
│
├── IntSupplier
├── LongSupplier
├── DoubleSupplier
│
└── primitive-specialized functional interfaces
```

---

# 21. java.util.stream

```text
java.util.stream
│
├── BaseStream<T,S>
│
├── Stream<T>
│
├── IntStream
│
├── LongStream
│
├── DoubleStream
│
├── Collector<T,A,R>
│
├── Collectors
│
├── StreamSupport
│
└── DoubleStream-specific / primitive stream APIs
```

Conceptual relationship:

```text
Collection
    ↓
stream()
    ↓
Stream<T>
```

Primitive streams:

```text
Stream<T>
│
├── IntStream
├── LongStream
└── DoubleStream
```

---

# 22. java.io

## Input

```text
Input
│
├── InputStream
│   │
│   ├── FileInputStream
│   ├── ByteArrayInputStream
│   ├── BufferedInputStream
│   ├── DataInputStream
│   ├── ObjectInputStream
│   └── FilterInputStream
│
└── Reader
    │
    ├── FileReader
    ├── BufferedReader
    ├── InputStreamReader
    ├── CharArrayReader
    ├── StringReader
    └── FilterReader
```

## Output

```text
Output
│
├── OutputStream
│   │
│   ├── FileOutputStream
│   ├── ByteArrayOutputStream
│   ├── BufferedOutputStream
│   ├── DataOutputStream
│   ├── ObjectOutputStream
│   └── FilterOutputStream
│
└── Writer
    │
    ├── FileWriter
    ├── BufferedWriter
    ├── OutputStreamWriter
    ├── CharArrayWriter
    ├── StringWriter
    ├── PrintWriter
    └── FilterWriter
```

Other important classes:

```text
java.io
│
├── File
├── FileDescriptor
├── RandomAccessFile
├── Console
├── PrintStream
├── PrintWriter
├── Serializable
├── Externalizable
└── ObjectStream*
```

---

# 23. java.nio

```text
java.nio
│
├── Buffer
│   ├── ByteBuffer
│   ├── CharBuffer
│   ├── ShortBuffer
│   ├── IntBuffer
│   ├── LongBuffer
│   ├── FloatBuffer
│   └── DoubleBuffer
│
├── ByteOrder
├── CharBuffer
└── ...
```

---

# 24. java.nio.file

Modern file API:

```text
java.nio.file
│
├── Path
├── Paths
├── Files
│
├── FileSystem
├── FileSystems
│
├── DirectoryStream
├── WatchService
├── WatchKey
├── WatchEvent
│
├── FileStore
│
├── StandardOpenOption
├── StandardCopyOption
├── StandardWatchEventKinds
│
├── FileVisitor<T>
├── SimpleFileVisitor<T>
│
└── ...
```

---

# 25. java.time

Modern date/time API:

```text
java.time
│
├── LocalDate
├── LocalTime
├── LocalDateTime
│
├── OffsetDateTime
├── OffsetTime
├── ZonedDateTime
│
├── Instant
│
├── Year
├── YearMonth
├── MonthDay
│
├── Month
├── DayOfWeek
│
├── Duration
├── Period
│
├── ZoneId
├── ZoneOffset
│
└── Clock
```

Formatting:

```text
java.time.format
│
├── DateTimeFormatter
├── DateTimeFormatterBuilder
└── ...
```

Temporal hierarchy:

```text
Temporal
│
├── LocalDate
├── LocalDateTime
├── OffsetDateTime
├── ZonedDateTime
└── ...
```

---

# 26. java.math

```text
java.math
│
├── Number
│
├── BigInteger
│
└── BigDecimal
```

Conceptually:

```text
Object
│
└── Number
    ├── Integer
    ├── Long
    ├── Double
    ├── ...
    ├── BigInteger
    └── BigDecimal
```

---

# 27. java.util.regex

```text
java.util.regex
│
├── Pattern
├── Matcher
├── MatchResult
└── PatternSyntaxException
```

Conceptual:

```text
Regular Expression
│
├── Pattern
│
└── Matcher
```

---

# 28. java.net

```text
java.net
│
├── URI
├── URL
├── URLConnection
│
├── InetAddress
├── Inet4Address
├── Inet6Address
│
├── Socket
├── ServerSocket
│
├── DatagramSocket
├── DatagramPacket
│
├── Proxy
├── CookieHandler
├── CookieManager
│
└── ...
```

Modern HTTP:

```text
java.net.http
│
├── HttpClient
├── HttpRequest
├── HttpResponse
├── HttpHeaders
├── WebSocket
└── ...
```

---

# 29. java.sql

JDBC hierarchy:

```text
java.sql
│
├── Driver
│
├── Connection
│
├── Statement
│   │
│   ├── PreparedStatement
│   │
│   └── CallableStatement
│
├── ResultSet
│
├── DatabaseMetaData
├── ResultSetMetaData
│
├── Savepoint
├── SQLWarning
│
├── Types
├── Date
├── Time
├── Timestamp
│
└── SQLException
```

Typical conceptual hierarchy:

```text
Driver
   ↓
Connection
   ↓
Statement
   ├── Statement
   ├── PreparedStatement
   └── CallableStatement
   ↓
ResultSet
```

---

# 30. Reflection

```text
java.lang
│
└── Class<T>
```

Reflection APIs:

```text
java.lang.reflect
│
├── AccessibleObject
│   ├── Field
│   ├── Method
│   └── Constructor<T>
│
├── Modifier
├── Array
├── Proxy
├── InvocationHandler
├── Executable
│   ├── Method
│   └── Constructor
│
└── Parameter
```

Related:

```text
Class
│
├── getFields()
├── getMethods()
├── getConstructors()
├── getDeclaredFields()
├── getDeclaredMethods()
└── getDeclaredConstructors()
```

---

# 31. Annotations

```text
java.lang.annotation
│
├── Annotation
├── Documented
├── Inherited
├── Native
├── Repeatable
├── Retention
├── Target
└── ElementType
```

Annotation concepts:

```text
Annotation
│
├── @Override
├── @Deprecated
├── @SuppressWarnings
├── @FunctionalInterface
├── @SafeVarargs
└── custom annotations
```

---

# 32. Concurrency

## java.lang

```text
Object
│
└── Thread
```

Interfaces:

```text
Runnable
Callable<V>
```

## java.util.concurrent

```text
java.util.concurrent
│
├── Executor
│   └── ExecutorService
│       └── ScheduledExecutorService
│
├── Executors
│
├── Future<V>
│
├── FutureTask<V>
│
├── CompletableFuture<T>
│
├── CompletionStage<T>
│
├── Callable<V>
│
├── Lock
│   ├── ReentrantLock
│   └── ReadWriteLock
│       └── ReentrantReadWriteLock
│
├── Condition
│
├── Semaphore
├── CountDownLatch
├── CyclicBarrier
├── Phaser
├── Exchanger
│
├── BlockingQueue<E>
│   ├── ArrayBlockingQueue
│   ├── LinkedBlockingQueue
│   ├── PriorityBlockingQueue
│   ├── DelayQueue
│   └── SynchronousQueue
│
└── concurrent collections
```

---

# 33. Atomic Classes

```text
java.util.concurrent.atomic
│
├── AtomicBoolean
├── AtomicInteger
├── AtomicLong
│
├── AtomicIntegerArray
├── AtomicLongArray
├── AtomicReferenceArray
│
├── AtomicReference<T>
│
├── AtomicMarkableReference
├── AtomicStampedReference
│
├── LongAdder
├── DoubleAdder
├── LongAccumulator
└── DoubleAccumulator
```

---

# 34. Concurrent Collections

```text
java.util.concurrent
│
├── ConcurrentHashMap
│
├── ConcurrentLinkedQueue
├── ConcurrentLinkedDeque
│
├── CopyOnWriteArrayList
├── CopyOnWriteArraySet
│
├── ConcurrentSkipListMap
└── ConcurrentSkipListSet
```

Map relationships:

```text
Map
│
└── ConcurrentMap
    │
    └── ConcurrentHashMap
```

Sorted concurrent structures:

```text
ConcurrentMap
│
└── ConcurrentNavigableMap
    │
    └── ConcurrentSkipListMap
```

---

# 35. Security

```text
java.security
│
├── MessageDigest
├── Signature
├── Key
│   ├── PublicKey
│   └── PrivateKey
│
├── KeyPair
├── KeyPairGenerator
├── KeyFactory
├── SecureRandom
├── Security
│
└── ...
```

---

# 36. Logging

```text
java.util.logging
│
├── Logger
├── Level
├── Handler
│   ├── ConsoleHandler
│   ├── FileHandler
│   └── StreamHandler
│
├── Formatter
│   ├── SimpleFormatter
│   └── XMLFormatter
│
└── LogRecord
```

---

# 37. XML

```text
java.xml
│
├── javax.xml
│
├── DOM
│
├── SAX
│
├── StAX
│
├── XPath
│
├── XSLT
│
└── XML parsing / transformation APIs
```

---

# 38. Desktop APIs

```text
java.desktop
│
├── java.awt
│   ├── Component
│   ├── Container
│   ├── Window
│   ├── Frame
│   ├── Dialog
│   └── ...
│
├── java.awt.event
│
├── java.awt.image
│
└── javax.swing
    │
    ├── JComponent
    ├── JFrame
    ├── JPanel
    ├── JButton
    ├── JLabel
    ├── JTextField
    ├── JTable
    └── ...
```

---

# 39. Java API Documentation Navigation

The most important skill is not memorizing the tree.

It is knowing how to **navigate the documentation**.

The official Java API documentation is organized approximately as:

```text
Java SE Documentation
│
├── Modules
│
├── Packages
│
├── Classes
│
├── Interfaces
│
├── Enums
│
├── Exceptions
│
├── Annotations
│
└── Individual API members
    │
    ├── Constructors
    ├── Methods
    ├── Fields
    └── Nested Classes
```

---

# 40. How to Find Any Class

Suppose you want to know about:

```text
ArrayList
```

Search:

```text
Java ArrayList official documentation
```

Prefer:

```text
site:docs.oracle.com ArrayList Java
```

You should reach:

```text
java.util.ArrayList
```

Then inspect:

```text
ArrayList
│
├── Package
│   └── java.util
│
├── Class declaration
│
├── Superclass
│
├── Interfaces
│
├── Implemented interfaces
│
├── Constructors
│
├── Methods
│
├── Fields
│
└── Inherited members
```

---

# 41. How to Find Any Method

Suppose you want:

```text
ArrayList add method
```

Search:

```text
Java ArrayList add official documentation
```

Or:

```text
site:docs.oracle.com/en/java/javase ArrayList add
```

Then open:

```text
java.util.ArrayList
```

Find:

```text
Method Summary
```

You will see methods such as:

```text
add(E)
add(int, E)
addAll(Collection)
addAll(int, Collection)
```

Then open the specific method.

You can inspect:

```text
Method
│
├── Modifier
├── Return type
├── Method name
├── Parameters
├── Type parameters
├── Throws
├── Description
└── Since
```

---

# 42. How to Understand Inherited Methods

This is extremely important.

Suppose:

```java
ArrayList<String> list = new ArrayList<>();
```

You may see methods on the `ArrayList` documentation that it does not directly declare.

Conceptually:

```text
ArrayList
   ↓
AbstractList
   ↓
AbstractCollection
   ↓
Object
```

And interfaces:

```text
ArrayList
   │
   ├── List
   ├── Collection
   ├── Iterable
   └── ...
```

Therefore methods can come from:

```text
ArrayList
│
├── declared directly by ArrayList
│
├── inherited from AbstractList
│
├── inherited from AbstractCollection
│
├── inherited from Object
│
└── default methods from interfaces
```

When reading documentation, distinguish:

```text
DECLARED METHODS
        ↓
methods written by this class

INHERITED METHODS
        ↓
methods obtained from superclass/interfaces
```

---

# 43. How to Read an API Page

When opening any Java class documentation, inspect it in this order:

```text
1. PACKAGE
      ↓
2. CLASS / INTERFACE NAME
      ↓
3. CLASS DECLARATION
      ↓
4. SUPERCLASS
      ↓
5. IMPLEMENTED INTERFACES
      ↓
6. TYPE PARAMETERS
      ↓
7. NESTED CLASSES
      ↓
8. FIELDS
      ↓
9. CONSTRUCTORS
      ↓
10. METHODS
      ↓
11. INHERITED METHODS
```

For example:

```text
java.util.ArrayList<E>

Superclass:
    AbstractList<E>

Interfaces:
    List<E>
    RandomAccess
    Cloneable
    Serializable
```

This immediately tells you where the class sits in the hierarchy.

---

# 44. How to Find the Parent of a Class

Search:

```text
Java <ClassName> official documentation
```

Then look for:

```text
Class <ClassName>

java.lang.Object
    ↓
<ParentClass>
    ↓
<ClassName>
```

For example:

```text
Object
   ↓
Number
   ↓
Integer
```

---

# 45. How to Find What a Class Implements

Look at the declaration:

```text
ArrayList<E>
    extends AbstractList<E>
    implements List<E>, RandomAccess, Cloneable, Serializable
```

This tells you:

```text
Superclass:
    AbstractList

Interfaces:
    List
    RandomAccess
    Cloneable
    Serializable
```

---

# 46. How to Find All Subclasses

On an API documentation page, look for:

```text
Direct Known Subclasses
```

or:

```text
Direct Subclasses
```

Conceptually:

```text
Number
│
├── Byte
├── Short
├── Integer
├── Long
├── Float
└── Double
```

---

# 47. How to Find All Implementations of an Interface

For:

```text
List
```

look for:

```text
All Known Implementing Classes
```

You can then see implementations such as:

```text
List
│
├── ArrayList
├── LinkedList
├── Vector
└── ...
```

For:

```text
Map
```

you can find:

```text
Map
│
├── HashMap
├── TreeMap
├── LinkedHashMap
├── Hashtable
└── ...
```

---

# 48. How to Search for a Method by Concept

Don't always search the exact method name.

For example, if you want to know:

```text
How do I check whether an ArrayList contains an element?
```

Search:

```text
Java ArrayList check contains element
```

Then identify:

```text
contains(Object)
```

If you already know the method name:

```text
site:docs.oracle.com ArrayList contains
```

This is generally faster.

---

# 49. How to Search for a Constructor

Search:

```text
Java ArrayList constructor official documentation
```

Then:

```text
Constructor Summary
```

For example:

```text
ArrayList()
ArrayList(int)
ArrayList(Collection<? extends E>)
```

Constructor documentation tells you:

```text
constructor name
parameters
visibility
description
exceptions
```

---

# 50. How to Search for a Field

Search:

```text
Java <ClassName> field official documentation
```

Then inspect:

```text
Field Summary
```

Fields are generally divided into:

```text
Declared Fields
        +
Inherited Fields
```

---

# 51. How to Search by Package

If you know the package:

```text
java.util
```

search:

```text
Java java.util package official documentation
```

You can then explore:

```text
java.util
│
├── Classes
├── Interfaces
├── Enums
├── Exceptions
└── Annotations
```

This is useful when you know the category but don't know the exact class.

---

# 52. How to Search the Entire Java API

Use searches such as:

```text
site:docs.oracle.com/en/java/javase/25/docs/api/java.base
```

or:

```text
site:docs.oracle.com/en/java/javase/25/docs/api
```

Then narrow down:

```text
class name
method name
package name
interface name
exception name
```

---

# 53. Documentation Search Strategy

Use this decision tree:

```text
I NEED SOMETHING
│
├── Know the class?
│   │
│   └── Search:
│       "<ClassName> Java API"
│
├── Know the method?
│   │
│   └── Search:
│       "<ClassName> <methodName> Java API"
│
├── Know the concept but not class?
│   │
│   └── Search:
│       "Java <concept> API"
│
├── Know the package?
│   │
│   └── Open package documentation
│
├── Need parent?
│   │
│   └── Open class → superclass
│
├── Need implementations?
│   │
│   └── Open interface → implementing classes
│
├── Need subclasses?
│   │
│   └── Open class → subclasses
│
└── Need inherited method?
    │
    └── Follow superclass/interface hierarchy
```

---

# 54. Class Hierarchy vs Interface Hierarchy

Never mix these two.

## Class inheritance

```text
Object
   ↓
Number
   ↓
Integer
```

Relationship:

```text
Integer extends Number
Number extends Object
```

## Interface inheritance

```text
Iterable
   ↓
Collection
   ↓
List
```

Relationship:

```text
Collection extends Iterable
List extends Collection
```

## Class implementing interface

```text
ArrayList
   │
   └── implements List
```

Therefore:

```text
extends
│
└── class → superclass
    interface → parent interface

implements
│
└── class → interface
```

---

# 55. The Three Relationships You Must Understand

```text
                 JAVA TYPE RELATIONSHIPS
                           │
             ┌─────────────┼─────────────┐
             │             │             │
          EXTENDS       IMPLEMENTS    INSTANCE OF
             │             │             │
             ↓             ↓             ↓
        inheritance    interface      object/type
```

Example:

```text
ArrayList
│
├── extends AbstractList
│
├── implements List
│
├── implements RandomAccess
│
├── implements Cloneable
│
└── implements Serializable
```

---

# 56. Important Abstract Classes

```text
Abstract Classes
│
├── AbstractCollection
│
├── AbstractList
│
├── AbstractSequentialList
│
├── AbstractSet
│
├── AbstractQueue
│
├── AbstractMap
│
├── InputStream
├── OutputStream
├── Reader
├── Writer
│
└── many framework-specific abstract classes
```

---

# 57. Important Interfaces

```text
Core Interfaces
│
├── Iterable
├── Collection
├── List
├── Set
├── Queue
├── Deque
├── Map
│
├── Iterator
├── ListIterator
├── Spliterator
│
├── Comparable
├── Comparator
│
├── Runnable
├── Callable
├── AutoCloseable
├── Closeable
├── Cloneable
├── Serializable
│
├── Function
├── Predicate
├── Consumer
├── Supplier
│
├── Stream
├── Collector
│
├── Executor
├── ExecutorService
├── Future
├── CompletionStage
├── Lock
│
└── many specialized interfaces
```

---

# 58. Major Java Packages — Master Map

```text
JAVA SE
│
├── java.base
│   │
│   ├── java.lang
│   ├── java.util
│   ├── java.io
│   ├── java.nio
│   ├── java.nio.file
│   ├── java.time
│   ├── java.math
│   ├── java.net
│   ├── java.lang.reflect
│   ├── java.lang.annotation
│   ├── java.util.concurrent
│   ├── java.util.function
│   ├── java.util.stream
│   └── ...
│
├── java.sql
│
├── java.xml
│
├── java.desktop
│
├── java.logging
│
├── java.management
│
├── java.naming
│
├── java.rmi
│
├── java.security.jgss
│
├── java.security.sasl
│
├── java.instrument
│
├── java.compiler
│
├── java.net.http
│
├── java.prefs
│
├── jdk.httpserver
│
└── other JDK modules
```

---

# 59. Core Java Learning Hierarchy

For learning purposes, prioritize the API in this order:

```text
CORE JAVA
│
├── java.lang
│   │
│   ├── Object ⭐⭐⭐⭐⭐
│   ├── String ⭐⭐⭐⭐⭐
│   ├── StringBuilder ⭐⭐⭐⭐
│   ├── StringBuffer ⭐⭐⭐
│   ├── Number ⭐⭐⭐⭐
│   ├── Integer ⭐⭐⭐⭐⭐
│   ├── Math ⭐⭐⭐⭐
│   ├── System ⭐⭐⭐⭐⭐
│   ├── Class ⭐⭐⭐⭐
│   ├── Enum ⭐⭐⭐⭐
│   └── Throwable ⭐⭐⭐⭐⭐
│
├── java.util
│   │
│   ├── Collections ⭐⭐⭐⭐⭐
│   ├── ArrayList ⭐⭐⭐⭐⭐
│   ├── LinkedList ⭐⭐⭐⭐
│   ├── HashSet ⭐⭐⭐⭐⭐
│   ├── TreeSet ⭐⭐⭐⭐
│   ├── HashMap ⭐⭐⭐⭐⭐
│   ├── LinkedHashMap ⭐⭐⭐⭐
│   ├── TreeMap ⭐⭐⭐⭐
│   ├── Queue ⭐⭐⭐⭐
│   ├── Deque ⭐⭐⭐⭐
│   ├── Iterator ⭐⭐⭐⭐⭐
│   ├── Comparable ⭐⭐⭐⭐⭐
│   ├── Comparator ⭐⭐⭐⭐⭐
│   ├── Optional ⭐⭐⭐⭐
│   ├── Arrays ⭐⭐⭐⭐⭐
│   ├── Objects ⭐⭐⭐⭐
│   └── Scanner ⭐⭐⭐⭐
│
├── java.util.function
│   ├── Function ⭐⭐⭐⭐⭐
│   ├── Predicate ⭐⭐⭐⭐⭐
│   ├── Consumer ⭐⭐⭐⭐⭐
│   └── Supplier ⭐⭐⭐⭐⭐
│
├── java.util.stream
│   ├── Stream ⭐⭐⭐⭐⭐
│   ├── Collectors ⭐⭐⭐⭐⭐
│   ├── IntStream ⭐⭐⭐⭐
│   ├── LongStream ⭐⭐⭐⭐
│   └── DoubleStream ⭐⭐⭐⭐
│
├── java.io
│   ├── File ⭐⭐⭐⭐
│   ├── InputStream ⭐⭐⭐⭐
│   ├── OutputStream ⭐⭐⭐⭐
│   ├── Reader ⭐⭐⭐⭐
│   └── Writer ⭐⭐⭐⭐
│
├── java.nio.file
│   ├── Path ⭐⭐⭐⭐⭐
│   └── Files ⭐⭐⭐⭐⭐
│
├── java.time
│   ├── LocalDate ⭐⭐⭐⭐⭐
│   ├── LocalTime ⭐⭐⭐⭐
│   ├── LocalDateTime ⭐⭐⭐⭐⭐
│   ├── ZonedDateTime ⭐⭐⭐⭐
│   └── DateTimeFormatter ⭐⭐⭐⭐⭐
│
├── java.util.concurrent
│   ├── Thread ⭐⭐⭐⭐⭐
│   ├── ExecutorService ⭐⭐⭐⭐⭐
│   ├── Future ⭐⭐⭐⭐
│   ├── CompletableFuture ⭐⭐⭐⭐⭐
│   ├── Lock ⭐⭐⭐⭐
│   └── ConcurrentHashMap ⭐⭐⭐⭐⭐
│
├── java.net
│   ├── URI ⭐⭐⭐⭐
│   ├── URL ⭐⭐⭐
│   ├── Socket ⭐⭐⭐
│   └── HttpClient ⭐⭐⭐⭐
│
├── java.sql
│   ├── Connection ⭐⭐⭐⭐⭐
│   ├── PreparedStatement ⭐⭐⭐⭐⭐
│   └── ResultSet ⭐⭐⭐⭐⭐
│
└── Reflection / Annotations
    ├── Class ⭐⭐⭐⭐
    ├── Method ⭐⭐⭐
    ├── Field ⭐⭐⭐
    └── Annotation ⭐⭐⭐
```

---

# 60. The Ultimate Mental Model

Do NOT memorize Java like this:

```text
"ArrayList has 40 methods.
HashMap has 50 methods.
String has 70 methods.
Scanner has 30 methods..."
```

Instead remember:

```text
JAVA
│
└── TYPES
    │
    ├── CLASS
    │   │
    │   └── Object
    │
    ├── INTERFACE
    │   │
    │   └── contracts
    │
    ├── ARRAY
    │
    ├── ENUM
    │
    └── RECORD
```

Then:

```text
Object
│
├── String
├── Number
├── Throwable
├── Thread
├── Collections
├── I/O classes
├── Time classes
└── YOUR CLASSES
```

Then:

```text
INTERFACES
│
├── Iterable
│   └── Collection
│       ├── List
│       ├── Set
│       └── Queue
│
├── Map
│
├── Comparable
├── Comparator
│
├── Runnable
├── Callable
│
├── Function
├── Predicate
├── Consumer
└── Supplier
```

Then:

```text
IMPLEMENTATIONS
│
├── ArrayList
├── LinkedList
├── HashSet
├── TreeSet
├── HashMap
├── TreeMap
├── PriorityQueue
├── ArrayDeque
└── ...
```

---

# 61. The Rule for Learning Java APIs

```text
LEARN
│
├── What the class represents
├── Where it belongs
├── What it extends
├── What it implements
├── When to use it
└── Important/common methods
       │
       └── learn from documentation
```

Do NOT attempt:

```text
MEMORIZE
│
├── every method
├── every overload
├── every constructor
├── every field
└── every obscure class
```

---

# 62. Documentation Workflow

Whenever you encounter an unfamiliar Java class:

```text
UNKNOWN CLASS
     │
     ↓
Find official API documentation
     │
     ↓
Check PACKAGE
     │
     ↓
Check SUPERCLASS
     │
     ↓
Check IMPLEMENTED INTERFACES
     │
     ↓
Check CONSTRUCTORS
     │
     ↓
Check METHOD SUMMARY
     │
     ↓
Check INHERITED METHODS
     │
     ↓
Open the specific method
     │
     ↓
Read PARAMETERS
     │
     ↓
Read RETURN TYPE
     │
     ↓
Read EXCEPTIONS
     │
     ↓
Read DESCRIPTION
```

---

# 63. The One Thing You Should Remember

```text
                 JAVA API
                    │
                    ↓
             DON'T MEMORIZE IT
                    │
                    ↓
             UNDERSTAND THE MAP
                    │
                    ↓
        KNOW WHERE THINGS BELONG
                    │
                    ↓
       KNOW HOW THEY ARE RELATED
                    │
                    ↓
          USE DOCUMENTATION
                    │
                    ↓
             FIND THE METHOD
                    │
                    ↓
             READ THE CONTRACT
                    │
                    ↓
                 USE IT
```

The goal of learning Java is **not** to have every Java method stored in your brain.

The goal is to reach the point where you can see:

```java
ArrayList<String> list;
```

and immediately understand:

```text
ArrayList
│
├── java.util
│
├── extends AbstractList
│
├── implements List
├── implements RandomAccess
├── implements Cloneable
├── implements Serializable
│
└── ultimately extends Object
```

Then, if you need a method you don't remember:

```text
"I need something that removes an element."
             ↓
ArrayList documentation
             ↓
Method Summary
             ↓
remove(...)
             ↓
Read exact overload
             ↓
Use it
```

That is **how you should work with the Java API**.

---

# 64. Final Java Hierarchy

```text
JAVA
│
├── LANGUAGE
│   │
│   ├── Object
│   ├── Classes
│   ├── Interfaces
│   ├── Abstract Classes
│   ├── Inheritance
│   ├── Polymorphism
│   ├── Generics
│   ├── Exceptions
│   ├── Enums
│   ├── Records
│   ├── Lambda
│   ├── Annotations
│   └── Threads
│
└── STANDARD API
    │
    ├── java.lang
    │   ├── Object
    │   ├── String
    │   ├── Number
    │   ├── Throwable
    │   ├── Thread
    │   ├── Class
    │   └── ...
    │
    ├── java.util
    │   ├── Collections
    │   │   ├── List
    │   │   │   ├── ArrayList
    │   │   │   ├── LinkedList
    │   │   │   └── Vector
    │   │   │
    │   │   ├── Set
    │   │   │   ├── HashSet
    │   │   │   └── TreeSet
    │   │   │
    │   │   └── Queue
    │   │       ├── PriorityQueue
    │   │       └── Deque
    │   │           └── ArrayDeque
    │   │
    │   ├── Map
    │   │   ├── HashMap
    │   │   ├── LinkedHashMap
    │   │   └── TreeMap
    │   │
    │   ├── Iterator
    │   ├── Comparable
    │   ├── Comparator
    │   ├── Optional
    │   ├── Arrays
    │   ├── Collections
    │   ├── Objects
    │   └── Scanner
    │
    ├── java.util.function
    │   ├── Function
    │   ├── Predicate
    │   ├── Consumer
    │   └── Supplier
    │
    ├── java.util.stream
    │   ├── Stream
    │   ├── IntStream
    │   ├── LongStream
    │   ├── DoubleStream
    │   └── Collectors
    │
    ├── java.io
    │   ├── InputStream
    │   ├── OutputStream
    │   ├── Reader
    │   ├── Writer
    │   └── File
    │
    ├── java.nio
    │   ├── Buffer
    │   └── ByteBuffer
    │
    ├── java.nio.file
    │   ├── Path
    │   └── Files
    │
    ├── java.time
    │   ├── LocalDate
    │   ├── LocalTime
    │   ├── LocalDateTime
    │   ├── ZonedDateTime
    │   ├── Instant
    │   ├── Duration
    │   └── Period
    │
    ├── java.math
    │   ├── BigInteger
    │   └── BigDecimal
    │
    ├── java.util.regex
    │   ├── Pattern
    │   └── Matcher
    │
    ├── java.net
    │   ├── URI
    │   ├── URL
    │   ├── Socket
    │   └── HttpClient
    │
    ├── java.sql
    │   ├── Connection
    │   ├── Statement
    │   ├── PreparedStatement
    │   └── ResultSet
    │
    ├── java.util.concurrent
    │   ├── ExecutorService
    │   ├── Future
    │   ├── CompletableFuture
    │   ├── Lock
    │   ├── ConcurrentHashMap
    │   └── BlockingQueue
    │
    ├── java.lang.reflect
    │   ├── Class
    │   ├── Method
    │   ├── Field
    │   └── Constructor
    │
    ├── java.lang.annotation
    │   ├── Annotation
    │   ├── Retention
    │   └── Target
    │
    ├── java.security
    │
    ├── java.logging
    │
    ├── java.xml
    │
    └── java.desktop
```

---

# Reference Principle

```text
                 KNOW THE HIERARCHY
                         ↓
                 KNOW THE PACKAGE
                         ↓
                 KNOW THE CLASS
                         ↓
                KNOW THE RELATIONSHIP
                         ↓
              KNOW WHERE TO LOOK
                         ↓
               READ THE DOCUMENTATION
                         ↓
                  FIND THE METHOD
                         ↓
                     USE IT
```

**You are not expected to memorize the Java Standard Library.**

**You are expected to know how to navigate it.**
