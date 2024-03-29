//package com.withsports.teamservice;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.withsports.teamservice.domain.team.entity.Team;
//import com.withsports.teamservice.domain.team.repository.TeamRepository;
//import com.withsports.teamservice.domain.teamuser.entity.TeamUser;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//@RequiredArgsConstructor
//public class SqlCommandLineRunner implements CommandLineRunner {
//
//    private final TeamRepository teamRepository;
//    private final ObjectMapper objectMapper;
//
//    String teamJson = "[{\"id\":1,\"name\":\"커피온리 마포역점\",\"items\":[{\"id\":40,\"name\":\"아메리카노\",\"price\":1500,\"itemOptions\":[{\"id\":41,\"name\":\"ICE\"},{\"id\":43,\"name\":\"HOT\"}]},{\"id\":40,\"name\":\"아메리카노\",\"price\":1500,\"itemOptions\":[{\"id\":41,\"name\":\"ICE\"},{\"id\":43,\"name\":\"HOT\"}]},{\"id\":45,\"name\":\"카페라떼\",\"price\":2000,\"itemOptions\":[{\"id\":41,\"name\":\"ICE\"},{\"id\":43,\"name\":\"HOT\"}]},{\"id\":45,\"name\":\"카페라떼\",\"price\":2000,\"itemOptions\":[{\"id\":41,\"name\":\"ICE\"},{\"id\":43,\"name\":\"HOT\"}]},{\"id\":46,\"name\":\"카페모카\",\"price\":3900,\"itemOptions\":[{\"id\":41,\"name\":\"ICE\"},{\"id\":43,\"name\":\"HOT\"}]},{\"id\":46,\"name\":\"카페모카\",\"price\":3900,\"itemOptions\":[{\"id\":41,\"name\":\"ICE\"},{\"id\":43,\"name\":\"HOT\"}]},{\"id\":47,\"name\":\"콜드브루\",\"price\":2500,\"itemOptions\":[{\"id\":41,\"name\":\"ICE\"}]},{\"id\":47,\"name\":\"콜드브루\",\"price\":2500,\"itemOptions\":[{\"id\":41,\"name\":\"ICE\"}]},{\"id\":48,\"name\":\"녹차라떼\",\"price\":3000,\"itemOptions\":[{\"id\":41,\"name\":\"ICE\"},{\"id\":43,\"name\":\"HOT\"}]},{\"id\":48,\"name\":\"녹차라떼\",\"price\":3000,\"itemOptions\":[{\"id\":41,\"name\":\"ICE\"},{\"id\":43,\"name\":\"HOT\"}]},{\"id\":42,\"name\":\"딸기라떼\",\"price\":3000,\"itemOptions\":[{\"id\":41,\"name\":\"ICE\"},{\"id\":43,\"name\":\"HOT\"}]},{\"id\":42,\"name\":\"딸기라떼\",\"price\":3000,\"itemOptions\":[{\"id\":41,\"name\":\"ICE\"},{\"id\":43,\"name\":\"HOT\"}]},{\"id\":49,\"name\":\"녹차\",\"price\":3000,\"itemOptions\":[{\"id\":43,\"name\":\"HOT\"}]},{\"id\":49,\"name\":\"녹차\",\"price\":3000,\"itemOptions\":[{\"id\":43,\"name\":\"HOT\"}]},{\"id\":44,\"name\":\"히비스커스 티\",\"price\":3000,\"itemOptions\":[{\"id\":43,\"name\":\"HOT\"}]},{\"id\":44,\"name\":\"히비스커스 티\",\"price\":3000,\"itemOptions\":[{\"id\":43,\"name\":\"HOT\"}]}]},{\"id\":3,\"name\":\"만랩커피 마포점\",\"items\":[{\"id\":53,\"name\":\"아메리카노\",\"price\":1500,\"itemOptions\":[{\"id\":54,\"name\":\"ICE\"},{\"id\":56,\"name\":\"HOT\"}]},{\"id\":53,\"name\":\"아메리카노\",\"price\":1500,\"itemOptions\":[{\"id\":54,\"name\":\"ICE\"},{\"id\":56,\"name\":\"HOT\"}]},{\"id\":58,\"name\":\"카페라떼\",\"price\":2000,\"itemOptions\":[{\"id\":54,\"name\":\"ICE\"},{\"id\":56,\"name\":\"HOT\"}]},{\"id\":58,\"name\":\"카페라떼\",\"price\":2000,\"itemOptions\":[{\"id\":54,\"name\":\"ICE\"},{\"id\":56,\"name\":\"HOT\"}]},{\"id\":59,\"name\":\"카페모카\",\"price\":3900,\"itemOptions\":[{\"id\":54,\"name\":\"ICE\"},{\"id\":56,\"name\":\"HOT\"}]},{\"id\":59,\"name\":\"카페모카\",\"price\":3900,\"itemOptions\":[{\"id\":54,\"name\":\"ICE\"},{\"id\":56,\"name\":\"HOT\"}]},{\"id\":60,\"name\":\"콜드브루\",\"price\":2500,\"itemOptions\":[{\"id\":54,\"name\":\"ICE\"}]},{\"id\":60,\"name\":\"콜드브루\",\"price\":2500,\"itemOptions\":[{\"id\":54,\"name\":\"ICE\"}]},{\"id\":61,\"name\":\"녹차라떼\",\"price\":3000,\"itemOptions\":[{\"id\":54,\"name\":\"ICE\"},{\"id\":56,\"name\":\"HOT\"}]},{\"id\":61,\"name\":\"녹차라떼\",\"price\":3000,\"itemOptions\":[{\"id\":54,\"name\":\"ICE\"},{\"id\":56,\"name\":\"HOT\"}]},{\"id\":55,\"name\":\"딸기라떼\",\"price\":3000,\"itemOptions\":[{\"id\":54,\"name\":\"ICE\"},{\"id\":56,\"name\":\"HOT\"}]},{\"id\":55,\"name\":\"딸기라떼\",\"price\":3000,\"itemOptions\":[{\"id\":54,\"name\":\"ICE\"},{\"id\":56,\"name\":\"HOT\"}]},{\"id\":62,\"name\":\"녹차\",\"price\":3000,\"itemOptions\":[{\"id\":56,\"name\":\"HOT\"}]},{\"id\":62,\"name\":\"녹차\",\"price\":3000,\"itemOptions\":[{\"id\":56,\"name\":\"HOT\"}]},{\"id\":57,\"name\":\"히비스커스 티\",\"price\":3000,\"itemOptions\":[{\"id\":56,\"name\":\"HOT\"}]},{\"id\":57,\"name\":\"히비스커스 티\",\"price\":3000,\"itemOptions\":[{\"id\":56,\"name\":\"HOT\"}]}]},{\"id\":5,\"name\":\"이디야커피 마포오벨리스크점\",\"items\":[{\"id\":66,\"name\":\"아메리카노\",\"price\":1500,\"itemOptions\":[{\"id\":67,\"name\":\"ICE\"},{\"id\":69,\"name\":\"HOT\"}]},{\"id\":66,\"name\":\"아메리카노\",\"price\":1500,\"itemOptions\":[{\"id\":67,\"name\":\"ICE\"},{\"id\":69,\"name\":\"HOT\"}]},{\"id\":71,\"name\":\"카페라떼\",\"price\":2000,\"itemOptions\":[{\"id\":67,\"name\":\"ICE\"},{\"id\":69,\"name\":\"HOT\"}]},{\"id\":71,\"name\":\"카페라떼\",\"price\":2000,\"itemOptions\":[{\"id\":67,\"name\":\"ICE\"},{\"id\":69,\"name\":\"HOT\"}]},{\"id\":72,\"name\":\"카페모카\",\"price\":3900,\"itemOptions\":[{\"id\":67,\"name\":\"ICE\"},{\"id\":69,\"name\":\"HOT\"}]},{\"id\":72,\"name\":\"카페모카\",\"price\":3900,\"itemOptions\":[{\"id\":67,\"name\":\"ICE\"},{\"id\":69,\"name\":\"HOT\"}]},{\"id\":73,\"name\":\"콜드브루\",\"price\":2500,\"itemOptions\":[{\"id\":67,\"name\":\"ICE\"}]},{\"id\":73,\"name\":\"콜드브루\",\"price\":2500,\"itemOptions\":[{\"id\":67,\"name\":\"ICE\"}]},{\"id\":74,\"name\":\"녹차라떼\",\"price\":3000,\"itemOptions\":[{\"id\":67,\"name\":\"ICE\"},{\"id\":69,\"name\":\"HOT\"}]},{\"id\":74,\"name\":\"녹차라떼\",\"price\":3000,\"itemOptions\":[{\"id\":67,\"name\":\"ICE\"},{\"id\":69,\"name\":\"HOT\"}]},{\"id\":68,\"name\":\"딸기라떼\",\"price\":3000,\"itemOptions\":[{\"id\":67,\"name\":\"ICE\"},{\"id\":69,\"name\":\"HOT\"}]},{\"id\":68,\"name\":\"딸기라떼\",\"price\":3000,\"itemOptions\":[{\"id\":67,\"name\":\"ICE\"},{\"id\":69,\"name\":\"HOT\"}]},{\"id\":75,\"name\":\"녹차\",\"price\":3000,\"itemOptions\":[{\"id\":69,\"name\":\"HOT\"}]},{\"id\":75,\"name\":\"녹차\",\"price\":3000,\"itemOptions\":[{\"id\":69,\"name\":\"HOT\"}]},{\"id\":70,\"name\":\"히비스커스 티\",\"price\":3000,\"itemOptions\":[{\"id\":69,\"name\":\"HOT\"}]},{\"id\":70,\"name\":\"히비스커스 티\",\"price\":3000,\"itemOptions\":[{\"id\":69,\"name\":\"HOT\"}]}]},{\"id\":7,\"name\":\"이디야커피 대림역점\",\"items\":[{\"id\":79,\"name\":\"아메리카노\",\"price\":1500,\"itemOptions\":[{\"id\":80,\"name\":\"ICE\"},{\"id\":82,\"name\":\"HOT\"}]},{\"id\":79,\"name\":\"아메리카노\",\"price\":1500,\"itemOptions\":[{\"id\":80,\"name\":\"ICE\"},{\"id\":82,\"name\":\"HOT\"}]},{\"id\":84,\"name\":\"카페라떼\",\"price\":2000,\"itemOptions\":[{\"id\":80,\"name\":\"ICE\"},{\"id\":82,\"name\":\"HOT\"}]},{\"id\":84,\"name\":\"카페라떼\",\"price\":2000,\"itemOptions\":[{\"id\":80,\"name\":\"ICE\"},{\"id\":82,\"name\":\"HOT\"}]},{\"id\":85,\"name\":\"카페모카\",\"price\":3900,\"itemOptions\":[{\"id\":80,\"name\":\"ICE\"},{\"id\":82,\"name\":\"HOT\"}]},{\"id\":85,\"name\":\"카페모카\",\"price\":3900,\"itemOptions\":[{\"id\":80,\"name\":\"ICE\"},{\"id\":82,\"name\":\"HOT\"}]},{\"id\":86,\"name\":\"콜드브루\",\"price\":2500,\"itemOptions\":[{\"id\":80,\"name\":\"ICE\"}]},{\"id\":86,\"name\":\"콜드브루\",\"price\":2500,\"itemOptions\":[{\"id\":80,\"name\":\"ICE\"}]},{\"id\":87,\"name\":\"녹차라떼\",\"price\":3000,\"itemOptions\":[{\"id\":80,\"name\":\"ICE\"},{\"id\":82,\"name\":\"HOT\"}]},{\"id\":87,\"name\":\"녹차라떼\",\"price\":3000,\"itemOptions\":[{\"id\":80,\"name\":\"ICE\"},{\"id\":82,\"name\":\"HOT\"}]},{\"id\":81,\"name\":\"딸기라떼\",\"price\":3000,\"itemOptions\":[{\"id\":80,\"name\":\"ICE\"},{\"id\":82,\"name\":\"HOT\"}]},{\"id\":81,\"name\":\"딸기라떼\",\"price\":3000,\"itemOptions\":[{\"id\":80,\"name\":\"ICE\"},{\"id\":82,\"name\":\"HOT\"}]},{\"id\":88,\"name\":\"녹차\",\"price\":3000,\"itemOptions\":[{\"id\":82,\"name\":\"HOT\"}]},{\"id\":88,\"name\":\"녹차\",\"price\":3000,\"itemOptions\":[{\"id\":82,\"name\":\"HOT\"}]},{\"id\":83,\"name\":\"히비스커스 티\",\"price\":3000,\"itemOptions\":[{\"id\":82,\"name\":\"HOT\"}]},{\"id\":83,\"name\":\"히비스커스 티\",\"price\":3000,\"itemOptions\":[{\"id\":82,\"name\":\"HOT\"}]}]}]";
//
//    @Data
//    static class _Store {
//        private Long id;
//        private String name;
//        private List<_Item> items = new ArrayList<>();
//
//        @NoArgsConstructor
//        @Data
//        static class _Item {
//            private Long id;
//            private String name;
//            private Long price;
//            List<_ItemOption> itemOptions = new ArrayList<>();
//        }
//
//        @NoArgsConstructor @Data
//        static class _ItemOption {
//            private Long id;
//            private String name;
//        }
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Long userId = 2L;
//        Long userCouponId = null;
//
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 0) userId = 2L;
//            else userId = 3L;
//
//            List<Team> orders = new ArrayList<>();
//            _Store[] stores = objectMapper.readValue(teamJson, _Store[].class);
//            for (_Store store : stores) {
//                Long storeId = store.getId();
//
//                List<TeamUser> orderItems = new ArrayList<>();
//                for (_Store._Item item : store.getItems()) {
//                    Long itemId = item.getId();
//                    Long price = item.getPrice();
//
////                    List> orderItemOptions = new ArrayList<>();
////                    for (_Store._ItemOption itemOption : item.getItemOptions()) {
////                        Long itemOptionId = itemOption.getId();
////
////                        OrderItemOption of = OrderItemOption.of(itemOptionId);
////                        orderItemOptions.add(of);
////                    }
//                    TeamUser teamUser = TeamUser.of(itemId, price, 2L);
//                    orderItems.add(teamUser);
//                }
//
//                Team team = Team.of(userId, userCouponId, storeId, orderItems);
////                if (i % 2 == 0) team.setOrderStatus(OrderStatus.FINISHED);
////                else order.setOrderStatus(OrderStatus.REJECTED);
//                orders.add(order);
//            }
//
//            teamRepository.saveAll(orders);
//        }
//    }
//}
