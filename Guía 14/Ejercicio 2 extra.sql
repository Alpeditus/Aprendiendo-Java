-- 1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
select codigo_oficina, ciudad from oficina;
-- 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
select ciudad, telefono from oficina where pais = 'España';
-- 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
select nombre, apellido1, apellido2, email from empleado where codigo_jefe = 7;
-- 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
select puesto, nombre, apellido1, apellido2 from empleado where puesto = 'director general';
-- 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
select nombre, apellido1, apellido2, puesto from empleado where not puesto = 'representante ventas';
-- 6. Devuelve un listado con el nombre de los todos los clientes españoles.
select nombre_cliente, pais from cliente where pais = 'spain';
-- 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
select estado from pedido;
/*8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan
repetidos. Resuelva la consulta:
o Utilizando la función YEAR de MySQL.
o Utilizando la función DATE_FORMAT de MySQL.
o Sin utilizar ninguna de las funciones anteriores.*/
select distinct codigo_cliente from pago where year(fecha_pago)=2008;
select distinct codigo_cliente from pago where date_format(fecha_pago, '%Y') = '2008'; -- tener en cuenta mayúsculas, '%y' no tira resultados.
select distinct codigo_cliente from pago where fecha_pago>='2008-01-01' and fecha_pago<='2008-12-31';
-- 9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos que no han sido entregados a tiempo.
select codigo_pedido,codigo_cliente,fecha_esperada,fecha_entrega from pedido where fecha_entrega > fecha_esperada;
/* 10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha
esperada.
o Utilizando la función ADDDATE de MySQL.
o Utilizando la función DATEDIFF de MySQL. */
select codigo_pedido,codigo_cliente,fecha_esperada,fecha_entrega from pedido where fecha_entrega <= adddate(fecha_esperada,-2);
select codigo_pedido,codigo_cliente,fecha_esperada,fecha_entrega from pedido where datediff(fecha_entrega,fecha_esperada) <= -2;
-- 11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
select codigo_pedido, estado from pedido where estado = 'rechazado';
-- 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
select distinct codigo_pedido,fecha_entrega from pedido where date_format(fecha_entrega,'%M') = 'january'; -- '%m' hay que usar números para el mes y '%M' hay que poner el mes en texto.
-- 13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal. Ordene el resultado de mayor a menor.
select forma_pago, fecha_pago from pago where date_format(fecha_pago,'%Y') = '2008' order by fecha_pago desc;
-- 14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en cuenta que no deben aparecer formas de pago repetidas.
select distinct forma_pago from pago;
-- 15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de
-- venta, mostrando en primer lugar los de mayor precio.
select nombre, gama, cantidad_en_stock from producto where gama = 'ornamentales' and cantidad_en_stock > 100 order by precio_venta desc;
-- 16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de ventas tenga el código de empleado 11 o 30.
select nombre_cliente, ciudad, codigo_empleado_rep_ventas from cliente where ciudad = 'madrid' and (codigo_empleado_rep_ventas = 11 or codigo_empleado_rep_ventas = 30);
/* Consultas multitabla (Composición interna)
Las consultas se deben resolver con INNER JOIN.
1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante
de ventas. */
select nom.nombre_cliente as Cliente, emp.nombre as Representante, emp.apellido1 as 'Apellido 1', emp.apellido2 as 'Apellido 2' from cliente nom inner join empleado emp 
on nom.codigo_empleado_rep_ventas = emp.codigo_empleado;
-- 2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
select cl.nombre_cliente, pa.fecha_pago, em.nombre,em.apellido1 
from cliente cl 
inner join pago pa on cl.codigo_cliente = pa.codigo_cliente 
inner join empleado em on cl.codigo_empleado_rep_ventas;
-- 3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.
select cl.nombre_cliente, em.nombre,em.apellido1
from cliente cl 
inner join empleado em on cl.codigo_empleado_rep_ventas = em.codigo_empleado
where cl.codigo_cliente not in(select distinct codigo_cliente from pago);
-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.



select * from cliente;
select * from detalle_pedido;
select * from empleado;
select * from gama_producto;
select * from oficina;
select * from pago;
select * from pedido;
select * from producto;