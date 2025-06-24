package com.idat.student.infraestructure.adapters.student;

import com.idat.student.domain.model.Student;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-24T03:17:44-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.15 (Microsoft)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public Student toDomain(StudentData entity) {
        if ( entity == null ) {
            return null;
        }

        String uid = null;
        String documentNumber = null;
        String name = null;
        String lastName = null;
        String phone = null;
        String email = null;
        String photo = null;
        int active = 0;

        uid = entity.getUid();
        documentNumber = entity.getDocumentNumber();
        name = entity.getName();
        lastName = entity.getLastName();
        phone = entity.getPhone();
        email = entity.getEmail();
        photo = entity.getPhoto();
        active = entity.getActive();

        Student student = new Student( uid, documentNumber, name, lastName, phone, email, photo, active );

        return student;
    }

    @Override
    public StudentData toEntity(Student domain) {
        if ( domain == null ) {
            return null;
        }

        StudentData studentData = new StudentData();

        studentData.setUid( domain.uid() );
        studentData.setDocumentNumber( domain.documentNumber() );
        studentData.setName( domain.name() );
        studentData.setLastName( domain.lastName() );
        studentData.setPhone( domain.phone() );
        studentData.setEmail( domain.email() );
        studentData.setPhoto( domain.photo() );
        studentData.setActive( domain.active() );

        return studentData;
    }
}
