# ⚡ 25 React Projects: Beginner to Expert

---

## 🟢 Tier 1: Core Mechanics & Pure Rendering

### 01. Precision Counter & Event Log Studio
* **UI/UX:** Monospaced metric display, quick-step buttons (`-10`, `-1`, `+1`, `+10`), live timestamped event ledger.
* **Core Stack:** Semantic HTML, CSS Flexbox, pure `useState`.
* **Features:**
  * Increment/decrement with custom step values and boundaries (min/max).
  * History list logging every operation with previous value, new value, and timestamp.
  * Clear history and revert-to-step capabilities.
* **Key Challenge:** Enforcing functional state updaters (`prev => prev + 1`) to eliminate stale closures during rapid key presses.

---

### 02. Minimalist Split-Bill & Ledger Terminal
* **UI/UX:** Split-screen financial terminal, live visual breakdown bars, interactive tip pills (10%, 15%, 20%, Custom).
* **Core Stack:** Controlled inputs, SVG progress bars, pure React state.
* **Features:**
  * Bill total, custom tip percentage, and dynamic headcount selector.
  * Real-time breakdown: subtotal per person, tip per person, total per person.
  * Toggle options for rounding up to the nearest whole dollar.
* **Key Challenge:** Deriving all totals on the fly during the render pass without keeping redundant computed state or hitting IEEE-754 precision bugs.

---

### 03. Accessible Compound Accordion Surface
* **UI/UX:** Keyboard-first accordion with smooth CSS Grid height transitions (`grid-template-rows: 0fr -> 1fr`) and focus rings.
* **Core Stack:** React compound component pattern, WAI-ARIA standards.
* **Features:**
  * Subcomponents: `Accordion`, `Accordion.Item`, `Accordion.Trigger`, `Accordion.Panel`.
  * Mode toggle: Single panel active vs. multi-panel expansion.
  * Full keyboard navigation (Up/Down arrows, Home, End, Space, Enter).
* **Key Challenge:** Syncing accessibility attributes (`aria-expanded`, `aria-controls`, `aria-labelledby`) across parent and child components without prop drilling.

---

### 04. Markdown Canvas & Live Sanitized Preview
* **UI/UX:** Split-pane editor (VS Code style), synchronized scrolling, live reading time and word count badge.
* **Core Stack:** `marked` / `remark`, `DOMPurify`, controlled textareas.
* **Features:**
  * Real-time markdown parser supporting tables, task lists, and syntax blocks.
  * Client-side sanitization preventing script injection.
  * One-click markdown formatting toolbar (Bold, Italic, Code, Link, Table).
* **Key Challenge:** Safely sanitizing untrusted markup with `DOMPurify` while preserving textarea cursor/selection position during toolbar actions.

---

### 05. Adaptive Flashcard Study Engine
* **UI/UX:** 3D card-flip perspective animations, swipe gestures, progress bar, mastery difficulty tags.
* **Core Stack:** CSS 3D transforms, array state management, browser keyboard events.
* **Features:**
  * Flip-to-reveal card mechanics with keyboard controls (Space to flip, 1-3 for difficulty).
  * Deck filtering by topic or confidence level.
  * Session summary showing total cards reviewed, accuracy, and study time.
* **Key Challenge:** Isolating flip state per card to prevent layout flash or mass-flipping across mapped card arrays.

---

## 🟡 Tier 2: Asynchronous Flow & Client Routing

### 06. Atmospheric Weather Radar & Telemetry
* **UI/UX:** Glassmorphic cards, contextual color palettes shifting with sunrise/sunset, high-contrast metric badges.
* **Core Stack:** Geolocation API, Open-Meteo API / OpenWeatherMap, `useEffect`.
* **Features:**
  * Auto-detect location on mount with manual city search override.
  * 24-hour hourly trend slider and 7-day forecast cards.
  * Unit toggle (Celsius/Fahrenheit) persisting in local state.
* **Key Challenge:** Mitigating network race conditions with cleanup functions and `AbortController` when switching cities rapidly.

---

### 07. Debounced Omnisearch Discovery Engine
* **UI/UX:** Floating command palette (`Cmd/Ctrl + K`), skeleton loaders, highlighted search substrings.
* **Core Stack:** Custom `useDebounce`, TMDB API or OpenLibrary API, keyboard trap.
* **Features:**
  * 300ms debounced live-search query execution.
  * Arrow key navigation through dropdown search results with Enter-to-select.
  * Recent searches stored in `localStorage` with quick-clear actions.
* **Key Challenge:** Canceling in-flight network requests before older responses can overwrite newer search results.

---

### 08. Enterprise Multi-Step Onboarding Funnel
* **UI/UX:** Animated wizard steps, dynamic step indicators, sticky summary sidebar, contextual validation alerts.
* **Core Stack:** Multi-step state machine, Zod / Yup validation, `sessionStorage`.
* **Features:**
  * Step 1: Account credentials; Step 2: Personal details; Step 3: Payment/Preferences.
  * Per-step validation gating progression to subsequent steps.
  * Session auto-save allowing users to refresh without losing form progress.
* **Key Challenge:** Enforcing conditional validation schemas per step without resetting untouched field errors.

---

### 09. Static-Style Markdown Journal & Route Cache
* **UI/UX:** Clean editorial layout, reading progress indicator bar, dynamic category chips.
* **Core Stack:** React Router (v6/v7), URL search params, dynamic route segments.
* **Features:**
  * Routes: `/`, `/posts`, `/posts/:slug`, `/category/:categoryName`.
  * Search, sort, and tag filters synced to URL parameters (`useSearchParams`).
  * Scroll restoration preserving scroll position when navigating back from an article.
* **Key Challenge:** Synchronizing filter state with URL parameters so links remain shareable and browser back/forward buttons work correctly.

---

### 10. Local-First Column Task Organizer
* **UI/UX:** Multi-column Kanban board, inline editable card titles, subtle drop-target visual guides.
* **Core Stack:** Nested immutable state, custom drag events or native mouse listeners, `localStorage`.
* **Features:**
  * Default columns: Backlog, In Progress, In Review, Done.
  * Create, edit, reorder, and transfer tasks across columns.
  * Search query filtering tasks in real-time across all columns.
* **Key Challenge:** Performing immutable multi-level array operations (moving an item from index $X$ in column $A$ to index $Y$ in column $B$) without reference mutations.

---

## 🟠 Tier 3: Systems Architecture & State Machines

### 11. Modern E-Commerce Store & Sliding Bag
* **UI/UX:** Sticky header, sliding flyout cart drawer, stock badges, micro-interactions on item add.
* **Core Stack:** Context API + `useReducer` (or Zustand), immutable cart operations.
* **Features:**
  * Product grid with category filtering and price sorting.
  * Flyout cart with quantity modifiers, discount code application, and tax calculation.
  * Out-of-stock disable states reflecting real inventory boundaries.
* **Key Challenge:** Partitioning Context into State and Dispatch contexts to prevent catalog-wide re-renders when updating cart quantities.

---

### 12. Waveform Audio Suite & Deck Player
* **UI/UX:** Dark-mode hi-fi visualizer, audio scrubbing bar with hover timestamps, track playlist rail.
* **Core Stack:** HTML5 Web Audio API, HTML5 Canvas, `useRef`, `requestAnimationFrame`.
* **Features:**
  * Track controls: Play, pause, skip, seek, loop, volume, and playback speed.
  * Real-time canvas frequency visualizer synced with audio output.
  * Track queue management with re-ordering support.
* **Key Challenge:** Keeping imperative Canvas drawing loops and HTML5 audio events in sync with declarative React component state without visual jitter.

---

### 13. Production-Ready Headless Component System
* **UI/UX:** Unstyled, accessible component showcase with theme toggle, keyboard indicator badges, and code previews.
* **Core Stack:** `forwardRef`, `useId`, custom hooks (`useClickOutside`, `useFocusTrap`), ARIA primitives.
* **Features:**
  * Primitives: Modal Dialog, Popover/Tooltip, Dropdown Menu, Floating Toast system.
  * Focus restoration to triggering elements on dismiss.
  * Zero CSS dependencies, allowing external styling through `className` or render props.
* **Key Challenge:** Building focus traps and portal boundaries that prevent events from leaking through unmounted DOM nodes.

---

### 14. Optimistic Messaging Terminal
* **UI/UX:** Slack-style chat interface, delivery status indicators (sending, sent, failed), sticky unread banner.
* **Core Stack:** Custom state reducers, synthetic network delay simulator, `useLayoutEffect`.
* **Features:**
  * Instant message rendering (optimistic state) with simulated backend latency.
  * Manual retry action on failed messages.
  * Smart auto-scroll: sticks to bottom on new messages only if the user hasn't scrolled up.
* **Key Challenge:** Calculating scroll boundaries inside `useLayoutEffect` to prevent viewport jumps when prepending historical messages.

---

### 15. Financial Metrics & Performance Console
* **UI/UX:** Dense trading desk interface, real-time price tickers, tabular financial rows with delta indicators.
* **Core Stack:** `useMemo`, `useCallback`, `React.memo`, SVG chart drawing.
* **Features:**
  * Live-streaming data simulation updating 50+ tickers every 250ms.
  * Dynamic multi-column sorting and filtering across 5,000+ data rows.
  * Key technical indicator charts (Moving Average, RSI).
* **Key Challenge:** Profiling with React DevTools and memoizing selector paths to prevent ticker updates from re-rendering the entire table.

---

## 🟣 Tier 4: Concurrent Mode & Real-World Scale

### 16. High-Density Virtualized Data Grid
* **UI/UX:** High-density enterprise data grid, custom scrollbars, fixed headers, zebra striping.
* **Core Stack:** Custom windowing algorithm (zero third-party virtualization libs), absolute DOM positioning.
* **Features:**
  * Renders 100,000 tabular items keeping only visible elements ($\sim 30$ rows + overscan buffer) in the DOM.
  * Dynamic column sorting, text filtering, and inline cell editing.
  * Virtualized vertical scrollbar matching the true height of the full dataset.
* **Key Challenge:** Computing dynamic row height offsets and scroll translations without causing blank white frames during fast scrolling.

---

### 17. Offline-First Knowledge Base PWA
* **UI/UX:** Desktop-class documentation workspace, sync status pills (Offline, Syncing, Saved), conflict comparison modal.
* **Core Stack:** Service Workers, IndexedDB (`idb`), Cache API, Web Manifest.
* **Features:**
  * Full offline CRUD support for markdown documents.
  * Automatic network listener synchronizing local changes when reconnected.
  * Conflict resolution interface showing side-by-side local vs. remote diffs.
* **Key Challenge:** Building a local queue that serializes and replays offline mutations in order when network connectivity returns.

---

### 18. Responsive Query Engine with Concurrent React
* **UI/UX:** Filter sliders, categorical dropdowns, complex scatter/distribution plots, loading states with lowered opacity.
* **Core Stack:** `useTransition`, `useDeferredValue`, `Suspense`, modern synthetic render scheduling.
* **Features:**
  * High-frequency slider and search inputs manipulating 10,000+ SVG data points.
  * Urgent updates (typing/sliding) maintain 60fps responsiveness.
  * Chart re-renders run as non-blocking background transitions.
* **Key Challenge:** Distinguishing urgent user interactions from expensive rendering calculations using `useTransition` to eliminate input lag.

---

### 19. Resilient Server-State Issue Board
* **UI/UX:** GitHub Issues clone, label badges, optimistic count pills, skeleton placeholders.
* **Core Stack:** TanStack Query (React Query) or custom cache manager, Mock Service Worker (MSW).
* **Features:**
  * Infinite scroll pagination with cursor-based fetching.
  * Optimistic upvoting, status changing, and issue commenting with instant rollbacks on network failure.
  * Stale-while-revalidate background caching and window focus refetching.
* **Key Challenge:** Implementing multi-step optimistic cache mutations that handle rollbacks correctly if an in-flight mutation errors out.

---

### 20. Web Worker Image Processing Suite
* **UI/UX:** Darkroom studio theme, split comparison slider (Before/After), export modal with quality presets.
* **Core Stack:** Web Workers API, Canvas API, ArrayBuffers, OffscreenCanvas.
* **Features:**
  * Image filters (Grayscale, Invert, Gaussian Blur, Sepia, Edge Detection).
  * Crop, rotate, flip, and aspect-ratio constraint locks.
  * Batch processing queue for multiple imported images.
* **Key Challenge:** Offloading heavy image convolution matrices and pixel manipulation to a dedicated Web Worker to keep the UI thread completely unblocked.

---

## 🔴 Tier 5: Enterprise Systems & Full-Stack Platforms

### 21. Collaborative Canvas & Diagramming Surface
* **UI/UX:** Infinite dot-grid canvas, real-time multi-user cursor flags, floating styling toolbar.
* **Core Stack:** WebSockets / WebRTC, CRDTs (Yjs), Canvas/SVG, vector math.
* **Features:**
  * Vector shapes (rectangles, circles, arrows, text blocks) with bounding box resize handles.
  * Real-time cursor coordinates and shape additions broadcast across connected users.
  * Branching undo/redo action timeline.
* **Key Challenge:** Resolving simultaneous conflicting edits (e.g., two users moving the same shape at the same time) without state divergence using CRDT structures.

---

### 22. Next.js Enterprise LMS & Content Portal
* **UI/UX:** Modern video streaming dashboard, interactive lesson checkpoints, dynamic theme switching.
* **Core Stack:** Next.js (App Router), React Server Components (RSC), Server Actions, Suspense streaming.
* **Features:**
  * Secure server-rendered lesson viewing with server-side authentication checks.
  * Video player tracking watch-progress checkpoints via Server Actions.
  * Course purchase checkout flow with Stripe integration and dynamic invoice generation.
* **Key Challenge:** Setting architectural boundaries between Server Components (fetching data, zero client JS) and Client Components (interactive video controls, theme switches).

---

### 23. Node-Based Workflow & Automation Studio
* **UI/UX:** Infinite canvas, draggable bezier connection handles, live execution pulse animations.
* **Core Stack:** React Flow (or custom SVG curve graph engine), Directed Acyclic Graph (DAG) state manager.
* **Features:**
  * Drag-and-drop nodes: Triggers (Webhook, Schedule), Actions (Send Email, Transform Data), Logic (If/Else).
  * Bezier wire connections linking input and output ports.
  * Real-time graph validator running topological sorting to test workflow viability.
* **Key Challenge:** Detecting and preventing cyclic dependencies (loops) and validating input/output data-type compatibility before connecting nodes.

---

### 24. Extensible Headless Form & Schema Generator
* **UI/UX:** Split-screen visual builder: drag-and-drop builder canvas on the left, live JSON schema and code output on the right.
* **Core Stack:** `@dnd-kit`, recursive schema renderers, custom AST generators.
* **Features:**
  * Drag form primitives (inputs, selects, toggles, layout grids) into a nested structure.
  * Configure validation rules, default values, and visibility conditions dynamically.
  * One-click export to clean, valid React component code using `react-hook-form` and Zod.
* **Key Challenge:** Re-ordering and nesting form containers recursively without triggering full-tree re-renders or losing input state.

---

### 25. Sandboxed Web IDE & Runtime Playground
* **UI/UX:** Desktop-grade IDE interface, tabbed multi-file explorer, movable split panes, integrated terminal emulator.
* **Core Stack:** Monaco Editor, Web Workers, `esbuild-wasm`, sandboxed `iframe`.
* **Features:**
  * In-browser JSX/TypeScript compilation using WebAssembly-powered `esbuild`.
  * Multi-file project structure supporting relative module imports.
  * Sandboxed `iframe` preview with captured `console.log` streaming into an integrated terminal panel.
* **Key Challenge:** Intercepting and proxying `console` outputs, error boundaries, and network requests from inside the sandboxed `iframe` back to the parent React interface safely.