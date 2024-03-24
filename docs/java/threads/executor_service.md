# Executor Service
## With the increase the number of cores available in the processors now a days multi threading getting more crucial
## Java provides its own multi-threading framework called Executor-service 
## We can manage worker threads more efficiently because of thread pool.

# Why to use Thread-Pool and Executor Framework
## It will handle everything : Schedule and execute scheduled tasks
## Creating and managing threads is expensive.
## Adding new thread for each process can lead to create a lot of threads .
## These threads need memory+CPU will spend too much time spending context when threads are swapped. 
## Thread pool can reuse threads extremely efficient manner by keeping threads alive and reusing.

# Types of Executors
# 1). SingleThreadExecutor
## This executor has single thread so we can execute process in sequential manner, each process executed by new thread.
# 2). FixedThreadPool
## This is how we can create thread pool, usually no of cpu is equals threads
## If there are more the no of task than n, then these tasks are stored in LinkedBlockingQueue
# 3). CachedThreadPool
## No of threads are not bounded, if all threads are busy executing some tasks and new task comes to pool will create new and add new thread to executor
## If thread remains idle for 60 secs then it is removed.
## It is used for short parallel tasks
# 3). ScheduledExecutor
## We execute a given operation at a regular interval or we can use this executor if we will to delay certain tasks.
# executorService.shutdown();
## We Prevent executor to execute any further tasks
# executorService.awaitTermination(1000, TimeUnit.MILLISECONDS)
## Blocks until all the tasks completed execution after shutdown request
# executorService.shutdownNow();
## Attempts to stop all actively executing tasks

