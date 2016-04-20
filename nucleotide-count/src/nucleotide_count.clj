(ns nucleotide-count
  (:refer-clojure :exclude [count]))

(defn nucleotide-counts [dna]
  (reduce
    (fn [m nucleotide] (update m nucleotide inc)) {\A 0 \T 0 \C 0 \G 0} dna))

(defn count [char dna]
  {:pre [(#{\G \A \C \T} char)]}
  (get (nucleotide-counts dna) char))
