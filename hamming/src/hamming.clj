(ns hamming)

(defn count-differences [count [a b]]
  (if (= a b) count (inc count)))

(defn distance [left right]
  (when (= (count left) (count right))
    (let [tuples (map vector left right)]
      (reduce count-differences 0 tuples))))
