package emp2;

import java.sql.Date;

public class EmpDTO {
    // emp 테이블의 하나의 행(레코드)을 담을 수 있는 구조로 설계
    // 컬럼명 동일(number: int or long / varchar2: String / date: java.util.Date or
    // java.time.LocalDateTime)
    // 멤버변수로 선언
    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private String hiredate;
    private int sal;
    private int comm;
    private int deptno;

    // 생성자/getter/setter/toString
    public EmpDTO() {
    }

    public EmpDTO(int empno, String ename, String job, int mgr, String hiredate, int sal, int comm, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    public EmpDTO(int empno2, Object object, Object object2, Object object3, Object object4, int sal2, int comm2,
            Object object5) {
    }

    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public String getJob() {
        return job;
    }

    public int getMgr() {
        return mgr;
    }

    public String getHiredate() {
        return hiredate;
    }

    public int getSal() {
        return sal;
    }

    public int getComm() {
        return comm;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "EmpDTO [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate="
                + hiredate + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
    }
}
