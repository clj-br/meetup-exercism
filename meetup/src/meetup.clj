(ns meetup
  (:import [java.util Calendar GregorianCalendar]))

(defn meetup [month year week-day x]
  (let [calendar (GregorianCalendar.)]
    (doto calendar
      (.set Calendar/YEAR year)
      (.set Calendar/MONTH month))
    [(.get calendar Calendar/YEAR)
     (.get calendar Calendar/MONTH)
     (.get calendar Calendar/DAY_OF_MONTH)]))

(comment

  (meetup 2 2013 :friday :first)


  (doto (GregorianCalendar.)
    (.set Calendar/YEAR 2013)
    (.set Calendar/MONTH 10)
    (.set Calendar/DAY_OF_WEEK Calendar/MONDAY)
    )



  )
