package GetUserBookMarkList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Mark extends Message {
  public static final String DEFAULT_BOOK_ID = "";
  
  public static final Long DEFAULT_CHAPTER_ID;
  
  public static final String DEFAULT_CHAPTER_TITLE = "";
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final Integer DEFAULT_PAGE_ID;
  
  public static final Integer DEFAULT_PARAGRAPH_ID;
  
  public static final Long DEFAULT_POSITION;
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  public static final Integer DEFAULT_WORD_ID;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String book_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long chapter_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String chapter_title;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer page_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer paragraph_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long position;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer update_time;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer word_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1970573142, "Ltbclient/GetUserBookMarkList/Mark;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1970573142, "Ltbclient/GetUserBookMarkList/Mark;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_CHAPTER_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_PAGE_ID = integer;
    DEFAULT_PARAGRAPH_ID = integer;
    DEFAULT_WORD_ID = integer;
    DEFAULT_POSITION = long_;
    DEFAULT_UPDATE_TIME = integer;
  }
  
  public Mark(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str3 = paramBuilder.book_id;
      if (str3 == null) {
        this.book_id = "";
      } else {
        this.book_id = str3;
      } 
      Long long_2 = paramBuilder.chapter_id;
      if (long_2 == null) {
        this.chapter_id = DEFAULT_CHAPTER_ID;
      } else {
        this.chapter_id = long_2;
      } 
      String str2 = paramBuilder.chapter_title;
      if (str2 == null) {
        this.chapter_title = "";
      } else {
        this.chapter_title = str2;
      } 
      Integer integer1 = paramBuilder.page_id;
      if (integer1 == null) {
        this.page_id = DEFAULT_PAGE_ID;
      } else {
        this.page_id = integer1;
      } 
      integer1 = paramBuilder.paragraph_id;
      if (integer1 == null) {
        this.paragraph_id = DEFAULT_PARAGRAPH_ID;
      } else {
        this.paragraph_id = integer1;
      } 
      integer1 = paramBuilder.word_id;
      if (integer1 == null) {
        this.word_id = DEFAULT_WORD_ID;
      } else {
        this.word_id = integer1;
      } 
      Long long_1 = paramBuilder.position;
      if (long_1 == null) {
        this.position = DEFAULT_POSITION;
      } else {
        this.position = long_1;
      } 
      String str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      integer = paramBuilder.update_time;
      if (integer == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer;
      } 
    } else {
      this.book_id = ((Builder)integer).book_id;
      this.chapter_id = ((Builder)integer).chapter_id;
      this.chapter_title = ((Builder)integer).chapter_title;
      this.page_id = ((Builder)integer).page_id;
      this.paragraph_id = ((Builder)integer).paragraph_id;
      this.word_id = ((Builder)integer).word_id;
      this.position = ((Builder)integer).position;
      this.content = ((Builder)integer).content;
      this.update_time = ((Builder)integer).update_time;
    } 
  }
}
