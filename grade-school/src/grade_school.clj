(ns grade-school)

(defn add
  [db name nbr]
  (def grade (or (db nbr) []))
  (assoc db nbr (cons name grade)))

(defn grade
  [db nbr]
  []
)


(defn sorted
  [db]
  db )
