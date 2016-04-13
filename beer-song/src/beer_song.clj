(ns beer-song
  (:require [clojure.string :as string]))

(defn bottles [n]
  (case n
    0 "No more bottles"
    1 "1 bottle"
    (str n " bottles")))

(defn first-phrase [n]
  (str (bottles n) " of beer on the wall, " (string/lower-case (bottles n)) " of beer.\n"))

(defn second-phrase [n]
  (case n
    0 "Go to the store and buy some more, 99 bottles of beer on the wall.\n"
    1 "Take it down and pass it around, no more bottles of beer on the wall.\n"
    (str "Take one down and pass it around, " (bottles (dec n)) " of beer on the wall.\n")))

(defn verse [n]
  (str (first-phrase n)
       (second-phrase n)))

(defn sing
  ([start] (sing start 0))
  ([start end]
   (->> (range start (dec end) -1)
        (map verse)
        (string/join "\n"))))
