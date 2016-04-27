(ns grade-school)

(defn add [db name grade]
  (update db grade (fnil conj []) name))

(defn grade [db grade]
  (db grade []))

(defn sorted [db]
  (reduce-kv (fn [m k v] (assoc m k (sort v))) (sorted-map) db))