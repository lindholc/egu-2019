class NoOpInterpreter[F[_]: Applicative]
    extends HapiInterpreter[F] {

  override val getCatalog: F[List[Dataset]] =
    List.empty[Dataset].pure[F]

  // ...
}
