package com.perfulandia.cl.perfulandia_spa.repository;

import com.perfulandia.cl.perfulandia_spa.model.Perfume;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class PerfumeRepository {

    private List <Perfume> listaPerfumes = new ArrayList <>();



public List<Perfume> obtienePerfumes(){
        return listaPerfumes;
    }

    public Perfume buscarPorId(int id){
        for (Perfume perfume : listaPerfumes) {
            if (perfume.getId()==id){
                return libro;
            }
        }
        return null;
    }

    public Perfume buscarPorNombre (String nombre){
        for (Perfume perfume: listaPerfumes){
            if (perfume.getNombre().equals(nombre)){
                return perfume;
            }
        }
        return null;
    }

    public Perfume guardar(Perfume per){
        listaPerfumes.add(per);
        return per;
    }

    public Perfume actualizar(Perfume per) {
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < listaPerfumes.size(); i++){
            if(listaPerfumes.get(1).getId()==lib.getId()){
                id = per.getId();
                idPosicion = i;
            }
        }
        Perfume perfume1 = new Perfume();
        perfume1.setId(id);
        perfume1.setNombre(per.getNombre());
        perfume1.setMarca(per.getMarca());
        perfume1.setPrecio(per.getPrecio());
        perfume1.setTamaño(per.getTamaño());
        perfume1.setStock(per.getStock());

        listaPerfumes.set(idPosicion, perfume1);
        return perfume1;

    }

    public void eliminar (int id){
        Perfume perfume = buscarPorId(id);
        if (perfume != null){
            listaPerfumes.remove(perfume);
        }

        int idPosicion = 0;
        for (int i=0; 1 < listaPerfumes.size(); i++){
            if(listaPerfumes.get(i).getId()==id){
                idPosicion=i;
                break;
            }
        }
        if (idPosicion > 0){
            listaPerfumes.remove(idPosicion);
        }
        listaPerfumes.removeIf(x -> x.getId()==id);
    }

    public int totalPerfumes(){
        return listaPerfumes.size();
    }
   

}

