---
title: "Information about web elements"
linkTitle: "Information"
weight: 4
description: >
  What you can learn about an element.
---

There are a number of details you can query about a specific element.

## Is Displayed

This method is used to check if the connected Element is 
displayed on a webpage. Returns a `Boolean` value, 
True if the connected element is displayed in the current 
browsing context else returns false.

This functionality is [mentioned in](https://w3c.github.io/webdriver/#element-displayedness), but not defined by 
the w3c specification due to the 
[impossibility of covering all potential conditions](https://www.youtube.com/watch?v=LAD_XPGP_kk). 
As such, Selenium cannot expect drivers to implement 
this functionality directly, and now relies on 
executing a large JavaScript function directly. 
This function makes many approximations about an element's 
nature and relationship in the tree to return a value.


{{< tabpane langEqualsHeader=true >}}
{{< tab header="Java" text=true >}}
{{< gh-codeblock path="examples/java/src/test/java/dev/selenium/elements/InformationTest.java#L20-L24" >}}
{{< /tab >}}
{{< tab header="Python" text=true >}}
{{< gh-codeblock path="examples/python/tests/elements/test_information.py#L12-L15" >}}
{{< /tab >}}
{{< tab header="CSharp" text=true >}}
{{< gh-codeblock path="examples/dotnet/SeleniumDocs/Elements/InformationTest.cs#L18-L22" >}}
{{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="/examples/ruby/spec/elements/information_spec.rb#L12">}}
{{< /tab >}}
{{< tab header="JavaScript" text=true >}}
{{< gh-codeblock path="/examples/javascript/test/elements/information.spec.js#L16-L17">}}
{{< /tab >}}
{{< tab header="Kotlin" >}}
 //navigates to url
 driver.get("https://www.selenium.dev/selenium/web/inputs.html")

 //returns true if element is displayed else returns false
 val flag = driver.findElement(By.name("email_input")).isDisplayed()

{{< /tab >}}
{{< /tabpane >}}



## Is Enabled

This method is used to check if the connected Element
is enabled or disabled on a webpage.
Returns a boolean value, **True** if the connected element is
**enabled** in the current browsing context else returns **false**.

{{< tabpane langEqualsHeader=true >}}
{{< tab header="Java" text=true >}}
{{< gh-codeblock path="examples/java/src/test/java/dev/selenium/elements/InformationTest.java#L27-L29" >}}
{{< /tab >}}
  {{< tab header="Python" text=true >}}
{{< gh-codeblock path="examples/python/tests/elements/test_information.py#L19" >}}
  {{< /tab >}}
 {{< tab header="CSharp" text=true >}}
{{< gh-codeblock path="examples/dotnet/SeleniumDocs/Elements/InformationTest.cs#L25-L27" >}}
{{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="/examples/ruby/spec/elements/information_spec.rb#L17">}}
{{< /tab >}}
{{< tab header="JavaScript" text=true >}}
{{< gh-codeblock path="/examples/javascript/test/elements/information.spec.js#L23-L24">}}
{{< /tab >}}
  {{< tab header="Kotlin" >}}
 //navigates to url
 driver.get("https://www.selenium.dev/selenium/web/inputs.html")

 //returns true if element is enabled else returns false
 val attr = driver.findElement(By.name("button_input")).isEnabled()
  {{< /tab >}}
{{< /tabpane >}}

## Is Selected

This method determines if the referenced Element
is _Selected_ or not. This method is widely used on
Check boxes, radio buttons, input elements, and option elements.

Returns a boolean value, **True** if referenced element is
**selected** in the current browsing context else returns **false**.

{{< tabpane langEqualsHeader=true >}}
{{< tab header="Java" text=true >}}
{{< gh-codeblock path="examples/java/src/test/java/dev/selenium/elements/InformationTest.java#L32-L34" >}}
{{< /tab >}}
  {{< tab header="Python" text=true >}}
  {{< gh-codeblock path="examples/python/tests/elements/test_information.py#L23" >}}
  {{< /tab >}}
 {{< tab header="CSharp" text=true >}}
{{< gh-codeblock path="examples/dotnet/SeleniumDocs/Elements/InformationTest.cs#L30-L32" >}}
{{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="/examples/ruby/spec/elements/information_spec.rb#L22">}}
{{< /tab >}}
{{< tab header="JavaScript" text=true >}}
{{< gh-codeblock path="/examples/javascript/test/elements/information.spec.js#L30-L31">}}
{{< /tab >}}
  {{< tab header="Kotlin" >}}
 //navigates to url
 driver.get("https://www.selenium.dev/selenium/web/inputs.html")

 //returns true if element is checked else returns false
 val attr =  driver.findElement(By.name("checkbox_input")).isSelected()
  {{< /tab >}}
{{< /tabpane >}}

## Tag Name

It is used to fetch the [TagName](https://www.w3.org/TR/webdriver/#dfn-get-element-tag-name)
of the referenced Element which has the focus in the current browsing context.

{{< tabpane langEqualsHeader=true >}}
{{< tab header="Java" text=true >}}
{{< gh-codeblock path="examples/java/src/test/java/dev/selenium/elements/InformationTest.java#L37-L39" >}}
{{< /tab >}}
  {{< tab header="Python" text=true >}}
{{< gh-codeblock path="examples/python/tests/elements/test_information.py#L27" >}}
  {{< /tab >}}
     {{< tab header="CSharp" text=true >}}
{{< gh-codeblock path="examples/dotnet/SeleniumDocs/Elements/InformationTest.cs#L35-L37" >}}
{{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="/examples/ruby/spec/elements/information_spec.rb#L27">}}
{{< /tab >}}
{{< tab header="JavaScript" text=true >}}
{{< gh-codeblock path="/examples/javascript/test/elements/information.spec.js#L37-L38">}}
{{< /tab >}}
  {{< tab header="Kotlin" >}}
 //navigates to url
 driver.get("https://www.selenium.dev/selenium/web/inputs.html")

 //returns TagName of the element
 val attr =  driver.findElement(By.name("email_input")).getTagName()
  {{< /tab >}}
{{< /tabpane >}}

## Size and Position

It is used to fetch the dimensions and coordinates
of the referenced element.

The fetched data body contain the following details:
* X-axis position from the top-left corner of the element
* y-axis position from the top-left corner of the element
* Height of the element
* Width of the element

{{< tabpane langEqualsHeader=true >}}
{{< tab header="Java" text=true >}}
{{< gh-codeblock path="examples/java/src/test/java/dev/selenium/elements/InformationTest.java#L42-L44" >}}
{{< /tab >}}
  {{< tab header="Python" text=true >}}
{{< gh-codeblock path="examples/python/tests/elements/test_information.py#L31" >}}
  {{< /tab >}}
{{< tab header="CSharp" text=true >}}
{{< gh-codeblock path="examples/dotnet/SeleniumDocs/Elements/InformationTest.cs#L40-L43" >}}
{{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="/examples/ruby/spec/elements/information_spec.rb#L32">}}
{{< /tab >}}
{{< tab header="JavaScript" text=true >}}
{{< gh-codeblock path="/examples/javascript/test/elements/information.spec.js#L45">}}
{{< /tab >}}
  {{< tab header="Kotlin" >}}
// Navigate to url
driver.get("https://www.selenium.dev/selenium/web/inputs.html")

// Returns height, width, x and y coordinates referenced element
val res = driver.findElement(By.name("range_input")).rect

// Rectangle class provides getX,getY, getWidth, getHeight methods
println(res.getX())
  {{< /tab >}}
{{< /tabpane >}}

## Get CSS Value

Retrieves the value of specified computed style property
of an element in the current browsing context.

{{< tabpane langEqualsHeader=true >}}
{{< tab header="Java" text=true >}}
{{< gh-codeblock path="examples/java/src/test/java/dev/selenium/elements/InformationTest.java#L49-L50" >}}
{{< /tab >}}
  {{< tab header="Python" text=true >}}
{{< gh-codeblock path="examples/python/tests/elements/test_information.py#L35-L37" >}}
{{< /tab >}}
{{< tab header="CSharp" text=true >}}
{{< gh-codeblock path="examples/dotnet/SeleniumDocs/Elements/InformationTest.cs#L49-L50" >}}
{{< /tab >}}
  {{< tab header="Ruby" text=true >}}
  {{< gh-codeblock path="/examples/ruby/spec/elements/information_spec.rb#L38">}}
  {{< /tab >}}
  {{< tab header="JavaScript" text=true >}}
  {{< gh-codeblock path="/examples/javascript/test/elements/information.spec.js#L76-L78">}}
  {{< /tab >}}
  {{< tab header="Kotlin" >}}

// Navigate to Url
driver.get("https://www.selenium.dev/selenium/web/colorPage.html")

// Retrieves the computed style property 'color' of linktext
val cssValue = driver.findElement(By.id("namedColor")).getCssValue("background-color")

  {{< /tab >}}
{{< /tabpane >}}

## Text Content

Retrieves the rendered text of the specified element.

{{< tabpane langEqualsHeader=true >}}
{{< tab header="Java" text=true >}}
{{< gh-codeblock path="examples/java/src/test/java/dev/selenium/elements/InformationTest.java#L54-L56" >}}
{{< /tab >}}
  {{< tab header="Python" text=true >}}
{{< gh-codeblock path="examples/python/tests/elements/test_information.py#L41" >}}
  {{< /tab >}}
{{< tab header="CSharp" text=true >}}
{{< gh-codeblock path="examples/dotnet/SeleniumDocs/Elements/InformationTest.cs#L53-L55" >}}
{{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="/examples/ruby/spec/elements/information_spec.rb#L43">}}
{{< /tab >}}
{{< tab header="JavaScript" text=true >}}
{{< gh-codeblock path="/examples/javascript/test/elements/information.spec.js#L84-L86">}}
{{< /tab >}}
  {{< tab header="Kotlin" >}}
// Navigate to URL
driver.get("https://www.selenium.dev/selenium/web/linked_image.html")

// retrieves the text of the element
val text = driver.findElement(By.id("justanotherlink")).getText()
  {{< /tab >}}
{{< /tabpane >}}



## Fetching Attributes or Properties

Fetches the run time value associated with a 
DOM attribute. It returns the data associated 
with the DOM attribute or property of the element. 

{{< tabpane langEqualsHeader=true >}}
{{< tab header="Java" text=true >}}
{{< gh-codeblock path="examples/java/src/test/java/dev/selenium/elements/InformationTest.java#L60-L64" >}}
{{< /tab >}}
  {{< tab header="Python" text=true >}}
{{< gh-codeblock path="examples/python/tests/elements/test_information.py#L44-L46" >}}
  {{< /tab >}}
{{< tab header="CSharp" text=true >}}
{{< gh-codeblock path="examples/dotnet/SeleniumDocs/Elements/InformationTest.cs#L58-L62" >}}
{{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="/examples/ruby/spec/elements/information_spec.rb#L48">}}
{{< /tab >}}
{{< tab header="JavaScript" text=true >}}
{{< gh-codeblock path="/examples/javascript/test/elements/information.spec.js#L55-L59">}}
{{< /tab >}}
  {{< tab header="Kotlin" >}}
// Navigate to URL
driver.get("https://www.selenium.dev/selenium/web/inputs.html")

//fetch the value property associated with the textbox
val attr = driver.findElement(By.name("email_input")).getAttribute("value")
  {{< /tab >}}
{{< /tabpane >}}
