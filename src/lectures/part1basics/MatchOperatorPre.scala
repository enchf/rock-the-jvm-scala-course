package lectures.part1basics

/**
 * Given an integer, , perform the following conditional actions:
 * If is odd, print Weird
 * If is even and in the inclusive range of 2 to 5, print Not Weird
 * If is even and in the inclusive range of 6 to 20, print Weird
 * If is even and greater than 20, print Not Weird
 */
object MatchOperatorPre {
  val x = 1
  if ((x % 2) == 1 || (6 to 20 contains x)) "Weird" else "Not Weird"
}
