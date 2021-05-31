package com.zss.cp.prototype;

/**
 * @author ZSS
 * @date 2021/5/31 16:10
 * @desc 工作经历
 */
public class WorkExperience {

    private String workTime;

    private String company;

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "workTime='" + workTime + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
