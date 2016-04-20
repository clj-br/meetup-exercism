(ns hamming)

(defn distance [first last]
  (if (not= (count first) (count last))
    nil
    (do
      (let [tuples (map vector first last)]
        (reduce (fn [count [a b]] (if (= a b) count (inc count))) 0 tuples)))))
