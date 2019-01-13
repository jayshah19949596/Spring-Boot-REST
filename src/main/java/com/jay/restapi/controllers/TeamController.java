package com.jay.restapi.controllers;

import java.util.List;
import java.util.Arrays;
import com.jay.restapi.models.Member;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TeamController
{
    @RequestMapping("/team")
    public List<Member> getAllTeamMembers()
    {
        return Arrays.asList(
                new Member(1, "Jay", "Shah"),
                new Member(2, "Anusha", "Tatavarti")
        );
    }
}