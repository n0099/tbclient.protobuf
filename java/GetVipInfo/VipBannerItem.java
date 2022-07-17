package tbclient.GetVipInfo;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VipBannerItem extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public VipBannerItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.img_url;
      if (str1 == null) {
        this.img_url = "";
      } else {
        this.img_url = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str = paramBuilder.link;
      if (str == null) {
        this.link = "";
      } else {
        this.link = str;
      } 
    } else {
      this.img_url = ((Builder)str).img_url;
      this.title = ((Builder)str).title;
      this.desc = ((Builder)str).desc;
      this.link = ((Builder)str).link;
    } 
  }
  
  public VipBannerItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VipBannerItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String desc;
    
    public String img_url;
    
    public String link;
    
    public String title;
    
    public Builder() {}
    
    public Builder(VipBannerItem param1VipBannerItem) {
      super(param1VipBannerItem);
      if (param1VipBannerItem == null)
        return; 
      this.img_url = param1VipBannerItem.img_url;
      this.title = param1VipBannerItem.title;
      this.desc = param1VipBannerItem.desc;
      this.link = param1VipBannerItem.link;
    }
    
    public VipBannerItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (VipBannerItem)interceptResult.objValue; 
      } 
      return new VipBannerItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
