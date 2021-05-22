package cn.itcast.data;

import cn.itcast.entity.Book;
import cn.itcast.entity.UserInfo;
import com.opensymphony.xwork2.ActionSupport;

public class Data2Action extends ActionSupport {

    private UserInfo userInfo;
    private Book book;

    @Override
    public String execute() throws Exception {
        System.out.println(userInfo);
        System.out.println(book);
        return NONE;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
