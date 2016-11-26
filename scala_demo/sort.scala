object bubble_sort{
	def bubSort[myList](myList: Array[Int]):Boolean =  {
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
		return true;
	}
	def main(args: Array[String]) {
		var myList = Array(5,2,7,3,1);
		bubSort(myList);
		//sorting array ascending order
		for(i<-0 to (myList.length-1)) {
			print(myList(i)+" ");
		}
		println();
	}
}
