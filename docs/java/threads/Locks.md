# Locks

# Intrinsic Lock
## Every object in java has so called lock called intrinsic lock.
## A thread that needs exclusive and consistent access to object fields,has to acquire object's intrinsic lock before access them and once done lock is released.
## Because of intrinsic lock no two threads execute same synchronized method at once.
## Thread owns intrinsic lock between time it has acquired lock and released lock.
## As long as thread owns intrinsic lock, no other thread acquire same lock
## Other thread will block when it attempts to acquire the lock.
## Problem is that every object has single intrinsic lock

## If we have two independent synchronized methods, then threads have to wait each other to release lock.
## as each object has only one lock if one sync method acquires lock other sync method has to wait for lock gets released

## Object level locking happens when synchronized method without static
## Class level locking happens when synchronized method with static

# Re-entrant lock
## Thread can not acquire lock on object owned by other thread, but given thread can acquire a lock that it already own,

# Difference between Lock and Synchronization
## We can ake lock fair : Prevent thread starvation - Synchronization blocks are by default unfair
## We can check given lock is held or not with re-entrant lock - not possible with Synchronization blocks
## We can get list of threads waiting for given lock with re-entrant lock - not possible
## need try-catch-finally  -  no need of try-catch-finally 


