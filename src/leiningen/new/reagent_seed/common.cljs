(ns {{ns-name}}.views.common
  (:require  [{{ns-name}}.session :as session :refer [global-state]]))

(defn active? [state val]
  (if (= state val) "active" ""))

(defn header []
  [:div.page-header.row

  [:div#title.col-md-6 
   "{{name}}"]

   [:div.col-md-6
    [:ul.nav.nav-pills 
     [:li {:class (active? (global-state :nav) "home")}  [:a {:href "#/"} [:span.fa.fa-home " Home"]]]
     [:li {:class (active? (global-state :nav) "about")} [:a {:href "#/about"} "About"]]]]
   ])
