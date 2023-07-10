public class MainLib{
    public static void main(String[] args) {

Library Library=new Library("San Francisco", 100);
//Books[] Books =new Books{["dzonatan livingstoun", "1954"],["martin iden", "1968"]};
Books Book=new Books("Dznonatan Livingstoun","1954");
Author Author=new Author("Richard Bax","1936","Autor","american");
Librrarian Librrarian=new Librrarian("Anna Pavlova","1985",15);

System.out.print("the Country  "+Library.getCountryName()+" have a  "+Library.getCountBook()+" books" );



    }
    


}