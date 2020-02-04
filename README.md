# tp-scala
school exercice to practice scala-lang

Le but de ce projet est de faire en sorte de réutiliser le maximum d’outils du langage Scala vus en cours.   

En entrée, le fichier « example.csv » contient plusieurs lignes différentes ; chaque ligne correpond à chacun des objets suivants :  
	1.	Cat(name : String, race : String, age: Int)  
	2.	Person(firstName: String, lastName: String, salary: Int, numberOfChildren: Int)  
	3.	Car(brand: String, countryOfBirth: String, maxSpeed: Int, speeds: Int)  
	4.	Film(mainActors: Seq[String], dateOfRelease: Date)  
	5.	Actor(name: String, filmsPlayed: Seq[String])  
		Dans le dataset, les champs sont séparés par « , », et les listes sont séparées par « ; »  

Une case class devrait correspondre à chacun des types ci-dessus.  

Votre programme devrait « détecter » quelle ligne correspond à quel objet et stocker son contenu dans celui-ci. Il faudra ensuite écrire une fonction qui permettra de déduire le type d’une ligne qui serait passée en paramètres. Cela va sans dire que toutes les fonctions que vous serez amenés à utiliser devront être pures.

## How to run

https://www.scala-lang.org/download/
explain how to install Scala using SBT & VScode

nobrain command list :
```
brew tap AdoptOpenJDK/openjdk
brew cask install adoptopenjdk8
brew install sbt
brew install scala 
sbt run // in the directory
```

the terminal should return :
```
[info] running Main 
line : 1 Cat(Judy,Maincoon,6)
line : 2 Person(John,Doe,0,0,20)
line : 4 Car(Audi,Germany,250,100)
line : 6 Film(List(Al Pacino, Keanu Reeves),Thu Jan 01 00:00:00 CET 1970)
line : 7 Actor(Pacino,List(Scarface, Godfather, Devil advocat))
[success] Total time: 12 s, completed 4 févr. 2020 15:36:42
```