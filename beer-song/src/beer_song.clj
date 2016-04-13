(ns beer-song
  (:require [clojure.string :refer [lower-case]]))

(defn bottles [n]
  (cond
    (= n 1) "1 bottle"
    (= n 0) "No more bottles"
    :else (str n " bottles")))

(defn second-phrase [n]
  (cond
    (= n 1) "Take one down and pass it around, 1 bottle of beer on the wall.\n"
    (> n 1) (str "Take one down and pass it around, " n " bottles of beer on the wall.\n")
    (= n 0) "Take it down and pass it around, no more bottles of beer on the wall.\n"
    :else "Go to the store and buy some more, 99 bottles of beer on the wall.\n"))

(defn verse [n]
  (str (bottles n) " of beer on the wall, " (lower-case (bottles n)) " of beer.\n"
       (second-phrase (dec n))))

(defn sing
  ([start] (sing start 0))
  ([start end]
   (->> (range start (dec end) -1)
        (map verse))))
