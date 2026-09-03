# Thread
- A small part of a program that can run at the same time as other parts.
- Helps a program to do many things or tasks at once simultaneously
- Can create Threads using Thread class or Runnable interface
- Use for tasks that can happen at same time, managing many requests or splitting a big job
- Threads can talk to each other using wait(), notify() and notifyAll() to coordinate their work.
- Thread Scheduler is used to schedule threads to CPU

# Multithreading
## Need of Multithreading
- Tasks might be very important, independent of each other
- A multi-core CPU is sitting idle most of the time
- A big task can be divided into smaller parts
- Making your code responsive

## Creating a Thread
### Extending Thread Class
- Use Thread class to inherit
- Override run() method in creating thread
- In the main method, if two threads t1 and t2, call start() in both, run() will automatically execute, both are working simultaneously and independently
- getState(): to get the current state of thread

### Creating Runnables
- Use Runnable interface to inherit
- Override run() method
- In the main method, create instance of your thread, and to start, creating new thread
```java
new Thread(t1).start();
```
- Rest is similar

## States of a Thread
```text
       +---------------+
       |      New      |
       +---------------+
               |
               | start()
               v
    +--------------------+
    |      Runnable      | <---------------------+
    +--------------------+                       |
       |               ^                         |
       | scheduler     | yield()                 |
       | picks thread  |                         |
       v               |                         |
    +--------------------+                       |
    |      Running       |                       | notify() / notifyAll()
    +--------------------+                       | when sleep time is up
       |               |                         | resume()
       | wait()        | run() ends /            |
       | sleep()       | stop()                  |
       | suspend()     v                         |
       |       +---------------+                 |
       |       |  Terminated   |                 |
       |       | (Dead state)  |                 |
       |       +---------------+                 |
       v                                         |
+----------------------------+                   |
|         waiting /          |                   |
|         sleeping /         | ------------------+
|          blocking          |
+----------------------------+
```
- New: Thread is created but not started
- Runnable: Thread is ready or running
- Running: Thread is actively executing tasks
- Blocked/Waiting: Thread is alive but not active, because it is waiting for resources or other thread
- Terminated: Thread has finished or stop running.

## Thread Priority
- Priority levels: 1(lowest) to 10(highest), default value is 5
- It influences on execution, it only suggests the importance of thread to schedule, but not guarantee the order of execution, depends on CPU availability
- setPriority(int) to change thread's priority, getPriority() to retrieve it.
- Thread.MIN_PRIORITY = 1 / Thread.MAX_PRIORITY = 10 / Thread.NORM_PRIORITY = 5

## Join Method
- join() used to make the calling thread wait until the thread on which it join called completes its execution
- It helps in synchronizing multiple threads, ensures the thread completes before executing next steps in calling thread
- Methods:
    - join() -> waits indefinitely until the thread in which it called finished
    - join(long millis) -> waits for the thread to die for specified ms.
    - join(long millis, int nanos) -> waits for the thread to die to specific ms plus ns.

## Synchronize Keyword
- applied in method or block of code, synchronized keyword
- Mutual Exclusion -> it ensures that only one thread can execute a block of code at a time, provides mutual exclusion and preventing race conditions
- Object Lock -> When a thread entered a synchronized block, it acquires a lock on object or class, depends whether the method is static or instance, such that no other thread can access that at same time, and when left from block locks open
- Visibility -> It ensures that changes made by one thread to shared data are visible to other threads

## Thread Communication
- Thread indexing starts from 0
- These are static methods, can directly access by Thread class
- sleep(long millis): currently executing thread to sleep(temporarily cease execution) for specified number of ms
- yield(): currently executing threads to pause and allow other threads to execute. Way to suggest that other threads of same priority can run
- wait(): current thread to wait until another thread invokes notify() or notifyAll() method for this object. It releases the lock held by this thread.
- notify(): Wakes up a single thread that is waiting on object's monitor. If any threads are waiting, one is chosen to be awakened.
- notifyAll(): Wakes up all threads that are waiting on object's monitor.
- currentThread(): Specifies current Thread
- currentThread().getName(): Gives name of current thread

