(fn [v ks]
  (into {} (map #(vector % v) ks)))
