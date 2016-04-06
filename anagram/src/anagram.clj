(ns anagram)

(defn anagrams-for [word possibilities]
  (let [anagram (clojure.string/reverse word)]
    (filter
      (fn [w]
        (= anagram w))
      possibilities)))


