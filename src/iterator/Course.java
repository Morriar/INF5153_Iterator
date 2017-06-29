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

import java.util.ArrayList;

public class Course implements IIterable<Student> {

    private String code;

    private ArrayList<Student> students = new ArrayList<>();

    public Course(String code) {
        this.code = code;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public IIterator<Student> iterator() {
        return new StudentIterator(students);
    }

    public String getCode() {
        return code;
    }

}
