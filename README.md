# Java_String
In the given example only one object will be created. Firstly JVM will not find any string object with the value “Welcome” in the string constant pool, so it will create a new object. After that it will find the string with the value “Welcome” in the pool, it will not create a new object but will return the reference to the same instance.
Note: String objects are stored in a special memory area known as string constant pool.
Why Java uses the concept of string literal?
To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool). 

Using new keyword
String s = new String(“Welcome”);
In such a case, JVM will create a new string object in normal (non-pool) heap memory and the literal “Welcome” will be placed in the string constant pool. The variable s will refer to the object in the heap (non-pool).
Syntax: ![Capture](https://user-images.githubusercontent.com/99464989/230752480-f6f10790-0726-494e-ba7e-dcd2bf15e83e.PNG)
![Capture](https://user-images.githubusercontent.com/99464989/230752495-f2314065-a06b-47f4-aefe-78bba5ff7d0c.PNG)
Memory allotment of String
Whenever a String Object is created as a literal, the object will be created in the String constant pool. This allows JVM to optimize the initialization of String literal.

Example: 

String str = "Geeks";
The string can also be declared using a new operator i.e. dynamically allocated. In case of String are dynamically allocated they are assigned a new memory location in the heap. This string will not be added to String constant pool.

Example: 

String str = new String("Geeks");
If you want to store this string in the constant pool then you will need to “intern” it.
Example:

String internedString = str.intern(); 
// this will add the string to string constant pool.
It is preferred to use String literals as it allows JVM to optimize memory allocation.

An example that shows how to declare a String 
![Capture](https://user-images.githubusercontent.com/99464989/230752516-67a23bf7-7747-4519-9690-7835617967ac.PNG)
Interfaces and Classes in Strings in Java
CharBuffer: This class implements the CharSequence interface. This class is used to allow character buffers to be used in place of CharSequences. An example of such usage is the regular-expression package java.util.regex.

String: It is a sequence of characters. In java, objects of String are immutable which means a constant and cannot be changed once created.

Ways of Creating a String
There are two ways to create a string in Java: 

String Literal
Using new Keyword
String literal
String s = “GeeksforGeeks”;
Using new keyword
String s = new String (“GeeksforGeeks”);
StringBuffer is a peer class of String that provides much of the functionality of strings. The string represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.

Syntax:

StringBuffer s = new StringBuffer("GeeksforGeeks");
StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates an immutable sequence of characters, the StringBuilder class provides an alternative to String Class, as it creates a mutable sequence of characters.

Syntax:

StringBuilder str = new StringBuilder();
str.append("GFG");
StringTokenizer class in Java is used to break a string into tokens. 

Example:
![Capture](https://user-images.githubusercontent.com/99464989/230752534-27503fa3-0015-43fa-abcc-6a3769d53bd3.PNG)
A StringTokenizer object internally maintains a current position within the string to be tokenized. Some operations advance this current position past the characters processed. A token is returned by taking a substring of the string that was used to create the StringTokenizer object.

StringJoiner is a class in java.util package which is used to construct a sequence of characters(strings) separated by a delimiter and optionally starting with a supplied prefix and ending with a supplied suffix. Though this can also be with the help of StringBuilder class to append delimiter after each string, StringJoiner provides an easy way to do that without much code to write.

Syntax:

public StringJoiner(CharSequence delimiter)
Above we saw we can create a string by  String Literal. 

For ex- // String s=”Welcome”; 

Here the JVM checks the String Constant Pool. If the string does not exist, then a new string instance is created and placed in a pool. If the string exists, then it will not create a new object. Rather, it will return the reference to the same instance. The cache that stores these string instances is known as the String Constant pool or String Pool. In earlier versions of Java up to JDK 6 String pool was located inside PermGen(Permanent Generation) space. But in JDK 7 it is moved to the main heap area. 

Why did the String pool move from PermGen to the normal heap area? 
PermGen space is limited, the default size is just 64 MB. it was a problem with creating and storing too many string objects in PermGen space. That’s why the String pool was moved to a larger heap area. To make Java more memory efficient, the concept of string literal is used. By the use of the ‘new’ keyword, The JVM will create a new string object in the normal heap area even if the same string object is present in the string pool. 

For example:

String a=new String(“Bhubaneswar”)

Let us have a look at the concept with a java program and visualize the actual JVM memory structure: 

Program:
![Capture](https://user-images.githubusercontent.com/99464989/230752561-d6073193-773f-446f-a877-f53f6c7dd131.PNG)
![Capture](https://user-images.githubusercontent.com/99464989/230752580-fe5359da-48e8-4c18-8514-366bdc5feda4.PNG)
Note: All objects in Java are stored in a heap. The reference variable is to the object stored in the stack area or they can be contained in other objects which puts them in the heap area also.![Capture](https://user-images.githubusercontent.com/99464989/230752593-a89b4e23-8efd-4783-8a13-918f3cbd38b3.PNG)
![Capture](https://user-images.githubusercontent.com/99464989/230752603-a724d441-bd1c-4eaa-b084-86b4aa241c83.PNG)
![Capture](https://user-images.githubusercontent.com/99464989/230752614-034030b7-655e-4dcc-914e-219a2a4f2063.PNG)
![Capture](https://user-images.githubusercontent.com/99464989/230752633-8a24c255-04c6-4a57-bcec-7c7289e10d1e.PNG)


