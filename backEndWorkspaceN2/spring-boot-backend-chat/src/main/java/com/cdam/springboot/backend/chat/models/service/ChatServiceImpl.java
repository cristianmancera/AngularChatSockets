package com.cdam.springboot.backend.chat.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdam.springboot.backend.chat.models.dao.ChatRepository;
import com.cdam.springboot.backend.chat.models.documents.Mensaje;
@Service
public class ChatServiceImpl implements ChatService{

	@Autowired
	private ChatRepository chatDao;
	
	@Override
	public List<Mensaje> obtenerUltimos10Mensajes() {
		return chatDao.findFirst10ByOrderByFechaDesc();
	}

	@Override
	public Mensaje guardar(Mensaje mensaje) {
		return chatDao.save(mensaje);
	}

}
