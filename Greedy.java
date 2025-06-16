package project1;


import java.util.*;

class Greedy {

    static class Activity {
        int start, end;
        Activity(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};

        int n = start.length;
        List<Activity> activities = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            activities.add(new Activity(start[i], end[i]));
        }

        // Sort by end time
        activities.sort(Comparator.comparingInt(a -> a.end));

        System.out.println("Selected activities:");
        int count = 1;
        System.out.println("Activity: (" + activities.get(0).start + ", " + activities.get(0).end + ")");
        int lastEnd = activities.get(0).end;

        for (int i = 1; i < n; i++) {
            if (activities.get(i).start >= lastEnd) {
                System.out.println("Activity: (" + activities.get(i).start + ", " + activities.get(i).end + ")");
                lastEnd = activities.get(i).end;
                count++;
            }
        }

        System.out.println("Total activities selected: " + count);
    }
}
