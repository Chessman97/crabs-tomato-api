(ns tomato-api.handler
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [ring.adapter.jetty :refer [run-jetty]]))

(def tomatos (atom []))

(def app
  (api
 
    (GET "/api/tomato" []
      (ok {:result @tomatos}))
  
    (POST "/api/tomato" [date count]
      (swap! tomatos conj {:date date :count count})
      (ok {:result "Помидори успешно добавлены!"}))))

(defn -main [port-number]  
  (run-jetty app {:port (Integer. port-number)}))
