(ns leap)

(defn leap-year? [year]
  (letfn [(divisible? [n] (= (mod year n) 0))]
    (and
      (divisible? 4)
      (or
        (not (divisible? 100))
        (divisible? 400)))))