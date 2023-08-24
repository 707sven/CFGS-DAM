xquery version "1.0" encoding "UTF-8";

(:13. Mostrar el tipo de animal cuyo año de nacimiento contenga un 3 o su peso contenga un 0. Además, sólo deberá mostrarse aquellos que pertenezcan al continente africano. Ordena el resultado por año de nacimiento descendiente.:)
for $x in //zoologico/animal
where contains($x/anio_nacimiento, "3")or contains($x/peso, "0")and contains($x/continente, "Africa")
order by $x/anio_nacimiento descending
return <animal>{$x/tipo/text()}</animal>


