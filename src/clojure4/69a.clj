(defn f [g & ms]
  (let [m (apply conj ms)] 
    (println m)
    (for [[k v] m]
      
      (apply g (get m v) (map #(get % k) (next ms))))))
      




    
