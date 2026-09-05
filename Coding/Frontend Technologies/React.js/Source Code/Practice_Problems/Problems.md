# React Mastery Question Bank: Core Mechanics, Syntax, and Architecture

A structured collection of 100 practice problems targeting React mechanics, state lifecycles, rendering pipelines, hook internals, reconciliation, and architectural edge cases.

---

## Level 1: JSX, Props, and Pure Rendering Mechanics

### 1. The Dynamic Fragment Mapper
**Difficulty:** 🟢 Easy

#### Problem
Build a component `UserProfileCard` that renders a user's details without creating extraneous wrapper DOM nodes (such as redundant `<div>` tags), handling missing optional fields cleanly.

#### Requirements
- Render full name as an `<h2>`.
- Render user biography as a `<p>`.
- Render an array of string tags as inline `<span>` elements separated by a bullet character (`•`), without leaving a trailing separator at the end.
- Use explicit React Fragment syntax (`<React.Fragment>`) with keys where required, and shorthand syntax (`<>...</>`) elsewhere.

#### Given
- `name`: string (required)
- `bio`: string (optional, defaults to `"No biography provided."`)
- `tags`: array of strings (`["Engineer", "Remote", "React"]`)

#### Expected UI
- Valid semantic HTML structure without unnecessary wrapper tags.
- Missing `bio` renders fallback text.
- Tags render cleanly: `Engineer • Remote • React`.

#### Edge Cases
- Empty `tags` array: render nothing for the tags section.
- `tags` with a single element: render without the separator.
- `bio` passed as empty string `""`: treat as missing and show fallback.

#### Concepts Practiced
- JSX expressions
- `React.Fragment` keying vs. shorthand
- Conditional rendering
- Array mapping without trailing artifacts

#### What to Pay Attention To
- Do not add an outer container `<div>` if the consumer inserts this directly into a CSS Grid or Flex container.
- Ensure the delimiter does not break screen reader parsing.

#### Common Mistakes
- Using array index as key when mapping fragments that contain delimiters.
- Leaving a trailing delimiter after the final mapped item.

---

### 2. Strict Conditional Slot Renderer
**Difficulty:** 🟢 Easy

#### Problem
Construct a component `StatusBanner` that conditionally renders one of five distinct alert layouts based on a numeric HTTP status code, strictly avoiding the common `0` rendering bug in JSX.

#### Requirements
- Accept prop `unreadCount: number`.
- Accept prop `statusCode: number`.
- Render `unreadCount` badge only when count is greater than zero.
- Do not use nested ternary operators (`? : ? :`).
- Implement an explicit dictionary-based or pattern-matched slot execution pattern.

#### Given
- Props: `{ statusCode: 200 | 400 | 401 | 403 | 500, unreadCount: number }`

#### Expected Behavior
- If `unreadCount` is `0`, render strictly nothing for the badge (not the text `"0"`).
- Render status-specific message:
  - 200: `"Success"`
  - 400: `"Bad Request"`
  - 401: `"Unauthorized"`
  - 403: `"Forbidden"`
  - 500: `"Internal Server Error"`
  - Any other: `"Unknown Status"`

#### Edge Cases
- `unreadCount = 0`: UI must not display the digit `0`.
- Unrecognized numeric status codes must fall back safely.

#### Concepts Practiced
- Falsy evaluations in JSX (`&&` pitfalls)
- Declarative pattern matching in render logic
- Null rendering (`return null`)

#### What to Pay Attention To
- In JavaScript, `0 && <Component/>` evaluates to `0`, which React renders into the DOM as text node `"0"`.

#### Common Mistakes
- Writing `{count && <Badge/>}` instead of `{count > 0 && <Badge/>}`.

---

### 3. Deep Props Destructuring and Default Guarantees
**Difficulty:** 🟢 Easy

#### Problem
Write a presentational layout component `DataGrid` that consumes deeply nested configuration objects while guaranteeing fallback values without mutating input props.

#### Requirements
- Consume a `config` object structured as: `{ pagination: { page: number, pageSize: number }, styling: { theme: string, dense?: boolean } }`.
- Provide default values at the destructuring boundary: `page = 1`, `pageSize = 25`, `dense = false`, `theme = 'light'`.
- Guarantee that if `styling` is passed as `undefined`, the application does not throw a `TypeError`.

#### Edge Cases
- Passing `config={{ pagination: undefined, styling: undefined }}` must resolve safely.
- Passing `config={null}` should be handled gracefully via fallback or prop assertion.

#### Concepts Practiced
- Parameter-level destructuring in functional components
- Immutable default value assignment
- Defending against undefined nested shapes

#### What to Pay Attention To
- Default assignment syntax in ES6 does not trigger on `null`, only on `undefined`.

---

### 4. Raw HTML Sanitization Boundary
**Difficulty:** 🟢 Easy

#### Problem
Create a component `RichArticleBody` that takes an arbitrary HTML string from an external API and renders it safely, strictly separating untrusted markup from trusted presentation chrome.

#### Requirements
- Accept prop `trustedHtml: string`.
- Use the appropriate React API for rendering raw markup (`dangerouslySetInnerHTML`).
- Wrap the execution in an explicit wrapper that attaches an accessible role `article`.
- Ensure child elements cannot be passed via `children` simultaneously (enforce mutually exclusive props).

#### Edge Cases
- Empty string `""` passed as HTML.
- Malformed HTML strings (e.g., unclosed tags).

#### Concepts Practiced
- Virtual DOM bypassing
- `dangerouslySetInnerHTML` mechanics
- API contract enforcement

#### Common Mistakes
- Passing children along with `dangerouslySetInnerHTML`, which results in a React runtime warning and ignored children.

---

### 5. Polymorphic Typography Primitive
**Difficulty:** 🟡 Medium

#### Problem
Implement a base component `Text` that can change its underlying semantic DOM node (e.g., `h1`, `p`, `span`, `label`) dynamically based on an `as` prop, preserving all standard HTML attributes for that specific element.

#### Requirements
- Accept prop `as`: string or component identifier (defaults to `"span"`).
- Forward all standard DOM attributes (e.g., `className`, `id`, `onClick`, ARIA attributes) down to the selected element.
- Ensure children are correctly positioned within the rendered tag.

#### Given
```jsx
<Text as="h1" className="title">Main Title</Text>
<Text as="label" htmlFor="input-1">Input Label</Text>
```

#### Expected UI
- `<h1 class="title">Main Title</h1>`
- `<label for="input-1">Input Label</label>`

#### Concepts Practiced
- Dynamic JSX tags (`const Component = as || 'span'`)
- Rest property forwarding (`...rest`)
- Polymorphic component design

#### Things to Think About
- Why must dynamic JSX component variables begin with a capital letter?

---

### 6. Children Manipulation via React.Children.map
**Difficulty:** 🟡 Medium

#### Problem
Create an `AccordionGroup` component that intercepts its `children`, verifies that every child is an `AccordionItem`, and automatically injects an `index` prop and a shared `isOpen` boolean to each child without requiring manual prop passing from the consumer.

#### Requirements
- Inspect `props.children` using `React.Children.map`.
- Use `React.cloneElement` to inject `index` and `isOpen`.
- If an invalid element (such as plain text or a `<div>`) is passed as a child, render it unmodified or safely bypass injection.

#### Edge Cases
- Single child passed (not wrapped in an array).
- `null` or boolean expressions inside children (e.g., `{showExtra && <AccordionItem/>}`).

#### Concepts Practiced
- `React.Children` utilities
- `React.isValidElement`
- `React.cloneElement` mechanics and trade-offs

#### What to Pay Attention To
- Cloning elements breaks prop transparency and can make code harder to trace. Know when this pattern is appropriate versus using Context.

---

### 7. Output Prediction: Re-rendering Rules
**Difficulty:** 🟢 Easy

#### Question
Given the following code snippet:

```jsx
function Child({ count }) {
  console.log("Child rendered");
  return <div>{count}</div>;
}

function Parent() {
  const [count, setCount] = useState(0);
  const [text, setText] = useState("");
  console.log("Parent rendered");

  return (
    <div>
      <input value={text} onChange={(e) => setText(e.target.value)} />
      <button onClick={() => setCount(c => c + 1)}>Increment</button>
      <Child count="{count}"/>
    </div>
  );
}
```

1. What gets logged to the console on initial mount?
2. What gets logged to the console when the user types a single character into the input?
3. Why does `Child` execute even though its prop `count` has not changed?
4. How does React determine whether to re-render a child component in standard (non-memoized) conditions?

---

### 8. Debugging: The Broken List Key
**Difficulty:** 🟢 Easy

#### Buggy Code
```jsx
function ItemList({ items }) {
  return (
    <ul>
      {items.map((item, index) => (
        <li key={index}>
          <input defaultValue={item.name} />
          <button onClick={() => deleteItem(index)}>Delete</button>
        </li>
      ))}
    </ul>
  );
}
```

#### Task
1. Identify the visual bug that occurs when the user deletes the first item in the list.
2. Explain why React's reconciliation algorithm preserves the incorrect input value.
3. Fix the bug without removing uncontrolled inputs.
4. Explain the performance implications of changing the key to a stable identifier.

---

### 9. Output Prediction: Object References in Props
**Difficulty:** 🟢 Easy

#### Question
```jsx
const Header = React.memo(function Header({ config }) {
  console.log("Header rendered");
  return <h1>{config.title}</h1>;
});

function Dashboard() {
  const [tick, setTick] = useState(0);

  return (
    <div>
      <button onClick={() => setTick(t => t + 1)}>Tick</button>
      <Header "Admin Portal" config="{{" title: }}/>
    </div>
  );
}
```
1. Explain what happens when the `Tick` button is clicked.
2. Does `Header` re-render? Why or why not?
3. What is the fundamental mechanism used by `React.memo` for prop comparison?

---

### 10. Refactoring: Declarative Layout Composition
**Difficulty:** 🟡 Medium

#### Poorly Designed Code
```jsx
function Modal({ title, bodyText, showFooter, confirmText, cancelText, onConfirm, onCancel, showIcon, iconType }) {
  return (
    <div className="modal">
      <div className="header">
        {showIcon && <span className={`icon ${iconType}`} />}
        <h2>{title}</h2>
      </div>
      <div className="body"><p>{bodyText}</p></div>
      {showFooter && (
        <div className="footer">
          <button onClick={onCancel}>{cancelText}</button>
          <button onClick={onConfirm}>{confirmText}</button>
        </div>
      )}
    </div>
  );
}
```

#### Task
Refactor this monolithic component into a compound composition pattern using subcomponents (`Modal.Header`, `Modal.Body`, `Modal.Footer`, `Modal.Action`).
- Preserve the ability to omit the footer entirely.
- Allow arbitrary React nodes in the body without adding new string props.
- Ensure the parent modal maintains structure while granting consumers complete layout flexibility.

---

# 🧠 Checkpoint 1
Before continuing, ensure you can:
- Articulate precisely how JSX maps to `React.createElement` or the modern JSX transform (`_jsx`).
- Explain why indices as keys cause structural and state-preservation failures in lists.
- Identify the exact mechanism by which a component re-renders: component state change vs. parent render vs. prop change.

---

## Level 2: State Lifecycle, Immutability, and Controlled Interactions

### 11. The Nested Object State Updater
**Difficulty:** 🟢 Easy

#### Problem
Create a component managing a user profile form with a multi-level state structure. You must update nested properties without mutating existing state objects or losing sibling state values.

#### Requirements
- State schema:
  ```ts
  {
    username: string,
    profile: {
      bio: string,
      preferences: {
        theme: "light" | "dark",
        notifications: boolean
      }
    }
  }
  ```
- Implement an event handler `toggleNotifications()` that strictly flips `notifications` while keeping `theme`, `bio`, and `username` intact.
- Do not use third-party immutability libraries.

#### Edge Cases
- Ensure intermediate references are renewed only down the branch that changed; unrelated siblings must retain reference identity.

#### Concepts Practiced
- Shallow copying via object spread (`...`)
- Referential integrity in state subtrees
- Functional state updates (`setState(prev => ...)`)

---

### 12. Batching and Stale State Collisions
**Difficulty:** 🟢 Easy

#### Problem
Build a simple click counter that contains a single button: "Double Fast Click". When clicked, this button must immediately increment the counter by 2 within the same tick of the event loop.

#### Requirements
- Do not use `setCount(count + 2)`.
- Use two distinct, sequential calls to `setCount` inside the same event handler to test React's updater batching semantics.

#### Given
```jsx
const handleClick = () => {
  setCount(count + 1);
  setCount(count + 1); // Fails to increment by 2! Why?
};
```

#### Concepts Practiced
- Asynchronous-like batching behavior
- Functional updater forms: `setCount(prev => prev + 1)`
- Stale closures over render-scoped variables

---

### 13. Synchronized Dual Range Slider
**Difficulty:** 🟡 Medium

#### Problem
Build a controlled Dual Range Slider component where two native `<input type="range" />` elements share a boundary constraint: Slider A (minimum) cannot exceed Slider B (maximum) minus a fixed gap of 5 units.

#### Requirements
- Managed via a single state object: `{ minVal: number, maxVal: number }`.
- When Slider A moves past `maxVal - 5`, clamp Slider A to `maxVal - 5`.
- Both inputs must be strictly controlled (values driven directly by state).
- Provide real-time readouts of both values.

#### Edge Cases
- User rapidly scrubs min slider to 100.
- User drags max slider lower than min slider.

#### Concepts Practiced
- Coordinated multi-input state
- Clamping and boundary enforcement during input transitions
- Controlled component synchronization

---

### 14. Output Prediction: The Stale Closure in State
**Difficulty:** 🟡 Medium

#### Question
Consider the following component:

```jsx
function Timer() {
  const [seconds, setSeconds] = useState(0);

  const handleAlert = () => {
    setTimeout(() => {
      alert(`Seconds logged at click: ${seconds}`);
    }, 3000);
  };

  return (
    <div>
      <h1>Seconds: {seconds}</h1>
      <button onClick={() => setSeconds(s => s + 1)}>Tick</button>
      <button onClick={handleAlert}>Alert After Delay</button>
    </div>
  );
}
```

1. The user clicks "Alert After Delay" when `seconds` is 0.
2. During the 3-second delay, the user clicks "Tick" 5 times.
3. What is displayed in the alert dialog after 3 seconds elapse?
4. Explain the underlying JavaScript and React mechanism causing this behavior.
5. How would you modify `handleAlert` so that it displays the *current* state at the moment the alert fires?

---

### 15. Dynamic Form Array Field Insertion and Deletion
**Difficulty:** 🟡 Medium

#### Problem
Construct a form component `DynamicEmailList` that manages an arbitrary number of email inputs, allowing additions, removals, and positional re-ordering without dropping input focus or losing typed values.

#### Requirements
- Start with one blank email input field.
- Button to "Add Alternate Email".
- Button next to each row to "Remove" that specific row (disabled if only one email remains).
- Every item must have a permanently stable UUID generated upon creation (do not use index or `Math.random` inside render).
- Form must submit an array of string values: `string[]`.

#### Edge Cases
- Deleting an element in the middle of the array: all remaining elements must preserve their current values and focus states.
- Rapid successive additions.

#### Concepts Practiced
- Immutable array manipulation: `filter`, `map`, spread operators
- Unique key generation strategies
- Form state normalization

---

### 16. State Hoisting (Lifting State Up)
**Difficulty:** 🟢 Easy

#### Problem
You are given two independent components: `CurrencyInput` and `CurrencySummary`. They currently hold their own local state. Refactor them so that entering a value in `CurrencyInput` automatically updates the conversion calculations inside `CurrencySummary`.

#### Requirements
- Create an overarching coordinator component `CurrencyConverter`.
- `CurrencyInput` must be purely presentational, emitting changes via `onChange(value: number)`.
- `CurrencySummary` receives `usdAmount: number` and outputs conversions for EUR and GBP based on hardcoded rates.
- Neither child component should manage currency state locally.

#### Concepts Practiced
- Unidirectional data flow
- Raising state to the closest common ancestor
- Inversion of control via callback props

---

### 17. The Resetting Pattern: Key-Driven State Wipe
**Difficulty:** 🟡 Medium

#### Problem
You have an internally stateful component `WizardForm` with 10+ state hooks (dirty tracking, inputs, step validation). Implement a parent control that can completely wipe and reset all `WizardForm` state back to initial values in a single render pass without adding an imperative `reset()` method to the child.

#### Requirements
- Demonstrate the React-idiomatic technique of using changing keys (`key={sessionId}`) to force teardown and recreation of the component subtree.
- Compare this against an imperative reset method (e.g., exposing a handle via `useImperativeHandle`).
- Document when resetting via keys is superior to state syncing.

#### Concepts Practiced
- Fiber node unmounting and recreation
- The `key` attribute on non-list components
- Lifecycle teardown semantics

---

### 18. Debugging: Controlled vs. Uncontrolled Warning
**Difficulty:** 🟢 Easy

#### Buggy Code
```jsx
function EditUserForm({ initialUserData }) {
  const [formData, setFormData] = useState({
    username: initialUserData.username,
    bio: initialUserData.bio
  });

  return (
    <form>
      <input 
        value={formData.username} 
        onChange={e => setFormData({ ...formData, username: e.target.value })} 
      />
      <textarea 
        value={formData.bio} 
        onChange={e => setFormData({ ...formData, bio: e.target.value })} 
      />
    </form>
  );
}
// Rendered as: <EditUserForm "alice", bio: initialUserData="{{" undefined username: }}/>
```

#### Task
1. Explain the exact warning React outputs to the console when a user types into the `bio` textarea.
2. What causes an element to transition from uncontrolled to controlled?
3. Fix the state initialization to permanently eliminate this warning.

---

### 19. Optimistic UI Toggle with Rollback
**Difficulty:** 🟡 Medium

#### Problem
Implement a bookmark toggle button that immediately reflects an active state upon click, but rolls back to its original state if an asynchronous network call fails.

#### Requirements
- Accept prop `isBookmarkedInitially: boolean`.
- Accept prop `onSaveRemote: () => Promise<void>`.
- State must update instantly on click (optimistic update).
- If `onSaveRemote()` rejects:
  - Revert state to previous boolean value.
  - Display an inline error message: `"Failed to update. Reverted."`
- Prevent duplicate clicks while a network request is inflight.

#### Edge Cases
- Rapid clicks before the promise resolves.
- Component unmounts while request is inflight.

#### Concepts Practiced
- Optimistic state updates
- Rollback mechanisms
- In-flight request guards

---

### 20. Undo/Redo State Container
**Difficulty:** 🔴 Hard

#### Problem
Implement a custom React hook `useUndoableState(initialPresent)` that wraps standard state management with a historical timeline supporting undo and redo capabilities.

#### Requirements
- Return `[present, set, undo, redo, canUndo, canRedo]`.
- Maintain two stacks: `past` and `future`.
- Calling `set(newVal)` appends the previous present to `past` and clears `future`.
- Calling `undo()` moves current present to `future`, and pops the last item from `past` to become `present`.
- Support both direct values and functional updater arguments (`set(prev => ...)`).

#### Edge Cases
- Calling `undo()` when `past` is empty must be a no-op (`canUndo === false`).
- Calling `redo()` when `future` is empty must be a no-op (`canRedo === false`).
- Rapid successive updates must not corrupt timeline ordering.

#### Concepts Practiced
- Complex state transitions
- Higher-order state wrappers
- Array immutability under structural mutations

---

# 🧠 Checkpoint 2
Before continuing, ensure you can:
- Explain why React batches state updates inside synthetic event handlers and asynchronous callbacks.
- Demonstrate how passing a functional updater `setState(prev => ...)` solves stale closure bugs.
- Explain the precise difference between an uncontrolled input and a controlled input.

---

## Level 3: Effect Pipelines, Lifecycle, and Refs

### 21. Document Title Synchronizer with Stale Guard
**Difficulty:** 🟢 Easy

#### Problem
Build a component that synchronizes its active state with the browser document title, ensuring proper cleanup when the component unmounts.

#### Requirements
- Consume a prop `pageTitle: string`.
- Update `document.title` on mount and prop change.
- Restore `document.title` to its original value (the title before the component mounted) upon unmount.
- Dependency array in `useEffect` must be strictly minimal and accurate.

#### Concepts Practiced
- `useEffect` mounting and unmounting
- Cleanup functions
- Preserving ambient DOM state across component lifecycles

---

### 22. Window Resize Listener with Debounce
**Difficulty:** 🟡 Medium

#### Problem
Create a custom hook `useWindowDimensions` that tracks the browser viewport's `width` and `height`, firing state updates only after the window has stopped resizing for 150 milliseconds.

#### Requirements
- Listen to the native `window.resize` event.
- Debounce updates using `setTimeout`.
- Clear any pending timeouts and remove the event listener inside the effect cleanup function.
- Do not trigger infinite re-render loops.

#### Edge Cases
- Component unmounts while a debounce timer is active.
- Server-Side Rendering (SSR): handle cases where `window` is `undefined`.

#### Concepts Practiced
- Event listener cleanup
- Timers inside `useEffect`
- Memory leak prevention

---

### 23. Race Condition Elimination in Data Fetching
**Difficulty:** 🟡 Medium

#### Problem
Create a search component `UserSearch` where typing into an input fires an asynchronous API request for suggestions. If Request 1 completes *after* Request 2, the UI must ignore Request 1 to prevent displaying stale results.

#### Requirements
- Accept prop `fetchUserSuggestions: (query: string) => Promise<string[]>`.
- Implement race condition mitigation inside `useEffect` using an active flag or `AbortController`.
- Cancel or ignore stale promises when the `query` prop changes before the previous promise has resolved.

#### Edge Cases
- Fast typing yielding out-of-order network responses.
- Empty query string should instantly clear suggestions without triggering a fetch.

#### Concepts Practiced
- Promise race conditions
- `AbortController` and `signal` integration
- Effect lifecycles with asynchronous code

---

### 24. Output Prediction: Effect Lifecycle Order
**Difficulty:** 🟡 Medium

#### Question
Analyze the following component hierarchy:

```jsx
function Parent() {
  const [show, setShow] = useState(true);

  useEffect(() => {
    console.log("Parent: useEffect");
    return () => console.log("Parent: cleanup");
  }, [show]);

  useLayoutEffect(() => {
    console.log("Parent: useLayoutEffect");
    return () => console.log("Parent: layout cleanup");
  }, [show]);

  return (
    <div>
      <button onClick={() => setShow(s => !s)}>Toggle</button>
      {show && <Child/>}
    </div>
  );
}

function Child() {
  useEffect(() => {
    console.log("Child: useEffect");
    return () => console.log("Child: cleanup");
  }, []);

  useLayoutEffect(() => {
    console.log("Child: useLayoutEffect");
    return () => console.log("Child: layout cleanup");
  }, []);

  return <div>Child</div>;
}
```

1. Trace and list the exact console output order on initial mount.
2. Trace the console output when the user clicks the "Toggle" button (causing `Child` to unmount).
3. Explain why `useLayoutEffect` fires before `useEffect`.
4. Explain why Child cleanup effects run before Parent cleanup effects.

---

### 25. The Imperative Focus and Scroll Handler
**Difficulty:** 🟢 Easy

#### Problem
Construct an auto-scrolling log viewer `ConsoleOutput` that pins its scroll position to the bottom of the container whenever new logs arrive, *unless* the user has manually scrolled up to review older logs.

#### Requirements
- Use a `useRef` targeting the scrollable DOM element.
- Calculate whether the user is currently at the bottom before applying new logs.
- If at bottom: execute `element.scrollTop = element.scrollHeight`.
- If scrolled up: do not disrupt user position.
- Do not cause a re-render merely by tracking scroll position or ref references.

#### Concepts Practiced
- Non-rendering mutable refs (`useRef`)
- Direct DOM reading and manipulation
- Scroll event geometry (`scrollHeight`, `scrollTop`, `clientHeight`)

---

### 26. `forwardRef` and `useImperativeHandle` Encapsulation
**Difficulty:** 🟡 Medium

#### Problem
Implement a custom audio player component `AudioPlayer` that encapsulates a native `<audio>` tag, exposing only a restricted set of methods (`play()`, `pause()`, and `seek(seconds)`) to its parent component via a `ref`.

#### Requirements
- Parent must NOT have direct access to the underlying HTML5 audio DOM node.
- Use `forwardRef` to accept a ref from the parent.
- Use `useImperativeHandle` to construct the restricted API interface.
- Parent calls: `playerRef.current.play()`.

#### Concepts Practiced
- Imperative boundary enforcement
- `forwardRef` wrapping syntax
- `useImperativeHandle` configuration

---

### 27. Previous Value Capture Hook
**Difficulty:** 🟢 Easy

#### Problem
Implement the custom hook `usePrevious(value)` that returns the value of a prop or state variable from the *immediately preceding render*.

#### Requirements
- Must use `useRef` and `useEffect`.
- On the very first render, it must return `undefined`.
- On subsequent renders, it returns the value held prior to the current render pass.
- Explain the timing mechanism: why does the ref return the previous value during render before the effect updates it?

#### Concepts Practiced
- Render phase vs. Commit phase timing
- Mutable storage independent of render cycle

---

### 28. Debugging: The Infinite Effect Loop
**Difficulty:** 🟢 Easy

#### Buggy Code
```jsx
function UserStats({ userId }) {
  const [user, setUser] = useState(null);
  const [filterOptions, setFilterOptions] = useState({ activeOnly: true });

  useEffect(() => {
    fetchUserData(userId, filterOptions).then(data => {
      setUser(data);
    });
  }, [userId, filterOptions]);

  return <div>{user ? user.name : "Loading..."}</div>;
}
```

#### Task
1. Explain under what conditions `UserStats` will lock the browser in an infinite re-render loop if `filterOptions` is derived or modified.
2. If `filterOptions` were an object passed as a prop from a parent, explain why this effect would fire on every single parent render.
3. Fix the problem using two alternative approaches (one via primitive dependencies, one via memoization).

---

### 29. Layout Shift Prevention via `useLayoutEffect`
**Difficulty:** 🟡 Medium

#### Problem
Build a tooltip component `SmartTooltip` that measures its own rendered bounding box and repositions itself to the top of the target element, or flips to the bottom if there is not enough room in the viewport. The repositioning must happen synchronously before the browser paints, completely eliminating visual flicker.

#### Requirements
- Anchor element ref and tooltip element ref.
- Tooltip measures its height using `getBoundingClientRect()`.
- If top boundary overflows viewport (`top < 0`), switch position class from `tooltip-top` to `tooltip-bottom`.
- Use `useLayoutEffect` to perform DOM measurements and state adjustments.
- Explain what happens if `useEffect` is used instead.

#### Concepts Practiced
- `useLayoutEffect` vs `useEffect`
- Synchronous DOM measurement and mutation
- Browser painting pipeline (Render Tree -> Layout -> Paint)

---

### 30. Event Listener Binding to Dynamic State
**Difficulty:** 🟡 Medium

#### Problem
Implement an interactive canvas component `MouseTracker` that listens to global `keydown` events (such as pressing Space to toggle a drawing state) and needs access to the *latest* component state without constantly tearing down and re-binding the event listener on every keystroke.

#### Requirements
- Maintain state: `isDrawingActive: boolean`.
- Bind `window.addEventListener('keydown', handleKeyDown)` strictly ONCE on mount (`[]` dependency array).
- Inside `handleKeyDown`, read the latest value of `isDrawingActive` without stale closure entrapment.
- Use the "ref as state mirror" pattern to bridge the effect gap.

#### Concepts Practiced
- Escaping stale closures inside single-instance event bindings
- Ref synchronization
- Avoiding event re-binding overhead

---

# 🧠 Checkpoint 3
Before continuing, ensure you can:
- Clearly define the boundary between Render phase, Layout Effects, Browser Paint, and Passive Effects.
- Describe the exact sequence of steps React performs with effect cleanups and setups when dependencies change.
- Explain why accessing a DOM node directly via a ref during the render phase is forbidden.

---

## Level 4: Advanced Hooks and State Architecture

### 31. Complex Form Management via `useReducer`
**Difficulty:** 🟡 Medium

#### Problem
Implement a checkout wizard state manager using `useReducer` to enforce valid state transitions across a multi-step checkout workflow.

#### Requirements
- Steps: `CART` -> `SHIPPING` -> `PAYMENT` -> `CONFIRMATION`.
- State must strictly enforce that the user cannot transition to `PAYMENT` unless `shippingAddress` is non-empty.
- Actions: `NEXT_STEP`, `PREV_STEP`, `SET_SHIPPING`, `SET_PAYMENT`, `RESET`.
- Action payloads must be strictly validated inside the reducer; invalid transitions must return existing state without throwing errors.

#### Concepts Practiced
- Predictable finite-state machines via `useReducer`
- Discriminated union patterns in state actions
- Decoupling transition logic from presentation components

---

### 32. External Subscription via `useSyncExternalStore`
**Difficulty:** 🔴 Hard

#### Problem
Implement a custom React hook `useNetworkStatus` that subscribes to the browser's `navigator.onLine` state using the official `useSyncExternalStore` API, avoiding tearing under concurrent rendering.

#### Requirements
- Do not use `useState` or `useEffect`.
- Define `subscribe(callback)` function to attach and detach `online` and `offline` event listeners.
- Define `getSnapshot()` returning the boolean status.
- Define `getServerSnapshot()` returning a deterministic fallback for SSR.

#### Concepts Practiced
- `useSyncExternalStore` mechanics
- Concurrent Mode tearing prevention
- Subscribing to non-React mutable data sources

---

### 33. Context API Partitioning for High-Frequency State
**Difficulty:** 🟡 Medium

#### Problem
You have a `ThemeContext` (low frequency: toggles once or twice) and a `MouseCoordsContext` (high frequency: updates 60 times/second). Combine them naively, and the entire app tree re-renders continuously. Architect a partitioned Context structure that isolates high-frequency updates.

#### Requirements
- Split state and updater into separate contexts: `CoordsStateContext` and `CoordsDispatchContext`.
- Build a consumer component `ThemeDisplay` that depends exclusively on `ThemeContext`.
- Verify that `ThemeDisplay` does NOT re-render when mouse coordinates update.
- Provide a clean Provider composition hierarchy.

#### Concepts Practiced
- Context splitting to optimize render cascades
- Decoupling state reading from dispatch actions
- Re-render blast radius minimization

---

### 34. Context Default Values and Missing Provider Assertion
**Difficulty:** 🟢 Easy

#### Problem
Construct a custom consumer hook `useAuthContext()` that surfaces configuration errors when a developer attempts to consume `AuthContext` outside of its associated `AuthProvider`.

#### Requirements
- Initialize context with a sentinel symbol or `undefined`.
- Inside `useAuthContext`, check if the resolved value matches the sentinel.
- If outside provider, immediately throw a descriptive error: `"useAuthContext must be used within an AuthProvider"`.
- Provide complete structural typing.

#### Concepts Practiced
- Fail-fast developer ergonomics
- Null-object pattern vs. thrown exceptions in context boundaries

---

### 35. Deep Dependency Optimization via `useCallback`
**Difficulty:** 🟡 Medium

#### Problem
You have a computationally heavy list component `BigList` wrapped in `React.memo`. It receives an `onItemDelete` callback from its parent. Ensure that actions taken in the parent (like typing into a local search bar) do NOT break the referential identity of `onItemDelete`, which would trigger an expensive list re-render.

#### Requirements
- Implement `Parent` holding `searchQuery: string` and `items: Array<{ id: string, name: string }>`.
- Define `handleDelete(id: string)` using `useCallback`.
- The callback must remove the target item without specifying `items` in its dependency array (use the functional updater pattern of `setItems`).
- Confirm referential equality of `handleDelete` across renders.

#### Concepts Practiced
- `useCallback` with empty dependency arrays
- Functional updaters eliminating stale dependencies
- `React.memo` prop stability preservation

---

### 36. Memoized Selectors via `useMemo`
**Difficulty:** 🟡 Medium

#### Problem
You have a dataset of 20,000 transaction objects. Implement a filtering and statistical aggregation engine inside a component that computes total volume, average value, and filtered results without stalling user interactions.

#### Requirements
- Inputs: `transactions: Transaction[]`, `filterCategory: string`, `minAmount: number`.
- Wrap filtering and aggregation in `useMemo`.
- Include a separate unrelated state (`isDarkTheme: boolean`).
- Toggling the theme must resolve instantly without re-executing the 20,000-item array iteration.

#### Concepts Practiced
- Computational offloading via `useMemo`
- Referential cache invalidation rules
- Profiling expensive computations

---

### 37. Output Prediction: Reducer Purity Violations
**Difficulty:** 🟡 Medium

#### Question
What happens when the following reducer runs in React 18 Strict Mode?

```jsx
let counter = 0;

function badReducer(state, action) {
  switch (action.type) {
    case 'increment':
      counter++;
      return { count: state.count + counter };
    default:
      return state;
  }
}
```

1. What will `state.count` evaluate to after the first dispatched `'increment'` action inside a `<React.StrictMode>` tree?
2. Why does React invoke reducers twice during development mode?
3. How does side-effect leakage in reducers compromise time-travel debugging and concurrent features?

---

### 38. Refactoring: Context Hell to Composed Providers
**Difficulty:** 🟡 Medium

#### Poorly Designed Code
```jsx
function App() {
  return (
    <AuthProvider>
      <ThemeProvider>
        <LocaleProvider>
          <QueryProvider>
            <ModalProvider>
              <NotificationProvider>
                <MainLayout/>
              </NotificationProvider>
            </ModalProvider>
          </QueryProvider>
        </LocaleProvider>
      </ThemeProvider>
    </AuthProvider>
  );
}
```

#### Task
Write a functional utility component `ComposeProviders` that accepts an array of provider components and cleanly nests them dynamically using `Array.prototype.reduceRight`, eliminating the rightward pyramid drift.

---

### 39. Debounced Input Hook with Immediate Value Access
**Difficulty:** 🟡 Medium

#### Problem
Build a custom hook `useDebouncedSearch(initialValue, delay)` that provides both the immediate value (for input rendering) and the debounced value (for network queries), alongside a method to immediately cancel or flush pending changes.

#### Requirements
- Return an object: `{ liveValue, debouncedValue, setLiveValue, flush, cancel }`.
- Typing updates `liveValue` synchronously.
- `debouncedValue` updates only after `delay` milliseconds of silence.
- Calling `flush()` immediately forces `debouncedValue` to match `liveValue`.

#### Concepts Practiced
- Timers inside custom hooks
- Managing dual-state representations
- Imperative timer manipulation

---

### 40. Custom Hook: `useIntersectionObserver`
**Difficulty:** 🟡 Medium

#### Problem
Implement a reusable hook `useIntersectionObserver(options)` that monitors when a DOM element enters or leaves the browser viewport, supporting dynamic target assignment without re-initializing the underlying observer instance.

#### Requirements
- Accept standard `IntersectionObserverInit` configuration options.
- Return a tuple: `[setNodeRef, entry]`.
- Cleanly disconnect previous nodes when a new node ref is attached.
- Disconnect observer on component unmount.

#### Concepts Practiced
- Ref callback pattern (`ref={node => ...}`) vs. standard `useRef`
- Wrapping browser observer APIs
- Subscription lifecycles

---

# 🧠 Checkpoint 4
Before continuing, ensure you can:
- Explain why `useReducer` is preferred over `useState` when multiple state transitions depend on previous state.
- Articulate the precise rule for when `useSyncExternalStore` must be used instead of `useEffect` for external events.
- Identify the exact mechanism by which a component consuming Context determines whether it needs to re-render.

---

## Level 5: Concurrent Mode, Transitions, and Internals

### 41. Non-Blocking Search via `useTransition`
**Difficulty:** 🟡 Medium

#### Problem
You have an expensive rendering task: filtering and drawing 5,000 visual data items on screen. When the user types into a filter input, the typing must feel completely responsive (60fps), while the list rendering is deferred as non-urgent.

#### Requirements
- Use `useTransition` to separate urgent from non-urgent updates.
- Keep the input value update urgent (`setInputValue`).
- Wrap the expensive filtered list state update in `startTransition`.
- Display a pending indicator (`isPending` opacity drop) on the list while the transition calculates.

#### Concepts Practiced
- `useTransition` mechanics
- Urgent vs. Transition lane priority
- Keeping main-thread inputs responsive

---

### 42. `useDeferredValue` with Stale Content Dimming
**Difficulty:** 🟡 Medium

#### Problem
You cannot modify the state updates of an upstream component, but it passes down a fast-updating `searchTerm` prop that triggers an expensive computational subtree in your child component.

#### Requirements
- Consume raw `searchTerm: string`.
- Generate a deferred counterpart using `useDeferredValue(searchTerm)`.
- Pass the deferred value to the expensive child tree.
- Apply a visual style (`opacity: 0.6`, `transition: 'opacity 0.2s'`) to the child container whenever `searchTerm !== deferredValue`.

#### Concepts Practiced
- `useDeferredValue` for consumer-side deferral
- Visualizing lagging states during concurrent transitions
- Bailout mechanisms on unchanged values

---

### 43. Output Prediction: Automatic Batching Boundaries
**Difficulty:** 🟡 Medium

#### Question
Evaluate the following code running in React 18:

```jsx
function BatchingShowcase() {
  const [count, setCount] = useState(0);
  const [flag, setFlag] = useState(false);

  console.log("Render executed");

  const handleClick = () => {
    fetch("/api/data").then(() => {
      setCount(c => c + 1);
      setFlag(f => !f);
    });
  };

  return <button onClick={handleClick}>Run</button>;
}
```

1. In React 17, how many times would `"Render executed"` be logged after the button is clicked and the network request resolves? Why?
2. In React 18, how many times would it be logged? Why?
3. What escape hatch function allows a developer to opt OUT of automatic batching in React 18 when synchronous rendering is strictly required?

---

### 44. The Suspense Data Fetching Contract
**Difficulty:** 🔴 Hard

#### Problem
Implement a framework-agnostic Suspense-compatible resource wrapper function `wrapPromise(promise)` that integrates with React `<Suspense>` boundaries using the standard thrown-promise protocol.

#### Requirements
- The function must take an arbitrary promise: `wrapPromise(fetchData())`.
- Return an object with a `.read()` method.
- If the promise is pending: `.read()` must **throw** the raw promise instance.
- If the promise rejected: `.read()` must **throw** the caught error.
- If the promise resolved: `.read()` must **return** the resolved result data.

#### Concepts Practiced
- Mechanics of React Suspense contracts
- Throwing promises to interrupt execution
- Cache reconciliation outside the React render tree

---

### 45. Fiber Architecture and Reconciliation Mechanics
**Difficulty:** 🔴 Hard

#### Question
React reconciles virtual DOM trees using a Fiber architecture rather than a simple recursive descent over plain JavaScript objects.

1. What is a "Fiber" node conceptually, and what core pointers does it maintain to traverse the tree without a call stack (`child`, `sibling`, `return`)?
2. Why did the legacy Stack Reconciler make cooperative scheduling (pausing and resuming work) impossible?
3. How does React assign different priorities (Lanes) to distinct events (e.g., direct user input vs. offscreen pre-rendering)?

---

### 46. Debugging: Mutation in Render Phase
**Difficulty:** 🟡 Medium

#### Buggy Code
```jsx
function ItemList({ items }) {
  const sortedItems = items.sort((a, b) => a.name.localeCompare(b.name));

  return (
    <ul>
      {sortedItems.map(item => (
        <li key={item.id}>{item.name}</li>
      ))}
    </ul>
  );
}
```

#### Task
1. Explain the silent bug occurring in this component.
2. Why is array mutation during the render phase strictly forbidden?
3. How does this bug manifest if `items` is stored in a parent's state or a global store?
4. Fix the bug in one clean, idiomatic line of code.

---

### 47. Selective Hydration and SSR Boundaries
**Difficulty:** 🔴 Hard

#### Question
Under modern React SSR architecture using `renderToPipeableStream`:

1. What is the fundamental difference between HTML streaming and client-side hydration?
2. How does wrapping a component tree in `<Suspense>` enable "Selective Hydration"?
3. What happens if a user clicks an interactive element inside a server-rendered HTML block before the JavaScript bundle for that specific block has finished downloading and hydrating?

---

### 48. Refactoring: Eliminating `useEffect` for Derived State
**Difficulty:** 🟢 Easy

#### Poorly Designed Code
```jsx
function UserDirectory({ users, filterText }) {
  const [filteredUsers, setFilteredUsers] = useState([]);

  useEffect(() => {
    const result = users.filter(u => u.name.includes(filterText));
    setFilteredUsers(result);
  }, [users, filterText]);

  return <List items="{filteredUsers}"/>;
}
```

#### Task
1. Explain why using `useEffect` to synchronize derived state causes an unnecessary extra render cycle and potential layout flashes.
2. Refactor this component to calculate `filteredUsers` purely during the render phase.
3. Add condition checks determining when `useMemo` is warranted versus executing the calculation as a bare variable assignment.

---

### 49. Hydration Mismatch Resolution
**Difficulty:** 🟡 Medium

#### Buggy Code
```jsx
function TimestampViewer() {
  return (
    <div>
      <span>Current Time: {new Date().toLocaleTimeString()}</span>
    </div>
  );
}
```

#### Task
1. Explain why this component throws a hydration mismatch error when rendered via SSR and hydrated on the client.
2. What are the visual and performance consequences of hydration mismatches in production?
3. Fix the component so that it renders a predictable, identical placeholder during SSR/initial hydration, and displays dynamic local time only after hydration completes.

---

### 50. Custom Hook: `useId` and Accessible Linking
**Difficulty:** 🟢 Easy

#### Problem
Construct a reusable composite input element `FormTextField` that couples an `<input />` with a `<label>` and an `<aria-describedby>` error span using React's `useId` hook, guaranteeing unique, non-colliding IDs across SSR and client rendering.

#### Requirements
- Do not hardcode string IDs.
- Generate a stable base identifier using `useId()`.
- Derive sub-ids for: the input itself, the help text, and the validation error message.
- Ensure the input is accessible to screen readers using valid ARIA attributes.

#### Concepts Practiced
- `useId` mechanics
- SSR-safe DOM ID generation
- Accessible form composition

---

# 🧠 Checkpoint 5
Before continuing, ensure you can:
- Articulate the difference between an urgent update and a transition update.
- Explain how React Fiber pauses rendering work to yield control back to the browser's main thread.
- Identify hydration mismatches and resolve them without disabling SSR.

---

## Level 6: Performance Profiling, Memory, and Edge Cases

### 51. Profiling and Diagnosing Unnecessary Re-renders
**Difficulty:** 🟡 Medium

#### Problem
You are provided a slow application dashboard where every keystroke in a search box causes 50 unrelated child components to re-render. You cannot wrap all 50 components in `React.memo`.

#### Requirements
- Re-architect the component structure using the "lift content up" / "component as children" pattern.
- Move the search box state into a dedicated local wrapper component `SearchLayout`.
- Pass the 50 heavy children as the `children` prop to this wrapper.
- Prove why passing components as `children` prevents them from re-rendering when the parent wrapper updates its internal state.

#### Concepts Practiced
- Composition as an alternative to memoization
- Children prop referential stability
- Component-level render boundaries

---

### 52. Fixing Broken Memoization Chains
**Difficulty:** 🟡 Medium

#### Buggy Code
```jsx
const UserCard = React.memo(function UserCard({ user, onAction }) {
  console.log("UserCard render:", user.id);
  return (
    <div>
      <h3>{user.name}</h3>
      <button onClick={() => onAction(user.id)}>Process</button>
    </div>
  );
});

function UserList({ users }) {
  const [selectedId, setSelectedId] = useState(null);

  return (
    <div>
      {users.map(u => (
        <UserCard key="{u.id}" onAction="{(id)" user="{u}"> setSelectedId(id)}
        />
      ))}
    </div>
  );
}
```

#### Task
1. Identify the inline referential leak that invalidates `UserCard`'s shallow comparison on every `UserList` render.
2. Refactor the code so that `UserCard` remains completely memoized even when `selectedId` changes.

---

### 53. Virtualized List from Scratch
**Difficulty:** 🔴 Hard

#### Problem
Build a lightweight, zero-dependency virtualized list component `SimpleVirtualList` that renders a collection of 100,000 items with a fixed row height of 40px, keeping only the visible items (plus a buffer of 3 items above and below) in the actual DOM.

#### Requirements
- Container height: 400px (scrollable: `overflowY: 'auto'`).
- Item height: 40px fixed.
- Track container `scrollTop` inside an event listener.
- Calculate visible index boundaries:
  - `startIndex = Math.max(0, Math.floor(scrollTop / itemHeight) - buffer)`
  - `endIndex = Math.min(totalItems, Math.ceil((scrollTop + containerHeight) / itemHeight) + buffer)`
- Render a phantom spacer element to ensure the scrollbar accurately reflects total height (`totalItems * itemHeight`).
- Position visible items using calculated `top` offsets.

#### Concepts Practiced
- Virtualization mechanics
- Windowing algorithms
- Minimizing DOM footprint under extreme scale

---

### 54. Memory Leak via Uncleared Closure
**Difficulty:** 🟡 Medium

#### Buggy Code
```jsx
function LiveDataStream({ streamService }) {
  const [data, setData] = useState([]);

  useEffect(() => {
    const handler = (payload) => {
      setData(prev => [...prev.slice(-99), payload]);
    };

    streamService.subscribe(handler);
  }, [streamService]);

  return <DataGrid items="{data}"/>;
}
```

#### Task
1. Explain what happens to the memory footprint if this component mounts and unmounts 20 times.
2. Explain how the closure over `setData` retains the entire component fiber in memory.
3. Write the exact cleanup code required to release the listener and break the retaining path.

---

### 55. Circular Dependency in State Effects
**Difficulty:** 🟡 Medium

#### Problem
A component must keep two input fields synchronized through a conversion formula: Fahrenheit and Celsius. Changing either one must update the other. Avoid infinite state loops without introducing redundant state.

#### Requirements
- Inputs: Celsius and Fahrenheit.
- Maintain ONE source of truth in state (`temperatureInCelsius: string`).
- Derive Fahrenheit value dynamically during the render pass.
- When typing in Celsius: update the state directly.
- When typing in Fahrenheit: convert the input to Celsius and update the state.
- Explain why having two separate states with two `useEffect` synchronizers is an anti-pattern.

#### Concepts Practiced
- Single source of truth
- Eliminating ping-pong effect cycles
- Pure mathematical derivation in rendering

---

### 56. Deep Comparison Hook: `useDeepCompareEffect`
**Difficulty:** 🔴 Hard

#### Problem
Implement a custom hook `useDeepCompareEffect(callback, dependencies)` that acts like `useEffect`, but uses deep equality checking on its dependencies instead of React's default reference identity check (`Object.is`).

#### Requirements
- Use `useRef` to store previous dependencies.
- Compare incoming dependencies with previous dependencies using deep equality checking.
- If dependencies are deeply equal, retain previous reference to avoid triggering `useEffect`.
- Throw an error if a user passes a primitive directly to `useDeepCompareEffect`.

#### Concepts Practiced
- Custom effect primitives
- Deep equality trade-offs vs. performance
- Ref-based dependency caching

---

### 57. Error Boundary Class Implementation
**Difficulty:** 🟡 Medium

#### Problem
Implement an enterprise-grade class component `ErrorBoundary` capable of catching rendering errors, logging them, and rendering a fallback UI.

#### Requirements
- Implement `static getDerivedStateFromError(error)` to update error state.
- Implement `componentDidCatch(error, errorInfo)` to send telemetry data.
- Provide a `reset()` capability exposed via a button in the fallback UI that attempts to clear the error and re-mount children.
- Accept an optional prop `fallbackRender: (error, reset) => ReactNode`.

#### Concepts Practiced
- Error Boundary lifecycle methods
- Error recovery strategies
- Class component interop with functional trees

---

### 58. Output Prediction: `useMemo` Cache Invalidation
**Difficulty:** 🟢 Easy

#### Question
```jsx
function CalculationViewer({ multiplier }) {
  const [count, setCount] = useState(0);

  const calculate = () => {
    console.log("Calculating...");
    return count * multiplier;
  };

  const memoizedResult = useMemo(calculate, [multiplier]);

  return (
    <div>
      <h1>Result: {memoizedResult}</h1>
      <button onClick={() => setCount(c => c + 1)}>Increment Count</button>
    </div>
  );
}
```

1. The user clicks "Increment Count". Does `"Calculating..."` get logged to the console? Why or why not?
2. What bug exists regarding the relationship between `calculate` and `useMemo`?
3. How does React handle missing dependencies when compiling under the React Compiler or Linting rules?

---

### 59. Event Bubbling in Portals
**Difficulty:** 🟡 Medium

#### Problem
Create a modal rendered using `ReactDOM.createPortal` into `document.body`. Prove that synthetic events originating inside the portal bubble through the *React component tree*, not the *DOM tree*.

#### Requirements
- Render parent component `<Shell onClick={handleShellClick}>`.
- Inside `Shell`, render `<Modal>` which renders its content via `createPortal(..., document.body)`.
- Inside the modal, render `<button className="portal-btn">`.
- Show that clicking `.portal-btn` triggers `handleShellClick` in `Shell`, despite the button not being an HTML descendant of `Shell` in the actual DOM.

#### Concepts Practiced
- Synthetic event bubbling mechanism
- Portals and the Virtual DOM hierarchy
- DOM tree vs. React tree architecture

---

### 60. Ref Callback vs. `useRef` Timing
**Difficulty:** 🔴 Hard

#### Problem
Demonstrate a scenario where using a standard `useRef` fails to notify your component that a DOM node has been attached (e.g., a conditionally rendered node), and resolve it using a callback ref.

#### Requirements
- Conditionally render an `<input />` after a 2-second timeout.
- Measure its dimensions and focus it the exact instant it attaches to the DOM.
- Show why `useEffect(..., [inputRef.current])` does not trigger when `ref.current` transitions from `null` to a DOM node.
- Implement `useCallback(node => { if (node !== null) { node.focus(); } }, [])` as a callback ref to solve the problem.

#### Concepts Practiced
- Callback refs
- Ref assignment lifecycle notifications
- Avoiding passive effect timing lag

---

# 🧠 Checkpoint 6
Before continuing, ensure you can:
- Explain why synthetic events bubble according to the React Virtual Tree rather than the native DOM tree.
- Identify the trade-off of deep equality checks: when does deep comparison cost more than simply re-rendering?
- Describe why callback refs are necessary for executing code immediately when a DOM node is attached or detached.

---

## Level 7: Advanced Patterns, Composition, and Extensibility

### 61. Compound Components with Shared Context
**Difficulty:** 🟡 Medium

#### Problem
Implement a robust `Tabs` system using the Compound Component pattern, allowing consumers complete freedom over layout positioning while sharing selection state internally.

#### Requirements
- Components: `Tabs`, `Tabs.List`, `Tabs.Tab`, `Tabs.Panels`, `Tabs.Panel`.
- Selected tab state must be managed within `Tabs`.
- Clicking a `Tabs.Tab` activates the corresponding `Tabs.Panel` based on a matched `value` identifier.
- Keyboard navigation: Left/Right arrows cycle focus between active `Tabs.Tab` elements.

#### Concepts Practiced
- Compound component architecture
- Internal context management
- Keyboard accessibility in compound patterns

---

### 62. Render Props to Custom Hook Migration
**Difficulty:** 🟢 Easy

#### Problem
Refactor logic out of a legacy Render Prop component `<MouseTracker render={({ x, y }) => <h1>{x}, {y}</h1>} />` into a modern custom hook.

#### Requirements
- Write custom hook: `useMousePosition()`.
- Rewrite consumer component to use the new hook.
- Implement a backward-compatible adapter `MouseTracker` that internally consumes `useMousePosition()` and invokes the `render` prop.

#### Concepts Practiced
- Inversion of control evolution
- Legacy patterns to modern hooks migration
- Maintaining backward compatibility

---

### 63. State Reducer Pattern
**Difficulty:** 🔴 Hard

#### Problem
Build an interactive toggle component `Toggle` that implements the State Reducer Pattern, giving consumers the ability to intercept, modify, or veto internal state transitions without rewriting the component.

#### Requirements
- `Toggle` manages its own internal state: `{ on: boolean, clickCount: number }`.
- Accept optional prop `stateReducer(state, action): nextState`.
- Allow consumer to enforce: "Disable toggle permanently after 4 consecutive clicks."
- The consumer passes their custom reducer to override default state transitions cleanly.

#### Concepts Practiced
- Advanced component extensibility
- State Reducer architectural pattern
- Inversion of state change mechanics

---

### 64. Slot-Based Component Architecture
**Difficulty:** 🟡 Medium

#### Problem
Implement an enterprise dashboard card `DashboardCard` using named Slots rather than simple string props, supporting decoupled headers, bodies, action bars, and collateral flyouts.

#### Requirements
- Allow consumers to pass slots cleanly:
  ```jsx
  <DashboardCard>
    <DashboardCard.Slot name="header"><h2>Analytics</h2></DashboardCard.Slot>
    <DashboardCard.Slot name="actions"><Button>Export</Button></DashboardCard.Slot>
    <DashboardCard.Slot name="content"><Chart/></DashboardCard.Slot>
  </DashboardCard>
  ```
- Component traverses children, groups them by slot name, and places them into an exact predefined layout shell.

#### Concepts Practiced
- Named slot systems in React
- Advanced child introspection
- Design systems component architecture

---

### 65. Props Getters Pattern
**Difficulty:** 🔴 Hard

#### Problem
Implement a custom hook `useAccordionItem` utilizing the Prop Getters pattern, which safely merges user-supplied event handlers and attributes with internal accessibility attributes.

#### Requirements
- Return an object containing: `getTriggerProps(userProps)` and `getPanelProps(userProps)`.
- If a consumer supplies their own `onClick` via `getTriggerProps({ onClick: customHandler })`, execute both the internal toggle handler AND the user's `customHandler`.
- If the user calls `event.defaultPrevented`, do not execute the internal handler.
- Automatically supply proper ARIA attributes (`aria-expanded`, `aria-controls`, `id`).

#### Concepts Practiced
- Prop Getters pattern
- Safe event handler chaining
- Accessible attribute generation

---

### 66. Controlled and Uncontrolled Unification Hook
**Difficulty:** 🔴 Hard

#### Problem
Implement a production-grade custom hook `useControllableState({ value, defaultValue, onChange })` that allows a component to seamlessly operate in either controlled or uncontrolled mode based on whether `value` is passed.

#### Requirements
- If `value !== undefined`: component is controlled; read from `value`.
- If `value === undefined`: component is uncontrolled; manage state internally starting with `defaultValue`.
- Calling the returned setter function must fire `onChange(newValue)` in both modes, but update internal state only in uncontrolled mode.
- Output a warning in development mode if a component switches from controlled to uncontrolled mid-lifecycle.

#### Concepts Practiced
- Unifying controlled and uncontrolled component patterns
- Building enterprise-grade primitive inputs
- Lifecycle mode shift detection

---

### 67. Output Prediction: Stale Props in Memoized Callbacks
**Difficulty:** 🟡 Medium

#### Question
Analyze the following code:

```jsx
function Parent() {
  const [data, setData] = useState("Initial");

  const printData = useCallback(() => {
    console.log("Data is:", data);
  }, []);

  return (
    <div>
      <button onClick={() => setData("Updated")}>Change</button>
      <Child onPrint="{printData}"/>
    </div>
  );
}

const Child = React.memo(function Child({ onPrint }) {
  return <button onClick={onPrint}>Print</button>;
});
```

1. The user clicks "Change", then clicks "Print". What is logged? Why?
2. How would you solve this using the `useEvent` (or stable ref callback) pattern without breaking `Child`'s memoization?

---

### 68. The Event Callback Pattern (`useEvent`)
**Difficulty:** 🔴 Hard

#### Problem
Implement an approximation of the `useEvent` hook (`useEventCallback`), returning a memoized function that maintains a stable reference identity across renders, while accessing latest state and props without needing a dependency array.

#### Requirements
- Return a callback function wrapped in `useCallback` with an empty dependency array (`[]`).
- Use a `useLayoutEffect` to continuously update a ref holding the latest incoming handler implementation.
- Inside the memoized callback, invoke the function stored inside the ref.
- Prove that passing this callback down to a child tree never causes the child to re-render.

#### Concepts Practiced
- The `useEvent` pattern
- Stable function identity vs. fresh state closures
- Ref synchronization via `useLayoutEffect`

---

### 69. Clean Abstraction: `useAsync` with Status Machine
**Difficulty:** 🟡 Medium

#### Problem
Create a robust hook `useAsync(asyncFunction, immediate = false)` that models asynchronous workflows without boolean flag explosion (`isLoading`, `isError`, `isSuccess`).

#### Requirements
- Model state via a single status string: `"idle" | "pending" | "success" | "error"`.
- Return `{ execute, status, value, error, isIdle, isPending, isSuccess, isError }`.
- Ensure that if the component unmounts while the async operation is running, subsequent resolution does not attempt to invoke state updates on an unmounted fiber.

#### Concepts Practiced
- State machines inside custom hooks
- Preventing memory leaks in async tasks
- Eliminating conflicting boolean states

---

### 70. Component Teardown and Cleanup Harness
**Difficulty:** 🟡 Medium

#### Problem
Build a resilient resource container `MediaSubscriber` that connects to an external WebRTC or WebSocket stream, handles reconnections, and guarantees streams are severed cleanly without leaking resources under React 18 Strict Mode's double-mounting lifecycle.

#### Requirements
- Mount: open connection.
- Strict Mode unmount simulation: ensure cleanup closes the exact instance created.
- Re-mount: establish fresh connection cleanly.
- Keep track of connection instances via a ref, not state.

#### Concepts Practiced
- Strict Mode resilience
- Dual-mount verification
- External resource lifecycle tracking

---

# 🧠 Checkpoint 7
Before continuing, ensure you can:
- Compare the trade-offs of Compound Components vs. Render Props vs. Prop Getters.
- Explain how the `useEvent` pattern achieves both referential stability and access to fresh state variables.
- Write a unified component that supports both controlled and uncontrolled states seamlessly.

---

## Level 8: Real-World Scenarios and Enterprise Mechanics

### 71. Infinite Scrolling Query Engine
**Difficulty:** 🟡 Medium

#### Problem
Implement a data-fetching list component that detects when the user scrolls near the bottom of the page, automatically requesting the next page of results and appending them cleanly.

#### Requirements
- Connect an `IntersectionObserver` to a sentinel element placed at the bottom of the list.
- When sentinel enters viewport: trigger `fetchNextPage()`.
- Prevent duplicate simultaneous requests when a query is already in-flight.
- If final page is reached (`hasNextPage === false`), disconnect the sentinel observer.

#### Concepts Practiced
- Infinite pagination mechanics
- Sentinel-based viewport observation
- Query guard flags

---

### 72. Accessible Modal with Keyboard Focus Trap
**Difficulty:** 🔴 Hard

#### Problem
Build an accessible Modal dialog component that completely traps keyboard Tab navigation within itself while open, preventing focus from escaping into the inert background document.

#### Requirements
- When opened: automatically focus the first focusable element inside the modal.
- Intercept `keydown` events:
  - If `Tab` is pressed on the last focusable element: cycle focus to the first focusable element.
  - If `Shift + Tab` is pressed on the first focusable element: cycle focus to the last focusable element.
  - If `Escape` is pressed: invoke `onClose()`.
- When closed: restore focus to the exact DOM element that held focus before the modal was opened.

#### Concepts Practiced
- Focus trap implementation
- Accessibility standards (WAI-ARIA Dialog pattern)
- Preserving previous focus targets via refs

---

### 73. Polling Mechanism with Dynamic Backoff
**Difficulty:** 🟡 Medium

#### Problem
Implement a custom hook `usePolling(callback, interval, maxAttempts)` that executes an asynchronous task at a fixed interval, doubling the delay (exponential backoff) whenever the request returns an error status.

#### Requirements
- Stop polling when the document is hidden (`document.visibilityState === 'hidden'`).
- Resume immediately when the document returns to visible.
- Provide manual controls: `start()`, `stop()`, `reset()`.

#### Concepts Practiced
- Dynamic interval adjustments
- Browser visibility API integration
- Exponential backoff algorithms in hooks

---

### 74. Custom Toast Notification Manager
**Difficulty:** 🟡 Medium

#### Problem
Build a global Toast Notification system driven by an imperatively callable API (`toast.success("Saved!")`), without requiring consumers to pass state down through props or render inline toast components across their trees.

#### Requirements
- Implement an external store singleton `ToastStore`.
- Provide a hook `useToast()` that binds a root `ToastContainer` to this store using `useSyncExternalStore`.
- Support auto-dismissal after a 4-second timeout.
- Provide an action to dismiss a specific toast manually.

#### Concepts Practiced
- Decoupled imperative notification dispatchers
- Singletons integrated with React rendering
- Auto-expiring state arrays

---

### 75. Multi-Step Form with URL Sync
**Difficulty:** 🟡 Medium

#### Problem
Construct a 3-step registration wizard where the currently active step and filtering criteria are serialized directly into URL query parameters (e.g., `?step=2&mode=advanced`), ensuring browser back/forward buttons work seamlessly.

#### Requirements
- Listen to browser `popstate` events.
- Updating steps pushes or replaces history entries via `window.history.pushState`.
- If the user reloads the page on `step=3`, the wizard must initialize directly at Step 3.
- Defend all URL parsing against invalid or out-of-range parameters (fallback to Step 1).

#### Concepts Practiced
- URL state synchronization
- Browser History API integration
- Defending against corrupt routing states

---

### 76. Resilient Image with Fallback and Retry
**Difficulty:** 🟢 Easy

#### Problem
Build an `<AvatarImage fallbackSrc="..." src="..."/>` component that transitions through states: loading skeleton -> rendered image -> fallback placeholder (if image fails to load).

#### Requirements
- Maintain internal status: `"loading" | "loaded" | "error"`.
- If primary `src` fails (fires `onError`), automatically try `fallbackSrc`.
- If `fallbackSrc` fails, render a styled SVG placeholder containing user initials.
- Provide a "Retry" button that resets the error state and attempts re-fetching.

#### Concepts Practiced
- Image lifecycle events in the DOM
- Multi-tier error fallback strategies
- Controlled element recovery

---

### 77. The Form Dirty/Pristine Interceptor
**Difficulty:** 🟡 Medium

#### Problem
Construct a custom hook `useFormGuard(isDirty)` that prompts the user with a confirmation dialog ("You have unsaved changes. Are you sure you want to leave?") if they attempt to navigate away or close the browser tab.

#### Requirements
- Bind to native `window.onbeforeunload` event when `isDirty` is true.
- Clear listener when `isDirty` transitions to false or the component unmounts.
- Cleanly intercept in-app link clicks within the same window.

#### Concepts Practiced
- Navigation interruption
- Window unload lifecycles
- State-dependent event registration

---

### 78. Collapsible Tree View with Lazy Subtrees
**Difficulty:** 🔴 Hard

#### Problem
Build a recursive file-system tree viewer `TreeView` that can render folders nested to arbitrary depths, fetching child nodes asynchronously only when a folder is expanded for the first time.

#### Requirements
- Component must call itself recursively.
- Cache fetched child nodes so collapsing and expanding a second time does not re-fetch.
- Indent nested subtrees cleanly using CSS custom properties or margin offsets.
- Support keyboard navigation: Down/Up to navigate files, Right to open folder, Left to close folder.

#### Concepts Practiced
- Recursive component patterns
- Asynchronous subtree caching
- Dynamic tree navigation

---

### 79. Local Storage Sync with Cross-Tab Broadcast
**Difficulty:** 🟡 Medium

#### Problem
Create a custom hook `useLocalStorage(key, initialValue)` that synchronizes state with browser `localStorage` and updates across multiple open browser tabs in real-time.

#### Requirements
- Read from `localStorage` on initial render safely (handling JSON parsing errors).
- Listen to window `'storage'` event to capture updates made by other tabs.
- When an update occurs in Tab A, Tab B must automatically re-render with the new value.

#### Concepts Practiced
- Cross-tab communication via storage events
- Serialization/deserialization boundaries
- Defensive storage error handling

---

### 80. Real-Time Drag-to-Reorder List
**Difficulty:** 🔴 Hard

#### Problem
Build a zero-dependency vertical list reordering component `DragList` that allows a user to drag and drop list items using the HTML5 Drag and Drop API.

#### Requirements
- Render a list of text items.
- Attributes: `draggable="true"`, `onDragStart`, `onDragOver`, `onDrop`.
- Show a visual drop-indicator line above or below the hovered target.
- Re-order the underlying array immutably upon drop.

#### Concepts Practiced
- HTML5 Drag and Drop integration with React state
- Array item repositioning math
- Visual drop state cues

---

# 🧠 Checkpoint 8
Before continuing, ensure you can:
- Explain why global notifications should leverage external stores rather than a Context at the root of the tree.
- Implement an accessible focus trap using native DOM queries and keyboard listeners.
- Coordinate state across distinct browser tabs using `window.addEventListener('storage', ...)`.

---

## Level 9: Refactoring Challenges and Architectural Anti-Patterns

### 81. Refactoring: God Component Decomposition
**Difficulty:** 🟡 Medium

#### Scenario
A 600-line monolithic component `UserProfileAdmin` contains:
1. User metadata fetching logic.
2. Form state management with 14 inputs.
3. Profile image upload logic with base64 encoding.
4. An embedded audit logs table with pagination.

#### Task
Split this into a clean, layered architecture:
- Custom hook: `useUserData(userId)`.
- Dumb presentational form: `ProfileForm`.
- Independent modular feature: `AuditLogTable`.
- Top-level coordinator: `UserProfileAdminView`.
Define clear prop contracts for each sub-entity.

---

### 82. Refactoring: Eliminating Redundant Booleans
**Difficulty:** 🟢 Easy

#### Poorly Designed Code
```jsx
function PaymentForm() {
  const [isProcessing, setIsProcessing] = useState(false);
  const [isSuccess, setIsSuccess] = useState(false);
  const [isFailed, setIsFailed] = useState(false);
  const [isCanceled, setIsCanceled] = useState(false);
}
```

#### Task
Refactor this into an explicit finite state machine structure using either `useState` with a union of string literals or `useReducer`. Demonstrate how this eliminates impossible, conflicting UI states.

---

### 83. Refactoring: Prop Drilling to Context / Composition
**Difficulty:** 🟡 Medium

#### Scenario
A deeply nested tree passes `currentTheme`, `setTheme`, `currentLocale`, and `userPermissions` through 6 intermediate layout components (`Page` -> `Sidebar` -> `Navigation` -> `Menu` -> `MenuItem` -> `ThemeSwitch`).

#### Task
1. Refactor using standard React Context.
2. Refactor an alternative version using purely Component Composition (passing the assembled `ThemeSwitch` component down as a pre-bound element via `children` or slots).
3. Compare architectural trade-offs between Context and Composition.

---

### 84. Refactoring: Synchronous Storage IO in Render
**Difficulty:** 🟢 Easy

#### Poorly Designed Code
```jsx
function SettingsView() {
  const theme = localStorage.getItem("app_theme") || "light";
  const layout = JSON.parse(localStorage.getItem("app_layout") || "{}");

  return <div className={theme}>...</div>;
}
```

#### Task
1. Explain the performance problem of synchronous disk IO operations during React's render phase.
2. Refactor this to use lazy state initialization: `useState(() => ...)`.

---

### 85. Refactoring: Fixing the Huge Dependency Array
**Difficulty:** 🟡 Medium

#### Poorly Designed Code
```jsx
useEffect(() => {
  if (user && org && permissions.canEdit && config.features.enableBilling && status === 'active') {
    analytics.track("Loaded Billing", { orgId: org.id, userId: user.id });
  }
}, [user, org, permissions, config, status, analytics]);
```

#### Task
Refactor this effect so it does not fire constantly every time `config` or `permissions` changes its reference identity. Extract primitive keys and decouple the analytics tracking action cleanly.

---

### 86. Refactoring: Decoupling UI from Network SDKs
**Difficulty:** 🟡 Medium

#### Scenario
A component directly imports and executes a third-party analytics library and Firebase database SDK inside its button click handlers.

#### Task
Abstract these third-party dependencies completely behind a provider boundary or custom hook interface (`useAnalytics()`, `useDatabase()`). Show how this enables trivial mock testing and prevents SDK lock-in.

---

### 87. Refactoring: Mutating Global State in Lifecycle
**Difficulty:** 🟢 Easy

#### Poorly Designed Code
```jsx
let globalViewCount = 0;

function Article() {
  useEffect(() => {
    globalViewCount++;
  }, []);

  return <div>View Count: {globalViewCount}</div>;
}
```

#### Task
1. Identify the failure modes of this code in SSR, Fast Refresh, and concurrent mounting.
2. Refactor it into an encapsulated, predictable state solution.

---

### 88. Refactoring: Converting Class Components with Lifecycles
**Difficulty:** 🟡 Medium

#### Scenario
Convert a legacy class component that implements `componentDidMount`, `componentDidUpdate(prevProps)`, and `componentWillUnmount` into a functional component.

#### Task
Map:
- `componentDidMount` -> `useEffect` with `[]`.
- `componentDidUpdate(prevProps)` comparing `prevProps.id !== this.props.id` -> `useEffect` targeting `[props.id]`.
- `componentWillUnmount` -> cleanup return function.
Highlight the fundamental mental model shift: from lifecycle events to synchronization states.

---

### 89. Refactoring: Inlining Functions in Massive Tables
**Difficulty:** 🟡 Medium

#### Scenario
A data grid renders 1,000 table rows. Each row contains an inline arrow function: `onClick={() => handleSelect(row.id)}`.

#### Task
1. Explain why relying on inline arrow functions can degrade performance when rows are memoized.
2. Refactor the pattern using event delegation on the parent `<tbody>` container, reading the item identifier via a `data-id` attribute on the event target.

---

### 90. Refactoring: Eliminating Fragile Index Keys
**Difficulty:** 🟢 Easy

#### Task
You have an editable, re-orderable list of items currently keyed by array index (`key={index}`).
- Provide a step-by-step refactoring strategy to introduce resilient, client-side generated UUIDs (`crypto.randomUUID()`) upon item creation without mutating original API payloads.

---

# 🧠 Checkpoint 9
Before continuing, ensure you can:
- Explain why lazy state initialization (`useState(() => getInitialVal())`) is critical when reading from browser storage.
- Demonstrate how event delegation on an outer container removes the need to attach thousands of individual callbacks to list items.
- Articulate the mental model shift from imperative lifecycle methods to declarative dependency synchronization.

---

## Level 10: Technical Interview & Deep Conceptual Diagnostics

### 91. Internal Architecture: How Reconciliation Works
**Difficulty:** 🔴 Hard

#### Question
1. When a component's state changes, trace the complete path from the `setState` dispatch down to the actual host DOM modification.
2. What are the two phases of the React rendering pipeline? Which phase is purely computational and interruptible, and which phase is synchronous and irreversible?
3. What is the difference between a `HostComponent` and a `FunctionComponent` fiber?

---

### 92. Synthetic Events vs. Native Events
**Difficulty:** 🟡 Medium

#### Question
1. What is React's `SyntheticEvent` wrapper, and why did React historically implement its own event delegation system?
2. In React 17+, where are event listeners attached in the real DOM tree (root container vs. `document`)?
3. What happens if you call `e.stopPropagation()` in a native DOM event listener attached to the window versus a React `onClick` handler?

---

### 93. Pure Components and the Shallow Equality Algorithm
**Difficulty:** 🟢 Easy

#### Question
Write a JavaScript function that mimics React's internal `shallowEqual(objA, objB)` function used by `React.memo` and `PureComponent`.

#### Requirements
- Handle primitive comparison using `Object.is`.
- Check key counts.
- Compare direct values shallowly.
- Demonstrate a case where `shallowEqual` returns false even though the underlying data structure is functionally identical.

---

### 94. The Strict Mode Double-Invocation Purpose
**Difficulty:** 🟢 Easy

#### Question
1. Why does React in development mode deliberately run component render functions, `useState` initializers, and `useEffect` setups/cleanups twice?
2. What specific architectural bugs does this double-invocation expose?
3. Will this double-invocation ever execute in a production build?

---

### 95. Architectural Trade-offs: CSS-in-JS vs. CSS Modules vs. Tailwind
**Difficulty:** 🟡 Medium

#### Question
From a pure React rendering engine and performance perspective:
1. What runtime performance penalty do runtime CSS-in-JS libraries (e.g., Styled Components, Emotion) introduce during rapid re-renders?
2. Why do zero-runtime systems (Tailwind CSS, Vanilla Extract, CSS Modules) integrate more efficiently with React Concurrent Mode and React Server Components?

---

### 96. React Server Components (RSC) vs. Traditional SSR
**Difficulty:** 🔴 Hard

#### Question
1. What is the fundamental architectural difference between a React Server Component (RSC) and a Client Component rendered via standard Server-Side Rendering (SSR)?
2. Do React Server Components ship any JavaScript bundle footprint to the client browser?
3. Can a React Server Component use `useState`, `useEffect`, or browser APIs? Why or why not?
4. How do Server Components and Client Components interleave within the same visual tree?

---

### 97. Memory Retaining Paths in React Applications
**Difficulty:** 🔴 Hard

#### Question
1. What is a "detached DOM tree" in the context of a React single-page application?
2. How can an improperly cleared `ref` or global event listener prevent hundreds of unmounted Fiber nodes from being collected by the browser's Garbage Collector?
3. What tools in the Chrome DevTools Memory tab do you use to locate the retaining path of a leaked React component?

---

### 98. Output Prediction: Complex Batching with Promises
**Difficulty:** 🟡 Medium

#### Question
What is logged in the console when this component runs in React 18?

```jsx
function Quiz() {
  const [val, setVal] = useState(0);

  const trigger = async () => {
    setVal(1);
    console.log("A:", val);

    await Promise.resolve();

    setVal(2);
    console.log("B:", val);

    setVal(3);
    console.log("C:", val);
  };

  return <button onClick={trigger}>Go</button>;
}
```
Explain the output for points A, B, and C, focusing on closure captures and execution contexts.

---

### 99. The Rule of Hooks: Internal Implementation Mechanics
**Difficulty:** 🔴 Hard

#### Question
1. Why does React strictly enforce that hooks cannot be called inside loops, conditions, or nested functions?
2. How does React internally store hook values on a Fiber node (linked list structure attached to `fiber.memoizedState`)?
3. What catastrophic state corruption occurs if a conditional statement changes the order of hook invocations between two consecutive render passes?

---

### 100. The React Compiler and the Future of Manual Memoization
**Difficulty:** 🟡 Medium

#### Question
1. What is the primary purpose of the React Compiler (formerly React Forget)?
2. How does the compiler analyze control flow and dependency graphs to automatically inject memoization boundaries during compilation?
3. Once the React Compiler is fully enabled across a codebase, which manual memoization APIs (`useMemo`, `useCallback`, `React.memo`) become largely obsolete, and which ones still require developer intent?

---

# 🧠 Master Diagnostic Checkpoint
Ensure you can fluently explain:
- The exact data structure of a Fiber's `memoizedState` linked list and how hook execution relies on pointer order.
- The distinction between React Server Components (zero client bundle, executed only on the server) and traditional SSR (pre-rendering HTML that is fully re-executed and hydrated on the client).
- The complete lifecycle of an event moving from the native browser queue into the React Synthetic Event system and triggering a concurrent fiber work loop.

---

# ✅ Mastery Checklist

Track your progress across every problem in this bank:

- [ ] **I understood the problem:** I can state the architectural constraints and goals without re-reading the prompt.
- [ ] **I designed the solution myself:** I identified data structures, hooks, and lifecycle states before typing code.
- [ ] **I implemented it purely:** I wrote the implementation without relying on tutorials or external boilerplate.
- [ ] **I verified edge cases:** I tested empty arrays, null/undefined inputs, rapid re-clicks, and unmount scenarios.
- [ ] **I validated memory safety:** All effects, subscriptions, timers, and refs clean up their references cleanly.
- [ ] **I can explain the solution:** I can clearly communicate the underlying React mechanics to another engineer.
- [ ] **I understand the trade-offs:** I know why this pattern was chosen over alternative patterns (e.g., Context vs. Composition).
- [ ] **I can write it from memory:** I have internalized the syntax, lifecycle, and design pattern.

---

# 🏆 Final Confidence Test

After completing all 100 challenges, you possess the operational knowledge to:
1. **Build without tutorials:** Construct production-ready React applications from an empty directory using pure React primitives.
2. **Diagnose and eliminate bottlenecks:** Profile slow renders, identify broken memoization chains, and restructure component trees to minimize render blast radiuses.
3. **Architect design systems:** Author headless, accessible, compound UI components that cleanly separate state from presentation.
4. **Master the asynchronous pipeline:** Write race-condition-free data-fetching pipelines that integrate seamlessly with Concurrent Mode and Suspense.
5. **Excel in technical interviews:** Articulate the precise mechanics of the Fiber architecture, reconciliation engine, synthetic events, and hook internals.