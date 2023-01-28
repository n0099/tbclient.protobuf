package tbclient.GetMyShelf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BookInfo extends Message {
  public static final String DEFAULT_AUTHOR_NAME = "";
  
  public static final Long DEFAULT_CARTOON_ID;
  
  public static final String DEFAULT_CARTOON_NAME = "";
  
  public static final String DEFAULT_COVER_IMG = "";
  
  public static final String DEFAULT_FIRST_CHAPTER_ID = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_IS_FINISH;
  
  public static final Integer DEFAULT_TOTAL_CHAPTER;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String author_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long cartoon_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String cartoon_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String cover_img;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String first_chapter_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_finish;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer total_chapter;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_CARTOON_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TOTAL_CHAPTER = integer;
    DEFAULT_IS_FINISH = integer;
  }
  
  public BookInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      long_ = paramBuilder.cartoon_id;
      if (long_ == null) {
        this.cartoon_id = DEFAULT_CARTOON_ID;
      } else {
        this.cartoon_id = long_;
      } 
      String str2 = paramBuilder.cover_img;
      if (str2 == null) {
        this.cover_img = "";
      } else {
        this.cover_img = str2;
      } 
      str2 = paramBuilder.cartoon_name;
      if (str2 == null) {
        this.cartoon_name = "";
      } else {
        this.cartoon_name = str2;
      } 
      Integer integer2 = paramBuilder.total_chapter;
      if (integer2 == null) {
        this.total_chapter = DEFAULT_TOTAL_CHAPTER;
      } else {
        this.total_chapter = integer2;
      } 
      String str1 = paramBuilder.first_chapter_id;
      if (str1 == null) {
        this.first_chapter_id = "";
      } else {
        this.first_chapter_id = str1;
      } 
      Integer integer1 = paramBuilder.is_finish;
      if (integer1 == null) {
        this.is_finish = DEFAULT_IS_FINISH;
      } else {
        this.is_finish = integer1;
      } 
      str = paramBuilder.author_name;
      if (str == null) {
        this.author_name = "";
      } else {
        this.author_name = str;
      } 
    } else {
      this.forum_id = ((Builder)str).forum_id;
      this.cartoon_id = ((Builder)str).cartoon_id;
      this.cover_img = ((Builder)str).cover_img;
      this.cartoon_name = ((Builder)str).cartoon_name;
      this.total_chapter = ((Builder)str).total_chapter;
      this.first_chapter_id = ((Builder)str).first_chapter_id;
      this.is_finish = ((Builder)str).is_finish;
      this.author_name = ((Builder)str).author_name;
    } 
  }
  
  public BookInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BookInfo> {
    public String author_name;
    
    public Long cartoon_id;
    
    public String cartoon_name;
    
    public String cover_img;
    
    public String first_chapter_id;
    
    public Long forum_id;
    
    public Integer is_finish;
    
    public Integer total_chapter;
    
    public Builder() {}
    
    public Builder(BookInfo param1BookInfo) {
      super(param1BookInfo);
      if (param1BookInfo == null)
        return; 
      this.forum_id = param1BookInfo.forum_id;
      this.cartoon_id = param1BookInfo.cartoon_id;
      this.cover_img = param1BookInfo.cover_img;
      this.cartoon_name = param1BookInfo.cartoon_name;
      this.total_chapter = param1BookInfo.total_chapter;
      this.first_chapter_id = param1BookInfo.first_chapter_id;
      this.is_finish = param1BookInfo.is_finish;
      this.author_name = param1BookInfo.author_name;
    }
    
    public BookInfo build(boolean param1Boolean) {
      return new BookInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
