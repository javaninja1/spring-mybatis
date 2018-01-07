package mybatis.dao;

import java.util.List;

import mybatis.model.Book;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MyBatisDAO  implements IMyDAO  {

   private SqlSession sqlSession;

    @Autowired
    public void setSqlSession(SqlSession sqlSession) {
      this.sqlSession = sqlSession;
    }

    public <T> T get(Object id) {
        return getSqlSession().selectOne("sql statement", "sql parameters");
    }

    private SqlSession getSqlSession() {
        return sqlSession;
    }

    @Override
    public List<Book> selectList(String query, int param) {
        return getSqlSession().selectList(query, param);
    }
}