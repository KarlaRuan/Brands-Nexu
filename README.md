# Brands-Nexu
Test Backend Nexu

Notas de cómo resolvería ciertos puntos
-Crear brand
Para crear la marca en el atributo de average_price la voy a obtener sacando la media de los modelos que pertenecen a esa marca y así setearia el valor en ese campo.
También debo asegurarme que no exista, entonces debo realizar una búsqueda antes de insertar el dato, si ya existe enviaría un error indicando que el valor no se puede duplicar, si no existe ahora si procedería a hacer el insert. La consulta en sql podría ser así: SELECT name FROM brand WHERE name LIKE '%Toyota%', si no trae nada es que no existe y lo inserta, si trae información manda error de duplicidad.

-Listado de modelos por marca
En este punto los obtendré con un get mandando el id de la marca, para así traer todos los modelos pertenecientes a esa marca algo así:
http://localhost:8080/brands/2/models con este ejemplo obtendría el listado de los modelos de la marca 2, la consulta podría quedar así:
SELECT name, average_price FROM model WHERE id_brand={id} y le pasaría el id que lleva el get.

-Crear modelos en una marca
Lo realizaría con un post para mandar la información del nuevo modelo y es muy importante tener el id de la marca a la cual se relacionará ese nuevo modelo. Si la marca no existe se enviaría un error.
Sería necesario validar que average_price sea mayor a 100000, podría hacerce con un if
if(model.getAverage_price()>100000) se guarda, si no es así podría mandar un error

-Traer modelos con filtro (usando un rango en el precio promedio)
Al realizar el get sería necesario enviar también el número máximo O mínimo con la cual se realizará la búsqueda, en sql podría quedar así la consulta:
SELECT name, average_price FROM models WHERE average_price>120000 OR average_price<5000000, con esto traería los modelos que son mayores a 120000 o menores a 500000, según el dato que se mande




