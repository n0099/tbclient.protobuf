package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumBookInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AUTHOR = "";
  
  public static final String DEFAULT_BOOK_COVER = "";
  
  public static final String DEFAULT_BOOK_ID = "";
  
  public static final String DEFAULT_BOOK_TITLE = "";
  
  public static final Integer DEFAULT_BOOK_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_FORUM_PIC = "";
  
  public static final Long DEFAULT_HISTORY_PAGE_ID;
  
  public static final Long DEFAULT_HISTORY_PARAGRAPH_ID;
  
  public static final Long DEFAULT_HISTORY_PERCENT;
  
  public static final Long DEFAULT_HISTORY_WORD_ID;
  
  public static final String DEFAULT_SHOW_CHAPTER_ID = "";
  
  public static final String DEFAULT_SHOW_CHAPTER_NO = "";
  
  public static final String DEFAULT_SHOW_CHAPTER_TITLE = "";
  
  public static final Long DEFAULT_SHOW_PAGE_ID;
  
  public static final Long DEFAULT_SHOW_PARAGRAPH_ID;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String author;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String book_cover;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String book_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String book_title;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer book_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String forum_pic;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long history_page_id;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT64)
  public final Long history_paragraph_id;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT64)
  public final Long history_percent;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT64)
  public final Long history_word_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String show_chapter_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String show_chapter_no;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String show_chapter_title;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT64)
  public final Long show_page_id;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT64)
  public final Long show_paragraph_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_HISTORY_PAGE_ID = long_;
    DEFAULT_HISTORY_PARAGRAPH_ID = long_;
    DEFAULT_HISTORY_WORD_ID = long_;
    DEFAULT_HISTORY_PERCENT = long_;
    DEFAULT_SHOW_PAGE_ID = long_;
    DEFAULT_SHOW_PARAGRAPH_ID = long_;
  }
  
  public ForumBookInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str2 = paramBuilder.book_id;
      if (str2 == null) {
        this.book_id = "";
      } else {
        this.book_id = str2;
      } 
      Integer integer = paramBuilder.book_type;
      if (integer == null) {
        this.book_type = DEFAULT_BOOK_TYPE;
      } else {
        this.book_type = integer;
      } 
      String str1 = paramBuilder.book_title;
      if (str1 == null) {
        this.book_title = "";
      } else {
        this.book_title = str1;
      } 
      str1 = paramBuilder.book_cover;
      if (str1 == null) {
        this.book_cover = "";
      } else {
        this.book_cover = str1;
      } 
      str1 = paramBuilder.author;
      if (str1 == null) {
        this.author = "";
      } else {
        this.author = str1;
      } 
      str1 = paramBuilder.forum_pic;
      if (str1 == null) {
        this.forum_pic = "";
      } else {
        this.forum_pic = str1;
      } 
      str1 = paramBuilder.show_chapter_id;
      if (str1 == null) {
        this.show_chapter_id = "";
      } else {
        this.show_chapter_id = str1;
      } 
      str1 = paramBuilder.show_chapter_no;
      if (str1 == null) {
        this.show_chapter_no = "";
      } else {
        this.show_chapter_no = str1;
      } 
      str1 = paramBuilder.show_chapter_title;
      if (str1 == null) {
        this.show_chapter_title = "";
      } else {
        this.show_chapter_title = str1;
      } 
      Long long_1 = paramBuilder.history_page_id;
      if (long_1 == null) {
        this.history_page_id = DEFAULT_HISTORY_PAGE_ID;
      } else {
        this.history_page_id = long_1;
      } 
      long_1 = paramBuilder.history_paragraph_id;
      if (long_1 == null) {
        this.history_paragraph_id = DEFAULT_HISTORY_PARAGRAPH_ID;
      } else {
        this.history_paragraph_id = long_1;
      } 
      long_1 = paramBuilder.history_word_id;
      if (long_1 == null) {
        this.history_word_id = DEFAULT_HISTORY_WORD_ID;
      } else {
        this.history_word_id = long_1;
      } 
      long_1 = paramBuilder.history_percent;
      if (long_1 == null) {
        this.history_percent = DEFAULT_HISTORY_PERCENT;
      } else {
        this.history_percent = long_1;
      } 
      long_1 = paramBuilder.show_page_id;
      if (long_1 == null) {
        this.show_page_id = DEFAULT_SHOW_PAGE_ID;
      } else {
        this.show_page_id = long_1;
      } 
      long_ = paramBuilder.show_paragraph_id;
      if (long_ == null) {
        this.show_paragraph_id = DEFAULT_SHOW_PARAGRAPH_ID;
      } else {
        this.show_paragraph_id = long_;
      } 
    } else {
      this.book_id = ((Builder)long_).book_id;
      this.book_type = ((Builder)long_).book_type;
      this.book_title = ((Builder)long_).book_title;
      this.book_cover = ((Builder)long_).book_cover;
      this.author = ((Builder)long_).author;
      this.forum_pic = ((Builder)long_).forum_pic;
      this.show_chapter_id = ((Builder)long_).show_chapter_id;
      this.show_chapter_no = ((Builder)long_).show_chapter_no;
      this.show_chapter_title = ((Builder)long_).show_chapter_title;
      this.history_page_id = ((Builder)long_).history_page_id;
      this.history_paragraph_id = ((Builder)long_).history_paragraph_id;
      this.history_word_id = ((Builder)long_).history_word_id;
      this.history_percent = ((Builder)long_).history_percent;
      this.show_page_id = ((Builder)long_).show_page_id;
      this.show_paragraph_id = ((Builder)long_).show_paragraph_id;
    } 
  }
  
  public ForumBookInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1407435814, "Ltbclient/FrsPage/ForumBookInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1407435814, "Ltbclient/FrsPage/ForumBookInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumBookInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String author;
    
    public String book_cover;
    
    public String book_id;
    
    public String book_title;
    
    public Integer book_type;
    
    public String forum_pic;
    
    public Long history_page_id;
    
    public Long history_paragraph_id;
    
    public Long history_percent;
    
    public Long history_word_id;
    
    public String show_chapter_id;
    
    public String show_chapter_no;
    
    public String show_chapter_title;
    
    public Long show_page_id;
    
    public Long show_paragraph_id;
    
    public Builder() {}
    
    public Builder(ForumBookInfo param1ForumBookInfo) {
      super(param1ForumBookInfo);
      if (param1ForumBookInfo == null)
        return; 
      this.book_id = param1ForumBookInfo.book_id;
      this.book_type = param1ForumBookInfo.book_type;
      this.book_title = param1ForumBookInfo.book_title;
      this.book_cover = param1ForumBookInfo.book_cover;
      this.author = param1ForumBookInfo.author;
      this.forum_pic = param1ForumBookInfo.forum_pic;
      this.show_chapter_id = param1ForumBookInfo.show_chapter_id;
      this.show_chapter_no = param1ForumBookInfo.show_chapter_no;
      this.show_chapter_title = param1ForumBookInfo.show_chapter_title;
      this.history_page_id = param1ForumBookInfo.history_page_id;
      this.history_paragraph_id = param1ForumBookInfo.history_paragraph_id;
      this.history_word_id = param1ForumBookInfo.history_word_id;
      this.history_percent = param1ForumBookInfo.history_percent;
      this.show_page_id = param1ForumBookInfo.show_page_id;
      this.show_paragraph_id = param1ForumBookInfo.show_paragraph_id;
    }
    
    public ForumBookInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumBookInfo)interceptResult.objValue; 
      } 
      return new ForumBookInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
