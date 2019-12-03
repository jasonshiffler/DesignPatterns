This package is a demonstration of the command pattern. The command pattern encapsulates a 
request as an object which can then be sent as a request or set of requests to another object
which can be executed, logged, queued, or undone. In this example we encapsulate the different steps
required to cook a steak so that the KitchenController only has to call the SteakMaker's execute() method.
The SteakMaker implements the Command interface so it could swapped out with all kinds of other commands
if we wanted to.
