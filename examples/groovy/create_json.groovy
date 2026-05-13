import groovy.json.JsonOutput

def data = [
    name: "Foo Bar",
    year: "2018",
    timestamp: "2018-03-08T00:00:00",
    tags: [ "person", "employee"],
    grade: 3.14
]

def json_str = JsonOutput.toJson(data)
println(json_str)

def json_beauty = JsonOutput.prettyPrint(json_str)
println(json_beauty)
