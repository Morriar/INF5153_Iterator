/*
 * Copyright 2017 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package iterator;

public class Main {

    public static void main(String[] args) {

        Course course = new Course("INF5153");
        course.addStudent(new Student("Alexandre", "Terrasa"));
        course.addStudent(new Student("John", "Doe"));
        course.addStudent(new Student("Janne", "Doe"));

        IIterator iterator = course.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
