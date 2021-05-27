package com.TauanOliveira.cursoMC.services;

import java.util.Calendar;
import java.util.Date;

import com.TauanOliveira.cursoMC.domain.PagamentoComBoleto;

import org.springframework.stereotype.Service;

@Service
public class BoletoService {
 
    public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido){
        Calendar cal =Calendar.getInstance();
        cal.setTime(instanteDoPedido);
        cal.add(Calendar.DAY_OF_MONTH, 7);
        pagto.setDataVencimento(cal.getTime());
    }
}
