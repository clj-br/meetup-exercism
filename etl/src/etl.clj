(ns etl)

(reduce-kv
  (fn [state score words]
    (reduce
      (fn [state word] state word) state words)) {} {1 ["a" "b"]})

(defn transform [score->words]
  {(.toLowerCase (first (first (vals score->words))))
   (first (keys score->words))})