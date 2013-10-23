/*
* Copyright 2013 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

/**
 * @author Aaron Brown
 */

includeTargets << grailsScript("_GrailsInit")
includeTargets << grailsScript("_GrailsCreateArtifacts")

target(createConverter: "Creates a new Rabbit-native Converter class.") {
    depends(checkVersion, parseArguments)

    if (argsMap["params"][1] == null || argsMap["params"][1].isEmpty()) {
        Ant.project.log("Missing the datatype (example: String).")
        System.err.println("Missing the datatype (example String).")
        exit(1)
    }

    def type = "Converter"
    promptForName(type: type)

    def name = argsMap["params"][0]
    def datatype = argsMap["params"][1]

    createArtifact(name: name, suffix: type, type: type, path: "grails-app/rabbit-converters", datatype: datatype)
}

setDefaultTarget createConverter
