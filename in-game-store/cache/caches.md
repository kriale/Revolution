<b>Кеширование</b>
<hr/>
На главной странице закешированы 20 самых популярных предметов из всех категорий, 
а в каждой категории закешированы по 10 самых популярных товаров в этой категории
<br/><br/>
Когда пользователь заходит в магазин, поступает запрос на фронт.<br/>
<ol>
<li> Фронт отправляет запрос на получение популярных предметов в <b>Memcached</b> по ключу <b>store.main.popular</b>. 
<br/>В случае успеха список будет получен крайне быстро.</li>
<li> Если произошла ошибка или данных в Memecached не оказалось, то запрос перенапрявляется в <b>Redis</b> по тому же ключу.
<br/>В случае успеха список будет получен быстро.</li>
<li> Если произошла ошибка или данных в Redis не оказалось, то запрос перенаправляется к <b>БД</b>.
<br/>Данный случай будет самым медленным, но должен гарантированно предоставить список.</li>
</ol>
<br/>
Если пользователь переходит в какую-либо категорию, то происходит то же самое, но ключ меняется на <b>store.${category.name}.popular</b>
<br>
Обновление списка популярных товаров происходит автоматически сервером на основе количества совершенных продаж данного предмета.