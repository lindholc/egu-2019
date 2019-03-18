trait CatalogAlgebra[F[_]] {
  val getCatalog: F[List[Dataset]]
}
