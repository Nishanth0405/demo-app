package com.demo.webapp.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

        @Id
        private String userId;

        private String userName;
        private String firstName;
        private String lastName;
}
