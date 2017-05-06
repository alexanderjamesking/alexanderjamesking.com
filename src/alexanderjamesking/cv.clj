(ns alexanderjamesking.cv
  (:require [alexanderjamesking.html :refer :all])
  (:use [hiccup.core]
        [hiccup.page]
        [hiccup.element :only [link-to]]))

(defn content []
  (wrapper
   :cv
   [:div {:class "pure-g"}
    [:div {:class "pure-u-1 pure-u-md-4-5"}
     [:img {:src "/images/alex-on-a-volcano.jpg" :class "pure-img"}]

     [:h1 "Alexander James King"]

     [:article
      [:p "An enthusiastic, hard working, senior software engineer, passionate about delivering clean, well tested code, that is easy for others to understand."]
      [:p "Adept at working in agile environments, pair programming, and communicating technical implications and processes to non-technical colleagues."]
      [:p "A versatile developer, experienced in both client and server side development, with a natural passion for software engineering."]]

     [:article
      [:h2 "Expertise"]
      [:ul
       [:li "Clojure, ClojureScript, EMacs, Leiningen"]
       [:li "Scala, SBT, Play, Akka-Http"]
       [:li "Java, Maven, Groovy, Spring, Cucumber JVM, JAX-RS, Apache Camel, JMS"]
       [:li "Javascript, ES6, React, Redux, Node.js, Mocha, JSON, jQuery, MongoDB"]
       [:li "PHP, Linux, Apache, MySQL"]
       [:li "BDD, TDD, Cucumber, Continuous Delivery "]
       [:li "REST, CQRS, Event Sourcing"]
       [:li "Travis, Jenkins"]
       [:li "Amazon Web Services (EC2, SNS, SQS, S3)"]
       [:li "MarkLogic, XML, XQuery, XSLT"]
       [:li "Linked Data, SPARQL, RDF"]
       [:li "Git, Subversion"]
       [:li "XP, Agile, Kanban, Scrum"]]]

     [:article
      [:h2 "Key Achievements"]
      [:div
       [:p "HMRC - Delievered a new system to prepare tax credit renewals for automation vastly reducing the manual work required to process renewals every year."]
       [:p "HMRC - Delivered a new payments system to process business tax payments."]
       [:p "BBC News - Successfully delivered the 2014 Elections results service working to a tight deadline."]
       [:p "BBC Core Engineering - Delivered new CMS features whilst contintually refactoring and improving code."]
       [:p "BBC Sport - Led the design and delivery of a new Java service to aggregate content from multiple APIs and dramatically improved the speed of content delivery to users of the site."]
       [:p "BBC Sport - Mentored software engineers at BBC Sport, encouraging development best practices (BDD, TDD, Clean Code)."]
       [:p "BBC Sport - Assisted in designing a new architecture with a consistent data format across sports, improved the speed of delivery and cost of maintenance."]
       [:p "CTI Digital - Bridged the gap between the front end and service layer teams, improved communication and ensured key deadlines were met."]
       [:p "England Agency - Designed and built a new CMS used on over 200 sites, dramatically reduced development time of new sites enabling a smaller team to deliver more."]
       ]]

     [:h1 "Professional Experience"]

     [:article
      [:h2 "Credit Suisse (via JUXT)"]
      [:h5 "Clojure/ClojureScript Developer - 03/2017 to present"]
      [:p "Development of a Clojure/Clojurescript UI providing a high level view of trading books at Credit Suisse."]
      [:h5 "Clojure, ClojureScript, Reagent, Re-Frame, Emacs"]]

     [:article
      [:h2 "Medidata"]
      [:h5 "Full Stack Senior Software Engineer  - 06/2016 to 03/2017"]
      [:p "Development of a greenfield project. An ES6 React/Redux front end application with backend microservices built with Scala on Akka-Http."]
      [:h5 "ES6, React, Redux, Scala, Akka-Http, Selenium, MySQL, AWS, Travis CI, Swagger"]]

     [:article
      [:h2 "Sky"]
      [:h5 "Software Developer - 12/2015 to 05/2016"]
      [:p "Ongoing development of the NOW TV platform, migration from a Java EE application to microservices written in Scala."]
      [:h5 "Scala, Play, Spray, Java, Groovy, Spock, REST, MongoDB, Swagger"]]

     [:article
      [:h2 "HMRC"]
      [:h5 "Scala developer - 09/2014 to 11/2015"]
      [:p "Development of a new payments system integrating with Worldpay."]
      [:p "Continued development and improvement of business tax homepage."]
      [:p "Development of a new system to automate tax credit renewals."]
      [:h5 "Scala, Play, REST, Cucumber JVM, Selenium, Microservices, Docker, MongoDB"]]

     [:article
      [:h2 "BBC News"]
      [:h5 "Senior Software Engineer - 03/2014 to 08/2014"]
      [:p "Delivered a new system to consume, transform and persist election results."]
      [:p "Development of an aggregation API to improve the delivery of content to the News IOS and Android apps."]
      [:h5 "Java, REST, AWS, Apache Camel, MySQL"]]

     [:article
      [:h2 "BBC Core Engineering"]
      [:h5 "Senior Software Engineer - 09/2013 to 03/2014"]
      [:p "Development of a new in-house CMS. Focused on delivering new features to enable clients to migrate to the new system, dramatically improved the feedback loop and quality of the tests to faciliate BDD."]
      [:p "Provided expertise around the use of MarkLogic, worked on forming a strategy to reduce duplication across the various content management systems within the BBC."]
      [:p "Java, Scala, MarkLogic, XQuery, REST, JMS, Node.js, AWS"]]

     [:article
      [:h2 "BBC Sport"]
      [:h5 "Senior Software Engineer - 05/2011 to 09/2013"]
      [:article
       ]

      [:article
       [:h3 "BBC Sport Live"]
       [:p "Led the design and development of a greenfield project that changes the way data is delivered to users of digital content, initially on the Sport website."]
       [:h5 "Java, Apache Camel, REST, Node.js"]]

      [:article
       [:h3 "Connected Studio - Death of the Robot"]
       [:p "Led the team from concept to delivery of a pilot project, combining the best content from Twitter with editorial content, to enrich and bring more colour to the live event experience on the BBC Sport website."]
       [:h5 "Java, Twitter Streaming API, OpenNLP, Apache Camel, REST, Node.js, MongoDB, Websockets, AWS"]]

      [:article
       [:h3 "Sports Data"]
       [:p "A major refresh of the architecture behind the BBC Sport website. Replaced custom XML format with open standard to enable hot switching of vendors. Improved delivery chain, reduced latency from minutes to seconds."]
       [:h5 "Java, MarkLogic, XQuery, XSLT, REST, JMS, SportsML"]]

      [:article
       [:h3 "Linked Data Sport API"]
       [:p "Led development of a new project to power dynamic indexes on the BBC Sport website."]
       [:h5 "Java, Linked Data, SPARQL, RDF, REST"]]

      [:article
       [:h3 "Sports Stats"]
       [:p "Maintenance and ongoing development of a legacy system that transformed and persisted data from third parties, then generated static server side includes to display sports tables, fixtures and results on the BBC Sport Website pre 2013."]
       [:h5 "Java, MarkLogic, XQuery, MySQL, Hibernate, JMS, REST"]]

      [:article
       [:h3 "Sports Refresh"]
       [:p "Initial refresh of the architecture and design of the BBC Sport website, first launched in February 2012. The first steps in replacing a statically published site with a dynamically driven site."]
       [:h5 "Java, PHP, Apache Velocity, MarkLogic, SSI"]]]

     [:article
      [:h2 "CTI Digital"]
      [:h5 "Senior Developer - 2010 to 2011"]
      [:ul
       [:li "Java service development using the Spring Framework, REST, Maven, Hudson, Hibernate, MySQL"]
       [:li "Front end development using PHP, Zend Framework, SOAP, jQuery and ActionScript 3"]
       [:li "Test Driven Development"]
       [:li "Version control using Subversion and Git"]]]

     [:article
      [:h2 "England Agency"]
      [:h5 "Lead Developer - 2008 to 2010"]
      [:ul
       [:li "Project estimation and planning"]
       [:li "Providing creative and technical input on all web projects"]
       [:li "Developing and maintaining dynamic websites using PHP5, REST, MySQL, JavaScript, ActionScript 3, AJAX, XML and XSLT"]
       [:li "Development of a new in-house CMS using the Zend Framework"]
       [:li "Upgrades and ongoing development of the in-house mass mailer system"]
       [:li "Server installation and maintenance, linux shell scripting"]
       [:li "Version control using Subversion"]]]

     [:article
      [:h2 "Ripe Design"]
      [:h5 "Lead Developer - 2007 to 2008"]
      [:ul
       [:li "Developing and maintaining dynamic websites using PHP5, MySQL, JavaScript, ActionScript 3, AJAX, XML and XSLT"]
       [:li "Development of a CRM system built using Adobe Flex and PHP5 for a major property developer"]
       [:li "Server installation and maintenance, linux shell scripting"]
       [:li "Integration with web services - Salesforce, COINS, SOAP, Google Maps, PayPal, Google Checkout"]
       [:li "Scoping and taking responsibility and ownership of large projects to ensure they are delivered on time and to brief"]
       [:li "Providing creative and technical input on all web projects"]
       [:li "Ongoing development of the in-house CMS"]
       [:li "Version control using Subversion"]]]

     [:article
      [:h2 "Webanywhere"]
      [:h5 "Web Developer - 2005 to 2007"]
      [:ul
       [:li "Web development using PHP, MySQL, JavaScript, HTML, CSS"]
       [:li "Designing and developing websites for schools and businesses"]
       [:li "Designing and developing new products"]
       [:li "Development of in-house CRMS"]
       [:li "Providing training and technical support to customers"]]]

     [:h1 "Education"]

     [:article
      [:h3 "Lancaster University - BSc (Hons) Computer Science"]
      [:h5 "2002 - 2005"]]

     [:article
      [:h3 "Moorlands VIth Form Centre, Cheadle, Staffordshire"]
      [:h5 "2000 - 2002"]]

     [:article
      [:h3 "Painsley RC High School, Cheadle, Staffordshire"]
      [:h5 "1995 - 2000"]]

     ]

    (sidebar)]))
