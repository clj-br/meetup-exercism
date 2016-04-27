(ns phone-number
  (:require [clojure.string :as string]))

(defn number [n]
  (let [clean-number (string/join (re-seq #"\d" n))
        invalid "0000000000"]
    (cond
      (= (count clean-number) 10) clean-number
      (= (count clean-number) 9) invalid
      (= (first clean-number) \1) (string/join (rest clean-number))
      :else invalid)))



(defn area-code [n]
  (subs (number n) 0 3))

(defn pretty-print
  "(123) 456-7890"
  [n]
  (let [n (number n)]
    (str "(" (.substring n 0 3) ") " (.substring n 3 6) "-" (.substring n 6 10))))
