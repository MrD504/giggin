(ns giggin.core
  (:require [reagent.core :as r]
            [giggin.components.header :refer [header]]
            [giggin.components.gigs :refer [gigslist]]
            [giggin.components.orders :refer [orders]]
            [giggin.components.footer :refer [footer]]))

(defn app
  []
  [:div.container
   [header]
   [gigslist]
   [orders]
   [footer]])

(defn ^:export main
  []
  (r/render
   [app]
   (.getElementById js/document "app")))
