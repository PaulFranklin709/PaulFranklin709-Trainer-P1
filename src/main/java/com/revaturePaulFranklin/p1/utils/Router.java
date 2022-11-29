package com.revaturePaulFranklin.p1.utils;

import com.revaturePaulFranklin.p1.daos.UserDAO;
import com.revaturePaulFranklin.p1.daos.UserRoleDAO;
import com.revaturePaulFranklin.p1.handlers.AuthenticationHandler;
import com.revaturePaulFranklin.p1.handlers.UserHandler;
import com.revaturePaulFranklin.p1.services.TokenService;
import com.revaturePaulFranklin.p1.services.UserService;
import io.javalin.Javalin;

import static io.javalin.apibuilder.ApiBuilder.path;
import static io.javalin.apibuilder.ApiBuilder.post;

public class Router {
    public static void handle(Javalin application) {
        final JwtConfiguration jwtConfiguration = new JwtConfiguration();

//        DAOs
        final UserRoleDAO userRoleDAO = new UserRoleDAO();
        final UserDAO userDAO = new UserDAO(userRoleDAO);

//        Services
        final UserService userService = new UserService(userDAO);
        final TokenService tokenService = new TokenService(jwtConfiguration);

//        Handlers
        final UserHandler userHandler = new UserHandler(userService);
        final AuthenticationHandler authenticateHandler = new AuthenticationHandler(userService, tokenService);

        application.routes(() -> {
            path("/user", () -> {
                post(context -> userHandler.createNewUser(context));
            });
            path("/authenticate", () -> {
                post(context -> authenticateHandler.authenticateUser(context));
            });
        });
    }
}
