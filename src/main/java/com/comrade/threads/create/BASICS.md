## Programming languages are sequential ,they execute tasks one by one.
# Process
## Process is a instance of program execution.
## Operating system assigns distinct REGISTER,STACK EMORY,HEAP MEMORY for every single process.
## In Java we can create process using ProcessBuilder class.
## Creating process is expensive as we need to allocate REGISTER,STACK EMORY,HEAP MEMORY for each process.
## Every single process has parent process so we need to handle both parent and child.

# Threads
## Thread is lightweight process
## Thread is a unit of execution withing process, so single process may contain many threads.
## Each thread shares common memory allocated to process, while working in concurrent programming we need to take case of the memory management.
## As threads use common memory threads may update same memory location
## So creating threads are less expensive than creating process.

# Advantages of Multithreading
## We can build responsive applications, we can do several operation concurantly
## Better utilization of CPU resource(By default java is single thread )
## Improves performance.

# Disadvantages
## As threads share same memory, maintaining data integrating is hard as multiple threads manpulate same memory.
## Synchronization between threads is hard to achieve.
## Multiple threads is expensive.
