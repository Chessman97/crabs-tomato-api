(ns tomato-api.core
  (:require [tomato-api.handler :refer :all]
            [ring.adapter.jetty :refer [run-jetty]]))

(defn -main [port-number]  
  (run-jetty tomato-api.handler/app {:port (Integer. port-number)}))
