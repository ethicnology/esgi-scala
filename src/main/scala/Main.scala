import java.util.Date
import java.text.SimpleDateFormat
import scala.io.Source
import scala.util.Try

case class Cat(name : String, race : String, age: Int)
case class Person(firstName: String, lastName: String, salary: Int, numberOfChildren : Int, age : Int)
case class Car(brand: String, countryOfBirth: String, maxSpeed: Int, speeds: Int)
case class Film(mainActors: Seq[String], dateOfRelease: Date)
case class Actor(name: String, filmsPlayed: Seq[String])

object Main extends App {
  val format = new SimpleDateFormat("dd/MM/yyyy") 
  var date = format.parse("22/05/1970")
  val dataset = "./project/example.csv"

  val judy = Cat("Judy", "MainCoon", 6)
  val john = Person("John", "Doe", 0, 0, 20)
  val r8 = Car("Audi", "Germany", 250, 100)
  val devileAdvocate = Film(Seq("Al Pacino", "Keanu Reeves"), date)
  val al = Actor("Pacino", Seq("Scarface", "Godfather", "Devil advocate"))

  def tryToInt( s: String ) = Try(s.toInt).toOption


  var cpt : Int = 1
  val bufferedSource = Source.fromFile(dataset)
  for (line <- Source.fromFile(dataset).getLines) {
      val column = line.split(",").map(_.trim)
      if( column.length == 2){
        val firstSeq = column(0).split(";").map(_.trim)
        val secondSeq = column(1).split(";").map(_.trim)
        if (firstSeq.length == 2){
          //val film = Film(Seq(firstSeq(0), firstSeq(1)), date)
        } else if (secondSeq.length == 3){
          val actor = Actor(column(0), Seq(secondSeq(0),secondSeq(1),secondSeq(2)))
          println("line : " + cpt + " " + actor)
        }
      } else if(column.length == 3 && tryToInt(column(2)) != None){
        val cat = Cat(column(0), column(1), column(2).toInt)
        println("line : " + cpt + " " + cat)
      } else if(column.length == 4 && tryToInt(column(2)) != None && tryToInt(column(3)) != None){
        val car = Car(column(0), column(1), column(2).toInt, column(3).toInt)
        println("line : " + cpt + " " + car)
      } else if(column.length == 5 && tryToInt(column(2)) != None && tryToInt(column(3)) != None && tryToInt(column(4)) != None){
        val person = Person(column(0), column(1), column(2).toInt, column(3).toInt, column(4).toInt)
        println("line : " + cpt + " " + person)
      }
      cpt = cpt + 1
  }
  bufferedSource.close
}
