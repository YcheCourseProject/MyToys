- instruction(require higher os version)

```zsh
brew tap homebrew/science
brew install graph-tool
```

- terminal info log

```
Updating Homebrew...
==> Auto-updated Homebrew!
Updated 1 tap (homebrew/science).
No changes to formulae.

==> Installing graph-tool from homebrew/science
==> Installing dependencies for homebrew/science/graph-tool: gmp, mpfr, libmpc, isl, gcc, boost, boost-python, libsigc++, libpng, libffi, pcre, glib, cairomm, cgal, google-sparsehash, libtiff, pkg-config, readline, sqlite, gdbm, python, gobject-introspection, shared-mime-info, gdk-pixbuf, atk, libepoxy, harfbuzz, pango, hicolor-icon-theme, gsettings-desktop-schemas, gtk+3, numpy, scipy, matplotlib, py2cairo, gnome-icon-theme, libcroco, librsvg, pygobject3
==> Installing homebrew/science/graph-tool dependency: gmp
==> Downloading https://homebrew.bintray.com/bottles/gmp-6.1.2.sierra.bottle.1.t
######################################################################## 100.0%
==> Pouring gmp-6.1.2.sierra.bottle.1.tar.gz
🍺  /usr/local/Cellar/gmp/6.1.2: 18 files, 3.1MB
==> Installing homebrew/science/graph-tool dependency: mpfr
==> Downloading https://homebrew.bintray.com/bottles/mpfr-3.1.5.sierra.bottle.ta
######################################################################## 100.0%
==> Pouring mpfr-3.1.5.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/mpfr/3.1.5: 25 files, 3.6MB
==> Installing homebrew/science/graph-tool dependency: libmpc
==> Downloading https://homebrew.bintray.com/bottles/libmpc-1.0.3_1.sierra.bottl
######################################################################## 100.0%
==> Pouring libmpc-1.0.3_1.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/libmpc/1.0.3_1: 12 files, 344.9KB
==> Installing homebrew/science/graph-tool dependency: isl
==> Downloading https://homebrew.bintray.com/bottles/isl-0.18.sierra.bottle.tar.
######################################################################## 100.0%
==> Pouring isl-0.18.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/isl/0.18: 80 files, 3.8MB
==> Installing homebrew/science/graph-tool dependency: gcc
==> Downloading https://homebrew.bintray.com/bottles/gcc-6.3.0_1.sierra.bottle.t
######################################################################## 100.0%
==> Pouring gcc-6.3.0_1.sierra.bottle.tar.gz
==> Caveats
GCC has been built with multilib support. Notably, OpenMP may not work:
  https://gcc.gnu.org/bugzilla/show_bug.cgi?id=60670
If you need OpenMP support you may want to
  brew reinstall gcc --without-multilib
==> Summary
🍺  /usr/local/Cellar/gcc/6.3.0_1: 1,436 files, 273.2MB
==> Installing homebrew/science/graph-tool dependency: boost
==> Downloading https://homebrew.bintray.com/bottles/boost-1.64.0_1.sierra.bottl
######################################################################## 100.0%
==> Pouring boost-1.64.0_1.sierra.bottle.tar.gz
ls
🍺  /usr/local/Cellar/boost/1.64.0_1: 12,628 files, 395.7MB
==> Installing homebrew/science/graph-tool dependency: boost-python
==> Downloading https://homebrew.bintray.com/bottles/boost-python-1.64.0.sierra.
######################################################################## 100.0%
==> Pouring boost-python-1.64.0.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/boost-python/1.64.0: 458 files, 16.7MB
==> Installing homebrew/science/graph-tool dependency: libsigc++
==> Downloading https://homebrew.bintray.com/bottles/libsigc++-2.10.0.sierra.bot
######################################################################## 100.0%
==> Pouring libsigc++-2.10.0.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/libsigc++/2.10.0: 679 files, 14MB
==> Installing homebrew/science/graph-tool dependency: libpng
==> Downloading https://homebrew.bintray.com/bottles/libpng-1.6.29.sierra.bottle
######################################################################## 100.0%
==> Pouring libpng-1.6.29.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/libpng/1.6.29: 26 files, 1.2MB
==> Installing homebrew/science/graph-tool dependency: libffi
==> Downloading https://homebrew.bintray.com/bottles/libffi-3.2.1.sierra.bottle.
######################################################################## 100.0%
==> Pouring libffi-3.2.1.sierra.bottle.tar.gz
==> Caveats
This formula is keg-only, which means it was not symlinked into /usr/local.

Some formulae require a newer version of libffi.

For compilers to find this software you may need to set:
    LDFLAGS:  -L/usr/local/opt/libffi/lib
For pkg-config to find this software you may need to set:
    PKG_CONFIG_PATH: /usr/local/opt/libffi/lib/pkgconfig

==> Summary
🍺  /usr/local/Cellar/libffi/3.2.1: 16 files, 297.0KB
==> Installing homebrew/science/graph-tool dependency: pcre
==> Downloading https://homebrew.bintray.com/bottles/pcre-8.40.sierra.bottle.tar
######################################################################## 100.0%
==> Pouring pcre-8.40.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/pcre/8.40: 204 files, 5.4MB
==> Installing homebrew/science/graph-tool dependency: glib
==> Downloading https://homebrew.bintray.com/bottles/glib-2.52.0.sierra.bottle.t
######################################################################## 100.0%
==> Pouring glib-2.52.0.sierra.bottle.tar.gz
==> Using the sandbox
🍺  /usr/local/Cellar/glib/2.52.0: 430 files, 22.5MB
==> Installing homebrew/science/graph-tool dependency: cairomm
==> Downloading https://homebrew.bintray.com/bottles/cairomm-1.12.2.sierra.bottl
######################################################################## 100.0%
==> Pouring cairomm-1.12.2.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/cairomm/1.12.2: 258 files, 3.9MB
==> Installing homebrew/science/graph-tool dependency: cgal
==> Downloading https://homebrew.bintray.com/bottles/cgal-4.9.1.sierra.bottle.ta
######################################################################## 100.0%
==> Pouring cgal-4.9.1.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/cgal/4.9.1: 2,976 files, 31.8MB
==> Installing homebrew/science/graph-tool dependency: google-sparsehash
==> Downloading https://homebrew.bintray.com/bottles/google-sparsehash-2.0.3.sie
######################################################################## 100.0%
==> Pouring google-sparsehash-2.0.3.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/google-sparsehash/2.0.3: 48 files, 606.8KB
==> Installing homebrew/science/graph-tool dependency: libtiff
==> Downloading https://homebrew.bintray.com/bottles/libtiff-4.0.7_3.sierra.bott
######################################################################## 100.0%
==> Pouring libtiff-4.0.7_3.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/libtiff/4.0.7_3: 248 files, 3.4MB
==> Installing homebrew/science/graph-tool dependency: pkg-config
==> Downloading https://homebrew.bintray.com/bottles/pkg-config-0.29.2.sierra.bo
######################################################################## 100.0%
==> Pouring pkg-config-0.29.2.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/pkg-config/0.29.2: 11 files, 627KB
==> Installing homebrew/science/graph-tool dependency: readline
==> Downloading https://homebrew.bintray.com/bottles/readline-7.0.3_1.sierra.bot
######################################################################## 100.0%
==> Pouring readline-7.0.3_1.sierra.bottle.tar.gz
==> Caveats
This formula is keg-only, which means it was not symlinked into /usr/local.

macOS provides the BSD libedit library, which shadows libreadline.
In order to prevent conflicts when programs look for libreadline we are
defaulting this GNU Readline installation to keg-only.


For compilers to find this software you may need to set:
    LDFLAGS:  -L/usr/local/opt/readline/lib
    CPPFLAGS: -I/usr/local/opt/readline/include

==> Summary
🍺  /usr/local/Cellar/readline/7.0.3_1: 46 files, 1.5MB
==> Installing homebrew/science/graph-tool dependency: sqlite
==> Downloading https://homebrew.bintray.com/bottles/sqlite-3.18.0.sierra.bottle
######################################################################## 100.0%
==> Pouring sqlite-3.18.0.sierra.bottle.tar.gz
==> Caveats
This formula is keg-only, which means it was not symlinked into /usr/local.

macOS provides an older sqlite3.

If you need to have this software first in your PATH run:
  echo 'export PATH="/usr/local/opt/sqlite/bin:$PATH"' >> ~/.zshrc

For compilers to find this software you may need to set:
    LDFLAGS:  -L/usr/local/opt/sqlite/lib
    CPPFLAGS: -I/usr/local/opt/sqlite/include
For pkg-config to find this software you may need to set:
    PKG_CONFIG_PATH: /usr/local/opt/sqlite/lib/pkgconfig

==> Summary
🍺  /usr/local/Cellar/sqlite/3.18.0: 11 files, 3.0MB
==> Installing homebrew/science/graph-tool dependency: gdbm
==> Downloading https://homebrew.bintray.com/bottles/gdbm-1.13.sierra.bottle.tar
######################################################################## 100.0%
==> Pouring gdbm-1.13.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/gdbm/1.13: 19 files, 554.4KB
==> Installing homebrew/science/graph-tool dependency: python
==> Downloading https://homebrew.bintray.com/bottles/python-2.7.13.sierra.bottle
######################################################################## 100.0%
==> Pouring python-2.7.13.sierra.bottle.1.tar.gz
==> /usr/local/Cellar/python/2.7.13/bin/python -s setup.py --no-user-cfg install
==> /usr/local/Cellar/python/2.7.13/bin/python -s setup.py --no-user-cfg install
==> /usr/local/Cellar/python/2.7.13/bin/python -s setup.py --no-user-cfg install
==> Caveats
Pip and setuptools have been installed. To update them
  pip install --upgrade pip setuptools

You can install Python packages with
  pip install <package>

They will install into the site-package directory
  /usr/local/lib/python2.7/site-packages

See: http://docs.brew.sh/Homebrew-and-Python.html
==> Summary
🍺  /usr/local/Cellar/python/2.7.13: 3,526 files, 48MB
==> Installing homebrew/science/graph-tool dependency: gobject-introspectio
==> Downloading https://homebrew.bintray.com/bottles/gobject-introspection-1.52.
######################################################################## 100.0%
==> Pouring gobject-introspection-1.52.0_1.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/gobject-introspection/1.52.0_1: 172 files, 9.6MB
==> Installing homebrew/science/graph-tool dependency: shared-mime-info
==> Downloading https://homebrew.bintray.com/bottles/shared-mime-info-1.8_1.sier
######################################################################## 100.0%
==> Pouring shared-mime-info-1.8_1.sierra.bottle.tar.gz
==> /usr/local/Cellar/shared-mime-info/1.8_1/bin/update-mime-database /usr/local
🍺  /usr/local/Cellar/shared-mime-info/1.8_1: 83 files, 4.4MB
==> Installing homebrew/science/graph-tool dependency: gdk-pixbuf
==> Downloading https://homebrew.bintray.com/bottles/gdk-pixbuf-2.36.6.sierra.bo
######################################################################## 100.0%
==> Pouring gdk-pixbuf-2.36.6.sierra.bottle.tar.gz
==> /usr/local/Cellar/gdk-pixbuf/2.36.6/bin/gdk-pixbuf-query-loaders --update-ca
🍺  /usr/local/Cellar/gdk-pixbuf/2.36.6: 214 files, 4.4MB
==> Installing homebrew/science/graph-tool dependency: atk
==> Downloading https://homebrew.bintray.com/bottles/atk-2.24.0.sierra.bottle.ta
######################################################################## 100.0%
==> Pouring atk-2.24.0.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/atk/2.24.0: 209 files, 3.3MB
==> Installing homebrew/science/graph-tool dependency: libepoxy
==> Downloading https://homebrew.bintray.com/bottles/libepoxy-1.4.2.sierra.bottl
######################################################################## 100.0%
==> Pouring libepoxy-1.4.2.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/libepoxy/1.4.2: 11 files, 2.5MB
==> Installing homebrew/science/graph-tool dependency: harfbuzz
==> Downloading https://homebrew.bintray.com/bottles/harfbuzz-1.4.6.sierra.bottl
######################################################################## 100.0%
==> Pouring harfbuzz-1.4.6.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/harfbuzz/1.4.6: 133 files, 5.3MB
==> Installing homebrew/science/graph-tool dependency: pango
==> Downloading https://homebrew.bintray.com/bottles/pango-1.40.5.sierra.bottle.
######################################################################## 100.0%
==> Pouring pango-1.40.5.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/pango/1.40.5: 105 files, 5.0MB
==> Installing homebrew/science/graph-tool dependency: hicolor-icon-theme
==> Downloading https://homebrew.bintray.com/bottles/hicolor-icon-theme-0.15.sie
######################################################################## 100.0%
==> Pouring hicolor-icon-theme-0.15.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/hicolor-icon-theme/0.15: 6 files, 48.5KB
==> Installing homebrew/science/graph-tool dependency: gsettings-desktop-sc
==> Downloading https://homebrew.bintray.com/bottles/gsettings-desktop-schemas-3
######################################################################## 100.0%
==> Pouring gsettings-desktop-schemas-3.24.0.sierra.bottle.tar.gz
==> /usr/local/opt/glib/bin/glib-compile-schemas /usr/local/share/glib-2.0/schem
🍺  /usr/local/Cellar/gsettings-desktop-schemas/3.24.0: 93 files, 3.7MB
==> Installing homebrew/science/graph-tool dependency: gtk+3
==> Downloading https://homebrew.bintray.com/bottles/gtk+3-3.22.11.sierra.bottle
######################################################################## 100.0%
==> Pouring gtk+3-3.22.11.sierra.bottle.tar.gz
==> /usr/local/opt/glib/bin/glib-compile-schemas /usr/local/share/glib-2.0/schem
🍺  /usr/local/Cellar/gtk+3/3.22.11: 1,369 files, 69.4MB
==> Installing homebrew/science/graph-tool dependency: numpy
==> Downloading https://homebrew.bintray.com/bottles/numpy-1.12.1.sierra.bottle.
######################################################################## 100.0%
==> Pouring numpy-1.12.1.sierra.bottle.tar.gz
==> Caveats
Python modules have been installed and Homebrew's site-packages is not
in your Python sys.path, so you will not be able to import the modules
this formula installed. If you plan to develop with these modules,
please run:
  mkdir -p /Users/cheyulin/.local/lib/python2.7/site-packages
  echo 'import site; site.addsitedir("/usr/local/lib/python2.7/site-packages")' >> /Users/cheyulin/.local/lib/python2.7/site-packages/homebrew.pth
==> Summary
🍺  /usr/local/Cellar/numpy/1.12.1: 442 files, 9.6MB
==> Installing homebrew/science/graph-tool dependency: scipy
==> Downloading https://homebrew.bintray.com/bottles/scipy-0.19.0.sierra.bottle.
######################################################################## 100.0%
==> Pouring scipy-0.19.0.sierra.bottle.tar.gz
==> Caveats
Python modules have been installed and Homebrew's site-packages is not
in your Python sys.path, so you will not be able to import the modules
this formula installed. If you plan to develop with these modules,
please run:
  mkdir -p /Users/cheyulin/.local/lib/python2.7/site-packages
  echo 'import site; site.addsitedir("/usr/local/lib/python2.7/site-packages")' >> /Users/cheyulin/.local/lib/python2.7/site-packages/homebrew.pth
==> Summary
🍺  /usr/local/Cellar/scipy/0.19.0: 917 files, 43.2MB
==> Installing homebrew/science/graph-tool dependency: matplotlib
==> Downloading https://homebrew.bintray.com/bottles-science/matplotlib-2.0.0_1.
######################################################################## 100.0%
==> Pouring matplotlib-2.0.0_1.sierra.bottle.tar.gz
==> Caveats
If you want to use the `wxagg` backend, do `brew install wxpython`.
This can be done even after the matplotlib install.

Python modules have been installed and Homebrew's site-packages is not
in your Python sys.path, so you will not be able to import the modules
this formula installed. If you plan to develop with these modules,
please run:
  mkdir -p /Users/cheyulin/.local/lib/python2.7/site-packages
  echo 'import site; site.addsitedir("/usr/local/lib/python2.7/site-packages")' >> /Users/cheyulin/.local/lib/python2.7/site-packages/homebrew.pth
==> Summary
🍺  /usr/local/Cellar/matplotlib/2.0.0_1: 1,182 files, 20.1MB
==> Installing homebrew/science/graph-tool dependency: py2cairo
==> Downloading https://homebrew.bintray.com/bottles/py2cairo-1.10.0_1.sierra.bo
######################################################################## 100.0%
==> Pouring py2cairo-1.10.0_1.sierra.bottle.tar.gz
==> Caveats
Python modules have been installed and Homebrew's site-packages is not
in your Python sys.path, so you will not be able to import the modules
this formula installed. If you plan to develop with these modules,
please run:
  mkdir -p /Users/cheyulin/.local/lib/python2.7/site-packages
  echo 'import site; site.addsitedir("/usr/local/lib/python2.7/site-packages")' >> /Users/cheyulin/.local/lib/python2.7/site-packages/homebrew.pth
==> Summary
🍺  /usr/local/Cellar/py2cairo/1.10.0_1: 9 files, 116.5KB
==> Installing homebrew/science/graph-tool dependency: gnome-icon-theme
==> Downloading https://homebrew.bintray.com/bottles/gnome-icon-theme-3.24.0.sie
######################################################################## 100.0%
==> Pouring gnome-icon-theme-3.24.0.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/gnome-icon-theme/3.24.0: 5,433 files, 26.0MB
==> Installing homebrew/science/graph-tool dependency: libcroco
==> Downloading https://homebrew.bintray.com/bottles/libcroco-0.6.12.sierra.bott
######################################################################## 100.0%
==> Pouring libcroco-0.6.12.sierra.bottle.tar.gz
🍺  /usr/local/Cellar/libcroco/0.6.12: 80 files, 1.7MB
==> Installing homebrew/science/graph-tool dependency: librsvg
==> Downloading https://download.gnome.org/sources/librsvg/2.40/librsvg-2.40.17.
==> Downloading from https://mirrors.ustc.edu.cn/gnome/sources/librsvg/2.40/libr
######################################################################## 100.0%
==> ./configure --prefix=/usr/local/Cellar/librsvg/2.40.17 --disable-Bsymbolic -
==> make install gdk_pixbuf_binarydir=/usr/local/Cellar/librsvg/2.40.17/lib/gdk-
==> /usr/local/opt/gdk-pixbuf/bin/gdk-pixbuf-query-loaders --update-cache
🍺  /usr/local/Cellar/librsvg/2.40.17: 52 files, 1.6MB, built in 38 seconds
==> Installing homebrew/science/graph-tool dependency: pygobject3
==> Downloading https://homebrew.bintray.com/bottles/pygobject3-3.24.1.sierra.bo
######################################################################## 100.0%
==> Pouring pygobject3-3.24.1.sierra.bottle.tar.gz
==> Caveats
Python modules have been installed and Homebrew's site-packages is not
in your Python sys.path, so you will not be able to import the modules
this formula installed. If you plan to develop with these modules,
please run:
  mkdir -p /Users/cheyulin/.local/lib/python2.7/site-packages
  echo 'import site; site.addsitedir("/usr/local/lib/python2.7/site-packages")' >> /Users/cheyulin/.local/lib/python2.7/site-packages/homebrew.pth
==> Summary
🍺  /usr/local/Cellar/pygobject3/3.24.1: 37 files, 1.9MB
==> Installing homebrew/science/graph-tool
==> Downloading https://homebrew.bintray.com/bottles-science/graph-tool-2.22_2.s
######################################################################## 100.0%
==> Pouring graph-tool-2.22_2.sierra.bottle.tar.gz
==> Caveats
Python modules have been installed and Homebrew's site-packages is not
in your Python sys.path, so you will not be able to import the modules
this formula installed. If you plan to develop with these modules,
please run:
  mkdir -p /Users/cheyulin/.local/lib/python2.7/site-packages
  echo 'import site; site.addsitedir("/usr/local/lib/python2.7/site-packages")' >> /Users/cheyulin/.local/lib/python2.7/site-packages/homebrew.pth
==> Summary
🍺  /usr/local/Cellar/graph-tool/2.22_2: 247 files, 321.4MB
```
