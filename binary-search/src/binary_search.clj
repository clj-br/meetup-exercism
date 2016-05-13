(ns binary-search)

(defn middle [coll]
  (quot (count coll) 2))

(defn- search-for-pos [target coll position]
  (assert (not-empty coll) "element not found")

  (let [middle (middle coll)
        found (coll middle)]

    (cond (= found target) (+ position middle)
           (> found target) (search-for-pos target (subvec coll 0 middle) position)
           (< found target) (search-for-pos target (subvec coll (inc middle)) (+ position middle 1)))))

(defn search-for [target coll]
  (search-for-pos target (vec coll) 0))