object average{
	def average[T]( ts: Iterable[T] )( implicit num: Numeric[T] ) = { num.toDouble( ts.sum ) / ts.size }
}