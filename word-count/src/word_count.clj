(ns word-count
  (:require [clojure.string :as string]))

(defn split-phrase [phrase]
  (string/split (string/lower-case (string/replace phrase #"[^A-Za-z0-9 ]" "")) #" +"))

(defn word-count [phrase]
 (reduce (fn [result word]
           (update-in result [word] (fnil inc 0)))
         {}
         (split-phrase phrase)))

