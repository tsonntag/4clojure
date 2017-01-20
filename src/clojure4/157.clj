

(def f #(map vector % (range)))


(= (f [:a :b :c]) [[:a 0] [:b 1] [:c 2]])

(= (f [0 1 3]) '((0 0) (1 1) (3 2)))

(= (f [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]])
