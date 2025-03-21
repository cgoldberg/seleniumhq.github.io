---
title: "要素を探す"
linkTitle: "要素を探す"
weight: 1
aliases: [
"/ja/documentation/webdriver/relative_locators/"
]
description: >
  DOM内の1つ以上の特定の要素を識別する方法
---

ロケーターは、ページ上の要素を識別する方法です。 これは、[検索要素]({{< ref "finders.md" >}}) メソッドに渡される引数です。

検出方法とは別にロケーターを宣言するタイミングと理由など、
[ロケーター]({{< ref "/documentation/test_practices/encouraged/locators.md" >}})に関するヒントについては、
[推奨されるテストプラクティス]({{< ref "/documentation/test_practices/encouraged" >}}) を確認してください。

### 要素選択の方法

WebDriverには標準のロケータが8種類あります。

| ロケータ | 詳細 |
| -------- | ---------- |
| class name | class名に値を含む要素を探す (複合クラス名は使えない) |
| css selector | CSSセレクタが一致する要素を探す |
| id | id属性が一致する要素を探す |
| name | name属性が一致する要素を探す |
| link text | a要素のテキストが一致する要素を探す|
| partial link text | a要素のテキストが部分一致する要素を探す |
| tag name | タグ名が一致する要素を探す |
| xpath | XPathと一致する要素を探す |

## Creating Locators

To work on a web element using Selenium, we need to first locate it on the web page.
Selenium provides us above mentioned ways, using which we can locate element on the 
page. To understand and create locator we will use the following HTML snippet.

```html
<html>
<body>
<style>
.information {
  background-color: white;
  color: black;
  padding: 10px;
}
</style>
<h2>Contact Selenium</h2>

<form>
  <input type="radio" name="gender" value="m" />Male &nbsp;
  <input type="radio" name="gender" value="f" />Female <br>
  <br>
  <label for="fname">First name:</label><br>
  <input class="information" type="text" id="fname" name="fname" value="Jane"><br><br>
  <label for="lname">Last name:</label><br>
  <input class="information" type="text" id="lname" name="lname" value="Doe"><br><br>
  <label for="newsletter">Newsletter:</label>
  <input type="checkbox" name="newsletter" value="1" /><br><br>
  <input type="submit" value="Submit">
</form> 

<p>To know more about Selenium, visit the official page 
<a href ="www.selenium.dev">Selenium Official Page</a> 
</p>

</body>
</html>
```

## class name
The HTML page web element can have attribute class. We can see an example in the
above shown HTML snippet. We can identify these elements using the class name locator
available in Selenium. 
{{< tabpane langEqualsHeader=true >}}
  {{< tab header="Java" >}}
    WebDriver driver = new ChromeDriver();
	driver.findElement(By.className("information"));
  {{< /tab >}}
{{< tab header="Python" text=true >}}
{{< gh-codeblock path="/examples/python/tests/elements/test_locators.py#L7-L9" >}}
{{< /tab >}}
  {{< tab header="CSharp" >}}
    var driver = new ChromeDriver();
	driver.FindElement(By.ClassName("information"));
  {{< /tab >}}
  {{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L7" >}}
  {{< /tab >}}
  {{< tab header="JavaScript" >}}
    let driver = await new Builder().forBrowser('chrome').build();
	const loc = await driver.findElement(By.className('information'));
  {{< /tab >}}
  {{< tab header="Kotlin" >}}
    val driver = ChromeDriver()
	val loc: WebElement = driver.findElement(By.className("information"))
  {{< /tab >}}
{{< /tabpane >}} 

## css selector
CSS is the language used to style HTML pages. We can use css selector locator strategy
to identify the element on the page. If the element has an id, we create the locator
as css = #id. Otherwise the format we follow is css =[attribute=value] .
Let us see an example from above HTML snippet. We will create locator for First Name 
textbox, using css. 

{{< tabpane langEqualsHeader=true >}}
  {{< tab header="Java" >}}
    WebDriver driver = new ChromeDriver();
	driver.findElement(By.cssSelector("#fname"));
  {{< /tab >}}
{{< tab header="Python" text=true >}}
{{< gh-codeblock path="/examples/python/tests/elements/test_locators.py#L17-L19" >}}
{{< /tab >}}
  {{< tab header="CSharp" >}}
    var driver = new ChromeDriver();
	driver.FindElement(By.CssSelector("#fname"));
  {{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L11" >}}
{{< /tab >}}
  {{< tab header="JavaScript" >}}
    let driver = await new Builder().forBrowser('chrome').build();
	const loc = await driver.findElement(By.css('#fname'));
  {{< /tab >}}
  {{< tab header="Kotlin" >}}
    val driver = ChromeDriver()
	val loc: WebElement = driver.findElement(By.css("#fname"))
  {{< /tab >}}
{{< /tabpane >}} 

## id
We can use the ID attribute available with element in a web page to locate it. 
Generally the ID property should be unique for a element on the web page. 
We will identify the Last Name field using it. 

{{< tabpane langEqualsHeader=true >}}
  {{< tab header="Java" >}}
    WebDriver driver = new ChromeDriver();
	driver.findElement(By.id("lname"));
  {{< /tab >}}
{{< tab header="Python" text=true >}}
{{< gh-codeblock path="/examples/python/tests/elements/test_locators.py#L27-L29" >}}
{{< /tab >}}
  {{< tab header="CSharp" >}}
    var driver = new ChromeDriver();
	driver.FindElement(By.Id("lname"));
  {{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L15" >}}
{{< /tab >}}
  {{< tab header="JavaScript" >}}
    let driver = await new Builder().forBrowser('chrome').build();
	const loc = await driver.findElement(By.id('lname'));
  {{< /tab >}}
  {{< tab header="Kotlin" >}}
    val driver = ChromeDriver()
	val loc: WebElement = driver.findElement(By.id("lname"))
  {{< /tab >}}
{{< /tabpane >}} 


## name
We can use the NAME attribute available with element in a web page to locate it. 
Generally the NAME property should be unique for a element on the web page. 
We will identify the Newsletter checkbox using it. 

{{< tabpane langEqualsHeader=true >}}
  {{< tab header="Java" >}}
    WebDriver driver = new ChromeDriver();
	driver.findElement(By.name("newsletter"));
  {{< /tab >}}
{{< tab header="Python" text=true >}}
{{< gh-codeblock path="/examples/python/tests/elements/test_locators.py#L37-L39" >}}
{{< /tab >}}
  {{< tab header="CSharp" >}}
    var driver = new ChromeDriver();
	driver.FindElement(By.Name("newsletter"));
  {{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L19" >}}
{{< /tab >}}
  {{< tab header="JavaScript" >}}
    let driver = await new Builder().forBrowser('chrome').build();
	const loc = await driver.findElement(By.name('newsletter'));
  {{< /tab >}}
  {{< tab header="Kotlin" >}}
    val driver = ChromeDriver()
	val loc: WebElement = driver.findElement(By.name("newsletter"))
  {{< /tab >}}
{{< /tabpane >}} 

## link text 
If the element we want to locate is a link, we can use the link text locator
to identify it on the web page. The link text is the text displayed of the link. 
In the HTML snippet shared, we have a link available, lets see how will we locate it. 
{{< tabpane langEqualsHeader=true >}}
  {{< tab header="Java" >}}
    WebDriver driver = new ChromeDriver();
	driver.findElement(By.linkText("Selenium Official Page"));
  {{< /tab >}}
{{< tab header="Python" text=true >}}
{{< gh-codeblock path="/examples/python/tests/elements/test_locators.py#L47-L49" >}}
{{< /tab >}}
  {{< tab header="CSharp" >}}
    var driver = new ChromeDriver();
	driver.FindElement(By.LinkText("Selenium Official Page"));
  {{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L23" >}}
{{< /tab >}}
  {{< tab header="JavaScript" >}}
    let driver = await new Builder().forBrowser('chrome').build();
	const loc = await driver.findElement(By.linkText('Selenium Official Page'));
  {{< /tab >}}
  {{< tab header="Kotlin" >}}
    val driver = ChromeDriver()
	val loc: WebElement = driver.findElement(By.linkText("Selenium Official Page"))
  {{< /tab >}}
{{< /tabpane >}} 

## partial link text 
If the element we want to locate is a link, we can use the partial link text locator
to identify it on the web page. The link text is the text displayed of the link. 
We can pass partial text as value.
In the HTML snippet shared, we have a link available, lets see how will we locate it. 
{{< tabpane langEqualsHeader=true >}}
  {{< tab header="Java" >}}
    WebDriver driver = new ChromeDriver();
	driver.findElement(By.partialLinkText("Official Page"));
  {{< /tab >}}
{{< tab header="Python" text=true >}}
{{< gh-codeblock path="/examples/python/tests/elements/test_locators.py#L57-L59" >}}
{{< /tab >}}
  {{< tab header="CSharp" >}}
    var driver = new ChromeDriver();
	driver.FindElement(By.PartialLinkText("Official Page"));
  {{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L27" >}}
{{< /tab >}}
  {{< tab header="JavaScript" >}}
    let driver = await new Builder().forBrowser('chrome').build();
	const loc = await driver.findElement(By.partialLinkText('Official Page'));
  {{< /tab >}}
  {{< tab header="Kotlin" >}}
    val driver = ChromeDriver()
	val loc: WebElement = driver.findElement(By.partialLinkText("Official Page"))
  {{< /tab >}}
{{< /tabpane >}} 

## tag name
We can use the HTML TAG itself as a locator to identify the web element on the page.
From the above HTML snippet shared, lets identify the link, using its html tag "a". 
{{< tabpane langEqualsHeader=true >}}
  {{< tab header="Java" >}}
    WebDriver driver = new ChromeDriver();
	driver.findElement(By.tagName("a"));
  {{< /tab >}}
{{< tab header="Python" text=true >}}
{{< gh-codeblock path="/examples/python/tests/elements/test_locators.py#L67-L69" >}}
{{< /tab >}}
  {{< tab header="CSharp" >}}
    var driver = new ChromeDriver();
	driver.FindElement(By.TagName("a"));
  {{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L31" >}}
{{< /tab >}}
  {{< tab header="JavaScript" >}}
    let driver = await new Builder().forBrowser('chrome').build();
	const loc = await driver.findElement(By.tagName('a'));
  {{< /tab >}}
  {{< tab header="Kotlin" >}}
    val driver = ChromeDriver()
	val loc: WebElement = driver.findElement(By.tagName("a"))
  {{< /tab >}}
{{< /tabpane >}} 

## xpath 

A HTML document can be considered as a XML document, and then we can use xpath
which will be the path traversed to reach the element of interest to locate the element.
The XPath could be absolute xpath, which is created from the root of the document.
Example - /html/form/input[1]. This will return the male radio button.
Or the xpath could be relative. Example- //input[@name='fname']. This will return the
first name text box. Let us create locator for female radio button using xpath. 

{{< tabpane langEqualsHeader=true >}}
  {{< tab header="Java" >}}
    WebDriver driver = new ChromeDriver();
	driver.findElement(By.xpath("//input[@value='f']"));
  {{< /tab >}}
{{< tab header="Python" text=true >}}
{{< gh-codeblock path="/examples/python/tests/elements/test_locators.py#L77-L79" >}}
{{< /tab >}}
  {{< tab header="CSharp" >}}
    var driver = new ChromeDriver();
	driver.FindElement(By.Xpath("//input[@value='f']"));
  {{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L35" >}}
{{< /tab >}}
  {{< tab header="JavaScript" >}}
    let driver = await new Builder().forBrowser('chrome').build();
	const loc = await driver.findElement(By.xpath('//input[@value='f']'));
  {{< /tab >}}
  {{< tab header="Kotlin" >}}
    val driver = ChromeDriver()
	val loc: WebElement = driver.findElement(By.xpath('//input[@value='f']'))
  {{< /tab >}}
{{< /tabpane >}} 

## Utilizing Locators

The FindElement makes using locators a breeze! For most languages, 
all you need to do is utilize `webdriver.common.by.By`, however in 
others it's as simple as setting a parameter in the FindElement function

### By

{{< tabpane langEqualsHeader=true >}}
{{< badge-examples >}}
  {{< tab header="Java" >}}
    import org.openqa.selenium.By;
    WebDriver driver = new ChromeDriver();
	driver.findElement(By.className("information"));
  {{< /tab >}}
  {{< tab header="Python" >}}
    from selenium.webdriver.common.by import By
    driver = webdriver.Chrome()
	driver.find_element(By.CLASS_NAME, "information")
  {{< /tab >}}
  {{< tab header="CSharp" >}}
    var driver = new ChromeDriver();
	driver.FindElement(By.ClassName("information"));
  {{< /tab >}}
  {{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L7" >}}
  {{< /tab >}}
  {{< tab header="JavaScript" >}}
    let driver = await new Builder().forBrowser('chrome').build();
	const loc = await driver.findElement(By.className('information'));
  {{< /tab >}}
  {{< tab header="Kotlin" >}}
    import org.openqa.selenium.By
    val driver = ChromeDriver()
	val loc: WebElement = driver.findElement(By.className("information"))
  {{< /tab >}}
{{< /tabpane >}} 

### ByChained

The `ByChained` class enables you to _chain_ two By locators together. For example, instead of having to 
locate a parent element, and then a child element of that parent, you can instead combine those two `FindElement` 
functions into one.

{{< tabpane langEqualsHeader=true >}}
  {{< tab header="Java" text=true >}}
    {{< gh-codeblock path="/examples/java/src/test/java/dev/selenium/elements/LocatorsTest.java#L37-L38" >}}
  {{< /tab >}}
  {{< tab header="Python" text=true >}}
  {{< badge-code >}}
  {{< /tab >}}
  {{< tab header="CSharp" text=true >}}
  {{< badge-code >}}
  {{< /tab >}}
  {{< tab header="Ruby" text=true >}}
  {{< badge-code >}}
  {{< /tab >}}
  {{< tab header="JavaScript" text=true >}}
  {{< badge-code >}}
  {{< /tab >}}
  {{< tab header="Kotlin" text=true >}}
    {{< badge-code >}}
  {{< /tab >}}
{{< /tabpane >}} 

### ByAll

The `ByAll` class enables you to utilize two By locators at once, finding elements that mach _either_ of your By locators. 
For example, instead of having to utilize two `FindElement()` functions to find the username and password input fields seperately, 
you can instead find them together in one clean `FindElements()`

{{< tabpane langEqualsHeader=true >}}
  {{< tab header="Java" text=true >}}
    {{< gh-codeblock path="/examples/java/src/test/java/dev/selenium/elements/LocatorsTest.java#L22-L23">}}
  {{< /tab >}}
  {{< tab header="Python" text=true >}}
  {{< badge-code >}}
  {{< /tab >}}
  {{< tab header="CSharp" text=true >}}
  {{< badge-code >}}
  {{< /tab >}}
  {{< tab header="Ruby" text=true >}}
  {{< badge-code >}}
  {{< /tab >}}
  {{< tab header="JavaScript" text=true >}}
  {{< badge-code >}}
  {{< /tab >}}
  {{< tab header="Kotlin" text=true >}}
    {{< badge-code >}}
  {{< /tab >}}
{{< /tabpane >}} 

## 相対ロケーター

**Selenium 4** introduces Relative Locators (previously
called as _Friendly Locators_). These locators are helpful when it is not easy to construct a locator for
the desired element, but easy to describe spatially where the element is in relation to an element that does have
an easily constructed locator.

### How it works

Selenium uses the JavaScript function
[getBoundingClientRect()](https://developer.mozilla.org/en-US/docs/Web/API/Element/getBoundingClientRect)
to determine the size and position of elements on the page, and can use this information to locate neighboring elements.  
find the relative elements.

Relative locator methods can take as the argument for the point of origin, either a previously located element reference,
or another locator. In these examples we'll be using locators only, but you could swap the locator in the final method with
an element object and it will work the same.

Let us consider the below example for understanding the relative locators.

{{< figure src="/images/documentation/webdriver/relative_locators.png" class="img-responsive text-center" alt="Relative Locators">}}

### Available relative locators

#### Above

If the email text field element is not easily identifiable for some reason, but the password text field element is,
we can locate the text field element using the fact that it is an "input" element "above" the password element. 

{{< tabpane langEqualsHeader=true >}}
{{< tab header="Java" >}}
By emailLocator = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
{{< /tab >}}
{{< tab header="Python" >}}
email_locator = locate_with(By.TAG_NAME, "input").above({By.ID: "password"})
{{< /tab >}}
{{< tab header="CSharp" >}}
var emailLocator = RelativeBy.WithLocator(By.TagName("input")).Above(By.Id("password"));
{{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L40" >}}
{{< /tab >}}
{{< tab header="JavaScript" >}}
let emailLocator = locateWith(By.tagName('input')).above(By.id('password'));
{{< /tab >}}
{{< tab header="Kotlin" >}}
val emailLocator = RelativeLocator.with(By.tagName("input")).above(By.id("password"))
{{< /tab >}}
{{< /tabpane >}}

#### Below

If the password text field element is not easily identifiable for some reason, but the email text field element is,
we can locate the text field element using the fact that it is an "input" element "below" the email element.

{{< tabpane langEqualsHeader=true >}}
{{< tab header="Java" >}}
By passwordLocator = RelativeLocator.with(By.tagName("input")).below(By.id("email"));
{{< /tab >}}
{{< tab header="Python" >}}
password_locator = locate_with(By.TAG_NAME, "input").below({By.ID: "email"})
{{< /tab >}}
{{< tab header="CSharp" >}}
var passwordLocator = RelativeBy.WithLocator(By.TagName("input")).Below(By.Id("email"));
{{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L44" >}}
{{< /tab >}}
{{< tab header="JavaScript" >}}
let passwordLocator = locateWith(By.tagName('input')).below(By.id('email'));
{{< /tab >}}
{{< tab header="Kotlin" >}}
val passwordLocator = RelativeLocator.with(By.tagName("input")).below(By.id("email"))
{{< /tab >}}
{{< /tabpane >}}

#### Left of

If the cancel button is not easily identifiable for some reason, but the submit button element is,
we can locate the cancel button element using the fact that it is a "button" element to the "left of" the submit element.
    
{{< tabpane langEqualsHeader=true >}}
{{< tab header="Java" >}}
By cancelLocator = RelativeLocator.with(By.tagName("button")).toLeftOf(By.id("submit"));
{{< /tab >}}
{{< tab header="Python" >}}
cancel_locator = locate_with(By.TAG_NAME, "button").to_left_of({By.ID: "submit"})
{{< /tab >}}
{{< tab header="CSharp" >}}
var cancelLocator = RelativeBy.WithLocator(By.tagName("button")).LeftOf(By.Id("submit"));
{{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L48" >}}
{{< /tab >}}
{{< tab header="JavaScript" >}}
let cancelLocator = locateWith(By.tagName('button')).toLeftOf(By.id('submit'));
{{< /tab >}}
{{< tab header="Kotlin" >}}
val cancelLocator = RelativeLocator.with(By.tagName("button")).toLeftOf(By.id("submit"))
{{< /tab >}}
{{< /tabpane >}}

#### Right of

If the submit button is not easily identifiable for some reason, but the cancel button element is,
we can locate the submit button element using the fact that it is a "button" element "to the right of" the cancel element.

{{< tabpane langEqualsHeader=true >}}
{{< tab header="Java" >}}
By submitLocator = RelativeLocator.with(By.tagName("button")).toRightOf(By.id("cancel"));
{{< /tab >}}
{{< tab header="Python" >}}
submit_locator = locate_with(By.TAG_NAME, "button").to_right_of({By.ID: "cancel"})
{{< /tab >}}
{{< tab header="CSharp" >}}
var submitLocator = RelativeBy.WithLocator(By.tagName("button")).RightOf(By.Id("cancel"));
{{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L52" >}}
{{< /tab >}}
{{< tab header="JavaScript" >}}
let submitLocator = locateWith(By.tagName('button')).toRightOf(By.id('cancel'));
{{< /tab >}}
{{< tab header="Kotlin" >}}
val submitLocator = RelativeLocator.with(By.tagName("button")).toRightOf(By.id("cancel"))
{{< /tab >}}
{{< /tabpane >}}

#### Near

If the relative positioning is not obvious, or it varies based on window size, you can use the near method to 
identify an element that is at most `50px` away from the provided locator.
One great use case for this is to work with a form element that doesn't have an easily constructed locator,
but its associated [input label element](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/label) does.

{{< tabpane langEqualsHeader=true >}}
{{< tab header="Java" >}}
By emailLocator = RelativeLocator.with(By.tagName("input")).near(By.id("lbl-email"));
{{< /tab >}}
{{< tab header="Python" >}}
email_locator = locate_with(By.TAG_NAME, "input").near({By.ID: "lbl-email"})
{{< /tab >}}
{{< tab header="CSharp" >}}
var emailLocator = RelativeBy.WithLocator(By.tagName("input")).Near(By.Id("lbl-email"));
{{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L56" >}}
{{< /tab >}}
{{< tab header="JavaScript" >}}
let emailLocator = locateWith(By.tagName('input')).near(By.id('lbl-email'));
{{< /tab >}}
{{< tab header="Kotlin" >}}
val emailLocator = RelativeLocator.with(By.tagName("input")).near(By.id("lbl-email"));
{{< /tab >}}
{{< /tabpane >}}

### Chaining relative locators

You can also chain locators if needed. Sometimes the element is most easily identified as being both above/below one element and right/left of another.

{{< tabpane langEqualsHeader=true >}}
{{< tab header="Java" >}}
By submitLocator = RelativeLocator.with(By.tagName("button")).below(By.id("email")).toRightOf(By.id("cancel"));
{{< /tab >}}
{{< tab header="Python" >}}
submit_locator = locate_with(By.TAG_NAME, "button").below({By.ID: "email"}).to_right_of({By.ID: "cancel"})
{{< /tab >}}
{{< tab header="CSharp" >}}
var submitLocator = RelativeBy.WithLocator(By.tagName("button")).Below(By.Id("email")).RightOf(By.Id("cancel"));
{{< /tab >}}
{{< tab header="Ruby" text=true >}}
{{< gh-codeblock path="examples/ruby/spec/elements/locators_spec.rb#L60" >}}
{{< /tab >}}
{{< tab header="JavaScript" >}}
let submitLocator = locateWith(By.tagName('button')).below(By.id('email')).toRightOf(By.id('cancel'));
{{< /tab >}}
{{< tab header="Kotlin" >}}
val submitLocator = RelativeLocator.with(By.tagName("button")).below(By.id("email")).toRightOf(By.id("cancel"))
{{< /tab >}}
{{< /tabpane >}}
