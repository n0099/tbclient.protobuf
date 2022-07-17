package tbclient.GetPrivateInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.SimpleUser;

public final class ResData extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_BAZHU_SHOW_INSIDE;
  
  public static final Integer DEFAULT_BAZHU_SHOW_OUTSIDE;
  
  public static final Integer DEFAULT_FORUM_NUM;
  
  public static final Integer DEFAULT_GROUP;
  
  public static final Integer DEFAULT_LIKE;
  
  public static final Integer DEFAULT_LIVE;
  
  public static final Integer DEFAULT_LOCATION;
  
  public static final Integer DEFAULT_POST;
  
  public static final Integer DEFAULT_REPLY;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer bazhu_show_inside;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer bazhu_show_outside;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer forum_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer group;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer like;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer live;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer location;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer post;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer reply;
  
  @ProtoField(tag = 5)
  public final SimpleUser user;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1085806843, "Ltbclient/GetPrivateInfo/ResData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1085806843, "Ltbclient/GetPrivateInfo/ResData;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_LOCATION = integer;
    DEFAULT_POST = integer;
    DEFAULT_LIKE = integer;
    DEFAULT_GROUP = integer;
    DEFAULT_LIVE = integer;
    DEFAULT_FORUM_NUM = integer;
    DEFAULT_REPLY = integer;
    DEFAULT_BAZHU_SHOW_INSIDE = integer;
    DEFAULT_BAZHU_SHOW_OUTSIDE = integer;
  }
  
  public ResData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.location;
      if (integer1 == null) {
        this.location = DEFAULT_LOCATION;
      } else {
        this.location = integer1;
      } 
      integer1 = paramBuilder.post;
      if (integer1 == null) {
        this.post = DEFAULT_POST;
      } else {
        this.post = integer1;
      } 
      integer1 = paramBuilder.like;
      if (integer1 == null) {
        this.like = DEFAULT_LIKE;
      } else {
        this.like = integer1;
      } 
      integer1 = paramBuilder.group;
      if (integer1 == null) {
        this.group = DEFAULT_GROUP;
      } else {
        this.group = integer1;
      } 
      this.user = paramBuilder.user;
      integer1 = paramBuilder.live;
      if (integer1 == null) {
        this.live = DEFAULT_LIVE;
      } else {
        this.live = integer1;
      } 
      integer1 = paramBuilder.forum_num;
      if (integer1 == null) {
        this.forum_num = DEFAULT_FORUM_NUM;
      } else {
        this.forum_num = integer1;
      } 
      integer1 = paramBuilder.reply;
      if (integer1 == null) {
        this.reply = DEFAULT_REPLY;
      } else {
        this.reply = integer1;
      } 
      integer1 = paramBuilder.bazhu_show_inside;
      if (integer1 == null) {
        this.bazhu_show_inside = DEFAULT_BAZHU_SHOW_INSIDE;
      } else {
        this.bazhu_show_inside = integer1;
      } 
      integer = paramBuilder.bazhu_show_outside;
      if (integer == null) {
        this.bazhu_show_outside = DEFAULT_BAZHU_SHOW_OUTSIDE;
      } else {
        this.bazhu_show_outside = integer;
      } 
    } else {
      this.location = ((Builder)integer).location;
      this.post = ((Builder)integer).post;
      this.like = ((Builder)integer).like;
      this.group = ((Builder)integer).group;
      this.user = ((Builder)integer).user;
      this.live = ((Builder)integer).live;
      this.forum_num = ((Builder)integer).forum_num;
      this.reply = ((Builder)integer).reply;
      this.bazhu_show_inside = ((Builder)integer).bazhu_show_inside;
      this.bazhu_show_outside = ((Builder)integer).bazhu_show_outside;
    } 
  }
  
  public ResData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ResData> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer bazhu_show_inside;
    
    public Integer bazhu_show_outside;
    
    public Integer forum_num;
    
    public Integer group;
    
    public Integer like;
    
    public Integer live;
    
    public Integer location;
    
    public Integer post;
    
    public Integer reply;
    
    public SimpleUser user;
    
    public Builder() {}
    
    public Builder(ResData param1ResData) {
      super(param1ResData);
      if (param1ResData == null)
        return; 
      this.location = param1ResData.location;
      this.post = param1ResData.post;
      this.like = param1ResData.like;
      this.group = param1ResData.group;
      this.user = param1ResData.user;
      this.live = param1ResData.live;
      this.forum_num = param1ResData.forum_num;
      this.reply = param1ResData.reply;
      this.bazhu_show_inside = param1ResData.bazhu_show_inside;
      this.bazhu_show_outside = param1ResData.bazhu_show_outside;
    }
    
    public ResData build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ResData)interceptResult.objValue; 
      } 
      return new ResData(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
