package org.backend.dispatcher.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class UserRequestDTO {
    private String first_name;
    private String second_name;
    private String third_name;
    private String phone;
    private String login;
    private String password;
    private int qualification_id;
    private int role_id;
    private int organization_id;
}
