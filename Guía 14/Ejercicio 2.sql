SELECT NOMBRE FROM PRODUCTO;
select * from producto;
-- Lista los nombres y los precios de todos los productos de la tabla producto.
SELECT NOMBRE, PRECIO FROM PRODUCTO;
-- Lista todas las columnas de la tabla producto.
SELECT * FROM PRODUCTO;
-- Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.
SELECT NOMBRE, ROUND(PRECIO) AS PRECIO_FINAL FROM PRODUCTO;
-- Lista el código de los fabricantes que tienen productos en la tabla producto.
SELECT f.codigo, f.nombre FROM fabricante f Inner join producto p on f.codigo=p.codigo_fabricante;
-- Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar los repetidos.
SELECT f.codigo, f.nombre FROM fabricante f Inner join producto p on f.codigo=p.codigo_fabricante group by f.codigo;
-- Lista los nombres de los fabricantes ordenados de forma ascendente.
SELECT NOMBRE FROM FABRICANTE ORDER BY NOMBRE;
-- Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente y en segundo lugar por el precio de forma descendente.
SELECT NOMBRE, PRECIO FROM PRODUCTO ORDER BY NOMBRE, PRECIO DESC;
-- Devuelve una lista con las 5 primeras filas de la tabla fabricante.
SELECT * FROM FABRICANTE LIMIT 5;
-- Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y LIMIT)
SELECT NOMBRE, PRECIO FROM PRODUCTO ORDER BY PRECIO LIMIT 1;
-- Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)
SELECT NOMBRE, PRECIO FROM PRODUCTO ORDER BY PRECIO DESC LIMIT 1;
-- Lista el nombre de los productos que tienen un precio menor o igual a $120.
SELECT NOMBRE, PRECIO FROM PRODUCTO WHERE PRECIO <= 120;
-- Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador BETWEEN.
SELECT NOMBRE, PRECIO FROM PRODUCTO WHERE PRECIO BETWEEN 60 AND 200;
-- Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN
SELECT * FROM PRODUCTO WHERE codigo_fabricante IN (1,3,5);
-- Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre.
SELECT * FROM PRODUCTO WHERE nombre Like '%Portátil%';
-- Devuelve una lista con el código del producto, nombre del producto, código del fabricante y nombre del fabricante, de todos los productos de la base de datos.
SELECT p.codigo, p.nombre, p.codigo_fabricante, f.nombre from producto p inner join fabricante f on f.codigo=p.codigo_fabricante;
select p.codigo, p.nombre,p.codigo_fabricante, f.nombre from fabricante f, producto p where f.codigo = p.codigo_fabricante;
-- Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por orden alfabético.
select p.nombre, p.precio, f.nombre from producto p, fabricante f where f.codigo = p.codigo_fabricante order by f.nombre;
-- Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más barato.
select p.nombre, p.precio, f.nombre from producto p, fabricante f where f.codigo = p.codigo_fabricante order by p.precio limit 1;
-- Devuelve una lista de todos los productos del fabricante Lenovo.
select p.nombre, f.nombre from producto p inner join fabricante f on f.codigo = p.codigo_fabricante where f.nombre = 'Lenovo';
-- Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que $200.
select p.nombre, p.precio, f.nombre from producto p inner join fabricante f on f.codigo = p.codigo_fabricante where p.precio >200 and f.nombre = "Crucial";
-- Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard. Utilizando el operador IN
select p.nombre, f.nombre from producto p inner join fabricante f on f.codigo = p.codigo_fabricante where f.nombre IN ("Asus", "Hewlett-Packard");
-- Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente)
select p.nombre, p.precio, f.nombre from producto p join fabricante f on f.codigo = p.codigo_fabricante where p.precio <= 180 order by f.nombre asc, p.precio desc; 
-- Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos fabricantes que no tienen productos asociados.
select * from fabricante f left join producto p on f.codigo = p.codigo_fabricante;
-- Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún producto asociado.
select * from fabricante f left join producto p on f.codigo = p.codigo_fabricante where p.nombre is NULL;
-- Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo from fabricante where nombre = "Lenovo");
-- Devuelve todos los datos de los productos que tienen el mismo precio que el producto más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).
-- Lista el nombre del producto más caro del fabricante Lenovo.
select * from producto where precio>= (select max(precio) from producto where codigo_fabricante = (select codigo from fabricante where nombre  = 'lenovo' ) )order by nombre desc limit 1;
-- Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de todos sus productos.
SELECT p.* FROM producto AS p INNER JOIN fabricante AS f ON p.codigo_fabricante = f.codigo WHERE f.nombre = 'Asus' AND p.precio > (SELECT AVG(precio) FROM producto WHERE codigo_fabricante = f.codigo);
-- Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN).
select nombre from fabricante where codigo in (select codigo_fabricante from producto group by codigo);
-- Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).
select nombre from fabricante where codigo not in (select codigo_fabricante from producto group by codigo);
-- Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de productos que el fabricante Lenovo.
SELECT f.nombre FROM fabricante f JOIN producto p ON f.codigo = p.codigo_fabricante GROUP BY f.codigo, f.nombre HAVING COUNT(p.codigo) = (SELECT COUNT(codigo) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Lenovo'));
