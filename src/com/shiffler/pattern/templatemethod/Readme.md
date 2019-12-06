This package is a demonstration of the template method pattern. The template method pattern defines the skeleton of an
algorithm within a method deferring some steps to subclasses. Template Method lets subclasses redefine certain steps
of an algorithm without changing the algorithm's structure. The weakness of the Template Method is that it assumes the
main algorithm won't change or if it does it will have to be changed for all subclasses unless they override the 
algorithm which introduces problems of its own. This is part of the weakness of using inheritance instead of composition.
