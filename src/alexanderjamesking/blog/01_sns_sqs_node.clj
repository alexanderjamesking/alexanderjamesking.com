(ns alexanderjamesking.blog.01-sns-sqs-node
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
     [:h2 "SNS, SQS and Node.js"]
     [:p "A simple Node.js example that publishes a message to a SNS topic, then consumes the message using a SQS queue."]
     [:p (link-to "https://github.com/alexanderjamesking/node-hello-aws-sns-sqs"
                  "Full source code") " (AWS Credentials omitted)"]
     
     [:h3 "AWS Console Steps"]
     [:ol
      [:li "Set up SNS Topic"]
      [:li "Set up SQS Queue"]
      [:li "Set permissions on the Queue to allow the topic to publish to it"]
      [:li "Subscribe the Queue to the SNS Topic"]
      [:li "Set up IAM User and give the user access to SNS and SQS"]
      [:li "Create and download the IAM User credentials"]]

     [:h3 "Sample code"]
     [:script {:src "https://gist.github.com/alexanderjamesking/d7d852db0188f64965da.js"}]

     ]
    
    
    (sidebar)]))

