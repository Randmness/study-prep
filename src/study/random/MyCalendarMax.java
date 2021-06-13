package study.random;

import java.util.ArrayList;
import java.util.List;

public class MyCalendarMax {

    //https://leetcode.com/problems/my-calendar-i/
    class MyCalendar {
        class Booking {
            int start;
            int end;

            Booking (int start, int end) {
                this.start = start;
                this.end = end;
            }
        }

        List<Booking> bookings;

        public MyCalendar() {
            this.bookings = new ArrayList<>();
        }

        private boolean checkAvailable(Booking proposed) {
            for (Booking existing: bookings) {
                int start = Math.max(proposed.start, existing.start);
                int end = Math.min(proposed.end, existing.end);
                if (start < end) return false;
            }

            return true;
        }

        public boolean book(int start, int end) {
            Booking newBooking = new Booking(start, end);

            if (!checkAvailable(newBooking)) return false;

            bookings.add(newBooking);
            return true;
        }
    }

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
}
