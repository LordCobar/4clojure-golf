(fn [B P]
  (let [c count r range a apply
        W (c B) H (c (B 0))
        d (r 3)
        e #([(r % %2) (repeat %2 %) (r % -1 -1)] %3)]
    (a conj
       (for [y (r H) x (r W)]
         (#({() {}} % {[y x] (set %)})
          (a concat
             (for [u d v d :let [l (map vector (e y H u) (e x W v))]]
               (rest
                (take (- (c (re-find ({'b #"^ew+b"} P #"eb+w")
                                    (a str (map #(get-in B %) l))))
                         1) l)))))))))