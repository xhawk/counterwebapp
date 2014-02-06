package com.mkyong.controller;

import org.springframework.ui.ModelMap;

/**
 * Created by siili on 05/02/14.
 */
public abstract class Crtl {
    public abstract String renderRequest(ModelMap model);
}
