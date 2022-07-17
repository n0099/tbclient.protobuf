package tbclient.Personalized;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TagInfo extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_LEGO_PAGE_ID;
  
  public static final String DEFAULT_LEGO_QS = "";
  
  public static final String DEFAULT_STAT_KEY = "";
  
  public static final Long DEFAULT_TAG_CODE;
  
  public static final String DEFAULT_TAG_NAME = "";
  
  public static final Integer DEFAULT_TAG_TYPE = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long lego_page_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String lego_qs;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String stat_key;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tag_code;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tag_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer tag_type;
  
  static {
    DEFAULT_LEGO_PAGE_ID = long_;
  }
  
  public TagInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.tag_code;
      if (long_2 == null) {
        this.tag_code = DEFAULT_TAG_CODE;
      } else {
        this.tag_code = long_2;
      } 
      String str2 = paramBuilder.tag_name;
      if (str2 == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str2;
      } 
      Integer integer = paramBuilder.tag_type;
      if (integer == null) {
        this.tag_type = DEFAULT_TAG_TYPE;
      } else {
        this.tag_type = integer;
      } 
      String str1 = paramBuilder.stat_key;
      if (str1 == null) {
        this.stat_key = "";
      } else {
        this.stat_key = str1;
      } 
      Long long_1 = paramBuilder.lego_page_id;
      if (long_1 == null) {
        this.lego_page_id = DEFAULT_LEGO_PAGE_ID;
      } else {
        this.lego_page_id = long_1;
      } 
      str = paramBuilder.lego_qs;
      if (str == null) {
        this.lego_qs = "";
      } else {
        this.lego_qs = str;
      } 
    } else {
      this.tag_code = ((Builder)str).tag_code;
      this.tag_name = ((Builder)str).tag_name;
      this.tag_type = ((Builder)str).tag_type;
      this.stat_key = ((Builder)str).stat_key;
      this.lego_page_id = ((Builder)str).lego_page_id;
      this.lego_qs = ((Builder)str).lego_qs;
    } 
  }
  
  public TagInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1324263080, "Ltbclient/Personalized/TagInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1324263080, "Ltbclient/Personalized/TagInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TAG_CODE = long_;
  }
  
  public static final class Builder extends Message.Builder<TagInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long lego_page_id;
    
    public String lego_qs;
    
    public String stat_key;
    
    public Long tag_code;
    
    public String tag_name;
    
    public Integer tag_type;
    
    public Builder() {}
    
    public Builder(TagInfo param1TagInfo) {
      super(param1TagInfo);
      if (param1TagInfo == null)
        return; 
      this.tag_code = param1TagInfo.tag_code;
      this.tag_name = param1TagInfo.tag_name;
      this.tag_type = param1TagInfo.tag_type;
      this.stat_key = param1TagInfo.stat_key;
      this.lego_page_id = param1TagInfo.lego_page_id;
      this.lego_qs = param1TagInfo.lego_qs;
    }
    
    public TagInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TagInfo)interceptResult.objValue; 
      } 
      return new TagInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
