package com.idat.profesor.infraestructure.adapter.profesor;

import com.idat.profesor.domain.model.Profesor;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-24T03:27:23-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.15 (Microsoft)"
)
@Component
public class ProfesorMapperImpl implements ProfesorMapper {

    @Override
    public Profesor toModel(ProfesorData entity) {
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

        Profesor profesor = new Profesor( uid, documentNumber, name, lastName, phone, email, photo, active );

        return profesor;
    }

    @Override
    public ProfesorData toEntity(Profesor domain) {
        if ( domain == null ) {
            return null;
        }

        ProfesorData profesorData = new ProfesorData();

        profesorData.setUid( domain.uid() );
        profesorData.setDocumentNumber( domain.documentNumber() );
        profesorData.setName( domain.name() );
        profesorData.setLastName( domain.lastName() );
        profesorData.setPhone( domain.phone() );
        profesorData.setEmail( domain.email() );
        profesorData.setPhoto( domain.photo() );
        profesorData.setActive( domain.active() );

        return profesorData;
    }
}
