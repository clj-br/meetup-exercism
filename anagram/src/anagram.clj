(ns anagram
  (:require [clojure.string :as string]))

(defn- -sort [word]
  (-> word .toLowerCase sort string/join))

(defn anagrams-for [word possibilities]
  (let [anagram (-sort word)]
    (filter (fn [poss]
              (println anagram poss (-sort poss))
              (and (not= word poss)
                   (= anagram (-sort poss)))) possibilities)))


