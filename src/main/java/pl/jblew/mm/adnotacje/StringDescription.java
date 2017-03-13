package pl.jblew.mm.adnotacje;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import pl.jblew.mm.generator.GeneratorSkip;

@Documented
@Retention(RUNTIME)
@Target(METHOD)
@GeneratorSkip
public @interface StringDescription {

}
