class Shirt{

    private String Brand;
    private int Size;

    public Shirt(String Brand, int Size){
        this.Brand = Brand;
        this.Size = Size;

    }

    public static void main(String[] args){
        Shirt myshirt = new Shirt("ZARA", 40);
        System.out.println("Brand - " +myshirt.Brand);
        System.out.println("Size - " +myshirt.Size);

    myshirt=null;
    System.gc();
    }
    protected void finalize() throws Throwable{
        System.out.println("myshirt object is destroyed");
    }
    
}
