package tbclient.Personalized;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AppPosInfo;
import tbclient.AppTransmitData;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AD_CONTEXT_LIST = "";
  
  public static final String DEFAULT_AD_EXT_PARAMS = "";
  
  public static final String DEFAULT_AGE_TAG = "";
  
  public static final String DEFAULT_DA_IDFA = "";
  
  public static final String DEFAULT_FIRST_DIR = "";
  
  public static final Long DEFAULT_FROM_TID;
  
  public static final List<String> DEFAULT_INTEREST_TAG;
  
  public static final String DEFAULT_INVOKE_SOURCE = "";
  
  public static final Integer DEFAULT_ISSDK;
  
  public static final String DEFAULT_LASTIDS = "";
  
  public static final Integer DEFAULT_LOAD_TYPE;
  
  public static final Integer DEFAULT_NEED_AGE_MODULE;
  
  public static final Integer DEFAULT_NEED_FORUMLIST;
  
  public static final Integer DEFAULT_NEED_TAGS;
  
  public static final Integer DEFAULT_NEW_INSTALL;
  
  public static final Integer DEFAULT_NEW_NET_TYPE;
  
  public static final Integer DEFAULT_PAGE_THREAD_COUNT;
  
  public static final String DEFAULT_PLATFORM = "";
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_PRE_AD_THREAD_COUNT;
  
  public static final String DEFAULT_QUERY_EQID = "";
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_REQUEST_TIMES;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final String DEFAULT_SECOND_DIR = "";
  
  public static final String DEFAULT_SEX_TAG = "";
  
  public static final String DEFAULT_SHOUBAI_CUID = "";
  
  public static final Integer DEFAULT_SUG_COUNT;
  
  public static final Integer DEFAULT_TAG_CHANGED;
  
  public static final Integer DEFAULT_TAG_CODE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String ad_context_list;
  
  @ProtoField(tag = 37, type = Message.Datatype.STRING)
  public final String ad_ext_params;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String age_tag;
  
  @ProtoField(tag = 36)
  public final AppPosInfo app_pos;
  
  @ProtoField(tag = 38)
  public final AppTransmitData app_transmit_data;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String da_idfa;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String first_dir;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT64)
  public final Long from_tid;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 20, type = Message.Datatype.STRING)
  public final List<String> interest_tag;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String invoke_source;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer issdk;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String lastids;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer load_type;
  
  @ProtoField(tag = 19, type = Message.Datatype.UINT32)
  public final Integer need_age_module;
  
  @ProtoField(tag = 22, type = Message.Datatype.UINT32)
  public final Integer need_forumlist;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer need_tags;
  
  @ProtoField(tag = 27, type = Message.Datatype.INT32)
  public final Integer new_install;
  
  @ProtoField(tag = 23, type = Message.Datatype.UINT32)
  public final Integer new_net_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer page_thread_count;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String platform;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer pre_ad_thread_count;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String query_eqid;
  
  @ProtoField(tag = 28, type = Message.Datatype.INT32)
  public final Integer request_times;
  
  @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String second_dir;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String sex_tag;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String shoubai_cuid;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer sug_count;
  
  @ProtoField(tag = 21, type = Message.Datatype.UINT32)
  public final Integer tag_changed;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer tag_code;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-397390084, "Ltbclient/Personalized/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-397390084, "Ltbclient/Personalized/DataReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAG_CODE = integer;
    DEFAULT_NEED_TAGS = integer;
    DEFAULT_LOAD_TYPE = integer;
    DEFAULT_PAGE_THREAD_COUNT = integer;
    DEFAULT_PN = integer;
    DEFAULT_SUG_COUNT = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
    DEFAULT_ISSDK = integer;
    DEFAULT_NEED_AGE_MODULE = integer;
    DEFAULT_INTEREST_TAG = Collections.emptyList();
    DEFAULT_TAG_CHANGED = integer;
    DEFAULT_NEED_FORUMLIST = integer;
    DEFAULT_NEW_NET_TYPE = integer;
    DEFAULT_FROM_TID = Long.valueOf(0L);
    DEFAULT_PRE_AD_THREAD_COUNT = integer;
    DEFAULT_NEW_INSTALL = integer;
    DEFAULT_REQUEST_TIMES = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer6 = paramBuilder.tag_code;
      if (integer6 == null) {
        this.tag_code = DEFAULT_TAG_CODE;
      } else {
        this.tag_code = integer6;
      } 
      integer6 = paramBuilder.need_tags;
      if (integer6 == null) {
        this.need_tags = DEFAULT_NEED_TAGS;
      } else {
        this.need_tags = integer6;
      } 
      integer6 = paramBuilder.load_type;
      if (integer6 == null) {
        this.load_type = DEFAULT_LOAD_TYPE;
      } else {
        this.load_type = integer6;
      } 
      integer6 = paramBuilder.page_thread_count;
      if (integer6 == null) {
        this.page_thread_count = DEFAULT_PAGE_THREAD_COUNT;
      } else {
        this.page_thread_count = integer6;
      } 
      integer6 = paramBuilder.pn;
      if (integer6 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer6;
      } 
      integer6 = paramBuilder.sug_count;
      if (integer6 == null) {
        this.sug_count = DEFAULT_SUG_COUNT;
      } else {
        this.sug_count = integer6;
      } 
      integer6 = paramBuilder.scr_w;
      if (integer6 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer6;
      } 
      integer6 = paramBuilder.scr_h;
      if (integer6 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer6;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer5 = paramBuilder.q_type;
      if (integer5 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer5;
      } 
      String str4 = paramBuilder.lastids;
      if (str4 == null) {
        this.lastids = "";
      } else {
        this.lastids = str4;
      } 
      Integer integer4 = paramBuilder.issdk;
      if (integer4 == null) {
        this.issdk = DEFAULT_ISSDK;
      } else {
        this.issdk = integer4;
      } 
      String str3 = paramBuilder.da_idfa;
      if (str3 == null) {
        this.da_idfa = "";
      } else {
        this.da_idfa = str3;
      } 
      str3 = paramBuilder.platform;
      if (str3 == null) {
        this.platform = "";
      } else {
        this.platform = str3;
      } 
      str3 = paramBuilder.sex_tag;
      if (str3 == null) {
        this.sex_tag = "";
      } else {
        this.sex_tag = str3;
      } 
      str3 = paramBuilder.age_tag;
      if (str3 == null) {
        this.age_tag = "";
      } else {
        this.age_tag = str3;
      } 
      Integer integer3 = paramBuilder.need_age_module;
      if (integer3 == null) {
        this.need_age_module = DEFAULT_NEED_AGE_MODULE;
      } else {
        this.need_age_module = integer3;
      } 
      List<String> list = paramBuilder.interest_tag;
      if (list == null) {
        this.interest_tag = DEFAULT_INTEREST_TAG;
      } else {
        this.interest_tag = Message.immutableCopyOf(list);
      } 
      Integer integer2 = paramBuilder.tag_changed;
      if (integer2 == null) {
        this.tag_changed = DEFAULT_TAG_CHANGED;
      } else {
        this.tag_changed = integer2;
      } 
      integer2 = paramBuilder.need_forumlist;
      if (integer2 == null) {
        this.need_forumlist = DEFAULT_NEED_FORUMLIST;
      } else {
        this.need_forumlist = integer2;
      } 
      integer2 = paramBuilder.new_net_type;
      if (integer2 == null) {
        this.new_net_type = DEFAULT_NEW_NET_TYPE;
      } else {
        this.new_net_type = integer2;
      } 
      String str2 = paramBuilder.shoubai_cuid;
      if (str2 == null) {
        this.shoubai_cuid = "";
      } else {
        this.shoubai_cuid = str2;
      } 
      Long long_ = paramBuilder.from_tid;
      if (long_ == null) {
        this.from_tid = DEFAULT_FROM_TID;
      } else {
        this.from_tid = long_;
      } 
      Integer integer1 = paramBuilder.pre_ad_thread_count;
      if (integer1 == null) {
        this.pre_ad_thread_count = DEFAULT_PRE_AD_THREAD_COUNT;
      } else {
        this.pre_ad_thread_count = integer1;
      } 
      integer1 = paramBuilder.new_install;
      if (integer1 == null) {
        this.new_install = DEFAULT_NEW_INSTALL;
      } else {
        this.new_install = integer1;
      } 
      integer1 = paramBuilder.request_times;
      if (integer1 == null) {
        this.request_times = DEFAULT_REQUEST_TIMES;
      } else {
        this.request_times = integer1;
      } 
      String str1 = paramBuilder.invoke_source;
      if (str1 == null) {
        this.invoke_source = "";
      } else {
        this.invoke_source = str1;
      } 
      str1 = paramBuilder.ad_context_list;
      if (str1 == null) {
        this.ad_context_list = "";
      } else {
        this.ad_context_list = str1;
      } 
      str1 = paramBuilder.query_eqid;
      if (str1 == null) {
        this.query_eqid = "";
      } else {
        this.query_eqid = str1;
      } 
      str1 = paramBuilder.first_dir;
      if (str1 == null) {
        this.first_dir = "";
      } else {
        this.first_dir = str1;
      } 
      str1 = paramBuilder.second_dir;
      if (str1 == null) {
        this.second_dir = "";
      } else {
        this.second_dir = str1;
      } 
      this.app_pos = paramBuilder.app_pos;
      str1 = paramBuilder.ad_ext_params;
      if (str1 == null) {
        this.ad_ext_params = "";
      } else {
        this.ad_ext_params = str1;
      } 
      this.app_transmit_data = paramBuilder.app_transmit_data;
    } else {
      this.common = paramBuilder.common;
      this.tag_code = paramBuilder.tag_code;
      this.need_tags = paramBuilder.need_tags;
      this.load_type = paramBuilder.load_type;
      this.page_thread_count = paramBuilder.page_thread_count;
      this.pn = paramBuilder.pn;
      this.sug_count = paramBuilder.sug_count;
      this.scr_w = paramBuilder.scr_w;
      this.scr_h = paramBuilder.scr_h;
      this.scr_dip = paramBuilder.scr_dip;
      this.q_type = paramBuilder.q_type;
      this.lastids = paramBuilder.lastids;
      this.issdk = paramBuilder.issdk;
      this.da_idfa = paramBuilder.da_idfa;
      this.platform = paramBuilder.platform;
      this.sex_tag = paramBuilder.sex_tag;
      this.age_tag = paramBuilder.age_tag;
      this.need_age_module = paramBuilder.need_age_module;
      this.interest_tag = Message.immutableCopyOf(paramBuilder.interest_tag);
      this.tag_changed = paramBuilder.tag_changed;
      this.need_forumlist = paramBuilder.need_forumlist;
      this.new_net_type = paramBuilder.new_net_type;
      this.shoubai_cuid = paramBuilder.shoubai_cuid;
      this.from_tid = paramBuilder.from_tid;
      this.pre_ad_thread_count = paramBuilder.pre_ad_thread_count;
      this.new_install = paramBuilder.new_install;
      this.request_times = paramBuilder.request_times;
      this.invoke_source = paramBuilder.invoke_source;
      this.ad_context_list = paramBuilder.ad_context_list;
      this.query_eqid = paramBuilder.query_eqid;
      this.first_dir = paramBuilder.first_dir;
      this.second_dir = paramBuilder.second_dir;
      this.app_pos = paramBuilder.app_pos;
      this.ad_ext_params = paramBuilder.ad_ext_params;
      this.app_transmit_data = paramBuilder.app_transmit_data;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String ad_context_list;
    
    public String ad_ext_params;
    
    public String age_tag;
    
    public AppPosInfo app_pos;
    
    public AppTransmitData app_transmit_data;
    
    public CommonReq common;
    
    public String da_idfa;
    
    public String first_dir;
    
    public Long from_tid;
    
    public List<String> interest_tag;
    
    public String invoke_source;
    
    public Integer issdk;
    
    public String lastids;
    
    public Integer load_type;
    
    public Integer need_age_module;
    
    public Integer need_forumlist;
    
    public Integer need_tags;
    
    public Integer new_install;
    
    public Integer new_net_type;
    
    public Integer page_thread_count;
    
    public String platform;
    
    public Integer pn;
    
    public Integer pre_ad_thread_count;
    
    public Integer q_type;
    
    public String query_eqid;
    
    public Integer request_times;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public String second_dir;
    
    public String sex_tag;
    
    public String shoubai_cuid;
    
    public Integer sug_count;
    
    public Integer tag_changed;
    
    public Integer tag_code;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.tag_code = param1DataReq.tag_code;
      this.need_tags = param1DataReq.need_tags;
      this.load_type = param1DataReq.load_type;
      this.page_thread_count = param1DataReq.page_thread_count;
      this.pn = param1DataReq.pn;
      this.sug_count = param1DataReq.sug_count;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
      this.lastids = param1DataReq.lastids;
      this.issdk = param1DataReq.issdk;
      this.da_idfa = param1DataReq.da_idfa;
      this.platform = param1DataReq.platform;
      this.sex_tag = param1DataReq.sex_tag;
      this.age_tag = param1DataReq.age_tag;
      this.need_age_module = param1DataReq.need_age_module;
      this.interest_tag = Message.copyOf(param1DataReq.interest_tag);
      this.tag_changed = param1DataReq.tag_changed;
      this.need_forumlist = param1DataReq.need_forumlist;
      this.new_net_type = param1DataReq.new_net_type;
      this.shoubai_cuid = param1DataReq.shoubai_cuid;
      this.from_tid = param1DataReq.from_tid;
      this.pre_ad_thread_count = param1DataReq.pre_ad_thread_count;
      this.new_install = param1DataReq.new_install;
      this.request_times = param1DataReq.request_times;
      this.invoke_source = param1DataReq.invoke_source;
      this.ad_context_list = param1DataReq.ad_context_list;
      this.query_eqid = param1DataReq.query_eqid;
      this.first_dir = param1DataReq.first_dir;
      this.second_dir = param1DataReq.second_dir;
      this.app_pos = param1DataReq.app_pos;
      this.ad_ext_params = param1DataReq.ad_ext_params;
      this.app_transmit_data = param1DataReq.app_transmit_data;
    }
    
    public DataReq build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataReq)interceptResult.objValue; 
      } 
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
