<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Burger Shop</title>
    <asset:stylesheet src="common.css"/>
</head>

<body>
<div class="bg_main">
    <div class="bg">
        <header class="main">
            <div class="logo_line"></div>
            <asset:image src="logo.png"/>


            <g:form controller="home">
                <g:actionSubmit value="${message(code: "burger")}" action="clickShop" class="but"/>
            </g:form>

        </header>
    </div>
    <section class="main">
        <asset:image src="advertise_block.png"/>
    </section>
</div>

</body>
</html>