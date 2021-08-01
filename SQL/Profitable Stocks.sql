select price_tomorrow.stock_code
from
price_today, price_tomorrow
where price_today.stock_code = price_tomorrow.stock_code AND 
price_tomorrow.price > price_today.price