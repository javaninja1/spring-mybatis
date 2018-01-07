package mybatis.dao;

import java.util.List;

import mybatis.model.Book;

public interface IMyDAO {

    List<Book> selectList(String query, int param);

}
