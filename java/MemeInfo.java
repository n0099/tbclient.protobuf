package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MemeInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DETAIL_LINK = "";
  
  public static final Integer DEFAULT_HEIGHT;
  
  public static final Integer DEFAULT_PCK_ID;
  
  public static final Long DEFAULT_PIC_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final String DEFAULT_THUMBNAIL = "";
  
  public static final Integer DEFAULT_WIDTH;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String detail_link;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer height;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer pck_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long pic_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String thumbnail;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer width;
  
  static {
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
  }
  
  public MemeInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.pck_id;
      if (integer2 == null) {
        this.pck_id = DEFAULT_PCK_ID;
      } else {
        this.pck_id = integer2;
      } 
      Long long_ = paramBuilder.pic_id;
      if (long_ == null) {
        this.pic_id = DEFAULT_PIC_ID;
      } else {
        this.pic_id = long_;
      } 
      String str1 = paramBuilder.pic_url;
      if (str1 == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str1;
      } 
      str1 = paramBuilder.thumbnail;
      if (str1 == null) {
        this.thumbnail = "";
      } else {
        this.thumbnail = str1;
      } 
      Integer integer1 = paramBuilder.width;
      if (integer1 == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer1;
      } 
      integer1 = paramBuilder.height;
      if (integer1 == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer1;
      } 
      str = paramBuilder.detail_link;
      if (str == null) {
        this.detail_link = "";
      } else {
        this.detail_link = str;
      } 
    } else {
      this.pck_id = ((Builder)str).pck_id;
      this.pic_id = ((Builder)str).pic_id;
      this.pic_url = ((Builder)str).pic_url;
      this.thumbnail = ((Builder)str).thumbnail;
      this.width = ((Builder)str).width;
      this.height = ((Builder)str).height;
      this.detail_link = ((Builder)str).detail_link;
    } 
  }
  
  public MemeInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1305491539, "Ltbclient/MemeInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1305491539, "Ltbclient/MemeInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PCK_ID = integer;
  }
  
  public static final class Builder extends Message.Builder<MemeInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String detail_link;
    
    public Integer height;
    
    public Integer pck_id;
    
    public Long pic_id;
    
    public String pic_url;
    
    public String thumbnail;
    
    public Integer width;
    
    public Builder() {}
    
    public Builder(MemeInfo param1MemeInfo) {
      super(param1MemeInfo);
      if (param1MemeInfo == null)
        return; 
      this.pck_id = param1MemeInfo.pck_id;
      this.pic_id = param1MemeInfo.pic_id;
      this.pic_url = param1MemeInfo.pic_url;
      this.thumbnail = param1MemeInfo.thumbnail;
      this.width = param1MemeInfo.width;
      this.height = param1MemeInfo.height;
      this.detail_link = param1MemeInfo.detail_link;
    }
    
    public MemeInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (MemeInfo)interceptResult.objValue; 
      } 
      return new MemeInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
