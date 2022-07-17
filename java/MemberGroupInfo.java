package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class MemberGroupInfo extends Message {
  public static Interceptable $ic;
  
  public static final List<BawuRoleInfoPub> DEFAULT_MEMBER_GROUP_LIST;
  
  public static final Integer DEFAULT_MEMBER_GROUP_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_MEMBER_GROUP_TYPE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<BawuRoleInfoPub> member_group_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer member_group_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String member_group_type;
  
  static {
    DEFAULT_MEMBER_GROUP_LIST = Collections.emptyList();
  }
  
  public MemberGroupInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<BawuRoleInfoPub> list;
    if (paramBoolean == true) {
      String str = paramBuilder.member_group_type;
      if (str == null) {
        this.member_group_type = "";
      } else {
        this.member_group_type = str;
      } 
      Integer integer = paramBuilder.member_group_num;
      if (integer == null) {
        this.member_group_num = DEFAULT_MEMBER_GROUP_NUM;
      } else {
        this.member_group_num = integer;
      } 
      list = paramBuilder.member_group_list;
      if (list == null) {
        this.member_group_list = DEFAULT_MEMBER_GROUP_LIST;
      } else {
        this.member_group_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.member_group_type = ((Builder)list).member_group_type;
      this.member_group_num = ((Builder)list).member_group_num;
      this.member_group_list = Message.immutableCopyOf(((Builder)list).member_group_list);
    } 
  }
  
  public MemberGroupInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(162526514, "Ltbclient/MemberGroupInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(162526514, "Ltbclient/MemberGroupInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<MemberGroupInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<BawuRoleInfoPub> member_group_list;
    
    public Integer member_group_num;
    
    public String member_group_type;
    
    public Builder() {}
    
    public Builder(MemberGroupInfo param1MemberGroupInfo) {
      super(param1MemberGroupInfo);
      if (param1MemberGroupInfo == null)
        return; 
      this.member_group_type = param1MemberGroupInfo.member_group_type;
      this.member_group_num = param1MemberGroupInfo.member_group_num;
      this.member_group_list = Message.copyOf(param1MemberGroupInfo.member_group_list);
    }
    
    public MemberGroupInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (MemberGroupInfo)interceptResult.objValue; 
      } 
      return new MemberGroupInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
