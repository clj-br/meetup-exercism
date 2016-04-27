(ns phone-number
  (:require [clojure.string :as string]))

(def invalid "0000000000")

(defn number [n]
  (let [clean-number (string/join (re-seq #"\d" n))]
    (case (count clean-number)
      10 clean-number
      11 (if (= (first clean-number) \1)
           (string/join (rest clean-number))
           invalid)
      invalid)))



(defn area-code [n]
  (subs (number n) 0 3))

(defn pretty-print
  "(123) 456-7890"
  [n]
  (let [n (number n)]
    (str "(" (area-code n) ") " (subs n 3 6) "-" (subs n 6 10))))
