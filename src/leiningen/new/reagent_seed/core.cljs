(ns {{ns-name}}.core
  (:require [reagent.core :as reagent :refer [atom]]
            [{{ns-name}}.session :as session :refer [get-state]]
            [{{ns-name}}.routes :as routes]
            [{{ns-name}}.views.common :as common]))

(defn page-render []
  [:div
   [common/header]
   [(get-state :current-page)]])

(defn page-component [] 
  (reagent/create-class {:component-will-mount routes/app-routes
                         :render page-render}))

;; initialize app
(reagent/render-component [page-component]
                          (.getElementById js/document "app"))
