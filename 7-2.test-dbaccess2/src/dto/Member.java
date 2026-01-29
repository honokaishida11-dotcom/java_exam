package dto;

/**
 * メンバー情報を表すDTO.
 */
public class Member {

    /** ID */
    private int id;

    /** 名前 */
    private String name;

    /** 年齢 */
    private Integer age;

    /** 部署ID */
    private Integer depId;

    // --- コンストラクタ ---
    public Member() {}

    public Member(int id, String name, Integer age, Integer depId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.depId = depId;
    }

    // --- getter / setter ---
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDepId() {
        return depId;
    }
    public void setDepId(Integer depId) {
        this.depId = depId;
    }
}
