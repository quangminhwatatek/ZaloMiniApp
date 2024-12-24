//package com.example.zalominiapp.miniapp.service.intf;
//
//import com.example.zalominiapp.miniapp.config.VNPayConfig;
//import com.example.zalominiapp.miniapp.entity.Order;
//import com.example.zalominiapp.miniapp.entity.Payment;
//import com.example.zalominiapp.miniapp.entity.User;
//import com.example.zalominiapp.miniapp.repository.OrderRepository;
//import com.example.zalominiapp.miniapp.repository.PaymentRepository;
//import com.example.zalominiapp.miniapp.repository.UserRepository;
//import com.example.zalominiapp.miniapp.utility.generic.OrderStatus;
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.net.URLEncoder;
//import java.nio.charset.StandardCharsets;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//@Service
//public class PaymentService {
//    @Autowired
//    private PaymentRepository paymentRepository;
//
//    @Autowired
//    private OrderRepository orderRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public static String vnp_PayUrl = "https://sandbox.vnpayment.vn/paymentv2/vpcpay.html";
//    public static String vnp_ReturnUrl = "http://localhost:3000/payment/payment-complete";
//    public static String vnp_TmnCode = "HEBHXO7Q";
//    public static String vnp_HashSecret = "4DH3NWFTQRZWT9ZZDC9R17RLN31A74E5";
//
//    public Map<String, String> createPayment(String amountStr, String bankCode, String language, Long bookingId, Long userId, HttpServletRequest req) throws Exception {
//        String vnp_Version = "2.1.0";
//        String vnp_Command = "pay";
//        String orderType = "other";
//        long amount = Integer.parseInt(amountStr) * 100L;
//        String vnp_TxnRef = VNPayConfig.getRandomNumber(8);
//        String vnp_IpAddr = VNPayConfig.getIpAddress(req);
//
//        Map<String, String> vnp_Params = new HashMap<>();
//        vnp_Params.put("vnp_Version", vnp_Version);
//        vnp_Params.put("vnp_Command", vnp_Command);
//        vnp_Params.put("vnp_TmnCode", vnp_TmnCode);
//        vnp_Params.put("vnp_Amount", String.valueOf(amount));
//        vnp_Params.put("vnp_CurrCode", "VND");
//
//        if (bankCode != null && !bankCode.isEmpty()) {
//            vnp_Params.put("vnp_BankCode", bankCode);
//        }
//        vnp_Params.put("vnp_TxnRef", vnp_TxnRef);
//        vnp_Params.put("vnp_OrderInfo", "Thanh toan don hang:" + vnp_TxnRef);
//        vnp_Params.put("vnp_OrderType", orderType);
//
//        String locale = (language != null && !language.isEmpty()) ? language : "vn";
//        vnp_Params.put("vnp_Locale", locale);
//        vnp_Params.put("vnp_ReturnUrl", vnp_ReturnUrl);
//        vnp_Params.put("vnp_IpAddr", vnp_IpAddr);
//
//        Calendar cld = Calendar.getInstance(TimeZone.getTimeZone("Etc/GMT+7"));
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
//        String vnp_CreateDate = formatter.format(cld.getTime());
//        vnp_Params.put("vnp_CreateDate", vnp_CreateDate);
//
//        cld.add(Calendar.MINUTE, 15);
//        String vnp_ExpireDate = formatter.format(cld.getTime());
//        vnp_Params.put("vnp_ExpireDate", vnp_ExpireDate);
//
//        List<String> fieldNames = new ArrayList<>(vnp_Params.keySet());
//        Collections.sort(fieldNames);
//
//        StringBuilder hashData = new StringBuilder();
//        StringBuilder query = new StringBuilder();
//        for (String fieldName : fieldNames) {
//            String fieldValue = vnp_Params.get(fieldName);
//            if (fieldValue != null && !fieldValue.isEmpty()) {
//                hashData.append(fieldName).append('=').append(URLEncoder.encode(fieldValue, StandardCharsets.US_ASCII));
//                query.append(URLEncoder.encode(fieldName, StandardCharsets.US_ASCII)).append('=').append(URLEncoder.encode(fieldValue, StandardCharsets.US_ASCII));
//                if (!fieldName.equals(fieldNames.get(fieldNames.size() - 1))) {
//                    query.append('&');
//                    hashData.append('&');
//                }
//            }
//        }
//
//        String queryUrl = query.toString();
//        String vnp_SecureHash = VNPayConfig.hmacSHA512(vnp_HashSecret, hashData.toString());
//        queryUrl += "&vnp_SecureHash=" + vnp_SecureHash;
//        String paymentUrl = vnp_PayUrl + "?" + queryUrl;
//
//        Map<String, String> response = new HashMap<>();
//        response.put("code", "00");
//        response.put("message", "success");
//        response.put("data", paymentUrl);
//
//        return response;
//    }
//
//    public Order updateOrderStatus(Long orderId) {
//        Order order = orderRepository.findById(orderId)
//                .orElseThrow(() -> new RuntimeException("Booking not found"));
//
//        order.setOrderStatus(OrderStatus.PENDING.getStatus());
//        return orderRepository.save(order);
//    }
//
//    public void savePayment(String vnp_TxnRef, long amount, Date createDate, Order order, User user) {
//        user = userRepository.findById(user.getUserId()).orElseThrow(() -> new RuntimeException(("User not found")));
//
//        order.setOrderStatus(OrderStatus.DELIVERED.getStatus());
//        orderRepository.save(order);
//
//        Payment payment = new Payment();
//        payment.setTxnRef(vnp_TxnRef);
//        payment.setAmount(amount);
//        payment.setCreateDate(createDate);
//        payment.setBooking(booking);
//        payment.setUser(user);
//
//        paymentRepository.save(payment);
//    }
//}
//
//
