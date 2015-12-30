package cn.fengyu.frame.webservice.book.dao;

/**
 * Created by fengYu Administrator on 2015/12/30.
 */
public interface BookShopDao {

    public int findBookPrinceByIsbn(String isbn);

    public void updateBookStock(String isbn);

    public void updateUserAccount(String name, int price);

}
