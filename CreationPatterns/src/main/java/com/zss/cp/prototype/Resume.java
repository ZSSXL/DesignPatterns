package com.zss.cp.prototype;

/**
 * @author ZSS
 * @date 2021/5/31 16:12
 * @desc 简历
 */
public class Resume implements Cloneable {

    private String name;

    private Integer age;

    private String sex;

    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonal(Integer age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public void setWorkExperience(String workTime, String company) {
        this.workExperience.setWorkTime(workTime);
        this.workExperience.setCompany(company);
    }

    /**
     * 浅拷贝 -- 只能拷贝本身，对于其引用的对象，不能做到拷贝
     *
     * @return Resume
     */
    public Resume doCloneSimple() {
        try {
            return (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆Resume实例失败：[" + e.getMessage() + "]");
        }
        return null;
    }

    /**
     * 深拷贝 -- 拷贝本身包括其引用
     *
     * @return Resume
     */
    public Resume doCloneDeep() {
        try {
            Resume resume = (Resume) super.clone();
            WorkExperience workExperience = new WorkExperience();
            workExperience.setCompany(this.workExperience.getCompany());
            workExperience.setWorkTime(this.workExperience.getWorkTime());
            resume.workExperience = workExperience;
            return resume;
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆Resume实例失败：[" + e.getMessage() + "]");
        }
        return null;
    }


    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }
}
