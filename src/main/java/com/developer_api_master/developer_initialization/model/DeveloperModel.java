package com.developer_api_master.developer_initialization.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "developer_table",catalog = "developer_db")
public class DeveloperModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long developerId;
    private int numPullRequests;
    private float avgTimeMergeReq;
    private int numIssuesClosed;
    private int numProjects;
    private Date addedDate = new Date();
    public DeveloperModel(){
        super();
    }

    public DeveloperModel(long developerId, int numPullRequests, float avgTimeMergeReq, int numIssuesClosed,
                          int numProjects, Date addedDate) {
        this.developerId = developerId;
        this.numPullRequests = numPullRequests;
        this.avgTimeMergeReq = avgTimeMergeReq;
        this.numIssuesClosed = numIssuesClosed;
        this.numProjects = numProjects;
        this.addedDate = addedDate;
    }

    public long getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(long developerId) {
        this.developerId = developerId;
    }

    public int getNumPullRequests() {
        return numPullRequests;
    }

    public void setNumPullRequests(int numPullRequests) {
        this.numPullRequests = numPullRequests;
    }

    public float getAvgTimeMergeReq() {
        return avgTimeMergeReq;
    }

    public void setAvgTimeMergeReq(float avgTimeMergeReq) {
        this.avgTimeMergeReq = avgTimeMergeReq;
    }

    public int getNumIssuesClosed() {
        return numIssuesClosed;
    }

    public void setNumIssuesClosed(int numIssuesClosed) {
        this.numIssuesClosed = numIssuesClosed;
    }

    public int getNumProjects() {
        return numProjects;
    }

    public void setNumProjects(int numProjects) {
        this.numProjects = numProjects;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }



}
