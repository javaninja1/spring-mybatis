package mybatis.controller;

import java.io.IOException;
import java.util.List;

import mybatis.dao.IMyDAO;
import mybatis.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    IMyDAO myDao;

    @RequestMapping(value = "/hello")
    public ModelAndView test() throws IOException {
        List<Book> books = null;
        books = myDao.selectList("selectBooks", 2);
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("books", books);
        return mav;
    }
}
