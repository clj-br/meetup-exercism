(ns rna-transcription)

(defn dna->rna [char]
  (cond
    (= char \C) "G"
    (= char \G) "C"
    (= char \A) "U"
    (= char \T) "A"
    :else (throw (AssertionError.))))

(defn to-rna [strand]
  (clojure.string/join (map dna->rna strand)))
