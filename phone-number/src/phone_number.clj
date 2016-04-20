(ns phone-number
  (:require [clojure.string :as string]))

(defn number [n]
  (cond
    (= (count n) 10) (string/join (re-seq #"\d" n))
    :else "0000000000"))

(defn area-code [n]
  (subs (number n) 0 3))

(defn pretty-print [n])