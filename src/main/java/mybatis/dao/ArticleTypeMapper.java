package mybatis.dao;

import mybatis.entity.ArticleType;

import java.util.List;

/**
 * 创建时间2022/3/1
 * 创建作者杨启
 **/
public interface ArticleTypeMapper {
    public List<ArticleType> getArticleTypeAll();
}
