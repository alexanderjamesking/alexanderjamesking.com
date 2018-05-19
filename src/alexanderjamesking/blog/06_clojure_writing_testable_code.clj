(ns alexanderjamesking.blog.06-clojure-writing-testable-code
  (:require [alexanderjamesking.html :refer :all])
  (:use [hiccup.core]
        [hiccup.page]
        [hiccup.element :only [link-to]]))

(def pure-functions (link-to "https://practicalli.github.io/clojure/thinking-functionally/pure-functions.html" "pure functions"))
(def impure-functions (link-to "https://practicalli.github.io/clojure/thinking-functionally/impure-functions.html" "impure functions"))

(def with-redefs (link-to "https://clojuredocs.org/clojure.core/with-redefs" "with-redefs"))

     [:h3 "Writing testable code"]
     [:p "There are two types of function, " pure-functions " and " impure-functions "." ]

     [:h4 "Pure function"]
     [:p "A pure function is not affected by any other parts of the system, and can be tested simply by calling it."]
     [:script {:src "https://gist.github.com/alexanderjamesking/5e56bc34f8523f7c3cc6844bdd918fed.js"}]

     [:h4 "Impure function"]
     [:p "An impure function can be tested by using " with-redefs " to mock/stub out dependencies, but this isn't always possible if you're dealing with async code."]
     [:script {:src "https://gist.github.com/alexanderjamesking/70f3bbfe3874de965e437306bbd9847c.js"}]

     [:p "An alternative to using " with-redefs " is to refactor the function to make it a pure function:"]

     [:script {:src "https://gist.github.com/alexanderjamesking/f204ae13ad9db4983cf58f0d01c88e0f.js"}]
