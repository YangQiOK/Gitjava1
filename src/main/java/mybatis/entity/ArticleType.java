package mybatis.entity;

/**
 * 创建时间2022/3/1
 * 创建作者杨启
 **/
public class ArticleType {
    //at_id  typeName  status
    Integer at_id;
    String typeName;
    Integer status;

    public ArticleType() {
    }

    public ArticleType(String typeName, Integer status) {
        this.typeName = typeName;
        this.status = status;
    }

    public ArticleType(Integer at_id, String typeName, Integer status) {
        this.at_id = at_id;
        this.typeName = typeName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "at_id=" + at_id +
                ", typeName='" + typeName + '\'' +
                ", status=" + status +
                '}';
    }

    public Integer getAt_id() {
        return at_id;
    }

    public void setAt_id(Integer at_id) {
        this.at_id = at_id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
