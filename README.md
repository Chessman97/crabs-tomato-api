# crabs-tomato-api
tomato by crabs
URL: https://crabs-tomato-api.herokuapp.com/
API:
## GET 
  * / 
    * стартовая страница приложения
  * /api/tomato 
    * получение статистики, количество томатов в день
## POST 
  * /api/tomato
    * добавление количества томатов по дате
    * параметры 
      - date (строка) - дата в виде "dd.mm.YYYY" 
      - count (целое число) - количество томатов.
