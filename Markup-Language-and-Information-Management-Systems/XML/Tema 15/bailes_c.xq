xquery version "1.0" encoding "UTF-8";
(:1. Mostrar cada uno de los nombres de los bailes con la etiqueta "losbailes"
for $x in //baile
return <losbailes>{$x/nombre/text()}</losbailes>
:)

(:2. Mostrar los nombres de los bailes seguidos con el número de plazas entre paréntesis, ambos dentro de la misma etiqueta "losbailes"
for $x in //baile
return <losbailes>{$x/nombre/text()}({$x/plazas/text()})</losbailes>
:)

(:3. Mostrar los nombres de los bailes cuyo precio sea mayor de 30
for $x in //baile
where ($x/precio > 30)
return <losbailes>{$x/nombre/text()}</losbailes>
:)

(:4. Mostrar los nombres de los bailes cuyo precio sea mayor de 30 y la moneda "euro"
for $x in //baile
where ($x/precio > 30) and ($x/precio/@moneda = "euro")
return <losbailes>{$x/nombre/text()}</losbailes>
:)

(:5. Mostrar los nombres y la fecha de comienzo de los bailes que comiencen el mes de enero (utiliza para buscarlo la cadena de texto "/1/")
for $x in //baile
where contains ($x/comienzo, "/1/")
return <losbailes>{$x/nombre/text()} - {$x/fecha/text()}</losbailes>
:)

(:6. Mostrar los nombres de los profesores y la sala en la que dan clase, ordénalos por sala
for $x in //baile
order by $x/sala
return <losbailes>{$x/profesor/text()}, {$x/sala/text()}</losbailes>
:)

(:7. Mostrar los nombres de los profesores eliminando los repetidos y acompañar cada nombre con todas las salas en la que da clase, ordénalos por nombre
for $x in distinct-values(//baile/profesor)
let $sala := //baile[profesor=$x]/sala
order by $x
return <losbailes>{$x}, {distinct-values($sala)}</losbailes>
:)

(:8. Mostrar la media de los precios de todos los bailes
let $media := avg(//baile/precio)
return $media
:)

(:9. Mostrar la suma de los precios de los bailes de la sala 1
let $suma := sum(//baile[sala=1]/precio)
return $suma
:)

(:10. Mostrar cuántas plazas en total oferta el profesor "Jesus Lozano"
let $plazas := sum(//baile[profesor="Jesus Lozano"]/plazas)
return $plazas
:)

(:11. Mostrar el dinero que ganaría la profesora "Laura Mendiola" si se completaran todas las plazas de su baile, sabiendo que solo tiene un baile
let $x := (//baile[profesor="Laura Mendiola"])
return $x/precio*$x/plazas
:)

(:12. Mostrar el dinero que ganaría el profesor "Jesus Lozano" si se completaran toda las plazas de su baile, pero mostrando el beneficio de cada baile por separado
for $x in //baile[profesor="Jesus Lozano"]
let $y := (//$x[profesor="Jesus Lozano"]/precio) * (//$x[profesor = "Jesus Lozano"]/plazas)
return <beneficio>{$x/nombre/text()}, {$y}</beneficio>
:)

(:13. Mostrar el nombre del baile, su precio y el precio con un un descuento del 15% para familias numerosas. Ordenar por el nombre del baile:)
for $x in //baile
order by $x/nombre
return <bailes>{$x/nombre,$x/precio/text()} - Familia Numerosa: {$x/precio*0.85}</bailes>

(:14. Mostrar el dinero que ganaría la profesora "Laura (no conocemos su apellido) si se completaran todas las plazas de su baile"
for $x in //baile
where contains($x/profesor,"Laura")
let $pasta := ($x/precio) * ($x/plazas)
return $pasta
:)