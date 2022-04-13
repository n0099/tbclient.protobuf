import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.NovelInfo;

public final class NovelInfo extends Message {
  public static final String DEFAULT_AUTHOR = "";
  
  public static final Long DEFAULT_CHAPTERS;
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_DISCOUNT_PRICE = "";
  
  public static final String DEFAULT_H5_URL = "";
  
  public static final String DEFAULT_IMG = "";
  
  public static final String DEFAULT_IS_PAY = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final Long DEFAULT_NOVEL_ID;
  
  public static final Long DEFAULT_PERCENT;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String author;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long chapters;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String discount_price;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String h5_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String img;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String is_pay;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long novel_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long percent;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(197848283, "Ltbclient/NovelInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(197848283, "Ltbclient/NovelInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_NOVEL_ID = long_;
    DEFAULT_PERCENT = long_;
    DEFAULT_CHAPTERS = long_;
  }
  
  public NovelInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.novel_id;
      if (long_2 == null) {
        this.novel_id = DEFAULT_NOVEL_ID;
      } else {
        this.novel_id = long_2;
      } 
      String str2 = paramBuilder.img;
      if (str2 == null) {
        this.img = "";
      } else {
        this.img = str2;
      } 
      str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      str2 = paramBuilder.author;
      if (str2 == null) {
        this.author = "";
      } else {
        this.author = str2;
      } 
      str2 = paramBuilder.desc;
      if (str2 == null) {
        this.desc = "";
      } else {
        this.desc = str2;
      } 
      str2 = paramBuilder.discount_price;
      if (str2 == null) {
        this.discount_price = "";
      } else {
        this.discount_price = str2;
      } 
      Long long_1 = paramBuilder.percent;
      if (long_1 == null) {
        this.percent = DEFAULT_PERCENT;
      } else {
        this.percent = long_1;
      } 
      String str1 = paramBuilder.h5_url;
      if (str1 == null) {
        this.h5_url = "";
      } else {
        this.h5_url = str1;
      } 
      str1 = paramBuilder.is_pay;
      if (str1 == null) {
        this.is_pay = "";
      } else {
        this.is_pay = str1;
      } 
      long_ = paramBuilder.chapters;
      if (long_ == null) {
        this.chapters = DEFAULT_CHAPTERS;
      } else {
        this.chapters = long_;
      } 
    } else {
      this.novel_id = ((Builder)long_).novel_id;
      this.img = ((Builder)long_).img;
      this.name = ((Builder)long_).name;
      this.author = ((Builder)long_).author;
      this.desc = ((Builder)long_).desc;
      this.discount_price = ((Builder)long_).discount_price;
      this.percent = ((Builder)long_).percent;
      this.h5_url = ((Builder)long_).h5_url;
      this.is_pay = ((Builder)long_).is_pay;
      this.chapters = ((Builder)long_).chapters;
    } 
  }
}
