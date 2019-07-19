//loading a scala file in console -> :load file.sc - if args manually set them
// scala file.sc

val i = 6 // type: Int
// i = 7 //error because val cannot be reassigned

var i2: Int = 8 // if we want to declare the type
// var i2: String = 98 // error

val i3,i4 = 5

var j = 7
j = 10 // works , var can be reassigned

var k = "Vishva" // type: String
// k = 8 // error cannot reassign object of a different datatype

// custom prints
println(s"square of ${j} is ${j*j}")

/// array
val arrp : Array[String] = Array("aa", "bb", "cc")
arrp.update(2, "ff")
// arrp = Array("what", "when") // error because val

///if else
var m = 90
if(m == 11) // functional style returns the last statement returns 98
  m = 99    // has side effects - bad
else
  m = 98

val n = if(m == 90) 80 else 81 // n == 80


// while loop // has side effects no return
var p = 4

while(p < 8)
{
   println(p)
   p += 1
}

do{
  println(p)
  p = p + 1
}while(p<10)


// function definition

def min(x: Int, y: Int) = { // Int return type is automatically inferred
  if(x < y)
    x
  else
    y
}

min(3,4)

def add(x: Int, y: Int): Unit = { // does not return Int
  x+y
}

add(5,6) // return nothing


// tuples
val t1 = (4,5,"a")
println(t1._1)
println(t1._2)
println(t1._3)

def sumAndDiff(x: Int, y: Int): (Int, Int) ={ // should mention return type
  (x+y, x-y)
}

sumAndDiff(8,3)

// max tuples limit is 22

val r1 = 1 + 2
val r2 = 1.+(2)

// similarly

val r3 = "jinta"
val r4 = r3.charAt(3)
val r5 = r3 charAt 3

List(2,3,4).map(_*6)
List(2,3,4) map {_*6}

System.out.println("hello")
System.out println "hello"

// apply rewrite
val args3 = Array("what", "when", "why")
//internally calls
val args4 = Array.apply("what", "when", "why")

args4(1)
args4.apply(1)

// update rewrite
args3(2) = "No"
args3
args4.update(2, "No")
args4

/// List
val l1 = List(2,3,4)

def lengthList(l :List[Any]) = l.size
lengthList(l1)
// :: becomes right associative
// l1.::(1).::(2)
val l2 = 1 :: l1
val l3 = 1 :: 2 :: l1 // (1,2,2,3,4)

l1.::(2).::(1)

List(4,5,6) ::: l1 // (4,5,6,2,3,4)

// Array mutable , List Immutable

def squareAllThings(ff : List[Int]) = {
  ff.map(f => {f*f})
}

squareAllThings(List(4,5,6))

// set

val s2 = Set(2,3,4,2,4,6,7)

import scala.collection._

val s3 = mutable.Set(1,2,3)
var s4 = immutable.Set(4,5,6)

// immutable cannot be updated
// mutable can be updated

s3 -= 3 // replaces s3 itself
s4 -= 5 // updates s4

// maps

val m1 = mutable.Map('a' -> 1, 'b' -> 2)
var m2 = immutable.Map('x' -> 4, 'y' -> 6)

m2 += 'z' -> 7
m2

m1 += 't' -> 18
m1

