(ns anagram
  (:require [clojure.string :as string]))

(defn- normalize [word]
  (-> word string/lower-case sort string/join))

(defn anagram? [possibility word]
  (and (not= (string/lower-case word) possibility)
       (= (normalize word) (normalize possibility))))

(defn anagrams-for [word possibilities]
    (filter #(anagram? % word) possibilities))