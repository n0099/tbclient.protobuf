package tbclient.GetVipInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VipThemeItem extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DESC = "";
  
  public static final Integer DEFAULT_ID;
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_PROPS_CATEGORY;
  
  public static final String DEFAULT_PROPS_CATEGORY_NAME = "";
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final String DEFAULT_TAG_IMG_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_UPDATE_TIME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer props_category;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String props_category_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer props_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String tag_img_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String update_time;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1179758676, "Ltbclient/GetVipInfo/VipThemeItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1179758676, "Ltbclient/GetVipInfo/VipThemeItem;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_PROPS_CATEGORY = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_ID = integer;
  }
  
  public VipThemeItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.img_url;
      if (str2 == null) {
        this.img_url = "";
      } else {
        this.img_url = str2;
      } 
      str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      Integer integer2 = paramBuilder.props_id;
      if (integer2 == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer2;
      } 
      integer2 = paramBuilder.props_category;
      if (integer2 == null) {
        this.props_category = DEFAULT_PROPS_CATEGORY;
      } else {
        this.props_category = integer2;
      } 
      String str1 = paramBuilder.props_category_name;
      if (str1 == null) {
        this.props_category_name = "";
      } else {
        this.props_category_name = str1;
      } 
      str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str1 = paramBuilder.link;
      if (str1 == null) {
        this.link = "";
      } else {
        this.link = str1;
      } 
      str1 = paramBuilder.tag_img_url;
      if (str1 == null) {
        this.tag_img_url = "";
      } else {
        this.tag_img_url = str1;
      } 
      str1 = paramBuilder.update_time;
      if (str1 == null) {
        this.update_time = "";
      } else {
        this.update_time = str1;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
    } else {
      this.img_url = ((Builder)integer).img_url;
      this.title = ((Builder)integer).title;
      this.props_id = ((Builder)integer).props_id;
      this.props_category = ((Builder)integer).props_category;
      this.props_category_name = ((Builder)integer).props_category_name;
      this.desc = ((Builder)integer).desc;
      this.link = ((Builder)integer).link;
      this.tag_img_url = ((Builder)integer).tag_img_url;
      this.update_time = ((Builder)integer).update_time;
      this.type = ((Builder)integer).type;
      this.id = ((Builder)integer).id;
    } 
  }
  
  public VipThemeItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VipThemeItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String desc;
    
    public Integer id;
    
    public String img_url;
    
    public String link;
    
    public Integer props_category;
    
    public String props_category_name;
    
    public Integer props_id;
    
    public String tag_img_url;
    
    public String title;
    
    public Integer type;
    
    public String update_time;
    
    public Builder() {}
    
    public Builder(VipThemeItem param1VipThemeItem) {
      super(param1VipThemeItem);
      if (param1VipThemeItem == null)
        return; 
      this.img_url = param1VipThemeItem.img_url;
      this.title = param1VipThemeItem.title;
      this.props_id = param1VipThemeItem.props_id;
      this.props_category = param1VipThemeItem.props_category;
      this.props_category_name = param1VipThemeItem.props_category_name;
      this.desc = param1VipThemeItem.desc;
      this.link = param1VipThemeItem.link;
      this.tag_img_url = param1VipThemeItem.tag_img_url;
      this.update_time = param1VipThemeItem.update_time;
      this.type = param1VipThemeItem.type;
      this.id = param1VipThemeItem.id;
    }
    
    public VipThemeItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (VipThemeItem)interceptResult.objValue; 
      } 
      return new VipThemeItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
