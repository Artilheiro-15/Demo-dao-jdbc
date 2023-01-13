package apllication;

import java.util.Date;
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
    System.out.println("===== TEST 3: Seller findAll=======");
    list = sellerDao.findAll();
    for (Seller obj : list) {
      System.out.println(obj);
    }

    System.out.println("======================================");
    System.out.println("===== TEST 4: Seller insert=======");
    Seller newSeller = new Seller(
      null,
      "Greg",
      "greg@gmail.com",
      new Date(),
      4000.0,
      department
    );
    sellerDao.insert(newSeller);
    System.out.println("Inserted! new id = " + newSeller.getId());
    System.out.println("======================================");
  }
}
