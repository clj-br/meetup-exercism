(ns phone-number
  (:require [clojure.string :as string]))

(defn number [n]
  (let [clean-number (string/join (re-seq #"\d" n))]
    (cond
      (= (count clean-number) 10) clean-number
      (= (first clean-number) \1) (string/join (rest clean-number))
      :else "0000000000")))



(defn area-code [n]
  (subs (number n) 0 3))

(defn pretty-print [n])
