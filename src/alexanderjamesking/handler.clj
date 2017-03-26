(ns alexanderjamesking.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [alexanderjamesking.home :as home]
            
            [alexanderjamesking.blog.clojure-from-java-xml-to-json :as clj-from-java])
  (:use [hiccup.core]
        [hiccup.page]))

(defroutes app-routes
  (GET "/" [] (alexanderjamesking.home/content))
  (GET "/blog" [] (alexanderjamesking.blog/content))
  (GET "/cv" [] (alexanderjamesking.cv/content))
  (GET "/posts/clojure-from-java-xml-to-json" []
       (alexanderjamesking.blog.clojure-from-java-xml-to-json/content))
  (GET "/posts/clojure-core-async-http-request" []
       (alexanderjamesking.blog.02-core-async-http/content))
  (GET "/posts/node-js-aws-sdk-js-sns-sqs-example" []
       (alexanderjamesking.blog.01-sns-sqs-node/content))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
