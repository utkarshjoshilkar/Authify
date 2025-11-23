package in.utkarsh.authify.io;

import lombok.Data;

@Data
public class AuthRequest {

    private String email;
    private String password;

}
