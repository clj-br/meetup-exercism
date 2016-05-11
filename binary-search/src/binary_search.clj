(ns binary-search)

(defn middle [coll]
  (quot (count coll) 2))

(defn- search-for-pos [target coll position]
  (when (empty? coll)
    (throw (ex-info "element not found" {:coll coll :target target})))
  (let [middle (middle coll)
        found (coll middle)]
    (if
      (and
        (> position 1)
        (= middle 0))
      (throw (ex-info "element not found" {:coll coll :target target})))
    (cond (= found target) (+ position middle)
           (> found target) (search-for-pos target (subvec coll 0 middle) position)
           (< found target) (search-for-pos target (subvec coll middle (count coll)) (+ position middle)))))

(defn search-for [target coll]
  (search-for-pos target (vec coll) 0))