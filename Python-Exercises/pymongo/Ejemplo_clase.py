#importamos librería pymongo
import pymongo

#Creamos la conexión a mongodb
myclient = pymongo.MongoClient("mongodb://localhost:27017/")

#Creamos la base de datos mydatabase
mydb = myclient["mydatabase"]

#Mostramos un listado de las bases de datos
print(myclient.list_database_names())

#Comprobamos que nuestra base de datos está en el listado de bd
dblist = myclient.list_database_names()
if "mydatabase" in dblist:
  print("La base de datos existe")

#Creamos una colección customers
mycol = mydb["customers"]

#Comprobar que existe la colección
print(mydb.list_collection_names())
collist = mydb.list_collection_names()
if "customers" in collist:
  print("La colección existe")

#Trabajamos con la colección customers (mycol)

#Inserción de documentos en la colección 
mydict = { "name": "John", "address": "Highway 37" }
x = mycol.insert_one(mydict)
#inserted_id devuelve el identificador del documento insertado
print(x.inserted_id)

#Insertamos otro documento
mydict = { "name": "Peter", "address": "Lowstreet 27" }
x = mycol.insert_one(mydict)
print(x.inserted_id)

#Inserción de varios documentos
mylist = [
  { "_id": 1, "name": "John", "address": "Highway 37"},
  { "_id": 2, "name": "Peter", "address": "Lowstreet 27"},
  { "_id": 3, "name": "Amy", "address": "Apple st 652"},
  { "_id": 4, "name": "Hannah", "address": "Mountain 21"},
  { "_id": 5, "name": "Michael", "address": "Valley 345"},
  { "_id": 6, "name": "Sandy", "address": "Ocean blvd 2"},
  { "_id": 7, "name": "Betty", "address": "Green Grass 1"},
  { "_id": 8, "name": "Richard", "address": "Sky st 331"},
  { "_id": 9, "name": "Susan", "address": "One way 98"},
  { "_id": 10, "name": "Vicky", "address": "Yellow Garden 2"},
  { "_id": 11, "name": "Ben", "address": "Park Lane 38"},
  { "_id": 12, "name": "William", "address": "Central st 954"},
  { "_id": 13, "name": "Chuck", "address": "Main Road 989"},
  { "_id": 14, "name": "Viola", "address": "Sideway 1633"}
]

x = mycol.insert_many(mylist)

#Imprime los ids de los documentos insertados
print(x.inserted_ids)

#Método Find
#Encuentra el primer documento en la colección customers
x = mycol.find_one()
print(x)

#Devuelve todos los documentos de la colección
for x in mycol.find():
  print(x)

#Devuelve algunos documentos de la colección
for x in mycol.find({},{ "_id": 0, "name": 1, "address": 1 }):
  print(x)
#No se puede especificar valores 0 y 1 en el mismo objeto (solo _id puede ser 0)  
for x in mycol.find({},{ "name": 1, "address": 0 }):
  print(x)

#Filtrar la búsqueda. Filtrar por dirección Park Lane 38
myquery = { "address": "Park Lane 38" }
mydoc = mycol.find(myquery)
for x in mydoc:
  print(x)

#Filtrar consultas avanzadas. Direcciones mayores que "S" 
myquery = { "address": { "$gt": "S" } }
mydoc = mycol.find(myquery)
for x in mydoc:
  print(x)

#Ordenar el resultado. Utilizamos sort(nombre_campo) 1 asc -1 desc
#Ordenamos la colección por el campo nombre
mydoc = mycol.find().sort("name",-1)
for x in mydoc:
  print(x)

#Eliminar documentos. Eliminar documento cuya dirección es Mountain 21
myquery = { "address": "Mountain 21" }
mycol.delete_one(myquery)

#Eliminar todos los documentos
x = mycol.delete_many({})
print(x.deleted_count, " documentos eliminados.")



#Actualizar doucmentos de una colección. update_one/update_many
#Actualiza un documento
myquery = { "address": "Valley 345" }
newvalues = { "$set": { "address": "Canyon 123" } }
mycol.update_one(myquery, newvalues)

#Imprime los clientes después de actualizar:
for x in mycol.find():
  print(x)

#Borrar colección
mycol.drop()


   

