(ns giggin.helpers)

(defn format-price
  [pence]
  (str " £" (/ pence 100)))
