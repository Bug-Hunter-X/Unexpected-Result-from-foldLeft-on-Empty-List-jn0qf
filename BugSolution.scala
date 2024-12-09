```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)
  val result = list.foldLeft(0)(_ + _)
  println(result) // Output: 15

  val map = Map("a" -> 1, "b" -> 2, "c" -> 3)
  val sum = map.values.sum
  println(sum) // Output: 6

  // Correct way to find the maximum value
  val max = list.maxOption
  println(max) // Output: Some(5)

  // Correct way to handle empty list
  val emptyList = List[Int]()
  val maxEmpty = emptyList.maxOption
  println(maxEmpty) // Output: None
}
```