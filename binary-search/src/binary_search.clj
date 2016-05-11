(ns binary-search)

(defn middle [items]
  (int (/ (count items) 2)))

(defn search-for [search items]
  (let [middle (middle items)
        found (items middle)]
    (cond
      (= found search) middle
      (> found search) (search-for search (subvec items 0 middle))
      (< found search) (search-for search (subvec items middle (count items))))))
