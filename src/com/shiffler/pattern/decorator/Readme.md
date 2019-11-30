This package is a simple example of the decorator pattern at work using an example from **Head First Design Patterns**. 
Our object types are different beverage types available at a beverage shop along with the condiments that are put in 
them. If we tried to subclass all the possible combinations we could have we would end up with a class explosion.
We could have created a bunch of booleans such as hasWhip or hasMocha() but this has problems as well. What if we want
a double Mocha? What if we decide to add a new beverage type such as tea where it doesn't make sense to have a Mocha
option? By wrapping the original concrete implementation of beverage in a series of decorator wrappers we can create as
many beverage combinations that we like using just a few bases classes. As Christopher Okhravi points out in his video
series on design patterns that an easier way to solve this problem would be to have beverage just have a list of
condiments that could be added. Reason being is that condiments aren't really beverages and the idea of the decorator
is that it both HAS-A beverage and IS-A beverage. 

-Decorators have the same supertype as the objects they decorate.
-The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible
alternative to subclassing for extending functionality.
