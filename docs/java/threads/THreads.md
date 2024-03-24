By Extending Thread class
By Implementing Runnable Interface

-->t.start():New Thread will be created which is responsible for execution of run()
	1.Registers thread with Thread Scheduler
	2.invoke and calling run method
-->t.run():No special thread is created,it works like normal 

B).If you are not overriding run method do not go for multi threading
C).We can override run method but thread class always invokes no arg run method,
	Overriding methods need to be called externally just like other methods
D).If we override start method it behaves like normal method,does not create any new thread
E).We are not allowed to start thread again,it throws IlligalThreadStateException
F).Thread Priority:Thread priority ranges from 1 to 10
	MIN:1
	NORM:5
	MAX:10

G).Methods to prevent execution
	a).yield()
	b).join()
	c).sleep()

# How many ways can we create thread?
## Ans: We can create thread
## By extending Thread class.
### or
## Implementing Runnable Interface
## Explain life cycle of thread?
## 	1.NEW-->is not started yes
##	2.RUNNABLE-->ready for execution but other thread is running now
##	3.RUNNING-->when thread is executing
##	4.BLOCKED/WAITING-->waiting for some external data,waiting for data from other thread
##	5.TERMINATED/DEAD-->After completing thread execution completed
## Methods:
## Join-->
## Sleep-->
## Yield-->
## synchronized
