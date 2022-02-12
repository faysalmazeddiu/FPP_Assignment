package facemaker;



public class Driver {
	
	public Driver(Figure[] figure) {
		for(Figure fi:figure) {
			fi.getFigure();
		}
	}
	
	public static void main(String[] args) {
		/*
			HatMaker hateHakerHatMaker=new HatMaker();
			hateHakerHatMaker.getFigure();
			VeeMaker veeMaker=new VeeMaker();
			veeMaker.getFigure();
			PipeMaker pipeMaker=new PipeMaker();
			pipeMaker.getFigure();
			FaceMaker faceMaker=new FaceMaker();
			faceMaker.getFigure();
		*/
		
		Figure[] figures= {
				new HatMaker(),
				new HatMaker(),
				new VeeMaker(),
				new PipeMaker(),
				new FaceMaker()
		};
		
		new Driver(figures);
		
	}
}
