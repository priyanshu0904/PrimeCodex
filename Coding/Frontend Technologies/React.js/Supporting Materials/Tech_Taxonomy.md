# React Knowledge Tree

## Core

* **Languages**
* JavaScript (ES6+)
* TypeScript
* JSX / TSX


* **Runtime**
* Web Browser (DOM)
* Node.js
* Deno
* Bun
* React Native Runtime (Hermes, JavaScriptCore)


* **Compiler & Transpiler**
* React Compiler (React Forget)
* Babel (`@babel/preset-react`)
* SWC (`@swc/core`)
* Sucrase
* ESBuild
* TypeScript Compiler (`tsc`)


* **Standard APIs & Packages**
* `react`
* `react-dom` (`react-dom/client`, `react-dom/server`)
* `react/jsx-runtime`
* `react/jsx-dev-runtime`
* `react-is`
* `scheduler`


* **Core Concepts**
* Declarative UI
* Virtual DOM & Reconciliation
* React Fiber Architecture
* Component Lifecycle (Mounting, Updating, Unmounting)
* Unidirectional Data Flow & Props
* Local State Management
* Conditional Rendering & Lists (`key` attribute)
* Controlled vs Uncontrolled Components
* React Fragments
* Portals (`createPortal`)
* Error Boundaries (`componentDidCatch`, `getDerivedStateFromError`)
* Context API (`createContext`, `useContext`)
* Synthetic Events System
* Concurrent Mode & Interruptible Rendering
* Selective Hydration & Streaming SSR
* React Server Components (RSC)
* Server Actions
* Strict Mode
* Profiler API


* **Built-in Hooks**
* State Hooks: `useState`, `useReducer`
* Context Hooks: `useContext`
* Ref Hooks: `useRef`, `useImperativeHandle`
* Effect Hooks: `useEffect`, `useLayoutEffect`, `useInsertionEffect`
* Performance Hooks: `useMemo`, `useCallback`, `useTransition`, `useDeferredValue`
* Resource & Action Hooks: `use`, `useActionState`, `useOptimistic`, `useFormStatus`
* Integration Hooks: `useSyncExternalStore`, `useId`, `useDebugValue`



---

## Development Tools

### IDE

* WebStorm
* Visual Studio
* Eclipse with TypeScript plugin
* Cursor

### Editors

* Visual Studio Code
* Sublime Text
* Neovim / Vim
* Zed
* Atom (Legacy)

### Developer Extensions & Add-ons

* React Developer Tools (Chrome/Firefox extension)
* Redux DevTools
* React Query Devtools
* Apollo Client Devtools
* React Hook Form Devtools
* VS Code Extensions:
* ES7+ React/Redux/React-Native snippets
* Tailwind CSS IntelliSense
* Pretty TypeScript Errors
* Auto Close Tag / Auto Rename Tag
* Error Lens



### CLI Tools

* `create-react-app` (Legacy)
* `create-vite` / `npm create vite@latest`
* `create-next-app`
* `create-remix`
* `create-t3-app`
* `create-expo-app`
* `shadcn-ui` CLI
* Storybook CLI
* React Codemod

### Package Managers

* npm
* Yarn (Classic & Berry)
* pnpm
* Bun

### Build Tools & Bundlers

* Vite
* Webpack
* Turbopack
* Rollup
* Parcel
* Rspack
* Farm
* ESBuild
* Microbundle
* Tsup

### Linters & Formatters

* ESLint (`eslint-plugin-react`, `eslint-plugin-react-hooks`, `eslint-plugin-react-refresh`)
* Prettier
* Biome
* Stylelint
* Husky & lint-staged

---

## Framework Ecosystem

### Frontend

* Vite (React SPA)
* Astro (React Integration)
* Gatsby
* RedwoodJS (Frontend Client)
* Refine
* Toolpad (MUI)

### Backend (for React integrations)

* Express.js
* NestJS
* Fastify
* Hono
* Koa
* Node.js HTTP Module
* Nitro

### Full Stack (React Meta-Frameworks)

* Next.js (App Router & Pages Router)
* Remix (React Router v7)
* TanStack Start
* RedwoodJS
* Waku (Minimalist RSC framework)
* Blitz.js
* Hydrogen (Shopify)

### UI Libraries & Component Sets

* **Unstyled / Headless**
* Radix UI
* React Aria Components
* Headless UI
* Ark UI
* Base UI (MUI)


* **Component Libraries**
* shadcn/ui
* Material UI (MUI)
* Ant Design
* Chakra UI
* Mantine
* NextUI (HeroUI)
* DaisyUI
* Semantic UI React (Legacy)
* React Bootstrap (Legacy)
* Blueprint.js
* Fluent UI (Microsoft)
* Grommet
* Evergreen
* Primer React (GitHub)


* **Enterprise Design Systems**
* IBM Carbon Design System
* Atlassian Design System
* Adobe Spectrum
* Salesforce Lightning Design System (SLDS)



### Styling & CSS Ecosystem

* **Utility-First**
* Tailwind CSS
* UnoCSS
* Windi CSS (Legacy)


* **CSS-in-JS (Runtime)**
* Styled Components
* Emotion (`@emotion/react`, `@emotion/styled`)


* **CSS-in-JS (Zero-Runtime / Compile-Time)**
* StyleX (Meta)
* Vanilla Extract
* Linaria
* Panda CSS
* Tamagui (Universal)


* **CSS Modules & Preprocessors**
* CSS Modules
* Sass / SCSS
* PostCSS
* Less
* Stylus



### State Management

* **Global Store (Flux / Reducer)**
* Redux
* Redux Toolkit (RTK)
* Zustand


* **Atomic State**
* Jotai
* Recoil


* **Proxy-Based**
* MobX
* Valtio


* **State Machines**
* XState
* Robot


* **Micro-State / Signals**
* Preact Signals (React integration)
* Legend-State


* **Data Flow / Streaming**
* RxJS with `useObservable`



### Data Fetching & Server State

* TanStack Query (React Query)
* SWR
* RTK Query
* Apollo Client
* Urql
* Relay
* tRPC

### Routing (SPA & Specialized)

* React Router (v6 / v7)
* TanStack Router
* Wouter
* Universal Router

### Animation & Motion

* Framer Motion
* React Spring
* GSAP (GreenSock with `@gsap/react`)
* AutoAnimate
* Remotion (Programmatic Video)
* React Transition Group (Legacy)
* Lottie React

### Data Visualization & Canvas

* Recharts
* Nivo
* Visx (Airbnb)
* Victory
* Chart.js (`react-chartjs-2`)
* React Flow / xyflow (Node-based UIs)
* Three.js Ecosystem:
* React Three Fiber (R3F)
* `@react-three/drei`
* `@react-three/rapier`


* PixiJS (`@pixi/react`)
* D3.js (Integrated with React hooks)

### Forms & Validation

* **Form Engines**
* React Hook Form
* Formik
* TanStack Form
* React Final Form (Legacy)


* **Schema Validation**
* Zod
* Yup
* Valibot
* TypeBox
* Joi



### Tables & Grids

* TanStack Table (React Table)
* AG Grid (React Edition)
* Material React Table
* DataGrid (MUI X)
* Handsontable

---

## Database Ecosystem

### SQL

* PostgreSQL
* MySQL
* SQLite / LibSQL (Turso)
* CockroachDB
* MariaDB
* Microsoft SQL Server
* DuckDB

### NoSQL

* MongoDB
* CouchDB
* Apache Cassandra
* DynamoDB
* Firebase Realtime Database
* Cloud Firestore
* Supabase (PostgreSQL with Realtime)
* Convex

### Cache

* Redis
* Upstash Redis
* Memcached
* Dragonfly
* Keyv

### ORM / Database Client Tools

* Prisma
* Drizzle ORM
* Kysely
* TypeORM
* Sequelize
* Mongoose
* EdgeDB

---

## API Ecosystem

### REST

* Axios
* Native Fetch API
* Ky
* Wretch
* OpenAPI / Swagger UI React
* Orval (Client generator)
* Zodios

### GraphQL

* Apollo Client
* Urql
* Relay Modern
* GraphQL Request
* GraphQL Code Generator (`@graphql-codegen`)
* GraphiQL

### gRPC / RPC

* Connect-Web / Connect-ES
* gRPC-Web
* Protobuf.js
* tRPC

### Real-Time & Streaming

* Socket.IO Client (`socket.io-client`)
* WebSocket API
* Server-Sent Events (SSE)
* PartyKit
* Liveblocks
* Pusher JS

### API Testing & Mocking

* Mock Service Worker (MSW)
* Mirage JS
* JSON Server
* Nock
* Postman
* Insomnia
* Hoppscotch

---

## Cloud Ecosystem

### AWS

* AWS Amplify (React SDK)
* AWS S3 (Static Web Hosting & Asset Storage)
* AWS CloudFront (CDN)
* AWS Lambda / Lambda@Edge
* AWS AppSync (GraphQL)
* AWS ECS / EKS
* AWS Route 53

### Azure

* Azure Static Web Apps
* Azure App Service
* Azure Functions
* Azure Blob Storage
* Azure Front Door

### Google Cloud

* Google Cloud Storage (Static Assets)
* Google Cloud Run
* Google App Engine
* Google Cloud Functions
* Firebase Hosting

### Other Cloud Platforms & Edge Runtimes

* Cloudflare Pages / Cloudflare Workers
* Fastly Compute@Edge
* Fly.io
* Deno Deploy
* Akamai EdgeWorkers

---

## DevOps Ecosystem

### Version Control

* Git
* GitHub
* GitLab
* Bitbucket

### CI/CD

* GitHub Actions
* GitLab CI/CD
* CircleCI
* Travis CI
* Jenkins
* Bitbucket Pipelines
* ArgoCD

### Containers

* Docker
* Podman
* Containerfiles / Multi-stage Docker builds for Node/Nginx

### Orchestration

* Kubernetes (K8s)
* Docker Swarm
* Nomad
* OpenShift

### Infrastructure as Code (IaC)

* Terraform
* OpenTofu
* Pulumi
* AWS CDK
* SST (Serverless Stack)
* Ansible

---

## Testing Ecosystem

### Unit Testing

* Vitest
* Jest
* Mocha + Chai
* Jasmine (Legacy)

### Integration Testing

* React Testing Library (`@testing-library/react`)
* Testing Library User Event (`@testing-library/user-event`)
* Testing Library React Hooks (`@testing-library/react-hooks` / Built into RTL)
* Enzyme (Legacy)

### End-to-End (E2E) Testing

* Playwright
* Cypress
* Puppeteer
* Nightwatch.js
* Selenium WebDriver

### Component Testing & Visual Regression

* Storybook
* Chromatic
* Playwright Component Testing
* Cypress Component Testing
* Applitools
* Percy

### Performance & Load Testing

* Google Lighthouse
* Web Vitals Library (`web-vitals`)
* k6
* Artillery
* Autocannon

---

## Security Ecosystem

### Authentication

* NextAuth.js / Auth.js
* Clerk
* Supabase Auth
* Firebase Auth
* Auth0 (`@auth0/auth0-react`)
* Stytch
* Kinde
* WorkOS
* AWS Cognito

### Authorization

* CASL (`@casl/react`)
* Cerbos
* Permit.io
* Oso
* Role-Based Access Control (RBAC) Pattern implementations

### Security Frameworks & Policies

* Content Security Policy (CSP) headers
* Cross-Origin Resource Sharing (CORS)
* SameSite Cookie Policies
* Subresource Integrity (SRI)

### Security Tools & Code Scanners

* Snyk
* SonarQube
* Socket.dev
* npm audit / pnpm audit
* OWASP ZAP
* Dependabot
* Semgrep

---

## AI Ecosystem

### AI Frameworks & SDKs

* Vercel AI SDK (`ai/react`)
* LangChain.js / `@langchain/core`
* LlamaIndex.TS
* Hugging Face Inference JS

### Machine Learning (In-Browser)

* TensorFlow.js
* ONNX Runtime Web
* Transformers.js
* WebGPU API integration

### LLM Integration & Providers

* OpenAI API Client
* Anthropic Claude SDK
* Google Gen AI SDK
* Mistral AI SDK
* Groq SDK
* Ollama (Local AI API)

### AI Agents & Chat UIs

* CopilotKit
* Assistant UI
* Chatbot UI
* Flowise (React frontend)

### Vector Database Clients

* Pinecone Client
* Weaviate Client
* ChromaDB Client
* Qdrant Client
* Milvus Client

---

## Mobile & Desktop Ecosystem

### Cross-Platform Native Mobile

* React Native
* Expo
* React Native Web
* Ignite CLI (Infinite Red)
* React Native Paper
* React Native Elements
* Tamagui Mobile
* NativeWind (Tailwind for React Native)

### Hybrid Mobile

* Ionic React (`@ionic/react`)
* Capacitor
* Apache Cordova (Legacy)

### Desktop Frameworks

* Electron
* Tauri (with React frontend)
* React Native for Windows + macOS
* Neutralinojs
* Wails (React template)

---

## Enterprise Ecosystem

### Micro-Frontends

* Module Federation (Webpack 5 / Rspack)
* Single-SPA
* Bit (Component-driven architecture)
* qiankun
* Piral
* OpenComponents

### Monorepo Tools

* Turborepo
* Nx
* Lerna
* pnpm Workspaces
* Yarn Workspaces

### Documentation & Design System Tools

* Storybook
* Docusaurus
* Nextra
* Fumadocs
* Styleguidist (Legacy)
* Docz (Legacy)
* Zeroheight

### Internationalization (i18n)

* `react-i18next` / `i18next`
* `react-intl` (FormatJS)
* LinguiJS
* Paraglide JS
* Next-Intl

### Accessibility (a11y)

* axe-core (`@axe-core/react`)
* `eslint-plugin-jsx-a11y`
* React Aria
* Pa11y

---

## Blockchain / Web3 Ecosystem

### Web3 Libraries & Providers

* Wagmi (React Hooks for Ethereum)
* Viem
* Ethers.js
* Web3.js
* RainbowKit
* Web3Modal / AppKit (WalletConnect)
* ConnectKit

### Blockchain Platforms & Networks

* Ethereum
* Polygon
* Arbitrum
* Optimism
* Base
* Solana (`@solana/wallet-adapter-react`)
* Avalanche

### Smart Contracts Development Tools

* Hardhat
* Foundry
* Anchor (Solana)
* Truffle (Legacy)

---

## Monitoring & Observability Ecosystem

### Performance Monitoring (APM & RUM)

* Vercel Speed Insights & Analytics
* Google Analytics / GA4
* Mixpanel
* PostHog
* Amplitude
* Datadog RUM
* Dynatrace
* New Relic

### Logging

* LogRocket (Session Replay)
* Axiom
* Pino (for SSR/Next.js)
* Winston (for SSR/Node.js)

### Error Tracking

* Sentry (`@sentry/react`, `@sentry/nextjs`)
* Bugsnag
* Rollbar
* Highlight.io
* TrackJS

---

## Deployment Ecosystem

### Static & Jamstack Hosting

* GitHub Pages
* Cloudflare Pages
* Netlify
* AWS S3 + CloudFront
* Firebase Hosting

### PaaS & SSR Hosting

* Vercel
* Netlify
* Railway
* Render
* Heroku
* Fly.io
* DigitalOcean App Platform

### Serverless & Edge Compute

* AWS Lambda
* Cloudflare Workers
* Vercel Edge Functions
* Netlify Functions
* Supabase Edge Functions

---

## Developer Resources

### Documentation

* Official React Documentation (`react.dev`)
* Legacy React Documentation (`reactjs.org`)
* MDN Web Docs (React tutorials & JS/DOM APIs)
* Next.js Documentation (`nextjs.org/docs`)
* TypeScript Official Documentation

### Learning Platforms

* freeCodeCamp
* Scrimba (Interactive React Path)
* Epic React by Kent C. Dodds
* Frontend Masters
* Udemy
* Egghead.io
* Codecademy

### Communities

* Reactiflux (Discord)
* Reddit (`r/reactjs`)
* Stack Overflow (tag: `reactjs`)
* Dev.to (`#react`)
* X (Twitter) React Community
* GitHub Discussions (React Repository)

### Benchmarks & Spec Repositories

* `facebook/react` (GitHub)
* `reactwg/react-18` (Working Group)
* `reactjs/rfcs` (RFC Repository)
* JS Framework Benchmark (Krausest)

---

## Career Stack

### Beginner Stack

* **Languages:** HTML5, CSS3, JavaScript (ES6+)
* **Build Tool:** Vite
* **UI Architecture:** Functional Components, JSX, Props, Basic Hooks (`useState`, `useEffect`, `useRef`)
* **Routing:** React Router DOM
* **Styling:** CSS Modules or Tailwind CSS
* **Data Fetching:** Fetch API, Axios
* **Version Control:** Git, GitHub
* **Hosting:** GitHub Pages, Vercel (Static)

### Intermediate Stack

* **Languages:** TypeScript (Strongly Typed Props & State)
* **Framework:** Next.js (Pages or App Router) or Vite SPA
* **Styling:** Tailwind CSS, Radix UI Primitives, shadcn/ui
* **State Management:** Zustand or Redux Toolkit
* **Server State:** TanStack Query (React Query)
* **Forms:** React Hook Form + Zod
* **Testing:** Vitest, React Testing Library
* **Tooling:** ESLint, Prettier, Husky
* **Backend Communication:** REST, Basic GraphQL
* **Hosting / PaaS:** Vercel, Netlify, Render

### Advanced Stack

* **Architecture:** React Server Components (RSC), Server Actions, Streaming SSR
* **Frameworks:** Next.js (App Router), Remix (React Router v7)
* **Performance:** Suspense, Transitions (`useTransition`, `useDeferredValue`), Web Vitals profiling
* **State & Logic:** XState, Micro-states (Jotai), Web Workers
* **Testing:** Playwright (E2E), MSW (API Mocking), Storybook (Component Testing)
* **Monorepo:** Turborepo or Nx, pnpm Workspaces
* **Advanced Networking:** WebSockets, SSE, tRPC, GraphQL CodeGen
* **Observability:** Sentry, PostHog, Vercel Analytics
* **Cloud/Infra:** Docker, CI/CD pipelines (GitHub Actions), Cloudflare Workers

### Industry / Enterprise Lead Stack

* **System Architecture:** Micro-Frontends (Module Federation), Distributed Monorepo
* **Design Systems:** Custom Accessible Component Library (Radix/React Aria Primitives, Zero-runtime CSS via StyleX or Vanilla Extract)
* **Cross-Platform:** Universal React (React DOM + React Native via Tamagui or Expo)
* **Data Architecture:** Offline-first Architecture, Sync Engines, Real-time CRDTs (Yjs, Automerge)
* **Compilation:** React Compiler, Rspack / Turbopack migration
* **Security & Compliance:** CSP configuration, Dependency auditing, RBAC/ABAC authorization
* **DevOps & Cloud:** Kubernetes, Multi-Region Edge Deployments, Terraform/SST, Docker multi-stage builds
* **Monitoring & SRE:** Datadog RUM, OpenTelemetry integration, Sentry enterprise tracing