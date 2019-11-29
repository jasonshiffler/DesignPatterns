This package is a simple illustration of the Observer Pattern at work. It allows a display (the observer) to subscribe to
a WeatherData source(the observable) so it can receive updates whenever the WeatherData source has new
information. This type of design shows the benefits that interfaces allow where two unrelated types
of objects can communicate without too much coupling between them.  

Observer Pattern Definition (From **Head First Design Patterns**)
The Observer Pattern defines a one to many dependency between objects so that when one object changes state, all
of its dependents are notified and updated automatically.