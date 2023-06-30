select * from empleados;
select * from departamentos;
select nombre_depto from departamentos;
select nombre,sal_emp from empleados;
select comision_emp from empleados;
select * from empleados where cargo_emp = 'Secretaria';
select * from empleados where cargo_emp = 'Vendedor' order by nombre;
select nombre, cargo_emp from empleados order by sal_emp;
select nombre_jefe_depto from departamentos where ciudad = 'ciudad real';
select nombre as 'Nombre', cargo_emp as 'Cargo' from empleados;
select sal_emp, comision_emp from empleados where id_depto = 2000 order by comision_emp;
select nombre,(sal_emp+comision_emp+500) as 'Total_pagar' from empleados where id_depto = 3000;
select * from empleados where nombre like 'j%';
select nombre,sal_emp,comision_emp,(sal_emp+comision_emp) as salario_total from empleados where comision_emp > 1000;
select nombre,sal_emp,comision_emp,(sal_emp+comision_emp) as salario_total from empleados where not comision_emp;
select nombre from empleados where comision_emp > sal_emp;
select nombre from empleados where comision_emp <= (sal_emp*0.3);
select * from empleados where nombre not like '%ma%';
select nombre_depto from departamentos where nombre_depto in ('ventas','mantenimiento','investigación'); -- = 'ventas' or nombre_depto = 'mantenimiento' or nombre_depto ='investigación';
select nombre_depto from departamentos where not nombre_depto in ('ventas','mantenimiento','investigación'); -- = 'ventas' and not nombre_depto = 'mantenimiento' and not nombre_depto ='investigación';
select MAX(sal_emp) from empleados;
SELECT MAX(nombre) FROM empleados order by nombre;
select max(sal_emp), min(sal_emp),(max(sal_emp)-min(sal_emp)) as diferencia from empleados;
select id_depto, round(avg(sal_emp),2) as 'Promedio de salarios' from empleados group by id_depto; -- Trabajando sobre la tabla EMPLEADOS.
SELECT d.nombre_depto, round(AVG(e.sal_emp),2) AS salario_promedio FROM departamentos d INNER JOIN empleados e ON d.id_depto = e.id_depto GROUP BY d.id_depto; -- Trabajando sobre las 2 tablas.
select d.nombre_depto as 'Departamento', count(e.nombre) as 'Cant. de empleados' from departamentos d inner join empleados e on d.id_depto=e.id_depto group by d.nombre_depto having count(e.nombre)>3; -- Ejercicio 25.
select d.nombre_depto as 'Departamento', count(e.nombre) as 'Cant. de empleados' from departamentos d inner join empleados e on d.id_depto=e.id_depto group by d.nombre_depto having count(e.nombre)=0; -- Ejercicio 26.
select nombre,sal_emp,id_depto from empleados where sal_emp>= (select avg(sal_emp) from empleados) order by id_depto;