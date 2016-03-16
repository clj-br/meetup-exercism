(ns bob
  (:require [clojure.string :as str]))

(defn question? [word]
  (str/ends-with? word "?"))

(defn shout? [word]
  (= (str/upper-case word) word))

(defn empty? [word]
  (str/blank? word))

(defn response-for [phrase]
  (cond
    (empty? phrase) "Fine. Be that way!"
    (shout? phrase) "Whoa, chill out!"
    (question? phrase) "Sure."))
