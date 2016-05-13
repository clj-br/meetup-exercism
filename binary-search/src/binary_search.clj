(ns binary-search)

(defn middle [coll]
  (quot (count coll) 2))

(defn search-for
  ([target coll]
   (search-for target (vec coll) 0))

  ([target coll position]
    (assert (not-empty coll) "element not found")
    (let [middle (middle coll)
          found (coll middle)]
      (cond (= found target) (+ position middle)
            (> found target) (recur target (subvec coll 0 middle) position)
            (< found target) (recur target (subvec coll (inc middle)) (+ position middle 1))))))