```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)
  val result = list.foldLeft(0)(_ + _)
  println(result) // Output: 15

  val map = Map("a" -> 1, "b" -> 2, "c" -> 3)
  val sum = map.values.sum
  println(sum) // Output: 6

  // Incorrect usage of foldLeft to find the maximum value 
  val max = list.foldLeft(0)( (acc, elem) => if (elem > acc) elem else acc)
  println(max) // Output: 5

  // Incorrect usage of foldLeft to find the maximum value in an empty list
  val emptyList = List[Int]()
  val maxEmpty = emptyList.foldLeft(0)( (acc, elem) => if (elem > acc) elem else acc)
  println(maxEmpty) // Output: 0. This is unexpected if there is no maximum
}
```