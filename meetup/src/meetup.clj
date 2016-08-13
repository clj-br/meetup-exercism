(ns meetup)

(defn meetup [month year week-day x]
  (let [calendar (java.util.GregorianCalendar.)]
    (.setWeekDate calendar year 10 1)
    calendar))

(comment

  (meetup 2 2013 :friday :first)


  (java.util.GregorianCalendar.)



  )
