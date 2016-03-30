(ns word-count)

(defn word-count [phrase]
 (reduce (fn [result word]
           (update-in result [word] (fnil inc 0)))
   {}
   (clojure.string/split phrase #" ")))