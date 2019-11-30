This package is a basic demonstration of the factory method pattern. The factory method pattern defines an abstract type
that is able to produce a certain type of object. The factory subclasses each produce different variations of that object
depending on the desired behavior. In this example there is a NY pizza factory that produces NY piazzas while there is
also a Chicago pizza factory that produces Chicago style pizzas, both are subclasses of the PizzaFactory abstract class.
An abstract class is used since some of the implementation should be uniform across all PizzaFactories while other
functionality will be different. The advantage of the PizzaFactory is that we can encapsulate the knowledge of how
to make a pizza in one spot while at the same time allowing for variation via subclassing the factory.

The Factory Method Pattern defines an interface for creating an object but lets subclasses decide on which class
to instantiate. Factory Method lets a class defer instantiation to subclasses.