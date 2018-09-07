package com.rbspring.spingDI;

import com.rbspring.spingDI.personImp.StudentImp;

/**
 * Created by renbin on 2018/8/6.
 */
public class OutputHelper {
    Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void printpersonifo(){
        person.outpersonage();
        person.outpersonname();
    }
    public void setStudent(StudentImp student){
        this.person = student;
    }
}
