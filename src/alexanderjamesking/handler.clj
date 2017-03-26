(ns alexanderjamesking.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [alexanderjamesking.home :as home]
            [alexanderjamesking.blog :as blog]
            [alexanderjamesking.cv :as cv]
            [alexanderjamesking.blog.01-sns-sqs-node :as article-sns]
            [alexanderjamesking.blog.02-core-async-http :as article-async-http]
            [alexanderjamesking.blog.03-clojure-from-java-xml-to-json :as article-java-xml]
            )
  (:use [hiccup.core]
        [hiccup.page]))

(defroutes app-routes
  (GET "/" [] (home/content))
  (GET "/blog" [] (blog/content))
  (GET "/cv" [] (cv/content))
  (GET "/posts/clojure-from-java-xml-to-json" []
       (article-java-xml/content))
  (GET "/posts/clojure-core-async-http-request" []
       (article-async-http/content))
  (GET "/posts/node-js-aws-sdk-js-sns-sqs-example" []
       (article-sns/content))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
