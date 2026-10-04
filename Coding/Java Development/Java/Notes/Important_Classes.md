# Java Standard Library Type Hierarchy Reference

## Master Directory

```text
JAVA STANDARD LIBRARY
│
├── 1. Core Language & Runtime (java.lang)
├── 2. Collections Framework (java.util)
├── 3. Utilities & Data Holders (java.util)
├── 4. Functional Programming (java.util.function)
├── 5. Stream API (java.util.stream)
├── 6. Concurrency Utilities (java.util.concurrent)
├── 7. Locks & Atomic Variables (java.util.concurrent.locks / atomic)
├── 8. Date & Time API (java.time)
├── 9. Standard I/O (java.io)
├── 10. Non-blocking I/O & File NIO.2 (java.nio)
├── 11. Networking & HTTP Client (java.net / java.net.http)
├── 12. Database Connectivity (java.sql / javax.sql)
├── 13. Reflection & Dynamic Proxies (java.lang.reflect)
├── 14. Annotations (java.lang.annotation)
├── 15. Arbitrary-Precision Math (java.math)
├── 16. Regular Expressions (java.util.regex)
├── 17. Security & Cryptography (java.security / javax.crypto)
├── 18. Logging API (java.util.logging)
├── 19. Archiving & Compression (java.util.zip / java.util.jar)
├── 20. XML Processing (javax.xml)
├── 21. Management & Monitoring (java.lang.management)
├── 22. JavaBeans & Introspection (java.beans)
├── 23. JNDI Naming (javax.naming)
├── 24. Instrumentation (java.lang.instrument)
└── 25. Specialized / Desktop / Legacy (java.awt / javax.swing / java.rmi)

```

---

## Legend

* `[I]` : Interface
* `[C]` : Concrete Class
* `[A]` : Abstract Class
* `[E]` : Enum
* `[R]` : Record
* `⭐⭐⭐⭐⭐` : Essential / Universal
* `⭐⭐⭐⭐` : Frequently Used
* `⭐⭐⭐` : Common / Practical
* `⭐⭐` : Specialized / Domain-Specific
* `⭐` : Legacy / Niche

---

## 1. Core Language & Runtime (`java.lang`)

### Root & Fundamental Types

```text
[C] Object ⭐⭐⭐⭐⭐
├── [C] Class<T> ⭐⭐⭐⭐⭐
├── [C] String ⭐⭐⭐⭐⭐
├── [C] StringBuilder ⭐⭐⭐⭐⭐
├── [C] StringBuffer ⭐⭐⭐
├── [C] Math ⭐⭐⭐⭐⭐
├── [C] StrictMath ⭐⭐
├── [C] System ⭐⭐⭐⭐⭐
├── [C] Runtime ⭐⭐⭐⭐
├── [C] Process ⭐⭐⭐
├── [C] ProcessBuilder ⭐⭐⭐⭐
├── [C] Thread ⭐⭐⭐⭐⭐
├── [C] ThreadLocal<T> ⭐⭐⭐⭐
├── [C] InheritableThreadLocal<T> ⭐⭐
├── [C] ClassLoader ⭐⭐⭐
├── [C] Module ⭐⭐
├── [C] Package ⭐⭐
├── [C] StackWalker ⭐⭐⭐
└── [C] Record ⭐⭐⭐⭐

```

### Primitive Wrappers & Numbers

```text
[C] Object
├── [C] Boolean ⭐⭐⭐⭐⭐
├── [C] Character ⭐⭐⭐⭐
├── [C] Void ⭐⭐
└── [A] Number ⭐⭐⭐⭐⭐
    ├── [C] Byte ⭐⭐⭐
    ├── [C] Short ⭐⭐⭐
    ├── [C] Integer ⭐⭐⭐⭐⭐
    ├── [C] Long ⭐⭐⭐⭐⭐
    ├── [C] Float ⭐⭐⭐
    └── [C] Double ⭐⭐⭐⭐⭐

```

### Core Interfaces

```text
[I] CharSequence ⭐⭐⭐⭐⭐
[I] Comparable<T> ⭐⭐⭐⭐⭐
[I] Cloneable ⭐⭐⭐
[I] AutoCloseable ⭐⭐⭐⭐⭐
[I] Runnable ⭐⭐⭐⭐⭐
[I] Iterable<T> ⭐⭐⭐⭐⭐
[I] Readable ⭐⭐
[I] Appendable ⭐⭐
[I] ProcessHandle ⭐⭐

```

### Enums & Base Enumeration

```text
[A] Enum<E> ⭐⭐⭐⭐⭐
[E] Thread.State ⭐⭐⭐

```

### Throwable & Exception Hierarchy

```text
[C] Object
└── [C] Throwable ⭐⭐⭐⭐⭐
    ├── [C] Exception ⭐⭐⭐⭐⭐
    │   ├── [C] CloneNotSupportedException ⭐⭐
    │   ├── [C] InterruptedException ⭐⭐⭐⭐
    │   ├── [C] ReflectiveOperationException ⭐⭐⭐
    │   │   ├── [C] ClassNotFoundException ⭐⭐⭐
    │   │   ├── [C] NoSuchMethodException ⭐⭐⭐
    │   │   ├── [C] NoSuchFieldException ⭐⭐⭐
    │   │   └── [C] IllegalAccessException ⭐⭐⭐
    │   └── [C] RuntimeException (Unchecked) ⭐⭐⭐⭐⭐
    │       ├── [C] NullPointerException ⭐⭐⭐⭐⭐
    │       ├── [C] IllegalArgumentException ⭐⭐⭐⭐⭐
    │       │   └── [C] NumberFormatException ⭐⭐⭐⭐
    │       ├── [C] IllegalStateException ⭐⭐⭐⭐⭐
    │       ├── [C] IndexOutOfBoundsException ⭐⭐⭐⭐
    │       │   ├── [C] ArrayIndexOutOfBoundsException ⭐⭐⭐⭐
    │       │   └── [C] StringIndexOutOfBoundsException ⭐⭐⭐
    │       ├── [C] UnsupportedOperationException ⭐⭐⭐⭐⭐
    │       ├── [C] ClassCastException ⭐⭐⭐⭐
    │       ├── [C] ArithmeticException ⭐⭐⭐
    │       ├── [C] SecurityException ⭐⭐
    │       └── [C] NoSuchElementException ⭐⭐⭐
    └── [C] Error ⭐⭐⭐
        ├── [C] VirtualMachineError ⭐⭐
        │   ├── [C] OutOfMemoryError ⭐⭐⭐⭐
        │   └── [C] StackOverflowError ⭐⭐⭐⭐
        ├── [C] LinkageError ⭐⭐
        │   ├── [C] NoClassDefFoundError ⭐⭐⭐⭐
        │   └── [C] UnsatisfiedLinkError ⭐⭐
        └── [C] AssertionError ⭐⭐⭐

```

---

## 2. Collections Framework (`java.util`)

### Collection Hierarchy

```text
[I] Iterable<T>
└── [I] Collection<E> ⭐⭐⭐⭐⭐
    ├── [I] List<E> ⭐⭐⭐⭐⭐
    │   ├── [C] ArrayList<E> ⭐⭐⭐⭐⭐
    │   ├── [C] LinkedList<E> ⭐⭐⭐⭐
    │   └── [C] Vector<E> (Legacy) ⭐
    │       └── [C] Stack<E> (Legacy) ⭐
    ├── [I] Set<E> ⭐⭐⭐⭐⭐
    │   ├── [C] HashSet<E> ⭐⭐⭐⭐⭐
    │   ├── [C] LinkedHashSet<E> ⭐⭐⭐⭐
    │   ├── [A] EnumSet<E> ⭐⭐⭐
    │   └── [I] SortedSet<E> ⭐⭐⭐
    │       └── [I] NavigableSet<E> ⭐⭐⭐⭐
    │           └── [C] TreeSet<E> ⭐⭐⭐⭐
    └── [I] Queue<E> ⭐⭐⭐⭐
        ├── [C] PriorityQueue<E> ⭐⭐⭐⭐
        └── [I] Deque<E> ⭐⭐⭐⭐⭐
            ├── [C] ArrayDeque<E> ⭐⭐⭐⭐⭐
            └── [C] LinkedList<E> ⭐⭐⭐⭐

```

### Map Hierarchy (Independent from Collection)

```text
[I] Map<K, V> ⭐⭐⭐⭐⭐
├── [C] HashMap<K, V> ⭐⭐⭐⭐⭐
├── [C] LinkedHashMap<K, V> ⭐⭐⭐⭐⭐
├── [C] IdentityHashMap<K, V> ⭐⭐
├── [C] WeakHashMap<K, V> ⭐⭐
├── [C] EnumMap<K, V> ⭐⭐⭐
├── [I] SortedMap<K, V> ⭐⭐⭐
│   └── [I] NavigableMap<K, V> ⭐⭐⭐⭐
│       └── [C] TreeMap<K, V> ⭐⭐⭐⭐
└── [C] Hashtable<K, V> (Legacy) ⭐
    └── [C] Properties ⭐⭐⭐⭐

```

### Iterators & Comparison

```text
[I] Iterator<E> ⭐⭐⭐⭐⭐
[I] ListIterator<E> ⭐⭐⭐
[I] Spliterator<T> ⭐⭐⭐
[I] Comparator<T> ⭐⭐⭐⭐⭐

```

---

## 3. Utilities & Data Holders (`java.util`)

### Utility Static Classes

```text
[C] Object
├── [C] Arrays ⭐⭐⭐⭐⭐
├── [C] Collections ⭐⭐⭐⭐⭐
├── [C] Objects ⭐⭐⭐⭐⭐
└── [C] Base64 ⭐⭐⭐⭐

```

### Optional Containers

```text
[C] Object
├── [C] Optional<T> ⭐⭐⭐⭐⭐
├── [C] OptionalInt ⭐⭐⭐
├── [C] OptionalLong ⭐⭐⭐
└── [C] OptionalDouble ⭐⭐⭐

```

### Formatting, Parsing & Utilities

```text
[C] Object
├── [C] UUID ⭐⭐⭐⭐⭐
├── [C] Scanner ⭐⭐⭐⭐
├── [C] StringJoiner ⭐⭐⭐⭐
├── [C] StringTokenizer (Legacy) ⭐
├── [C] Formatter ⭐⭐⭐
├── [C] BitSet ⭐⭐⭐
├── [C] Random ⭐⭐⭐⭐
├── [C] SplittableRandom ⭐⭐
├── [C] Locale ⭐⭐⭐⭐
├── [C] Currency ⭐⭐
├── [C] ResourceBundle ⭐⭐⭐
├── [C] Timer ⭐⭐
├── [C] TimerTask ⭐⭐
└── [C] EventObject ⭐⭐

```

---

## 4. Functional Programming (`java.util.function`)

### Primary Functional Interfaces

```text
[I] Function<T, R> ⭐⭐⭐⭐⭐
├── [I] UnaryOperator<T> ⭐⭐⭐⭐⭐
[I] BiFunction<T, U, R> ⭐⭐⭐⭐⭐
└── [I] BinaryOperator<T> ⭐⭐⭐⭐⭐

[I] Predicate<T> ⭐⭐⭐⭐⭐
[I] BiPredicate<T, U> ⭐⭐⭐⭐

[I] Consumer<T> ⭐⭐⭐⭐⭐
[I] BiConsumer<T, U> ⭐⭐⭐⭐⭐

[I] Supplier<T> ⭐⭐⭐⭐⭐

```

### Primitive-Specialized Functional Interfaces

```text
[I] IntFunction<R> ⭐⭐⭐
[I] LongFunction<R> ⭐⭐⭐
[I] DoubleFunction<R> ⭐⭐⭐

[I] ToIntFunction<T> ⭐⭐⭐
[I] ToLongFunction<T> ⭐⭐⭐
[I] ToDoubleFunction<T> ⭐⭐⭐

[I] IntPredicate ⭐⭐⭐
[I] LongPredicate ⭐⭐⭐
[I] DoublePredicate ⭐⭐⭐

[I] IntConsumer ⭐⭐⭐
[I] LongConsumer ⭐⭐⭐
[I] DoubleConsumer ⭐⭐⭐

[I] IntSupplier ⭐⭐⭐
[I] LongSupplier ⭐⭐⭐
[I] DoubleSupplier ⭐⭐⭐

[I] IntUnaryOperator ⭐⭐⭐
[I] LongUnaryOperator ⭐⭐⭐
[I] DoubleUnaryOperator ⭐⭐⭐

[I] IntBinaryOperator ⭐⭐⭐
[I] LongBinaryOperator ⭐⭐⭐
[I] DoubleBinaryOperator ⭐⭐⭐

```

---

## 5. Stream API (`java.util.stream`)

### Stream Interfaces

```text
[I] AutoCloseable
└── [I] BaseStream<T, S> ⭐⭐⭐
    ├── [I] Stream<T> ⭐⭐⭐⭐⭐
    ├── [I] IntStream ⭐⭐⭐⭐
    ├── [I] LongStream ⭐⭐⭐
    └── [I] DoubleStream ⭐⭐⭐

```

### Collectors & Support Types

```text
[C] Object
└── [C] Collectors ⭐⭐⭐⭐⭐

[I] Collector<T, A, R> ⭐⭐⭐⭐
[I] StreamSupport ⭐⭐

```

---

## 6. Concurrency Utilities (`java.util.concurrent`)

### Executor Framework

```text
[I] Executor ⭐⭐⭐⭐
└── [I] ExecutorService ⭐⭐⭐⭐⭐
    ├── [I] ScheduledExecutorService ⭐⭐⭐⭐
    └── [A] AbstractExecutorService
        ├── [C] ThreadPoolExecutor ⭐⭐⭐⭐
        ├── [C] ScheduledThreadPoolExecutor ⭐⭐⭐
        └── [C] ForkJoinPool ⭐⭐⭐

[C] Object
└── [C] Executors ⭐⭐⭐⭐⭐

```

### Tasks & Futures

```text
[I] Runnable
[I] Callable<V> ⭐⭐⭐⭐⭐

[I] Future<V> ⭐⭐⭐⭐⭐
├── [I] RunnableFuture<V> ⭐⭐⭐
│   └── [C] FutureTask<V> ⭐⭐⭐
├── [I] CompletableFuture.AsynchronousCompletionTask
└── [I] ScheduledFuture<V> ⭐⭐⭐

[I] CompletionStage<T> ⭐⭐⭐⭐⭐
└── [C] CompletableFuture<T> ⭐⭐⭐⭐⭐

[C] Object
└── [A] ForkJoinTask<V> ⭐⭐
    ├── [A] RecursiveTask<V> ⭐⭐⭐
    ├── [A] RecursiveAction ⭐⭐⭐
    └── [A] CountedCompleter<T> ⭐⭐

```

### Concurrent Collections & Queues

```text
[I] ConcurrentMap<K, V> ⭐⭐⭐⭐⭐
├── [C] ConcurrentHashMap<K, V> ⭐⭐⭐⭐⭐
└── [I] ConcurrentNavigableMap<K, V> ⭐⭐⭐
    └── [C] ConcurrentSkipListMap<K, V> ⭐⭐⭐

[I] Set<E>
├── [C] ConcurrentSkipListSet<E> ⭐⭐⭐
└── [C] CopyOnWriteArraySet<E> ⭐⭐⭐

[I] List<E>
└── [C] CopyOnWriteArrayList<E> ⭐⭐⭐⭐

[I] Queue<E>
├── [C] ConcurrentLinkedQueue<E> ⭐⭐⭐
├── [I] BlockingQueue<E> ⭐⭐⭐⭐⭐
│   ├── [C] ArrayBlockingQueue<E> ⭐⭐⭐⭐
│   ├── [C] LinkedBlockingQueue<E> ⭐⭐⭐⭐⭐
│   ├── [C] PriorityBlockingQueue<E> ⭐⭐⭐
│   ├── [C] SynchronousQueue<E> ⭐⭐⭐⭐
│   └── [C] DelayQueue<E> ⭐⭐⭐
└── [I] TransferQueue<E> ⭐⭐
    └── [C] LinkedTransferQueue<E> ⭐⭐

[I] Deque<E>
├── [C] ConcurrentLinkedDeque<E> ⭐⭐
└── [I] BlockingDeque<E> ⭐⭐⭐
    └── [C] LinkedBlockingDeque<E> ⭐⭐⭐

```

### Synchronizers & Reactive Streams

```text
[C] Object
├── [C] CountDownLatch ⭐⭐⭐⭐⭐
├── [C] CyclicBarrier ⭐⭐⭐⭐
├── [C] Semaphore ⭐⭐⭐⭐
├── [C] Phaser ⭐⭐⭐
├── [C] Exchanger<V> ⭐⭐
└── [C] Flow ⭐⭐⭐
    ├── [I] Flow.Publisher<T> ⭐⭐⭐⭐
    ├── [I] Flow.Subscriber<T> ⭐⭐⭐⭐
    ├── [I] Flow.Subscription ⭐⭐⭐⭐
    └── [I] Flow.Processor<T, R> ⭐⭐⭐

[E] TimeUnit ⭐⭐⭐⭐⭐
[I] Delayed ⭐⭐

```

---

## 7. Locks & Atomic Variables

### Locks (`java.util.concurrent.locks`)

```text
[I] Lock ⭐⭐⭐⭐⭐
└── [C] ReentrantLock ⭐⭐⭐⭐⭐

[I] ReadWriteLock ⭐⭐⭐⭐
└── [C] ReentrantReadWriteLock ⭐⭐⭐⭐

[C] Object
├── [C] StampedLock ⭐⭐⭐⭐
├── [A] AbstractQueuedSynchronizer ⭐⭐⭐
└── [A] AbstractQueuedLongSynchronizer ⭐⭐

[I] Condition ⭐⭐⭐⭐

```

### Atomic Variables (`java.util.concurrent.atomic`)

```text
[C] Object
├── [C] AtomicBoolean ⭐⭐⭐⭐⭐
├── [C] AtomicInteger ⭐⭐⭐⭐⭐
├── [C] AtomicLong ⭐⭐⭐⭐⭐
├── [C] AtomicReference<V> ⭐⭐⭐⭐⭐
├── [C] AtomicIntegerArray ⭐⭐⭐
├── [C] AtomicLongArray ⭐⭐⭐
├── [C] AtomicReferenceArray<E> ⭐⭐⭐
├── [C] AtomicIntegerFieldUpdater<T> ⭐⭐
├── [C] AtomicLongFieldUpdater<T> ⭐⭐
├── [C] AtomicReferenceFieldUpdater<T, V> ⭐⭐
├── [C] AtomicStampedReference<V> ⭐⭐
├── [C] AtomicMarkableReference<V> ⭐⭐
└── [A] Striped64 ⭐⭐
    ├── [C] LongAdder ⭐⭐⭐⭐
    ├── [C] LongAccumulator ⭐⭐⭐
    ├── [C] DoubleAdder ⭐⭐⭐
    └── [C] DoubleAccumulator ⭐⭐

```

---

## 8. Date & Time API (`java.time`)

### Temporal Value Types

```text
[C] Object
├── [C] LocalDate ⭐⭐⭐⭐⭐
├── [C] LocalTime ⭐⭐⭐⭐⭐
├── [C] LocalDateTime ⭐⭐⭐⭐⭐
├── [C] Instant ⭐⭐⭐⭐⭐
├── [C] ZonedDateTime ⭐⭐⭐⭐⭐
├── [C] OffsetDateTime ⭐⭐⭐⭐
├── [C] OffsetTime ⭐⭐⭐
├── [C] Duration ⭐⭐⭐⭐⭐
├── [C] Period ⭐⭐⭐⭐⭐
├── [C] ZoneId ⭐⭐⭐⭐⭐
│   └── [C] ZoneOffset ⭐⭐⭐⭐
├── [C] Year ⭐⭐⭐
├── [C] YearMonth ⭐⭐⭐
├── [C] MonthDay ⭐⭐⭐
└── [A] Clock ⭐⭐⭐⭐

[E] Month ⭐⭐⭐⭐
[E] DayOfWeek ⭐⭐⭐⭐

```

### Formatting (`java.time.format`)

```text
[C] Object
├── [C] DateTimeFormatter ⭐⭐⭐⭐⭐
└── [C] DateTimeFormatterBuilder ⭐⭐⭐

[E] FormatStyle ⭐⭐⭐
[E] ResolverStyle ⭐⭐

```

### Temporal Interfaces & Units (`java.time.temporal`)

```text
[I] TemporalAccessor
└── [I] Temporal ⭐⭐⭐
    └── [I] TemporalAdjuster ⭐⭐⭐⭐

[I] TemporalAmount ⭐⭐⭐
[I] TemporalField ⭐⭐⭐
[I] TemporalUnit ⭐⭐⭐
[C] TemporalAdjusters ⭐⭐⭐⭐
[E] ChronoUnit ⭐⭐⭐⭐⭐
[E] ChronoField ⭐⭐⭐

```

---

## 9. Standard I/O (`java.io`)

### Byte Stream Hierarchy

```text
[C] Object
├── [A] InputStream ⭐⭐⭐⭐⭐
│   ├── [C] FileInputStream ⭐⭐⭐⭐
│   ├── [C] ByteArrayInputStream ⭐⭐⭐⭐
│   ├── [A] FilterInputStream ⭐⭐⭐
│   │   ├── [C] BufferedInputStream ⭐⭐⭐⭐⭐
│   │   ├── [C] DataInputStream ⭐⭐⭐
│   │   └── [C] PushbackInputStream ⭐⭐
│   ├── [C] ObjectInputStream ⭐⭐⭐
│   ├── [C] PipedInputStream ⭐⭐
│   └── [C] SequenceInputStream ⭐⭐
└── [A] OutputStream ⭐⭐⭐⭐⭐
    ├── [C] FileOutputStream ⭐⭐⭐⭐
    ├── [C] ByteArrayOutputStream ⭐⭐⭐⭐
    ├── [A] FilterOutputStream ⭐⭐⭐
    │   ├── [C] BufferedOutputStream ⭐⭐⭐⭐⭐
    │   ├── [C] DataOutputStream ⭐⭐⭐
    │   └── [C] PrintStream ⭐⭐⭐⭐⭐
    ├── [C] ObjectOutputStream ⭐⭐⭐
    └── [C] PipedOutputStream ⭐⭐

```

### Character Stream Hierarchy

```text
[C] Object
├── [A] Reader ⭐⭐⭐⭐⭐
│   ├── [C] BufferedReader ⭐⭐⭐⭐⭐
│   │   └── [C] LineNumberReader ⭐⭐
│   ├── [C] CharArrayReader ⭐⭐⭐
│   ├── [C] StringReader ⭐⭐⭐⭐
│   ├── [A] FilterReader ⭐⭐
│   │   └── [C] PushbackReader ⭐⭐
│   ├── [C] InputStreamReader ⭐⭐⭐⭐⭐
│   │   └── [C] FileReader ⭐⭐⭐⭐
│   └── [C] PipedReader ⭐⭐
└── [A] Writer ⭐⭐⭐⭐⭐
    ├── [C] BufferedWriter ⭐⭐⭐⭐⭐
    ├── [C] CharArrayWriter ⭐⭐⭐
    ├── [C] StringWriter ⭐⭐⭐⭐
    ├── [A] FilterWriter ⭐⭐
    ├── [C] OutputStreamWriter ⭐⭐⭐⭐⭐
    │   └── [C] FileWriter ⭐⭐⭐⭐
    ├── [C] PrintWriter ⭐⭐⭐⭐
    └── [C] PipedWriter ⭐⭐

```

### File System & Serialization

```text
[C] Object
├── [C] File ⭐⭐⭐⭐⭐
├── [C] RandomAccessFile ⭐⭐⭐
├── [C] Console ⭐⭐
└── [C] FileDescriptor ⭐⭐

[I] Serializable ⭐⭐⭐⭐⭐
[I] Externalizable ⭐⭐⭐
[I] Closeable
[I] Flushable
[I] FileFilter ⭐⭐⭐
[I] FilenameFilter ⭐⭐⭐

[C] Throwable
└── [C] Exception
    └── [C] IOException ⭐⭐⭐⭐⭐
        ├── [C] FileNotFoundException ⭐⭐⭐⭐
        ├── [C] EOFException ⭐⭐⭐
        ├── [C] ObjectStreamException ⭐⭐
        │   ├── [C] NotSerializableException ⭐⭐⭐
        │   └── [C] InvalidClassException ⭐⭐
        └── [C] InterruptedIOException ⭐⭐

```

---

## 10. Non-blocking I/O & File NIO.2 (`java.nio`)

### Buffers (`java.nio`)

```text
[C] Object
└── [A] Buffer ⭐⭐⭐⭐
    ├── [A] ByteBuffer ⭐⭐⭐⭐⭐
    │   ├── [C] MappedByteBuffer ⭐⭐⭐
    │   └── Direct / Heap Implementations
    ├── [A] CharBuffer ⭐⭐⭐
    ├── [A] ShortBuffer ⭐⭐
    ├── [A] IntBuffer ⭐⭐
    ├── [A] LongBuffer ⭐⭐
    ├── [A] FloatBuffer ⭐⭐
    └── [A] DoubleBuffer ⭐⭐

[C] ByteOrder ⭐⭐⭐

```

### Paths & File Operations (`java.nio.file`)

```text
[I] Path ⭐⭐⭐⭐⭐
[C] Paths ⭐⭐⭐⭐⭐
[C] Files ⭐⭐⭐⭐⭐
[A] FileSystem ⭐⭐⭐
[C] FileSystems ⭐⭐⭐

[I] WatchService ⭐⭐⭐
[I] Watchable
[I] WatchEvent<T> ⭐⭐
[I] WatchKey ⭐⭐

[I] DirectoryStream<T> ⭐⭐⭐
[I] FileVisitor<T> ⭐⭐⭐
└── [C] SimpleFileVisitor<T> ⭐⭐⭐

[E] StandardOpenOption ⭐⭐⭐⭐
[E] StandardCopyOption ⭐⭐⭐⭐
[E] LinkOption ⭐⭐⭐
[E] FileVisitOption ⭐⭐
[E] FileVisitResult ⭐⭐⭐

```

### Channels & Selectors (`java.nio.channels`)

```text
[I] Channel ⭐⭐⭐⭐
├── [I] ReadableByteChannel
├── [I] WritableByteChannel
├── [I] ByteChannel
│   ├── [I] SeekableByteChannel
│   │   └── [C] FileChannel ⭐⭐⭐⭐
│   └── [A] SelectableChannel ⭐⭐⭐
│       ├── [A] SocketChannel ⭐⭐⭐⭐
│       ├── [A] ServerSocketChannel ⭐⭐⭐⭐
│       └── [A] DatagramChannel ⭐⭐⭐
├── [I] AsynchronousChannel ⭐⭐⭐
│   ├── [C] AsynchronousFileChannel ⭐⭐
│   ├── [C] AsynchronousSocketChannel ⭐⭐⭐
│   └── [C] AsynchronousServerSocketChannel ⭐⭐
└── [I] GatheringByteChannel / ScatteringByteChannel

[A] Selector ⭐⭐⭐⭐
[A] SelectionKey ⭐⭐⭐⭐
[C] Channels ⭐⭐⭐

```

### Charset Support (`java.nio.charset`)

```text
[C] Object
├── [A] Charset ⭐⭐⭐⭐⭐
├── [C] StandardCharsets ⭐⭐⭐⭐⭐
├── [A] CharsetEncoder ⭐⭐⭐
└── [A] CharsetDecoder ⭐⭐⭐

```

---

## 11. Networking & HTTP Client

### Standard Networking (`java.net`)

```text
[C] Object
├── [C] URI ⭐⭐⭐⭐⭐
├── [C] URL ⭐⭐⭐⭐
├── [A] URLConnection ⭐⭐⭐
│   └── [A] HttpURLConnection ⭐⭐⭐
├── [A] InetAddress ⭐⭐⭐⭐
│   ├── [C] Inet4Address ⭐⭐⭐
│   └── [C] Inet6Address ⭐⭐⭐
├── [A] SocketAddress ⭐⭐⭐
│   └── [C] InetSocketAddress ⭐⭐⭐⭐
├── [C] Socket ⭐⭐⭐⭐
├── [C] ServerSocket ⭐⭐⭐⭐
├── [C] DatagramSocket ⭐⭐⭐
├── [C] DatagramPacket ⭐⭐⭐
├── [C] MulticastSocket ⭐⭐
├── [C] NetworkInterface ⭐⭐⭐
├── [C] URLEncoder ⭐⭐⭐⭐
├── [C] URLDecoder ⭐⭐⭐⭐
├── [C] CookieManager ⭐⭐⭐
├── [A] CookieHandler ⭐⭐
├── [A] ProxySelector ⭐⭐
└── [C] Proxy ⭐⭐⭐

[I] SocketOption<T> ⭐⭐
[C] StandardSocketOptions ⭐⭐

```

### Modern HTTP Client (`java.net.http`)

```text
[C] Object
├── [A] HttpClient ⭐⭐⭐⭐⭐
├── [A] HttpRequest ⭐⭐⭐⭐⭐
├── [C] HttpRequest.Builder ⭐⭐⭐⭐⭐
├── [A] HttpHeaders ⭐⭐⭐⭐
└── [A] HttpResponse<T> ⭐⭐⭐⭐⭐

[I] HttpRequest.BodyPublisher ⭐⭐⭐⭐
[C] HttpRequest.BodyPublishers ⭐⭐⭐⭐⭐
[I] HttpResponse.BodyHandler<T> ⭐⭐⭐⭐
[C] HttpResponse.BodyHandlers ⭐⭐⭐⭐⭐
[I] HttpResponse.BodySubscriber<T> ⭐⭐⭐
[C] HttpResponse.BodySubscribers ⭐⭐⭐
[I] HttpResponse.ResponseInfo ⭐⭐
[I] HttpResponse.PushPromiseHandler<T> ⭐⭐

[I] WebSocket ⭐⭐⭐
[I] WebSocket.Listener ⭐⭐⭐
[I] WebSocket.Builder ⭐⭐⭐

```

---

## 12. Database Connectivity (`java.sql` / `javax.sql`)

### Core JDBC (`java.sql`)

```text
[I] Wrapper
├── [I] Connection ⭐⭐⭐⭐⭐
├── [I] Statement ⭐⭐⭐⭐⭐
│   ├── [I] PreparedStatement ⭐⭐⭐⭐⭐
│   │   └── [I] CallableStatement ⭐⭐⭐
│   └── [I] ResultSet ⭐⭐⭐⭐⭐
├── [I] DatabaseMetaData ⭐⭐⭐⭐
├── [I] ResultSetMetaData ⭐⭐⭐⭐
├── [I] ParameterMetaData ⭐⭐
├── [I] Array ⭐⭐
├── [I] Blob ⭐⭐⭐
├── [I] Clob ⭐⭐⭐
├── [I] NClob ⭐⭐
└── [I] Struct ⭐⭐

[I] Driver ⭐⭐⭐⭐
[C] DriverManager ⭐⭐⭐⭐
[I] Savepoint ⭐⭐⭐
[E] JDBCType ⭐⭐⭐

[C] Throwable
└── [C] Exception
    └── [C] SQLException ⭐⭐⭐⭐⭐
        ├── [C] SQLWarning ⭐⭐⭐
        ├── [C] SQLTransientException ⭐⭐
        ├── [C] SQLNonTransientException ⭐⭐
        ├── [C] SQLIntegrityConstraintViolationException ⭐⭐⭐
        └── [C] BatchUpdateException ⭐⭐

```

### Advanced / Pooled JDBC (`javax.sql`)

```text
[I] CommonDataSource
└── [I] DataSource ⭐⭐⭐⭐⭐

[I] ConnectionPoolDataSource ⭐⭐⭐
[I] PooledConnection ⭐⭐⭐
[I] XADataSource ⭐⭐
[I] XAConnection ⭐⭐

[I] RowSet ⭐⭐
├── [I] CachedRowSet ⭐⭐
├── [I] WebRowSet ⭐
├── [I] FilteredRowSet ⭐
└── [I] JoinRowSet ⭐

```

---

## 13. Reflection & Dynamic Proxies (`java.lang.reflect`)

### Reflection Metadata Classes

```text
[C] Object
├── [A] AccessibleObject ⭐⭐⭐⭐
│   ├── [A] Executable ⭐⭐⭐
│   │   ├── [C] Method ⭐⭐⭐⭐⭐
│   │   └── [C] Constructor<T> ⭐⭐⭐⭐⭐
│   ├── [C] Field ⭐⭐⭐⭐⭐
│   └── [C] Parameter ⭐⭐⭐⭐
├── [C] Modifier ⭐⭐⭐⭐
├── [C] Array ⭐⭐⭐
├── [C] Proxy ⭐⭐⭐⭐⭐
└── [A] RecordComponent ⭐⭐⭐

[I] Member ⭐⭐⭐
[I] InvocationHandler ⭐⭐⭐⭐⭐
[I] Type ⭐⭐⭐
├── [I] ParameterizedType ⭐⭐⭐⭐
├── [I] GenericArrayType ⭐⭐
├── [I] TypeVariable<D> ⭐⭐
└── [I] WildcardType ⭐⭐

```

### Method Handles (`java.lang.invoke`)

```text
[C] Object
├── [C] MethodHandles ⭐⭐⭐
├── [C] MethodHandles.Lookup ⭐⭐⭐
├── [C] MethodHandle ⭐⭐⭐
├── [C] MethodType ⭐⭐⭐
└── [C] VarHandle ⭐⭐⭐

```

---

## 14. Annotations (`java.lang.annotation`)

### Meta-Annotations

```text
[I] Annotation ⭐⭐⭐⭐⭐
├── [I] Retention ⭐⭐⭐⭐⭐
├── [I] Target ⭐⭐⭐⭐⭐
├── [I] Documented ⭐⭐⭐⭐
├── [I] Inherited ⭐⭐⭐⭐
└── [I] Repeatable ⭐⭐⭐⭐

[E] RetentionPolicy ⭐⭐⭐⭐⭐
[E] ElementType ⭐⭐⭐⭐⭐

```

### Core Built-in Annotations (`java.lang`)

```text
[I] Override ⭐⭐⭐⭐⭐
[I] Deprecated ⭐⭐⭐⭐⭐
[I] SuppressWarnings ⭐⭐⭐⭐⭐
[I] FunctionalInterface ⭐⭐⭐⭐⭐
[I] SafeVarargs ⭐⭐⭐⭐

```

---

## 15. Arbitrary-Precision Math (`java.math`)

```text
[C] Object
└── [A] Number
    ├── [C] BigInteger ⭐⭐⭐⭐⭐
    └── [C] BigDecimal ⭐⭐⭐⭐⭐

[C] MathContext ⭐⭐⭐⭐
[E] RoundingMode ⭐⭐⭐⭐⭐

```

---

## 16. Regular Expressions (`java.util.regex`)

```text
[C] Object
├── [C] Pattern ⭐⭐⭐⭐⭐
└── [C] Matcher ⭐⭐⭐⭐⭐

[I] MatchResult ⭐⭐⭐
[C] Throwable
└── [C] Exception
    └── [C] RuntimeException
        └── [C] PatternSyntaxException ⭐⭐⭐

```

---

## 17. Security & Cryptography

### Core Security (`java.security`)

```text
[C] Object
├── [A] MessageDigest ⭐⭐⭐⭐
├── [C] SecureRandom ⭐⭐⭐⭐⭐
├── [A] Signature ⭐⭐⭐
├── [C] KeyPair ⭐⭐⭐
├── [C] KeyPairGenerator ⭐⭐⭐
├── [C] KeyFactory ⭐⭐⭐
├── [C] KeyStore ⭐⭐⭐⭐
├── [A] Provider ⭐⭐⭐
├── [C] Security ⭐⭐⭐
├── [A] Permission ⭐⭐
└── [C] Principal ⭐⭐⭐

[I] Key ⭐⭐⭐⭐
├── [I] PublicKey ⭐⭐⭐⭐
└── [I] PrivateKey ⭐⭐⭐⭐

[I] Certificate ⭐⭐⭐

```

### Cryptography Extensions (`javax.crypto`)

```text
[C] Object
├── [C] Cipher ⭐⭐⭐⭐⭐
├── [C] Mac ⭐⭐⭐⭐
├── [C] KeyGenerator ⭐⭐⭐
├── [C] SecretKeyFactory ⭐⭐⭐
├── [C] SealedObject ⭐⭐
├── [A] FilterInputStream
│   └── [C] CipherInputStream ⭐⭐⭐
└── [A] FilterOutputStream
    └── [C] CipherOutputStream ⭐⭐⭐

[I] SecretKey ⭐⭐⭐⭐
[I] KeyAgreement ⭐⭐

```

---

## 18. Logging API (`java.util.logging`)

```text
[C] Object
├── [C] Logger ⭐⭐⭐⭐
├── [C] LogManager ⭐⭐⭐
├── [C] LogRecord ⭐⭐
├── [C] Level ⭐⭐⭐⭐
├── [A] Formatter ⭐⭐⭐
│   ├── [C] SimpleFormatter ⭐⭐⭐
│   └── [C] XMLFormatter ⭐⭐
├── [A] Handler ⭐⭐⭐
│   ├── [C] ConsoleHandler ⭐⭐⭐
│   ├── [C] FileHandler ⭐⭐⭐
│   ├── [C] SocketHandler ⭐⭐
│   └── [C] MemoryHandler ⭐⭐
└── [I] Filter ⭐⭐

```

---

## 19. Archiving & Compression

### Zip (`java.util.zip`)

```text
[C] Object
├── [C] ZipFile ⭐⭐⭐
├── [C] ZipEntry ⭐⭐⭐⭐
├── [C] Deflater ⭐⭐
├── [C] Inflater ⭐⭐
├── [A] FilterInputStream
│   ├── [C] InflaterInputStream
│   │   ├── [C] ZipInputStream ⭐⭐⭐
│   │   └── [C] GZIPInputStream ⭐⭐⭐⭐
│   └── [C] CheckedInputStream ⭐⭐
├── [A] FilterOutputStream
│   ├── [C] DeflaterOutputStream
│   │   ├── [C] ZipOutputStream ⭐⭐⭐
│   │   └── [C] GZIPOutputStream ⭐⭐⭐⭐
│   └── [C] CheckedOutputStream ⭐⭐
└── [C] CRC32 ⭐⭐⭐

[I] Checksum ⭐⭐

```

### Jar (`java.util.jar`)

```text
[C] ZipFile
└── [C] JarFile ⭐⭐⭐

[C] ZipEntry
└── [C] JarEntry ⭐⭐⭐

[C] ZipInputStream
└── [C] JarInputStream ⭐⭐

[C] ZipOutputStream
└── [C] JarOutputStream ⭐⭐

[C] Manifest ⭐⭐⭐
[C] Attributes ⭐⭐

```

---

## 20. XML Processing (`javax.xml`)

### DOM Parser (`org.w3c.dom` / `javax.xml.parsers`)

```text
[I] Node ⭐⭐⭐
├── [I] Document ⭐⭐⭐
├── [I] Element ⭐⭐⭐
├── [I] Attr ⭐⭐
├── [I] CharacterData
│   └── [I] Text ⭐⭐
└── [I] NodeList ⭐⭐⭐

[A] DocumentBuilder ⭐⭐⭐
[A] DocumentBuilderFactory ⭐⭐⭐

```

### SAX Parser (`org.xml.sax` / `javax.xml.parsers`)

```text
[I] XMLReader ⭐⭐
[I] ContentHandler ⭐⭐
[C] DefaultHandler ⭐⭐
[A] SAXParser ⭐⭐
[A] SAXParserFactory ⭐⭐

```

### StAX Streaming (`javax.xml.stream`)

```text
[I] XMLStreamReader ⭐⭐⭐
[I] XMLStreamWriter ⭐⭐⭐
[I] XMLEventReader ⭐⭐
[I] XMLEventWriter ⭐⭐
[A] XMLInputFactory ⭐⭐⭐
[A] XMLOutputFactory ⭐⭐⭐

```

### Transformations & XPath (`javax.xml.transform` / `javax.xml.xpath`)

```text
[A] Transformer ⭐⭐⭐
[A] TransformerFactory ⭐⭐⭐
[I] Source ⭐⭐⭐
├── [C] DOMSource
├── [C] SAXSource
└── [C] StreamSource ⭐⭐⭐
[I] Result ⭐⭐⭐
├── [C] DOMResult
├── [C] SAXResult
└── [C] StreamResult ⭐⭐⭐

[I] XPath ⭐⭐⭐
[A] XPathFactory ⭐⭐⭐
[I] XPathExpression ⭐⭐⭐

```

---

## 21. Management & Monitoring (`java.lang.management`)

```text
[C] Object
└── [C] ManagementFactory ⭐⭐⭐

[I] PlatformManagedObject
├── [I] ClassLoadingMXBean ⭐⭐
├── [I] CompilationMXBean ⭐⭐
├── [I] GarbageCollectorMXBean ⭐⭐⭐
├── [I] MemoryMXBean ⭐⭐⭐
├── [I] MemoryPoolMXBean ⭐⭐
├── [I] OperatingSystemMXBean ⭐⭐⭐
├── [I] RuntimeMXBean ⭐⭐⭐
└── [I] ThreadMXBean ⭐⭐⭐

[C] ObjectName ⭐⭐
[I] MBeanServer ⭐⭐
[C] MBeanInfo ⭐⭐

```

---

## 22. JavaBeans & Introspection (`java.beans`)

```text
[C] Object
├── [C] Introspector ⭐⭐⭐
├── [A] FeatureDescriptor ⭐⭐
│   ├── [C] PropertyDescriptor ⭐⭐⭐
│   ├── [C] MethodDescriptor ⭐⭐
│   ├── [C] EventSetDescriptor ⭐⭐
│   └── [C] ParameterDescriptor ⭐⭐
├── [C] PropertyChangeSupport ⭐⭐⭐
├── [C] VetoableChangeSupport ⭐⭐
└── [C] PropertyChangeEvent ⭐⭐⭐

[I] BeanInfo ⭐⭐⭐
[I] PropertyChangeListener ⭐⭐⭐
[I] VetoableChangeListener ⭐⭐

```

---

## 23. JNDI Naming (`javax.naming`)

```text
[I] Context ⭐⭐
└── [I] DirContext ⭐⭐

[C] InitialContext ⭐⭐⭐
[C] Reference ⭐⭐
[C] CompositeName ⭐⭐
[C] CompoundName ⭐⭐

[C] Throwable
└── [C] Exception
    └── [C] NamingException ⭐⭐

```

---

## 24. Instrumentation (`java.lang.instrument`)

```text
[I] Instrumentation ⭐⭐⭐
[I] ClassFileTransformer ⭐⭐⭐
[C] ClassDefinition ⭐⭐

```

---

## 25. Specialized / Desktop / Legacy

### Abstract Window Toolkit (`java.awt`) — Specialized / Desktop

```text
[C] Object
├── [A] Component ⭐
│   ├── [C] Button ⭐
│   ├── [C] Canvas ⭐
│   ├── [C] Checkbox ⭐
│   ├── [C] Choice ⭐
│   ├── [C] Label ⭐
│   ├── [A] TextComponent ⭐
│   │   ├── [C] TextField ⭐
│   │   └── [C] TextArea ⭐
│   └── [A] Container ⭐
│       ├── [C] Panel ⭐
│       └── [C] Window ⭐
│           ├── [C] Frame ⭐
│           └── [C] Dialog ⭐
├── [C] Color ⭐⭐
├── [C] Font ⭐⭐
├── [A] Graphics ⭐⭐
│   └── [A] Graphics2D ⭐⭐
├── [A] Image ⭐⭐
└── [C] EventQueue ⭐⭐

[I] LayoutManager ⭐
├── [I] LayoutManager2
│   ├── [C] BorderLayout ⭐
│   └── [C] GridBagLayout ⭐
└── [C] FlowLayout ⭐

```

### Swing (`javax.swing`) — Specialized / Desktop

```text
[A] Container
└── [A] JComponent ⭐
    ├── [C] AbstractButton
    │   ├── [C] JButton ⭐
    │   ├── [C] JToggleButton
    │   │   ├── [C] JCheckBox ⭐
    │   │   └── [C] JRadioButton ⭐
    │   └── [C] JMenuItem
    ├── [C] JLabel ⭐
    ├── [C] JComboBox<E> ⭐
    ├── [C] JList<E> ⭐
    ├── [C] JPanel ⭐
    ├── [C] JScrollPane ⭐
    ├── [C] JTabbedPane ⭐
    ├── [C] JTable ⭐
    ├── [C] JTree ⭐
    └── [A] JTextComponent
        ├── [C] JTextField ⭐
        ├── [C] JTextArea ⭐
        └── [C] JPasswordField ⭐

[C] Window
├── [C] JFrame ⭐
└── [C] JDialog ⭐

[C] JOptionPane ⭐
[C] SwingUtilities ⭐⭐

```

### Remote Method Invocation (`java.rmi`) — Legacy

```text
[I] Remote ⭐
[A] RemoteObject ⭐
└── [A] RemoteServer ⭐
    └── [C] UnicastRemoteObject ⭐

[C] Naming ⭐
[I] Registry ⭐
[C] LocateRegistry ⭐

[C] Exception
└── [C] IOException
    └── [C] RemoteException ⭐

```

---

## Essential Java Developer Type Map

```text
CORE RUNTIME
├── Object
├── Class
├── String
├── StringBuilder
├── Integer / Long / Double
├── System
├── Math
├── Record
├── Enum
└── Thread / ThreadLocal

EXCEPTIONS
├── Throwable
├── Exception
├── RuntimeException
├── NullPointerException
├── IllegalArgumentException
├── IllegalStateException
├── IndexOutOfBoundsException
├── UnsupportedOperationException
└── IOException

COLLECTIONS & MAPS
├── List
├── ArrayList
├── LinkedList
├── Set
├── HashSet
├── LinkedHashSet
├── TreeSet
├── Queue / Deque
├── ArrayDeque
├── PriorityQueue
├── Map
├── HashMap
├── LinkedHashMap
├── TreeMap
├── Iterator
└── Comparator

UTILITIES & MODERN TYPES
├── Optional
├── Arrays
├── Collections
├── Objects
├── UUID
└── Base64

FUNCTIONAL & STREAMS
├── Function / BiFunction
├── Predicate / BiPredicate
├── Consumer / BiConsumer
├── Supplier
├── UnaryOperator / BinaryOperator
├── Stream / IntStream
└── Collectors

CONCURRENCY
├── Runnable / Callable
├── Executor / ExecutorService
├── Executors
├── Future / CompletableFuture
├── BlockingQueue
├── LinkedBlockingQueue / ArrayBlockingQueue
├── ConcurrentHashMap
├── CopyOnWriteArrayList
├── CountDownLatch
├── Semaphore
├── Lock / ReentrantLock
├── ReadWriteLock / ReentrantReadWriteLock
└── AtomicInteger / AtomicLong / AtomicBoolean / AtomicReference

DATE & TIME
├── LocalDate
├── LocalTime
├── LocalDateTime
├── Instant
├── ZonedDateTime
├── Duration
├── Period
└── DateTimeFormatter

I/O & NIO.2
├── File
├── InputStream / OutputStream
├── FileInputStream / FileOutputStream
├── BufferedInputStream / BufferedOutputStream
├── Reader / Writer
├── BufferedReader / BufferedWriter
├── InputStreamReader / OutputStreamWriter
├── Path / Paths
├── Files
├── ByteBuffer
└── FileChannel

NETWORKING & HTTP
├── URI
├── URL
├── Socket / ServerSocket
├── HttpClient
├── HttpRequest
└── HttpResponse

DATABASE (JDBC)
├── DataSource
├── Connection
├── PreparedStatement
├── Statement
├── ResultSet
└── SQLException

REFLECTION & ANNOTATIONS
├── Method
├── Field
├── Constructor
├── Proxy
├── InvocationHandler
├── Override
├── FunctionalInterface
└── Retention / Target

```