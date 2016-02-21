# Anagrams 
Two words are defined as anagrams if they do share the same letters, but are in a different order (i.e. the english words "race" and "care" are anagrams).

This Program read words from "sample.txt" file construct a list of all anagrams from it and prints it on the console, where all words that are an anagram are on the same line.
#### For example, given the input file:
```act
cat
tree
race
care
acre
bee
```

#### Output Would Be
``` 
act cat
acre care race
```
### Code Quality
The development has been carried out with Test Driven Development with 97% code coverage.
![alt tag](https://github.com/akhileshkshatriya/anagrams/blob/master/code-coverage.png)
### Instruction.
* To Run the application
 * Make sure you have Java 8.
 * Download "anagram-resolver.jar".
 * Open console/Terminal and execute ```java -jar anagram-resolver.jar``` to run the program.

* For Developers
 * Make sure you have Maven installed.
 * It uses maven assembly plugin to generate am executable jar, The jar could be generated with Maven command ```mvn clean compile assembly:single```
 * Cobertura plugin has been used to generate code covergae report, The report could be reproduced with maven command ```mvn clean cobertura:cobertura```

### Performance and Design
* Little part of the Application is inspired by Spring Framework.
* As far as performance is concerned the application is tested with the input file containing 250 K records, it prints output only in milliseconds.
* The design is scalable and extendable with implementing Reader and using parallelStream in Anagram.
* If want to read files in GB’s a new Reader could be implemented using Java NIO - Memory mapped file
