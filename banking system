# Library Management System Mini Project

class Book:
    def __init__(self, title, author):
        self.title = title
        self.author = author

    def __str__(self):
        return f"Title: {self.title}, Author: {self.author}"


class Library:
    def __init__(self):
        self.books = []

    def add_book(self, title, author):
        book = Book(title, author)
        self.books.append(book)
        print("✅ Book added successfully!")

    def view_books(self):
        if not self.books:
            print("❌ No books in the library.")
        else:
            print("\n📚 Books in Library:")
            for i, book in enumerate(self.books, 1):
                print(f"{i}. {book}")

    def search_book(self, title):
        found = [book for book in self.books if book.title.lower() == title.lower()]
        if found:
            print("\n🔍 Search Results:")
            for book in found:
                print(book)
        else:
            print("❌ Book not found.")

    def remove_book(self, title):
        for book in self.books:
            if book.title.lower() == title.lower():
                self.books.remove(book)
                print("🗑️ Book removed successfully!")
                return
        print("❌ Book not found.")


def main():
    library = Library()

    while True:
        print("\n===== Library Menu =====")
        print("1. Add Book")
        print("2. View Books")
        print("3. Search Book")
        print("4. Remove Book")
        print("5. Exit")

        choice = input("Choose an option (1-5): ")

        if choice == "1":
            title = input("Enter book title: ")
            author = input("Enter author name: ")
            library.add_book(title, author)

        elif choice == "2":
            library.view_books()

        elif choice == "3":
            title = input("Enter book title to search: ")
            library.search_book(title)

        elif choice == "4":
            title = input("Enter book title to remove: ")
            library.remove_book(title)

        elif choice == "5":
            print("👋 Exiting Library System. Goodbye!")
            break

        else:
            print("⚠️ Invalid choice, please try again.")


if __name__ == "__main__":
    main()
