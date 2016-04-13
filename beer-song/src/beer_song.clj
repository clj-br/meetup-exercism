(ns beer-song)

(defn bottles [n]
  (cond
    (= n 1) "1 bottle"
    (= n 0) "no more bottles"
    :else (str n " bottles")))

(defn second-phrase [n]
  (cond
    (= n 1) "Take it down and pass it around, no more bottles of beer on the wall.\n\n"
    (> n 1) (str "Take one down and pass it around, " n " bottles of beer on the wall.\n")
    :else "Go to the store and buy some more, 99 bottles of beer on the wall.\n"))

(defn verse [n]
  (str (bottles n) " of beer on the wall, " (bottles n) " of beer.\n"
       (second-phrase (dec n))))

(defn sing [n])
