(fn [& f]
  (fn [& a]
    (map #(apply % a) f)))
