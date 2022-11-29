package com.revaturePaulFranklin.p1;

import com.revaturePaulFranklin.p1.utils.Router;
import io.javalin.Javalin;

public class MainDriver {
    public static void main(String[] args) {
        Javalin application = Javalin.create(configuration -> {
            configuration.contextPath = "/";
        }).start(8080);

        Router.handle(application);
    }
}
