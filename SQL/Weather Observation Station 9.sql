select DISTINCT CITY from STATION
where CITY NOT REGEXP "^[aeiou].*"
;