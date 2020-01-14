package Emsi.MIAGE.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Emsi.MIAGE.dao.DocumentRepository;
import Emsi.MIAGE.models.Document;
import Emsi.MIAGE.service.IDocument;

@Service
public class IDocumentImpl implements IDocument {
	@Autowired
	private DocumentRepository documentRepository;

	@Override
	public void save(Document document) {
		documentRepository.save(document);
		
	}

	@Override
	public void update(Long id, Document document) {
		Document doc=getDocument(id);
		if(doc !=null)
		{
			document.setId(id);
			documentRepository.save(document);
		}
		
	}

	@Override
	public void delete(Long id) {
		boolean trouver = documentRepository.existsById(id);
		if(trouver) documentRepository.deleteById(id);
			
		
	}

	@Override
	public List<Document> getDocuments() {
		return documentRepository.findAll();
	}

	@Override
	public Document getDocument(Long id) {
		boolean trouver = documentRepository.existsById(id);
		if(trouver) return documentRepository.getOne(id);
		else return null;
	}

}
