# The LASP HAPI Server

## Abstract
We present a standalone data server implementing the Heliophysics
Application Programmer’s Interface (HAPI) 2.0 specification
(https://github.com/hapi-server/data-specification) developed by the
Laboratory for Atmospheric and Space Physics (LASP) at the University
of Colorado Boulder. Our server is built on the LaTiS library,
enabling reuse of LaTiS’s existing adapters to a variety of data
sources. It may also be used to expose datasets already served by
LaTiS through a HAPI interface. Our implementation is open source and
developed on GitHub: https://github.com/lasp/hapi-server

We have deployed an instance of the LASP HAPI server to provide access
to a subset of datasets available on the LASP Interactive Solar
Irradiance Datacenter (LISIRD), which is available here:
http://lasp.colorado.edu/lisird/hapi

HAPI is an interoperable, REST-style interface to timeseries data. It
provides mechanisms for viewing a catalog of datasets, accessing
dataset metadata, and streaming datasets subset both in time and
parameters.

LaTiS is both a library and a service for manipulating and serving
data modeled using the functional data model. The functional data
model is a specialization of the relational data model in which
relations are strengthened to functions, providing richer semantics
useful for representing scientific data. LaTiS is open source and
developed on GitHub: https://github.com/latis-data

## Building

Just run `make`. You'll need to have [Nix][nix] installed.

[nix]: https://nixos.org/nix/
