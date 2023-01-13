package apllication;

import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

  public static void main(String[] args) {
    System.out.println("======================================");
    SellerDao sellerDao = DaoFactory.createSellerDao();

    System.out.println("===== TEST 1: Seller FindById =========");
    Seller seller = sellerDao.findById(3);
    System.out.println(seller);
    System.out.println("======================================");

    System.out.println("===== TEST 2: Seller findByDepartment=======");
    Department department = new Department(4, null);
    List<Seller> list = sellerDao.findByDepartment(department);
    for (Seller obj : list) {
      System.out.println(obj);
    }

    System.out.println("======================================");
  }
}
