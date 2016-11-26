object isPalindrome{
	def main(args: Array[String]) {
      println( "Returned Value : " + isPalindrome(List(1,2,5,7) ));
    }
	def isPalindrome[A](l: List[A]):Boolean = {
	    l == l.reverse
	}
}