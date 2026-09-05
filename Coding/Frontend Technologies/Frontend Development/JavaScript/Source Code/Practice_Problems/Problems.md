# JavaScript Engineering Mastery: 100 Rigorous Programming Challenges

A zero-fluff, production-grade problem bank covering algorithms, asynchronous internals, runtime mechanics, defensive metaprogramming, and systems patterns in modern JavaScript.

---

## Part 1: Type Systems, Coercion & Primitives

### 1. Robust Canonical Value Classifier
**Difficulty:** 🟢 Easy

#### Problem
Write a function `preciseType(val)` that identifies the internal ECMAScript canonical type tag of any value without relying on flawed built-ins like `typeof`.

#### Requirements
- Classify all primitives: `undefined`, `null`, `boolean`, `number`, `bigint`, `string`, `symbol`.
- Differentiate structural objects: `object`, `array`, `function`, `date`, `regexp`, `map`, `set`, `weakmap`, `weakset`, `error`, `promise`.
- Identify `NaN` as `"nan"`.
- Must not throw on `Object.create(null)` or objects with overridden `Symbol.toStringTag`.

#### Input
- `val`: Any JavaScript entity.

#### Output
- Lowercase string representing the exact canonical type.

#### Example
**Input:**
```javascript
preciseType(new Date());
preciseType(NaN);
preciseType(Object.create(null));


Output:
"date"
"nan"
"object"


Constraints
Time Complexity: \mathcal{O}(1)
Space Complexity: \mathcal{O}(1)
Edge Cases
Boxed primitives (new Number(5)).
Objects with prototype chains pointing to null.
What to Pay Attention To
typeof null === "object".
User-supplied Symbol.toStringTag can mask standard object classifications.
Things to Think About
Can Object.prototype.toString.call(val) be spoofed by modifying symbols on instance prototypes?
Common Mistakes
Relying on instanceof, which fails across multiple execution realms (<iframe> contexts).
2. Specification-Compliant Deep Strict Equality
Difficulty: 🟡 Medium
Problem
Implement deepEqual(a, b) that performs an exhaustive structural equality test between two arbitrarily nested entities.
Requirements
Primitive equality must observe Object.is semantics (NaN === NaN is true, +0 === -0 is false).
Compare Arrays by index ordering and length.
Compare plain Objects by key set and internal values regardless of key insertion order.
Recursively handle Dates (by timestamp), RegExps (by pattern and flags), Maps, and Sets.
Handle cyclic object references without infinite recursion.
Input
a, b: Any JavaScript values.
Output
Boolean: true if structurally identical, false otherwise.
Example
Input:
const objA = { x: [1, 2], y: NaN };
const objB = { y: NaN, x: [1, 2] };
deepEqual(objA, objB);


Output:
true


Constraints
Graph Depth \le 10^4 nodes.
Must not use JSON.stringify.
Edge Cases
Self-referencing structures (a.self = a).
Sparse arrays vs dense arrays containing undefined.
What to Pay Attention To
Comparing keys using Reflect.ownKeys vs Object.keys (handling non-enumerable properties and Symbols).
Things to Think About
How do you track cycle sets for both left and right references simultaneously without false positives?
Common Mistakes
Ignoring prototype differences when comparing an object literal {} with Object.create(null).
3. Safe Path-Based String Interpolator
Difficulty: 🟢 Easy
Problem
Implement a template engine interpolate(template, context) that replaces expression tokens ${path.to.prop} with values resolved from a context object without using eval or dynamic code execution.
Requirements
Support dot-notation access (user.profile.name) and bracket indexing (users[0].name).
Unresolved paths must evaluate to an empty string "".
Must not expose prototype injection vulnerabilities via properties like __proto__ or constructor.
Input
template: A string containing tokens.
context: An object of arbitrary depth.
Output
A fully interpolated string.
Example
Input:
interpolate("User ${users[0].name} scored${stats.score}", {
  users: [{ name: "Amina" }],
  stats: { score: 98 }
});


Output:
"User Amina scored 98"


Constraints
String length \le 10^5 characters.
Edge Cases
Tokens containing spaces (${ user.name }).
Deeply nested properties accessed on nullish values (a.b.c when a.b is null).
What to Pay Attention To
Parsing bracket notations vs dot notations uniformly.
Things to Think About
Why is splitting by regex directly dangerous when handling escaped characters?
Common Mistakes
Letting paths like "constructor.prototype.toString" execute unintended lookups.
4. Dynamic Bitfield Permissions Manager
Difficulty: 🟡 Medium
Problem
Build a high-performance permission checking manager createPermissionSet(initialMask) utilizing 32-bit bitwise integers.
Requirements
Methods: add(flag), remove(flag), has(flag), hasAll(flagsArray), hasAny(flagsArray), toggle(flag).
All methods must execute in strict \mathcal{O}(1) time.
State must remain immutable: each mutative method must return a new integer bitmask without changing the original.
Input/Output
const READ = 1 << 0;
const WRITE = 1 << 1;
const EXEC = 1 << 2;

const mask = createPermissionSet(READ)
  .add(WRITE)
  .remove(READ);

mask.has(WRITE); // true
mask.has(EXEC);  // false


Constraints
Up to 31 distinct binary flags (JavaScript treats bitwise operands as signed 32-bit integers).
Edge Cases
Shifting by \ge 32 bits (leads to bit wrap-around).
What to Pay Attention To
The sign bit at index 31: prefer unsigned shifts >>> 0 when normalizing output masks.
5. BigInt High-Precision Financial Math
Difficulty: 🟡 Medium
Problem
JavaScript's Number type causes precision loss with floating-point calculations (0.1 + 0.2 !== 0.3). Implement a fixed-point financial currency calculator Money(amount, currency, decimals = 4) using native BigInt.
Requirements
Support methods: add(other), subtract(other), multiply(scalar), divide(scalar), format().
Parsing from string representation ("123.4567") directly to internal scaled BigInt.
Never use floating point conversion during intermediate arithmetic steps.
Throw a TypeError if operations are attempted across divergent currencies.
Input/Output
const a = new Money("10.50", "USD", 2);
const b = new Money("0.05", "USD", 2);
a.add(b).format(); // "$10.55"


Constraints
Decimal precision up to 18 decimal places without overflow.
Edge Cases
Negative values formatting with appropriate currency sign placement.
Rounding modes on division (implement Banker's rounding / half-even).
6. JSON Lexer and Primitive Tokenizer
Difficulty: 🔴 Advanced
Problem
Write a streaming state-machine tokenizer tokenizeJSON(rawString) that parses a raw JSON string into an array of lexical tokens without dynamic evaluation.
Requirements
Identify tokens: L_BRACE, R_BRACE, L_BRACKET, R_BRACKET, COLON, COMMA, STRING, NUMBER, TRUE, FALSE, NULL.
Accurately parse escaped characters in strings (\", \\, \/, \b, \f, \n, \r, \t, \uXXXX).
Validate standard JSON number specifications (disallow leading zeros like 015, validate scientific notation 1.5e-3).
Input
A valid or invalid JSON string.
Output
An array of token objects: { type: string, value: any, start: number, end: number }. Throw SyntaxError on invalid syntax.
Constraints
String length up to 10^6 characters.
Single-pass linear time complexity \mathcal{O}(n).
7. ECMAScript ToPrimitive Implementation
Difficulty: 🟡 Medium
Problem
Implement toPrimitive(input, preferredType = "default") conforming strictly to Section 7.1.1 of the ECMAScript Language Specification without triggering runtime type coercion.
Requirements
If input is an object, check for the presence of a callable method at input[Symbol.toPrimitive].
If hint is "string", try .toString(), then .valueOf().
If hint is "number" or "default", try .valueOf(), then .toString().
Throw a TypeError if neither returns a valid primitive.
Constraints
Return values must be checked against explicit primitive boundaries.
Part 2: Closures, Scopes & Functional Programming
8. Extended Partial Application with Position Independence
Difficulty: 🟡 Medium
Problem
Write a generalized curry(fn) function supporting out-of-order partial application via an exposed placeholder token curry._.
Requirements
When called with fewer non-placeholder arguments than fn.length, return a function expecting remaining arguments.
Subsequent calls must fill previously left open placeholder positions before appending to the end.
Example
const _ = curry._;
const sum = (a, b, c, d) => [a, b, c, d];
const curried = curry(sum);

curried(1, _, 3)(2, 4); // [1, 2, 3, 4]
curried(_, 2)(_, 4)(1, 3); // [1, 2, 3, 4]


What to Pay Attention To
Functions with default parameters or rest parameters report length properties that do not reflect total argument counts.
9. Multi-Strategy Evicting Cache (LRU/LFU)
Difficulty: 🔴 Advanced
Problem
Construct a memory-bounded memoization wrapper memoize(fn, options) supporting either Least Recently Used (LRU) or Least Frequently Used (LFU) eviction.
Requirements
options.strategy: "LRU" or "LFU".
options.capacity: Max number of cache records.
options.serializer: Custom argument serialization function.
All eviction and read operations must occur in \mathcal{O}(1) time.
Example
const cached = memoize(computeData, { strategy: 'LRU', capacity: 3 });


What to Pay Attention To
LFU requires breaking frequency ties using an access timestamp (LRU fallback).
Modifying references stored inside the cache must not corrupt internal eviction tracking lists.
10. Polyfill Function.prototype Mechanics
Difficulty: 🟡 Medium
Problem
Rebuild customCall, customApply, and customBind onto Function.prototype without using native invocation helpers (call, apply, bind, Reflect.apply).
Requirements
Set the execution receiver this properly inside the target function.
customBind instances must properly construct instances with new, allowing the dynamic instance to take precedence over the previously bound context.
Handle edge-case invocations where context is null or undefined by defaulting to globalThis.
Constraints
Avoid mutating caller properties permanently; clean up temporary references cleanly via Symbol().
11. Async Pipe & Compose Pipeline
Difficulty: 🟢 Easy
Problem
Write dynamic composition utilities pipe(...fns) and compose(...fns) that accept a mix of synchronous and asynchronous functions.
Requirements
pipe resolves functions left-to-right; compose resolves right-to-left.
Seamlessly unwrap intermediate Promises: if an intermediate function returns a Promise, pause execution until resolution before invoking the next function.
Forward initial multi-arity parameters to the first executed step.
Example
const add = (x, y) => x + y;
const asyncSquare = async x => x * x;
const pipeline = pipe(add, asyncSquare);
await pipeline(2, 3); // 25


12. Lexical Scope Trampoline Engine
Difficulty: 🟡 Medium
Problem
V8 does not support tail-call optimization. Build a generic trampoline(fn) runner that executes tail-recursive algorithms without growing the call stack.
Requirements
Provide a thunk(fn, ...args) wrapper to pause recursive calls.
The trampoline loop must repeatedly unwrap thunk steps iteratively until a terminal value is reached.
Example
const factorial = (n, acc = 1n) => {
  return n <= 1n 
    ? acc 
    : thunk(factorial, n - 1n, acc * n);
};
const safeFactorial = trampoline(factorial);
safeFactorial(50000n); // Computes without stack overflow


13. Deep Immutable Lens Accessor
Difficulty: 🔴 Advanced
Problem
Implement functional lenses via createLens(getter, setter).
Requirements
view(lens, store): Retrieve the focus of the lens.
set(lens, value, store): Return an updated copy of store with the target value replaced without mutating original references.
over(lens, fn, store): Apply a function to the target value and return a modified parent.
Provide a helper lensPath(pathArray) to generate lenses targeting arbitrary nested tree depths.
14. Event-Driven State Capsule
Difficulty: 🟡 Medium
Problem
Create a state enclosure createStore(reducer, preloadedState) mimicking Redux architecture from scratch.
Requirements
Methods: getState(), dispatch(action), subscribe(listener).
Listener un-subscription must be supported via returned teardown callbacks.
Disallowing actions from mutating state references directly; freeze the state or enforce pure return validation.
Throw if an action is dispatched while a reducer is actively computing.
Part 3: Object Systems, Prototypes & Metaprogramming
15. The new Operator Engine
Difficulty: 🟢 Easy
Problem
Write simulateNew(Constructor, ...args) that replicates the exact internal semantics of the JavaScript new operator.
Requirements
Create an object linked to Constructor.prototype.
Bind this to the newly allocated instance during constructor invocation.
If Constructor returns an object or a function, return that value; otherwise, return the newly created instance.
Edge Cases
Constructor explicitly returns a primitive value (e.g., return 42).
Constructor.prototype is null or a non-object.
16. Pure Prototypal Hierarchy (ES5 Semantics)
Difficulty: 🟡 Medium
Problem
Using only ES5 functions and Object.create, construct an inheritance relationship between an abstract Stream class and a concrete FileStream child.
Requirements
FileStream instances must satisfy instanceof FileStream and instanceof Stream.
Maintain correct constructor pointers (FileStream.prototype.constructor === FileStream).
Re-route parent constructor calls with dynamic parameters.
Provide a safe utility to invoke parent overridden methods without hardcoding parent names.
17. Deep Freezing with Cycle Detection
Difficulty: 🟡 Medium
Problem
Write a function deepFreeze(obj) that recursively freezes an object, its nested objects, arrays, functions, and symbols, preventing mutation, extension, or deletion.
Requirements
Utilize Object.freeze.
Prevent infinite loops on cyclic object graphs using a tracking set.
Handle nested Maps, Sets, and typed buffers appropriately.
Constraints
Must mutate the provided object in-place (per Object.freeze convention) and return it.
18. Deep Reactive Object Proxy
Difficulty: 🔴 Advanced
Problem
Construct an observability engine createReactive(target, callback) using ES6 Proxy and Reflect.
Requirements
Intercept property reads, assignments, and deletions at arbitrary depths.
Intercept Array prototype methods (push, pop, shift, unshift, splice, sort, reverse) so that mutations trigger the change callback accurately without duplicate alerts for .length changes.
Return wrapped proxies lazily on property access to minimize overhead.
Example
const data = createReactive({ items: [1, 2] }, (path, val) => {
  console.log(`Updated ${path} ->`, val);
});
data.items.push(3); // Logs: Updated items -> [1, 2, 3]


19. Transparent Revocable Forwarding Cache
Difficulty: 🟡 Medium
Problem
Implement createRevocableAccess(target, allowedDurationMs) that returns an access proxy and a hard-cutoff mechanism.
Requirements
Expose properties transparently until allowedDurationMs elapses.
After timeout expiration, all reads, writes, and calls on the proxy must throw a custom SecurityError.
Must allow manually forcing revocation prior to the timeout via an exposed .revoke() method.
20. Metaprogrammed Custom Iterator Collection
Difficulty: 🟡 Medium
Problem
Create a collection class Matrix representing a 2D grid that conforms to ECMAScript iteration and conversion protocols via Symbols.
Requirements
Implement [Symbol.iterator] to yield rows sequentially.
Implement [Symbol.toPrimitive](hint) to return row/col dimensions for hint "number" and formatted ASCII grids for hint "string".
Override [Symbol.hasInstance] to validate structural matrix shapes instead of reference prototypes.
21. Object Structural Schema Diff
Difficulty: 🔴 Advanced
Problem
Write a function diffObjects(base, target) that returns an array of structured changes between two arbitrarily complex nested objects.
Requirements
Classify operations: "CREATE", "UPDATE", "DELETE".
Output format: { op: string, path: string, oldValue?: any, newValue?: any }.
Track array mutation positions correctly (index updates).
Part 4: Asynchronous Engines, Promises & Concurrency
22. Compliant Promise/A+ Core
Difficulty:  Advanced
Problem
Implement a fully functional MyPromise class conforming to the Promises/A+ Specification without delegating to the native Promise API.
Requirements
Maintain states: PENDING, FULFILLED, REJECTED.
Methods: .then(onFulfilled, onRejected), .catch(onRejected), .finally(callback).
Ensure callbacks execute asynchronously via microtasks (queueMicrotask or MutationObserver).
Implement the comprehensive Promise Resolution Procedure ([[Resolve]](promise, x)).
Constraints
Throw TypeError if a promise resolves to its own instance.
23. Bounded Concurrency Task Pool
Difficulty: 🟡 Medium
Problem
Write an async orchestration function asyncPool(concurrencyLimit, tasks, iteratorFn) that schedules tasks concurrently without exceeding concurrencyLimit active running tasks.
Requirements
Return a Promise that resolves with an array containing task results in their original order.
As soon as one running task resolves or rejects, immediately pull the next task from the backlog.
If a task rejects, fail fast and reject the parent execution immediately unless configured to settle.
Example
const tasks = [1000, 200, 300, 50];
const results = await asyncPool(2, tasks, ms => sleep(ms).then(() => ms));


24. Promise Static Combinators from Scratch
Difficulty: 🟡 Medium
Problem
Implement native static combinators on a custom class: all, allSettled, race, any without calling native Promise combinators.
Requirements
all: Short-circuits on first rejection; resolves array of values.
allSettled: Waits for all inputs to settle; resolves array of outcome objects { status, value/reason }.
race: Settles with the state and value of the first settling promise.
any: Resolves with the first fulfilled promise; rejects with an AggregateError if all inputs reject.
Edge Cases
Handling non-promise elements passed within input iterables.
Passing empty arrays (Promise.all([]) must resolve immediately).
25. Exponential Backoff with Jitter and Abort Signal
Difficulty: 🔴 Advanced
Problem
Write a hardened request runner retryWithBackoff(taskFn, options) that executes flaky asynchronous functions safely.
Requirements
options.maxRetries: Maximum retry iterations.
options.baseDelay: Starting delay millisecond count.
options.maxDelay: Ceiling delay.
options.jitter: Random variance applied to backoff time: \text{delay} = \min(\text{maxDelay}, \text{baseDelay} \times 2^{\text{attempt}}) + \text{randomJitter}.
Support immediate cooperative cancellation via an AbortSignal instance.
26. Dynamic Rate Limiter: Sliding Window Log
Difficulty: 🔴 Advanced
Problem
Implement a client-side rate limiter class SlidingWindowLimiter(limit, windowMs).
Requirements
Method throttle(fn): Enqueues execution of fn if under the limit, or delays execution until the rolling window clears enough space.
Accurately purge timestamps older than now - windowMs.
Must not use periodic polling intervals (setInterval); resolve wake-ups deterministically using targeted setTimeout schedules.
27. Async Generator Stream Interleaver
Difficulty: 🔴 Advanced
Problem
Write an async generator interleaveAsync(...asyncIterables) that consumes multiple async streams simultaneously and yields items as soon as they produce data.
Requirements
Maintain true parallel consumption: a slow async iterator must not block faster iterables from yielding data.
Gracefully close all iterables if the consuming loop breaks prematurely.
28. Event Loop Turn Yielding Scheduler
Difficulty: 🟡 Medium
Problem
Long computational loops freeze browser responsiveness. Implement a scheduling utility yieldToMain(thresholdMs = 16) that periodically yields execution back to the host platform.
Requirements
Track loop iteration time.
If duration exceeds thresholdMs, yield execution to the macrotask queue via scheduler.yield() or MessageChannel before resuming loop calculations.
29. Promisify Supporting Complex Callback Signatures
Difficulty: 🟢 Easy
Problem
Write a generalized promisify(fn, multiArgs = false) that transforms standard Node.js error-first callback APIs into Promise-returning functions.
Requirements
If multiArgs is true, resolve with an array of all parameters passed beyond the error parameter.
Preserve the execution context this on the returned wrapper.
Part 5: Data Structures & Algorithms (JavaScript Specific)
30. Bi-directional O(1) Map
Difficulty: 🟡 Medium
Problem
Implement a dual-key index map BiMap that allows bidirectional key-to-value and value-to-key lookups.
Requirements
Methods: set(key, val), get(key), getKey(val), delete(key), deleteValue(val).
Ensure all lookup and mutation operations run in \mathcal{O}(1) average time complexity.
Maintain total mapping synchronization: if an existing value is reassigned to a new key, old associations must be purged.
31. Memory-Conscious Flat Graph Circularity Checker
Difficulty: 🟡 Medium
Problem
Write a function detectCycles(graph) that takes an adjacency list object and determines if the directed graph contains cycles.
Requirements
If a cycle exists, return the exact cycle sequence array (['A', 'B', 'C', 'A']); otherwise return null.
Implement depth-first search using three-color marking (White, Gray, Black) to achieve linear time complexity \mathcal{O}(V + E).
32. Fixed-Size Circular Ring Buffer
Difficulty: 🟡 Medium
Problem
Construct a high-performance fixed-capacity data structure CircularBuffer(capacity) without dynamic array resizing.
Requirements
Methods: push(item) (overwrites oldest value if full), shift() (removes and returns oldest value), peek(), isFull(), isEmpty().
Use a single pre-allocated array of fixed length internally with moving head and tail indices.
Operations must run in strict \mathcal{O}(1) time.
33. Binary Min-Heap Priority Queue
Difficulty: 🔴 Advanced
Problem
Write a PriorityQueue class using an array-backed binary tree structure.
Requirements
Methods: enqueue(item, priority), dequeue(), peek(), size().
Run operations in \mathcal{O}(\log n) insertion and extraction time.
Queue ordering must remain stable: items added with identical priorities must be dequeued in First-In, First-Out (FIFO) order.
34. Trie Dictionary with Prefix Autocomplete
Difficulty: 🟡 Medium
Problem
Implement an ES6 Trie class SearchTrie that stores string entries and searches prefixes efficiently.
Requirements
Methods: insert(word), hasWord(word), hasPrefix(prefix), findWordsWithPrefix(prefix).
Method findWordsWithPrefix must return an array of all matches sorted by length, then lexicographically.
35. High-Density BitSet via TypedArrays
Difficulty: 🔴 Advanced
Problem
Implement a memory-efficient BitSet(size) using a Uint32Array buffer to track up to 10^7 discrete boolean states.
Requirements
Methods: set(bitIndex), clear(bitIndex), get(bitIndex), toggle(bitIndex).
Use 32-bit integer bit-shifting: determine the target array index via bitIndex >> 5 and bitwise offset via bitIndex & 31.
Verify memory consumption remains a fraction of an equivalent native Set or boolean Array.
36. Disjoint Set Union (Union-Find)
Difficulty: 🟡 Medium
Problem
Build a DisjointSet class for tracking partitioning sets with Path Compression and Union by Rank optimizations.
Requirements
Methods: union(a, b), find(a), connected(a, b).
Operations must run in near-linear amortized time \mathcal{O}(\alpha(n)).
37. Sparse Matrix Representation
Difficulty: 🟡 Medium
Problem
Implement a memory-efficient SparseMatrix(rows, cols) using hash map structures to handle large dimensions (e.g., 10^6 \times 10^6) where the vast majority of cells contain zero.
Requirements
Methods: set(r, c, val), get(r, c), multiplyVector(vectorArray).
Storing or accessing default values (0) must not allocate memory records.
Part 6: DOM Architecture, Browsers & Performance
38. Declarative Virtual DOM Node Mount Engine
Difficulty: 🔴 Advanced
Problem
Build a minimal Virtual DOM renderer mount(vNode, container) that parses recursive Virtual Node representations into genuine DOM elements.
Requirements
VNode schema: { type: string, props: Record<string, any>, children: Array<VNode|string> }.
Securely create and attach attributes and properties without evaluating script strings.
Register event listeners specified within props (e.g., props: { onClick: fn }).
39. Event Delegation Dispatch Center
Difficulty: 🟡 Medium
Problem
Write a lightweight DOM delegation dispatcher delegate(rootElement, eventType, selector, callback) that captures events dynamically.
Requirements
Trigger callback only when an event originates from, or bubbles through, an element matching the CSS selector.
Supply the matched element as this context to callback.
Respect event.stopPropagation() by halting calls up parent delegate hierarchies.
40. Core Virtual List Range Computer
Difficulty: 🔴 Advanced
Problem
Implement the core mathematical coordinate mapper for a virtualized list computeVirtualWindow(params).
Requirements
Parameters: scrollTop, viewportHeight, itemHeight, totalItems, overscanCount.
Return: { startIndex, endIndex, offsetY, totalHeight }.
Time complexity must be \mathcal{O}(1).
41. Pointer Tracking Drag-and-Drop Controller
Difficulty: 🔴 Advanced
Problem
Construct a headless drag manager createDraggable(element, callbacks) using native Pointer Events.
Requirements
Manage cursor coordinates using setPointerCapture so dragged frames don't drop tracking when leaving viewport edges.
Prevent default touch actions (touch-action: none) dynamically.
Compute delta translations relative to the initial pointer contact point.
42. DOM Structural Tree Diffing Engine
Difficulty:  Advanced
Problem
Implement a reconciliation algorithm diffAndPatch(oldNode, newNode) that computes mutations between two Virtual DOM trees and applies updates directly to the live DOM.
Requirements
Support updating changed attributes without replacing parent nodes.
Reorder, insert, and delete keyed children efficiently.
Replace entire subtrees when node types differ.
43. Layout Thrashing Elimination Engine
Difficulty: 🟡 Medium
Problem
Write a batch DOM mutation scheduler DOMScheduler that groups DOM reads and writes into discrete animation frames.
Requirements
Methods: read(fn), write(fn).
Batch all scheduled reads inside the current frame via requestAnimationFrame before executing any writes, preventing repeated Reflow/Layout thrashing.
Part 7: Node.js, Streams & Systems Internals
44. Enterprise EventEmitter with Namespaces
Difficulty: 🟡 Medium
Problem
Write an EventEmitter implementation that supports hierarchical namespaced event strings.
Requirements
Methods: on(pattern, fn), off(pattern, fn), emit(event, ...args), once(pattern, fn).
Support wildcards: Subscribing to "order.*" triggers on "order.created" and "order.shipped". Subscribing to "**" captures all events.
Warn or throw when more than 15 listeners attach to a single pattern key.
45. Chunk-Safe Streaming CSV to JSON Transformer
Difficulty: 🔴 Advanced
Problem
Implement a Node.js Transform stream CSVToJSONStream that safely processes continuous binary streams of CSV rows.
Requirements
Handle arbitrary chunk boundaries that slice across records or lines without corrupting output.
Parse headers from the first line dynamically to construct JSON object keys.
Honor backpressure: pause upstream consumption if downstream consumers report full buffers.
46. Dedicated Worker Task Pool
Difficulty:  Advanced
Problem
Build an asynchronous worker cluster manager WorkerPool(scriptPath, poolSize) utilizing Node.js worker_threads.
Requirements
Distribute CPU-heavy processing jobs across idle worker threads.
Queue incoming tasks if all worker threads are occupied.
Automatically spawn a replacement thread if a worker crashes due to an unhandled exception.
47. Recursive Directory Tree Streaming Tracer
Difficulty: 🟡 Medium
Problem
Write an async generator walkDir(dirPath) that traverses deeply nested file system trees using Node.js fs.promises.
Requirements
Yield file metadata objects lazily without loading the entire folder tree into memory at once.
Prevent infinite loops caused by cyclical symbolic links.
48. Zero-Copy Binary Buffer Serializer
Difficulty: 🔴 Advanced
Problem
Implement a binary serialization protocol for structured telemetry payloads using Node.js Buffer or DataView.
Requirements
Encode payloads { timestamp: number, sensorId: number, readings: number[] } into a compact contiguous binary representation.
Read binary buffers back into JavaScript objects without decoding to intermediate string formats.
Part 8: Security, Defensive Coding & Sandboxing
49. Recursive Deep Merge with Prototype Pollution Guard
Difficulty: 🟡 Medium
Problem
Write a deep object merger safeMerge(target, source) that recursively merges attributes while mitigating prototype pollution attacks.
Requirements
Strip or block malicious property keys: __proto__, constructor, prototype.
Clone nested structures cleanly instead of copying references.
50. Token-Based Object Revocation Gateway
Difficulty: 🟡 Medium
Problem
Build a capability-based security vault createRestrictedGateway(apiObject, allowedKeys) using Proxy.
Requirements
Block reads or modifications to properties outside the allowedKeys whitelist.
Disallow walking up the prototype chain to access constructor utilities.
51. AST Code Sanitizer
Difficulty:  Advanced
Problem
Write a code inspection filter verifyNoEval(codeString) using an AST parser (or regularized lexical pass) that checks JavaScript code for dynamic execution threats.
Requirements
Detect and flag occurrences of eval(), new Function(), setTimeout(string), and dynamic import() calls.
Detect property-based escapes like window["ev"+"al"].
52. Safe Mathematical Expression Evaluator
Difficulty: 🔴 Advanced
Problem
Implement an algebraic evaluator evaluateMath(expr, scope) that computes arithmetic expressions without calling eval or new Function.
Requirements
Parse tokens, build an Abstract Syntax Tree (or parse via Shunting-Yard algorithm), and evaluate operations: +, -, *, /, ^, parentheses.
Resolve custom variable names supplied via the scope dictionary.
Part 9: Real-World Software Engineering Scenarios
53. Transaction Ledger with Savepoints and Rollbacks
Difficulty: 🔴 Advanced
Problem
Implement an in-memory transactional record store TransactionStore that guarantees atomic mutations.
Requirements
Methods: set(key, val), get(key), begin(), commit(), rollback(), savepoint(name), rollbackTo(name).
Support arbitrarily nested transactions: changes made in an inner transaction can be rolled back without invalidating outer operations.
54. Front-End Telemetry Beacon Collector
Difficulty: 🟡 Medium
Problem
Build a front-end batching engine TelemetryCollector(options) to queue analytics events.
Requirements
Flush batches automatically when the queue hits 25 events, or every 5000ms.
Send payloads via navigator.sendBeacon if available; fallback to fetch with keepalive: true.
Store pending events in localStorage on page unload to prevent data loss.
55. Token Bucket Rate Limiter
Difficulty: 🟡 Medium
Problem
Construct a stateful rate limiter TokenBucket(capacity, refillRatePerSec).
Requirements
Method consume(tokens): Returns true if sufficient tokens exist, deducting them from the balance; otherwise returns false.
Calculate token replenishment lazily on invocation without using background setInterval timers.
56. Deep Structural Schema Validator
Difficulty: 🔴 Advanced
Problem
Implement a declarative object schema validation library createValidator(schema).
Requirements
Support types: string, number, boolean, array, object.
Support constraints: required, min, max, pattern, custom.
Return validation results: { valid: boolean, errors: Array<{ field, message }> }.
57. Undo/Redo State Manager with Structural Sharing
Difficulty: 🔴 Advanced
Problem
Build a state history manager HistoryManager(initialState) that provides undo/redo capabilities without deep-cloning entire state snapshots on every update.
Requirements
Methods: set(newState), undo(), redo(), getState().
Use structural sharing or patch diffs to maintain an immutable history tree with low memory overhead.
58. Dependency Injection Container
Difficulty: 🔴 Advanced
Problem
Write an IoC (Inversion of Control) service container Container.
Requirements
Methods: register(name, definition, options), resolve(name).
Support service lifecycles: "transient" (new instance per resolution) and "singleton" (shared instance).
Automatically resolve transitive dependencies by inspecting constructor arguments or parameter lists.
Detect circular dependencies and throw descriptive errors.
59. Event-Sourced Entity Model
Difficulty: 🔴 Advanced
Problem
Implement an event-sourced aggregate class BankAccount.
Requirements
Methods: deposit(amount), withdraw(amount), getEvents(), replay(eventsList).
Aggregate state (current balance) must be calculated exclusively by replaying atomic events.
60. Pluggable Middleware Runner
Difficulty: 🟡 Medium
Problem
Write a composable middleware runner MiddlewareStack matching the execution model of Koa/Express.
Requirements
Method use(fn): Enqueues middleware shaped as (context, next) => Promise<void>.
Method run(context): Executes middleware sequentially along the onion model (downstream execution, then upstream unwinding).
Part 10: Performance Optimization & Low-Level Patterns
61. Monomorphic Inline Cache Profiler
Difficulty: 🔴 Advanced
Problem
Demonstrate V8's Inline Caching (IC) behavior programmatically.
Requirements
Construct two benchmark scenarios that perform identical operations on an array of objects: one maintaining monomorphic hidden classes (shapes), and one deliberately inducing megamorphic access patterns (> 4 shapes).
Measure and explain the throughput differences.
62. Zero-Allocation Object Pool
Difficulty: 🟡 Medium
Problem
Implement an ObjectPool(factoryFn, resetFn, initialSize) utility to manage reusable data structures in high-throughput loops.
Requirements
Methods: acquire(), release(instance).
Pre-allocate a contiguous array buffer to avoid triggering runtime Garbage Collection (GC) pauses.
63. Fast String Matching (Boyer-Moore-Horspool)
Difficulty: 🔴 Advanced
Problem
Implement the Boyer-Moore-Horspool string search algorithm fastSearch(text, pattern).
Requirements
Preprocess the search pattern to build a bad-character shift table.
Skip across the text string during scanning to outperform naive \mathcal{O}(n \times m) lookups.
64. Off-Thread Computation Pipeline
Difficulty: 🔴 Advanced
Problem
Build an asynchronous data pipeline that moves heavy parsing jobs to a Web Worker via dynamic Blob URLs.
Requirements
Serialize function code and spin up workers dynamically using URL.createObjectURL(new Blob([code])).
Resolve data processing results via native Promises.
Part 11: Production-Grade Challenges (65–100)
65. AST Arrow-Function Transpiler Core
Difficulty:  Advanced
Implement an AST tree walker that transforms ES6 arrow functions into ES5 function expressions while safely preserving this bindings via lexical variable injection.
66. Headless Table Virtualization Engine
Difficulty: 🔴 Advanced
Write a 2D coordinate window calculator that computes visible rows and columns simultaneously for grids with dynamic cell dimensions.
67. Circular Dependency Resolver for Bundlers
Difficulty: 🔴 Advanced
Build an algorithm that traces module import trees, extracts circular dependency chains, and returns a topological build order.
68. Dynamic CSS-in-JS Style Sheet Manager
Difficulty: 🟡 Medium
Build a style injector that generates atomic CSS class names from JavaScript objects, prevents duplicate class declarations, and injects rules via CSSStyleSheet.prototype.insertRule.
69. High-Precision Debounce and Throttle Hybrid
Difficulty: 🟡 Medium
Write an execution rate controller with options: { leading: boolean, trailing: boolean, maxWait: number }.
70. Micro-Task Queue Scheduler Polyfill
Difficulty: 🟡 Medium
Build safeQueueMicrotask(fn) using environment-specific fallbacks (queueMicrotask, MutationObserver, process.nextTick, MessageChannel).
71. Tagged Template SQL Sanitizer
Difficulty: 🟢 Easy
Write an ES6 tagged template function sql that automatically parameterizes interpolated variables to prevent SQL injection vulnerabilities.
72. Immutable State Update Engine (Mini-Immer)
Difficulty:  Advanced
Build a state modification utility produce(baseState, recipeFn) that tracks mutations on proxy objects and outputs a frozen, structurally shared state tree.
73. Circuit Breaker Resilience Gateway
Difficulty: 🟡 Medium
Implement a stateful Circuit Breaker pattern with CLOSED, OPEN, and HALF-OPEN states to protect against failing remote service calls.
74. Structural Type Matcher
Difficulty: 🟡 Medium
Create a runtime pattern-matching utility match(value).with(pattern, handler) that matches primitive values, regexes, and nested object shapes.
75. Bidirectional Infinite List Scroller
Difficulty: 🔴 Advanced
Implement coordinate calculation logic for infinite feeds that append new items to the bottom and prepend older items to the top without causing scroll jumping.
76. WebSocket Connection Lifecycle Supervisor
Difficulty: 🔴 Advanced
Build an enterprise WebSocket wrapper providing automatic heartbeat checks, message queuing during network disconnects, and reconnect backoff logic.
77. Inverted Index Full-Text Search Engine
Difficulty: 🔴 Advanced
Write an in-memory search indexer supporting tokenization, stop-word removal, stemming, and TF-IDF relevance scoring.
78. Reactive Form State Machine
Difficulty: 🟡 Medium
Implement a headless form engine that tracks dirty states, touched states, synchronous/asynchronous validations, and field dependency chains.
79. WeakRef-Driven Memoization Engine
Difficulty: 🔴 Advanced
Implement an in-memory cache leveraging WeakRef and FinalizationRegistry to allow garbage collection of values during high memory pressure.
80. Real-Time Collaborative Conflict Resolution (OT/CRDT)
Difficulty:  Advanced
Implement a basic Operational Transformation (OT) or Conflict-free Replicated Data Type (CRDT) engine for synchronizing concurrent text edits.
81. Safe Sandboxed Code Runner
Difficulty:  Advanced
Build an isolated script runner using Proxy, with, and detached iframe environments that prevents scripts from escaping into the global context.
82. Custom Binary Search Tree with ES Iteration Protocol
Difficulty: 🟡 Medium
Implement an AVL Tree (self-balancing binary search tree) that supports the [Symbol.iterator] protocol to yield keys in sorted order.
83. Multi-Channel Pub/Sub Broker
Difficulty: 🟡 Medium
Create an asynchronous message broker supporting topic subscriptions, message filtering, dead-letter queues, and acknowledgement receipts.
84. HTTP Cookie Header Parser & Serializer
Difficulty: 🟢 Easy
Implement an RFC 6265 compliant cookie string parser and builder that handles SameSite, HttpOnly, and Secure attributes cleanly.
85. Dynamic Graph Shortest Path (Dijkstra)
Difficulty: 🟡 Medium
Implement Dijkstra’s shortest path algorithm over weighted directed graphs using your custom Priority Queue.
86. Resilient Polling Worker
Difficulty: 🟡 Medium
Write an async poller that fetches an API resource periodically, automatically backing off on HTTP 429/503 responses and pausing when browser tabs blur.
87. Lazy Evaluation Sequence Generator
Difficulty: 🟡 Medium
Build a functional lazy sequence library Seq.from(iterable).map().filter().take() that defers computation until explicitly consumed.
88. Micro-Frontends Event Bus
Difficulty: 🟡 Medium
Implement an event communication layer that allows detached micro-applications to exchange data across custom window event boundaries without direct references.
89. Observable Reactive Spreadsheet Matrix
Difficulty:  Advanced
Build an in-memory spreadsheet engine that parses basic formulas ("=A1 + B2"), tracks cell dependencies via a directed graph, and updates affected cells.
90. Topological Package Dependency Resolver
Difficulty: 🟡 Medium
Build a package installation graph resolver that takes package dependency lists and computes an installation order, detecting unsolvable version conflicts.
91. Client-Side Hash Router from Scratch
Difficulty: 🟢 Easy
Implement an SPA router supporting dynamic path matching (/users/:id), navigation guards, and back/forward navigation using window.onpopstate.
92. Async Semaphore Primitive
Difficulty: 🟡 Medium
Build a synchronization primitive Semaphore(maxPermits) that coordinates access to a finite set of shared resources across concurrent promises.
93. Key-Value Storage with Time-To-Live (TTL)
Difficulty: 🟡 Medium
Build an in-memory key-value cache that expires records after a specific duration, using passive checks on read and active background pruning cycles.
94. JSON Patch Engine (RFC 6902)
Difficulty: 🔴 Advanced
Implement an RFC 6902 compliant JSON patch evaluator supporting operations: add, remove, replace, move, copy, and test.
95. Chunked Array Pipeline Processor
Difficulty: 🟡 Medium
Write a utility that processes arrays of 10^6 items in non-blocking slices using requestIdleCallback or setTimeout.
96. Cross-Tab Shared State Sync
Difficulty: 🔴 Advanced
Implement a synchronized multi-tab state store that coordinates writes and state synchronization across multiple open browser windows via BroadcastChannel or localStorage.
97. Custom Regular Expression NFA Matcher
Difficulty:  Advanced
Implement a basic Thompson's Non-deterministic Finite Automaton (NFA) engine that matches simple regex patterns containing ., *, and character groups.
98. Asynchronous Barrier Synchronization
Difficulty: 🟡 Medium
Construct a Barrier(participantCount) synchronization primitive that halts tasks until a fixed number of workers reach the barrier gate.
99. In-Memory Search Engine with Inverted Index and Query Parser
Difficulty: 🔴 Advanced
Build an advanced in-memory search engine that supports Boolean queries (term1 AND term2 OR (term3 NOT term4)) over tokenized documents.
100. Full Reactive Application Architecture
Difficulty:  Advanced
Build a cohesive micro-framework from scratch: combine a reactive state store (using Proxies), an async microtask batcher, a virtual DOM tree differ, and an event delegation system into an interactive todo-list application running in the browser.
🏆 Engineering Verification Checklist
[ ] I can write all code from scratch without looking up tutorial implementations.
[ ] I can identify and handle edge cases (e.g., circular graphs, prototype boundaries, IEEE-754 precision).
[ ] I understand the precise algorithmic time and space complexity (\mathcal{O}) of every solution.
[ ] I know how the underlying runtime (V8, Event Loop, Libuv) executes my implementation.
[ ] I can defend my architectural trade-offs in an engineering interview setting.

