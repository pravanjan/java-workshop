# Sample Application

## 📄 Info

A sample application with examples. It is a base application to be used for new projects.

For further information please check root `readme.md` file.

## ⚙️ Build

Base scripts (if you use gradle wrapper, replace `gradle` with `gradlew`):

* `gradle build` - build application
* `gradle test` - run tests
* `gradle bootRun` - run application

## ▶️ Local Development

The easiest way to start local development is to copy `resources/template/template-application-local.yml`
to `resources/applicatio-local.yml` and start application with `local` profile.

> 💡 Check root `readme.md` file for more information how to run application with different profiles.

> 💡 Configuration stored `application-local.yml` is your local configuration and not stored in Git.
> You can modify it as you want without any impact to other developers.

Default local profile:

* Changes port to 8000 (to easily check if we really use local profile)
* Changes logger level to debug and exception messages to verbose mode
* Disables security (for easier local testing)