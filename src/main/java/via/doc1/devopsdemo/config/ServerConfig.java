package via.doc1.devopsdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import via.doc1.devopsdemo.service.TeamService;


@Configuration
public class ServerConfig
{
    @Bean public TeamService getTeamService(){
        return new TeamService();
    }
}