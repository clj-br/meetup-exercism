(ns anagram
  (:require [clojure.string :as string]))

(defn- -sort [word]
  (-> word .toLowerCase sort string/join))

(defn anagrams-for [word possibilities]
  (let [anagram (-sort word)]
    (filter (fn [poss]
              (and (not= (.toLowerCase word) poss)
                   (= anagram (-sort poss)))) possibilities)))
