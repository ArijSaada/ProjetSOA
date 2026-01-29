/*package com.example.demo2.model;



import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String title;
    public String author;
    public String Path;
    public Date publicationDate;

    @ManyToOne
    public reader Reader;
public String getTitle()
{
    return(title);
}
public String getAuthor()
{
    return(author);
}
public Date getpubDate()
{
    return(publicationDate);
}
public String getPath()
{
    return(Path);
}
public Long getId()
{
    return(id);
}
public void setId(Long id)
{
    this.id = id;
}
public void setAuthor(String Auth)
{
    this.author =Auth;
}
public void setPath(String path)
{
    this.Path = path;
}
public void setDate(Date pubdate)
{
    this.publicationDate = pubdate;
}
public void setReader(reader R)
{
    this.Reader = R;
}
public reader getReader()
{
    return(Reader);
}
}
*/
package com.example.demo2.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String title;
    public String author;
    @Column(name = "file_path")
    public String filePath;  

    public Date publicationDate;

    @ManyToOne
    public reader Reader;

    public Document() {
    }

    public Document(reader Reader, String author, String filePath, Date publicationDate, String title) {
        this.Reader = Reader;
        this.author = author;
        this.filePath = filePath;
        this.publicationDate = publicationDate;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPubDate() {
        return publicationDate;
    }

    public String getPath() {
        return filePath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPath(String filepath) {
        this.filePath = filepath;
    }

    public void setDate(Date pubdate) {
        this.publicationDate = pubdate;
    }

    public void setReader(reader reader) {
        this.Reader = reader;
    }

    public reader getReader() {
        return Reader;
    }
}
