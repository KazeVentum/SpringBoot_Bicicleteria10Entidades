package com.Proyecto.proyecto.bicicleta;

import com.Proyecto.proyecto.mantenimiento.Mantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BicicletaRepository extends JpaRepository <Bicicleta, Long>{
}
