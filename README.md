# Unexpected Result from foldLeft on Empty List in Scala

This example demonstrates an uncommon error when using `foldLeft` on an empty list in Scala.  `foldLeft` is a powerful function for accumulating results, but it has subtle behavior that can be easy to miss.  Specifically, when applied to an empty list, it simply returns the initial value provided.

This can lead to unexpected results when using `foldLeft` to find the maximum or minimum element of a list, because an empty list has no maximum or minimum value.  The code provided shows an example of this unexpected behavior, returning a default initial value instead of indicating that no maximum exists.

The solution demonstrates how to correctly handle the case of an empty list by explicitly checking for emptiness before using `foldLeft`. 