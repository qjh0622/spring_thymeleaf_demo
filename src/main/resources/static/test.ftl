<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <title>Document</title>
</head>
<body>


<#--include-->
<#include "head.ftl">

<#--注释-->
${name},欢迎来此！！！！<br>


<#--assign赋值-->
<#assign info="琪琪">
${info}<br>

<#--assign赋值-->
<#assign qq={'name':'琪琪','age':'88','tel':'11123432423'}>
名字:${qq.name} 年龄:${qq.age} 手机号:${qq.tel}<br>
<#--if-->
<#if success==true>
登录成功，欢迎来到首页
    <#else >
    登录失败
</#if>
<#--遍历-->
<#list list as qin>

    ID :${qin.id}
    名称:${qin.name}
    价格:${qin.price}
</#list><br>
共${list?size}条

<#--json转换-->
<#assign hui =" {'name':'阿琪','age':'188','tel':'111123432423'}">

<#assign person=hui?eval>
名字:${person.name} 年龄:${person.age} 手机号:${person.tel}<br>

<#--时间-->
日期${date?date}<br>
时间${date?time}<br>
当前日期时间${date?datetime}<br>
格式化时间 ${date?string('YYYY年MM月dd日 hh：mm：ss')}
</body>
</html>
