let
  pkgs = import <nixpkgs> {};

  # minted uses pygments
  pygments = pkgs.python35.withPackages (ps: with ps; [ pygments ]);

  texlive = pkgs.texlive.combine {
    inherit (pkgs.texlive)
    scheme-small

    # For the tikzposter document class.
    tikzposter
    a0poster
    xstring

    # For source code listings.
    minted
    framed
    fvextra
    ifplatform
    cm-super;
  };
in {
  poster = pkgs.stdenv.mkDerivation {
    name = "poster";
    src = ./.;

    buildInputs = [
      texlive
      pygments
    ];
  };
}
