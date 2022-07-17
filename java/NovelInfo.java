package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NovelInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AUTHOR = "";
  
  public static final String DEFAULT_BUY_URL = "";
  
  public static final Long DEFAULT_CHAPTERS;
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_DISCOUNT_PRICE = "";
  
  public static final String DEFAULT_H5_URL = "";
  
  public static final String DEFAULT_IMG = "";
  
  public static final String DEFAULT_IS_PAY = "";
  
  public static final String DEFAULT_MEMBER_IMG = "";
  
  public static final String DEFAULT_MEMBER_TEXT = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final Long DEFAULT_NOVEL_ID;
  
  public static final Long DEFAULT_PERCENT;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String author;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String buy_url;
  
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
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String member_img;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String member_text;
  
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
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.novel_id;
      if (long_3 == null) {
        this.novel_id = DEFAULT_NOVEL_ID;
      } else {
        this.novel_id = long_3;
      } 
      String str3 = paramBuilder.img;
      if (str3 == null) {
        this.img = "";
      } else {
        this.img = str3;
      } 
      str3 = paramBuilder.name;
      if (str3 == null) {
        this.name = "";
      } else {
        this.name = str3;
      } 
      str3 = paramBuilder.author;
      if (str3 == null) {
        this.author = "";
      } else {
        this.author = str3;
      } 
      str3 = paramBuilder.desc;
      if (str3 == null) {
        this.desc = "";
      } else {
        this.desc = str3;
      } 
      str3 = paramBuilder.discount_price;
      if (str3 == null) {
        this.discount_price = "";
      } else {
        this.discount_price = str3;
      } 
      Long long_2 = paramBuilder.percent;
      if (long_2 == null) {
        this.percent = DEFAULT_PERCENT;
      } else {
        this.percent = long_2;
      } 
      String str2 = paramBuilder.h5_url;
      if (str2 == null) {
        this.h5_url = "";
      } else {
        this.h5_url = str2;
      } 
      str2 = paramBuilder.is_pay;
      if (str2 == null) {
        this.is_pay = "";
      } else {
        this.is_pay = str2;
      } 
      Long long_1 = paramBuilder.chapters;
      if (long_1 == null) {
        this.chapters = DEFAULT_CHAPTERS;
      } else {
        this.chapters = long_1;
      } 
      String str1 = paramBuilder.member_text;
      if (str1 == null) {
        this.member_text = "";
      } else {
        this.member_text = str1;
      } 
      str1 = paramBuilder.member_img;
      if (str1 == null) {
        this.member_img = "";
      } else {
        this.member_img = str1;
      } 
      str = paramBuilder.buy_url;
      if (str == null) {
        this.buy_url = "";
      } else {
        this.buy_url = str;
      } 
    } else {
      this.novel_id = ((Builder)str).novel_id;
      this.img = ((Builder)str).img;
      this.name = ((Builder)str).name;
      this.author = ((Builder)str).author;
      this.desc = ((Builder)str).desc;
      this.discount_price = ((Builder)str).discount_price;
      this.percent = ((Builder)str).percent;
      this.h5_url = ((Builder)str).h5_url;
      this.is_pay = ((Builder)str).is_pay;
      this.chapters = ((Builder)str).chapters;
      this.member_text = ((Builder)str).member_text;
      this.member_img = ((Builder)str).member_img;
      this.buy_url = ((Builder)str).buy_url;
    } 
  }
  
  public NovelInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NovelInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String author;
    
    public String buy_url;
    
    public Long chapters;
    
    public String desc;
    
    public String discount_price;
    
    public String h5_url;
    
    public String img;
    
    public String is_pay;
    
    public String member_img;
    
    public String member_text;
    
    public String name;
    
    public Long novel_id;
    
    public Long percent;
    
    public Builder() {}
    
    public Builder(NovelInfo param1NovelInfo) {
      super(param1NovelInfo);
      if (param1NovelInfo == null)
        return; 
      this.novel_id = param1NovelInfo.novel_id;
      this.img = param1NovelInfo.img;
      this.name = param1NovelInfo.name;
      this.author = param1NovelInfo.author;
      this.desc = param1NovelInfo.desc;
      this.discount_price = param1NovelInfo.discount_price;
      this.percent = param1NovelInfo.percent;
      this.h5_url = param1NovelInfo.h5_url;
      this.is_pay = param1NovelInfo.is_pay;
      this.chapters = param1NovelInfo.chapters;
      this.member_text = param1NovelInfo.member_text;
      this.member_img = param1NovelInfo.member_img;
      this.buy_url = param1NovelInfo.buy_url;
    }
    
    public NovelInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NovelInfo)interceptResult.objValue; 
      } 
      return new NovelInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
