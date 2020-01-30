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
