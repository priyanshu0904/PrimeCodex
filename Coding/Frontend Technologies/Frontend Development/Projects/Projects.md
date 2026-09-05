# Pure HTML, CSS & Vanilla JS Full-Stack Frontend Project Bank

20 end-to-end projects ordered sequentially by architectural complexity. Every project integrates semantic HTML5, modern CSS (Flexbox, Grid, Custom Properties, Transitions), and vanilla JavaScript. Zero frameworks, zero CSS utilities (no Tailwind, Bootstrap), zero third-party JS libraries.

---

# Level 1 — Absolute Beginner: DOM Basics & Static-to-Dynamic Flow

## 1. Accessible Color Palette Generator & Contrast Checker

**Difficulty:** 🟢 Absolute Beginner

### Objective

Build an interactive tool that generates harmonious color schemes, displays their hexadecimal/RGB values, and verifies compliance against WCAG text contrast ratios.

### HTML Structure

* Root layout wrapped in semantic landmarks: `<header>`, `<main>`, `<footer>`.
* Color cards structured inside an unordered list (`<ul>`), each item wrapping a preview tile, copy button, and a contrast badge.
* A `<button>` to trigger regeneration and an `<output>` element to show the calculated contrast score.

### CSS Styling & Layout

* Flexbox row on desktop that wraps down (`flex-wrap: wrap`) to a column on mobile.
* Custom properties (`--color-1`, `--color-2`, etc.) defined dynamically on `:root` or card scopes.
* Smooth `transition` on card elevation and color change.

### JavaScript Mechanics

* Generate random 6-character hex strings using bitwise arithmetic or `Math.random()`.
* Compute relative luminance using the standard WCAG formula ($L = 0.2126R + 0.7152G + 0.0722B$).
* Calculate contrast ratio against pure black (`#000000`) and pure white (`#ffffff`).
* Copy values to clipboard using the asynchronous `navigator.clipboard.writeText()` API.

### What to Pay Attention To

Avoid calculating contrast with naive RGB averages; human eyes perceive green luminance significantly higher than blue.

---

## 2. Dynamic Metric Unit & Currency Converter

**Difficulty:** 🟢 Absolute Beginner

### Objective

Create a dual-sided interactive conversion calculator with bi-directional inputs, category tabs, and validation feedback.

### HTML Structure

* Form container with `<fieldset>` and `<legend>` dividing input pairs.
* Number inputs (`<input type="number">`) configured with `step`, `min`, and connected `<label>` tags.
* `<select>` elements with `<optgroup>` categories (Length, Weight, Temperature).

### CSS Styling & Layout

* Centered card layout using CSS Grid with auto-margins.
* Visual input focus indicators using `:focus-visible`.
* Error and success states toggled using standard class selectors (`.has-error`).

### JavaScript Mechanics

* Maintain a conversion table dictionary object containing multipliers relative to a common base unit (e.g., meters for length).
* Listen to `input` events (rather than `change`) on both sides for real-time bi-directional conversion.
* Prevent infinite recursion loops when Input A updates Input B, which could re-trigger an event back to Input A.

---

## 3. High-Precision Digital Stopwatch & Lap Split Logger

**Difficulty:** 🟢 Absolute Beginner

### Objective

Build a millisecond-accurate timer with Start, Pause, Reset, and Lap logging mechanics.

### HTML Structure

* `<time>` tag to display the active timer reading.
* Control buttons grouped inside a `<nav>` or action bar: Start, Pause, Lap, Clear.
* An ordered list (`<ol reversed>`) rendering historical lap timestamps in descending order.

### CSS Styling & Layout

* Monospaced typography styling (`font-variant-numeric: tabular-nums`) to prevent text jitter as numbers update rapidly.
* Layout styled via Flexbox column with gap spacing.
* Disabled button states styled cleanly using the `:disabled` pseudo-class.

### JavaScript Mechanics

* Avoid relying solely on `setInterval` tick counts for timekeeping due to browser timer drift.
* Track elapsed time by computing the difference between `Date.now()` (or `performance.now()`) and an initial start timestamp.
* Format raw milliseconds into `MM:SS:mmm` padded strings via `String.prototype.padStart()`.
* Append lap elements to the DOM using `DocumentFragment` or `element.insertAdjacentHTML()`.

---

## 4. Multi-Category Accordion & Interactive FAQ

**Difficulty:** 🟢 Absolute Beginner

### Objective

Develop a collapsible multi-section content accordion that supports single-expanded and multiple-expanded modes.

### HTML Structure

* Outer container using `<section>`.
* Accordion items composed of a trigger `<button>` containing the title and chevron indicator, paired with a content panel (`<div role="region">`).
* Accessible bindings: `aria-expanded` on the button pointing to the panel's `id` via `aria-controls`.

### CSS Styling & Layout

* Smooth height animation utilizing CSS Grid (`grid-template-rows: 0fr` transitioning to `grid-template-rows: 1fr`) over an inner wrapper with `overflow: hidden`.
* Rotation transitions on chevron indicators using `transform: rotate(180deg)`.

### JavaScript Mechanics

* Attach a single delegated click listener to the parent container (`event.target.closest('button')`).
* Read and toggle the boolean state of `aria-expanded`.
* If "Single Expand Mode" is active, locate previously open sibling panels and collapse them before opening the selected item.

---

# Level 2 — Intermediate: State Management, Events & Persistence

## 5. LocalStorage CRUD Task Board with Filter Matrix

**Difficulty:** 🟡 Intermediate

### Objective

Build a complete Todo/Task tracker supporting creation, inline editing, completion toggling, deletion, and local persistence.

### HTML Structure

* Semantic `<form>` with a text input, due date picker (`<input type="date">`), and submit button.
* Radio button filter group wrapped in `<fieldset>`: "All", "Active", "Completed".
* Unordered list (`<ul>`) for tasks with custom checkboxes and action buttons.

### CSS Styling & Layout

* CSS Grid layout separating the form header from the task stream.
* Strike-through decoration and reduced opacity on completed tasks using class modifiers.
* Empty-state illustration/text toggled when the task list is empty.

### JavaScript Mechanics

* Maintain state as an in-memory array of task objects: `{ id, text, dueDate, completed }`.
* Synchronize state to `localStorage` on every mutation using `JSON.stringify()`.
* Use event delegation on the list container to handle completions and deletions.
* Re-render UI efficiently based on the active filter state.

---

## 6. Vanilla Quiz Application with Timer & Score Audit

**Difficulty:** 🟡 Intermediate

### Objective

Construct an interactive timed quiz that evaluates answers, tracks remaining time, and presents a comprehensive score breakdown at the end.

### HTML Structure

* `<progress>` element tracking question sequence (e.g., question 3 of 10).
* Dynamic question card containing an `<h2>` for the question and four `<button>` options.
* Results modal or panel detailing user answers vs. correct answers with explanatory text.

### CSS Styling & Layout

* Card entrance animations using `@keyframes` (subtle slide and fade-in).
* Distinct color-coded state indicators for correct and incorrect answer selections.
* Responsive container centered with CSS Grid.

### JavaScript Mechanics

* Store questions as an array of objects containing question strings, option arrays, correct index, and explanations.
* Set up a countdown timer per question using `setInterval()`; automatically move to the next question if the timer expires.
* Prevent double-clicking options by disabling sibling buttons immediately upon selection.
* Calculate final percentage, letter grade, and render the itemized breakdown.

---

## 7. Interactive Data Filtering & Multi-Criteria Search

**Difficulty:** 🟡 Intermediate

### Objective

Build a product catalog browser with instant full-text search, multi-select category tags, and dynamic price range filtering.

### HTML Structure

* Search sidebar or header containing `<input type="search">`, range slider (`<input type="range">`), and a checkbox matrix for categories.
* Output metrics element showing matching result counts (`<output>`).
* Grid container displaying product cards, each containing an image, title, category badge, and price.

### CSS Styling & Layout

* CSS Grid catalog utilizing `repeat(auto-fill, minmax(220px, 1fr))`.
* Tag badges styled with inline-block spans and subtle border radii.
* CSS transitions on card opacity and transform when cards are filtered out.

### JavaScript Mechanics

* Implement a single centralized filtering pipeline function that processes the raw dataset against all active criteria:

$$\text{Visible} = \text{MatchSearch}(\text{item}) \land \text{MatchCategory}(\text{item}) \land \text{MatchPrice}(\text{item})$$


* Debounce the text search input to optimize performance.
* Re-render the grid by creating elements via `DocumentFragment`.

---

## 8. Accessible Modal Dialog System

**Difficulty:** 🟡 Intermediate

### Objective

Create a custom, fully accessible modal dialog system utilizing native HTML5 `<dialog>` and standard accessibility patterns.

### HTML Structure

* Trigger button in the main document.
* `<dialog>` element containing header, body content, and a footer with action/close buttons.
* Secondary dismiss button using native `<form method="dialog">`.

### CSS Styling & Layout

* Native modal backdrop styling using the `::backdrop` pseudo-element (blur and semi-transparent overlay).
* Top-layer entry animations leveraging `@starting-style` (or standard opacity/transform keyframes).
* Max-width and max-height constraints with `overflow-y: auto` to prevent content from escaping viewports.

### JavaScript Mechanics

* Open the modal using `dialogElement.showModal()` to ensure true modal behavior (background elements become non-interactive / inert).
* Implement keyboard navigation traps: ensure `Escape` key closes the dialog cleanly.
* Cache the trigger element before opening; return keyboard focus to that exact element when the modal closes.

---

# Level 3 — Advanced: Asynchronous APIs, Canvas & Performance

## 9. Async Weather Dashboard with Geolocation

**Difficulty:** 🟠 Advanced

### Objective

Build a real-time weather application that queries weather APIs based on user device geolocation or text city queries, featuring dynamic day/night theming.

### HTML Structure

* Search form with a "Use Current Location" button.
* Primary weather card displaying temperature, condition text, animated SVG weather icons, and high/low ranges.
* 5-day forecast strip styled as a horizontal scrolling or wrapping list.

### CSS Styling & Layout

* Theme switching managed via CSS custom properties on the `<body>` (`--bg-primary`, `--text-primary`), adapting based on daytime/nighttime conditions.
* Horizontal scroll container with smooth snapping using `scroll-snap-type: x mandatory`.

### JavaScript Mechanics

* Query device coordinates via `navigator.geolocation.getCurrentPosition()`.
* Use the Fetch API with `async/await` to request data from Open-Meteo or similar public APIs.
* Handle edge cases gracefully: display contextual error banners for network drops, denied location permissions, or invalid city names.
* Store the last searched city in `localStorage` to reload automatically on next visit.

---

## 10. Pure Canvas Particle Sandbox

**Difficulty:** 🟠 Advanced

### Objective

Create an interactive physics particle simulation inside an HTML5 `<canvas>` where particles react to mouse movement and bounce off walls.

### HTML Structure

* `<canvas>` element filling the viewport.
* Minimal floating UI overlay panel containing inputs (`<input type="range">`) to adjust particle count, speed, and collision radius.

### CSS Styling & Layout

* Canvas pinned to full viewport using `position: fixed; inset: 0; width: 100vw; height: 100dvh;`.
* Floating control HUD positioned absolutely with semi-transparent background and backdrop blur.

### JavaScript Mechanics

* Set up an animation loop using `requestAnimationFrame(loop)`.
* Synchronize canvas internal resolution with screen DPI using `window.devicePixelRatio`.
* Particle object modeling: manage properties $x, y, v_x, v_y$, radius, and color.
* Track pointer coordinates (`mousemove`, `touchmove`); calculate Euclidean distances to attract or repel particles when the pointer approaches.

---

## 11. Multi-Track Audio Sampler & Drum Pad

**Difficulty:** 🟠 Advanced

### Objective

Construct an interactive musical drum machine and audio pad triggered via keyboard events and on-screen clicks.

### HTML Structure

* 4x4 grid of drum pads (`<button class="pad">`).
* Volume slider, tempo BPM counter, and playback status indicator.
* Visually hidden audio elements or Web Audio context initialization hooks.

### CSS Styling & Layout

* 4x4 square grid using `display: grid; grid-template-columns: repeat(4, 1fr); aspect-ratio: 1;`.
* Interactive visual active state: button glows and scales down (`transform: scale(0.95)`) on press.

### JavaScript Mechanics

* Initialize and route audio using the native `AudioContext` API to avoid mobile audio latency.
* Map keyboard `keydown` codes (e.g., keys `1-4`, `Q-R`, `A-F`, `Z-V`) to specific audio buffer triggers.
* Prevent audio clipping by creating dynamic GainNodes for master volume control.
* Highlight on-screen pads when their corresponding physical keys are pressed.

---

## 12. Infinite Scroll Image Gallery with IntersectionObserver

**Difficulty:** 🟠 Advanced

### Objective

Build a masonry-style image exploration feed that dynamically loads and displays new images as the user scrolls, without scroll listener lag.

### HTML Structure

* Gallery container using semantic `<section>`.
* Individual image cards wrapped in `<figure>` with `<figcaption>` descriptions.
* Sentinel loading indicator (`<div id="sentinel">`) placed at the very bottom of the document.

### CSS Styling & Layout

* CSS Multi-column layout (`columns: 3 300px; column-gap: 1rem;`) or modern auto-fit grid to achieve a masonry look.
* Skeleton loader placeholders using linear-gradient shimmer animations.
* Smooth opacity fade-in transitions when images complete loading.

### JavaScript Mechanics

* Fetch batches of royalty-free images (e.g., Unsplash or Picsum public endpoints) via `fetch()`.
* Attach an `IntersectionObserver` to the `#sentinel` element to trigger the next fetch batch when scrolled into view.
* Track in-flight request flags (`isLoading = true`) to prevent duplicate overlapping network requests.
* Cancel network requests if necessary using `AbortController`.

---

## 13. Virtualized Data Table

**Difficulty:** 🟠 Advanced

### Objective

Render a massive dataset (50,000+ rows) in a smooth-scrolling data table without crashing the browser DOM.

### HTML Structure

* Viewport scroll container wrapping a spacer element and an inner content table.
* Table headers (`<th>`) with sorting buttons.
* Search input to filter rows across the large dataset.

### CSS Styling & Layout

* Viewport set to a fixed height with `overflow-y: auto`.
* Header row pinned to the top using `position: sticky; top: 0; z-index: 2;`.
* Inner table row positioning managed via `transform: translateY(...)`.

### JavaScript Mechanics

* Calculate visible slice boundaries on each scroll event:

$$\text{startIndex} = \max\left(0, \left\lfloor \frac{\text{scrollTop}}{\text{rowHeight}} \right\rfloor - \text{buffer}\right)$$


$$\text{endIndex} = \min\left(\text{totalRows}, \text{startIndex} + \text{visibleCount} + 2 \times \text{buffer}\right)$$


* Re-render only the 20–40 items currently in the visible window plus buffer rows.
* Set the outer container's virtual height ($H = \text{totalRows} \times \text{rowHeight}$) to preserve native scrollbar size and behavior.

---

## 14. Rich Text WYSIWYG Editor

**Difficulty:** 🟠 Advanced

### Objective

Build an in-browser rich-text editor supporting formatting controls, block structures, markdown shortcuts, and HTML exports.

### HTML Structure

* Toolbar containing action buttons: Bold, Italic, Strikethrough, Heading, Blockquote, Ordered List, and Export.
* Editable document surface using an element configured with `contenteditable="true"`.
* Modal/drawer containing a read-only `<textarea>` outputting the raw HTML markup.

### CSS Styling & Layout

* Document canvas styled to mimic an A4 or standard letter document surface with centered layout and subtle shadows.
* Active toolbar states highlighted when the cursor rests within formatted text.

### JavaScript Mechanics

* Avoid deprecated `document.execCommand()`; implement formatting using the `Selection` and `Range` APIs (`window.getSelection()`).
* Extract active range, wrap selected text nodes inside semantic tags (`<strong>`, `<em>`, `<h1>`), and handle boundary collapses.
* Intercept paste events (`paste`) to strip malicious styles and foreign HTML markup before insertion.
* Listen to keyboard events to convert Markdown shortcuts on the fly (e.g., typing `# ` at line start converts the line to an `<h1>`).

---

# Level 4 — Expert: Architecture, State Machines & Native System Engines

## 15. Drag-and-Drop Kanban Workflow Engine

**Difficulty:** 🔴 Expert

### Objective

Build a multi-column Kanban board supporting drag-and-drop card reordering across columns, persistent data, and full keyboard accessibility.

### HTML Structure

* Board container with multiple columns (`<section class="column">`), each with a header, item list, and "Add Card" button.
* Card elements marked with `draggable="true"`, tabindex, and action buttons.

### CSS Styling & Layout

* Horizontal Flexbox or Grid layout with independent vertical column scrolling.
* Visual drop indicator placeholder indicating target position during drag-over.
* Subtle tilting and shadow elevation applied to the card being dragged.

### JavaScript Mechanics

* Implement the complete HTML5 Drag and Drop API: `dragstart`, `dragenter`, `dragover`, `dragleave`, `drop`, `dragend`.
* Attach serialization metadata to `event.dataTransfer.setData('text/plain', cardId)`.
* Implement keyboard-accessible card movement (e.g., `Space` to pick up, `ArrowUp`/`ArrowDown` to change position, `ArrowLeft`/`ArrowRight` to change columns, `Enter` to drop).
* Synchronize changes across columns in the application state object and save to storage.

---

## 16. Offline-First IndexedDB Notes System with Markdown Parsing

**Difficulty:** 🔴 Expert

### Objective

Architect a full-featured personal notes workspace that operates completely offline, stores large notes and attachments in IndexedDB, and renders live Markdown previews.

### HTML Structure

* Two-pane workspace: sidebar listing notes, main content area split into editor `<textarea>` and live preview `<article>`.
* Status indicator tracking IndexedDB sync status and storage quota.

### CSS Styling & Layout

* CSS Grid two-pane layout with a draggable divider boundary to resize panes.
* Typography styles for the preview window handling headings, code blocks, lists, and tables cleanly.

### JavaScript Mechanics

* Wrap native `indexedDB.open()` in an asynchronous Promise interface to perform CRUD transactions.
* Write a custom lightweight Markdown regex parser that transforms basic Markdown (`#`, `**`, `*`, `[link](url)`, code blocks) into HTML.
* Register a Service Worker (`sw.js`) with Cache Storage to make the application assets load with zero network connection.

---

## 17. Client-Side Single-Page Application (SPA) Router & State Store

**Difficulty:** 🔴 Expert

### Objective

Construct an application shell supporting client-side routing, URL parameter extraction, route-level lifecycle hooks, and a centralized pub/sub state store.

### HTML Structure

* Standard navigation bar with anchor links (`<a href="/home">`, `<a href="/users/123">`).
* Root outlet element (`<div id="router-outlet"></div>`) where views are mounted.

### CSS Styling & Layout

* Full-page application skeleton with fixed navigation and scrollable view container.
* Smooth page transitions using the modern View Transitions API (`document.startViewTransition()`).

### JavaScript Mechanics

* Intercept global link navigation clicks via event delegation; call `event.preventDefault()` for internal paths.
* Update browser history and address bar using `history.pushState()`; handle back/forward buttons using `window.addEventListener('popstate', ...)`.
* Match URL paths against registered regex route tables; extract route parameters (e.g., `/users/:id` $\to$ `{ id: "123" }`).
* Implement an in-memory Store with `getState()`, `dispatch(action)`, and `subscribe(listener)` methods to manage global state across routes.

---

## 18. Browser-Based Code Editor & Live Code Runner

**Difficulty:** 🔴 Expert

### Objective

Build an interactive browser coding workspace that provides syntax-colored input, line numbering, synchronized indentation, and real-time execution in a sandboxed iframe.

### HTML Structure

* Split-screen interface: Code Editor container on the left, Result Preview on the right.
* Run button, Reset button, and Console Output terminal drawer.
* Execution display container built with a sandboxed `<iframe sandbox="allow-scripts">`.

### CSS Styling & Layout

* Editor styling with overlaid typography: a transparent `<textarea>` positioned directly on top of a `<pre><code>` block to enable syntax highlighting while typing.
* Monospaced font configuration with matching font size, line height, and padding between textarea and code layers.

### JavaScript Mechanics

* Synchronize scrolling between the transparent textarea and the underlying highlighted code block.
* Handle key traps: intercept `Tab` key presses to insert two spaces instead of switching keyboard focus away from the editor.
* Execute user code safely by injecting written HTML/CSS/JS into the sandboxed `iframe` using `srcdoc` or blob URLs.
* Intercept `iframe` console messages by overriding its `window.console.log` and messaging output back to the parent window via `postMessage()`.

---

## 19. Real-Time Collaborative Whiteboard

**Difficulty:** 🔴 Expert

### Objective

Develop a drawing canvas supporting shape tools, freehand drawing, layer undo/redo history, and simulated multi-user cursor updates.

### HTML Structure

* Fixed floating toolbar with tools: Pencil, Rectangle, Circle, Eraser, Color Picker, Stroke Width, and Undo/Redo.
* Full-screen `<canvas>` drawing surface.
* Overlay layer displaying active peer cursor indicators and names.

### CSS Styling & Layout

* Canvas stretched to fill screen.
* Tool buttons with clear active states indicating the current tool.
* Custom cursor styling based on the active tool (crosshair, pencil icon, eraser circle).

### JavaScript Mechanics

* Capture mouse/touch vectors on canvas: track `pointerdown`, `pointermove`, and `pointerup`.
* Implement an Undo/Redo stack: store canvas frame snapshots as ImageData arrays (`ctx.getImageData()`) or declarative shape command lists.
* Simulate external real-time events using `BroadcastChannel` or `localStorage` storage events across browser tabs.
* Broadcast pointer coordinates across tabs and render remote user cursor indicators on screen.

---

## 20. Capstone Project: Full-Featured Spreadsheet Engine

**Difficulty:** 🔴 Expert

### Objective

Engineer a fully functional, browser-based reactive spreadsheet engine supporting cell coordinates, dynamic resizing, custom cell formatting, and mathematical formula calculation with a dependency graph.

```text
+---+----------------------+--------------------+--------------------+
|   | A                    | B                  | C                  |
+---+----------------------+--------------------+--------------------+
| 1 | Revenue              | 5000               |                    |
| 2 | Expenses             | 3200               |                    |
| 3 | Net Profit           | =B1-B2             |                    |
| 4 | Tax Rate             | 0.20               |                    |
| 5 | Tax Owed             | =B3*B4             |                    |
+---+----------------------+--------------------+--------------------+

```

### HTML Structure

* Top formula bar: shows active cell reference (e.g., `B3`) and input text box for editing formulas or values.
* Table grid layout: Column headers (`A-Z`), Row headers (`1-100`), and a 2D matrix of editable cells (`<td>`).
* Bottom status bar calculating automatic statistics (SUM, AVERAGE, COUNT) for selected cells.

### CSS Styling & Layout

* Matrix layout built using standard `<table>` with fixed dimensions.
* Sticky row and column headers staying pinned during horizontal and vertical scrolling.
* Active cell highlight with a thick primary-color border and a small drag-fill handle in the bottom-right corner.

### JavaScript Mechanics

* **Data Model:** Store spreadsheet data in a flat hash-map:
```javascript
{ "A1": { raw: "Revenue", value: "Revenue" }, "B3": { raw: "=B1-B2", value: 1800 } }

```


* **Formula Evaluator & Parser:**
* Tokenize formulas starting with `=`.
* Parse references (e.g., `A1`, `B2`) and basic arithmetic operators (`+`, `-`, `*`, `/`).
* Support functions like `=SUM(A1:A5)` and `=AVERAGE(B1:B10)`.


* **Reactive Dependency Graph:**
* Track dependencies: if `B3` depends on `B1` and `B2`, then updating `B1` must automatically recompute `B3`, which in turn triggers `B5`.
* Implement cycle detection (e.g., `A1 = A2` and `A2 = A1`) to flag circular dependency errors (`#CIRCULAR!`).


* **Keyboard Navigation:**
* Support `ArrowUp`, `ArrowDown`, `ArrowLeft`, and `ArrowRight` to shift the active cell.
* Pressing `Enter` commits the cell edit and moves focus down one row.
* Pressing `Tab` commits the edit and moves focus right one column.



---

# Progression Path & Implementation Strategy

```text
Level 1 (Projects 1-4)    --> Solidify DOM selections, event listeners, basic CSS layouts.
Level 2 (Projects 5-8)    --> Master in-memory state arrays, localStorage, accessibility standards.
Level 3 (Projects 9-14)   --> Harness Canvas, Web Audio, IntersectionObserver, and Async APIs.
Level 4 (Projects 15-20)  --> Build enterprise browser engines, state machines, and system algorithms.

```

### Development Rules for Maximum Learning

1. **Never use `div` for buttons or links**: Use `<button>` for actions, `<a>` for navigation.
2. **Never alter visual layout via JS styles**: Modify CSS classes or custom properties; keep layout logic in CSS.
3. **Separate state from DOM**: Maintain state in JavaScript variables or objects first, then project that state into the DOM.