select * from empleados;
select * from departamentos;
select nombre_depto from departamentos;
select nombre,sal_emp from empleados;
select comision_emp from empleados;
select * from empleados where cargo_emp = 'Secretaria';
select * from empleados where cargo_emp = 'Vendedor' order by nombre;
select nombre, cargo_emp from empleados order by sal_emp;
select nombre_jefe_depto from departamentos where ciudad = 'ciudad real';
select nombre, cargo_emp from empleados;
select sal_emp, comision_emp from empleados where id_depto = 2000 order by comision_emp;
select nombre,(sal_emp+comision_emp+500) as 'Total_pagar' from empleados where id_depto = 3000;
select * from empleados where nombre like 'j%';
select nombre,sal_emp,comision_emp,(sal_emp+comision_emp) as salario_total from empleados where comision_emp > 1000;
select nombre,sal_emp,comision_emp,(sal_emp+comision_emp) as salario_total from empleados where not comision_emp;
select nombre from empleados where comision_emp > sal_emp;
select nombre from empleados where comision_emp <= (sal_emp*0.3);
select * from empleados where nombre not like '%ma%';
select nombre_depto from departamentos where nombre_depto = 'ventas' or nombre_depto = 'mantenimiento' or nombre_depto ='investigación';
select nombre_depto from departamentos where not nombre_depto = 'ventas' and not nombre_depto = 'mantenimiento' and not nombre_depto ='investigación';
select MAX(sal_emp) from empleados;
SELECT MAX(nombre) FROM empleados order by nombre;
select max(sal_emp), min(sal_emp),(max(sal_emp)-min(sal_emp)) as diferencia from empleados;
select avg(sal_emp) from empleados;
