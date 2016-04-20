(ns hamming)

(defn distance [first last]
  (if (not= (count first) (count last)) nil 0))
