package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SchoolRecomUserInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_INSTITUTE = "";
  
  public static final Integer DEFAULT_IS_LIKED;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_UID = Long.valueOf(0L);
  
  public static final String DEFAULT_UNAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String institute;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer is_liked;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long uid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String uname;
  
  static {
    DEFAULT_IS_LIKED = Integer.valueOf(0);
  }
  
  public SchoolRecomUserInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.uid;
      if (long_ == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_;
      } 
      String str = paramBuilder.uname;
      if (str == null) {
        this.uname = "";
      } else {
        this.uname = str;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      str = paramBuilder.institute;
      if (str == null) {
        this.institute = "";
      } else {
        this.institute = str;
      } 
      integer = paramBuilder.is_liked;
      if (integer == null) {
        this.is_liked = DEFAULT_IS_LIKED;
      } else {
        this.is_liked = integer;
      } 
    } else {
      this.uid = ((Builder)integer).uid;
      this.uname = ((Builder)integer).uname;
      this.portrait = ((Builder)integer).portrait;
      this.institute = ((Builder)integer).institute;
      this.is_liked = ((Builder)integer).is_liked;
    } 
  }
  
  public SchoolRecomUserInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1889951246, "Ltbclient/SchoolRecomUserInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1889951246, "Ltbclient/SchoolRecomUserInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<SchoolRecomUserInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String institute;
    
    public Integer is_liked;
    
    public String portrait;
    
    public Long uid;
    
    public String uname;
    
    public Builder() {}
    
    public Builder(SchoolRecomUserInfo param1SchoolRecomUserInfo) {
      super(param1SchoolRecomUserInfo);
      if (param1SchoolRecomUserInfo == null)
        return; 
      this.uid = param1SchoolRecomUserInfo.uid;
      this.uname = param1SchoolRecomUserInfo.uname;
      this.portrait = param1SchoolRecomUserInfo.portrait;
      this.institute = param1SchoolRecomUserInfo.institute;
      this.is_liked = param1SchoolRecomUserInfo.is_liked;
    }
    
    public SchoolRecomUserInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (SchoolRecomUserInfo)interceptResult.objValue; 
      } 
      return new SchoolRecomUserInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
