/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author DANH
 */
public class Attendance {
    private Employee employeeID;
    private Date date;
    private Time checkIn;
    private Time checkOut;

    public Attendance(Employee employeeID, Date date, Time checkIn, Time checkOut) {
        this.employeeID = employeeID;
        this.date = date;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Employee getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Employee employeeID) {
        this.employeeID = employeeID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Time checkIn) {
        this.checkIn = checkIn;
    }

    public Time getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Time checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Attendance{" + "employeeID=" + employeeID + ", date=" + date + ", checkIn=" + checkIn + ", checkOut=" + checkOut + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.employeeID);
        hash = 83 * hash + Objects.hashCode(this.date);
        hash = 83 * hash + Objects.hashCode(this.checkIn);
        hash = 83 * hash + Objects.hashCode(this.checkOut);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Attendance other = (Attendance) obj;
        if (!Objects.equals(this.employeeID, other.employeeID)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.checkIn, other.checkIn)) {
            return false;
        }
        return Objects.equals(this.checkOut, other.checkOut);
    }
    
    
}
