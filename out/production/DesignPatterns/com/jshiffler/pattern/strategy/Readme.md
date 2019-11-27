This package is a quick demo of the strategy pattern. We use a combination of the duck class and behavior classes 
to compose a duck with the behaviors we want. We only need to factor behaviors out of the duck class that aren't common.
All ducks can swim so we leave that as part of the duck class. However, Mallards can fly but rubber ducks can't so the
fly behavior is factored out of the duck class and into a class of its own. If we added fly() to the abstract Duck
class we'd end up with flying rubber ducks which we don't want. If we pushed fly() down to the subclasses code reuse
which be much more difficult to implement.
 
 Design principles
 
 -Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Lets the algorithm vary 
 independently from the clients that use it.
 
 -Composition over inheritance
 
 
 
 
 
 
 