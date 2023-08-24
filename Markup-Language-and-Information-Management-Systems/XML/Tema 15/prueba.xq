xquery version "1.0" encoding "UTF-8";

(:Mostrar los títulos de los libros con la etiqueta "titulo":)
(:
for $x in //book/title
return <titulo>{$x/text}</titulo>
:)

(:Mostrar los libros cuyo precio sea menos o igual a 30. Primero incluyendo la condición where y luego en la ruta del XPATH :)
(:
for $x in //book 
where $x/price<=30
return $x
:)

(: Mostrar el titulo y el autor de los libros del año 2005, y etiquetar cada uno de ellos con "lib2005":)
(:
for $x in //book
where $x/year = 2005
return <lib2005>{$x/title, $x/author}</lib2005>
:)

(:Mostrar los años de publicación, primero con un for y luego con un let. Etiquetar la salida con "publicacion":)
(:
for $x in //book
return <publicacion>{$x/year/text()}</publicacion>

let $x := //year
return <publicacion>{$x/text()}</publicacion>
:)

(:Mostrar los libros ordenados primero por category y por titulo, en una sola consulta:)
(:
for $x in //book
order by $x/@category, $x/title
return $x
:)

(:Mostrar cuantos libros hay, y etiquetarlo con "total":)
(:for $x in count(//book)
return <total>{$x}</total>

let $cantidad :=count(//book)
return <total>{$cantidad}</total>
:)

(:Mostrar los titulos de los libros y al final una etiqueta con el número total de libros:)
(:
let $total := count(//book)
let $titulos := (for $li in //book/title
                  return <r>{$li/text()}</r>)
return <titulo>{$titulos}
             <total>{$total}</total>
      </titulo>
:)

(:Mostrar el precio minimo y maximo de los libros:)
(:
let $min := min(//book/price)
let $max := max(//book/price)
return <total>
{$min || ' ' || $max}
</total>
:)

(:Mostrar el titulo del libro, su precio y su precio con el IVA incluido, cada uno con su propia etiqueta. Ordenalos por precio con IVA:)
(:
for $libro in //book
let $precio_iva := ($libro/price * 1.21)
order by $precio_iva descending
return
<libro>
  <titulo>{$libro/title/text()}</titulo>
  <precio>{$libro/price/text()}</precio>
  <precio_iva>{$precio_iva}</precio_iva>
</libro>
:)

(:Mostrar el título y el número de autores que tiene cada título en etiquetas diferentes:)
(:
for $libro in //book
let $numero := count ($libro/author)
return
  <libro>
  { $libro/title/text()}, { $numero}
  </libro>
:)

(:Mostrar el titulo de los libros escritos en años que terminen en 3:)
(:
for $libro in //book
where ends-with ($libro/year, "3")
return $libro/title/text()
:)

(:Mostrar los libros que tengan una X mayúscula o una minúscula en el titulo de forma descendente:)
(:
for $x in //book/title
where contains (upper-case($x), "X")
order by $x descending
return $x
:)

(:Mostrar el titulo y el numero de caracteres que tiene cada titulo, cada uno con su propia etiqueta:)
(:
for $libros in //book/title
return <libros> {$libros/text()}, {string-length($libros)}</libros>
:)

(:Mostrar el titulo de los libros cuyo titulo tenga menos de 15 caracteres o más de 20:)
(:
for $libros in //book/title
let $caracter := string-length($libros)
where ($caracter<15)or($caracter > 20)
return <libro>{$libros/text()}, {$caracter}</libro>
:)

(:Mostrar todos los años en los que se ha publicado un libro, eliminando los repetidos:)(:
for $año in distinct-values(//book/year)
return $año
:)

(:Mostrar los autores eliminando los que se repiten y ordenarlos por el número de caracteres que tiene cada autor:)
for $x in distinct-values(//book/author)
order by string-length($x)
return $x

