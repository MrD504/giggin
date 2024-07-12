(ns giggin.components.gigs
  (:require [giggin.state :as state]
            [giggin.helpers :as h]))

(defn gigslist []
  (let [add-to-order #(swap! state/orders update % inc)]
    [:main
     [:div.gigs
      (for [{:keys [id img title price desc]} (vals @state/gigs)]
        ^{:key id}
        [:div.gig
         [:img.gig__artwork {:src img :alt title}]
         [:div.gig__body
          [:div.gig__title
           [:div.btn.btn--primary.float--right.tooltip
            {:data-tooltip "Add to order"
             :on-click #(add-to-order id)}
            [:i.icon.icon--plus]] title]
          [:p.gig__price (h/format-price price)]
          [:p.gig__desc desc]]])]]))

