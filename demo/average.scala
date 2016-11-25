object average{
	def main(args: Array[String]) {
      println( "Returned Value : " + average( List(1,2,5,7) ));
    }
	def average[T]( ts: Iterable[T] )( implicit num: Numeric[T] ) = { 
		num.toDouble( ts.sum ) / ts.size
	}

}