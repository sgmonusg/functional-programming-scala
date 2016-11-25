object reverse{
	def main(args: Array[String]) {
      println( "Returned Value : " + reverse( List(1,2,5,7) ));
    }
	def reverse[A](ls: List[A]) = {
		ls.reverse
	}
}