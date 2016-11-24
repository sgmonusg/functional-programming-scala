def findKth[A](k:Int, l:List[A]):A = k match { case 0 => l.head case k if k > 0 => findKth(k - 1,
l.tail) case _ => throw new NoSuchElementException }