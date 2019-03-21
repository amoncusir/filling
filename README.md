# Filling #

The ultimate (in a no far away future) library for generate and fill data classes in testing methods!

For now, not a ultimate library, is a simple deserialization library for a make instances of Data classes using other
libraries like `Gson` or `Jackson` or any serialization library. 

## How to use?

The first step is create your json files. The default path is in path `resources/entities` in classpath context.

For example, make this file like:

```json
{
  "name": "Tomás",
  "surname": "Turbado",
  "age": "96"
}
```

with name: `foo_Person_tomas.json`

and this object:

```kotlin
data class Person(val name: String, val surname: String, val age: String)
```

> NOTE: The serialization limit is imposed by serialization library. If you using `Jackson`, for example, need
> configure it for use serialization with constructor.

Now, you can fill the `Person` class, like:

```java

class FooTest
{
    private static final Filling FILLING = Builder.filling();
    
    @Test
    public void testFoo()
    {
        final Person person = FILLING.fill(Person.class, "foo", "tomas");
        System.out.println(person.getName());
        
        // print: Tomás
    }
}
```

## Future releases

In a future, we want add very interesting features, like auto-generation classes using a simple rules,
add more flexibility in `ResourceLoader` and `ResourceSerializer` and much more!
