object binary_search{
	def main(args: Array[String]) {
      println( "Returned Value : " + binary_search((3) , List(1,2 ,3 ,5,7) ) );
    }
	def binary_search(target:Int, l:List[Int]) = {
	    def recursion(low:Int, high:Int):Option[Int] = (low+high)/2 match{
	      case _ if high < low => None 
	      case mid if l(mid) > target => recursion(low, mid-1)      
	      case mid if l(mid) < target => recursion(mid+1, high)
	      case mid => Some(mid)
	    } 
	    recursion(0,l.size - 1)
	}
}