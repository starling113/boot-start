package org.lingg.bootstart.boot3.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);

        errorAttributes.put("company","LingGen Company");

        Object ext = webRequest.getAttribute("ext", RequestAttributes.SCOPE_REQUEST);

        errorAttributes.put("ext", ext);

        return errorAttributes;
    }
}
