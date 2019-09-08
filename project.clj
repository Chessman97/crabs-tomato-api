 (defproject tomato-api "1.0"
   :description "Clojure - top"
   
   :dependencies [[org.clojure/clojure "1.10.0"]                  
                  [metosin/compojure-api "2.0.0-alpha26"]
                  [ring/ring-jetty-adapter "1.6.3"]
                  [org.clojure/tools.logging "0.5.0"]]   
   
   :ring {:handler tomato-api.handler/app}
   
   :main tomato-api.handler
   
   :uberjar-name "tomato.jar"
   
   :profiles {:dev {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]]                   
                    :plugins [[lein-ring "0.12.5"]]}})

