(ns grade-school)

(defn add [db name grade]
  (assoc db grade (conj (db grade []) name)))

(defn grade [db grade]
  (db grade []))

(defn sorted [db]
  (reduce-kv (fn [m k v] (assoc m k (sort v))) (sorted-map) db))