select DISTINCT CITY from STATION
where CITY REGEXP "^[^aeiou].*[^aeiou]$"
;