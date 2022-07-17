package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PbLinkInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_EXT_TXT = "";
  
  public static final String DEFAULT_LINK_FROM = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final Integer DEFAULT_SORT;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TO_URL = "";
  
  public static final Integer DEFAULT_URL_TYPE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String ext_txt;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String link_from;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer sort;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String to_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer url_type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(498544759, "Ltbclient/PbLinkInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(498544759, "Ltbclient/PbLinkInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_SORT = integer;
    DEFAULT_URL_TYPE = integer;
  }
  
  public PbLinkInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.to_url;
      if (str == null) {
        this.to_url = "";
      } else {
        this.to_url = str;
      } 
      str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
      str = paramBuilder.link_from;
      if (str == null) {
        this.link_from = "";
      } else {
        this.link_from = str;
      } 
      str = paramBuilder.ext_txt;
      if (str == null) {
        this.ext_txt = "";
      } else {
        this.ext_txt = str;
      } 
      Integer integer1 = paramBuilder.sort;
      if (integer1 == null) {
        this.sort = DEFAULT_SORT;
      } else {
        this.sort = integer1;
      } 
      integer = paramBuilder.url_type;
      if (integer == null) {
        this.url_type = DEFAULT_URL_TYPE;
      } else {
        this.url_type = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.to_url = ((Builder)integer).to_url;
      this.pic_url = ((Builder)integer).pic_url;
      this.link_from = ((Builder)integer).link_from;
      this.ext_txt = ((Builder)integer).ext_txt;
      this.sort = ((Builder)integer).sort;
      this.url_type = ((Builder)integer).url_type;
    } 
  }
  
  public PbLinkInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PbLinkInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String ext_txt;
    
    public String link_from;
    
    public String pic_url;
    
    public Integer sort;
    
    public String title;
    
    public String to_url;
    
    public Integer url_type;
    
    public Builder() {}
    
    public Builder(PbLinkInfo param1PbLinkInfo) {
      super(param1PbLinkInfo);
      if (param1PbLinkInfo == null)
        return; 
      this.title = param1PbLinkInfo.title;
      this.to_url = param1PbLinkInfo.to_url;
      this.pic_url = param1PbLinkInfo.pic_url;
      this.link_from = param1PbLinkInfo.link_from;
      this.ext_txt = param1PbLinkInfo.ext_txt;
      this.sort = param1PbLinkInfo.sort;
      this.url_type = param1PbLinkInfo.url_type;
    }
    
    public PbLinkInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PbLinkInfo)interceptResult.objValue; 
      } 
      return new PbLinkInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
