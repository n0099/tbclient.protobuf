package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class OriForumInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ORI_AVATAR = "";
  
  public static final Long DEFAULT_ORI_FID;
  
  public static final String DEFAULT_ORI_FNAME = "";
  
  public static final Long DEFAULT_ORI_MEMBER_NUM;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String ori_avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long ori_fid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String ori_fname;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long ori_member_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(282302344, "Ltbclient/OriForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(282302344, "Ltbclient/OriForumInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_ORI_FID = long_;
    DEFAULT_ORI_MEMBER_NUM = long_;
  }
  
  public OriForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.ori_fid;
      if (long_1 == null) {
        this.ori_fid = DEFAULT_ORI_FID;
      } else {
        this.ori_fid = long_1;
      } 
      String str = paramBuilder.ori_fname;
      if (str == null) {
        this.ori_fname = "";
      } else {
        this.ori_fname = str;
      } 
      str = paramBuilder.ori_avatar;
      if (str == null) {
        this.ori_avatar = "";
      } else {
        this.ori_avatar = str;
      } 
      long_ = paramBuilder.ori_member_num;
      if (long_ == null) {
        this.ori_member_num = DEFAULT_ORI_MEMBER_NUM;
      } else {
        this.ori_member_num = long_;
      } 
    } else {
      this.ori_fid = ((Builder)long_).ori_fid;
      this.ori_fname = ((Builder)long_).ori_fname;
      this.ori_avatar = ((Builder)long_).ori_avatar;
      this.ori_member_num = ((Builder)long_).ori_member_num;
    } 
  }
  
  public OriForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<OriForumInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String ori_avatar;
    
    public Long ori_fid;
    
    public String ori_fname;
    
    public Long ori_member_num;
    
    public Builder() {}
    
    public Builder(OriForumInfo param1OriForumInfo) {
      super(param1OriForumInfo);
      if (param1OriForumInfo == null)
        return; 
      this.ori_fid = param1OriForumInfo.ori_fid;
      this.ori_fname = param1OriForumInfo.ori_fname;
      this.ori_avatar = param1OriForumInfo.ori_avatar;
      this.ori_member_num = param1OriForumInfo.ori_member_num;
    }
    
    public OriForumInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (OriForumInfo)interceptResult.objValue; 
      } 
      return new OriForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
