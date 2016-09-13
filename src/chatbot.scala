
import scala.io.Source
import scala.util.Random
import scala.math


object textanalysis extends App {
   
var greetings = Array("hello","hi","hey","hey there","greetings","Hello","Hi","Hey","Greetings","Hola","hola")
var resp1 = Array("hello","hi","hey","hey there","greetings","hola!")
var status = -1;


var i2 = Array("how are you","how do you do")
var r2 = Array("I am good","Doing great!","Fine, thanks!","Amazing")

var i3 = Array("what is your name?","name","named")
var r3 = Array("My name is Scala","I am Scala","Scala is my name","I am Scala Scalable!")

var i4 = Array("book")
var r4 = Array("My favourite book is The Alchemist","The Alchemist by Paulo Coehlo","I prefer not to read these days","The Alchemist")

var i5 = Array("movie","film","blockbuster","netflix","hulu")
var r5 = Array("I never get tired of watching any James Bond flick!","007-James Bond","Bond, James Bond","Bond!")

var i6 = Array("sport")
var r6 = Array("Cricket! I come from India","Cricket","Test Match Cricket","Cricket, though badminton comes a close second")

var i7 = Array("football","NFL","EPL","League","soccer")
var r7 = Array("It's soccer for me","Manchester United is my team!","Football; English Premier League","Footy foot foot! Soccer it is")

var i8 = Array("weather","rain","snow","ice","freezing","sultry")
var r8 = Array("I am not that smart yet. I am just learning myself","ask google","weather.com might help","step out and decide for yourself")

var i9 = Array("GWU","GW","George Washington University")
var r9 = Array("It is in Foggy Bottom!","Located in Washington,DC","Next to the White House","Located on the banks of the Potomac in DC")

var i10 = Array("age","old","how old are you","born","birthday")
var r10 = Array("I am fairly young","Not too old","born in 2004!","I am still a kid if compared to Java")





println("Welcome\n")
println("Hello there! to end the chat type in 'bye bye' or 'quit'")
print(">>")

do{
  

val input = readLine()  
 for( i <- 0 to (greetings.length - 1)) 
 { 
  if(input.contains(greetings(i)))
  {
    status = 1
  }
 }
 for( i <- 0 to (i2.length - 1)) 
 {
  if(input.contains(i2(i)))
  {
    status = 2
  }
 } 
 for( i <- 0 to (i3.length - 1)) 
 {
  if(input.contains(i3(i)))
  {
    status = 3
  }
 } 
 for( i <- 0 to (i4.length - 1)) 
 {
  if(input.contains(i4(i)))
  {
    status = 4
  }
 } 
  for( i <- 0 to (i5.length - 1)) 
 {
  if(input.contains(i5(i)))
  {
    status = 5
  }
 }
   for( i <- 0 to (i6.length - 1)) 
 {
  if(input.contains(i6(i)))
  {
    status = 6
  }
 }
  for( i <- 0 to (i7.length - 1)) 
 {
  if(input.contains(i7(i)))
  {
    status = 7
  }
 }  
  for( i <- 0 to (i8.length - 1)) 
 {
  if(input.contains(i8(i)))
  {
    status = 8
  }
 } 
  for( i <- 0 to (i9.length - 1)) 
 {
  if(input.contains(i9(i)))
  {
    status = 9
  }
 }
  for( i <- 0 to (i10.length - 1)) 
 {
  if(input.contains(i10(i)))
  {
    status = 10
  }
 } 
  if(input.matches("quit") || input.contains("bye bye"))
  {
    status = 0
  }

  if(status==1)
  {
    var r = Random.nextInt(resp1.length)
    println(resp1(r)) 
    print(">>")
  }

  if(status==2)
  {
    var r = Random.nextInt(r2.length)
    println(r2(r))  
    print(">>")
  }
  
  if(status==3)
  {
    var r = Random.nextInt(r3.length)
    println(r3(r))  
    print(">>")
  }
  
  if(status==4)
  {
    var r = Random.nextInt(r4.length)
    println(r4(r))
    print(">>")
  }
  
  if(status==5)
  {
    var r = Random.nextInt(r5.length)
    println(r5(r))  
    print(">>") 
  }
  
  if(status==6)
  {
    var r = Random.nextInt(r6.length)
    println(r6(r))
    print(">>")
  }
  
  if(status==7)
  {
    var r = Random.nextInt(r7.length)
    println(r7(r))
    print(">>")
  }
  
  if(status==8)
  {
    var r = Random.nextInt(r8.length)
    println(r8(r))
    print(">>")
  }
  
  if(status==9)
  {
    var r = Random.nextInt(r9.length)
    println(r9(r))
    print(">>")
  }
  
  if(status==10)
  {
    var r = Random.nextInt(r10.length)
    println(r10(r))
    print(">>")
  }
  
  if(status== -1)
    println("I'm sorry but I did not get that, please try something else")
  

}while(status!=0)
  
println("Thank you for talking to me, I had a great time!")
  
  
}