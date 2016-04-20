(ns nucleotide-count
  (:refer-clojure :exclude [count]))

(defn count [char dna]
  (->
    (frequencies dna)
    (get char)))

(defn nucleotide-counts [dna]
  (reduce (fn [coll item] (update coll item inc)) {\A 0 \T 0 \C 0 \G 0} dna))
