import java.util.Date
import java.text.SimpleDateFormat

case class Cat(name : String, race : String, age: Int)
case class Person(firstName: String, lastName: String, salary: Int, numberOfChildren : Int, age : Int)
case class Car(brand: String, countryOfBirth: String, maxSpeed: Int, speeds: Int)
case class Film(mainActors: Seq[String], dateOfRelease: Date)
case class Actor(name: String, filmsPlayed: Seq[String])

object Main extends App {
  val format = new SimpleDateFormat("dd/MM/yyyy") 
  var date = format.parse("22/05/1970")  

  val judy = Cat("Judy", "MainCoon", 6)
  val john = Person("John", "Doe", 0, 0, 20)
  val r8 = Car("Audi", "Germany", 250, 100)
  val devileAdvocate = Film(Seq("Al Pacino", "Keanu Reeves"), date)
  val al = Actor("Pacino", Seq("Scarface", "Godfather", "Devil advocate"))
  
  println(devileAdvocate)
}