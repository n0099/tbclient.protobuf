package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ServiceArea extends Message {
  public static final String DEFAULT_PICURL = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_SERVICENAME = "";
  
  public static final String DEFAULT_SERVICEURL = "";
  
  public static final String DEFAULT_SERVICE_TYPE = "";
  
  public static final List<String> DEFAULT_THIRD_STATISTICS_URL = Collections.emptyList();
  
  public static final String DEFAULT_VERSION = "";
  
  @ProtoField(tag = 6)
  public final SmartApp area_smart_app;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String picurl;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String service_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String servicename;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String serviceurl;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
  public final List<String> third_statistics_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String version;
  
  public ServiceArea(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      String str = paramBuilder.servicename;
      if (str == null) {
        this.servicename = "";
      } else {
        this.servicename = str;
      } 
      str = paramBuilder.picurl;
      if (str == null) {
        this.picurl = "";
      } else {
        this.picurl = str;
      } 
      str = paramBuilder.serviceurl;
      if (str == null) {
        this.serviceurl = "";
      } else {
        this.serviceurl = str;
      } 
      str = paramBuilder.version;
      if (str == null) {
        this.version = "";
      } else {
        this.version = str;
      } 
      str = paramBuilder.service_type;
      if (str == null) {
        this.service_type = "";
      } else {
        this.service_type = str;
      } 
      this.area_smart_app = paramBuilder.area_smart_app;
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      list = paramBuilder.third_statistics_url;
      if (list == null) {
        this.third_statistics_url = DEFAULT_THIRD_STATISTICS_URL;
      } else {
        this.third_statistics_url = Message.immutableCopyOf(list);
      } 
    } else {
      this.servicename = ((Builder)list).servicename;
      this.picurl = ((Builder)list).picurl;
      this.serviceurl = ((Builder)list).serviceurl;
      this.version = ((Builder)list).version;
      this.service_type = ((Builder)list).service_type;
      this.area_smart_app = ((Builder)list).area_smart_app;
      this.schema = ((Builder)list).schema;
      this.third_statistics_url = Message.immutableCopyOf(((Builder)list).third_statistics_url);
    } 
  }
  
  public ServiceArea(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ServiceArea> {
    public SmartApp area_smart_app;
    
    public String picurl;
    
    public String schema;
    
    public String service_type;
    
    public String servicename;
    
    public String serviceurl;
    
    public List<String> third_statistics_url;
    
    public String version;
    
    public Builder() {}
    
    public Builder(ServiceArea param1ServiceArea) {
      super(param1ServiceArea);
      if (param1ServiceArea == null)
        return; 
      this.servicename = param1ServiceArea.servicename;
      this.picurl = param1ServiceArea.picurl;
      this.serviceurl = param1ServiceArea.serviceurl;
      this.version = param1ServiceArea.version;
      this.service_type = param1ServiceArea.service_type;
      this.area_smart_app = param1ServiceArea.area_smart_app;
      this.schema = param1ServiceArea.schema;
      this.third_statistics_url = Message.copyOf(param1ServiceArea.third_statistics_url);
    }
    
    public ServiceArea build(boolean param1Boolean) {
      return new ServiceArea(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
