var jq = $.noConflict();

jq(function() {
    jq("#test1").click(function(){
        window.location.replace("//localhost:8080/getEmployees");
    })
    jq("#test2").click(function(){
        window.location.replace("//localhost:8080/getEmployeesSort");
    })
    jq("#test3").click(function(){
        window.location.replace("//localhost:8080/delEmployees");
    })
})