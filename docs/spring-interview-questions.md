## Design patterns used in spring boot
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## Spring boot annotations
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## Difference between spring and spring boot
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## How does service communicate in microservice
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## What is spring cloud
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## Flow of request in spring 
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## Difference synchronization calls and asynchronization calls 
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## Fault Tolerance 
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## What is Circuit breaker
### Consider we have two service UserProfileService,RoleService, UserProfileService calling RoleService to get roles information of user.
### Due to infrastructure or memory issue  RoleService is down, when request sent to RoleService , UserProfileService gets exception response 
### In the same way there could be may request to RoleService from UserProfileService by different users all of them are blocked by exception response
### If this continues all the request threads are blocked due to slow response or exception. they are not unblocked until we get response.
### the network resources will be exhausted with low performance and bad user experience. this can leads to Cascading failures.
## How the pattern works? 💥
### Circuit breaker pattern acts like electrical switch 
### When UserProfileService gets failure response more than threshold period then circuit breaker trips for a particular time period.
### After this timeout expires, the circuit breaker allows a limited number of requests to go through it.
### If those requests are getting succeeded, then circuit breaker will be closed and normal operations are resumed.
### If they are still  failing, timeout period starts again and do the rest as previous.
## Life Cycle of Pattern States 💥
### There are 3 main states discussed in Circuit Breaker pattern. They are:

### 1). CLOSED
### 2). OPEN
### 3). HALF OPEN

## CLOSED
### When both UserProfileService,RoleService, which are interacting are up and running, circuit breaker is CLOSED.
### Circuit breaker is counting the number of remote API calls continuously.
## OPEN
### As soon as the percentage of failing remote API calls is exceeding the given threshold, circuit breaker changes its state to OPEN state.
### Calling microservice will fail immediately, and an exception will be returned. That means, the flow is interrupted.

## HALF OPEN State
### After staying at OPEN state for a given timeout period, breaker automatically turns its state into HALF OPEN state.
### In this state, only a LIMITED number of remote API calls are allowed to pass through. 
### If the failing calls count is greater than this limited number, breaker turns again into OPEN state. Otherwise it is CLOSED.

# What is Resilience4j?
### Resilience4j is a lightweight, easy-to-use fault tolerance library inspired by Netflix Hystrix. It provides various features.

## 1). Circuit Breaker — fault tolerance
## 2). Rate Limiter — block too many requests
## 3). Time Limiter — limit time while calling remote operations
## 4). Retry Mechanism — automatic retry for failed operations
## 5). Bulkhead — limit number of concurrent requests
## 6). Cache — store results of costly remote operations
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## Transactional Management in microservice
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## What is Spring actuator
### Spring Boot includes a number of additional features to help you monitor and manage your application when you push it to production. 
### You can choose to manage and monitor your application by using HTTP endpoints or with JMX. Auditing, health, and metrics gathering can also be automatically applied to your application.
## Endpoints
### Actuator endpoints let you monitor and interact with your application. Spring Boot includes a number of built-in endpoints and lets you add your own. 
### For example, the health endpoint provides basic application health information.
### auditevents-->Exposes audit events information for the current application. Requires an AuditEventRepository bean.
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## What is Global Exception handling 
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## How you pass parameters form outer and use it in application (@Value,Resource)
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## How to handle failures in microservice 
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## How to limit number of users in application at a time
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## JWT token components
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## Spring Security 
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
## Track requests in microservice
### Spring Cloud Sleuth, which provides support for distributed tracing. 
### It instruments Spring components to gather trace information and can delivers it to a Zipkin Server, which gathers and displays traces.
#### <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->

