package tbclient.Profile;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class TAInfo extends Message {
  public static Interceptable $ic;
  
  public static final List<String> DEFAULT_FORUMINFO = Collections.emptyList();
  
  public static final List<String> DEFAULT_FRIENDINFO;
  
  public static final Integer DEFAULT_FRIENDNUM;
  
  public static final List<String> DEFAULT_GROUPINFO = Collections.emptyList();
  
  public static final Integer DEFAULT_GROUPNUM;
  
  public static final String DEFAULT_HIDE_USER_FEED = "";
  
  public static final Integer DEFAULT_IS_FRIEND;
  
  public static final List<ReplyList> DEFAULT_REPLY_LIST;
  
  public static final Integer DEFAULT_USERCLIENTVERSIONISLOWER;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4)
  public final CommonDistance distanceinfo;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
  public final List<String> foruminfo;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
  public final List<String> friendinfo;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer friendnum;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> groupinfo;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer groupnum;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String hide_user_feed;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer is_friend;
  
  @ProtoField(tag = 10)
  public final CommonLocation location;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<ReplyList> reply_list;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer userClientVersionIsLower;
  
  static {
    DEFAULT_FRIENDINFO = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_GROUPNUM = integer;
    DEFAULT_FRIENDNUM = integer;
    DEFAULT_IS_FRIEND = integer;
    DEFAULT_REPLY_LIST = Collections.emptyList();
    DEFAULT_USERCLIENTVERSIONISLOWER = integer;
  }
  
  public TAInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<String> list1 = paramBuilder.foruminfo;
      if (list1 == null) {
        this.foruminfo = DEFAULT_FORUMINFO;
      } else {
        this.foruminfo = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.groupinfo;
      if (list1 == null) {
        this.groupinfo = DEFAULT_GROUPINFO;
      } else {
        this.groupinfo = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.friendinfo;
      if (list1 == null) {
        this.friendinfo = DEFAULT_FRIENDINFO;
      } else {
        this.friendinfo = Message.immutableCopyOf(list1);
      } 
      this.distanceinfo = paramBuilder.distanceinfo;
      Integer integer2 = paramBuilder.groupnum;
      if (integer2 == null) {
        this.groupnum = DEFAULT_GROUPNUM;
      } else {
        this.groupnum = integer2;
      } 
      integer2 = paramBuilder.friendnum;
      if (integer2 == null) {
        this.friendnum = DEFAULT_FRIENDNUM;
      } else {
        this.friendnum = integer2;
      } 
      integer2 = paramBuilder.is_friend;
      if (integer2 == null) {
        this.is_friend = DEFAULT_IS_FRIEND;
      } else {
        this.is_friend = integer2;
      } 
      List<ReplyList> list = paramBuilder.reply_list;
      if (list == null) {
        this.reply_list = DEFAULT_REPLY_LIST;
      } else {
        this.reply_list = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.userClientVersionIsLower;
      if (integer1 == null) {
        this.userClientVersionIsLower = DEFAULT_USERCLIENTVERSIONISLOWER;
      } else {
        this.userClientVersionIsLower = integer1;
      } 
      this.location = paramBuilder.location;
      str = paramBuilder.hide_user_feed;
      if (str == null) {
        this.hide_user_feed = "";
      } else {
        this.hide_user_feed = str;
      } 
    } else {
      this.foruminfo = Message.immutableCopyOf(((Builder)str).foruminfo);
      this.groupinfo = Message.immutableCopyOf(((Builder)str).groupinfo);
      this.friendinfo = Message.immutableCopyOf(((Builder)str).friendinfo);
      this.distanceinfo = ((Builder)str).distanceinfo;
      this.groupnum = ((Builder)str).groupnum;
      this.friendnum = ((Builder)str).friendnum;
      this.is_friend = ((Builder)str).is_friend;
      this.reply_list = Message.immutableCopyOf(((Builder)str).reply_list);
      this.userClientVersionIsLower = ((Builder)str).userClientVersionIsLower;
      this.location = ((Builder)str).location;
      this.hide_user_feed = ((Builder)str).hide_user_feed;
    } 
  }
  
  public TAInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1695250000, "Ltbclient/Profile/TAInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1695250000, "Ltbclient/Profile/TAInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<TAInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonDistance distanceinfo;
    
    public List<String> foruminfo;
    
    public List<String> friendinfo;
    
    public Integer friendnum;
    
    public List<String> groupinfo;
    
    public Integer groupnum;
    
    public String hide_user_feed;
    
    public Integer is_friend;
    
    public CommonLocation location;
    
    public List<ReplyList> reply_list;
    
    public Integer userClientVersionIsLower;
    
    public Builder() {}
    
    public Builder(TAInfo param1TAInfo) {
      super(param1TAInfo);
      if (param1TAInfo == null)
        return; 
      this.foruminfo = Message.copyOf(param1TAInfo.foruminfo);
      this.groupinfo = Message.copyOf(param1TAInfo.groupinfo);
      this.friendinfo = Message.copyOf(param1TAInfo.friendinfo);
      this.distanceinfo = param1TAInfo.distanceinfo;
      this.groupnum = param1TAInfo.groupnum;
      this.friendnum = param1TAInfo.friendnum;
      this.is_friend = param1TAInfo.is_friend;
      this.reply_list = Message.copyOf(param1TAInfo.reply_list);
      this.userClientVersionIsLower = param1TAInfo.userClientVersionIsLower;
      this.location = param1TAInfo.location;
      this.hide_user_feed = param1TAInfo.hide_user_feed;
    }
    
    public TAInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TAInfo)interceptResult.objValue; 
      } 
      return new TAInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
