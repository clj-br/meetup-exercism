(ns word-count)

(defn split-phrase [phrase]
  (clojure.string/split (clojure.string/lower-case phrase) #" "))

(defn word-count [phrase]
 (reduce (fn [result word]
           (update-in result [word] (fnil inc 0)))
   {}
         (split-phrase phrase)))



