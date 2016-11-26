object kth_largest{
	def findKth[myList](k:Int, myList: Array[Int]):Int =  {
		var arrLen = myList.length;
		for(i<-0 to (arrLen - 1)) {
			for(j<-0 to (arrLen - 2)) {
				if(myList(j) > myList(j+1)) {
					var temp = myList(j);
					myList(j) = myList(j+1);
					myList(j+1) = temp;
				}
			}
		}
		//sorting array ascending order
		println(k+"th largest element is: "+myList((myList.length - k)));
		return myList((myList.length - k));
	}

	def main(args: Array[String]) {
		var myList = Array(5,2,7,3,1);
		findKth((2),myList);
	}
}
