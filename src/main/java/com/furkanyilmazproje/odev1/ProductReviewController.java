package com.furkanyilmazproje.odev1;

import com.furkanyilmazproje.odev1.dao.ProductReviewDao;
import com.furkanyilmazproje.odev1.entity.Product;
import com.furkanyilmazproje.odev1.entity.ProductReview;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductReviewController {


    private ProductReviewDao productReviewDao;
    private Object date;

   /* @PostMapping("/date")
    public List<ProductReview> requested_date(){
        return ProductReviewDao.findAll(@DateTimeFormat(pattern = "12-05-1999") Date date));
    }*/



}
