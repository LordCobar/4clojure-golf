#(apply max-key %
  (reverse
   (for [x (%2 (% %3)) % (%2 x (- (% %3) 1))
	   :let [% (subvec %3 x (+ % 2))]]
     (if (apply < %) % []))))
count range
