/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.39
 * Generated at: 2020-04-01 02:14:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.home.en.general.about.about;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/jsp/common/import/taglib.jspf", Long.valueOf(1555304080000L));
    _jspx_dependants.put("jar:file:/home/ktbnetwork/www/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/home/ktbnetwork/www/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1528432326000L));
    _jspx_dependants.put("jar:file:/home/ktbnetwork/www/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<section id=\"container\" class=\"container\">\r\n");
      out.write("\t\t\t<nav class=\"nav\">\r\n");
      out.write("\t\t\t\t<ol class=\"navArea\"><li>HOME</li><li>About KTB Group</li></ol>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<div class=\"visualArea\">\r\n");
      out.write("\t\t\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t\t\t<h1 class=\"pageTit\">About KTB Group</h1>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"pageTxt\">Complete your success story with KTB Group</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"hidden\">About KTB Group</h2>\r\n");
      out.write("\t\t\t\t\t<div class=\"aboutGroup\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"txtCopy\">Growing with our Clients</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"subTxt\">\r\n");
      out.write("\t\t\t\t\t\t\tOriginally founded in 1981 as Korea Technology Development Company, a government-funded investment vehicle specializing \r\n");
      out.write("\t\t\t\t\t\t\t<br>in technology-related investment opportunities, KTB Financial Group(“KTB”) has since grown into a comprehensive financial \r\n");
      out.write("\t\t\t\t\t\t\t<br>group offering a wide range of financial services, including securities, asset management, venture capital and private equity. \r\n");
      out.write("\t\t\t\t\t\t\t<br>We, KTB, also have expanded our global network by actively entering overseas markets includes the United States, China and Thailand.\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"imgArea\"><img src=\"/static/home/en/images/contents/img_worldmap.jpg\" alt=\"\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"tabType1\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"on\"><a href=\"#\" aria-selected=\"true\">History</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Subsidiaries</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tabCont on\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"hidden\">History</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"historyArea\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ol class=\"historyList\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"year\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong class=\"num\">1981</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ol class=\"list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong class=\"tit\">1981. 05</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"txt\">Established Korea Technology Development Company</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"year\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong class=\"num\">1999</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ol class=\"list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong class=\"tit\">1999. 09</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"txt\">Established KTB Asset Management</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"year\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong class=\"num\">2000</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ol class=\"list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong class=\"tit\">2000. 12</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"txt\">Established KTB Ventures (U.S. entity)</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"year\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong class=\"num\">2008</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ol class=\"list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong class=\"tit\">2008. 06</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"txt\">Established KTB Network (Venture Capital)</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong class=\"tit\">2008. 07</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"txt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>Established KTB Securities Thailand</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>Established KTB Investment &amp; Securities</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"year\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong class=\"num\">2012</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ol class=\"list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong class=\"tit\">2012. 04</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"txt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tEstablished KTB Private Equity\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<br>(Spin-off from KTB Investment &amp; Securities PE Division)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tabCont\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"hidden\">Subsidiaries</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"subsidiary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"imgArea\"><img src=\"/static/home/en/images/contents/img_affiliates_eng_v2.jpg\" alt=\"KTB Subsidiaries\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"subsidiaryName\"><img src=\"/static/home/en/images/contents/img_ssname01_eng.png\" alt=\"KTB Investment & Securities\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"site\"><a href=\"http://www.ktb.co.kr\" target=\"_blank\">www.ktb.co.kr</a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"txt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tOriginally founded in 1981 as Korea Technology Development Company, a government-funded investment vehicle specializing in technology-related \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tinvestment opportunities, KTB Investment&Securities(&quot;KTB&quot;) has since grown into a comprehensive securities company offering a wide range of financial\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tproducts and services including investment banking, institutional brokerage and individual wealth management.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>KTB's professional have long played leading role professionals in the structured finance market, with strong expertise in a wide range of alternative \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tinvestment products, including real estate / SOC, aircraft and ship financing and renewable energy.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>KTB holds KTB Asset Management, KTB Network(Venture Capital), KTB Private Equity, KTB Credit Service as its wholly owned subsidiaries.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"subsidiaryName\"><img src=\"/static/home/en/images/contents/img_ssname02_eng.png\" alt=\"KTB Asset Management\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"site\"><a href=\"http://www.i-ktb.com\" target=\"_blank\">www.i-ktb.com</a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"tel\">+82-2-788-8259</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"txt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tKTB Asset Management has shown steady\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tgrowth for more than 20 years since it was \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfirst founded in 1999. As of the end of 2019, \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tits assets under management (AUM)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\treached USD 10.8 billion*.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tIn particular, the company has distinguished \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\titself in new business development, with \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsuccessful launches of Multi-Asset \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tDepartment and Alternative Investment \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tDivision in 2016.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tBy launching and operating a number of \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsuccessful public funds, such as First Class \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tStock Fund, KOSDAQ Venture Fund, and\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tKONEX High-Yield Fund, KTB Asset \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tManagement continues to play a leading \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\trole in the market, and is expanding its \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tunique portfolio of medium-risk and \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmedium-return products such as EMP, NPL, \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tand the asset allocation fund.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tThe Alternative Investment Division has \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclosed USD 1.1 billion-worth deals in \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmajor commercial districts around the \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tworld in 2019, and is operating USD \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t3.2 billion-worth of alternative investments \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tas of the end of 2019.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"grayTxt\">* Source : Korea Financial Investment Association</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"subsidiaryName\"><img src=\"/static/home/en/images/contents/img_ssname03_eng.png\" alt=\"KTB Network\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"site\"><a href=\"http://www.ktbnetwork.com\" target=\"_blank\">www.ktbnetwork.com</a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"tel\">+82-31-628-6400</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"txt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tKTB Network is Korea's leading venture \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcapital company with the longest history \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tand investment track record, boasting an \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAUM of approx. \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tUSD 763 million at the end of 2019.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tKTB Network was ranked first in VC \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tinvestment performance in 2017*.\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tKTB Network became the first Korean venture\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcapital firm to participate in the Chinese \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tventure capital market, making its initial \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tinvestment in China as early as the year 2000.  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tKTB Network has taken advantage of its\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&quot;First Mover&quot; status in China, generating \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsistent investment results year after year.  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tIt has ranked among top 50 venture capital\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfirms in China for nine years in a row. \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tFurthermore, it boasts a wide-ranging global \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tinvestment track record and strong network \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tin the US, Japan and Southeast Asia.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"grayTxt\">* Source :  Korean Venture Capital Association(Including PEF)</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"subsidiaryName\"><img src=\"/static/home/en/images/contents/img_ssname04_eng.png\" alt=\"KTB Private Equity\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"site\"><a href=\"//www.ktbpe.co.kr\" target=\"_blank\">www.ktbpe.co.kr</a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"tel\">+82-2-2184-4100</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"txt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tKTB Private Equity (&quot;KTB PE&quot;) was spun off from KTB Investment & Securities in 2012 to become an independent corporate entity serving the growing \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tprivate equity market in Korea.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>KTB PE has a cumulative AUM of USD 1.8 billion and has achieved excellent investment results in a variety of industries by enhancing corporate value \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tthrough proactive management participation and a buy-out-centered investment philosophy. Its key investments-to-date include Junjin Heavy Industry, \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tDongbu Express, JW Pharmaceutical, LIG Nex1, Nature Republic, Leenos, Toptec and more.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"subsidiaryName\"><img src=\"/static/home/en/images/contents/img_ssname05_eng.png\" alt=\"KTB Credit Service\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"site\"><a href=\"http://www.ktbcredit.com\" target=\"_blank\">www.ktbcredit.com</a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"tel\">+82-2-721-6900</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"txt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tKTB Credit Service (&quot;KTB Credit&quot;), \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\twhich first began as Nara Credit Service \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tin 1999, became an affiliate of \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tKTB Investment & Securities in 2001.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tServices provided by KTB Credit include \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdebt collection, credit investigation, \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tissuance of civil affair documents \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tand real estate management. \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tKTB Credit has been a clear market leader \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tin the field of debt collection and related \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tinformation services, as seen in its role as \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tthe primary debt collection agency for the \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tKorea Deposit Insurance Corporation for \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tnearly 20 years.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"grayTxt\">※ Served as the debt collector for the Korea \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tDeposit Insurance Corporation from 2001 \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tto Mar. 2020 </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"subsidiaryName\"><img src=\"/static/home/en/images/contents/img_ssname06_eng.png\" alt=\"KTB ST\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"site\"><a href=\"http://www.ktbst.co.th\" target=\"_blank\">www.ktbst.co.th</a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"tel\">+66-02-648-1111</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"txt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAcquired by KTB Investment &amp; Securities in August 2008, KTB Securities Thailand(\"KTB ST\") is a securities company based in Thailand.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>Recent expansion efforts in Wealth Management, ECM, DCM and Investment Banking business lines have bolstered asset management capabilities KTB ST, \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttransforming the company into a comprehensive securities company offering a complete range of financial products.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>KTB ST has continued to expand its footprint as the only Korean financial investment company in Thailand. At the end of 2019, KTB ST has been changed \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ta holding company that has securities, asset management and Reits management subsidiaries. \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"subsidiaryName\"><img src=\"/static/home/en/images/contents/img_ssname07_eng.png\" alt=\"KTB ventures\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"site\"><a href=\"http://www.ktbvc.com\" target=\"_blank\">www.ktbvc.com</a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"tel\">+1-650-324-4681</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"txt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tKTB Ventures, KTB’s first overseas subsidiary, was established in Palo Alto, California, the heart of American Silicone Valley in June 1988.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>KTB Ventures has an accumulated investment record worth USD 100 million. Working closely with KTB Network, KTB Ventures has recently ramped up \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tits efforts to identify early-stage investment opportunities in North America.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
