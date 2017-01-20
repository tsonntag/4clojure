(defn f [n xs]
  (cond 
    (neg? n) (f (+ (count xs) n) xs)
    (zero? n) xs
   :else 
    (f (dec n) (conj (vec (rest xs)) (first xs)))))
  
(= (f 2 [1 2 3 4 5]) '(3 4 5 1 2))

(= (f -2 [1 2 3 4 5]) '(4 5 1 2 3))

(= (f 6 [1 2 3 4 5]) '(2 3 4 5 1))

(= (f 1 '(:a :b :c)) '(:b :c :a))

(= (f -4 '(:a :b :c)) '(:c :a :b))
