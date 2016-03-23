(ns bob
  (:require [clojure.string :as str]))

(defn shout? [sentence]
  (and
    (= (str/upper-case sentence) sentence)
    (re-find #"[A-Z]" sentence)))

(defn question? [sentence]
  (and
    (str/ends-with? sentence "?")
    (not (shout? sentence))))

(defn silence? [sentence]
  (str/blank? sentence))

(defn response-for [sentence]
  (cond
    (question? sentence)  "Sure."
    (shout? sentence) "Whoa, chill out!"
    (silence? sentence) "Fine. Be that way!"
    :else "Whatever."))

