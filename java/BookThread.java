package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BookThread extends Message {
  public static final String DEFAULT_BOOK_ID = "";
  
  public static final Integer DEFAULT_BOOK_TYPE = Integer.valueOf(0);
  
  public static final Long DEFAULT_CHAPTER_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String book_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer book_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long chapter_id;
  
  public BookThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.book_id;
      if (str == null) {
        this.book_id = "";
      } else {
        this.book_id = str;
      } 
      Integer integer = paramBuilder.book_type;
      if (integer == null) {
        this.book_type = DEFAULT_BOOK_TYPE;
      } else {
        this.book_type = integer;
      } 
      long_ = paramBuilder.chapter_id;
      if (long_ == null) {
        this.chapter_id = DEFAULT_CHAPTER_ID;
      } else {
        this.chapter_id = long_;
      } 
    } else {
      this.book_id = ((Builder)long_).book_id;
      this.book_type = ((Builder)long_).book_type;
      this.chapter_id = ((Builder)long_).chapter_id;
    } 
  }
  
  public BookThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BookThread> {
    public String book_id;
    
    public Integer book_type;
    
    public Long chapter_id;
    
    public Builder() {}
    
    public Builder(BookThread param1BookThread) {
      super(param1BookThread);
      if (param1BookThread == null)
        return; 
      this.book_id = param1BookThread.book_id;
      this.book_type = param1BookThread.book_type;
      this.chapter_id = param1BookThread.chapter_id;
    }
    
    public BookThread build(boolean param1Boolean) {
      return new BookThread(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
