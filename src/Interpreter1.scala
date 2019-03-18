class Latis2Interpreter[F[_]: Sync]
    extends HapiInterpreter[F] {

  override val getCatalog: F[List[Dataset]] =
    Sync[F].delay {
      new CatalogReader().getDataset() match {
        case dm.Dataset(Function(it)) =>
          it.map {
            case Sample(Text(name), _) =>
              Dataset(name)
          }.toList
      }
    }

  // ...
}
