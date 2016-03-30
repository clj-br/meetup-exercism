(ns word-count
  (:require [clojure.string :as string]))

(defn remove-blank [collection]
  (remove string/blank? collection))

(defn split-phrase [phrase]
  (-> phrase
      (string/replace #"[^A-Za-z0-9 ]" "")
      (string/lower-case)
      (string/split #" ")))

(defn word-count [phrase]
  (-> phrase
      split-phrase
      remove-blank
      frequencies))