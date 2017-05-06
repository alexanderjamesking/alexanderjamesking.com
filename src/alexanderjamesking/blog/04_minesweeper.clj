(ns alexanderjamesking.blog.04-minesweeper
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
     [:h2 "ClojureScript Minesweeper"]
     [:h4 "May 6, 2017"]

     [:div {:id "app"
            :class "minesweeper"}]

     [:script {:src "/js/minesweeper.js"}]

     [:p "An implementation of minesweeper in ClojureScript, check out the "
      (link-to "https://github.com/alexanderjamesking/minesweeper"
               "source code") " on GitHub."]

     [:p "I drew all the graphics inline using SVG, rendering with React via Reagent."]
     [:p "I used " (link-to "https://github.com/bhauman/devcards" "Devcards") " to run the unit tests and to see what the UI components looked like in all states."]


     [:img {:src "/images/minesweeper-devcards1.png"
            :class "pure-img"}]

     [:img {:src "/images/minesweeper-devcards2.png"
            :class "pure-img"}]

     [:img {:src "/images/minesweeper-devcards3.png"
            :class "pure-img"}]




     ]


    (sidebar)]))
