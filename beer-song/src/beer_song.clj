(ns beer-song)

(defn bottles [n]
  (cond
    (= n 1) "1 bottle"
    (= n 0) "no more"
    :else (str n " bottles")))

(defn verse [n]
  (str n " bottles of beer on the wall, " n " bottles of beer.\n"
       "Take one down and pass it around, " (bottles (dec n)) " of beer on the wall.\n"))

(defn sing [n])
