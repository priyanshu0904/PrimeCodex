# CSS Mastery Question Bank

50 hands-on, zero-JavaScript, pure-CSS problems arranged sequentially. Every problem focuses solely on styling mechanics, the cascade, selectors, the box model, visual formatting contexts, Flexbox, Grid, transitions, animations, and modern responsive layouts.

---

# Level 1 — Selectors, Specificity & the Cascade

## 1. Type, Class, and ID Application

**Difficulty:** 🟢 Easy

### Problem

Construct a basic stylesheet demonstrating the fundamental hierarchy of element selectors, class selectors, and ID selectors.

### Requirements

* Target all `<p>` tags with base font styling.
* Create a reusable `.highlight` class that changes the background color.
* Create a unique `#lead-paragraph` selector that sets a distinct text size.
* Target an element using a multi-class selector (e.g., `.card.featured`).

### Given

```html
<p id="lead-paragraph" class="highlight">Introduction text</p>
<p class="highlight">Body paragraph</p>
<div class="card featured">Card content</div>

```

### Expected Behavior

The lead paragraph receives both the base paragraph styles, the highlight background, and the larger ID font size without conflict.

### What to Pay Attention To

* The difference between matching an element with two classes attached (`.card.featured`) versus an element nested inside another (`.card .featured`).

---

## 2. Specificity Score Calculation & Conflict Resolution

**Difficulty:** 🟡 Medium

### Problem

Resolve a style collision without relying on the `!important` rule by calculating and adjusting CSS specificity scores.

### Buggy Code

```html
<nav id="main-nav" class="navigation">
  <ul class="nav-list">
    <li class="nav-item"><a href="#" class="nav-link">Home</a></li>
  </ul>
</nav>

```

```css
#main-nav .nav-link {
  color: black;
}

/* You want this rule below to win, but it currently loses: */
.navigation ul li a.nav-link {
  color: royalblue;
}

```

### Task

* Calculate the specificity of both selectors $(A, B, C, D)$.
* Modify the second selector using selector chaining or IDs so that it overrides `#main-nav .nav-link` naturally without using `!important`.

### What to Pay Attention To

* The four-part specificity vector: Inline styles, IDs, Classes/Attributes/Pseudo-classes, Elements/Pseudo-elements.

---

## 3. Combinators: Descendant, Child, Adjacent, and General Sibling

**Difficulty:** 🟢 Easy

### Problem

Style a nested article layout using combinators to target elements based on their exact relationships in the DOM tree.

### Requirements

* Style all `<span>` tags nested anywhere inside an `<article>` using the descendant combinator (space).
* Style only `<blockquote>` tags that are immediate children of `<article>` using the child combinator (`>`).
* Style a `<p>` immediately following an `<h2>` heading with unique leading text styling using the adjacent sibling combinator (`+`).
* Style all subsequent `<p>` elements following an `<h2>` divider using the general sibling combinator (`~`).

### Given

```html
<article>
  <h2>Heading</h2>
  <p>First paragraph directly after heading.</p>
  <p>Second paragraph. <span>Span one</span></p>
  <section>
    <blockquote>Nested quote</blockquote>
    <span>Span two inside section</span>
  </section>
  <blockquote>Direct child quote</blockquote>
</article>

```

---

## 4. Attribute Selectors

**Difficulty:** 🟡 Medium

### Problem

Apply targeted styling to an arbitrary HTML form and link directory relying entirely on attribute selectors.

### Requirements

* Target any `<a>` element whose `href` attribute begins with `https://` (`^=`).
* Target any `<a>` element linking to a `.pdf` file (`$=`).
* Target any `<input>` element with `type="password"`.
* Target elements that contain a specific standalone word in their `data-status` attribute (`~=`).

### What to Pay Attention To

* The difference between `[attr*="val"]` (substring anywhere), `[attr^="val"]` (prefix), and `[attr$="val"]` (suffix).

---

## 5. Structural Pseudo-Classes: Child vs. Type

**Difficulty:** 🟡 Medium

### Problem

Differentiate between index-based child selectors (`:nth-child`) and type-based selectors (`:nth-of-type`) within a mixed container.

### Given

```html
<div class="container">
  <h1>Title</h1>
  <p>First Paragraph</p>
  <div>Ad banner</div>
  <p>Second Paragraph</p>
  <p>Third Paragraph</p>
</div>

```

### Requirements

* Target the second paragraph using `:nth-of-type()`.
* Explain why `.container p:nth-child(2)` works in this snippet, but `.container p:nth-child(3)` selects nothing.
* Create an alternating zebra-stripe background on an ordered list using `:nth-child(even)` and `:nth-child(odd)`.

---

## 6. Dynamic & State Pseudo-Classes

**Difficulty:** 🟢 Easy

### Problem

Build a complete set of interactive visual states for links and form inputs without scripts.

### Requirements

* Style an anchor tag across its complete lifecycle: `:link`, `:visited`, `:hover`, and `:active` (maintaining the correct LVHA ordering).
* Style a text input when focused using `:focus`.
* Style an input differently when it is in a `:disabled` state versus an enabled state.
* Style a checkbox when it is toggled on using `:checked`.

### What to Pay Attention To

* The "LVHA" rule: Link, Visited, Hover, Active. Defining `:visited` after `:hover` breaks hover styling on visited links.

---

## 7. Negative & Relational Selectors (`:not`, `:has`, `:is`, `:where`)

**Difficulty:** 🟠 Hard

### Problem

Simplify a complex selector list and implement parent-aware styling using modern functional pseudo-classes.

### Requirements

* Style all buttons that do not have the `.btn-disabled` class using `:not()`.
* Group headings inside sections, articles, and asides into a single rule using `:is(section, article, aside) h2`.
* Apply a zero-specificity base style across multiple containers using `:where()`.
* Style a parent `.card` container only when it contains an image using the relational pseudo-class `:has()`.

### Concepts Practiced

* `:not()`, `:is()`, `:where()`, `:has()`

---

## 8. Pseudo-Elements: Generating Content and Stylistic Hooks

**Difficulty:** 🟢 Easy

### Problem

Add decorative design accents to an element tree without introducing extra HTML markup.

### Requirements

* Prepend an automatic counter or icon bullet before every `<h2>` using `::before` and the `content` property.
* Append a bottom accent line beneath an element using `::after`.
* Style the very first letter of a magazine article paragraph into a decorative drop cap using `::first-letter`.
* Customize the selection highlight color across the page using `::selection`.

### What to Pay Attention To

* A `::before` or `::after` pseudo-element will not render on screen if the `content` property is omitted.

---

# 🧠 Checkpoint 1: Selectors & Cascade

Before continuing, make sure you can:

* Explain why `:where(.header)` has lower specificity than `.header`.
* State why the ordering of `:link`, `:visited`, `:hover`, and `:active` matters.
* Predict the outcome when `:nth-child(3)` encounters a sibling of a different tag type.
* Identify the parent-selection capabilities introduced by `:has()`.

---

# Level 2 — The CSS Box Model & Sizing Realities

## 9. Standard vs. Border-Box Sizing

**Difficulty:** 🟢 Easy

### Problem

Demonstrate how padding and borders alter element dimensions under the default box model, and rectify the issue using universal box sizing.

### Requirements

* Create two identical `<div>` elements with `width: 300px`, `padding: 20px`, and `border: 5px solid black`.
* Leave the first div on `box-sizing: content-box`.
* Set the second div to `box-sizing: border-box`.
* Measure the total rendered horizontal footprint of both elements in the browser.

### Expected Behavior

The first div occupies a total rendered width of 350px ($300 + 40 + 10$), while the second div strictly occupies 300px.

---

## 10. Margin Collapse Mechanics

**Difficulty:** 🟡 Medium

### Problem

Analyze and fix an unintentional margin collapse between adjacent vertical elements and between a parent and its first child.

### Given

```html
<div class="parent">
  <div class="child">Child Content</div>
</div>
<div class="sibling">Sibling Content</div>

```

```css
.parent {
  margin-bottom: 40px;
}
.sibling {
  margin-top: 30px;
}
.child {
  margin-top: 50px; /* Collapses through the parent! */
}

```

### Requirements

* Explain why the vertical distance between `.parent` and `.sibling` is 40px instead of 70px.
* Prevent the child's `margin-top: 50px` from bleeding through the parent boundary using a clean CSS technique (e.g., padding, border, or `overflow`).

---

## 11. Inline, Block, and Inline-Block Formatting

**Difficulty:** 🟢 Easy

### Problem

Structure a navigation toolbar to observe the behavioral differences between `display: inline`, `display: block`, and `display: inline-block`.

### Requirements

* Attempt to apply vertical padding and explicit `width`/`height` to an `inline` `<span>`. Observe browser behavior.
* Turn the items into `inline-block` elements and verify that dimensions and vertical margins are now respected while staying on the same horizontal line.
* Transform an item into a `block` element and observe how it forces subsequent elements onto new lines.

---

## 12. Units of Measurement: `px`, `em`, `rem`, `%`, `ch`, and `vw`/`vh`

**Difficulty:** 🟡 Medium

### Problem

Build a responsive typography card where components scale predictably based on root settings versus parent context.

### Requirements

* Set a base font size on the `<html>` root element.
* Define a header using `rem` units so it scales strictly with root settings.
* Define padding and margins on a nested badge using `em` units so spacing scales proportionally with the badge's local font size.
* Constrain an article paragraph to an optimal reading line length using the character unit (`ch`).
* Set a hero section's height using dynamic viewport height units (`100vh` or `100dvh`).

---

## 13. Width Constraints: `min-width`, `max-width`, and Intrinsic Sizing

**Difficulty:** 🟡 Medium

### Problem

Build a responsive text card that expands naturally on small screens but stops growing on wide screens, avoiding horizontal scrollbars.

### Requirements

* Constrain a container to take up 90% of the screen width up to a hard maximum of 800px using `width` and `max-width`.
* Horizontally center the container in the viewport using `margin: 0 auto`.
* Demonstrate the use of intrinsic sizing keywords: set an inner title's width to `fit-content` and an accent sidebar's width to `min-content`.

---

## 14. Overflow Management & Text Truncation

**Difficulty:** 🟢 Easy

### Problem

Handle content that exceeds its container boundaries cleanly without breaking layouts.

### Requirements

* Create a container with fixed dimensions. Configure horizontal scrolling using `overflow-x: auto` and prevent vertical overflow using `overflow-y: hidden`.
* Truncate a single line of text that overflows its container by appending an ellipsis (`...`) using pure CSS: `white-space: nowrap`, `overflow: hidden`, and `text-overflow: ellipsis`.
* Clamp a multiline paragraph to exactly 3 lines using `-webkit-line-clamp`.

---

# 🧠 Checkpoint 2: Box Model

Before continuing, make sure you can:

* State the formula for total element width under `box-sizing: content-box` vs. `border-box`.
* Explain why margins collapse vertically between siblings, but horizontal margins never collapse.
* Contrast `em` units with `rem` units when nested three levels deep in elements with varying font sizes.
* Explain why an `inline` element ignores explicit `width` and `height` properties.

---

# Level 3 — Normal Flow, Positioning & Stacking Contexts

## 15. Relative vs. Absolute Positioning

**Difficulty:** 🟢 Easy

### Problem

Position a notification badge on the top-right corner of an avatar icon.

### Requirements

* Create an avatar container with an image or letter inside.
* Place a badge element (`<span class="badge">3</span>`) inside the avatar markup.
* Anchor the badge to the corner of the avatar using `position: absolute` and coordinate properties (`top`, `right`).
* Ensure the badge positions relative to the avatar container, not the entire viewport, by setting the appropriate positioning context on the parent.

### What to Pay Attention To

* An absolutely positioned element looks up the DOM tree for the nearest ancestor with a `position` value other than `static`.

---

## 16. Fixed Navigation Headers

**Difficulty:** 🟢 Easy

### Problem

Construct a site header that remains anchored to the top of the browser viewport regardless of page scrolling.

### Requirements

* Pin a `<header>` element to the viewport top using `position: fixed`, `top: 0`, and `left: 0`.
* Ensure the header stretches across the full viewport width.
* Prevent the fixed header from covering the top content of the page when the document first loads (without using JavaScript).

---

## 17. Sticky Positioning & Container Constraints

**Difficulty:** 🟡 Medium

### Problem

Implement sticky table headers and sticky section dividers that remain pinned while scrolling through their specific section, then release.

### Requirements

* Make a category header stick to the top of the screen while reading its section using `position: sticky` and `top: 0`.
* Create two consecutive sections with sticky headings to observe how the second sticky heading pushes the first out of view.
* Identify what happens when a parent container of a sticky element has `overflow: hidden` applied.

### What to Pay Attention To

* A sticky element only sticks within the boundary of its immediate parent container.

---

## 18. Stacking Contexts and the `z-index` Ladder

**Difficulty:** 🟠 Hard

### Problem

Diagnose why an element with `z-index: 9999` remains hidden behind an element with `z-index: 1`.

### Buggy Code

```html
<div class="sidebar">
  <div class="tooltip">Tooltip Text (Should be on top!)</div>
</div>
<div class="modal">
  <div class="modal-content">Modal Window</div>
</div>

```

```css
.sidebar {
  position: relative;
  z-index: 1;
}
.tooltip {
  position: absolute;
  z-index: 9999;
}
.modal {
  position: relative;
  z-index: 2;
}

```

### Task

* Explain why `.tooltip` cannot appear in front of `.modal`.
* Identify the root cause related to Stacking Contexts.
* Fix the issue by adjusting the stacking hierarchy.

---

## 19. Floats, Text Wrapping, and Clearfix Mechanics

**Difficulty:** 🟡 Medium

### Problem

Wrap text smoothly around an editorial image and handle parent container collapse using pure CSS.

### Requirements

* Float an image to the left of a long text paragraph using `float: left` and margin offsets.
* Observe that the parent container collapses to a height of 0 if it contains only floated children.
* Restore the parent container's height using the modern `display: flow-root` clear-fix alternative.
* Clear subsequent paragraphs below the image using `clear: both`.

---

# 🧠 Checkpoint 3: Positioning

Before continuing, make sure you can:

* List at least three CSS properties that trigger the creation of a new Stacking Context (beyond `z-index`).
* Explain the physical difference in page flow between `position: relative` and `position: absolute`.
* State why `position: sticky` fails to work if an ancestor element has `overflow: hidden`.

---

# Level 4 — Flexbox Mastery (1D Layouts)

## 20. Flex Container & Axis Fundamentals

**Difficulty:** 🟢 Easy

### Problem

Build a flexible horizontal row where items align along main and cross axes.

### Requirements

* Convert a list into a flex container using `display: flex`.
* Align items horizontally centered using `justify-content`.
* Align items vertically centered using `align-items`.
* Reverse the reading direction of the items using `flex-direction: row-reverse`.

### What to Pay Attention To

* The "Main Axis" changes from horizontal to vertical when switching from `flex-direction: row` to `column`.

---

## 21. Dynamic Sizing with `flex-grow`, `flex-shrink`, and `flex-basis`

**Difficulty:** 🟡 Medium

### Problem

Construct a three-column dashboard layout where columns distribute remaining space according to deliberate weight ratios.

### Requirements

* Create a container with three child cards.
* Configure Column 1 to have a fixed initial size of 200px and refuse to shrink (`flex: 0 0 200px`).
* Configure Column 2 to take up twice as much remaining space as Column 3 (`flex-grow: 2` vs `flex-grow: 1`).
* Demonstrate what happens when total children widths exceed container width with `flex-shrink: 0` vs default shrink behavior.

---

## 22. Multi-Line Flex Wrapping & Gap Control

**Difficulty:** 🟢 Easy

### Problem

Build a responsive tag pill cloud where items wrap naturally onto new lines without margin overlap.

### Requirements

* Allow flex items to break onto multiple lines using `flex-wrap: wrap`.
* Define uniform vertical and horizontal spacing between items using the `gap` property (replacing old margin hacks).
* Control the alignment of wrapped lines across the entire cross axis using `align-content`.

---

## 23. Auto-Margins in Flexbox

**Difficulty:** 🟢 Easy

### Problem

Create a standard navigation bar with branding on the left and utility links pushed entirely to the far right using a single Flexbox auto-margin rule.

### Given

```html
<nav class="navbar">
  <div class="logo">Brand</div>
  <a href="#">Dashboard</a>
  <a href="#">Settings</a>
  <a href="#">Profile</a>
</nav>

```

### Requirements

* Use `display: flex` on `.navbar`.
* Push the "Dashboard", "Settings", and "Profile" links to the far right of the container without adding wrapper divs or using float/absolute positioning.

### What to Pay Attention To

* In Flexbox, an `auto` margin absorbs all available free space along that axis.

---

## 24. Individual Item Alignment and Ordering

**Difficulty:** 🟡 Medium

### Problem

Customize the alignment and visual sequence of individual items inside a flex container.

### Requirements

* In a container with `align-items: center`, make one specific child stretch to the full container height using `align-self: stretch`.
* Visually swap the first item in the markup to appear as the last item on screen using the `order` property.
* Note the accessibility impact: explain why changing visual `order` with CSS without updating the DOM structure can cause keyboard tab navigation issues.

---

## 25. Perfect Centering (The Flexbox Way)

**Difficulty:** 🟢 Easy

### Problem

Center an arbitrary card (with unknown width and height) both horizontally and vertically inside a full-screen viewport.

### Requirements

* Set up a parent container occupying `100vh` (or `100dvh`).
* Center the child card perfectly using only two or three Flexbox properties.
* Ensure the centering holds true even if the child card's text content expands dynamically.

---

# 🧠 Checkpoint 4: Flexbox

Before continuing, make sure you can:

* Explain the difference between `justify-content` and `align-items`.
* Contrast `align-items` (aligning items on a single line) with `align-content` (aligning wrapped lines).
* Explain how `flex: 1 1 0` behaves differently from `flex: 1 1 auto`.
* Identify the effect of setting `margin-left: auto` on a flex child.

---

# Level 5 — CSS Grid Architecture (2D Layouts)

## 26. Explicit Grid Definition & the `fr` Unit

**Difficulty:** 🟢 Easy

### Problem

Create a clean 3-column, 2-row photo gallery grid.

### Requirements

* Initialize a grid using `display: grid`.
* Define columns using the fractional unit: one column taking up 2 fractions, and two columns taking up 1 fraction each (`grid-template-columns`).
* Define explicit row heights using `grid-template-rows`.
* Apply spacing between rows and columns using `gap`.

---

## 27. Positioning Items with Grid Lines & Spanning

**Difficulty:** 🟡 Medium

### Problem

Place items onto a grid using numbered grid lines and make certain items span multiple rows and columns.

### Given

A 4-column grid.

### Requirements

* Position Item A to start at column line 1 and end at column line 3 using `grid-column: 1 / 3` (or `span 2`).
* Position Item B to span 2 full rows using `grid-row`.
* Make an item span the entire width of any grid regardless of column count using negative line indexing (`grid-column: 1 / -1`).

---

## 28. Named Grid Template Areas

**Difficulty:** 🟡 Medium

### Problem

Architect a full page layout skeleton using visual ASCII-like named grid areas.

### Requirements

* Define areas for `header`, `sidebar`, `main`, and `footer` on the parent container using `grid-template-areas`.
* Assign semantic child tags (`<header>`, `<aside>`, `<main>`, `<footer>`) to their designated areas using `grid-area`.
* Leave an empty slot in the grid using the `.` period syntax.

### Expected Layout Structure

```text
[ header  ] [ header ]
[ sidebar ] [ main   ]
[ footer  ] [ footer ]

```

---

## 29. Responsive Grids Without Media Queries: `repeat`, `auto-fit`, and `minmax`

**Difficulty:** 🟠 Hard

### Problem

Build a responsive product card grid that automatically wraps and resizes columns based on available space without writing a single media query.

### Requirements

* Use `grid-template-columns` with the `repeat()` function.
* Use the `auto-fit` or `auto-fill` keyword.
* Use `minmax()` to ensure columns are never smaller than 250px and expand to fill all remaining space (`1fr`).
* Resize the browser window to verify columns re-flow from 4 columns to 3, 2, and 1 cleanly.

### What to Pay Attention To

* The difference between `auto-fit` (stretches occupied tracks to fill remaining room) and `auto-fill` (leaves empty ghost tracks when space permits).

---

## 30. Implicit Grid Tracks and `grid-auto-flow`

**Difficulty:** 🟡 Medium

### Problem

Configure how a grid handles extra content items that were not defined in the explicit template.

### Requirements

* Define an explicit grid of 2 columns and 2 rows.
* Add 8 children to the markup (creating implicit tracks).
* Control the default sizing of those newly generated rows using `grid-auto-rows`.
* Change the automatic placement direction from rows to columns using `grid-auto-flow: column`.
* Eliminate visual whitespace holes in an irregular grid using `grid-auto-flow: dense`.

---

## 31. Alignment in CSS Grid

**Difficulty:** 🟡 Medium

### Problem

Master all dimensions of alignment inside a CSS Grid container.

### Requirements

* Align the entire grid structure within the parent container using `justify-content` and `align-content`.
* Align all items within their individual grid cells using `justify-items` and `align-items`.
* Override alignment on one specific cell using `justify-self` and `align-self`.
* Center content both horizontally and vertically inside a single grid cell using shorthand `place-items: center`.

---

# 🧠 Checkpoint 5: CSS Grid

Before continuing, make sure you can:

* Contrast Flexbox (content-driven, 1D) with Grid (layout-driven, 2D).
* Explain how `auto-fill` differs from `auto-fit` in `repeat(..., minmax(...))`.
* Predict how `grid-column: 1 / -1` behaves on an explicit grid vs. an implicit grid.
* State the difference between `align-items` and `align-content` in Grid.

---

# Level 6 — Responsive Design & Modern CSS Features

## 32. Mobile-First Media Queries

**Difficulty:** 🟢 Easy

### Problem

Refactor a desktop-first layout to use a mobile-first responsive architecture using `min-width` media queries.

### Requirements

* Define default base styles for small screens without media queries.
* Add a tablet breakpoint at `min-width: 768px` to switch from a single-column layout to a two-column layout.
* Add a desktop breakpoint at `min-width: 1024px` to expand the layout into three columns.
* Avoid using `max-width` queries for primary layout progression.

---

## 33. CSS Custom Properties (Variables) & Scoping

**Difficulty:** 🟢 Easy

### Problem

Build a themeable component using CSS custom properties with global and local scoping.

### Requirements

* Declare global theme variables (`--primary-color`, `--border-radius`, `--base-spacing`) on the `:root` selector.
* Use these variables across multiple components with the `var()` function.
* Provide a fallback value within `var()` in case the variable is missing (e.g., `var(--accent, red)`).
* Override `--primary-color` locally inside a `.card-dark` container and observe how all its children automatically inherit the new variable value.

---

## 34. Fluid Typography with `clamp()`, `min()`, and `max()`

**Difficulty:** 🟡 Medium

### Problem

Implement fluid text sizing that scales continuously between viewport sizes without requiring multiple media query steps.

### Requirements

* Set an `<h1>` font size using the `clamp()` function.
* Establish a minimum boundary of 2rem ($32\text{px}$).
* Establish an ideal fluid scaling factor (e.g., `5vw`).
* Establish a maximum boundary of 4.5rem ($72\text{px}$).
* Restrict an element's width to never exceed 500px or 90% of the screen using the `min()` function.

---

## 35. Native Container Queries (`@container`)

**Difficulty:** 🟠 Hard

### Problem

Style a card component based on the width of its direct parent container rather than the global viewport width.

### Requirements

* Establish a containment context on a parent wrapper using `container-type: inline-size` (and optionally name it with `container-name`).
* Write a container query using `@container (min-width: 400px)`.
* When the container is smaller than 400px, render the card vertically (stacked image and text).
* When the container is larger than 400px, render the card horizontally (image on the left, text on the right).
* Place two identical cards on the same screen—one inside a narrow sidebar and one inside a wide main area—and verify they render differently at the same viewport size.

---

## 36. Dark Mode via `prefers-color-scheme`

**Difficulty:** 🟢 Easy

### Problem

Build an automatic dark mode color theme that responds to system OS preferences without JavaScript.

### Requirements

* Define standard light theme custom properties on `:root`.
* Write a `@media (prefers-color-scheme: dark)` media query.
* Re-assign the custom properties (e.g., background and text colors) inside the dark media query block.
* Verify that UI elements adapt automatically when system preferences change.

---

## 37. Native CSS Nesting

**Difficulty:** 🟡 Medium

### Problem

Refactor a traditional stylesheet into standard native CSS nesting without using a preprocessor (Sass/Less).

### Requirements

* Nest child element selectors directly inside a parent rule block.
* Use the nesting selector (`&`) to apply pseudo-classes (e.g., `&:hover`, `&:focus`).
* Use `&` to target compound classes on the same element (e.g., `&.is-active`).
* Nest a media query directly inside a selector block.

---

# 🧠 Checkpoint 6: Responsive & Modern

Before continuing, make sure you can:

* Explain why a Container Query is more useful for design system components than a Viewport Media Query.
* Explain the syntax and three parameters of the `clamp(MIN, VAL, MAX)` function.
* Predict how CSS variables resolve down the cascade compared to standard property inheritance.
* Contrast mobile-first (`min-width`) vs. desktop-first (`max-width`) styling strategies.

---

# Level 7 — Visual Effects, Transitions & Animations

## 38. Color Models: HEX, RGB, HSL, and Modern Color Spaces

**Difficulty:** 🟢 Easy

### Problem

Style components utilizing different color functional notations and explore alpha channel transparency.

### Requirements

* Apply colors using standard Hex notation and RGB notation (`rgb(r g b / a)`).
* Create a harmonious button hover state by tweaking the lightness parameter of an HSL color (`hsl(h s l)`).
* Demonstrate color transparency with `rgba()` or modern slash syntax, and compare it with the `opacity` property (observing whether child text becomes transparent).

---

## 39. Linear & Radial Gradients

**Difficulty:** 🟢 Easy

### Problem

Create visual background patterns using pure CSS gradients without static image files.

### Requirements

* Create a smooth diagonal two-stop linear gradient (`background-image: linear-gradient(45deg, ...)`).
* Create a hard-stop stripe pattern by setting adjacent color stops to identical percentages.
* Build a centered radial gradient highlighting a circular spotlight effect (`radial-gradient(circle, ...)`).

---

## 40. Box Shadows & Drop Shadows

**Difficulty:** 🟢 Easy

### Problem

Add realistic depth and layering to UI cards using `box-shadow` and `filter: drop-shadow()`.

### Requirements

* Build a smooth, multi-layered card elevation using two stacked shadows inside a single `box-shadow` declaration (offset-x, offset-y, blur-radius, spread-radius, color).
* Create an inset shadow simulating an indented input field using the `inset` keyword.
* Apply `filter: drop-shadow()` to an image or SVG with a transparent background, and observe how the shadow contours to the image's silhouette rather than its rectangular box.

---

## 41. CSS 2D Transforms

**Difficulty:** 🟢 Easy

### Problem

Transform elements in two-dimensional space without disrupting normal document flow.

### Requirements

* Move an element 20px up on hover using `transform: translateY(-20px)`.
* Enlarge a thumbnail image on hover using `transform: scale(1.1)`.
* Rotate an icon 45 degrees using `transform: rotate(45deg)`.
* Change the pivot point of the transformation using `transform-origin`.

---

## 42. CSS Smooth Transitions

**Difficulty:** 🟢 Easy

### Problem

Build smooth visual feedback states when interacting with interactive buttons.

### Requirements

* Apply a transition to an element when background color and transform properties change.
* Configure all transition properties explicitly: `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
* Compare the visual pacing of different easing functions (`ease`, `linear`, `ease-in-out`, and a custom `cubic-bezier`).
* Explain why transitioning `transform` and `opacity` performs better than transitioning `top`, `left`, `width`, or `height`.

---

## 43. Keyframe Animations (`@keyframes`)

**Difficulty:** 🟡 Medium

### Problem

Create a continuous loading spinner and a bouncing entrance animation.

### Requirements

* Define a spinning rotation animation sequence using `@keyframes spin`.
* Apply the animation to an element with `animation-name`, `animation-duration`, `animation-timing-function: linear`, and `animation-iteration-count: infinite`.
* Create a multi-step bounce animation using intermediate percentage keyframes (`0%`, `50%`, `70%`, `100%`).
* Control the resting state of the element after the animation finishes using `animation-fill-mode: forwards`.

---

## 44. Accessible Motion (`prefers-reduced-motion`)

**Difficulty:** 🟢 Easy

### Problem

Respect user operating system accessibility settings regarding motion sickness and vestibular disorders.

### Requirements

* Set up a noticeable animation or transition on a banner.
* Write a `@media (prefers-reduced-motion: reduce)` media query.
* Disable or drastically simplify the animation (e.g., zero out durations or replace rapid movement with a subtle fade) inside the query.

---

# 🧠 Checkpoint 7: Visuals & Motion

Before continuing, make sure you can:

* Explain why animating `transform` and `opacity` avoids triggering layout recalculations (Reflow/Repaint).
* Contrast the mechanics of `box-shadow` with `filter: drop-shadow()`.
* Explain how `animation-fill-mode: forwards` preserves the final keyframe state.
* Explain how `prefers-reduced-motion` supports web accessibility.

---

# Level 8 — Advanced Architecture, Debugging & Capstone Projects

## 45. Debugging: Resolving Unexpected Horizontal Scrollbars

**Difficulty:** 🟡 Medium

### Problem

Diagnose and eliminate an invisible element causing horizontal scrolling on small mobile screens.

### Buggy Code

```html
<div class="wrapper">
  <header class="header">Title</header>
  <main class="content">
    <div class="banner">Full width promotional banner</div>
  </main>
</div>

```

```css
* {
  box-sizing: border-box;
}
body {
  margin: 0;
}
.banner {
  width: 100vw;
  margin-left: 20px;
}

```

### Task

* Identify why `width: 100vw` combined with `margin-left` causes an overflow.
* Explain how vertical desktop scrollbars can cause `100vw` to exceed the actual visible width of the viewport.
* Provide a clean fix that ensures full responsiveness without horizontal scrollbars.

---

## 46. Pure CSS Interactive Toggle (Checkbox Hack)

**Difficulty:** 🟡 Medium

### Problem

Build an interactive accordion or slide-out menu drawer that opens and closes on click without using any JavaScript.

### Requirements

* Pair a hidden `<input type="checkbox" id="menu-toggle">` with a `<label for="menu-toggle">`.
* Use the `:checked` pseudo-class combined with sibling combinators (`+` or `~`) to expand and collapse a target menu element.
* Make the toggle accessible for keyboard users using `:focus-visible` styling on the associated label.

---

## 47. Image Object Fitting & Aspect Ratios

**Difficulty:** 🟢 Easy

### Problem

Ensure responsive user-uploaded images fit cleanly into fixed card aspect ratios without visual stretching or distortion.

### Requirements

* Constrain an image inside a card to a strict 16:9 ratio using the modern `aspect-ratio` property.
* Prevent image distortion using `object-fit: cover`.
* Shift the focal crop position of the image to the top using `object-position: center top`.

---

## 48. Print Stylesheets (`@media print`)

**Difficulty:** 🟢 Easy

### Problem

Format a web article so it prints cleanly on paper without web clutter.

### Requirements

* Write a `@media print` block.
* Hide non-printable interface elements like navigation bars, ads, and footers (`display: none`).
* Force high-contrast black text on a clean white background across all elements.
* Expand link targets so people reading paper copies can see the destination URLs using `a[href]::after { content: " (" attr(href) ")"; }`.

---

## 49. Capstone Project 1: Responsive E-Commerce Product Card

**Difficulty:** 🟠 Hard

### Objective

Build a production-ready, highly responsive e-commerce product card using semantic CSS without frameworks.

```text
+---------------------------------------------+
| [ Image ]                 (SALE) [Badge]    |
|                                             |
| Category / Brand                            |
| Product Title That Might Wrap to Two Lines  |
| ★★★★☆ (4.5) (128 reviews)                   |
|                                             |
| $129.99  ~~$159.99~~            [ Add Cart ]|
+---------------------------------------------+

```

### Requirements

* **Container Structure:**
* Card max-width constrained, elevated with layered `box-shadow`.
* Responsive image header maintaining an aspect ratio with `object-fit: cover`.
* Absolutely positioned sale badge in the corner.


* **Content Layout:**
* Truncate overly long product titles to a maximum of 2 lines with an ellipsis.
* Price display section aligned horizontally using Flexbox with strikethrough styling for the old price.


* **Interactivity & States:**
* Smooth hover elevation: the card lifts slightly (`translateY`) with a deeper shadow on hover.
* Button interactive states: hover, focus-visible outline, and active click state.
* Respect system accessibility settings via `prefers-reduced-motion`.



---

## 50. Capstone Project 2: Enterprise Dashboard Layout Grid

**Difficulty:** 🔴 Advanced

### Objective

Architect a complex multi-region analytics dashboard shell using modern CSS Grid and Flexbox that transitions seamlessly between mobile viewports and wide desktop workstations.

```text
Desktop Layout:
+-------------------------------------------------------------+
| Top Navigation Bar                                          |
+----------+--------------------------------------------------+
| Sidebar  | Main Analytics Dashboard                         |
| Links    | +-------------------+ +------------------------+ |
|          | | Metric Card 1     | | Metric Card 2          | |
|          | +-------------------+ +------------------------+ |
|          | +----------------------------------------------+ |
|          | | Primary Chart / Data Table Region            | |
|          | +----------------------------------------------+ |
+----------+--------------------------------------------------+

```

### Requirements

* **Structural Architecture:**
* Outer shell built using CSS Grid (`grid-template-areas`).
* Top navigation bar pinned across the entire top edge.
* Left navigation sidebar with scrollable navigation items.
* Main scrollable content region that does not drag the sidebar or header along when scrolled.


* **Responsive Adaptations:**
* On mobile screens ($< 768\text{px}$): Collapse sidebar into a hidden drawer state or bottom utility bar; layout collapses to a single stacked vertical column.
* On desktop screens ($\ge 768\text{px}$): Expand to full multi-track layout with fixed sidebar dimensions.


* **Card Sub-Grids:**
* Inside the main region, build a dynamic metrics grid using `repeat(auto-fit, minmax(220px, 1fr))` to render metric cards that reflow automatically across varying screen widths.


* **Pure CSS Theming:**
* Implement full light and dark mode toggling using CSS custom properties and `prefers-color-scheme`.



---

# ✅ CSS Mastery Checklist

Use this checklist to verify your understanding across all problems:

* [ ] I can calculate specificity scores without looking up rules.
* [ ] I always declare `box-sizing: border-box` to avoid dimension surprises.
* [ ] I understand how Stacking Contexts isolate `z-index` values.
* [ ] I can use Flexbox for 1-dimensional layouts and auto-margin alignment.
* [ ] I can use CSS Grid for 2-dimensional multi-track layouts.
* [ ] I can build responsive layouts with `repeat(auto-fit, minmax(...))` without writing media queries.
* [ ] I understand how to scale typography fluidly using `clamp()`.
* [ ] I animate only performant properties (`transform`, `opacity`) whenever possible.
* [ ] I include accessibility accommodations like `prefers-reduced-motion` and `:focus-visible`.