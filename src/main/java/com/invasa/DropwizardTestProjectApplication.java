package com.invasa;

import com.invasa.resources.HelloWorld;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropwizardTestProjectApplication extends Application<DropwizardTestProjectConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardTestProjectApplication().run(args);
    }

    @Override
    public String getName() {
        return "Dropwizard Test Project";
    }

    @Override
    public void initialize(final Bootstrap<DropwizardTestProjectConfiguration> bootstrap) {
        // TODO: application initialization

    }

    @Override
    public void run(final DropwizardTestProjectConfiguration configuration,
                    final Environment environment) {

        final HelloWorld resource = new HelloWorld();
        environment.jersey().register(resource);
    }

}
