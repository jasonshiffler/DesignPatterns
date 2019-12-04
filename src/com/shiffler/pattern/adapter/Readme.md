This package is a quick example of the Adapter pattern. In our example we have a method called testDuck() that expects
to work with a Duck. Our Turkey Adapter allows us to use a Turkey instead while eliminating the need to rewrite
either the testDuck() method or our Turkey code. 

Definition - The Adapter pattern converts the interface of a class into another interface the clients expect. Adapter
lets classes work together that couldn't otherwise because of incompatible interfaces.