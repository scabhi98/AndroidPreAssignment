# Runtime Polymorphism

## Why its possible to call ```converter.convert()``` method on its subclass instances?

Since, ````Thermometer, Thermocouple, ShaftLog, PitotTube```` are the classes who implemented the ```Converter``` interface, hence they can be upcasted so that a Converter type reference can refer each of them. Basically they are a Converter type objects too. Again,  ```Object convert(Object)``` method is declared in Converter interface so calling it on Converter type reference is legal whose actual implementation is linked at runtime depending on the type of real object to which  ```converter``` is referring. Following code segment is good to go.

```java
Thermometer thermometer = new Thermometer();
Converter converter = thermometer;
converter.convert();
```

## Why calling ```converter.isHot(1.0)``` or  ```converter.isFast(1.0)``` fails?

Though ```converter``` is referring to ```thermometer``` or ```pitotTube``` calling ```converter.isHot(1.0)``` or ```converter.isFast(1.0)``` will fail in respected conditions. Since, ```isHot``` and ```isFast``` method are not declared in scope of Converter interface. During compilation method binding looks for the method declaration in scope of reference type rather than the scope of actual type, so compiler don't allow calling an undeclared function, it will cause a Compile time error.

```java
// converter.isHot();           Compilation Error
PitotTube pitotTube = new PitotTube();
converter = pitotTube;
// converter.isFast();          Compilation Error
```

## Why typecasting make it possible to call these functions?

Downcasting ```converter``` to ```Thermometer``` or ```PitotTube``` type forces compiler to treat the referred object as casted type object.

```java
converter = thermometer;
((Thermometer) converter).isHot();
converter = pitotTube;
((PitotTube) converter).isFast();
```
In above code segment a temporary reference of Thermometer and PitotTube is created, object referred by ```converter``` is casted to these subclasses to gain the access to the subclass specific functions, now compiler finds declaration of called method in the scope referred object, and compile time error resolves and we are good to go for the execution. The actual method definition is linked with the call at runtime, determined by the type of object i.e. what the actual object's implementation for the method call.
    During typecast compiler trusts on the programmer for the compatibility of actual type of object and the type of reference on which object is to be assigned.
But suppose programmer do mistake like,

```java
converter = thermometer;
((PitotTube) converter).isFast();
```
this mistake cannot be caught in compilation as the type casting and assignment is completely legel. But during execution when the actual typecasting is being carried out, program will face a problem to cast the Thermometer to PitotTube type as they are not type compatible and an exception  ```ClassCastException``` will be thrown.

To be safe with these errors often typecasting is checked in java with ```instanceof``` operator as

```java
if(converter instanceof PitotTube)
    ((PitotTube) converter).isFast();
```

Thank You.
Please reply if something is found incorrect or inappropriate.
