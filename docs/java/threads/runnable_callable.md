# Runnable & Callable 
## Both run the tasks on different threads 
# Runnable 
## Runnable is Run-And_Forget action, it does not return anything
# Callable
## Callable is return some value when that thread got executed
## Callable interface will not return the value that is why we need Future<T>
## Calling thread will be blocked until call() executed and Future<T> returns with the values