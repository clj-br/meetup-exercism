(ns bob
  (:require [clojure.string :as str]))

(defn question? [word]
  (str/ends-with? word "?"))

(defn shout? [word]
  (= (str/upper-case word) word))

(defn point-end? [word]
  (str/ends-with? word "."))

(defn text-empty? [word]
  (str/blank? word))

(defn response-for [phrase]
  (cond
    (text-empty? phrase) "Fine. Be that way!"
    (point-end? phrase) "Whatever."
    (shout? phrase) "Whoa, chill out!"
    (question? phrase)  "Sure."))

