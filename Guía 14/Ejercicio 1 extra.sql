-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
select nombre from jugadores order by nombre;
-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
select nombre,peso,posicion from jugadores where peso>200 and posicion='c';
-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
select nombre from equipos order by nombre;
-- 4. Mostrar el nombre de los equipos del este (East).
select nombre,conferencia from equipos where conferencia='east';
-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select nombre,ciudad from equipos where ciudad like 'c%' order by nombre;
-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
select j.nombre,e.nombre from jugadores j inner join equipos e on j.nombre_equipo=e.nombre order by e.nombre;
-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select j.nombre,e.nombre from jugadores j inner join equipos e on j.nombre_equipo=e.nombre where e.nombre='raptors' order by e.nombre;
-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
select j.nombre,es.puntos_por_partido from jugadores j inner join estadisticas es on j.codigo=es.jugador where nombre='pau gasol';
-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
select j.nombre,es.puntos_por_partido,es.temporada from jugadores j inner join estadisticas es on j.codigo=es.jugador where nombre='pau gasol' and temporada='04/05';
-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
select j.nombre,round(sum(es.puntos_por_partido),2) as 'Total de puntos' from jugadores j inner join estadisticas es on codigo=jugador group by j.nombre;
-- 11. Mostrar el número de jugadores de cada equipo.
select e.nombre,count(j.nombre) as 'cantidad de jugadores' from equipos e inner join jugadores j on e.nombre=j.nombre_equipo group by e.nombre;
-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
select j.nombre,es.puntos_por_partido from jugadores j inner join estadisticas es on j.codigo=es.jugador order by es.puntos_por_partido desc limit 1;
-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
select e.nombre,e.conferencia,e.division from equipos e inner join jugadores j on e.nombre=j.nombre_equipo order by altura desc limit 1;
-- 14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
SELECT p1.equipo_local, p1.equipo_visitante, ABS(p1.puntos_local - p1.puntos_visitante) AS diferencia
FROM partidos p1
JOIN (
  SELECT MAX(ABS(puntos_local - puntos_visitante)) AS max_diferencia
  FROM partidos
) p2
ON ABS(p1.puntos_local - p1.puntos_visitante) = p2.max_diferencia;

-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
SELECT codigo, equipo_local, equipo_visitante,
       CASE
           WHEN puntos_local > puntos_visitante THEN equipo_local
           WHEN puntos_local < puntos_visitante THEN equipo_visitante
           ELSE NULL
       END AS equipo_ganador
FROM partidos;

-- Tablas.
select * from equipos;
select * from estadisticas;
select * from jugadores;
select * from partidos;

-- Otra forma de hacer el 15  (con error porque no devuelve los NULL).
SELECT partidos.codigo, partidos.equipo_local, partidos.equipo_visitante, equipos.Nombre as 'Equipo ganador'
FROM partidos JOIN equipos ON partidos.equipo_local or partidos.equipo_visitante = equipos.Nombre
WHERE equipos.Nombre in ((SELECT equipo_local FROM equipos WHERE puntos_local> puntos_visitante limit 1), 
(SELECT equipo_visitante FROM equipos WHERE puntos_local< puntos_visitante limit 1))
LIMIT 0, 1000;