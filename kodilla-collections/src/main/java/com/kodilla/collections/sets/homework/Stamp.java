package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String id;
    private double width;
    private String postmark;
    public Stamp(String id, double width, String postmark) {
        this.id = id;
        this.width = width;
        this.postmark = postmark;
    }
    public String getId() {
        return id;
    }
    public double getWidth() {
        return width;
    }
    public String getPostmark() {
        return postmark;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0
                && Objects.equals(id, stamp.id)
                && Objects.equals(postmark, stamp.postmark);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, width, postmark);
    }
    @Override
    public String toString() {
        return "Stamp{" +
                "id='" + id + '\'' +
                ", width=" + width +
                ", postmark='" + postmark + '\'' +
                '}';
    }
}
