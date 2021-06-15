Classes define what an object knows and what an
object does.
Things an object knows are its instance variables
(state).
Things an object does are its methods (behavior).
Methods can use instance variables so that objects
of the same type can behave differently.
A method can have parameters, which means you
can pass one or more values in to the method.
The number and type of values you pass in must
match the order and type of the parameters
declared by the method.
Values passed in and out of methods can be
implicitly promoted to a larger type or explicitly cast
to a smaller type.
The value you pass as an argument to a method
can be a literal value (2, ‘c’, etc.) or a variable of
the declared parameter type (for example, x where
x is an int variable). (There are other things you
can pass as arguments, but we’re not there yet.)
A method must declare a return type. A void return
type means the method doesn’t return anything.
If a method declares a non-void return type, it must
return a value compatible with the declared return
type.