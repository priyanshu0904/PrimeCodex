# HTML: Comprehensive Reference & Curriculum

A complete, granular Table of Contents structuring HTML from platform foundations to modern web architecture and living standards.

---

## Table of Contents

- [Part I: Foundations and History](#part-i-foundations-and-history)
  - [Chapter 1: Introduction to the World Wide Web and HTML](#chapter-1-introduction-to-the-world-wide-web-and-html)
  - [Chapter 2: History and Evolution of HTML](#chapter-2-history-and-evolution-of-html)
  - [Chapter 3: Document Structure and Syntax](#chapter-3-document-structure-and-syntax)
- [Part II: Core HTML Concepts and Elements](#part-ii-core-html-concepts-and-elements)
  - [Chapter 4: Document Metadata and Head Architecture](#chapter-4-document-metadata-and-head-architecture)
  - [Chapter 5: Content Sectioning and Landmarks](#chapter-5-content-sectioning-and-landmarks)
  - [Chapter 6: Text-Level Semantics and Typography](#chapter-6-text-level-semantics-and-typography)
  - [Chapter 7: Grouping Content and Lists](#chapter-7-grouping-content-and-lists)
  - [Chapter 8: Links and Hypermedia](#chapter-8-links-and-hypermedia)
  - [Chapter 9: Embedded Content and Media](#chapter-9-embedded-content-and-media)
  - [Chapter 10: Tabular Data](#chapter-10-tabular-data)
- [Part III: Interactive Features and Forms](#part-iii-interactive-features-and-forms)
  - [Chapter 11: Forms and User Input](#chapter-11-forms-and-user-input)
  - [Chapter 12: Form Validation and Data Handling](#chapter-12-form-validation-and-data-handling)
  - [Chapter 13: Interactive Elements and Scripting Integration](#chapter-13-interactive-elements-and-scripting-integration)
- [Part IV: Accessibility and Semantics](#part-iv-accessibility-and-semantics)
  - [Chapter 14: Web Accessibility and ARIA](#chapter-14-web-accessibility-and-aria)
  - [Chapter 15: Microdata and Structured Web Data](#chapter-15-microdata-and-structured-web-data)
- [Part V: Internals and Browser Architecture](#part-v-internals-and-browser-architecture)
  - [Chapter 16: The Parsing Algorithm and the DOM](#chapter-16-the-parsing-algorithm-and-the-dom)
  - [Chapter 17: Rendering, Layout, and Compositing](#chapter-17-rendering-layout-and-compositing)
  - [Chapter 18: Security Architecture in HTML](#chapter-18-security-architecture-in-html)
- [Part VI: Advanced Concepts and Platform APIs](#part-vi-advanced-concepts-and-platform-apis)
  - [Chapter 19: Web Components and Modular HTML](#chapter-19-web-components-and-modular-html)
  - [Chapter 20: Offline Storage and Resource Control](#chapter-20-offline-storage-and-resource-control)
  - [Chapter 21: Embedded Documents and Frame Architecture](#chapter-21-embedded-documents-and-frame-architecture)
- [Part VII: Modern Features and Future Evolution](#part-vii-modern-features-and-future-evolution)
  - [Chapter 22: Modern Living Standard Enhancements](#chapter-22-modern-living-standard-enhancements)
  - [Chapter 23: Performance Engineering in HTML](#chapter-23-performance-engineering-in-html)
  - [Chapter 24: Emerging Specifications and Future Directions](#chapter-24-emerging-specifications-and-future-directions)

---

## Part I: Foundations and History

### Chapter 1: Introduction to the World Wide Web and HTML
- **1.1** The Architecture of the Web
- **1.2** Hypertext and Markup Concepts
- **1.3** Standards Bodies: W3C and WHATWG
- **1.4** The HTML Living Standard
- **1.5** The Role of HTML in the Modern Web Platform

### Chapter 2: History and Evolution of HTML
- **2.1** Origins: CERN and Tim Berners-Lee
- **2.2** HTML 2.0 and the Browser Wars
- **2.3** HTML 3.2 and HTML 4.01
- **2.4** The XHTML Fork and the Semantic Schism
- **2.5** The Birth of HTML5
- **2.6** Obsolete and Deprecated Elements (`<font>`, `<center>`, `<marquee>`, `<blink>`, `<frameset>`)
- **2.7** The Living Standard Era

### Chapter 3: Document Structure and Syntax
- **3.1** Document Type Declaration (`<!DOCTYPE html>`)
- **3.2** Root Element (`<html>`, `lang`, `dir`)
- **3.3** Document Head and Body Containers (`<head>`, `<body>`)
- **3.4** Element Anatomy, Tags, and Void Elements (`<br>`, `<hr>`, `<img>`, `<input>`, `<meta>`, `<link>`)
- **3.5** Global Attributes (`id`, `class`, `style`, `title`, `data-*`, `hidden`, `tabindex`, `contenteditable`)
- **3.6** Character Encodings, Named Entities, and Polyglot Markup

---

## Part II: Core HTML Concepts and Elements

### Chapter 4: Document Metadata and Head Architecture
- **4.1** Document Title (`<title>`)
- **4.2** Document Base URL (`<base>`)
- **4.3** Metadata Specifications (`<meta charset>`, `<meta name="viewport">`, `<meta name="description">`, `<meta name="robots">`)
- **4.4** External Resource Linking (`<link rel="stylesheet">`, `<link rel="icon">`, `<link rel="canonical">`)
- **4.5** Embedded Document Styles (`<style>`)
- **4.6** Open Graph and Social Graph Metadata Patterns

### Chapter 5: Content Sectioning and Landmarks
- **5.1** Document Headings (`<h1>`, `<h2>`, `<h3>`, `<h4>`, `<h5>`, `<h6>`)
- **5.2** Heading Grouping (`<hgroup>`)
- **5.3** Top-Level Landmarks (`<header>`, `<nav>`, `<main>`, `<footer>`)
- **5.4** Content Containers (`<section>`, `<article>`, `<aside>`)
- **5.5** Contact and Authorship Metadata (`<address>`)

### Chapter 6: Text-Level Semantics and Typography
- **6.1** Paragraphs and Thematic Breaks (`<p>`, `<hr>`, `<br>`, `<wbr>`)
- **6.2** Structural Inline Semantics (`<strong>`, `<b>`, `<em>`, `<i>`)
- **6.3** Secondary Emphasis and Small Print (`<small>`, `<s>`, `<mark>`)
- **6.4** Technical Text and Code Representation (`<code>`, `<pre>`, `<kbd>`, `<samp>`, `<var>`)
- **6.5** Citations, Definitions, and Quotes (`<cite>`, `<dfn>`, `<q>`, `<blockquote>`)
- **6.6** Subscripts, Superscripts, and Precise Values (`<sub>`, `<sup>`, `<data>`, `<time>`)
- **6.7** Document Revisions (`<ins>`, `<del>`)
- **6.8** Bidirectional and Pronunciation Markup (`<bdi>`, `<bdo>`, `<ruby>`, `<rt>`, `<rp>`)
- **6.9** Generic Inlines and Dividers (`<span>`, `<div>`)

### Chapter 7: Grouping Content and Lists
- **7.1** Unordered Lists (`<ul>`, `<li>`)
- **7.2** Ordered Lists and Counters (`<ol>`, `reversed`, `start`, `type`)
- **7.3** Description and Definition Lists (`<dl>`, `<dt>`, `<dd>`)
- **7.4** Visual and Illustrated Captions (`<figure>`, `<figcaption>`)

### Chapter 8: Links and Hypermedia
- **8.1** Anchor Primitives (`<a>`, `href`, `target`, `rel`, `download`)
- **8.2** Relative, Absolute, and Protocol-Relative URIs
- **8.3** In-Page Navigation and Fragment Identifiers
- **8.4** Hyperlink Relationship Types (`rel="noopener"`, `rel="noreferrer"`, `rel="author"`, `rel="help"`)
- **8.5** Client-Side Image Maps (`<map>`, `<area>`, `shape`, `coords`)

### Chapter 9: Embedded Content and Media
- **9.1** Raster Graphics (`<img>`, `src`, `alt`, `srcset`, `sizes`, `decoding`)
- **9.2** Responsive Art Direction (`<picture>`, `<source>`, `media`, `type`)
- **9.3** Scalable Vector Graphics Integration (`<svg>`, `<math>`)
- **9.4** Audio Streams and Playback (`<audio>`, `controls`, `autoplay`, `loop`, `preload`)
- **9.5** Video Streams and Containers (`<video>`, `poster`, `playsinline`)
- **9.6** Timed Text Tracks and Subtitles (`<track>`, `kind`, `srclang`, `WebVTT`)
- **9.7** Dynamic Drawing Contexts (`<canvas>`)
- **9.8** Legacy and Generic Integration Primitives (`<embed>`, `<object>`, `<param>`)

### Chapter 10: Tabular Data
- **10.1** Table Foundation (`<table>`, `<caption>`)
- **10.2** Structural Segments (`<thead>`, `<tbody>`, `<tfoot>`)
- **10.3** Rows and Cells (`<tr>`, `<th>`, `<td>`)
- **10.4** Column Management (`<colgroup>`, `<col>`, `span`)
- **10.5** Axis and Spanning Coordinates (`colspan`, `rowspan`, `scope`, `headers`)

---

## Part III: Interactive Features and Forms

### Chapter 11: Forms and User Input
- **11.1** Form Submission Architecture (`<form>`, `action`, `method`, `enctype`, `novalidate`)
- **11.2** Input Control Primitives (`<input>`, `type="text"`, `type="password"`, `type="hidden"`)
- **11.3** Specialized Inputs (`type="email"`, `type="url"`, `type="tel"`, `type="search"`, `type="number"`, `type="range"`)
- **11.4** Date, Time, and Color Selectors (`type="date"`, `type="time"`, `type="datetime-local"`, `type="color"`)
- **11.5** Boolean and Binary Selection Inputs (`type="checkbox"`, `type="radio"`, `type="file"`)
- **11.6** Accessible Label Association (`<label>`, `for`)
- **11.7** Structural Input Grouping (`<fieldset>`, `<legend>`)
- **11.8** Dropdown Menus and Option Groups (`<select>`, `<optgroup>`, `<option>`)
- **11.9** Freeform Multiline Fields (`<textarea>`)
- **11.10** Action Controls (`<button>`, `type="submit"`, `type="reset"`, `type="button"`)

### Chapter 12: Form Validation and Data Handling
- **12.1** Predefined Input Data Lists (`<datalist>`)
- **12.2** Output Representation (`<output>`)
- **12.3** Declarative Form Constraints (`required`, `min`, `max`, `step`, `minlength`, `maxlength`, `pattern`)
- **12.4** Constraint Validation APIs and Invalid State Pseudo-Classes
- **12.5** Form Autofill and Credential Management Attributes (`autocomplete`)

### Chapter 13: Interactive Elements and Scripting Integration
- **13.1** Native Collapsible Disclosures (`<details>`, `<summary>`, `open`)
- **13.2** Native Modal and Non-Modal Dialogs (`<dialog>`, `.showModal()`, `.close()`)
- **13.3** Metering and Progress Displays (`<progress>`, `<meter>`, `min`, `max`, `low`, `high`, `optimum`)
- **13.4** Script Execution and Loading Architecture (`<script>`, `src`, `async`, `defer`, `type="module"`)
- **13.5** Module Resolution and Dependency Maps (`<script type="importmap">`)
- **13.6** Fallback Markup Contexts (`<noscript>`)

---

## Part IV: Accessibility and Semantics

### Chapter 14: Web Accessibility and ARIA
- **14.1** Semantic Mapping and the Accessibility Tree
- **14.2** Native Semantics vs. ARIA Roles (`role="..."`)
- **14.3** ARIA State and Property Attributes (`aria-expanded`, `aria-hidden`, `aria-checked`, `aria-invalid`)
- **14.4** Accessible Labeling Attributes (`aria-label`, `aria-labelledby`, `aria-describedby`)
- **14.5** Live Region Attributes (`aria-live`, `aria-atomic`, `aria-relevant`)
- **14.6** Keyboard Traversal and Focus Trapping (`tabindex="0"`, `tabindex="-1"`)

### Chapter 15: Microdata and Structured Web Data
- **15.1** Microdata Architecture (`itemscope`, `itemtype`, `itemprop`, `itemid`, `itemref`)
- **15.2** Schema.org Vocabulary Mapping
- **15.3** JSON-LD Document Embedding (`<script type="application/ld+json">`)
- **15.4** Linked Open Data and Machine Interpretability

---

## Part V: Internals and Browser Architecture

### Chapter 16: The Parsing Algorithm and the DOM
- **16.1** The Browser Pipeline: Network Byte Stream to Pixels
- **16.2** Tokenization: State Machines, Emitted Tokens, and Tag Matching
- **16.3** Tree Construction: In-Memory Insertion Modes and Open Element Stacks
- **16.4** Error Tolerances: Automatic Tag Closing and Misnested Nodes
- **16.5** Document Object Model Construction: Node Types and Tree Traversals
- **16.6** CSSOM Construction and Render Tree Attachment

### Chapter 17: Rendering, Layout, and Compositing
- **17.1** Layout Engines, Geometry, and Reflow
- **17.2** Painting and Layer Generation
- **17.3** Hardware Compositing and GPU Workflows
- **17.4** Speculative Parsing and Preload Scanners
- **17.5** Render-Blocking vs. Parser-Blocking Resources

### Chapter 18: Security Architecture in HTML
- **18.1** Same-Origin Policy and Cross-Origin Protections
- **18.2** Content Security Policy Markup (`<meta http-equiv="Content-Security-Policy">`)
- **18.3** Cross-Site Scripting Mitigation and HTML Injection Vectors
- **18.4** Subresource Integrity (`<link integrity>`, `<script integrity>`)
- **18.5** Referrer and Cross-Origin Resource Policies (`referrerpolicy`, `crossorigin`)

---

## Part VI: Advanced Concepts and Platform APIs

### Chapter 19: Web Components and Modular HTML
- **19.1** Declarative Element Templating (`<template>`)
- **19.2** Content Insertion Points (`<slot>`, `name`)
- **19.3** Custom Elements Definition and Registration
- **19.4** Shadow DOM: Open vs. Closed Encapsulation
- **19.5** Scoped CSS Styling and Shadow Tree Encapsulation

### Chapter 20: Offline Storage and Resource Control
- **20.1** Web Application Manifests (`<link rel="manifest">`)
- **20.2** Service Worker Registration and Client-Side Routing
- **20.3** Web Storage Integration (`localStorage`, `sessionStorage`)
- **20.4** IndexedDB Structured Storage Primitives

### Chapter 21: Embedded Documents and Frame Architecture
- **21.1** Inline Frames (`<iframe>`, `src`, `srcdoc`, `name`)
- **21.2** Execution Restraints and Sandboxing (`<iframe sandbox>`)
- **21.3** Browser Feature and Permissions Control (`<iframe allow>`)
- **21.4** Window-to-Frame Communication and Messaging

---

## Part VII: Modern Features and Future Evolution

### Chapter 22: Modern Living Standard Enhancements
- **22.1** Declarative Shadow DOM (`<template shadowrootmode="open">`)
- **22.2** Top-Layer Popover Architecture (`popover`, `popovertarget`, `popovertargetaction`)
- **22.3** Exclusive Accordion Groups (`<details name="...">`)
- **22.4** Modern Media Performance Controls (`loading="lazy"`, `fetchpriority="high"`)
- **22.5** Modern Search Landmark and Navigation Semantics (`<search>`, `<form autocomplete>`)

### Chapter 23: Performance Engineering in HTML
- **23.1** Critical Rendering Path Tuning
- **23.2** Resource Hints (`<link rel="dns-prefetch">`, `<link rel="preconnect">`, `<link rel="preload">`, `<link rel="modulepreload">`)
- **23.3** Core Web Vitals Markup Strategies (LCP, INP, CLS)
- **23.4** Content Visibility and Layout Containment (`content-visibility: auto`)

### Chapter 24: Emerging Specifications and Future Directions
- **24.1** Document-Level Cross-Document View Transitions
- **24.2** Customizable and Stylable Select Controls (`<select>`, `appearance: base-select`)
- **24.3** Declarative Invoker Attributes (`invoketarget`, `invokeaction`)
- **24.4** Scoped Custom Elements and Registries
- **24.5** Long-Term Trajectory of the WHATWG Living Standard