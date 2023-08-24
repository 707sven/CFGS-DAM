xquery version "1.0" encoding "utf-8";
(:1.- busqueda de vehiculo con matricula

<consulta>El vehiculo con matricula 6732KPC es
{//coche[@matricula="6732KPC"]/marca/text()}</consulta>/text()
:)

(:2.- mostrar una lista enumerada de coches
for $x at $contador in //coche
return <coche>{$contador}.-{$x/marca/text()}</coche>
:)

(: 3.- ejemplo de consulta x-query
<consulta>
El coche con matricula 6732KPC es un {doc("C:\Users\usuario\Downloads\concesionario.xml")//coche[@matricula="6732KPC"]/marca/text()}.
</consulta>
:)

(:4.- tabla de multiplicar:)
for $x in (5)
for $y in (0 to 10)
return <multiplicar>{$x} * {$y}</multiplicar>

(: 5.- 
:)
