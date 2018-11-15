ES5 vs ES6

Hoisting
Const let

Function flecha
Clave-valor en objeto
Valor por defecto en funciones
Concatenacion ${}
Parametros indeterminados:  …
… para concatenar arrays: …array, 1,2
Importat funciones
Import vs require

Abstract Class = provide a common definition of a base class that multple derived classes can share
-You can declare fields that are not static and final
-define public, protected and private concrete methods
-can extend only one parent class but it can implement multiple interfaces
-When an Abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class and if it doesn-t, the subclass must also be declared abstract
*Share code among several closely related classes
*expect classes that extend your abstract class to have many common methods or fields
*you want to declare non static or non final fields
*when you have a requeriment for your base class to provide a default implementation  of certain methods  but another methods should be open to being overrided by child classes

Interface - decoupling the what from the how
-can extends from another interface
-is just the declaratoin of methods of an class
-define what kind of operatoin an object can perform
*when you expect that unrelated classes will implement your interface
* when you want to specify the behavior of a particular data type, but no who will implement it

Similarities
cannot instantiate them
may contain a mix of methods without an implementation

Differences
interface is implemented and abstract class is extended
Abstract class can have member variables that are inherited /// interface has variables but in fact they-re constants with static scope (non static variables requieres an instance)
Abstract classes can have constructors // Interfaces cannot have constructors
Abstaract methods can have any visibility // All methods over the interface are automatically public
Abstract classes can have defined methods (methods with an implementation) // Interfaces methods are public abstract
but in Java 8 interfaces can contain default methods (methods with implementation) ...
-keyword default is used
- static methods as well before Java 8 that was not possible
but in Java 9 interface can contain private methods(commonly used when two default methods in an interface share common code)

Threads

A process is a unit of execution that has its own memory space
Each instance of a JVM runs as a process
The heap is not shared betweeen applications

A thread is a unit of execution within a process
una unidad de ejecucion dentro de un proceso
Cada proceso puede tener multiples hilos
en Java cada proceso tiene por lo menos un hilo

Asi que cada aplicacion de java corre en un solo proceso, cda proceso puede tener multiples hilos y cada proceso tiene su heap
y cda hilo tiene su pila

-Extender de Thread Class, implementar el metodo run y utilizar el metodo start
-Implements the Runnable, implementar el metodo run,


Collection
Set -> SortedSet / List / Queue / Deque

Map
SortedMap

List puede tener duplicados
ArrayList
LinkedList

Set no puede tener duplicados
HashSet cualquier orden
LinkedHashSet ordenados
TreeSet

Map put,get.remove, replace
// HashMap

TreeMap, TreeSet

implements Comparable permite usar reverse
se tiene que sobreescribir metodo compareTo
Collections .
//binarySearch(list, keyElement, compare?)
//swap(list, position old, position new)
//reverse(list)
//shuffle(list)
//min(list)
//max(list)

static final Comparator<Object> CONSTANT = new Comparator<Object>() {}
Comparator, new Comparater sobreescribe compare
Collections.sort(list, CONSTANT)


import java.util.Scanner;

public class PascalTriangle {

   public static void print(int n) {
       int[] previousRow;
       int[] currentRow = {1};
       printArray(currentRow);
       previousRow = currentRow;
       for (int i = 2; i <= n; i++) {
           currentRow = new int[i];
           currentRow[0] = 1;
           currentRow[i - 1] = 1;
           for (int j = 0; j <= i - 3; j++) {
               currentRow[j + 1] = previousRow[j] + previousRow[j + 1];
           }
           printArray(currentRow);
           previousRow = currentRow;
       }
   }

   public static void printArray(int[] array) {
       for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
       }
       System.out.println();
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the row number upto which Pascal's triangle has to be printed: ");
       int row = scanner.nextInt();
       print(row);
   }
}
