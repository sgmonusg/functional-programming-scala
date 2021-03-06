object rotate {
	def main(args: Array[String]) {
      println( "Returned Value : " + rotate((2), List(1,2,5,7) ));
    }
  	def rotate[A](n: Int, ls: List[A]): List[A] = {
    	val nBounded = if (ls.isEmpty) 0 else n % ls.length
    	if (nBounded < 0) rotate(nBounded + ls.length, ls)
    	else (ls drop nBounded) ::: (ls take nBounded)
  	}
}