(ns alexanderjamesking.blog
  (:require [alexanderjamesking.html :refer :all])
  (:use [hiccup.core]
        [hiccup.page]
        [hiccup.element :only [link-to]]))

(defn content []
  (wrapper
   :blog
   [:div {:class "pure-g"}
    [:div {:class "pure-u-1 pure-u-md-4-5"}

     [:h1 "Alexander James King"]

     [:article
      [:a {:href "https://www.exoscale.com/syslog/continuous-delivery-circleci/"} [:h3 "Building a Continuous Delivery Pipeline using CircleCI and Docker"]]
      [:p "An article I wrote for " (link-to "https://www.exoscale.com" "Exoscale") " explaining the differences between Continuous Integration, Continuous Delivery and Continuous deployment, with an example showing how to setup a CircleCI pipeline that deploys to Exoscale following a successful build."]]

     [:article
      [:a {:href "/posts/clojure-spies-stubs-mocks"} [:h3 "Spy"]]
      [:p "Clojure and ClojureScript library for stubs, spies and mocks"]]

     [:article
      [:a {:href "/posts/clojurescript-minesweeper"} [:h3 "ClojureScript Minesweeper"]]
      [:p "Implementation of the classic game Minesweeper in ClojureScript"]]

     [:article
      [:a {:href "/posts/clojure-from-java-xml-to-json"} [:h3 "Calling Clojure from Java to transform XML to JSON"]]
      [:p "Example of calling Clojure from Java to transform XML to a Map then to JSON"]]

     [:article
      [:a {:href "/posts/clojure-core-async-http-request"} [:h3 "Clojure core.async HTTP request"]]
      [:p "Requests 20 snippets from http://fssnip.net sequentially and in parallel, profiles using timbre and outputs the results."]]

     [:article
      [:a {:href "/posts/node-js-aws-sdk-js-sns-sqs-example"} [:h3 "SNS, SQS and Node.js"]]
      [:p "A simple Node.js example that publishes a message to a SNS topic, then consumes the message using a SQS queue."]]]

    (sidebar)]))
