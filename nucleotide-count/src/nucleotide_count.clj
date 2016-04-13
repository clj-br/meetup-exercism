(ns nucleotide-count
  (:refer-clojure :exclude [count]))

(defn count [char dna]
  0)

(defn nucleotide-counts [dna]
  (frequencies dna))
