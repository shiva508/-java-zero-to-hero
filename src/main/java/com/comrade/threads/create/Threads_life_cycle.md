# Thread life cycle
# New
## When thread is created using Thread or Runnable , and util start method is called thread will be in start state.
# Active State
## When we call start() on thread then thread said to be in active state and it has 2 sub-state
## 1). Running : When processor allocated time to execute thread
## 2). Runnable : When thread not picked for processing waiting for processor allocate time to execute
# Blocked/Waiting state
## When we call join() on thread or thread waiting for another thread to complete.
# Terminated
## When thread finished executing task
