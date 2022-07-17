package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MyGroupInfo extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_GROUP_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_GROUP_NAME = "";
  
  public static final Integer DEFAULT_MAX_MEMBER_NUM;
  
  public static final Integer DEFAULT_MEMBER_NUM;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long group_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String group_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer max_member_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer member_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_MEMBER_NUM = integer;
    DEFAULT_MAX_MEMBER_NUM = integer;
  }
  
  public MyGroupInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.group_id;
      if (long_ == null) {
        this.group_id = DEFAULT_GROUP_ID;
      } else {
        this.group_id = long_;
      } 
      String str = paramBuilder.group_name;
      if (str == null) {
        this.group_name = "";
      } else {
        this.group_name = str;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      Integer integer1 = paramBuilder.member_num;
      if (integer1 == null) {
        this.member_num = DEFAULT_MEMBER_NUM;
      } else {
        this.member_num = integer1;
      } 
      integer = paramBuilder.max_member_num;
      if (integer == null) {
        this.max_member_num = DEFAULT_MAX_MEMBER_NUM;
      } else {
        this.max_member_num = integer;
      } 
    } else {
      this.group_id = ((Builder)integer).group_id;
      this.group_name = ((Builder)integer).group_name;
      this.portrait = ((Builder)integer).portrait;
      this.member_num = ((Builder)integer).member_num;
      this.max_member_num = ((Builder)integer).max_member_num;
    } 
  }
  
  public MyGroupInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(218451652, "Ltbclient/MyGroupInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(218451652, "Ltbclient/MyGroupInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<MyGroupInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long group_id;
    
    public String group_name;
    
    public Integer max_member_num;
    
    public Integer member_num;
    
    public String portrait;
    
    public Builder() {}
    
    public Builder(MyGroupInfo param1MyGroupInfo) {
      super(param1MyGroupInfo);
      if (param1MyGroupInfo == null)
        return; 
      this.group_id = param1MyGroupInfo.group_id;
      this.group_name = param1MyGroupInfo.group_name;
      this.portrait = param1MyGroupInfo.portrait;
      this.member_num = param1MyGroupInfo.member_num;
      this.max_member_num = param1MyGroupInfo.max_member_num;
    }
    
    public MyGroupInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (MyGroupInfo)interceptResult.objValue; 
      } 
      return new MyGroupInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
