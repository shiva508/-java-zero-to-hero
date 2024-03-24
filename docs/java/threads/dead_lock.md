# Dead Lock
## Dead lock occurs when two or are more threads waiting for resource or lock held by other thread.

# Live Lock
## A Thread acts in  response to the actions of other thread.
## If other thread's action is also response to the action of another thread then LiveLock arise.
## LiveLock threads are unable to ake further progress,however threads are not blocked.
## They are simply responding each other to resume work.

# How to avoid deadlock

## Make sure to thread does not block infinitely if it is unable to acquire lock
## we can use Lock interface tryLock() method to avoid this situation.
## We should make sure each thread acquire lock in same order to avoid any cyclic dependency in lock acquisition.

