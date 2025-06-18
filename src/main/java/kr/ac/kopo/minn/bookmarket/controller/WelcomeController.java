package kr.ac.kopo.minn.bookmarket.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String welcomeMethod() {
        String welcomeHtml = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Welcome BookMarket</title>\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\n" +
                "          rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\"\n" +
                "          crossorigin=\"anonymous\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<main>\n" +
                "    <div class=\"container py-4\">\n" +
                "        <header class=\"pb-3 mb-4 border-bottom\">\n" +
                "            <a href=\"/\" class=\"d-flex align-items-center text-body-emphasis text-decoration-none\">\n" +
                "                <svg version=\"1.0\" id=\"Layer_1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"\n" +
                "                     width=\"32px\" height=\"32px\" viewBox=\"0 0 64 64\" enable-background=\"new 0 0 64 64\" xml:space=\"preserve\">\n" +
                "                    <g>\n" +
                "                        <path fill=\"#231F20\" d=\"M1.59,0.805C0.59,1.562,0,2.746,0,4v48c0,1.785,1.184,3.355,2.902,3.848L28,64V8L5.098,0.152\n" +
                "                            C3.895-0.188,2.594,0.051,1.59,0.805z\"/>\n" +
                "                        <path fill=\"#231F20\" d=\"M62.41,0.805c-1.004-0.754-2.309-0.992-3.508-0.652L36,8v56l25.098-8.152C62.816,55.355,64,53.785,64,52V4\n" +
                "                            C64,2.746,63.41,1.562,62.41,0.805z\"/>\n" +
                "                    </g>\n" +
                "                </svg>\n" +
                "                <span class=\"fs-4\">&nbsp;&nbsp;BookMarket</span>\n" +
                "            </a>\n" +
                "        </header>\n" +
                "\n" +
                "        <div class=\"p-5 mb-4 bg-body-tertiary rounded-3\">\n" +
                "            <div class=\"container-fluid py-5\">\n" +
                "                <h1 class=\"display-5 fw-bold\">도서 쇼핑몰에 오신 것을 환영합니다.</h1>\n" +
                "                <p class=\"col-md-8 fs-4\">BookMarket</p>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"row align-items-md-stretch text-center\">\n" +
                "            <div class=\"col-md-12\">\n" +
                "                <div class=\"h-100 p-5\">\n" +
                "                    <h2>Welcome to Web Market</h2>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\n" +
                "        <footer class=\"pt-3 mt-4 text-body-secondary border-top\">\n" +
                "            <span class=\"text-body-secondary\">&copy;2025 BookMarket</span>\n" +
                "        </footer>\n" +
                "    </div>\n" +
                "</main>\n" +
                "</body>\n" +
                "</html>";

        return welcomeHtml;
    }
}
