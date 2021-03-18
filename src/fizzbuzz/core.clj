(ns fizzbuzz.core)


(defn fizzbuzz
  "I don't do a whole lot."
  [x]
  (let [a (atom "")]
    (when (= (mod x 3) 0)
      (swap! a str "Fizz")
      )
    (when (= (mod x 5) 0)
      (swap! a str "Buzz")
      )
    (if (empty? @a)
      (str x)
      @a
      )
    )
    )

(defn main-funktion
  "Prints out fizzbuzz "
  [x]
  (let [rang (range 1 (inc x))]
    (map fizzbuzz rang)
    )
  )

