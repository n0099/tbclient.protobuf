package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ApkDetail extends Message {
  public static final String DEFAULT_AUTHORITY_URL = "";
  
  public static final String DEFAULT_DEVELOPER = "";
  
  public static final Integer DEFAULT_NEED_INNER_BUY;
  
  public static final Integer DEFAULT_NEED_NETWORK;
  
  public static final Integer DEFAULT_PKG_SOURCE;
  
  public static final String DEFAULT_PRIVACY_URL = "";
  
  public static final String DEFAULT_PUBLISHER = "";
  
  public static final String DEFAULT_SIZE = "";
  
  public static final String DEFAULT_UPDATE_TIME = "";
  
  public static final String DEFAULT_VERSION = "";
  
  public static final Integer DEFAULT_VERSION_CODE;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String authority_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String developer;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer need_inner_buy;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer need_network;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer pkg_source;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String privacy_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String publisher;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String size;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String update_time;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String version;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer version_code;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_VERSION_CODE = integer;
    DEFAULT_NEED_NETWORK = integer;
    DEFAULT_NEED_INNER_BUY = integer;
    DEFAULT_PKG_SOURCE = integer;
  }
  
  public ApkDetail(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str3 = paramBuilder.developer;
      if (str3 == null) {
        this.developer = "";
      } else {
        this.developer = str3;
      } 
      str3 = paramBuilder.publisher;
      if (str3 == null) {
        this.publisher = "";
      } else {
        this.publisher = str3;
      } 
      str3 = paramBuilder.version;
      if (str3 == null) {
        this.version = "";
      } else {
        this.version = str3;
      } 
      Integer integer2 = paramBuilder.version_code;
      if (integer2 == null) {
        this.version_code = DEFAULT_VERSION_CODE;
      } else {
        this.version_code = integer2;
      } 
      String str2 = paramBuilder.update_time;
      if (str2 == null) {
        this.update_time = "";
      } else {
        this.update_time = str2;
      } 
      str2 = paramBuilder.size;
      if (str2 == null) {
        this.size = "";
      } else {
        this.size = str2;
      } 
      Integer integer1 = paramBuilder.need_network;
      if (integer1 == null) {
        this.need_network = DEFAULT_NEED_NETWORK;
      } else {
        this.need_network = integer1;
      } 
      integer1 = paramBuilder.need_inner_buy;
      if (integer1 == null) {
        this.need_inner_buy = DEFAULT_NEED_INNER_BUY;
      } else {
        this.need_inner_buy = integer1;
      } 
      String str1 = paramBuilder.authority_url;
      if (str1 == null) {
        this.authority_url = "";
      } else {
        this.authority_url = str1;
      } 
      str1 = paramBuilder.privacy_url;
      if (str1 == null) {
        this.privacy_url = "";
      } else {
        this.privacy_url = str1;
      } 
      integer = paramBuilder.pkg_source;
      if (integer == null) {
        this.pkg_source = DEFAULT_PKG_SOURCE;
      } else {
        this.pkg_source = integer;
      } 
    } else {
      this.developer = ((Builder)integer).developer;
      this.publisher = ((Builder)integer).publisher;
      this.version = ((Builder)integer).version;
      this.version_code = ((Builder)integer).version_code;
      this.update_time = ((Builder)integer).update_time;
      this.size = ((Builder)integer).size;
      this.need_network = ((Builder)integer).need_network;
      this.need_inner_buy = ((Builder)integer).need_inner_buy;
      this.authority_url = ((Builder)integer).authority_url;
      this.privacy_url = ((Builder)integer).privacy_url;
      this.pkg_source = ((Builder)integer).pkg_source;
    } 
  }
  
  public ApkDetail(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ApkDetail> {
    public String authority_url;
    
    public String developer;
    
    public Integer need_inner_buy;
    
    public Integer need_network;
    
    public Integer pkg_source;
    
    public String privacy_url;
    
    public String publisher;
    
    public String size;
    
    public String update_time;
    
    public String version;
    
    public Integer version_code;
    
    public Builder() {}
    
    public Builder(ApkDetail param1ApkDetail) {
      super(param1ApkDetail);
      if (param1ApkDetail == null)
        return; 
      this.developer = param1ApkDetail.developer;
      this.publisher = param1ApkDetail.publisher;
      this.version = param1ApkDetail.version;
      this.version_code = param1ApkDetail.version_code;
      this.update_time = param1ApkDetail.update_time;
      this.size = param1ApkDetail.size;
      this.need_network = param1ApkDetail.need_network;
      this.need_inner_buy = param1ApkDetail.need_inner_buy;
      this.authority_url = param1ApkDetail.authority_url;
      this.privacy_url = param1ApkDetail.privacy_url;
      this.pkg_source = param1ApkDetail.pkg_source;
    }
    
    public ApkDetail build(boolean param1Boolean) {
      return new ApkDetail(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
