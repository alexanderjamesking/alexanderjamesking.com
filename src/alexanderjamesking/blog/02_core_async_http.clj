(ns alexanderjamesking.blog.02-core-async-http
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
     [:h2 "Clojure core.async HTTP request"]
     [:p "Requests 20 snippets from " (link-to "http://fssnip.net" "fssnip.net")
      " sequentially and in parallel, profiles using timbre and outputs the results."]
     [:script {:src "https://gist.github.com/alexanderjamesking/b3221658538514655142abc2c8821e20.js"}]]
    (sidebar)]))
