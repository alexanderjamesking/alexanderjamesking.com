(ns alexanderjamesking.codemirror
  (:use [hiccup.core]
        [hiccup.page]
        [hiccup.element :only [link-to]]))

(defn include-codemirror []
  [:div
   (include-css "/js/codemirror/lib/codemirror.css")
   [:script {:src "/js/codemirror/lib/codemirror.js"}]
   [:script {:src "/js/codemirror/mode/clojure/clojure.js"}]])

(defn code-sample [code]
  (let [id (str "sample" (hash code))]
    [:div
     [:textarea {:id id}
      code]
     [:script
      (str "CodeMirror.fromTextArea(" id ", {lineNumbers:false, readOnly:true, height:\"auto\", viewportMargin:Infinity, mode: \"clojure\"})")]]))
