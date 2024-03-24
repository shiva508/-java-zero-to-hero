# Volatile
## Every read of volatile variable is from RAM main memory, not from thread cache 
## While processing usually each thread stores local variable to cache as it is faster
## Caches are faster, if not need do not use volatile.
