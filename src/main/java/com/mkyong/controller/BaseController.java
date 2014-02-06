package com.mkyong.controller;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class BaseController {

    /**
     *
     * @param model request params?
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws IOException
     */
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(ModelMap model) throws IllegalAccessException, InstantiationException, IOException {
        ClassLoader parent = BaseController.class.getClassLoader();
        GroovyClassLoader loader = new GroovyClassLoader(parent);
        // Uncomment line below if used with separate servletcontainer
        // File source = new File("../webapps/counterwebapp/WEB-INF/classes/groovy/com/mkyong/controller/BaseControllerG.groovy");

        // Uncomment line below if used with embedded jetty
        File source = new File("src/main/resources/groovy/com/mkyong/controller/BaseControllerG.groovy");

        Class groovyClass = loader.parseClass(source);
        GroovyObject groovyObject = (GroovyObject) groovyClass.newInstance();
        Object[] argz = {model};

        return (String) groovyObject.invokeMethod("renderRequest", argz);

	}

    /**
     *
     * @param name
     * @param model
     * @return
     */
	@RequestMapping(value = "/welcome/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {

		model.addAttribute("message", "Maven Web Project + Spring 3 MVC - "
				+ name + ", idiootti!");
		return "index";

	}

}