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

     [:h1 "Alexander James King"]

     [:article
      [:p "An enthusiastic, hard working, senior software engineer, passionate about delivering clean, well tested code, that is easy for others to understand."]]

     [:div {:id "app" :class "minesweeper"}]
     [:script {:src "/js/minesweeper.js"}]

     ]

    (sidebar)]))
