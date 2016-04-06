(ns anagram
  (:require [clojure.string :as string]))



(defn anagrams-for [word possibilities]
  (let [anagram (string/join (sort word))
        ordered-possibilities (map #(string/join (sort %)) possibilities)]
    (filter (fn [w] (= anagram w)) ordered-possibilities)))


