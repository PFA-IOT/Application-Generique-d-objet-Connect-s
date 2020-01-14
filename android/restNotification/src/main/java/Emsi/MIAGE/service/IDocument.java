package Emsi.MIAGE.service;

import java.util.List;

import Emsi.MIAGE.models.Document;

public interface IDocument {
	
	void save(Document document);
	void update(Long id,Document document);
	void delete(Long id);
	List<Document> getDocuments();
	Document getDocument(Long id);
	
}
