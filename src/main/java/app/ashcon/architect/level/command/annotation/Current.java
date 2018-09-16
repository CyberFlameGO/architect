package app.ashcon.architect.level.command.annotation;

import app.ashcon.architect.level.Level;
import app.ashcon.architect.level.command.provider.CurrentLevelProvider;
import app.ashcon.intake.parametric.annotation.Classifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Parameter annotation that gets the current {@link Level}.
 *
 * @see CurrentLevelProvider
 */
@Classifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Current {}
