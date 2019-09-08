(ns tomato-api.handler
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [tomato-api.db :as db]))

(def app
  (api
 
    (GET "/" []
      (ok {:text-for-max "Володя сказал - Володя сдедал!"}))
    
    (GET "/api/tomato" []
      (ok {:result (db/get-all-tomatos)}))
  
    (POST "/api/tomato" [date count]
      (db/add-tomato date count)
      (ok {:result "Помидори успешно добавлены!"}))))

