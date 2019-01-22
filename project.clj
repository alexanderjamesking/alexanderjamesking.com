(defproject alexanderjamesking "0.1.0-SNAPSHOT"
  :description "alexanderjamesking.com"
  :url "http://alexanderjamesking.com"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.6.1"]
                 [hiccup "1.0.5"]
                 [ring/ring-defaults "0.3.1"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler alexanderjamesking.handler/app}
  :resource-paths ["resources"]
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
