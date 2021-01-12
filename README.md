# TestNGFramework
This repository is about a testNG framework template. 

In this framework, following structure is used:

1. `TestBase class`: In this class, before and after methods exist. Other test classes should be extended from this class so that all of them have before and after configurations so that no need to write seperately for each of them. (inheritance OOP concept)
2. `xml runner`: Tests should be executed through this file. In this file, classes, methods or packages can be specified to be executed. So for different type of tests, different type of runners can be used. Based on need, structure can be manipulated. 
3. `resources folder`: Under this folder, some resource files can be stored to feed test cases. For example it can be excel or txt file where you store cookies information or a user list to make a Data Driven Test with dataprovider. 

 
`Dataprovider`: This feature is a powerful feature of TestNG. With the help of this, we can make Data Driven Test. Data Driven Test is a test where the same test case can be executed with different data set for each time without disturbing the other one. Test cases are isolated from each other, it means that failure for one test does not affect the following one. 
