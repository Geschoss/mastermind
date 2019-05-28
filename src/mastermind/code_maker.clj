(ns mastermind.code-maker)

(defn score [code guess]
  [(count (filter identity (map #(if (= %1 %2) :pos) code guess)))]
  )