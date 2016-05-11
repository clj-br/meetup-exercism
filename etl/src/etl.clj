(ns etl
  (:require [clojure.string :as str]))

(defn transform [score->words]
  (reduce-kv
    (fn [state score words]
      (reduce
        (fn [state word]
          (assoc state (str/lower-case word) score)) state words))
    {}
    score->words))
