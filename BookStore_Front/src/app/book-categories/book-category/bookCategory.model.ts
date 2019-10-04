/**
 * Created by asus on 16/01/2019.
 */
export class BookCategory{

  bookCategory_id:number;
  category_name:string;
  category_color:string;
  category_description:string;


  constructor(bookCategory_id: number, category_name: string, category_color: string, category_description: string) {
    this.bookCategory_id = bookCategory_id;
    this.category_name = category_name;
    this.category_color = category_color;
    this.category_description = category_description;
  }
}
