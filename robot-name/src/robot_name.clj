(ns robot-name)

(def alphabet "ABCDEFGHIJKLMNOPQRSQTUVWXYZ")

(defn generate-name []
  (format "%c%c%03d"
          (rand-nth alphabet)
          (rand-nth alphabet)
          (rand-int 1000)))

(defn robot []
  (atom (generate-name)))

(defn robot-name [r]
  @r)

(defn reset-name [r]
  (reset! r (generate-name)))
