(ns alexanderjamesking.home
  (:require [alexanderjamesking.html :refer :all])
  (:use [hiccup.core]
        [hiccup.page]
        [hiccup.element :only [link-to]]))

(defn content []
  (wrapper
   :home
   [:div {:class "pure-g"}
    [:div {:class "pure-u-1 pure-u-md-4-5"}
     [:img {:src "/images/alex-on-a-volcano.jpg" :class "pure-img"}]
     
     [:h1 "Alexander James King"]
     [:article 
      [:p "An enthusiastic, hard working, senior software engineer, passionate about delivering clean, well tested code, that is easy for others to understand."]]

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

