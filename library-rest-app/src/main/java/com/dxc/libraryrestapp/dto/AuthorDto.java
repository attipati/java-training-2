package com.dxc.libraryrestapp.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {

    @NotBlank(message = "user name is mandatory")
    private String name;

    @NotBlank(message = "user email is mandatory")
    private String email;

    @NotBlank(message = "user password is mandatory")
    @Size(min=6 , max=10 , message="password size must be in between 6 and 10")
    private String password;    
    
}
