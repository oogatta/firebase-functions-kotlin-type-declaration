# Current files

  - ABSOLUTELY PRIMITIVE, CREATED MANUALLY just for my own purpose.
  - firebase-admin's definitions use lots of imports. ts2kt@0.0.12 can't handle those.

# Make jar

```
$ gradle jar
```

# Use


```gradle
dependencies {
    testCompile "org.jetbrains.kotlin:kotlin-test-js:$kotlin_version"
    compileOnly files("typings/firebase-functions-kotlin-type-declaration.jar")
}
```
