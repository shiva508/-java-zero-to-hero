# Fork Join
## Fork Join framework is implementation of ExecutorService interface for parallel execution.
## this framework helps to run algorithm parallel 
## Developer do not have to worry about low level synchronization and locks
## It is divide and conquer mechanism 
## Larger tasks will be divided into small tasks,after execution we combine solution
## Subtasks have to be independent inorder to be executed in parallel
## Main concept of fork-join is to break large task to small and 

## Class and Methods
# RecursiveTask 
## It reruns generic type T
## All the tasks wants to execute in parallel are subclass of RecursiveTask.
## We have to override compute() which return the solution of sub-problem.

# RecursiveAction 
## It is a task without any return value

# Fork-Join Pool
## Basically it is a thread pool for execution fork-join tasks
# Work Stealing tasks
## Task is not equivalent to thread, tasks are light-weight threads so fork-join even when there are hug number of tasks
## Fork-Join pool creates fixed number of threads : usually  equals to cores 

# fork()
## asynchronously executes given task in the pool,we can call it using RecursiveTask<T>, RecursiveAction
# join() 
## returns the result of the computed task,when it is finished
# invoke() 
## executes given task+wai+return the result upon completion

