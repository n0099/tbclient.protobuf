package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TagInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CLASS_ID;
  
  public static final Integer DEFAULT_RANK_TYPE;
  
  public static final Integer DEFAULT_TAB_ID;
  
  public static final String DEFAULT_TAG_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer class_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer rank_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer tab_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String tag_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-510345027, "Ltbclient/TagInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-510345027, "Ltbclient/TagInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_RANK_TYPE = integer;
    DEFAULT_CLASS_ID = integer;
    DEFAULT_TAB_ID = integer;
  }
  
  public TagInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.rank_type;
      if (integer == null) {
        this.rank_type = DEFAULT_RANK_TYPE;
      } else {
        this.rank_type = integer;
      } 
      integer = paramBuilder.class_id;
      if (integer == null) {
        this.class_id = DEFAULT_CLASS_ID;
      } else {
        this.class_id = integer;
      } 
      integer = paramBuilder.tab_id;
      if (integer == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = integer;
      } 
      str = paramBuilder.tag_name;
      if (str == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str;
      } 
    } else {
      this.rank_type = ((Builder)str).rank_type;
      this.class_id = ((Builder)str).class_id;
      this.tab_id = ((Builder)str).tab_id;
      this.tag_name = ((Builder)str).tag_name;
    } 
  }
  
  public TagInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TagInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer class_id;
    
    public Integer rank_type;
    
    public Integer tab_id;
    
    public String tag_name;
    
    public Builder() {}
    
    public Builder(TagInfo param1TagInfo) {
      super(param1TagInfo);
      if (param1TagInfo == null)
        return; 
      this.rank_type = param1TagInfo.rank_type;
      this.class_id = param1TagInfo.class_id;
      this.tab_id = param1TagInfo.tab_id;
      this.tag_name = param1TagInfo.tag_name;
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
