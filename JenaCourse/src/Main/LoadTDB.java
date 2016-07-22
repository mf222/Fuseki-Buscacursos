package Main;

import org.apache.jena.query.Dataset;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.tdb.TDBFactory;
import org.apache.jena.util.FileManager;

public class LoadTDB {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dataset dataset = TDBFactory.createDataset("/home/maria/Escritorio/Cursos/TDB");
		Model tdb = dataset.getDefaultModel();
		FileManager.get().readModel(tdb, "/home/maria/Escritorio/Cursos/datos.ttl", "TTL");
		dataset.close();

	}

}
