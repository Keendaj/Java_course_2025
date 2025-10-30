public class OuterClass {
    // public - доступен извне
    public class PublicInner {
        public void show() {
            System.out.println("Public inner class");
        }
    }
    
    // protected - доступен в том же пакете и наследниках
    protected class ProtectedInner {
        public void show() {
            System.out.println("Protected inner class");
        }
    }
    
    // package-private - доступен в том же пакете
    class PackagePrivateInner {
        public void show() {
            System.out.println("Package private inner class");
        }
    }
    
    // private - доступен только внутри OuterClass
    private class PrivateInner {
        public void show() {
            System.out.println("Private inner class");
        }
    }
    
    public void testInnerClasses() {
        // Все внутренние классы доступны внутри внешнего класса
        PublicInner pi = new PublicInner();
        ProtectedInner proi = new ProtectedInner();
        PackagePrivateInner ppi = new PackagePrivateInner();
        PrivateInner pri = new PrivateInner();
        
        pi.show();
        proi.show();
        ppi.show();
        pri.show();
    }
}

