(select CITY, length(CITY) from STATION ORDER BY length(city), city limit 1)
union
(select CITY, length(CITY) from STATION ORDER BY length(city) desc, city limit 1)
;