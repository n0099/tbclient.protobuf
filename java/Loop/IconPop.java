package tbclient.Loop;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class IconPop extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CATEGORY_ID = "";
  
  public static final String DEFAULT_EXT = "";
  
  public static final String DEFAULT_FORUM_LIST = "";
  
  public static final Long DEFAULT_ICON_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_INTRO = "";
  
  public static final String DEFAULT_INTRO_URL = "";
  
  public static final String DEFAULT_IS_ADVANCED = "";
  
  public static final String DEFAULT_IS_FORCE = "";
  
  public static final String DEFAULT_IS_NEW_STYLE = "";
  
  public static final String DEFAULT_LEVEL = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PAY_PIC_PAD = "";
  
  public static final String DEFAULT_PAY_PIC_PC = "";
  
  public static final String DEFAULT_PIC = "";
  
  public static final String DEFAULT_PIC120 = "";
  
  public static final String DEFAULT_PIC160 = "";
  
  public static final String DEFAULT_PIC78 = "";
  
  public static final String DEFAULT_SPRITE = "";
  
  public static final String DEFAULT_STATUS = "";
  
  public static final String DEFAULT_TIME_INTERVAL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TITLE_URL = "";
  
  public static final String DEFAULT_TYPE = "";
  
  public static final String DEFAULT_WEIGHT = "";
  
  public static final String DEFAULT_YB_PRICE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String category_id;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String ext;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String forum_list;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long icon_id;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String intro_url;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String is_advanced;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String is_force;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String is_new_style;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String level;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String pay_pic_pad;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String pay_pic_pc;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String pic;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String pic120;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String pic160;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String pic78;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String sprite;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String status;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String time_interval;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String title_url;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String type;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String weight;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String yb_price;
  
  public IconPop(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.icon_id;
      if (long_ == null) {
        this.icon_id = DEFAULT_ICON_ID;
      } else {
        this.icon_id = long_;
      } 
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.level;
      if (str1 == null) {
        this.level = "";
      } else {
        this.level = str1;
      } 
      str1 = paramBuilder.weight;
      if (str1 == null) {
        this.weight = "";
      } else {
        this.weight = str1;
      } 
      str1 = paramBuilder.pic;
      if (str1 == null) {
        this.pic = "";
      } else {
        this.pic = str1;
      } 
      str1 = paramBuilder.sprite;
      if (str1 == null) {
        this.sprite = "";
      } else {
        this.sprite = str1;
      } 
      str1 = paramBuilder.status;
      if (str1 == null) {
        this.status = "";
      } else {
        this.status = str1;
      } 
      str1 = paramBuilder.type;
      if (str1 == null) {
        this.type = "";
      } else {
        this.type = str1;
      } 
      str1 = paramBuilder.category_id;
      if (str1 == null) {
        this.category_id = "";
      } else {
        this.category_id = str1;
      } 
      str1 = paramBuilder.time_interval;
      if (str1 == null) {
        this.time_interval = "";
      } else {
        this.time_interval = str1;
      } 
      str1 = paramBuilder.is_force;
      if (str1 == null) {
        this.is_force = "";
      } else {
        this.is_force = str1;
      } 
      str1 = paramBuilder.is_advanced;
      if (str1 == null) {
        this.is_advanced = "";
      } else {
        this.is_advanced = str1;
      } 
      str1 = paramBuilder.ext;
      if (str1 == null) {
        this.ext = "";
      } else {
        this.ext = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.title_url;
      if (str1 == null) {
        this.title_url = "";
      } else {
        this.title_url = str1;
      } 
      str1 = paramBuilder.intro;
      if (str1 == null) {
        this.intro = "";
      } else {
        this.intro = str1;
      } 
      str1 = paramBuilder.intro_url;
      if (str1 == null) {
        this.intro_url = "";
      } else {
        this.intro_url = str1;
      } 
      str1 = paramBuilder.forum_list;
      if (str1 == null) {
        this.forum_list = "";
      } else {
        this.forum_list = str1;
      } 
      str1 = paramBuilder.pay_pic_pc;
      if (str1 == null) {
        this.pay_pic_pc = "";
      } else {
        this.pay_pic_pc = str1;
      } 
      str1 = paramBuilder.pay_pic_pad;
      if (str1 == null) {
        this.pay_pic_pad = "";
      } else {
        this.pay_pic_pad = str1;
      } 
      str1 = paramBuilder.yb_price;
      if (str1 == null) {
        this.yb_price = "";
      } else {
        this.yb_price = str1;
      } 
      str1 = paramBuilder.is_new_style;
      if (str1 == null) {
        this.is_new_style = "";
      } else {
        this.is_new_style = str1;
      } 
      str1 = paramBuilder.pic78;
      if (str1 == null) {
        this.pic78 = "";
      } else {
        this.pic78 = str1;
      } 
      str1 = paramBuilder.pic120;
      if (str1 == null) {
        this.pic120 = "";
      } else {
        this.pic120 = str1;
      } 
      str = paramBuilder.pic160;
      if (str == null) {
        this.pic160 = "";
      } else {
        this.pic160 = str;
      } 
    } else {
      this.icon_id = ((Builder)str).icon_id;
      this.name = ((Builder)str).name;
      this.level = ((Builder)str).level;
      this.weight = ((Builder)str).weight;
      this.pic = ((Builder)str).pic;
      this.sprite = ((Builder)str).sprite;
      this.status = ((Builder)str).status;
      this.type = ((Builder)str).type;
      this.category_id = ((Builder)str).category_id;
      this.time_interval = ((Builder)str).time_interval;
      this.is_force = ((Builder)str).is_force;
      this.is_advanced = ((Builder)str).is_advanced;
      this.ext = ((Builder)str).ext;
      this.title = ((Builder)str).title;
      this.title_url = ((Builder)str).title_url;
      this.intro = ((Builder)str).intro;
      this.intro_url = ((Builder)str).intro_url;
      this.forum_list = ((Builder)str).forum_list;
      this.pay_pic_pc = ((Builder)str).pay_pic_pc;
      this.pay_pic_pad = ((Builder)str).pay_pic_pad;
      this.yb_price = ((Builder)str).yb_price;
      this.is_new_style = ((Builder)str).is_new_style;
      this.pic78 = ((Builder)str).pic78;
      this.pic120 = ((Builder)str).pic120;
      this.pic160 = ((Builder)str).pic160;
    } 
  }
  
  public IconPop(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1487392420, "Ltbclient/Loop/IconPop;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1487392420, "Ltbclient/Loop/IconPop;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<IconPop> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String category_id;
    
    public String ext;
    
    public String forum_list;
    
    public Long icon_id;
    
    public String intro;
    
    public String intro_url;
    
    public String is_advanced;
    
    public String is_force;
    
    public String is_new_style;
    
    public String level;
    
    public String name;
    
    public String pay_pic_pad;
    
    public String pay_pic_pc;
    
    public String pic;
    
    public String pic120;
    
    public String pic160;
    
    public String pic78;
    
    public String sprite;
    
    public String status;
    
    public String time_interval;
    
    public String title;
    
    public String title_url;
    
    public String type;
    
    public String weight;
    
    public String yb_price;
    
    public Builder() {}
    
    public Builder(IconPop param1IconPop) {
      super(param1IconPop);
      if (param1IconPop == null)
        return; 
      this.icon_id = param1IconPop.icon_id;
      this.name = param1IconPop.name;
      this.level = param1IconPop.level;
      this.weight = param1IconPop.weight;
      this.pic = param1IconPop.pic;
      this.sprite = param1IconPop.sprite;
      this.status = param1IconPop.status;
      this.type = param1IconPop.type;
      this.category_id = param1IconPop.category_id;
      this.time_interval = param1IconPop.time_interval;
      this.is_force = param1IconPop.is_force;
      this.is_advanced = param1IconPop.is_advanced;
      this.ext = param1IconPop.ext;
      this.title = param1IconPop.title;
      this.title_url = param1IconPop.title_url;
      this.intro = param1IconPop.intro;
      this.intro_url = param1IconPop.intro_url;
      this.forum_list = param1IconPop.forum_list;
      this.pay_pic_pc = param1IconPop.pay_pic_pc;
      this.pay_pic_pad = param1IconPop.pay_pic_pad;
      this.yb_price = param1IconPop.yb_price;
      this.is_new_style = param1IconPop.is_new_style;
      this.pic78 = param1IconPop.pic78;
      this.pic120 = param1IconPop.pic120;
      this.pic160 = param1IconPop.pic160;
    }
    
    public IconPop build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (IconPop)interceptResult.objValue; 
      } 
      return new IconPop(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
