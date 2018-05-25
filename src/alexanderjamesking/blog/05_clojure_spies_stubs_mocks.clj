(ns alexanderjamesking.blog.05-clojure-spies-stubs-mocks
  (:require [alexanderjamesking.html :refer :all]
            [alexanderjamesking.codemirror :refer :all]
            [clojure.string :as string])
  (:use [hiccup.core]
        [hiccup.page]
        [hiccup.element :only [link-to]]))

(def clojure-test (link-to "https://clojure.github.io/clojure/clojure.test-api.html" "clojure.test"))
(def midje (link-to "https://github.com/marick/Midje" "Midje"))
(def cider (link-to "https://github.com/clojure-emacs/cider" "Cider"))
(def mockito (link-to "http://site.mockito.org" "Mockito"))
(def sinon (link-to "http://sinonjs.org" "sinon.js"))

(def pure-functions (link-to "https://practicalli.github.io/clojure/thinking-functionally/pure-functions.html" "pure functions"))
(def impure-functions (link-to "https://practicalli.github.io/clojure/thinking-functionally/impure-functions.html" "impure functions"))

(def with-redefs (link-to "https://clojuredocs.org/clojure.core/with-redefs" "with-redefs"))

(def clj-constantly (link-to "https://clojuredocs.org/clojure.core/constantly" "constantly"))

(def spy (link-to "https://github.com/alexanderjamesking/spy" "Spy"))

(def spy-clojars (link-to "https://clojars.org/tortue/spy" [:img {:src "https://img.shields.io/clojars/v/tortue/spy.svg"}]))

(defn content []
  (wrapper
   :blog
   [:div {:class "pure-g"}
    [:div {:class "pure-u-1 pure-u-md-4-5"}
     [:h1 "Alexander James King"]
     [:h2 "Introducing Spy - a Clojure and ClojureScript library for stubs, spies and mocks"]
     [:h4 "April 28, 2018"]

     [:img {:src "/images/spy.svg" :width 400}]

     [:p (link-to "https://github.com/alexanderjamesking/spy" "https://github.com/alexanderjamesking/spy")]

     [:p "As of today, there are two main libraries used for testing in Clojure, " clojure-test " and " midje  ". " clojure-test " is extremely simple and it provides a very small API allowing you to write a basic test suite, " midje " on the other hand is slightly more complex but it provides a wealth of features."]

     [:p spy " is a library I have written that is aimed at " clojure-test " users, it can be used with both Clojure and ClojureScript. If you're using " midje " then it provides some similar helper functions so you likely don't need to use " spy "."]

     [:p "I wrote " spy " as I have a preference for " clojure-test " and I wanted some basic stubbing and spying features like those available in " sinon " or " mockito]

     [:h3 "Testing using Spy"]

     [:p "Let's start with the following example which looks up an email address given an id and a message then sends a message to that email address."]

     (include-codemirror)

     (code-sample (slurp "./src/alexanderjamesking/blog/05_spy/01.clj"))

     [:p "And let's assume for now that we want to test that send-message is called only when the id passed into the email-beatle function actually matches a beatle in our map."]

     [:p "We can use " with-redefs " to replace the send-message function with a spy, the original function is wrapped by the spy so we can test the function was called."]

     (code-sample (slurp "./src/alexanderjamesking/blog/05_spy/02.clj"))

     [:p "For more examples on using Spy to test your Clojure code head over to the GitHub project: " spy ". If you find this useful and want to contribute to the library feel free to contact me on GitHub or raise a PR."]]

    (sidebar)]))
