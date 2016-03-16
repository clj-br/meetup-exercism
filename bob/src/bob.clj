(ns bob
  (:require [clojure.string :as str]))

(defn question? [word]
  (str/ends-with? word "?"))

(defn shout? [word]
  (= (str/upper-case word) word))

(defn response-for [phrase]
  (case
    (question? phrase) "Sure.")
    (shout? phrase) "Whoa, chill out!")
