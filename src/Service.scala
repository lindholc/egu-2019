class CatalogService[F[_]: Effect](
  alg: CatalogAlgebra[F]
) extends Http4sDsl[F] {

  val service: HttpService[F] =
    HttpService[F] {
      case GET -> Root / "hapi" / "catalog" =>
        val res = for {
          version <- HapiService.version.pure[F]
          status  <- Status.`1200`.pure[F]
          catalog <- alg.getCatalog
        } yield Catalog(version, status, catalog)
        res.flatMap(catalog => Ok(catalog.asJson))
    }
}
