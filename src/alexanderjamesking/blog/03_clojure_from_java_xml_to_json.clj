(ns alexanderjamesking.blog.03-clojure-from-java-xml-to-json
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
     [:h2 "Calling Clojure from Java to transform XML to JSON"]
     [:h4 "June 23, 2014"]
     [:p "Working with XML is painful in Java, there are many options such as DOM, SAX, StAX, JAXB, XSLT but they're all verbose compared to the equivalent code in Clojure where you can make use of Maps and Zippers."]
     [:p "In Clojure my approach is usually as follows:"]
     [:ol
      [:li "Parse the XML into a map"]
      [:li "Navigate the map using a zipper"]
      [:li "Create a new map with the values we're interested in"]
      [:li "Convert the new map to JSON"]]
     [:p "This example follows the above process but calls the Clojure code from Java, ideally I'd wrap this up in a library but to keep things simple I've invoked the dependencies from Java prior to calling the transform library." ]
     [:p "Source code on GitHub: "
      (link-to "https://github.com/alexanderjamesking/clj-from-java-xml-to-json"
               "https://github.com/alexanderjamesking/clj-from-java-xml-to-json")]
     [:p "Input: " (link-to "https://github.com/alexanderjamesking/clj-from-java-xml-to-json/blob/master/src/test/resources/champions-league.xml"
                            "champions-league.xml")]
     [:p "Output: " (link-to "https://github.com/alexanderjamesking/clj-from-java-xml-to-json/blob/master/src/test/resources/sample-output.json"
                             "sample-output.json")]

     [:h3 "Transform.java"]
     [:script {:src "https://gist.github.com/alexanderjamesking/f73be43212ce23636189471afaad4c93.js"}]
     [:h3 "transform.clj"]
     [:script {:src "https://gist.github.com/alexanderjamesking/05cfbd9ef6de28096fb45a1463c31287.js"}]]
    (sidebar)]))
