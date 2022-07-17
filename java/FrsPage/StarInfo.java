package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class StarInfo extends Message {
  public static Interceptable $ic;
  
  public static final List<Focus> DEFAULT_FOCUS;
  
  public static final Integer DEFAULT_GENDER;
  
  public static final Integer DEFAULT_HAS_FRS_STAR;
  
  public static final String DEFAULT_HEAD = "";
  
  public static final String DEFAULT_STAR_FORUM_HEADIMG = "";
  
  public static final String DEFAULT_TOP = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 6)
  public final Fans fans;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<Focus> focus;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer gender;
  
  @ProtoField(tag = 12)
  public final Good good;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer has_frs_star;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String head;
  
  @ProtoField(tag = 15)
  public final Size head_size;
  
  @ProtoField(tag = 13)
  public final Identify identify;
  
  @ProtoField(tag = 5)
  public final Info info;
  
  @ProtoField(tag = 10)
  public final Music music;
  
  @ProtoField(tag = 11)
  public final Music mv;
  
  @ProtoField(tag = 8)
  public final PhotoInfo photo;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String star_forum_headimg;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String top;
  
  @ProtoField(tag = 14)
  public final Size top_size;
  
  @ProtoField(tag = 16)
  public final Ticket trade;
  
  @ProtoField(tag = 9)
  public final Video video;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1516609576, "Ltbclient/FrsPage/StarInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1516609576, "Ltbclient/FrsPage/StarInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_FRS_STAR = integer;
    DEFAULT_GENDER = integer;
    DEFAULT_FOCUS = Collections.emptyList();
  }
  
  public StarInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.has_frs_star;
      if (integer2 == null) {
        this.has_frs_star = DEFAULT_HAS_FRS_STAR;
      } else {
        this.has_frs_star = integer2;
      } 
      String str1 = paramBuilder.top;
      if (str1 == null) {
        this.top = "";
      } else {
        this.top = str1;
      } 
      str1 = paramBuilder.head;
      if (str1 == null) {
        this.head = "";
      } else {
        this.head = str1;
      } 
      Integer integer1 = paramBuilder.gender;
      if (integer1 == null) {
        this.gender = DEFAULT_GENDER;
      } else {
        this.gender = integer1;
      } 
      this.info = paramBuilder.info;
      this.fans = paramBuilder.fans;
      List<Focus> list = paramBuilder.focus;
      if (list == null) {
        this.focus = DEFAULT_FOCUS;
      } else {
        this.focus = Message.immutableCopyOf(list);
      } 
      this.photo = paramBuilder.photo;
      this.video = paramBuilder.video;
      this.music = paramBuilder.music;
      this.mv = paramBuilder.mv;
      this.good = paramBuilder.good;
      this.identify = paramBuilder.identify;
      this.top_size = paramBuilder.top_size;
      this.head_size = paramBuilder.head_size;
      this.trade = paramBuilder.trade;
      str = paramBuilder.star_forum_headimg;
      if (str == null) {
        this.star_forum_headimg = "";
      } else {
        this.star_forum_headimg = str;
      } 
    } else {
      this.has_frs_star = ((Builder)str).has_frs_star;
      this.top = ((Builder)str).top;
      this.head = ((Builder)str).head;
      this.gender = ((Builder)str).gender;
      this.info = ((Builder)str).info;
      this.fans = ((Builder)str).fans;
      this.focus = Message.immutableCopyOf(((Builder)str).focus);
      this.photo = ((Builder)str).photo;
      this.video = ((Builder)str).video;
      this.music = ((Builder)str).music;
      this.mv = ((Builder)str).mv;
      this.good = ((Builder)str).good;
      this.identify = ((Builder)str).identify;
      this.top_size = ((Builder)str).top_size;
      this.head_size = ((Builder)str).head_size;
      this.trade = ((Builder)str).trade;
      this.star_forum_headimg = ((Builder)str).star_forum_headimg;
    } 
  }
  
  public StarInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<StarInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Fans fans;
    
    public List<Focus> focus;
    
    public Integer gender;
    
    public Good good;
    
    public Integer has_frs_star;
    
    public String head;
    
    public Size head_size;
    
    public Identify identify;
    
    public Info info;
    
    public Music music;
    
    public Music mv;
    
    public PhotoInfo photo;
    
    public String star_forum_headimg;
    
    public String top;
    
    public Size top_size;
    
    public Ticket trade;
    
    public Video video;
    
    public Builder() {}
    
    public Builder(StarInfo param1StarInfo) {
      super(param1StarInfo);
      if (param1StarInfo == null)
        return; 
      this.has_frs_star = param1StarInfo.has_frs_star;
      this.top = param1StarInfo.top;
      this.head = param1StarInfo.head;
      this.gender = param1StarInfo.gender;
      this.info = param1StarInfo.info;
      this.fans = param1StarInfo.fans;
      this.focus = Message.copyOf(param1StarInfo.focus);
      this.photo = param1StarInfo.photo;
      this.video = param1StarInfo.video;
      this.music = param1StarInfo.music;
      this.mv = param1StarInfo.mv;
      this.good = param1StarInfo.good;
      this.identify = param1StarInfo.identify;
      this.top_size = param1StarInfo.top_size;
      this.head_size = param1StarInfo.head_size;
      this.trade = param1StarInfo.trade;
      this.star_forum_headimg = param1StarInfo.star_forum_headimg;
    }
    
    public StarInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (StarInfo)interceptResult.objValue; 
      } 
      return new StarInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
