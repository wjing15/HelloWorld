package Collection

object NQueens extends App {
  def queens(n: Int): Set[List[Int]] = {
    def placeQueens(k: Int): Set[List[Int]] =
      if (k == 0) Set(List())
      else
        for {
          queens <- placeQueens(k - 1)
          col <- 0 until n
          if isSafe(col, queens)
        } yield col :: queens
        
    placeQueens(n)
  }

    def isSafe(col: Int, queens: List[Int]): Boolean = {
      val row = queens.length
      val queenWithRow = (row - 1 to 0 by -1) zip queens
      queenWithRow forall{
        case (r, c) => col !=c && math.abs(col -c) != row -r
      }
    }
  println(
    queens(4)
  )
}
