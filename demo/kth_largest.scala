
object findKth{
	def main(args: Array[String]) {
      println( "Returned Value : " + findKth((2) , List(1,2 ,3 ,5,7) ) );
    }

	def findKth[A](k:Int, l:List[A])={
    	l.sorted
    	return l(k)
	}
}
