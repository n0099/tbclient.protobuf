package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class GraffitiRankListInfo extends Message {
  public static final List<User> DEFAULT_CONSENT_LIST;
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final Integer DEFAULT_HAS_STATE;
  
  public static final List<GraffitiRankItem> DEFAULT_LIST;
  
  public static final Integer DEFAULT_QUICK_LIST_COUNT;
  
  public static final Integer DEFAULT_SHOW_LIST_COUNT;
  
  public static final Long DEFAULT_TID;
  
  public static final Integer DEFAULT_TOTAL;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<User> consent_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer has_state;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<GraffitiRankItem> list;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer quick_list_count;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer show_list_count;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer total;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_MORE = integer;
    DEFAULT_TOTAL = integer;
    DEFAULT_LIST = Collections.emptyList();
    DEFAULT_SHOW_LIST_COUNT = integer;
    DEFAULT_QUICK_LIST_COUNT = integer;
    DEFAULT_HAS_STATE = integer;
    DEFAULT_TID = Long.valueOf(0L);
    DEFAULT_CONSENT_LIST = Collections.emptyList();
  }
  
  public GraffitiRankListInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<User> list;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.has_more;
      if (integer2 == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer2;
      } 
      integer2 = paramBuilder.total;
      if (integer2 == null) {
        this.total = DEFAULT_TOTAL;
      } else {
        this.total = integer2;
      } 
      List<GraffitiRankItem> list1 = paramBuilder.list;
      if (list1 == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list1);
      } 
      Integer integer1 = paramBuilder.show_list_count;
      if (integer1 == null) {
        this.show_list_count = DEFAULT_SHOW_LIST_COUNT;
      } else {
        this.show_list_count = integer1;
      } 
      integer1 = paramBuilder.quick_list_count;
      if (integer1 == null) {
        this.quick_list_count = DEFAULT_QUICK_LIST_COUNT;
      } else {
        this.quick_list_count = integer1;
      } 
      integer1 = paramBuilder.has_state;
      if (integer1 == null) {
        this.has_state = DEFAULT_HAS_STATE;
      } else {
        this.has_state = integer1;
      } 
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      list = paramBuilder.consent_list;
      if (list == null) {
        this.consent_list = DEFAULT_CONSENT_LIST;
      } else {
        this.consent_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.has_more = ((Builder)list).has_more;
      this.total = ((Builder)list).total;
      this.list = Message.immutableCopyOf(((Builder)list).list);
      this.show_list_count = ((Builder)list).show_list_count;
      this.quick_list_count = ((Builder)list).quick_list_count;
      this.has_state = ((Builder)list).has_state;
      this.tid = ((Builder)list).tid;
      this.consent_list = Message.immutableCopyOf(((Builder)list).consent_list);
    } 
  }
  
  public GraffitiRankListInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GraffitiRankListInfo> {
    public List<User> consent_list;
    
    public Integer has_more;
    
    public Integer has_state;
    
    public List<GraffitiRankItem> list;
    
    public Integer quick_list_count;
    
    public Integer show_list_count;
    
    public Long tid;
    
    public Integer total;
    
    public Builder() {}
    
    public Builder(GraffitiRankListInfo param1GraffitiRankListInfo) {
      super(param1GraffitiRankListInfo);
      if (param1GraffitiRankListInfo == null)
        return; 
      this.has_more = param1GraffitiRankListInfo.has_more;
      this.total = param1GraffitiRankListInfo.total;
      this.list = Message.copyOf(param1GraffitiRankListInfo.list);
      this.show_list_count = param1GraffitiRankListInfo.show_list_count;
      this.quick_list_count = param1GraffitiRankListInfo.quick_list_count;
      this.has_state = param1GraffitiRankListInfo.has_state;
      this.tid = param1GraffitiRankListInfo.tid;
      this.consent_list = Message.copyOf(param1GraffitiRankListInfo.consent_list);
    }
    
    public GraffitiRankListInfo build(boolean param1Boolean) {
      return new GraffitiRankListInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
