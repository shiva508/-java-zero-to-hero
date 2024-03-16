# Garbage Collection
### In old programming languages programmer used to take care of object creation and destruction.
### If programmer forgets to destruct useless object, at one point of time there will not be any space left to create new project.
### Java provides background running program that find useless objects and removes from memory.
### This background running program is called Garbage collector.
## Which objects are eligible for Garbage Collection
### Objects those are not referred in rest of the program are eligible for garbage collection.
## How to make objects eligible for garbage collection.
## Assign null to reference variable
### Assign null to reference variable if object is no longer needed in program
## Reassign reference variable
## Create object inside method
### Objects created inside method are eligible for garbage collection once method execution completed.
## Island of Isolation
### If object are not having explicit reference or objects having internal reference are eligible for garbage collection.
### Methods to request JVM to run garbage collection.
## Using System.gc();
## Using Runtime.getRuntime().gc()
## What is memory leaks
### If any object is not eligible for garbage collection and not utilized in java application, these objects are called memory leaks.
## Heap Memory Structure
### Heap memory is divided into two parts 
### 1). Young Generation
#### a). Eden Space
#### b). Survivor space
##### I).  Survivor space-S0
##### II).  Survivor space-S1
### 2). Old Generation
### When Object is newly created that object comes to young generation.
### In young generation that object comes to eden space, at ede space minor GC is performed.
### If object is dereference object then minor GC will remove that object
### In eden space , if any object is still alive then GC will move that alive object to survivor space.
### In Survivor space, initially object comes to s0-survivor space
### In s0-survivor space minor GC happens and if any object is dereference the GC will remove that object.
### Remaining objects are moved to s1-survivor space 
### In s1-survivor space minor GC happens
### If any objects are still alive those objects are moved to Old generation .
### In old generation major GC performed.
### In Old generation GC performed by one of bellow Garbage collectors

## Serial garbage collector
### Algorithm
### Step-1: Mark survivor objects in old generation.
### Step-2: Keep all marked object at front end of the heap and keep all unmarked object at other end of the heap(Sweep)
### Step-3: Free the memory for unmarked objects (Compact)
### This will use only one thread
### It will pause all running threads in application while performing GC
### It is suitable for single thread model
### Not suitable for server side application.
### It will take less memory to run GC 
### To activate GC command -->java -XX:+UseSerialGC DatabaseApplication

## Parallel garbage collector
### Algorithm
### Step-1: Mark survivor objects in old generation.
### Step-2: Keep all marked object at front end of the heap and keep all unmarked object at other end of the heap(Sweep)
### Step-3: Free the memory for unmarked objects(compact)
### It is default garbage collector in JVM
### This will use more than one thread to perform GC
### It is suitable for multi thread model
### It is suitable for server side application.
### It will pause all running threads in application while performing GC
### It will take more memory to run GC compared to serial GC
### To activate GC command -->java -XX:+UseParallelGC DatabaseApplication

## Parallel old garbage collector
### It is introduced in JDK5.0
### It is similar to Parallel GC , but it uses MARK-SUMMARY-COMPACT algorithm
### Step-1: Mark survivor objects in old generation.
### Step-2: Identify all survivor objects from the area where last GC was performed.
### Step-3: Delete unmarked objects 
### To activate GC command -->java -XX:+UseParallelOldGC DatabaseApplication

## Concurrent Mark and Sweep garbage collector
### It allows multiple threads to perform GC
### It will not freeze all application threads while performing GC except
### a). While marking survivor objects
### b). Any change in GC while performing GC
### provides good performance
### More complicated GC, need more memory
### To activate GC command -->java -XX:+UseConMarkSeepGC DatabaseApplication

## Garbage First(G1) Garbage collector
### It is introduced in Java7
### It will divide heap memory into number of regions.
### Each region contains number of grids,where each grid contains objects
### Here GC is performed over all grids which contains objects.
### If any useless object is found the that object will gets removed 
### It is simple and fast
### To activate GC command -->java -XX:+UseG1GC DatabaseApplication
## GC Optimization options
### -Xms = Initial heap
### -Xmx = Max heap size
### -Xmn = Size of young generation
### -XX:PermSize = Initial permanent generation size
### -XX:MaxPermSize = Max permanent generation size



