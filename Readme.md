# JBean Management System

>    ```java
>       if(coffeeLover){
>            return ("You will love it")
>        }else if(coder && coffeeLover){
>            return ("This is for you")
>        }else{
>            return ("Try both, you will fall in love with it")
>        }
>    ```

---

## Project Description :

This is an modernized solution implemented for the application of a coffee house. This project leverages the internal implementation and structure of the application as well as an overview of coffee and it’s varieties that is served.
Through the journey of implementation, we would gain an understanding and an overview of the application about how it is developed from the basics by considering the innovative idea and applying it.
As a CS student and developer, the focus throughout the journey is to apply the key concepts of **Object-Oriented Programming** and also adding few innovative idea to create this application.

---

## Features Implemented :

1. Coffee menu with additional information / educational insights
2. Menu management
3. Customer management
4. Order management
5. Console interaction
6. Adding number of coins/rewards based on the quantity of order by the customer

---

## Programming Language :

> **JAVA**

---

## How OOP concepts will be applied :

### Classes and objects :

Classes are the blueprints in OOP. Classes represent different entities that will be used in this project. The different classes are as follows:
**Coffee**, **Customer**, **Menu**, **Order**, etc..
Objects are instances of a particular class. For example If our **Coffee** class has attributes like **name**, **origin**, **flavourProfiles**, **educationalInsights**, etc.. Therefore each object could represent a particular variety of a coffee.

### This pointer :

This pointer is specifically used for pointing the current object. And also it is used in the scenarios where field names and parameter names coincide. 
For example, within the constructor of the **Coffee** class, **this.name * name**; clearly distinguishes between the class attribute name and the constructor parameter name, ensuring clarity and preventing ambiguity.

### Encapsulation :

This concept specifically encompasses protection of data. This data could be data, functions or even restrict access to certain components of the object.
This is often done using the Access-modifiers. 
When set the data with specific access-modifier, the respective data could be manipulated only using public set and get methods which ensures we provide controlled access to the fields.
For example if the fields within the **Coffee** class is marked as private, then the it is only accessible within the class. This clearly encapsulates the sensitive data from the outsiders.

### Inheritance :

This concepts helps us reuse oue code by creating a hierarchical relations between entities that share datas / methods that serves a common purpose in the application. 
For example if **Menu** class lists the information of every variety of coffee available, and is our **Coffee** class uses methods that relates to create the info of a particular coffee. Here in both the classes the common talk is about coffee and each coffee will have the following datas(attributes) like **name**, **origin**, **flavourProfiles**, **educationalInsights**. There for instead of creating these data individually for each class, we could inherit one classes from another and use the datas that is commonly shared.

### Polymorphism :

Polymorphism enables us to treat object of different types to be treated as objects of a common superclass. 
For example, if **Beverage** class has a method **prepare()**, **Coffee** can modify this method and use this method to specify a coffee-specific preparation process. Consequently, calling **prepare()** on any **Beverage** object will execute the appropriate version of the method based on the actual object type.

### Abstraction :

This concept ensures that the complex implementation is hidden and only the necessary details are shown to the end user.
This specifically means that concept focuses on what the object does rather than how it does.
This could be implemented using the abstract classes and interfaces.
For example, if a class has an **abstract** method called **serve()**. Now **Coffee** class and **Tea** class could use the **serve()** method and define if according the individual class. That means the way how a coffee or tea should be served.

---