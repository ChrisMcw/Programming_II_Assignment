# Programming_II_Assignment


## Programming Guidelines

#### 1. Names representing types must be nouns and written in mixed case starting with upper case
  -  E.g. Person, Vehical, LectureRoom
  
#### 2. Variable names must be in mixed case starting with lower case
  -  E.g. george, myCar, theLectureRoom

#### 3. Names representing methods must be verbs and written in mixed case starting with lower case
  -  E.g. getRegistrationNumber, setRoomCapacity

#### 4. Private class variables should have a underscore suffix
  -  E.g. private static String make_ ;

#### 5. The name of an object is implicit, and should be avoided in a method name.
  -   E.g. myCar.setRegNumber(); rather *than* myCar.setCarRegNumber();

#### 6. Plural form should be used on names representing a collection of objects
  -   E.g. Account[] bankAccounts;

#### 7. Iterator variables should be called i, j, k etc
  -   E.g. for(int i = 0; i < 4; i++) {...}

#### 8. Imported classes should always be listed explicitly
  -   import javax.swing.JFrame; *or* import javax.swing.JPanel ;
  -   *_Not_* javax.swing.*;
  

#### 9. Basic indentation should be 3
  -   Indentation of 3 for each new block.
  -   Blocks should also be aligned to their opening and closing braces
  
###  Correct
```Java
  for(i = 0; i < 4; i++) 
  {                   
  doThis();           
  doThat();           
  }                   
```

###  Incorrect
```Java
  for(i = 0; i < 4; i++) {                   
       doThis();           
       doThat();           
     }                   
```
