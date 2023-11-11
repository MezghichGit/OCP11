package chapite12_annotation;


public class Dolphin extends Mammal{
	
	public static void main(String[] arg) throws Exception
    {
 
        // Printing the annotation used to annotated the
        // Super and InheritedAnnotationDemo classes
        System.out.println(
            new Dolphin()
                .getClass().getAnnotation(Vertebrate.class));
 
        System.out.println(
            new Mammal().getClass().getAnnotation(Vertebrate.class));
 
        
    }

}
