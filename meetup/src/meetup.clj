(ns meetup)

(defn meetup [month year week-day x]
  (let [calendar (java.util.GregorianCalendar. year month 4)]
    calendar))

(meetup 2 2013 :friday :first)
