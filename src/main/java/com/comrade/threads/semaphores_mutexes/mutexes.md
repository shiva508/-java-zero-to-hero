# Mutexes (Mutual Exclusion Objects)
## Mutual exclusion is a property of concurrency control which is instituted for the purpose of preventing race condition.
## Process synchronization plays an important role in maintaining consistency of shared data.
## Mutex is similar to Binary Semaphore and used for specific use case.
## A Lock designed to enforce a mutual exclusion concurrency control


## Semaphore                         -  Mutexes
## It is signalling mechanism        -  It is Locking mechanism
## Thread and process perform wait(),notify operations to indicate weather they are acquired or released  - Thread or process has to acquire lock on mutex object if they want to acquire resource.
## it allows multiple program threads to access finite instance resource(Not single resource) - It allows multiple program threads to access a single shared resource but one at a time.
## Process or thread blocks itself if no resource is free till the count of semaphore becomes greater than 1 - If the lock is acquired by another thread or process then thread will wait till mutex object gets unlocked.


