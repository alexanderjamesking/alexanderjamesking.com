(ns alexanderjamesking.html
  (:use [hiccup.core]
        [hiccup.page]))

(defn head []
  [:head
   [:title "Alexander James King"]
   [:script {:async "async" :src "https://www.googletagmanager.com/gtag/js?id=UA-45904775-1"}]
   [:script "
window.dataLayer = window.dataLayer || [];
function gtag(){dataLayer.push(arguments);}
gtag('js', new Date());
gtag('config', 'UA-45904775-1');"]

   (for [css-file ["pure/pure-min"
                   "pure/base-min"
                   "pure/grids-responsive-min"
                   "pure/menus-min"
                   "main"]]
     (include-css (str "/css/" css-file ".css"))

     )

   (include-css "https://fonts.googleapis.com/css?family=Roboto")])


(def nav-items
  [{:key :home :href "/" :name "Home"}
   {:key :blog :href "/blog" :name "Blog"}
   {:key :cv :href "/cv" :name "CV"}])

(defn main-nav [selected]
  [:div {:class "pure-menu pure-menu-horizontal pure-menu-scrollable"}
   [:ul {:class "pure-menu-list"}
    (for [nav-item nav-items]
      (let [selected-class (if (= selected (:key nav-item)) " pure-menu-selected")
            css-class (str "pure-menu-item" selected-class)]
        [:li {:class css-class}
         [:a {:class "pure-menu-link" :href (:href nav-item)} (:name nav-item)]]))]])

(defn sidebar []
  [:div {:class "pure-u-1 pure-u-md-1-5 sidebar"}
   [:ul {:class "pure-menu-list"}
    [:li {:class "pure-menu-item"}
     [:a {:class "pure-menu-link" :href "http://www.tortue.co.uk"} "Tortue Ltd"]]
    [:li {:class "pure-menu-item"}
     [:a {:class "pure-menu-link" :href "https://github.com/alexanderjamesking"} "GitHub"]]
    [:li {:class "pure-menu-item"}
     [:a {:class "pure-menu-link" :href "https://www.linkedin.com/in/alexanderjamesking"} "LinkedIn"]]
    [:li {:class "pure-menu-item"}
     [:a {:class "pure-menu-link" :href "https://twitter.com/superaking"} "Twitter"]]]])

(defn wrapper [selected page-content]
  (html5
   (head)
   [:body
    [:div
     [:div {:class "header"}
      [:div {:class "container"}
       (main-nav selected)]]

     [:div {:class "container"}
      page-content]

     [:div {:class "container footer"}
      [:p "© 2018 Alexander James King"]]]]))
