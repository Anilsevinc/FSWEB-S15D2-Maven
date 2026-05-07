package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String person) {
        switch (person.toLowerCase()) {
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;
            case "carol":
                return carolsTasks;
            case "all":
                Set<Task> all = new HashSet<>();
                all.addAll(annsTasks);
                all.addAll(bobsTasks);
                all.addAll(carolsTasks);
                all.addAll(unassignedTasks);
                return all;
            default:
                return new HashSet<>();
        }
    }

    // UNION
    public Set<Task> getUnion(Set<Task> set1, Set<Task> set2) {
        Set<Task> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    // INTERSECTION
    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2) {
        Set<Task> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    // DIFFERENCE
    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2) {
        Set<Task> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}