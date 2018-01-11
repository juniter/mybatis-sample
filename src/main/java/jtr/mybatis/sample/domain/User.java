package jtr.mybatis.sample.domain;

public class User {
    private Integer uid;
    private String name;
    private String passport;

    public User(String name,String passport){
        this.name = name;
        this.passport = passport;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public User setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * @return the passport
     */
    public String getPassport() {
        return passport;
    }

    /**
     * @param passport the passport to set
     */
    public User setPassport(String passport) {
        this.passport = passport;
        return this;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return the uid
     */
    public Integer getUid() {
        return uid;
    }

    @Override
    public String toString() {
        return "[uid:"+this.uid+"\tname:"+this.name+"\tpassport:"+this.passport+"]";
    }
}