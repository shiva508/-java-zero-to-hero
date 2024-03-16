# Latch
## This is used to synchronize one or more tasks by forcing them to wait for the completion of set of operations being performed by other operations.
## You give an initial count to a CountDownLatch object and any task that calls wait() on that  object will block until count reaches zero.
## Other task may call countDown() on the object to reduce the count,
