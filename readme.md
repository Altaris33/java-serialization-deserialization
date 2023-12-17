***Serializarion / Deserialization***
===  

# Abstract  

Serialization and deserialization are essential concepts 
in computer science, particularly in programming and 
data transmission. They're primarily about 
converting complex data structures or objects into a format 
that can be easily stored, transmitted, or reconstructed later.

## Serialization  

Serialization is the process of converting an object
or data structure into a format that can be easily stored,
transmitted, or reconstructed. 
It's often used when you need to save the state of an object
to a file, send it over a network, 
or otherwise persist it in a way 
that it can be reconstructed later. 
The serialized data can be in various formats like JSON 
(JavaScript Object Notation), XML (eXtensible Markup Language), binary, or others.

## Deserialization

Deserialization is the opposite process of serialization. 
It involves reconstructing an object 
or data structure from its serialized form. 
This is crucial when you need to retrieve data 
that was previously serialized, 
perhaps from a file or received over a network, 
and then turn it 
back into a usable object or data structure in memory.  

## Implementation  

Serialization and deserialization can be implemented 
in various ways depending on the programming language
and the specific requirements of the application.

For instance, in many programming languages, 
there are built-in or library-provided functions 
to serialize objects to JSON or binary formats. 
These functions take the object as input and convert 
it into 
a serialized form that can be stored or transmitted.

Deserialization works conversely. It takes the serialized
data and reconstructs the original object or 
data structure from it. 
This process often involves parsing the serialized
data and mapping it back to the appropriate object types
or data structures.  

Below are the various implementations provided by this 
module.  

### Java Standard Implementation  

In this simple Java application 
we demonstrate serialization and deserialization 
of book data. For this example, 
we create a `Book` class, 
serialize an instance of this class, and 
then deserialize it back to demonstrate the process.  

See `src/main/java/fr/captain/Main`.  
