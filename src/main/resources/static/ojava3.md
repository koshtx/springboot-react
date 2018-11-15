=== Java ===
 

Which is a valid primitive data type in java?

- Long

- double ***

- BigInt

- Integer

 

Which of the following is a legal declaration of "main" method that can be run from the command line?

- public static void main(String... args) **

- public static void main(String args[]) ***

- public static void main(String[] args)

//- public static main(String[] args)

//- public void main(String[] args)

//- private static void main(String[] args)

//- public static void main(String[] public)

//- static void main(String[] args)

 

Which of these statements is FALSE about Abstract Classes?

- Abstract classes are exactly the same as interfaces ***

- Abstract classes are always public ***

//- Abstract classes cannot be instanciated

//- Abstract classes can have class attributes

//- Abstract classes can have implementation

//- Abstract classes are useful to group general functionality of a group of objects

 

Given below code, which of the following statements is true?

import static java.lang.System.out;

public class ImportingSystemOut;

{

    public static void main(String... args)

    {

        out.println("Hola!");

    }

}

- The code will print “Hola!”. ***

- Static imports allows to reference the static methods of the imported class. ***

//- There will be a compilation error.

//- You don't need to reference "out". Correct syntax is: println("Hola!");

//- This code will fail to compile due to invalid declaration of main.

//- The code will fail to compile due to invalid class name.

//- Use of out.println(); in this context is invalid.

 

Given below code, which of the following statements is true?

public void myMethod() {

    Object myFirstObject = new Object();

    System.out.println("I created my first Object: )");

}

- Heap ***

- Stack

- Entry queue of Garbage Collector

- In the Process Virtual Memory within the Java Virtual Machine

- In the object reference stack
 

Given below code, which of the following statements is true?

public class ValidEntryPoint

{

    public static void main(String[] Public)

    {

        System.out.println("Compiles!");

    }

}

- You can use anything instead of args as long is not a reserved word.***

- This code output is "Compiles!".

- Java is case sensitive so it’s ok to use “Public” as a variable name (but highly discouraged!). ***

//- "Public" is a reserved word.

//- You always need to use String[] args

//- The code won't compile due to an invalid declaration of main

//- Runtime error.

//- Compilation error.

 

Given below code, which of the following statements is true?

public class ConcatenationRules;

{

    public static void main(String args[])

    {

        System.out.println(1 + "2" +3);

    }

}

- The output will be a String ***

- Output will be 123. ***

- Java will interpret binary operator “+” as concatenation. ***

- it will evaluate as integer.

- The "+" operator it's only valid for integers.

- There will be a compilation error.

- 42

- Output will be 6

 

Given below code, which of the following statements is true?

public class StringFun

{

    public static void main(String[] args)

    {

        String s1 = "Hola Mundo";

        String s2 = "   Hola Mundo   ".trim();

        System.out.println(s1 == s2);

    }

}

- false. trim() method creates a different String object. ***

- Even when content is equal "==" needs to be exact same object to be true **

- s1 and s2 will not be referencing the same object. ***

- true

- The content is the same so will be pointing to the same object in the String pool.

- The correct method to get a boolean comparation is compareTo();

- "==" is the best method to compare String content.

//- String pool will have only one object referencing s1 and s2.

 

 

Considering the following java code:

public class A {

   A a = new A();

}

Which of the following statements is true?

- The instance of the class will get created but the reference will not be returned to the caller due the implicit infinite recursion. ***

- The application will crash with stack overflow due the implicit recursion of the constructor. ***

//- The class will get instantiated without problems.

// - The class will not get instantiated due a compilation error because statements cannot be outside of method bodies.

// - The class will get instantiated but we will get an execution error once the instance gets consumed.

//- The class will get instantiated but it will throw a ClassNotFoundException due not having the explicit construcutor.

//- The class will not get instantiated due a compilation error because the lack of explicit constructor 

 

Considering the following java code:

public static void main(String args[]) {

    String myFirstString = "Hello";

    myFirstString.concat(" From Oracle");

    //Let's see what we got

    System.out.println(myFirstString);

}

Which of the following statements is true?

- myFirstString cannot changed once is defined during the program execution ***

- The concat() operation creates a new String in memory ***

//- The concat() operation alters myFirstString during the program execution

//- The program prints " From OracleHello"

//- The program prints "Hello From Oracle"

//- concat() is incorrect, should be append()

//- There are just 2 strings created during the program execution

 

Given below code, which of the following statements is true?

public class HouseWords

{

    public static void main(String[] args)

    {

        int house = 5;

        switch(house)

            {

            default:

            System.out.println("House words");

            case 1:

            System.out.println("Fire and blood");

            case 2:

            System.out.println("Hear my roar");

            case 3:

            System.out.println("Winter is coming");

            case 4:

            System.out.println("Ours is the fury");

            }

    }

}

- House words Fire and blood Hear my roar Winter is coming Ours is the fury ***

- There are several missing break; statements. ***

- It will go to default execute all cases as there is no break; in any of them. ***

- The code won’t compile as there is a missing “=” between “case” and each number.

- The code won’t compile as there is a missing “==” between “case” and each number.

- Output will be: Ours is the fury.

- Fire and blood \r\nHear my roar\r\n Winter is coming\r\n Ours is the fury\r\n House words.

 
ññññ 

===Algorithms===

Which of the following options are more likely to degrade query performance

//- Indexes

//- Left joins

- Subqueries ***

//- Right joins

- Stale statistics ***

//- Inner joins

 

Complexity of linear search algorithm is?

- O(n) ***
- O(2n) ***
- O(n/2) ***
- O(e^n)
- O(1)
- O(n!)
- O(n^2)
- O(log n)
- O(n log n)

 

What is the worst case complexity of the bubble sort algorithm?

- O(log(N))

- O(2^N)

- O(N.log(N))

- O(N^2) ***

- O(N^3)


What is the best case complexity for the bubble sort algorithm?

- O(N.log(N))

- O(N) ***

- O(2^N)

- O(log(N))

 

The worst case occurs in linear search algorithm when?

- Item is not in the array at all. ***

- Item is the last element in the array. ***

- Item is in the middle of the array.

- Item appears more than once in the array.

- Item is the first element of the array.

- Item is the second element of the array.

 

What is the worst case of the bubble sort algorithm? (sorting integers in ascending order)

- The order is reversed. ***

- The array is sorted in descending order. ***

//- Every values in the array are the same.

//- The array is already sorted in ascending order.

//- There are duplicates numbers in the array.

//- The array has more than 10^12 elements.

//- The array has negative numbers.

//- The sequence of numbers in the array is not monotonic.

 

Assume you have an array of size 100 populated first with n zeroes and then with 100-n 1s. What search algorithm would you use to find the first instance of the number 1 in the most efficient way? Example of an array [0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1]

NOTE AN IMPORTANT LIMITATION: The pogram will END when you find the FIRST 1

- Start from the last element and move towards the first one element at a time.

- Do an iterative search using steps of size 2

- Check element by element

//- Binary search

 

Given the array X = {2,7,5,3,0,1,9,4,8,6}, what number is in the correct position after the first iteration of the Quick Sort algorithm, if the last element is the pivot.

- 1

- 3

- 6 ***

- 0

- 5

- 9

//- 8

- 7

 

You have an array of integers, both positive and negative.

I will give you a number that can be either positive or negative and I will ask you to tell me if any two numbers in the array add up to that number.

What is the fastest way to obtain the pair of numbers that add up to the number specified?

Eg. [1,2,83,100,-99] and the number given is -16 the answer is the pair of numbers is 83 and -99.

//- Sort the list before starting to iterate through the list to make it simpler.

- Use a dictionary where the key is the number on each position in the array and the value is the substraction of the number and the value in the array.

- Use two FOR loops but starting the second one after the current index to reduce the search space and find the pair faster.

- Use two FOR loops to iterate all possible combinations of numbers to find the first correct pai

 

Assume a method that given a set of n elements it computes all its subsets. Which of the following statements is true?

//- if N=10 it returns 10^2 subsets. ***

- the method computes all the ordered combinations of the set and discards duplicates ***

//- the method returns all the permutations of the set

//- the method returns all the combinations of the set

//- if N=10 it returns 10^N subsets.

//- it returns 2^n subsets including the empty set.

//- if N=0, it returns 0.

If n=10, it returns 1023 non-empty subsets plus the empty set.

 

Assume a method that given a set of n elements it computes all its subsets. Which of the following statements is false?

- The method computes all the ordered combinations of the set and discards duplicates.

- If N=10 it returns 10^N subsets. ***

- If n=10, it returns 1023 non-empty subsets plus the empty set.

- If n=0, it returns the empty set.

 

Given the array X = {2,7,5,3,0,1,9,4,8,6}, What element is in the correct position before doing the last merge in the Merge Sort algorithm?

- 6

- 7

//- 0

//- 4

//- 5

- 3 ***

 

Given the array X = {3,4,1,2,7,6,5,9,8,0}, what number is in the correct position after the first iteration of the Bubble Sort algorithm (ascending order) ?

- 0

//- 3

//- 6

- 9

 

//- 6

- 7

- 2

- 8

 

If you build a max heap at the same time you read the following numbers: {2,7,5,3,0,1,9,4,8,6}. What number is a leaf node?
//- 4
- 2
- 9
//- 7

//- 7
- 9
- 8
- 3

- 6
//- 4
//- 7
- 1

- 8
//7
- 5
//- 4
 

Which of the following sorting algorithms has a space complexity of O(1)?

- Selection sort ***

- Bubble sort ***

- Radix sort

- Cube sort

- Tim sort

- A*

- Counting sort

 

Which of the following sorting algorithms has the best time complexity in the worst case?

- Merge sort ***

- Tree sort

- Insertion sort

- Quick sort

 

Which of the following sorting algorithms has the worst time complexity in the worst case?

- Insertion sort ***

- Bubble sort ***

- Merge sort

- Shell sort

- Radix sort

- Cube sort

- Heap sort

 

Which of the following sorting algorithms has a O(n^2) complexity?

- Insertion Sort ***

- Postman Sort

- Counting Sort

- Heap Sort

 

Which of the following sorting algorithms has a worst case complexity of O(N^2)?

- Shell sort

- Tree sort ***

- Merge sort

- Heap sort

- Insertion sort ***

- Radix sort

 

Which of the following sorting algorithms has a worst case complexity of O(N.log(N))?

- Merge sort ***

- Heap sort ***

- Insertion sort

- Radix sort

- Bubble sort

- Quick sort

 

Which of the following sorting algorithms has the least space complexity?

- Shell sort

- Quicksort ***

- Radix sort

- Bucket sort

 

The following is true about Big O notation...

- it's also called 'asymptotic notation' ***

- Widely used as way to classify algorithms according to its complexity ***

//- the name Big O is a short name for 'Big Omega'

//- O(n) and O(m) are considered different complexities

//- O(n) describes an algorithm that will execute in the same time always

//- Big O notation cannot be used to classify an algorithm space complexity

//- O(1) describes an algorithm whose performance will grow linearly

 

What is a key property of hash tables?

- It should have a collision resolution mechanism ***

- It was invented during the WWII period by Alan Turing

- It is basically the same as a two-dimensional array with collision handling

- It uses a linked list internally to store the elements

 

Assuming a modular hash strategy for storing n values in a hash table of m buckets, which of the following key lists L has at least one collision?

- m=16 L=[0,11,12,13,14,15,16] ***
- m=8 L=[0,5,16,18,31,49] ***
//- m=10 L=[1,2,3,4,5,6,7,8,9,10]
//- m=13 L=[0,14,15,16,17,20]
//- m=15 L=[15,31,18,49,5,21]
//- m=16 L=[11,12,13,14,15,16,17,18]
//- m=20 L=[1,2,3,4,5,6,7,8,9,10]
 

Suppose a modular has strategy for storing n values in a hash table of m buckets such that n>m.

What is the look up complexity in such a case?

- O(n/m) ***

- O(n*log(n))

//- constant

//- O(hash(n))

 

- linear *

/- O(1)

 

Suppose a modular hash strategy for storing n values in a hash table of m buckets such that n<=m. Assuming there are no collisions.

What is the look up complexity in such a case?

/-linear

-constant **

/-O(log(n+m))

//-O(m/n)

- O(1) ***

//- O(n/m)

//- O(hash(n)+hash(m))

 

Which of the following complexity are the same?

- O(n) and O(sqrt(n))

- O(n^2) and O(n^2+n+1) ***

- O(n) and O(1)

- O(3n^4+2) and O(2n^3)

- O(1) and O(log(n))

- O(3n^3+n+1) and O(2^n)

 

int a=0,b=5;

How would you swap the values without a temp variable or additional memory?

- a=a+b; b=b-a; a=a-b;a

- a=a+b; b=a-b; a=a-b; ***

- It can't be done

- a=b=a;


Suppose a modular hash strategy for storing n values in a hash table of m buckets such that all the n values are being stored in a single bucket.
What is the look up complexity in such a case?
- O(n^2)
//- O(1)
- linear
- constant

ññññ

=== CS General Knowdlege ===

 

Define recursion

- Recursion is a technique where a function call itself to perform a task, normally there is a base case to terminate the loop. ***

- Recursion is a method to solve a problem with smaller instances of the problem, Binary search is an example of recursion. ***

- Recursion is a method to iterate repeating a a process over and over again to solve it.

- Recursion is a technique where a function DOESN'T call itself to run.

// - Recursion is a technique to iterate over elements with the help of a counter.

// - Recursion is a technique used to repeat things infinitely.

// - Recursion is a method to solve problems without dividing it into sub-problems.

 

Which of the following statements is FALSE in regards to code refactoring?

// - Code refactoring is useful to detect hidden bugs and vulnerabilities.

- If code refactoring is not performed properly new bugs can be introduced affecting functionality.

- Is a method to rapidly add new functionality to a existing code base.

//- Is a technique to reorganize and and simplify code.

 

What is Version Control?

- Is a Software Management technique used to manage changes in code, software and websites. ***

- Is a method to review and organize source code versions, this is used to maintain code and update documentation. ***

- Is a management procedure to deprecate code preventing intervention from other developers.

- Is a management technique used to prevent Version Merging.

- Is a technique to split code and merge it.

- Is a method to overwrite useless code.

 

Which of the following statements describe what is a reserved word?

- Those words which already have prior meaning in a language and cannot be as the name of a variable. ***

//- Reserved words are commonly used to support primitive types and assign values to variables.

//- Reserved words can be used as an new variable name as the system will understand the context

//- Reserved words are those that top developers like the most, so others should not use them.

//- The programer can reassign their value.
//- Reserved words usually are used as labels
- Is a word that can't have another meaning than the meaning it has by default depending the programing language. ***

 
Which of the following statements describe a process in Linux ?
//- A process is a thread of a directory that runs only over itself. Process can't have multiple threads.
//- A process don't have threads of execution
//- Every process shares memory space
- Each process has it's own memory space. To share data among processes, they should communicate through something called messages. ***
//- A process can contain only one thread of execution. Memory is shared among process
//- Process are environment variables only executables in the "current working directory"
- A process is a instance of a program that runs in the system. An application can have several processes to perform different tasks. ***


In Linux what is a shell?

- Normally a shell is a command based (Or commonly called "command interface") e.g. CSH(C Shell) ***

- A shell is a program which is an interface to interact with the operating system, an example of a shell is BASH (Bourne Again Shell) ***

- Normally a shell is a regex based command line (Or commonly called "command RGX") e.g. RSH(Regex Shell)

- A shell is a program which encapsulates operating system functions, an example of a shell is BOSH (Bounce Operations Shell)

- All shells must have a Graphical User Interface (GUI)

- A shell is a program which is an interface to cast data an example of a shell is CASH (Cast Again Shell)

Which of the following statements describe what is a "shell script" in Linux?
- A shell is thread system that allows the user to keep data tracking
- A shell script is a file with java commands that complete a task by recursion
- A shell is a documento holder in the "home" directory
- A shell script is a file that contains shell commands that run one after another to complete a task ***

 
Considering that a set is a collection of unique elements where order doesn't matter and that the union of two sets gives as a result the set containing all elements of both sets. What is the result of the union of { 12, 4, 3 } and { 1, 3, 8, 9 }?
- { 12, 4, 3, 1, 8, 9 } ***
- { 1, 3, 8, 9 }
- { 12, 4, 1, 8, 9 }
- { 12, 4, 3, 1, 3, 8, 9 }

Define modularization.

- Modularization is a method to divide software in order to manage functionality. ***

- Is a consequence of bad development in large teams.

- Modularization is used to combine all the code in a application to a single file.

- Modularization is a method to divide code on a system to increase algorithmic performance.

- Modularization is a technique to assign specific routes.

 

Which one of the following assumptions you have to consider in order to design the security of a distributed system?

- The attackers will not have access to all the code and algorithms at all time.

- All the interfaces of the system can be or already are exposed. ***

- As long as the encrypting keys are not compromised, there is no need to reinforce security on the communication channel infrastructure.

- Only a subset of interfaces from the system are exposed.

 

Which could be a key challenge when designing and developing a distributed system?

//- Centralization of the workload coordination.
//- Amount of shared memory.
- The operating system to be used.
- Reliability during operation.

- Power consumption.
- Transparency of workload and resources involved.
//- Centralization of the workload coordination.
- Processing throughput.

 

Which commands are used to set file permissions in Linux?

- "chassign" (Change Assignation)

- "chgrant"(Change Grant)

- "chuser" (Change User)

- "chown" (Change Ownership) ***

 

Given

a=12

b=8

Whats the output of performing the following operation: ((a>>1) XOR b )

- 4

- Fourteen ***

- Thirteen

- 2

 

What is difference between Semaphore and Mutex?
- A mutex object only allows one thread into a controlled section, forcing other threads which attempt to gain access to that section to wait until the first thread has exited from that section. ***
- Mutex is a object owned by multiple threads. so there is a ownership in mutex. Mutex allow multiple threads to access resource. ***
//- Mutex is a object owned by thread. so there is a ownership in mutex. Mutex allow multiple threads to access resource.
//- When mutex object is held by thread 1,If thread 2 tries to access shared resource by accessing mutex object then thread-2 attempt's to take mutex will have access.
//- Mutex is n-member access to a resource on the other hand a Semaphore is exclusive-member access to a resource.
//- Mutex is a object owned by thread. so there is a ownership in mutex. Mutex allow only one thread to access resource.
 

Which of the following statements describe the difference between a thread and a processs?

- A thread is always inside a process ***

- Processes share always memory but threads doesn't

- There's no relationship among them

- A thread can't be inside a process

 

Consider a simple microprocessor pipeline implementation with an always-zero branch prediction.

Consider the following pseudo code:

myResult = 0;

for (myVar = 0; myVar < 20; myvar=myVar)

{

    if(isPrimeNumber(myVar))

    {

        print("Hello prime number");

    }

}

What sentence is true regarding the code execution within the processor.

- Considering the code from lines 5 to 9, the pipeline assert on its execution 8 times during the loop.

- During the loop, the program counter will always return to the instruction corresponding to line #2

- The increment of myVar involves just 1 register during the calculation.

- Considering the code from lines 5 to 9, the pipeline will have to be flushed out due to wrong branch 8 times

 

Which is the output of the following function for the input string "analysis"?

private static String foo(String w){

if(w==null)

return "";

if(w.length() == 1)

return w;

return w.charAt(w.length()-1)+foo(w.substring(0,w.length()-1));

}

- It goes into an infinite recursion state.

- "sisylana" ***

- It throws a runtime error.

- "analysis"

 

What's the output of passing the parameter, num = 4, to the following method?

int foo (int num){

if(num<=1){

return 1;

}else if (num%2==0){

return foo(num>>1)*num;

}

else

return foo(num-1)*num;

}

- 60

- 12

- 16

- 8 ***

 

What has more 'Pizza'A 18 inch pizza or two 12 inch pizzas?

//- Both have the same amount of pizza

- Two 12 inch pizza have less 'pizza' than a 18 inch pizza

- A 12 inch pizza has more pizza than a 18 inch pizza

- They can't be compared

 

Which of the following concepts is a key characteristic to define an instruction Set Architecture (ISA) for a computer?

- Supported operations

- Capacity of the cache involved in the instructions

- Capacity of the memory map for the instructions

//- Number of instructions

 

Which benefit does it bring multicast communication to distributed systems?

- Faster propagation of event notifications.
//- More efficient consumption of network resources.
- Better performance through non-replicated data.
- More robust resource redundancy.

//- More efficient consumption of network resources.
- Better performance through non-replicated data.
//- Better capacity to handle incoming requests.
- On redundant systems, more fault tolerance vs single cast communication to a single destination.

- More robust resource redundancy.
- Faster propagation of event notifications.
- Better isolation of failure events.

- On redundant systems, more fault tolerance vs single cast communication to a single destination.
//- Better capacity to handle incoming requests.
//- More efficient consumption of network resources.
- Better isolation of failure events.
 

Which of the following regular expressions validates a number with decimals (i.e: 0.5, 99.4, -5.6, 0.0 and not .3, -1, .)

- ^-?[0-9]+\.[0-9]+$ ***

- ^-?[0123456789]+\.[0123456789]+$ ***

- ^-?[0-9][0-9]*\.[0-9][0-9]*$ ***

- ^-?[1-9]+\.([1-9])$

- ^-?[0-9]*\.[0-9]*$

- ^-?[0-9][0-9]+\.[0-9][0-9]+$

- ^(-?[0-9])+\.[1-9]+$

Which of the following regular expressions validates an integer number?
i.e. 10,-5,0,999
but not 1-1,0.9 or an empty string
- ^-?[0-9][0-9]*$ ***
- ^-?[0-9]*$
- ^-?[0-9][0-9]+$
- ^(-?[0-9])+$
- ^-?[1-9]+$
- ^-?[0-9]?$

Let be

"v = OR"

"^ = AND"

"~ = NOT"

"<=> = EQUIVALENCE"

"=> = IMPLICATION"

 

Given the following facts:

1)p => q

2)r => s

3) ~q ˅ ~s

Which of the following is a valid conclusion?

// - ~p => r

// - ~p ˅ r

// - p ˅ ~r

- ~p ˅ ~r ***

 

// - p ˅ ~r

// - ~p ˅ r

- r =>~p

// - ~r =>~p

 

Given the following facts:

1)p => q

2)r => s

3)p ˅ r

Which of the following is a valid conclusion?

- p => s

- ~q => ~s

//- ~(q ˅ s)

- ~q => s

 

Given the following facts:

1) p=>q

2) q=>r

Which of the following is a valid conclusion?

- p=>~r
// - ~p ˅ ~r
- ~r=>~p
// - r=>q

- ~q ˅ r
- ~q => r
// - ~p ˅ ~r
// - r=>q

- p=>~r
//- r=>p
- ~q ˅ r
//- r=>q
 

Assuming the bit-wise AND operation represented by the operator '&' and an integer n, what is needed for the following expression to return true:

if( (1 & n ) == 0 )

then true;

else return false;

- Checks if the less significant bit is set to 0 ***

- Checks if n has more than one bit set to 1

- Checks if n is equal to zero

- Checks if n is not a power of 2

- Checks if n is odd

 

Assuming the bit-wise AND operator represented by '&' and an integer n, what does the following expression do?

( 1 & n ) != 0

- Checks if n is greater than zero

- Checks if the less significant bit is set to 0

//- Checks if n has more than one bit set to 1

- Checks if n is not even

 

Given the following grammar:

Statement -> Operand Operator | Operand | ; Statement | EOF

Operand -> [a-zA-Z]+([0-9]*[a-zA-Z]*)*

Operator -> ++ | -- | + | = | -

Which of the following inputs is syntactically correct?

- ; ; ***
- variableOne + variableTwo ; ***
//- variable1 - variable2 ; variable2++;
//- variableOne += variableTwo ;
//- a = B ; C++ ;
//- myVariable--;
//- ++10myVariable;
//- myVariable++; 
//- variableOne + 2variableTwo ;
//- ++myVariable ;


Consider the following:

+You have a CPU with an internal cache with a capacity of a DWORD (32 bits).

+Each cache load operation is filled by a complete DWORD only.

+There are two programs (A and B) that access each byte of an 80 bytes array.

+Program A access the bytes in sequence and program B access them in random order.

+Both programs are executed separately.

Which of the following sentences is true:

- The program A will execute faster than program B. ***

- The cache capacity will impact the speed of program B execution. ***

- The program B will execute slower than program A ***

//- Both cache and pipeline capacity will impact the speed of program B execution.

//- Considering Out of Order execution there will not be a difference between both programs.

//- The program B will execute faster.

//- Both programs will execute at the same speed.

//- The number of pipeline stages will affect the speed of program B execution as well.

 

Consider the following:

+ You have a CPU with an internal cache with a capacity of a DWORD (32 bits).

+ Each cache load operation is filled by a complete DWORD only.

+ There are two programs (A and B) that access each byte of an 80 bytes array.

+ Program A access the bytes in sequence.

+ Program B access the bytes by multiplexing between the first and the last indexex of the array until it converges at the half of the same.

+ Both programs are executed separately.

Which of the following sentences is true:

 

Considering the following pseudo code:

2 TypeA myVariable_A = "Hello";

4myMethod()

5{

6   TypeA myVariable_B;

7   TypeA myVariable_A;

8

9   myVariable_A = "World";

10   print myVariable_A;

11}

12

13print myVariable_A;

 

Which of the following sentences is true?

//- Assuming scope handling during semantic analysis, the prints after program execution will be "World" and "World".

//- Considering scope handling during semantic analysis, the declaration on line # 6 would throw an error.

- Assuming scope handling during semantic analysis, the prints after program execution will be "Hello" and "World".

- Assuming scope handling during semantic analysis, the prints after program execution will be "Hello" and "Hello".

 

- The assignation on line # 9 will definitely override the contents of the variable declared on line # 2.

//- If the semantic analysis didn't considered scope, then line # 7 would throw a compilation error. ***

 

 

A valid way to optimize a microprocessor cache could be...

//- Adding address translation on the fly during cache indexing.
- Reduce cache size to reduce miss rate.
//- Reduce number of levels of cache to reduce miss penalty.
- Expand cache block size to reduce miss rate.

- Increasing processor clock rate to reduce miss rate on cache.
- Increase register size to release cache load.
- Expand cache size to reduce miss rate.
 

In Linux the local variable "$TEMP" What is it for?

//- Stores all the TIMESTAMPS
- Stores the path of the home directory
//- Gets the historical record of all the activity on the system
//- Starts a time counter to evaluate the performance of a process

//- Stores all the TIMESTAMPS
- Stores the path of the directory for temporarily storing things.
- Rolls back an action
//- Starts a time counter to evaluate the performance of a process

//- Starts a time counter to evaluate the performance of a process
- Rolls back an action
- Stores the path of the directory for temporarily storing things.
//- Stores all the TIMESTAMPS
 

Let be X and Y two binary numbers in 8 bits represented in 2's complement. If X=0xBA and Y=0x33, which one of the following values represents Y – X?

- 171 Base 8 ***

- 172 Base 8

- 0x97

- 0x67

- 0110 1101
 

Let be X and Y two binary numbers in 6 bits represented in 2's complement. If X=0x2F and Y=0x3, which one of the following values represents X + Y?

- 0x30

- 60 Base 8

- 40 Base 8

- 011100

- 62 Base 8 ***

- 110010 ***

Let be X and Y two binary numbers in 4 bits represented in 2's complement. If X=0xA and Y=17 Base 8, which one of the following values represents X – Y?
- 0xB
- 15 Base 8
- 0XC
- 1011 ***

One key concept for the synchronization of any given distributed system is...
- The speed of the microprocessors of each node.
- The amount of memory used during the operation.
- The clocks required for the timing. ***
- The redundancy of the resources involved. 

One key characteristic of the peer-to-peer systems could be...

- All the interactions and transactions are meant to be 100% anonymous.

- All the nodes have visibility on all its peers in order to facilitate data localization.

- The operation of each node does not depend on any kind of centralized management system. ***

- The operation of each node relies on a centralized management system.

 

Assume an algorithm that verifies if there are duplicates in a list of 2 million of positive integers. There are (2^³¹)-1 possible different integers. The algorithm uses the bit-wise approach to represent every possible integer as a BIT. if the algorithm uses an array of longs (64 bits) as the BIT holder. How many longs would we need in the array?

//- 1,000,000
- 33.5 x 10^⁶
//- 2^¹⁵
//- 31,250
 
//- 31,250
//- 2^31
//- 2^15
- less than 2^26

//- 1,000,000
//- 2^31
- 2,000,000
- less than 34.0 x 10^6

//- 2^15
//- 31,250
- ~ 2^25 ***
//- 1,000,000

Assume an algorithm implemented in Java that verifies if there are duplicates in a large array with values between 0 and 1000. To be the most space efficient possible the algorithm uses the bit-wise approach to represent every possible integer as a bit. If the algorithm uses an array of some type as the bit holder, what is the most space efficient type and size of the array that can still hold the data?
- long[1000]
//- char[1000]
- long[2^5]
- int[1000]

Suppose an algorithm that verifies if a string of lower case english (a-z) characters from the ASCII code (26 in all) has duplicates. The algorithm uses the bit-wise approach to verify duplicates. Which is the most SPACE OPTIMAL data type or data structure? Assume the algorithm is implemented in Java or C.
- int
//- boolean [26]
//- char [8]
- int [26]


What are the benefits of predefined data types in strongly-typed programing languages?
- You can restrict operations to nullable values (e.g., When an operation requires specifically Integers the compiler will detect decimals when used, and return a null value).
- Associating data types to semantic fields (e.g., When an operation requires specifically Integers the compiler will detect decimals when used, and accept them because compiler doesn't need to cast data types).
- Determine how to perform arithmetic operations,(e.g., In Pascual the character "+" means Addiction, if the operands are numeric, is impossible to concatenate strings in Pascual).
- Detecting mistakes in computations in programs (e.g., When an operation requires specifically Integers the compiler will detect decimals when used, and return a detectable error). ***

Which statement describes Software Development Life Cycle (SDLC)?
- Software Development Life Cycle is the standard method to deprecate code once the application has finished it's development.
- Software Development Life Cycle is a flow diagram of the application which describes timing and memory consumption.
- Software Development Life Cycle is a standard technique to prevent the use of external libraries.
- Requirement gathering, system analysis, design, coding, testing, maintenance and documentation are the stages of (SDLC) ***

ññññ

===Software Engineering===

 

Which are the parameters that must be carefully analyzed to have a successful software project?

- Quality, Cost, Time ***

- Effort, Advantage, Quality

- Cost, Effort, Resources

- Resources, Type, Method

- Tasks, Time, Method

- Quality, Method, Resources

 

What would be the benefit of automating tests for a software project?

- Tests are written once and can be executed thousands of times, which decreases the time developers spent testing their code and reduces the possibility of forgetting a test and therefore of introducing a bug into the final release of the product. ***

- Automated tests guarantee the test is performed in the same way for every testing cycle and reduces the time developers spend testing manually. ***

- Automated testing increases the performance of the software being tested.

- the project will not require testers anymore.

- Guarantees no bugs will end up in the final product.

- Allows developers not to test anything manually

- Automated tests don't need maintenance.

 

You just entered as a project manager to coordinate the development of a new Software platform. Then,you are told that the project has a considerable delay versus the former delivery dates. According to your judgement and experience, what would be the best strategy to address this delay?

- Elaborate a mitigation plan to decide and commit upon the highest value-adding features to the customers. ***

- If the problem is product quality. Establish BETA releases that can be deployed to the customers so additional testing effort can be leveraged while start adding value to customers. ***

- If the problem is continuous change introduction. Then put in place change control mechanisms to avoid that the continuous impacts to the developed features

//- If the impact has been already materialized, then negotiate with the customers about the delivery dates for the requested functionality.

//- One solution would be to add more developers to the teams. So the delivery rate can boost overtime.

//- Cancel the project if the delay or financial impact is too big.

//- Requesting the development team to work extra hours to honor the committed deadlines. Project-level delays is a day-by-day issue.


From Software engineering perspective, which are the phases of the Security Development Lifecycle?

- Training, requirements, design, implementation, validation, release and response.***

// - Construction, validation and maintenance.

// - Requirements, modeling, verification, implementation and response.

// - Requirements, design, implementation, validation and release.

// - Training, requirements, design, implementation, validation, deploy and response.

// - Requirements, design, implementation, validation, release and user training.

// - Plan, do, check and act.

 

According to your knowledge and experience. Which one could be a very common source of software defects within a piece of code?

- Taking the inputs as they come without any validation. ***

- Coupling the code with global variables of the class/instance and making assumptions upon the values of these. ***

- When having flow control structures such as if, switch, etc. Not to consider all the paths that the flow can take by omitting some flow control blocks. ***

//- Not being explicit about which exception is being catch if an error happens.

//- Not following a previously agreed code convention.

//- Declaration of multiple non-used variables within a code segment.

//- Not using strong typed data structures when handling the data.

//- Having methods with too many lines of code.

 

When developing Software in a large team and when it comes to create and handle code, you rely on two key techniques called merging and locking. Why do these techniques are important to Software development?

- These two techniques are essential to construct code safely when there are concurrent changes across the source code base. ***

- These two techniques allows safe management of the source code during the construction and maintenance phases. ***

//- These two techniques allows safe management of the test code during the validation phase.

//- These concepts apply only when developing with teams of 10+ members.

//- These are concepts used for version control of the source code. They are fundamental but not relevant to the overall software cycle.

//- The usage of these techniques are essential in order to guarantee the correct and robust execution of the system's code for concurrent operations.

 

During the testing phase of a project, the team A implemented 400 tests whereas the team B coded 1500 tests. Did the team B perform better than the team A?

- Not necessarily, the quality of the test content is not measured just in terms of number of tests but rather in system functionality coverage. ***

- It cannot be evaluated since the size (lines of code) of such tests is unknown.

- Yes, one of the measures to evaluate validation effectiveness is precisely the volume of tests created.

- Yes, the more tests you write, the more quality you obtain from the software.

 

The development team has informed that the software product cannot be released according to the schedule due to some regression errors detected during the testing phase. What do you think it would be the best strategy to avoid these kind of errors in the future?

- Establish gate keeping mechanisms based on test automation that will prevent any code modifications that break the system functionality from entering the production code base. ***

- Incorporating new unit tests and automated regression testing in a continuous manner. ***

//- Leverage on explicit authorization from executive management for every change introduced.

//- Reinforce code reviews on every code change that is introduced to the production code.

//- Implement manual testing cycles with baseline functionality defined by the requirements. If use cases work per the specification, then everything is OK.

//- Implement a small automated test suite that covers the defined feature baseline for the product.

//- Establish a requirement to submit a static analysis report for the submitted changes to confirm the changes are OK.

 

Suppose you have been working on a software development project and you need to maintain a new system but, it turns out that the former developers of the system are not working for the company anymore and source code got lost. One of your colleagues suggest that you follow an approach called reverse engineering. What did he mean?

//- There is nothing like reverse engineering in Software products.
- Based on an existing and working implementation, the reference model and/or documentation is built up.
- Is the process of creating the specifications from the existing source code.
//- Is the inverse process of the Software development cycle. You start testing, then adding the code to the product were it makes sense and then creating the documentation.

 
- Is the process of creating the specifications from the existing source code.
- In order to have a complete understanding of the system, both requirements and design specification are required. Then, the actual model can be inferred from the system itself.
- Based on an existing and working implementation, the reference model and/or documentation is built up.
//- There is nothing like reverse engineering in Software products.

//- There is no need of reverse engineering while the Software system is on maintenance phase.
- In order to have a complete understanding of the system, at least the requirements specification is required. Then, the actual model can be inferred from the system itself.
- Learning about a system with insufficient functional/design specifications.


 

Suppose that you are given the task of testing a web service. The go/no go online decision will be made based on your assessment. In fact you have 5 hours to perform that testing. Considering this context, which is the approach you would use to test this web service?

- Ask which features of the product have the most exposure or are the most used and test accordingly. ***
- Ask for the minimum use cases that need to be supported and test accordingly. ***
- Besides **
//- Have the team in India test it overnight.
- If existing regression tests are not showing issues then there is no need of add more tests.
- Proceed to implement test automation upon all the exposed methods.
- Design and implement at least one test per exposed method form the web service so we assure a good coverage.
//- If available the suite of unit tests, then execute them.


Consider that you are in charge of maintaining a parking lot automation system. One day the general manager comes in and gives you the following requirements:

+Instead of paper-based tickets, the access systems will now support wireless badges to control the access to the parking lot.

+The machine must be fast in validating and granting access.

After reading the requirement, what would you do next?

- Ask to be more specific on what type of wireless cards will we support. ***

- Ask more information about how it is expected the user identity to be validated. ***

//- Start sizing estimates and making project schedule.

//- Ask about due dates.

//- Ask about how many resources will be available to implemented the requirements.

//- Start designing the requested feature with the corresponding specification.

 

Consider that your team has to develop an emergency brake system for a new car. The considerations are as it follows:

+it has to monitor several inputs from car sensors such as speed changes, proximity with other objects, etc.

+Once that the system triggers the brake, it has to notify other modules of the car during the braking sequence (air bags, red lights, etc)

+It has to monitor and assure that the car has stopped and disable itself.

According to your own judgement and experience, which of the following sentences could be true about the solution to this problem?

- The Observer pattern can be useful here since the communication between modules will be event-based. ***

- The State Machine pattern will be useful here in order to monitor and execute actions at the same time (like an OS) ***

//- The Strategy pattern will be required considering the multiple actions that need to be executed at one time.

//- The Interpreter pattern can be useful here considering the multi-channel communication between the modules.

//- The proxy pattern will be required considering the communication channels between the brake modules.

//- The Mediator pattern will be required considering the prioritization of the different messages between modules.

//- The Visitor pattern can be useful here considering that the communication between modules will be event-based.

 

 

Your team has to develop a very powerful compiler. The considerations are as it follows:

+It has to be able to parse Javascript-based programs.

+It has to be able to translate it into several output types like intermediate code for virtual machines, native assembler code, etc.

According to your own judgement and experience, which of the following sentences are true with regard the solution to this problem?

- The Chain of Responsibility pattern will be useful for the parsing module of the input source files.

- The Mediator pattern will be useful for the syntactic analysis of the parsed files.

- The Interpreter pattern will be useful for the syntactic analysis of the parsed files. ***

- The Bridge pattern will be useful considering the several output formats that have to be supported.

- The Visitor pattern will be useful for the parsing module of the input source files.

- The Factory Method won't be useful here considering a growing number of supported input file formats.

 

What is a Version Control System?

//- It is a system that keeps in sync the versions of software across different servers
- It is a system that keeps track of the changes on the files of a project and archives each version of the file so developers can go back whenever they need to. It makes collaboration easier
- A system that ensures that the dot release of all products are prime numbers.
//- A system that manages the Software Development Life Cycle and enforces developers to release a new version of their software every given interval

//- It is a system that keeps in sync the versions of software across different servers
//- A technique that defines how to organize the files in a project
- A Version Control System is tool which helps developers to manage the changes in the code of a certain project by archiving the files them into "snapshots" across the time, so they can go back if there are any mistakes. ***
//- A program that helps developers to assign a version number to a product

 

In the famous minesweeper game, where the objective is to clear a rectangular board containing hidden "mines" without detonating any of them, with help from clues about the number of neighboring mines in each field, which could be a use case?

- Checking a box ***

- Discover a box ***

- Start Game ***

// - Game initiated

// - Annotations

// - Win the game

// - Player

// - Count mines

// - Mines

 

Which of the following statements can be considered as true about the Agile Software Development?

- It's all about people interactions instead of processes.

- It's when when it is preferred to deliver working functionality to your users rather than having a sign-off from your customers. ***

- In Agile Software Development is just about incremental product life cycles.

- In Agile Software Development there is no value on tools.

 

When we refer to Software Quality it is meant...

//- Create a product that meets all the agreed procedures and methodologies for product development.

//- A Software Engineering discipline thart consist on creating test content to validate a given Software system.

- Create a product using the best technologies available on both industry and academy.

- Create a product that meets successfully the needs of your users and customers.

 

- Create a product that meets successfully a given set of provided requirements. ***

//- A Software Engineering discipline that consist on creating test content to validate a given Software system.

//- A Software Engineering discipline that consist on creating and executing test content to validate a given Software system.

 

- Create a product that meets all the required industry standards for product development.

- Create a product that meets successfully a given set of provided requirements.

- Create a product that meets all the agreed procedures and methodologies for product development.

//- A Software Engineering discipline that consist on creating and executing test content to validate a given Software system.

 

You are assessing a system with 100% of code coverage by your implemented tests. Does this mean that such system is 100% correct?

- Not necessarily. The code coverage means that all the functionality provided BY THE CODE is being exercised. However it does not guarantee that such functionality being provided is correct. ***

- No. Even if 100% of the code is being exercised, it does not have anything to do with the input domain that may have impact on the code behavior as well. ***

- The code in theory should reflect the required functionality for the product. SO if all the code is being tested without reporting issues, then we can say that the system is 100% correct.

- if no outstanding issues are thrown by the tests then we can assure at some extent that the functionality is correct.

- Yes. if exercising 100% hgas proven to work without any failure, then we can say that the functionality of the system won't be compromised.

- We probably can say that is correct, as the coverage of tests is the direct measure for the product quality.

- No as besides having 100% of coverage, all the test has to pass also.

 

The term cyclomatic complexity gives the tester a measurable value for software complexity. How does it relate to software testing?

Cyclomatic complexity is a quantitative measure of the number of linearly independent paths through a program's source code.

// - Cyclomatic complexity is not useful for testing analysis but only how much code you need to change.
// - When using black box testing, the cyclomatic complexity can provide a direct metric to estimate the effort and volume of tests required to accomplish the coverage goals.
- The cyclomatic complexity can provide meaningful but limited information about the exposure of the code being exercised by a test case. ***
// - Cyclomatic complexity is a metric for algorithm analysis and does not have anything to do with software validation.

 
// - By in depth understanding of cyclomatic complexity (even when large) you can often simplify testing to a single test case.
// - Cyclomatic complexity is a metric for algorithm analysis and does not have anything to do with software validation.
- If the number of possible branches on the code flow can be known up front. It will be really helpful to start designing the test cases for such system.
//- Cyclomatic complexity is not useful for testing analysis but only how much code you need to change.

 
// - By in depth understanding of cyclomatic complexity (even when large) you can often simplify testing to a single test case.
// - Cyclomatic complexity is not useful for testing analysis but only how much code you need to change.
// - Cyclomatic complexity is a metric for algorithm analysis and does not have anything to do with software validation.
 - When using white box testing, the cyclomatic complexity can provide a direct metric to estimate the effort and volume of tests required to accomplish the coverage goals.

- The cyclomatic complexity is a metric from static code analysis and does not have anything to do with software validation.
//- Cyclomatic complexity is not useful for testing analysis but only how much code you need to change.
- When using white box testing, the cyclomatic complexity can provide a direct metric to estimate the effort and volume of tests required to accomplish the coverage goals.
// - Cyclomatic complexity is a metric for algorithm analysis and does not have anything to do with software validation.


- The cyclomatic complexity can provide meaningful but limited information about the exposure of the code being exercised by a test case. ***
//- Cyclomatic complexity is not useful for testing analysis but only how much code you need to change.
//- When using black box testing, the cyclomatic complexity can provide a direct metric to estimate the effort and volume of tests required to accomplish the coverage goals.
//- By in depth understanding of cyclomatic complexity (even when large) you can often simplify testing to a single test case.

You are in charge of developing new tests for a system and your boss asks you to implement both black-box and white-box testing to make sure the quality is acceptable before the product release. What validation strategy would you suggest based on these techniques?

- Both can be used since white-box testing allow is generate coverage while black-box tests will confirm if the features work. ***
- It depends on the context of each project. Both techniques can be combined in order to develop a desired code coverage while assuring that the product works well. ***
//- Black-box testing should be enough since at the end what matters is working functionality for the customers.
//- Considering that both techniques are equally effective. A reasonable approach would be to plan and design 50% of white-box testing and 50% of black-box testing.
//- Black-box testing techniques should be adopted since white-box testing generates a lot of coupling with the production code.
//- If white-box testing can be performed (access to the code) then there is no need for black-box testing.
//- Plan and execute black-box testing only. white-box testing biased towards the functionality of the code only.

Your team has to develop a module that replicates the transactions made to a database across different nodes within a network for backup and redundancy purposes. the considerations are as it follows:

+it has to support different protocols fornode communication.

+Be able to scale seamlessly as more nodes get added.

According to your own judgement and experience, which of the following design patterns could be really useful for a solution to this problem?

//- Mediator
- Adapter
- Interpreter
- State Machine

- Interpreter
- Observer
//- Factory Method
//- Strategy

- Proxy ***
 

When we say that we should code for an interface and not an implementation we mean...

- The consumer entities does not know about the specific types they are interacting with
- All the transactions or tasks should be performed between abstract entities only
- Define interfaces only when abstract entities are needed.
// - When entities interact with each oter, no information about their internal state will be exposed.


- To focus on the contract between entities to perform a given transaction.
//- Reduce at the minimum possible the entities represented by abstract classes.
// - When entities interact with each other, no information about their internal state will be exposed.
- Define interfaces only when abstract entities are needed.


- To focus on the contract between entities to perform a given transaction.
- Always define abstract entities to perform any given transaction.
//- Reduce at the minimum possible the entities represented by abstract classes.
- Define interfaces only when abstract entities are needed.


If you are assigned to perform a code review from a peer of your team. Which aspect would you consider relevant to review for correctness?
- Error handling and exception propagation across the code. ***
- Complexity of the algorithm being implemented.
- Consistency of the coding style.
- Memory usage across the code.

ññññ

=== Data Structure ===

 

Consider the characteristics of binary trees and binary search trees. Which of the following affirmations is true?

- Only one structure ensures the production of an increasing ordered sequence of items via in-order traversal. ***

- Both structures can be implemented using an array. ***

- Only one structure ensures that its non-leaf nodes values are between their left and right children values. ***

- None of these structures can ensure an ordered sequence of values via breadth-first traversal. ***

//- Both structures ensure that the longest path from the root to the deepest leaf has a length of log(n).

//- Both structures produce an unordered sequence of values via in-order traversal.

//- Both structures have a O(log(n)) lookup complexity.

//- Both structures can be used for implementing a sorting function.

//- Both structures can be used to represent a binary heap.

//- Both structures have O(log(n)) SPACE complexity.

 

 

Consider the characteristics of binary trees and binary search trees. Which of the following affirmations is false?

- Both structures produce an unordered sequence of values via in-order traversal ***

- Both structures ensure that the longest path from the root to the deepest leaf has a length of log(n). ***

- Both structures have O(log(n)) SPACE complexity. ***

- Both structures can be used to represent a binary heap. ***

- Both structures have a O(log(n)) lookup complexity. ***

//- Only one structure ensures that its non-leaf nodes values are between their left and right children values.

//- Only one structure ensures the production of an increasing ordered sequence of items via in-order traversal.

//- Only one structure ensures that the nodes keep and ordered relation with their ancestors and descendants.

//- None of these structures can ensure an ordered sequence doing breadth-first traversal.

//- Both structures can be implemented using an array

 

Consider an empty AVL tree (a self-balancing binary search tree). Which of the following inputs keep the tree balanced? (i.e. not rebalancing is done) (assume alphabetic order)

//- Super, Mortal, Earth, Donkey, Final

//- Father, Mother, Uncle, GrandMa, Daughter, Uncle

//- Petilil, Pikachu, Poliwag, Pansear, Porygonz

- Mother, Daughter, Uncle, Father, Son

 

//- April, Splinter, Mickey, Raph, Leo, Donnie

//- Super, Mortal, Earth, Donkey, Final

- Earth, Mortal, Super, Final, Donkey

//- Audi, Ferrari, Mercedes, Mazda, Tesla, VW

 

//- Father, Mother, Uncle, GrandMa, Daughter, Uncle

//- Super, Mortal, Earth, Donkey, Final

//- Audi, Ferrari, Mercedes, Mazda, Tesla, VW

- Mazda, VW, Audi, Mercedes, Tesla, Ferrari

 

//- April, Splinter, Mickey, Raph, Leo, Donnie

- Picachu, Petilil, Poliwag, Porygonz, Pansear ***

//- Audi, Ferrari, Mercedes, Mazda, Tesla, VW

//- Father, Mother, Uncle, GrandMa, Daughter, Uncle
 

Consider an empty AVL tree (a self-balancing binary search tree) that keeps alphabetic ascending ordering. Which of the following inputs unbalances the tree at any time?

// - Mercedes, Nissan, Ferrari, Audi, Tesla

// - Picachu, Petilil, Poliwag, Porygonz, Pansear

// - Mother, Daughter, Uncle, Father, Son

- Father, Mother, Uncle, GrandMa, Daughter ***

- April, Splinter, Mickey, Raph, Leo, Donnie ***

// - Earth, Final, Donkey, Super, Contra

 

- Earth, Mortal, Super, Final , Donkey

// - Mickey, Raph, Leo, Donnie, Splinter

// - Earth, Final, Donkey, Super, Contra

// - Picachu, Petilil, Poliwag, Porygonz, Pansear

 

// - Mercedes, Nissan, Ferrari, Audi, Tesla

// - Mickey, Raph, Leo, Donnie, Splinter

// - Picachu, Petilil, Poliwag, Porygonz, Pansear

- Petilil, Picachu, Poliwag, Pansear, Porygonz

 

// - Picachu, Petilil, Poliwag, Porygonz, Pansear

- April, Splinter, Mickey, Raph, Leo, Donnie ***

// - Mercedes, Nissan, Ferrari, Audi, Tesla

// - Earth, Final, Donkey, Super, Contra


 

If you have a tree structure that does not get balanced after an insert. To what other data structure is it equivalent if you keep adding number to said tree but each number is bigger than the previous one.

- Simple linked list ***

- A linked list. ***

//- A circular list that allows backtracking.

- A priority queue.

- A stack.

- A hash table

- A queue

 

Which of these statements about binary search trees is FALSE?

- Binary trees are the same as queues ***

- Binary tree nodes can have more than two children ***

- Binary trees are a special case of graphs

- Binary search trees sort the values that are inserted into them

- Binary search tree values can be printed in order

- Binary search trees support operations like insertion, deletion and searching

- Binary trees are not allowed to have cycles in them

 

What is a charecteristic of a queue?

- First in first out philosophy ***

- Is used to implement Breadth First Search ***

- Is used to implement Depth First Search

- Is used to implement Binary Search

- Is used to simulate recursion

- Philosophy last in first out

- Is a non linear data structure

 

What is a characteristic of a stack?

- Last in first out philosophy ***

- Pop operation complexity is O(1) ***

- Its delete complexity is O(n)

- Philosophy first in last out

- Its insertion complexity is O(n)

- Is a non linear data structure

- It can't be implemented as linked list

 

Two dimensional arrays are also called?

- Matrix arrays. ***

- Table arrays ***

- Hashes.

- Trees.

- Tables

- Vectors.

- Cubic Arrays.

- Tuples

ññññ

=== DataBases ===

 

What is a table?

- A two-dimensional structure which organizes the attributes of an entity as columns and the data for such attributes as rows ***
- A collection of rows and columns which normally contains data related to a certain entity ***
//- A one-dimensional array of cells which contain the data of an entity
//- A database process which is essential for it to be ON
//- A data structure that doesn't allow its data to be changed
//- A table is a collection of databases
//- A queue-like data structure which can contain information
//- A database process which is essential for it to be ON

What are some of the most common reasons for building an index?

- Primary keys ***

- Improving query performance ***

- Improves data distribution

- Improves the schema access

- Secondary keys

- Primitive keys

- Improves insertion time

 

Which of the following options are more likely to degrade query performance

- Cartesian products ***

- Subqueries ***

- Indexes

- Different execution plans

- Right joins

- Inner joins

 

What is the principal advantage of creating indexes on a table in a correct manner?

- It allows faster searches in the database. ***

- They help us to obtain data from tables more quickly. ***

- It help us to create an inheritance relationship between two tables faster.

- It helps the system to read through the entire table (one by one( to locate the desired information.

- It allows us to store a larger number of rows in the table.

- They help us to add new data to the table more quickly

 

What is a table trigger?

- A trigger is a program linked to a particular table which is only when a certain event happens (INSERT, UPDATE DELETE) ***

whenever a certain thing happens to the table it is linked to. ***

- A trigger is the reaction that causes a DBA to go bezerk when he reads the SQL statements made by most Java developers

- A trigger is a SQL statement which ensures data to be deleted after being viewed.

- It is a place of code that can contain SQL statements and runs

- It is a process that is executed in a particular table at given time intervals

- A data structure that intends to be the equivalent to a book's table of contents for the data in the table and helps queries to search data in a faster way

- It is a piece of code that can be executed on demand by any user of the database

 

Which of these statements is FALSE about Database Table Triggers?

- An event that a table trigger can respond to is DELETE
- Triggers are synonym for indexes. They both make operations faster. ***
- An event that a table trigger can respond to is UPDATE
- An event that a table trigger can respond to is INSERT

 
- Trigger execution can be performed either before or after the events
- Triggers can be executed on-demand ***
- Triggers are pieces of code that are executed on certain events


Which of the following is a Data Control Language statement?

- Grant ***

- Revoke ***

//- commit

//- merge

//- truncate

//- savepoint

//- rollback

//- truncate

 

What is a difference between Truncate and Delete in a SQL operation?

- They are both synonyms for the same operation
- Delete can be rolled back ***
- Truncate can be rolled back
- Delete is faster
- Truncate removes white space from rows
- Truncate removes leading or ending white spaces from rows

Which of the following options are all examples of Data Definition language statements?

- create, comment ***

- Rename, comment ***

//- truncate, grant

//- create, alter, grant

//- commit, select

//- merge

//- savepoint

 

Which of the following options doesnt contain any Data Manipulation Language statements?

- truncate, rename, revoke ***

- grant ***

//- select, alter, revoke

//- update, comment, rollback

//- merge, comment, grant, savepoint

//- delete, drop, truncate

 

What result we will get by executing the following request?

SELECT project_code, project_name FROM PROJECTS WHERE price = (SELECT MAX(price) FROM PROJECTS);

- The codes and names of higher-priced projects. ***

- A subtable of the projects where the price is the highest price. ***

//- The number of projects with the highest price.

//- A subtable of the PROJECTS table, ordered by the code and their name.

//- The codes and names of the PROJECTS table, sorted by their price.

//- The number of projects with the lowest price.

//- The maximum price of active projects.

 

Which of the following statement is true about the FROM clause in a sql query

- Is mandatory ***

- Table aliases are optional ***

- Hints are only specified in this clause

- Joins cannot be specified in this clause

- Views are always last

- A temporal table cannot be used in this clause

- You can use a column name in this clause

 

What result we will get by executing the following request?

SELECT COUNT(*) FROM CLIENT_REQUEST WHERE client='59123014D' AND status NOT IN ('Resolved', 'Closed');

- Number of open request from the client '59123014D'. ***

- Number of request from the client '59123014D' where the status isn't resolved nor closed. ***

- The first request that the client '59123014D' has done.

- The last request that the client '59123014D' has done.

- A list of non-available requests of the client '59123014D'.

 

Which is the smallest form of normalization?

//- ETNF

//- 4NF

- EKNF ***

//- DKNF

//- BCNF

Which is the smallest form of normalization?
- ETNF
- BCNF
- 3NF ***
- DKNF

 

A downside of using indexes is:

- Using more disk space ***

- Helps in the foreign integrity checks

- Scanning the table is slower

- There is no downside of using indexes.

 

Which are the benefits of normalizing your data in a database design?

- Faster database design

//- it makes the SELECT faster

//- Allows having multiple values for an attribute

- Improves performance & reduces integrity problems

 

- Reduces space in the database an improves performance on updates ***

//- It makes the SELECT faster

//- Allows having multiple values for an attribute

//- Allows to use not structured data

 

Which of the following would be a correct row returned from the following query
select e.name, sum(p.salary), avg(p.salary), count(*)
from emp e, paychecks p where e.id=p.employee_id
Group by e.name

- Bob Smith, 1000, 500, 2 ***
- Ann Ricards, 1000,500,5
- Bob Smith, 1000, 700, 2
- Ann Ricards, 1000,500,3

- Bob Smith, 1000,350,2
- Ana Richards, 3000, 1000, 3 ***
- Bob Smith, 1000, 350, 1

 

What is wrong with this SQL query?

SELECT YEAR(SaleDate) AS SaleYear, COUNT(*) as NumSales

FROM Invoices

WHERE SaleDate >= 2016;

- Needs to have the year() function applied in the where clause ***

- Missing a group by statement if you want the total of sales ***

// - >= is not a valid comparator in SQL

// - The table Invoices does not exist

// - The year function returns only the last 2 digits of the year

//- saleyear needs to be written as SaleYear as SQL is case sensitive

//- Where clause should have the number first, 2016 <= SalesYear

 

 

What are the drawbacks of database normalization?

- Queries tend to join several tables to gather data ***

- Performance gets affected with joins mande among different tables

//- Data ends up duplicated across different tables

//- Data integrity is reduced when normalizing a database, even when normalization has being done correctly

//- It enforces the RDBMS to have foreign keys

//- Normalization mandates to have indexes

//- Normalized tables normally have more columns than their non-normalized versions

 

An example of DDL statements are

- SELECT, INSERT, UPDATE, DELETE, MERGE, CALL, EXPLAIN PLAN

- GREP,DELETE, MERGE, CALL

- CREATE, ALTER, DROP, TRUNCATE, ***

- COMMENT, COMMENT, RENAME

- CREATE, , INSERT, UPDATE

- MERGE, CALL, EXPLAIN PLAN, COMMENT, RENAME

 

Which of the following UPDATE statement is correctly structured?

- UPDATE TABLE PRODUCT VALUES (group = 2, status = 'closed') WHERE sales_count < 500;

- UPDATE TABLE PRODUCT SET group = 15, status = 'ready', sales_count = 500, available = 'Y';

- UPDATE PRODUCT (group, status) SET VALUES (15, 'ready') WHERE sales_count > 500 and available = 'Y';

- UPDATE PRODUCT SET group = 2, status = 'closed' WHERE sales_count < 500;

 

Given the following table

CREATE TABLE employee (employee_id INT PRIMARY KEY,employee_name VARCHAR(30), manager_id INT,manager_name VARCHAR(30) foreign key (manager_id) REFERENCES employee(employee_id));

What's the name for this kind of join operation?

SELECT man.name, emp.name

FROM employee man

INNER JOIN employee emp

ON man.managerID = emp.employeeID;

- Right join

- implicit join

- Left join

- Self join ***

- full join

 

Which option includes transaction control statements only.

- comment, commit

- savepoint, merge, comment

- rollback, savepoint ***

- savepoint , merge

 

Considering the following SQL statement:

SELECT * FROM PETS P LEFT JOIN OWNERS O ON P.OWNER_NAME = O.OWNER_NAME

Which of the next sets is fully contained in the statement result?

- (PETS ∩ OWNERS) ∩ OWNERS

- (PETS ∩ OWNERS) ∪ PETS

//- (PETS ∩ OWNERS) ∪ OWNERS

//- (PETS ∪ OWNERS) ∪ OWNERS

 

//- PETS ∪ OWNERS

- PETS ∩ OWNERS

- OWNERS

- (PETS ∩ OWNERS) ∩ OWNERS

 

- (PETS ∩ OWNERS) ∪ PETS

- OWNERS

//- (PETS ∩ OWNERS) ∪ OWNERS

//- (PETS ∪ OWNERS) ∪ OWNERS

 

If we have the following two tables w/ the following data

sql> SELECT * FROM countries;

id    country

1    Mexico

2    USA

3    Russia

sql> SELECT * FROM pizza_eaten;

id    amount    country_id

1    10000    1

2    200000    2

3    1000    3

What would be the following query return

select country, amount from countries, pizza_eaten

NOTE: REVIEW QUERY CAREFULLY

- All countries seem to eat the same amount of pizza ***

//- 3 rows

//- 5 rows

//- Italians eat the most pizza

//- Only shows correct amount of pizza eaten by country

//- Russia eats less pizza than Mexico

//- USA eats more pizza than Mexico


Given the following tables:

CREATE TABLE size(size_id INT, description VARCHAR(30) );

CREATE TABLE color(color_id INT, description VARCHAR(30) );

Which SQL statement returns all the size and color combinations?

- It can't be done because there is no referential integrity

- SELECT * FROM size CROSS JOIN color; ***

- SELECT * FROM size INNER JOIN color on size.description=color.description

- SELECT * FROM size UNION ALL color



Which of the following operations would select every third row from a table in a SQL operation, starting from the 2nd row?
- Select * from table where (id+3) % 1 = 0
- Select * from table where id % 3+1 = 0
- Select * from table where (id+1) % 3 = 0 ***
- Select * from table where id % 2 = 0


=== Operating systems ===

 

Operating System is responsible for managing:

- Memory Storage ***

- Process Scheduling ***

- File System Storage

- Email

- Graphic Rendering

- Audio Reproduction

- File Transfer Protocol

 

In Linux what is the home directory?

- Is the user's principal directory, normally, within that directory there will be Documents, Files, Downloads ***

- This is where the user is supposed to store all of its files

- Is the place to administrate files by using RPMs (Red Hat Packaged Manager ) modern Linux distributions work with that schema.

- Home directory Is the connection between the hard drive and the RAM

- Is deployed as a desktop on the PC with MS-DOS

- Linux doesn't have a home directory

- Is the place where all the wallets are created by default to storage all the files

 

In Linux how can you get help on how to use a command?

- "-- ls help" will display a short version of the help of the "ls" - command as well as with other commands.(-- help) ***

- "cd -h "will show the help for the "chamge directory" command as well as with other commands. (-h) ***

- "ghelp" (Get Help) will show detailed help

- By pressing CTRL + H will show version of help on the screen.

- By pressing F12 and going to help menu

- By pressing CMS + H will show version of help on the screen.

 

In linux what is a environment variable?

- An environment variable is present in the system for all programs to use ***

- An environment variable is a variable which can affect the behavior of the system and/or its programs ***

- An environment variable is not accessible for the system and/or its programs.

- Environment variables must be installed from a external package

- Environment variables only can be invoked form home directory

 

What is the difference between the "home" and the "current working directory"?

- The "home" directory can also be the "current working directory" if you are situated on it but they are not the same. ***

- The "home" directory is the directory dedicated for the current user. and the "current working directory " is the one the user is situated on ***

- The "home directory" Is always the"current working directory "

- The "home" directory is the directory dedicated for the processes, usually not accesible, and the "current working directory " is where the processes are executed

- The "home directory" is always the same as the "current working directory" the only difference is the accessibility for the users.

- The "home" can never be the "current working directory "

- The "home" directory is the directory dedicated for the current process. and the "current working directory " is where an application is installed on.

 

What is the "working directory" or "current working directory"?

- Is the directory the user is currently situated on, you can change it by using the "cd"(Change Directory) ***

- Is the directory the user is currently situated on, It can be printed to the screen by using the "pwd " (Print Working Directory) command. ***

- Is where you always deploy applications, you can change it by using the "--depdir"(Deploy Directory)

- Is the parent directory the user was situated on, you can get this data with "--gdir"

- A section of the hard drive where current processes ar running you can get this data by using the "--gcurrent"(Get Current)

 

How does file permission work in Linux/UNIX?

- Permissions are represented by digits from 0 to 7, each digit represents the permission scope. ***

- Permissions are normally represented by 0 and 1, 0 for restricted and 1 for grant, each digit represents the permission scope.

- Permissions are normally represented by 0 and 1 to execute a boolean function which determines if it has file permission or it doesn't.

- Linux doesn't has scope of permissions.


