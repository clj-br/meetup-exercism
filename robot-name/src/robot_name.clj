(ns robot-name)

(def alphabet "ABCDEFGHIJKLMNOPQRSQTUWZYZ")

(defn robot []
  (atom (format "%c%c%03d" (rand-nth alphabet) (rand-nth alphabet) (rand-int 1000))))

(defn robot-name [robot])

(defn reset-name [robot])
