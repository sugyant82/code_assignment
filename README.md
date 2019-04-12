
Project structure divided into below packages
1) base --> com.sugyant.codeassignment.base
The BasicAnimal.java Interface provides the interface for deriving other Animal, Bird and Fish are derived.

Then we have object elements for each subtype of Animal, Bird or Fish


2) actions --> com.sugyant.codeassignment.actions
Different Action interfaces created for FlyingAnimal.java, SingingAnimal.java, WalkingAnimal.java, SwimmingAnimal.java

For each of the above actions, we have various classes implemented like Flyers.java, NonFlyers.java


3) test  -->  com.sugyant.codeassignment.test
This package contains all the Test classes for each of the questions in the code assignment. 


4) helpers  --> com.sugyant.codeassignment.helpers
This package contains helper Enums for determining color and size of the fishes.
It also has the AnimalCount class which holds the logic for the problem on counting the types of animals.
   

5) resouces  --> src/resources/ApplicationMessages  
 it contains the property files with translations for foreingn langusge , which can be extended to any languages.  