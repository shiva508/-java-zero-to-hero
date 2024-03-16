# JAVA 12
## 1). Collectors.teeing() in Stream API
### It is a new static method teeing to java.util.stream.Collectors interface which allows to collect using two independent collectors, then merge their results using the supplied BiFunction
## 2). String API Changes
### a). String.indent(int n)
#### This method adjusts the indentation of each line of the String based on the input value of n.
### b). String constants
#### Two new interfaces, java.lang.constant.Constable and java.lang.constant.ConstantDesc have been implemented inside the String class.
#### b.1). Optional describeConstable() : returns Optional String
#### b.2). String resolveConstantDesc(MethodHandles.Lookup lookup) : 
## 3). Switch Expressions
## 4). Files.mismatch(): Comparing files
## 5). Compact Number Formatting support