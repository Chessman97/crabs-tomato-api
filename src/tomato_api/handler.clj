(ns tomato-api.handler
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [tomato-api.db :as db]
            [schema.core :as s]))

(s/defschema Tomato
  {:date s/Str :count s/Int})

(def app
  (api
    {:swagger 
     {:ui "/"
      :spec "/swagger.json"
      :data {:info {:title "Tomato-api by crabs"
                    :description "Api для проложения сбора и отображения статистики сделанных помидорок"}
             :tags [{:name "api" :description "работа со статистикой"}]}}}
  
    (context "/api" [] 
      :tags["api"]
  
      (GET "/tomato" []
        :return [Tomato]
        :summary "Получение статистики количества томатов по дням"
        (ok (db/get-all-tomatos)))
  
      (POST "/tomato" [date count]
        :body [body Tomato]
        :return s/Str
        :summary "Добавление статистики количества томатов по дате"
        (db/add-tomato date count)
        (ok "Помидоры успешно добавлены!")))))

