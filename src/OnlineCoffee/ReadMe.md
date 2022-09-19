## ONLINE COFFEE SHOPPING ##

 * The customer can choose whatever she/he wants to buy and can see the cost.

 * The customer can pay Bitcoin, Creditcard, or PayPal.

 * If it’s a lucky hour, which means a discount, the cost will be half.

 > In this situation, I implement codes with 3 design patterns :

   ## Strategy:
    The Strategy pattern allows us to dynamically swop out
    algorithms (i.e. application logic) at runtime. In my scenario, I want the to
    customer can change the payment strategy on runtime.

   ## Decorator:
    It’s a structural design pattern that lets you attach new
    behaviors to objects by placing these objects inside special wrapper
    objects that contain the behaviors. I use this pattern to calculate the total
    cost and get the name of the drink whatever the customer wants.

   ## Observer:
    Observer is a behavioral design pattern that lets you define a
    subscription mechanism to notify multiple objects about any events that
    happen to the object they’re observing. In this scenario, I am using this
    pattern to give notifications to subscribers about lucky hours.


[uml](src/OnlineCoffee/UML.jpg)
