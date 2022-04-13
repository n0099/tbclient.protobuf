package GetBookStore;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Shelf extends Message {
  public static final Long DEFAULT_CARTOON_ID;
  
  public static final String DEFAULT_CARTOON_NAME = "";
  
  public static final String DEFAULT_COVER_IMG = "";
  
  public static final Integer DEFAULT_FIRST_CHAPTER_ID;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_TOTAL_CHAPTER;
  
  public static final Long DEFAULT_UPDATE_TIME;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long cartoon_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String cartoon_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String cover_img;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer first_chapter_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer total_chapter;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long update_time;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1959106508, "Ltbclient/GetBookStore/Shelf;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1959106508, "Ltbclient/GetBookStore/Shelf;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_CARTOON_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TOTAL_CHAPTER = integer;
    DEFAULT_FIRST_CHAPTER_ID = integer;
    DEFAULT_UPDATE_TIME = long_;
  }
  
  public Shelf(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.forum_id;
      if (long_1 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_1;
      } 
      long_1 = paramBuilder.cartoon_id;
      if (long_1 == null) {
        this.cartoon_id = DEFAULT_CARTOON_ID;
      } else {
        this.cartoon_id = long_1;
      } 
      String str2 = paramBuilder.cartoon_name;
      if (str2 == null) {
        this.cartoon_name = "";
      } else {
        this.cartoon_name = str2;
      } 
      Integer integer = paramBuilder.total_chapter;
      if (integer == null) {
        this.total_chapter = DEFAULT_TOTAL_CHAPTER;
      } else {
        this.total_chapter = integer;
      } 
      integer = paramBuilder.first_chapter_id;
      if (integer == null) {
        this.first_chapter_id = DEFAULT_FIRST_CHAPTER_ID;
      } else {
        this.first_chapter_id = integer;
      } 
      String str1 = paramBuilder.cover_img;
      if (str1 == null) {
        this.cover_img = "";
      } else {
        this.cover_img = str1;
      } 
      long_ = paramBuilder.update_time;
      if (long_ == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = long_;
      } 
    } else {
      this.forum_id = ((Builder)long_).forum_id;
      this.cartoon_id = ((Builder)long_).cartoon_id;
      this.cartoon_name = ((Builder)long_).cartoon_name;
      this.total_chapter = ((Builder)long_).total_chapter;
      this.first_chapter_id = ((Builder)long_).first_chapter_id;
      this.cover_img = ((Builder)long_).cover_img;
      this.update_time = ((Builder)long_).update_time;
    } 
  }
}
