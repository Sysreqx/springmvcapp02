package kz.kaisar.controller;

import kz.kaisar.domain.Order;
import kz.kaisar.service.OrderService;
import kz.kaisar.service.OrderServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class OrderController {

    private OrderService orderService = new OrderServiceImpl();

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String getOrderPage(Model model) {
        List<Order> orders = orderService.getAll();
        model.addAttribute("orderList", orders);
        return "order";
    }
}
