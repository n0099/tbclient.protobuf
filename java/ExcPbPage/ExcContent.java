package ExcPbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ExcContent extends Message {
  public static final Integer DEFAULT_ALIGN;
  
  public static final String DEFAULT_BIG_CDN_SRC = "";
  
  public static final String DEFAULT_BIG_SIZE = "";
  
  public static final String DEFAULT_BIG_SRC = "";
  
  public static final String DEFAULT_BSIZE = "";
  
  public static final String DEFAULT_C = "";
  
  public static final String DEFAULT_CDN_SRC = "";
  
  public static final String DEFAULT_COLOR = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_SIZE;
  
  public static final String DEFAULT_SRC = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final Long DEFAULT_TYPE = Long.valueOf(0L);
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer align;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String big_cdn_src;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String big_size;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String big_src;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String bsize;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String c;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String cdn_src;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String color;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer size;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String src;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ALIGN = integer;
    DEFAULT_SIZE = integer;
  }
  
  public ExcContent(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.type;
      if (long_ == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = long_;
      } 
      String str2 = paramBuilder.text;
      if (str2 == null) {
        this.text = "";
      } else {
        this.text = str2;
      } 
      str2 = paramBuilder.link;
      if (str2 == null) {
        this.link = "";
      } else {
        this.link = str2;
      } 
      str2 = paramBuilder.src;
      if (str2 == null) {
        this.src = "";
      } else {
        this.src = str2;
      } 
      str2 = paramBuilder.bsize;
      if (str2 == null) {
        this.bsize = "";
      } else {
        this.bsize = str2;
      } 
      str2 = paramBuilder.big_src;
      if (str2 == null) {
        this.big_src = "";
      } else {
        this.big_src = str2;
      } 
      str2 = paramBuilder.big_size;
      if (str2 == null) {
        this.big_size = "";
      } else {
        this.big_size = str2;
      } 
      str2 = paramBuilder.cdn_src;
      if (str2 == null) {
        this.cdn_src = "";
      } else {
        this.cdn_src = str2;
      } 
      str2 = paramBuilder.big_cdn_src;
      if (str2 == null) {
        this.big_cdn_src = "";
      } else {
        this.big_cdn_src = str2;
      } 
      str2 = paramBuilder.c;
      if (str2 == null) {
        this.c = "";
      } else {
        this.c = str2;
      } 
      Integer integer1 = paramBuilder.align;
      if (integer1 == null) {
        this.align = DEFAULT_ALIGN;
      } else {
        this.align = integer1;
      } 
      String str1 = paramBuilder.color;
      if (str1 == null) {
        this.color = "";
      } else {
        this.color = str1;
      } 
      integer = paramBuilder.size;
      if (integer == null) {
        this.size = DEFAULT_SIZE;
      } else {
        this.size = integer;
      } 
    } else {
      this.type = ((Builder)integer).type;
      this.text = ((Builder)integer).text;
      this.link = ((Builder)integer).link;
      this.src = ((Builder)integer).src;
      this.bsize = ((Builder)integer).bsize;
      this.big_src = ((Builder)integer).big_src;
      this.big_size = ((Builder)integer).big_size;
      this.cdn_src = ((Builder)integer).cdn_src;
      this.big_cdn_src = ((Builder)integer).big_cdn_src;
      this.c = ((Builder)integer).c;
      this.align = ((Builder)integer).align;
      this.color = ((Builder)integer).color;
      this.size = ((Builder)integer).size;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1068970230, "Ltbclient/ExcPbPage/ExcContent;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1068970230, "Ltbclient/ExcPbPage/ExcContent;");
          return;
        } 
      } 
    } 
  }
}
