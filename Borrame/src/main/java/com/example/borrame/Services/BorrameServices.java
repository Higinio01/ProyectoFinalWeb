package com.example.borrame.Services;

import com.example.borrame.Repository.BorrameRep;
import com.example.borrame.entidad.BorrameUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrameServices {

    @Autowired
    BorrameRep borrameRep;

    public void save(int id){
        borrameRep.save(new BorrameUser(id));
    }

    public void delete(int id){
        borrameRep.deleteById(id);
    }

    public void update(int id){
        borrameRep.save(new BorrameUser(id));
    }

    public List<BorrameUser> getAll(){
        return borrameRep.findAll();
    }
}
