package GetMyShelf;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
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
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2053985785, "Ltbclient/GetMyShelf/BookInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2053985785, "Ltbclient/GetMyShelf/BookInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_CARTOON_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TOTAL_CHAPTER = integer;
    DEFAULT_IS_FINISH = integer;
  }
  
  public BookInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
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
}
