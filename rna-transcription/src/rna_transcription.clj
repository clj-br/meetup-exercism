(ns rna-transcription)

(defn dna->rna [char]
  (condp = char
    \C "G"
    \G "C"
    \A "U"
    \T "A"
    (throw (AssertionError.))))

(defn to-rna [strand]
  (clojure.string/join (map dna->rna strand)))
