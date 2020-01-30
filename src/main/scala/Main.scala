import java.util.Date

case class Cat(name : String, race : String, age: Int)
case class Person(firstName: String, lastName: String, salary: Int, numberOfChildren : Int, age : Int)
case class Car(brand: String, countryOfBirth: String, maxSpeed: Int, speeds: Int)
case class Film(mainActors: Seq[String], dateOfRelease: Date)
case class Actor(name: String, filmsPlayed: Seq[String])

object Main extends App {

  val Judy = Cat("Judy", "MainCoon", 6)
  val John = Person("John", "Doe", 0, 0, 20)
  val R8 = Car("Audi", "Germany", 250, 100)
  val Al = Actor("Pacino", Seq("Scarface", "Godfather", "Devil advocate"))
  println(Al)
}