# Pure HTML Basics Mastery Bank

30 hands-on, zero-CSS, zero-JS problems arranged sequentially. Every problem focuses solely on native HTML tags, standard attributes, nesting rules, and default browser behavior.

---

# Level 1 — Core Document Anatomy & Head Essentials

## 1. Minimal Standard Document Scaffold

**Difficulty:** 🟢 Easy

### Problem

Write the fundamental HTML5 document skeleton from scratch.

### Requirements

* Declare the HTML5 doctype.
* Set the root document language to English (`en`).
* Include `<head>` and `<body>` sections.
* Set character encoding to UTF-8.
* Set the browser tab title to `My First Webpage`.

### Expected UI

A blank page in the browser with the tab displaying `My First Webpage`.

### Concepts Practiced

* `<!DOCTYPE html>`
* `<html lang="...">`
* `<head>`, `<title>`, `<meta charset="...">`, `<body>`

---

## 2. The Complete Heading Ladder

**Difficulty:** 🟢 Easy

### Problem

Construct an outline of a biology textbook chapter demonstrating all six levels of headings without skipping any rank.

### Requirements

* Use all 6 heading levels: `<h1>` through `<h6>`.
* Maintain a logical hierarchy (e.g., Book Title $\to$ Unit $\to$ Chapter $\to$ Section $\to$ Subsection $\to$ Minor Point).

### Expected UI

Six lines of text progressively decreasing in default browser font size and margin weight.

### Common Mistakes

* Using headings just to change text size instead of representing an outline level.
* Skipping levels (e.g., placing `<h4>` directly under `<h2>`).

---

## 3. Paragraphs, Spacing, and Line Breaks

**Difficulty:** 🟢 Easy

### Problem

Mark up a postal mailing address and a two-stanza poem.

### Requirements

* Place the postal address inside an `<address>` tag, using `<br>` to force each line onto a new line without creating separate paragraphs.
* Put each poem stanza in its own `<p>`.
* Separate the address from the poem using a horizontal rule (`<hr>`).

### Expected UI

An address block with line breaks, a distinct thematic line break across the screen, and two spaced paragraph blocks.

### Concepts Practiced

* `<p>`, `<br>`, `<hr>`, `<address>`

---

## 4. Text Emphasis and Formatting Primitives

**Difficulty:** 🟢 Easy

### Problem

Mark up an advisory notice using distinct inline semantic tags instead of generic text.

### Requirements

* Give high importance to a warning word using `<strong>`.
* Add spoken stress emphasis to another word using `<em>`.
* Highlight a search keyword using `<mark>`.
* Show a strikethrough price with `<del>` and an updated price with `<ins>`.
* Add a small legal disclaimer at the bottom with `<small>`.

### Expected UI

A single paragraph showing bold text, italic text, yellow background highlighting, crossed-out text, underlined inserted text, and reduced font size.

---

## 5. Mathematical & Chemical Notation

**Difficulty:** 🟢 Easy

### Problem

Display standard chemical formulas and mathematical equations without external scripts or styling.

### Requirements

* Render the chemical formula for glucose: $\text{C}_6\text{H}_{12}\text{O}_6$.
* Render the Pythagorean theorem: $a^2 + b^2 = c^2$.
* Combine them in a single readable paragraph.

### Concepts Practiced

* `<sub>` (subscript)
* `<sup>` (superscript)

---

# 🧠 Checkpoint 1

Before continuing, make sure you can:

* Explain the visual and semantic difference between `<br>` and `<p>`.
* Identify what character encoding `<meta charset="utf-8">` defines.
* State why skipping from `<h2>` directly to `<h5>` is invalid document structure.

---

# Level 2 — Lists & Hyperlinks

## 6. Unordered & Ordered Lists

**Difficulty:** 🟢 Easy

### Problem

Build two distinct lists: a grocery shopping checklist and a step-by-step assembly guide.

### Requirements

* The grocery checklist must use an unordered list (`<ul>`).
* The assembly guide must use an ordered list (`<ol>`).
* Both lists must contain at least 4 items using `<li>`.

### Expected UI

One list displaying default bullet points and one list displaying sequential numbers (1, 2, 3, 4).

---

## 7. Customizing Ordered Lists with HTML Attributes

**Difficulty:** 🟢 Easy

### Problem

Configure an ordered list using only native HTML attributes to control numbering behavior.

### Requirements

* Start the list count at number 5 using `start`.
* Reverse the countdown sequence using the boolean attribute `reversed`.
* Change the numbering style to uppercase Roman numerals using `type="I"`.

### Expected UI

A list counting down: V, IV, III, II, I.

### Concepts Practiced

* `<ol type="..." start="..." reversed>`

---

## 8. Multi-Level Nested Lists

**Difficulty:** 🟡 Medium

### Problem

Construct an outline of a software menu tree with sub-items.

### Requirements

* Create an outer list with 3 categories (e.g., File, Edit, View).
* Under "File", nest another list containing "New", "Open", and a sub-sub-list under "Recent Files".
* Ensure every nested `<ul>` is placed **inside** an `<li>`, not directly between them.

### Common Mistakes

* Placing `<ul>` directly inside an outer `<ul>` without wrapping it in an `<li>` first (invalid HTML).

---

## 9. Description Lists for Key-Value Data

**Difficulty:** 🟢 Easy

### Problem

Create a glossary defining three programming terms.

### Requirements

* Use `<dl>` as the root wrapper.
* Mark terms using `<dt>`.
* Mark definitions using `<dd>`.
* Include one term that has two distinct definitions.

### Expected UI

Terms flush to the left, with definition descriptions automatically indented by the browser.

---

## 10. Anchor Links: External, Internal, and Protocols

**Difficulty:** 🟢 Easy

### Problem

Create a navigation bar linking across different protocols and targets.

### Requirements

* Link to an external site (`[https://example.com](https://example.com)`) that opens in a new tab via `target="_blank"`.
* Link to an email address prefilling a subject line using `mailto:`.
* Link to a phone number using `tel:`.
* Link to a section at the bottom of the current page using a hash fragment `#footer`.
* Give that bottom section an `id="footer"` so the link jumps directly to it.

### Concepts Practiced

* `<a href="...">`, `target="_blank"`, `mailto:`, `tel:`, `#id` jumping.

---

# Level 3 — Images, Tables & Semantic Grouping

## 11. Image Attributes and Fallbacks

**Difficulty:** 🟢 Easy

### Problem

Embed an image into the document with accessibility and dimension attributes.

### Requirements

* Use the `<img>` tag.
* Provide a clear, descriptive `alt` attribute.
* Explicitly define `width` and `height` using native HTML attributes (in pixels, numbers only, no `px` suffix).
* Add a tooltip hint using the `title` attribute.

### What to Pay Attention To

* `<img>` is a void (self-closing) element; it does not take a closing `</img>` tag.

---

## 12. Captioned Figures

**Difficulty:** 🟢 Easy

### Problem

Wrap an illustration and a code snippet with semantic captions.

### Requirements

* Place an `<img>` inside a `<figure>`.
* Add an explanatory caption to the image using `<figcaption>`.
* Create a second `<figure>` containing a preformatted block of computer code (`<pre><code>`) with its own `<figcaption>`.

### Concepts Practiced

* `<figure>`, `<figcaption>`, `<pre>`, `<code>`

---

## 13. Basic Tabular Data

**Difficulty:** 🟢 Easy

### Problem

Create a 3-column, 3-row student grade sheet using table tags.

### Requirements

* Wrap the entire table in `<table>`.
* Include a descriptive title using `<caption>` as the first child of the table.
* Define a header row containing column headings using `<th>`.
* Define data rows containing values using `<td>`.

### Expected UI

A basic grid layout with table headers rendered bold and centered by default.

---

## 14. Complex Tables: Spanning Rows and Columns

**Difficulty:** 🟡 Medium

### Problem

Build a weekly classroom timetable containing lunch breaks and double-period blocks.

### Requirements

* Use `colspan` to make a single "Lunch Break" cell span across all days (columns).
* Use `rowspan` to make a 2-hour "Lab Class" cell span down across two time slots (rows).
* Maintain an intact grid structure with no extra or missing cells poking out.

### Concepts Practiced

* `colspan="..."`, `rowspan="..."`

---

## 15. Semantic Table Sections and Scopes

**Difficulty:** 🟡 Medium

### Problem

Refactor a financial balance table to be accessible for screen readers using structural grouping tags.

### Requirements

* Divide the table explicitly into `<thead>`, `<tbody>`, and `<tfoot>`.
* Apply `scope="col"` to all column header cells.
* Apply `scope="row"` to all row header cells.
* Put summary totals in the `<tfoot>` row.

### What to Pay Attention To

* Screen readers rely on `scope` to read the right header when moving through cells.

---

# 🧠 Checkpoint 2

Before continuing, make sure you can:

* Explain the syntax difference between an ordered list and a description list.
* Explain what happens if an image URL breaks and the `alt` tag is empty vs. populated.
* Identify the exact placement rule for `<figcaption>` inside `<figure>`.
* Calculate total columns in a row when a cell uses `colspan="3"`.

---

# Level 4 — Pure HTML Forms

## 16. Basic Text Inputs and Labels

**Difficulty:** 🟢 Easy

### Problem

Create a login form with connected labels and appropriate text fields.

### Requirements

* Wrap the inputs inside a `<form>` tag with `action="/login"` and `method="post"`.
* Add a username field (`type="text"`).
* Add a password field (`type="password"`).
* Connect each `<label>` to its `<input>` explicitly using the `for` and `id` attributes.
* Include a submit button (`<input type="submit">` or `<button type="submit">`).

### Concepts Practiced

* `<form>`, `<input>`, `<label for="...">`, `id`

---

## 17. Choice Inputs: Radio Buttons and Checkboxes

**Difficulty:** 🟢 Easy

### Problem

Create a survey question module offering single-choice and multiple-choice selections.

### Requirements

* Create a question: "What is your primary OS?" using radio buttons (`type="radio"`). Ensure only **one** can be selected at a time.
* Create a question: "What languages do you know?" using checkboxes (`type="checkbox"`). Allow **multiple** to be selected.
* Provide a pre-selected default option for both groups using the `checked` attribute.

### What to Pay Attention To

* Radio buttons must share the exact same `name` attribute to act as a mutually exclusive group.

---

## 18. Dropdowns and Multi-Line Text

**Difficulty:** 🟢 Easy

### Problem

Build a contact feedback section collecting categorized messages.

### Requirements

* Add a `<select>` dropdown menu with options grouped under `<optgroup>` labels (e.g., "Support", "Billing").
* Set one option as pre-selected using `selected`.
* Add a multi-line message input using `<textarea>`.
* Set initial dimensions on the textarea using `rows` and `cols` attributes.

### Common Mistakes

* Writing `<textarea value="text">` instead of putting default text between `<textarea>` and `</textarea>`.

---

## 19. Specialized Input Types

**Difficulty:** 🟢 Easy

### Problem

Build a user settings panel taking advantage of browser-native specialized pickers.

### Requirements

* Number input (`type="number"`) with `min="1"`, `max="10"`, and `step="1"`.
* Date picker (`type="date"`).
* Native color picker (`type="color"`).
* File upload selector (`type="file"`).
* Range slider (`type="range"`).

### Expected UI

The browser automatically renders dedicated controls (a calendar picker, color swatch, slider bar, and file selection button).

---

## 20. Autocomplete Suggestions with Datalist

**Difficulty:** 🟡 Medium

### Problem

Create a search field that allows arbitrary typing while offering a list of suggested keywords.

### Requirements

* Provide an `<input type="text">`.
* Create a `<datalist>` containing at least 4 predefined `<option>` values.
* Connect the input to the datalist using the `list` attribute on the input matching the `id` of the datalist.

### Concepts Practiced

* `<datalist>`, `<option>`, `<input list="...">`

---

## 21. Native Form Validation Attributes

**Difficulty:** 🟡 Medium

### Problem

Build a signup form that the browser will refuse to submit if the user enters invalid data, without using any scripts.

### Requirements

* Make an input mandatory using the boolean `required` attribute.
* Enforce a minimum length of 5 and maximum length of 12 on a username using `minlength` and `maxlength`.
* Constrain an age field between 18 and 99 using `min` and `max`.
* Use a regular expression on a postal code field using `pattern="[0-9]{5}"`.
* Provide a placeholder hint using `placeholder`.

### Expected UI

Clicking "Submit" on empty or malformed fields triggers native browser warning popups and stops submission.

---

## 22. Grouping Controls with Fieldset & Legend

**Difficulty:** 🟢 Easy

### Problem

Group an extensive checkout form into clean logical sections.

### Requirements

* Wrap "Personal Details" and "Payment Info" in separate `<fieldset>` tags.
* Provide a visible caption title for each box using `<legend>`.
* Disable the entire "Payment Info" section by placing the `disabled` attribute directly on its `<fieldset>`.

### Expected UI

A bordered box surrounding each group with its legend embedded in the border line; all inputs in the second box are grayed out and unclickable.

---

# 🧠 Checkpoint 3

Before continuing, make sure you can:

* Explain how `name` attributes group radio buttons together.
* State why a `<label>` must have a `for` attribute matching an input's `id`.
* Differentiate between `<select>` and `<datalist>`.
* Identify the effect of adding `disabled` to a parent `<fieldset>`.

---

# Level 5 — Multimedia, Native Interactivity & Semantics

## 23. Native Audio Player with Codec Fallbacks

**Difficulty:** 🟡 Medium

### Problem

Embed a functional audio track that plays across different browsers.

### Requirements

* Use the `<audio>` tag with the `controls` attribute enabled.
* Provide two `<source>` children specifying different file formats (`audio/mpeg` and `audio/ogg`).
* Provide a fallback text message with a direct download link if the user's browser does not support audio tags.

### Concepts Practiced

* `<audio controls>`, `<source src="..." type="...">`

---

## 24. Native Video Player with Subtitles

**Difficulty:** 🟡 Medium

### Problem

Embed a video player with playback controls, a preview thumbnail, and subtitles.

### Requirements

* Use the `<video>` tag with `controls`.
* Set explicit `width` and `height` attributes on the video tag.
* Specify a placeholder image using `poster="thumbnail.jpg"`.
* Add a track for closed captions using `<track kind="subtitles" srclang="en" label="English">`.

### What to Pay Attention To

* The `<track>` tag is a void element and must link to a valid WebVTT file (`.vtt`).

---

## 25. Collapsible FAQ with Details and Summary

**Difficulty:** 🟢 Easy

### Problem

Build a collapsible toggle component without any scripting or styles.

### Requirements

* Use the `<details>` element.
* Define the clickable heading using `<summary>`.
* Place the answer text inside the `<details>` block below the summary.
* Make one item expanded by default using the `open` attribute.

### Expected UI

A clickable disclosure triangle that toggles open/closed on click, revealing the hidden paragraph.

---

## 26. Native Dialog / Modal Window

**Difficulty:** 🟡 Medium

### Problem

Mark up an HTML5 dialog box with an internal dismissal form.

### Requirements

* Use the `<dialog>` tag.
* Include a heading and a confirmation message inside it.
* Include a `<form method="dialog">` containing a "Close" button.
* Make it initially visible using the `open` attribute.

### What to Pay Attention To

* Submitting a form with `method="dialog"` automatically closes the dialog without submitting data to a server.

---

## 27. Semantic Page Landmarks Layout

**Difficulty:** 🟡 Medium

### Problem

Structure the layout of a news article page using only HTML5 semantic landmark tags. Zero generic `<div>` tags allowed.

### Requirements

* Place global branding and top links in `<header>`.
* Place primary navigation in `<nav>`.
* Place main central content inside `<main>`.
* Structure the story inside `<article>`.
* Place related reading or advertisements in `<aside>`.
* Put copyright notices and footer links in `<footer>`.

### Concepts Practiced

* `<header>`, `<nav>`, `<main>`, `<article>`, `<aside>`, `<footer>`

---

## 28. Native Progress and Meter Gauges

**Difficulty:** 🟢 Easy

### Problem

Display task progress and disk space utilization using native HTML indicators.

### Requirements

* Display a file download that is 70% complete using `<progress value="70" max="100">`.
* Display an indeterminate loading state using `<progress>` without a `value` attribute.
* Display a storage disk gauge that is currently at 85GB out of 100GB using `<meter>`.
* Define `low="20"`, `high="80"`, and `optimum="50"` on the `<meter>`.

### Expected UI

A filling progress bar, an animated cycling bar, and a colored horizontal scalar gauge.

---

# Level 6 — Comprehensive Mastery Projects

## 29. Project 1: The Offline Reference Manual

**Difficulty:** 🟡 Medium

### Objective

Create a single, complete, fully navigable HTML page documenting an imaginary software product.

### Requirements

* **Structure:** `<header>`, `<nav>`, `<main>`, `<article>`, `<aside>`, `<footer>`.
* **Navigation:** A table of contents in `<nav>` using internal links (`<a href="#section-id">`) to jump down to 4 different sections on the page.
* **Content:**
* An introductory section with headings, paragraphs, and inline semantic tags (`<strong>`, `<code>`, `<mark>`).
* An installation guide using a nested `<ol>` list.
* A feature comparison table complete with `<caption>`, `<thead>`, `<tbody>`, `<th>` with `scope`, and `colspan`.
* An interactive FAQ section with at least 3 items using `<details>` and `<summary>`.


* **Back to Top:** Include a link at the bottom that jumps back up to `#top`.

---

## 30. Project 2: The Multi-Section Registration Portal

**Difficulty:** 🟡 Medium

### Objective

Build a complete, accessible, pure-HTML registration portal containing every major input and validation constraint.

### Requirements

* **Form Configuration:** `<form action="/submit" method="post">`.
* **Section 1 (Account Info):**
* Username (`required`, `minlength="4"`).
* Email (`type="email"`, `required`).
* Password (`type="password"`, `required`, `minlength="8"`).


* **Section 2 (Personal Info):**
* Date of Birth (`type="date"`).
* Profile photo upload (`type="file"` accepting only images: `accept="image/*"`).
* Country selection using `<select>` with `<optgroup>` options.
* Preferred language selection using `<input>` connected to a `<datalist>`.


* **Section 3 (Preferences & Terms):**
* Subscription tier using mutually exclusive radio buttons.
* Checkbox to accept Terms of Service (`required`).


* **Grouping:** Group every section inside `<fieldset>` elements with clean `<legend>` titles.
* **Controls:** Include both a "Submit Registration" button and a "Reset Form" button (`type="reset"`).

---

# ✅ Practice Checklist

Use this checklist as you code each problem in your text editor:

* [ ] Every file opens with `<!DOCTYPE html>` and `<html lang="en">`.
* [ ] Every tag that requires closing is properly closed (`</p>`, `</div>`, `</li>`).
* [ ] Void elements do not have closing tags (`<br>`, `<hr>`, `<img>`, `<input>`).
* [ ] Every `<img>` tag has a descriptive `alt` attribute.
* [ ] Every `<input>` is explicitly paired with a `<label for="...">`.
* [ ] Every list item `<li>` is placed directly inside a `<ul>` or `<ol>`.
* [ ] No CSS or JavaScript files or attributes (`style="..."`, `<script>`) were used.