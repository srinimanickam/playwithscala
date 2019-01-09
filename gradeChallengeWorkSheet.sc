object gradeChallengeWorkSheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
    println("Welcome to the Scala worksheet")     //> Welcome to the Scala worksheet
  
  var grades = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97)
                                                  //> grades  : List[Int] = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97)
  val gMap = List("A",  "B", "C", "D", "F")       //> gMap  : List[String] = List(A, B, C, D, F)
  
 for (g <- grades) {
  val grade = g match {
    case a if 93 to 100 contains g => {
    				//println("Mark is ", g, "Grade A - 93-100 range: " + a)
   				gMap(0)
    				}
    case b if 86 to  92 contains g => {
    				//println("Grade  B-  86- 92 range: " + b)
    				gMap(1)
    				}
    case c if 77 to  85 contains g => {
    				//println("Grade  C - 77- 85 range: " + c)
    				gMap(2)
    				}
    case d if 69 to  76 contains g => {
    				//println( "Grade  D - 69- 76 range: " + d)
    				gMap(3)
    				}
    case e if  0 to  68 contains g => {
    				//println("Grade  E - 0- 68 range: " + e)
    				gMap(4)
    				}
    
    case _ => println("Hmmm...")
	}
	println("Mark is " + g + " *** Grade is " + grade)
 }                                                //> Mark is 100 *** Grade is A
                                                  //| Mark is 99 *** Grade is A
                                                  //| Mark is 75 *** Grade is D
                                                  //| Mark is 67 *** Grade is F
                                                  //| Mark is 89 *** Grade is B
                                                  //| Mark is 85 *** Grade is C
                                                  //| Mark is 92 *** Grade is B
                                                  //| Mark is 93 *** Grade is A
                                                  //| Mark is 60 *** Grade is F
                                                  //| Mark is 97 *** Grade is A
  val total = grades.foldLeft(0.0)( _+_)          //> total  : Double = 857.0
  
  println("Average Score " + total/grades.length) //> Average Score 85.7
  
}